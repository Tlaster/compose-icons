import org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb
import org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg
import org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi
import org.jetbrains.compose.desktop.application.tasks.AbstractNativeMacApplicationPackageTask
import org.jetbrains.compose.experimental.dsl.IOSDevices
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    //kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
}

android {
    namespace = "br.devsrsouza.compose.icons.sample"
    compileSdk = 33

    defaultConfig {
        applicationId = "br.devsrsouza.compose.icons.sample"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
    }

    dependencies {
        implementation(projects.cssGg)
        implementation(projects.erikflowersWeatherIcons)
        implementation(projects.evaIcons)
        implementation(projects.feather)
        implementation(projects.fontAwesome)
        implementation(projects.lineAwesome)
        implementation(projects.linea)
        implementation(projects.octicons)
        implementation(projects.simpleIcons)
        implementation(projects.tablerIcons)

        implementation(compose.material)
        implementation(compose.runtime)

        implementation(libs.voyager.navigator)
        implementation(libs.voyager.transitions)
        implementation(libs.coroutines)

        implementation(libs.appCompat)
        implementation(libs.compose.activity)
    }
}