plugins {
    id("com.android.application")
    id("com.google.gms.google-services") version "4.4.0"
}

android {
    namespace = "com.example.ridesharingplatform"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ridesharingplatform"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("com.google.android.gms:play-services-places:17.0.0")
    implementation("com.github.bumptech.glide:glide:4.7.1")
    implementation("androidx.navigation:navigation-runtime:2.7.5")
    annotationProcessor("com.github.bumptech.glide:compiler:4.7.1")
    implementation("com.google.firebase:firebase-messaging:23.3.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.google.firebase:firebase-core:21.1.1")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.firebase:geofire-android:3.2.0")
    implementation("com.google.zxing:core:3.2.1")
    implementation("com.journeyapps:zxing-android-embedded:3.3.0@aar")
    implementation("com.google.gms:google-services:4.4.0")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

}