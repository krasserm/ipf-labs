/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.labs.maven.dsldoc;

import com.thoughtworks.qdox.model.*;
import org.apache.maven.plugin.logging.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Extracts DSL documentation in the two supported formats (GDSL and HTML).
 * Extraction is performed by feeding the sources to QDox. Then the parts of the documentation (methods and their
 * parameters) related to DSL extensions are extracted and grouped into modules and sections. Modules correspond to
 * the Maven modules/artifacts, sections correspond to classes. Finally, the desired format (GDSL or HTML) is generated
 * by a calling a toStringXXX() method on resulting documentation object and the text is written into the output files.
 */
public class Extractor {
    private static final String LINK = "{@link ";
    private static final String CODE = "{@code ";

    private final Types types;
    private final Documentation doc;

    /**
     * Constructs the extractor.
     * @param types
     *          the type info object that contains api links.
     */
    public Extractor(Types types) {
        this.types = types;
        this.doc = new Documentation(types);
    }

    /**
     * Generates GDSL files for the given module.
     * @param module
     *          the module to generate the GDSL files for.
     * @param outputDirectory
     *          the destination directory for the GDSL files.
     * @param sourceDir
     *          the source directories to be scanned for dsl extensions.
     * @param log
     *          the logger to use.
     * @throws IOException
     *          if reading or writing a file failed.
     */
    public void processGDSL(String module, File outputDirectory, String[] sourceDir, Log log) throws IOException {
        DslDocBuilder builder = addSources(sourceDir, log);
        if (builder.getSources().length == 0) {
            log.info("No sources found.");
            return;
        }

        log.info("Processing sources");
        for (JavaSource src : builder.getSources()) {
            for (JavaClass cls : src.getClasses()) {
                if (null != cls.getTagByName("dsl")) {
                    for (JavaMethod method : cls.getMethods()) {
                        registerMethod(module, cls, method);
                    }

                    File gdslFile = new File(outputDirectory, cls.getPackageName().replace(".", "/") + "/" + cls.getName() + ".gdsl");
                    log.info("Writing " + gdslFile.getPath());
                    BufferedWriter writer = new BufferedWriter(new FileWriter(gdslFile));
                    try {
                        writer.write(doc.toStringGDSL());
                        writer.write(doc.toStringGDSL());
                    }
                    finally {
                        writer.close();
                    }
                }
            }
        }
    }

    /**
     * Generate a DSL index for the given module.
     * @param module
     *          the name of the module to generate the report for.
     * @param outputDirectory
     *          the directory that the DSL index is created in.
     * @param sourceDirs
     *          the source directories to be scanned for dsl extensions.
     * @param log
     *          the logger to use.
     * @throws IOException
     *          if reading or writing a file failed.
     */
    public void processDSLIndex(String module, File outputDirectory, String[] sourceDirs, Log log) throws IOException {
    	DslDocBuilder builder = addSources(sourceDirs, log);
        if (builder.getSources().length == 0) {
            log.info("No sources found.");
            return;
        }

        log.info("Processing sources");
        for (JavaSource src : builder.getSources()) {
            for (JavaClass cls : src.getClasses()) {
                for (JavaMethod method : cls.getMethods()) {
                    registerMethod(module, cls, method);
                }
            }
        }

        File dslIndex = new File(outputDirectory, "dslindex");
        log.info("Writing " + dslIndex.getPath());
        BufferedWriter writer = new BufferedWriter(new FileWriter(dslIndex));
        try {
            writer.write(doc.toStringDSLIndex());
        }
        finally {
            writer.close();
        }
    }
    
    private DslDocBuilder addSources(String[] files, Log log) {
    	DslDocBuilder builder = new DslDocBuilder(log);
        for (String filename : files) {
            File file = new File(filename);
            if (file.exists()) {
                log.info("Adding source tree: " + filename);
                builder.addSourceTree(file);
            }
        }
        return builder;
    }

    private void registerMethod(String module, JavaClass cls, JavaMethod method) {
        if (method.getTagByName("ipfdoc") != null) {
            validate(method);

            String section = getSection(method);
            List<ParamInfo> paramInfos = getParams(method);
            ParamInfo returnParam = getReturns(method);
            String ipfDocLink = getIpfDocLink(method);
            
            String comment = javaDoc2Html(method.getComment(), cls);
            MethodInfo methodInfo = new MethodInfo(method.getName(), comment, paramInfos, returnParam, ipfDocLink);
            doc.addMethod(module, section, methodInfo);
        }
    }

    private void validate(JavaMethod method) throws AssertionError {
        if (!method.isPublic()) {
            throw new AssertionError(method + " must be public");
        }
        
        if (method.getComment() == null) {
            throw new AssertionError(method + " must have a comment");
        }
        
        if (getIpfDocLink(method) == null || getIpfDocLink(method).isEmpty()) {
            throw new AssertionError(method + " must define a link to the IPF documentation via @ipfdoc");
        }
        
        if (method.isStatic() && method.getParameters().length == 0) {
            throw new AssertionError("static " + method + " must have at least one parameter for the this reference");
        }
        
        if (method.getReturns() == null) {
            throw new AssertionError(method + " must return a value if it is a DSL element");
        }
    }

    private String getIpfDocLink(JavaMethod method) {
        return getTagValue(method, "ipfdoc");
    }

    private String getTagValue(JavaMethod method, String tagName) {
        DocletTag tag = method.getTagByName(tagName);
        return tag != null ? tag.getValue() : null;
    }

    private String getSection(JavaMethod method) {
        if (method.isStatic()) {
            return method.getParameters()[0].getType().getFullQualifiedName();
        }
        return method.getParentClass().getFullyQualifiedName();
    }

    private ParamInfo getReturns(JavaMethod method) {
        String typeFull = method.getReturns().getFullQualifiedName();
        return new ParamInfo(typeFull, "", types.resolveLink(typeFull));
    }

    private List<ParamInfo> getParams(JavaMethod method) {
        boolean first = true;
        List<ParamInfo> paramInfos = new ArrayList<ParamInfo>();                        
        for (JavaParameter param : method.getParameters()) {
            if (!first || !method.isStatic()) {
                String typeFull = param.getType().getFullQualifiedName();
                paramInfos.add(new ParamInfo(typeFull, param.getName(), types.resolveLink(typeFull)));
            }
            first = false;
        }
        return paramInfos;
    }

    private List<String> getTaggedSuperTypes(JavaClass cls) {
        List<String> types = new ArrayList<String>();
        types.addAll(getTagged(cls.getSuperJavaClass()));
        
        for (JavaClass superType : cls.getImplementedInterfaces()) {
            types.addAll(getTagged(superType));
        }
        return types;
    }

    private List<String> getTagged(JavaClass superType) {
        if (superType == null) {
            return Collections.emptyList();
        }
        if (superType.getTagByName("dsl") != null) {
            return Collections.singletonList(superType.getFullyQualifiedName());
        }
        return getTaggedSuperTypes(superType);
    }

    private String javaDoc2Html(String comment, JavaClass cls) {
        comment = comment.replaceAll("\r\n", " ");

        while (comment.contains(CODE)) {
            int start = comment.indexOf(CODE);
            int end = comment.indexOf("}", start + CODE.length());
            String text = comment.substring(start + CODE.length(), end);
            comment = replace(comment, start, end + 1, "<tt>" + text + "</tt>");
        }
        
        while (comment.contains(LINK)) {
            int start = comment.indexOf(LINK);
            int end = comment.indexOf("}", start + LINK.length());
            String orgLink = comment.substring(start + LINK.length(), end);
            String fullType = getTypeViaImports(cls, orgLink);
            String newLink = types.resolveLink(fullType);
            comment = replace(comment, start, end + 1, "<a href=\"" + newLink + "\" title=\"" + fullType + "\">" + orgLink + "</a>");
        }
        
        return comment;
    }

    private String getTypeViaImports(JavaClass cls, String orgLink) {
        String[] imports = cls.getSource().getImports();
        for (String importedClass : imports) {
            if (types.getTypeName(importedClass).equals(orgLink)) {
                return importedClass;
            }
        }
        return orgLink;
    }

    private static String replace(String str, int start, int end, String replacement) {
        return str.substring(0, start) + replacement + str.substring(end);
    }
}
