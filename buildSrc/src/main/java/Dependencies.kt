object Dependencies {

    //Module
    const val LOCAL                     = ":source:local"
    const val REMOTE                    = ":source:remote"
    const val DOMAIN                    = ":domain:sample-domain"
    const val COMMON                    = ":common"
    const val DATA                      = ":data"

    //Kotlin
    const val KOTLIN_STD                = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"

    //Network
    const val RETROFIT2                 = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT2}"
    const val RETROFIT2_GSON            = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT2}"
    const val RETROFIT2_RXJAVA3         = "com.squareup.retrofit2:adapter-rxjava3:${Versions.RETROFIT2}"
    const val OKHTTP                    = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING            = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"

    //Coroutines
    const val COROUTINES                = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val COROUTINES_CORE           = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"

    //Lifecycle Component
    const val LIFECYCLE_VIEWMODEL       = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_LIVEDATA        = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_COMPILER        = "androidx.lifecycle:lifecycle-compiler:${Versions.LIFECYCLE}"

    //DI Inject
    const val INJECT                    = "javax.inject:javax.inject:${Versions.JAVAX_INJECT}"

    //Hilt
    const val HILT_ANDROID              = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_ANDROID_COMPILER     = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_VIEWMODEL            = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.HILT_VIEWMODEL}"
    const val HILT_COMPILER             = "androidx.hilt:hilt-compiler:${Versions.HILT_COMPILER}"

    //Android
    const val CORE_KTX                  = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val APPCOMPAT                 = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL                  = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT         = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val ACTIVITY_KTX              = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
    const val FRAGMENT_KTX              = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    //ROOM
    const val ROOM                      = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_ANNOTATION           = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KAPT                 = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KTS                  = "androidx.room:room-ktx:${Versions.ROOM}"

    //Glide
    const val GLIDE                     = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val GLIDE_COMPILER            = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
}
