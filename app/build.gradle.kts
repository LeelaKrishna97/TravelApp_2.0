

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.androidproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidproject"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    viewBinding {
        enable = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.ui.test.android)
    implementation ("com.google.firebase:firebase-auth:22.0.0")
    implementation ("com.android.support:cardview-v7:26.1.0")
    implementation(libs.litert.support.api)
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
//    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation ("com.github.bumptech.glide:glide:4.14.2")  // Latest stable version
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")  // For annotation processing

}
