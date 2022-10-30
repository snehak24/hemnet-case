buildscript {
    val kotlin_version by extra("1.6.20")
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

//plugins {
//    id 'com.android.application' version '7.3.0' apply false
//    id 'com.android.library' version '7.3.0' apply false
//    id 'org.jetbrains.kotlin.android' version '1.6.10' apply false
//}