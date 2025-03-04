plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("build-jvm") {
            id = "build-jvm"
            implementationClass = "ru.otus.kotlin.ninjacat.JvmBuildPlugin"
        }
        register("build-multiplatform") {
            id = "build-multiplatform"
            implementationClass = "ru.otus.kotlin.ninjacat.MultiplatformBuildPlugin"
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.binaryCompatibilityValidator)
}

tasks.test {
    useJUnitPlatform()
}