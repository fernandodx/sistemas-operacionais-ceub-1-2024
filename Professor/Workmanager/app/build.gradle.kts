plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "br.com.ceub.projeto.exemplo.workmanager"
    compileSdk = 34

    defaultConfig {
        applicationId = "br.com.ceub.projeto.exemplo.workmanager"
        renderscriptTargetApi = 34
        renderscriptSupportModeEnabled = true
        vectorDrawables {
            useSupportLibrary = true
        }
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.workmanager)
//    implementation(libs.renderscript)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
