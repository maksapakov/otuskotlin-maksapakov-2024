package ru.otus.kotlin.maksapakov

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.repositories

@Suppress("unused")
internal class JvmBuildPlugin : Plugin<Project> {
    override fun apply(project: Project) = with(project) {
        pluginManager.apply("org.jetbrains.kotlin.jvm")
        group = rootProject.group
        version = rootProject.version
        repositories {
            mavenCentral()
        }
    }
}