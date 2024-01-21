buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev" )
    }

    dependencies {
        classpath(libs.plugin.maven)
        classpath(libs.plugin.android)
        classpath(libs.plugin.kotlin)
    }
}

plugins {
    id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.13.0"
}

subprojects {
    tasks.create("upgradeIcons") {
        doLast {
            exec {
                commandLine("kotlinc", "-script", "${projectDir}/generate-source.main.kts")
            }
        }
    }
}
