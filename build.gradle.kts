buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.hiltAgp)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
        classpath ("com.squareup:javapoet:${Versions.javapoet}")
    }
}