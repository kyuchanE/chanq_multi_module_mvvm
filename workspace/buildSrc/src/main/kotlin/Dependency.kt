object Dependency {

    object Gson {
        const val GSON = "com.google.code.gson:gson:2.9.0"
    }

    object OkHttp {
        const val OKHTTP = "com.squareup.okhttp3:okhttp:4.9.2"
        const val URL_CONNECTION = "com.squareup.okhttp3:okhttp-urlconnection:4.9.1"
        const val LOGGER_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.2"
        const val OKHTTP_PROFILER = "com.localebro:okhttpprofiler:1.0.8"
    }

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
        const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val CONVERTER_SCALARS = "com.squareup.retrofit2:converter-scalars:2.9.0"
        const val CONVERTER_JAXB = "com.squareup.retrofit2:converter-jaxb:2.9.0"
    }

    object Logger {
        const val LOGGER = "com.orhanobut:logger:2.2.0"
    }

    object Splash {
        const val SPLASH = "androidx.core:core-splashscreen:1.0.1"
    }

    object DaggerHilt  {
        const val DAGGER_HILT  = "com.google.dagger:hilt-android:2.44"
        const val DAGGER_HILT_COMPILER  = "com.google.dagger:hilt-android-compiler:2.44"
        const val DAGGER_HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:1.0.0"
        const val DAGGER_HILT_JAVAX = "javax.inject:javax.inject:1"
    }

    object Coroutines {
        const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:1.8.0"
    }

    object AndroidX {
        const val MATERIAL = "androidx.compose.material:material:1.0.0-rc02"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.6.1"
        const val LEGACY = "androidx.legacy:legacy-support-v4:1.0.0"
        const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
        const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
        const val ACTIVITY = "androidx.activity:activity-ktx:1.3.1"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:1.3.6"
        const val DATASTORE = "androidx.datastore:datastore-preferences:1.0.0"
    }

    object Google {
        const val MATERIAL = "com.google.android.material:material:1.5.0"
    }

    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val ANDROID_JUNIT_RUNNER = "AndroidJUnitRunner"
    }

    object AndroidTest {
        const val EXT_JUNIT = "androidx.test.ext:junit:1.1.5"
        const val TEST_RUNNER = "androidx.test:runner:1.4.0"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
    }

}