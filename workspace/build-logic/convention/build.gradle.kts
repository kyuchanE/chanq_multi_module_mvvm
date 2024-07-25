import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "dev.kyu.buildlogic"

// Configure the build-logic plugins to target JDK 17
// This matches the JDK used to build the project, and is not related to what is running on device.
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

//kotlin {
//    compilerOptions {
//        jvmTarget = JvmTarget.JVM_17
//    }
//}

//kotlinOptions {
//    jvmTarget = JvmTarget.JVM_17
//}


dependencies {

    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)

//    implementation("androidx.core:core-ktx:1.8.0")
//    implementation("androidx.appcompat:appcompat:1.7.0")
//    implementation("com.google.android.material:material:1.12.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.2.1")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}

//tasks {
//    validatePlugins {
//        enableStricterValidation = true
//        failOnWarning = true
//    }
//}

gradlePlugin {
    plugins {

    }
}