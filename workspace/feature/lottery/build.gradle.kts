plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "dev.kyu.lottery"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        minSdk = SdkVersions.minSdk
        targetSdk = SdkVersions.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(project(":core:ui"))
    implementation(project(":core:domain"))

    implementation(Dependency.KTX.CORE)
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.Google.MATERIAL)
    implementation(Dependency.AndroidX.CONSTRAINT_LAYOUT)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.AndroidTest.EXT_JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO_CORE)

    // dagger hilt
    implementation(Dependency.DaggerHilt.DAGGER_HILT)
    kapt(Dependency.DaggerHilt.DAGGER_HILT_COMPILER)
    kapt(Dependency.DaggerHilt.DAGGER_HILT_ANDROIDX_COMPILER)

    // Retrofit
    implementation(Dependency.Retrofit.RETROFIT)
    implementation(Dependency.Retrofit.CONVERTER_GSON)
    implementation(Dependency.Retrofit.CONVERTER_JAXB)

    // OkHttp
    implementation(Dependency.OkHttp.OKHTTP)
    implementation(Dependency.OkHttp.LOGGER_INTERCEPTOR)
    implementation(Dependency.OkHttp.OKHTTP_PROFILER)

    // ViewModel
    implementation(Dependency.AndroidX.LIFECYCLE_VIEW_MODEL)
    implementation(Dependency.AndroidX.ACTIVITY)
    implementation(Dependency.AndroidX.FRAGMENT)

    // LiveData
    implementation(Dependency.AndroidX.LIFECYCLE_LIVEDATA)

    // Coroutines
    implementation(Dependency.Coroutines.COROUTINES)

}

kapt {
    correctErrorTypes = true
}