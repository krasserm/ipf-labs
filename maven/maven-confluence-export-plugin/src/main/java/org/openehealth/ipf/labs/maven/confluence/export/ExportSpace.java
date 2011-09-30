/*
 * Copyright 2011 the original author or authors.
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
package org.openehealth.ipf.labs.maven.confluence.export;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Mitko Kolev
 * 
 */
public class ExportSpace {
    
    public static final String PDF = "PDF";
    public static final String HTML = "HTML";
    public static final String XML = "XML";
    
    public static Map<String, String> EXPORT_TYPES = new HashMap<String, String>();
    
    static {
        EXPORT_TYPES.put(PDF, "TYPE_PDF");
        EXPORT_TYPES.put(HTML, "TYPE_HTML");
        EXPORT_TYPES.put(XML, "TYPE_XML");
    }
    /**
     * @parameter
     * @required
     */
    private String key;
    /**
     * @parameter
     * @required
     */
    private String type;
    /**
     * How to name the file that is written. By default the file name that 
     * is returned from Confluence is used.
     * @parameter
     */
    private String outputFileName;
    
    /**
     * The default value is 2 minutes. 0 indicates no timeout
     * 
     * @parameter default-value="120000"
     */
    private int timeout;
    
    public String getKey() {
        return key;
    }
    public void setKey(String name) {
        this.key = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String format) {
        this.type = format;
    }
    public String getOutputFileName() {
        return outputFileName;
    }
    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }
    public int getTimeout() {
        return timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

}
