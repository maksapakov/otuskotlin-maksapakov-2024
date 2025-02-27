plugins {
    kotlin("jvm") version "2.1.0"
}

group = "ru.otus.kotlin.ninjacat"
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
kotlin {
    jvmToolchain(21)
}