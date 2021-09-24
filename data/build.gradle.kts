plugins {
    `java-library`
    id(Configs.KOTLIN)
    id(Configs.KOTLIN_KAPT)
}

dependencies {
    //Kotlin
    implementation(Dependencies.KOTLIN_STD)
    //Dependency Injection
    implementation(Dependencies.INJECT)
    //Coroutines
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_CORE)
}
