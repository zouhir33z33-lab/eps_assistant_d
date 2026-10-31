plugins {
    id "com.android.application"
    id "kotlin-android"
    id "dev.flutter.flutter-main-gradle-plugin"
}

android {
    namespace "com.example.eps_assistant_d"
    compileSdk 34

    defaultConfig {
        applicationId "com.example.eps_assistant_d"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
        targetCompatibility JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

flutter {
    source "../.."
}
