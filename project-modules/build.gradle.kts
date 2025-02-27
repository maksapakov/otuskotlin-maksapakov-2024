plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}

group = "ru.otus.kotlin.ninjacat"
version = "0.0.1"

tasks {
    arrayOf("build", "clean", "check").forEach { tsk ->
        create(tsk) {
            group = "build"
            dependsOn(subprojects.map { it.getTasksByName(tsk,false) })
        }
    }
}