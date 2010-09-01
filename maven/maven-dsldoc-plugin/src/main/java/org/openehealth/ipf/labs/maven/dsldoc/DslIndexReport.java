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

import org.apache.commons.io.FileUtils;
import org.apache.maven.project.MavenProject;
import org.apache.maven.reporting.AbstractMavenReport;
import org.apache.maven.reporting.MavenReportException;
import org.codehaus.doxia.site.renderer.SiteRenderer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Goal which merges the DSL indices of all modules into a Maven report.
 *
 * @goal dslindexreport
 */
public class DslIndexReport extends AbstractMavenReport {
    /**
     * @parameter default-value="${project.reporting.outputDirectory}"
     * @required
     */
    protected File outputDirectory;

    /**
     * @parameter default-value="${project}"
     * @required
     * @readonly
     */
    private MavenProject project;

    /**
     * @component
     * @required
     * @readonly
     */
    private SiteRenderer siteRenderer;

    /**
      * The projects in the reactor for aggregation report.
      *
      * @parameter expression="${reactorProjects}"
      * @readonly
      */
     private List<MavenProject> reactorProjects;

    protected void executeReport(Locale arg0) throws MavenReportException {
        StringBuilder mergedContent = new StringBuilder();
        for (MavenProject subProject : reactorProjects) {
            String buildDir = subProject.getBuild().getDirectory();
            String dslIndexPath = buildDir + "/dslindex";
            File dslIndexFile = new File(dslIndexPath);
            if (dslIndexFile.exists()) {
                getLog().info("Merging DSL index file: " + dslIndexPath);
                try {
                    String content = FileUtils.readFileToString(dslIndexFile);
                    mergedContent.append(content);
                } catch (IOException e) {
                    throw new MavenReportException("Cannot read file for report: " + dslIndexPath, e);
                }
            }
        }

        getSink().rawText("<html><head><title>IPF extensions index</title></head><body>");
        getSink().rawText(mergedContent.toString());
        getSink().rawText("</body></html>");

        getSink().flush();
    }

    protected String getOutputDirectory() {
        return outputDirectory.getAbsolutePath();
    }

    protected MavenProject getProject() {
        return project;
    }

    protected SiteRenderer getSiteRenderer() {
        return siteRenderer;
    }

    public String getDescription(Locale arg0) {
        return "DSL Index";
    }

    public String getName(Locale arg0) {
        return "DSL Index";
    }

    public String getOutputName() {
        return "dslIndex";
    }
}
