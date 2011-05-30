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
package org.openehealth.ipf.labs.maven.dsldoc;

import groovy.lang.GroovyClassLoader;

import java.io.File;
import java.io.IOException;

import org.apache.maven.plugin.logging.Log;

import com.thoughtworks.qdox.JavaDocBuilder;
import com.thoughtworks.qdox.directorywalker.DirectoryScanner;
import com.thoughtworks.qdox.directorywalker.FileVisitor;
import com.thoughtworks.qdox.directorywalker.Filter;
import com.thoughtworks.qdox.parser.ParseException;

/**
 * Parses *Extension.groovy and *Extension.java files. The groovy files that can not be parsed are
 * ignored
 * 
 */
public class DslDocBuilder extends JavaDocBuilder {

	private static final long serialVersionUID = 5144456919412670775L;

	private final Log log;

	public DslDocBuilder(Log log) {
		this.log = log;
		this.getClassLibrary().addClassLoader(new GroovyClassLoader());
	}

	/**
	 * Add all files in a directory (and subdirs, recursively).
	 * 
	 * If a file cannot be read, errorHandler will be notified.
	 */
	public void addSourceTree(File file, final FileVisitor errorHandler) {
		DirectoryScanner scanner = new DirectoryScanner(file);

		scanner.addFilter(new DSLExtensionSuffixFilter());

		scanner.scan(new FileVisitor() {
			public void visitFile(File currentFile) {
				try {
					addSource(currentFile);
				} catch (IOException e) {
					errorHandler.visitFile(currentFile);
				} catch (ParseException e) {
					if (currentFile.getName().endsWith(".groovy")) {
						log.error("Unable to parse extension file " + currentFile.getName());
						log.debug(e);
					} else {
						throw e;
					}
				}
			}
		});
	}

	private class DSLExtensionSuffixFilter implements Filter {
		@Override
		public boolean filter(File file) {
			String name = file.getName();
			if (name.endsWith("Extension.java") || name.endsWith("Extension.groovy")) {
				return true;
			} else {
				return false;
			}
		}

	}
}
