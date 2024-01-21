plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.vanniktech.maven.publish")
}

android {
    namespace = "compose.icons.fontawesome"
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
