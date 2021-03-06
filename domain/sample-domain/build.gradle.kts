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
            debuggable(false)
        }

        getByName(Configs.DEBUG) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    flavorDimensions(Configs.FLAVOR)

    productFlavors {
        create(Configs.DEV) {
            dimension(Configs.FLAVOR)

            buildConfigField("boolean", "DEV", true.toString())
            buildConfigField("boolean", "STG", false.toString())
        }
        create(Configs.STG) {
            dimension(Configs.FLAVOR)

            buildConfigField("boolean", "DEV", false.toString())
            buildConfigField("boolean", "STG", true.toString())
        }
        create(Configs.PROD) {
            dimension(Configs.FLAVOR)

            buildConfigField("boolean", "DEV", false.toString())
            buildConfigField("boolean", "STG", false.toString())
        }
    }

    buildFeatures{
        viewBinding = true
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
    api(project(Dependencies.DATA))
    api(project(Dependencies.COMMON))

    //Kotlin
    implementation(Dependencies.KOTLIN_STD)

    //Android
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.ACTIVITY_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.LIFECYCLE_LIVEDATA)
    implementation(Dependencies.LIFECYCLE_COMPILER)

    //Hilt Android
    implementation(Dependencies.HILT_ANDROID)
    implementation(Dependencies.HILT_VIEWMODEL)
    kapt(Dependencies.HILT_COMPILER)
    kapt(Dependencies.HILT_ANDROID_COMPILER)

    //Coroutines
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_CORE)
}
