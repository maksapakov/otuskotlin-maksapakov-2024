plugins {
    kotlin("jvm") apply false
}

group = "ru.otus.kotlin.ninjacat"
version = "0.0.1"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}