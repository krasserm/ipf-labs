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
package org.openehealth.ipf.labs.maven.dsldoc.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.thoughtworks.qdox.model.DocletTag;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaMethod;
import com.thoughtworks.qdox.model.JavaParameter;
/**
 * Contains information for each module in a report.
 * 
 * @author Jens Riemschneider
 */
public class Documentation {
    private static final String LINK = "{@link ";
    private static final String CODE = "{@code ";
    
    private final List<ModuleInfo> modules = new ArrayList<ModuleInfo>();
    private final Types types;
    
    /**
     * Constructs the documentation object.
     * @param types
     *          the type info object.
     */
    public Documentation(Types types) {
        this.types = types;
    }

    /**
     * Adds a DSL method to the documentation.
     * @param module
     *          the module that contains the DSL method.
     * @param section
     *          the section that contains the DSL method.
     * @param info
     *          the method info.
     */
    public void addMethod(String module, String section, MethodInfo info) {
        addModuleAndSection(module, section);
        getModule(module).addMethod(section, info);
    }

    private void addModuleAndSection(String module, String section) {
        ModuleInfo moduleInfo = getModule(module);
        if (moduleInfo == null) {
            moduleInfo = new ModuleInfo(module, types);
            modules.add(moduleInfo);
        }
        
        moduleInfo.addSection(section);
    }

    private ModuleInfo getModule(String module) {
        for (ModuleInfo moduleInfo : modules) {
            if (moduleInfo.getName().equals(module)) {
                return moduleInfo;
            }
        }
        return null;
    }

    public List<ModuleInfo> getModules() {
        return modules;
    }

    public Types getTypes() {
        return types;
    }
    
    public void registerMethod(String module, JavaClass cls, JavaMethod method) {
        if (method.getTagByName("ipfdoc") != null) {
            validate(method);

            String section = getSection(method);
            List<ParamInfo> paramInfos = getParams(method);
            ParamInfo returnParam = getReturns(method);
            String ipfDocLink = getIpfDocLink(method);
            
            String comment = javaDoc2Html(method.getComment(), cls);
            MethodInfo methodInfo = new MethodInfo(method.getName(), comment, paramInfos, returnParam, ipfDocLink);
            this.addMethod(module, section, methodInfo);
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
