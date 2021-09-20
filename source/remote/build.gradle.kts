plugins {
    id(Configs.LIBRARY)
    id(Configs.KOTLIN_ANDROID)
    id(Configs.KOTLIN_PARCELIZE)
    id(Configs.KOTLIN_KAPT)
    id(Configs.HILT_ANDROID_PLUGIN)
}

android {
    compileSdkVersion(Configs.COMPILE_SDK)
    buildToolsVersion(Configs.BUILD_TOOLS)

    buildTypes {
        getByName(Configs.RELEASE) {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
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
    implementation(project(Dependencies.DATA))

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
    kapt(Dependencies.HILT_COMPILER)
    kapt(Dependencies.HILT_ANDROID_COMPILER)

    //Coroutines
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_CORE)

    //Network
    implementation(Dependencies.RETROFIT2)
    implementation(Dependencies.RETROFIT2_GSON)
    implementation(Dependencies.RETROFIT2_RXJAVA3)
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.OKHTTP_LOGGING)

}
