import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.implementation
import org.gradle.kotlin.dsl.libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.vanniktech.maven.publish")
}

android {
    namespace = "compose.icons.cssgg"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}

dependencies {
    implementation(libs.ui.android)
}

publishing {
    repositories {
        maven {
            name = "local"
            url = uri("file://${System.getenv("DEPLOY_DIR")}")
        }
    }
}
