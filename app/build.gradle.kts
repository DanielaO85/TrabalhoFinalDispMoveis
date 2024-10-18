
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.devtools.ksp")
    id("kotlin-kapt") // Adicione isto para habilitar a anotação do Room
}

android {
    namespace = "com.example.todo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.todo"
        minSdk = 26
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //val room_version = "2.6.1" // Verifique a versão mais recente
    implementation (libs.androidx.room.runtime)
    annotationProcessor(libs.androidx.room.compiler)
    ksp (libs.androidx.room.compiler)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.recyclerview)
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6")
    implementation (libs.androidx.room.ktx)
    //implementation ("androidx.room:room-runtime:$room_version")
    //kapt("androidx.room:room-compiler:$room_version")
    // Para coroutines com Room (opcional)
    //implementation ("androidx.room:room-ktx:$room_version")

}



