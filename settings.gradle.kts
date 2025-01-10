pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "otuskotlin-maksapakov-2024"

include("m1l1-first")
include("learning-modules")
include("plugin")
include("project-modules")
