plugins {
    id(Configs.APPLICATION)
    id(Configs.KOTLIN_ANDROID)
    id(Configs.KOTLIN_KAPT)
    id(Configs.HILT_ANDROID_PLUGIN)
}

android {
    compileSdkVersion(Configs.COMPILE_SDK)
    buildToolsVersion(Configs.BUILD_TOOLS)
    
    defaultConfig {
        applicationId = Configs.APPLICATION_ID
        minSdkVersion(Configs.MIN_SDK)
        targetSdkVersion(Configs.TARGET_SDK)
        versionCode = Configs.VERSION_CODE
        versionName = Configs.VERSION_NAME
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    //Module
    implementation(project(Dependencies.DOMAIN))
    implementation(project(Dependencies.LOCAL))
    implementation(project(Dependencies.REMOTE))

    //Kotlin
    implementation(Dependencies.KOTLIN_STD)

    //Android
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)

    //Hilt Android
    implementation(Dependencies.HILT_ANDROID)
    implementation(Dependencies.HILT_VIEWMODEL)
    kapt(Dependencies.HILT_ANDROID_COMPILER)
    kapt(Dependencies.HILT_COMPILER)

    //Coroutines
    implementation(Dependencies.COROUTINES)

    //Network
    implementation(Dependencies.RETROFIT2)
    implementation(Dependencies.RETROFIT2_GSON)
    implementation(Dependencies.RETROFIT2_RXJAVA3)
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.OKHTTP_LOGGING)

}
