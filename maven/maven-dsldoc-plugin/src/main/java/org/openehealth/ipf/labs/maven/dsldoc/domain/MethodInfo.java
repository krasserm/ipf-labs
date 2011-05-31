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

import java.util.Collections;
import java.util.List;

/**
 * Information about a documented DSL method.
 * 
 * @author Jens Riemschneider
 */
public class MethodInfo implements Comparable<MethodInfo> {

    private final String methodName;
    private final String comment;
    private final List<ParamInfo> paramInfos;
    private final String link;
    private final ParamInfo returnParam;

    /**
     * Constructs the DSL method info.
     * @param methodName
     *          the name of the method.
     * @param comment
     *          the JavaDoc comments of the method.
     * @param paramInfos
     *          the infos about the parameters of the method.
     * @param returnParam
     *          the info about the return parameter.
     * @param link
     *          the link for detailed documentation of the DSL method.
     */
    public MethodInfo(String methodName, String comment, List<ParamInfo> paramInfos, ParamInfo returnParam, String link) {
        this.methodName = methodName;
        this.comment = comment;
        this.paramInfos = Collections.unmodifiableList(paramInfos);
        this.link = link;
        this.returnParam = returnParam;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getComment() {
        return comment;
    }

    public List<ParamInfo> getParamInfos() {
        return paramInfos;
    }

    public String getLink() {
        return link;
    }

    public ParamInfo getReturnParam() {
        return returnParam;
    }

    public int compareTo(MethodInfo o) {
        return this.methodName.compareTo(o.methodName);
    }
        
}
