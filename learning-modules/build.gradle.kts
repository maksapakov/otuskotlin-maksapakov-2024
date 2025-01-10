plugins {
    kotlin("jvm")
}

group = "ru.otus.kotlin.maksapakov"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}