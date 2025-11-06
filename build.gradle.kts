/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Root build file for compose-samples repository
// This file provides a unified entry point for building all sample projects

val samples = listOf("JetNews", "Jetchat", "Jetsnack", "Jetcaster", "Reply", "JetLagged")

fun registerSampleTask(taskName: String, description: String, group: String) {
    tasks.register<Exec>(taskName) {
        this.description = description
        this.group = group
        commandLine("bash", "scripts/gradlew_recursive.sh", taskName)
    }
}

registerSampleTask("clean", "Clean all sample projects", "build")
registerSampleTask("build", "Build all sample projects", "build")
registerSampleTask("assembleDebug", "Assemble debug builds of all sample projects", "build")
registerSampleTask("test", "Run tests for all sample projects", "verification")
registerSampleTask("spotlessCheck", "Check code formatting for all sample projects", "verification")
registerSampleTask("spotlessApply", "Apply code formatting to all sample projects", "formatting")
