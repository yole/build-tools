/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vertx.gradle.lang.plugins

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.Task
import org.gradle.api.artifacts.Configuration
import org.gradle.api.tasks.SourceSet


/**
 * @author pidster
 *
 */
class GroovyPlugin extends AbstractSourcePlugin {

	public static final String CONFIGURATION = 'vertxGroovy'

	public static final String SOURCE_DIR = 'groovy'

	public static final String SOURCE_EXTENSION = 'groovy'

	public GroovyPlugin() {
		super(CONFIGURATION, SOURCE_DIR, SOURCE_EXTENSION)
	}

	protected void configureSourceSets(Project project, Configuration configuration, String sourceDirName, String sourceFileExtension) {
		// super.configureSourceSets(project, configuration, sourceDirName, sourceFileExtension)
	}

	protected void configureCompiler(Project project, Configuration configuration) {
		// super.configureCompiler(project, configuration)
	}

	protected void configureResources(Project project, Configuration configuration, String sourceDirName) {
		super.configureResources(project, configuration, sourceDirName)
	}

	protected void configureTasks(Project project, Configuration configuration) {
		//
	}

}
