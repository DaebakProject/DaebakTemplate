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
    implementation(Dependencies.ROOM)
    implementation(Dependencies.ROOM_KTS)
    annotationProcessor(Dependencies.ROOM_ANNOTATION)
    kapt(Dependencies.ROOM_KAPT)
}
