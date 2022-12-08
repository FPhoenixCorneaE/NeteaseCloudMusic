plugins {
    id(PluginId.androidLibrary)
    id(PluginId.commonComposeModuleConfigs)
}

dependencies {
    compileOnly(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(projects.library.common)
    // kotlin
    addKotlinDependencies()
    // androidX
    addAndroidXDependencies()
    // lifecycle
    addLifecycleDependencies()
    // compose
    addComposeOfficialDependencies()
    // compose third party
    addComposeThirdPartyDependencies()
    // third party
    addThirdPartyDependencies()
    // FPhoenixCorneaE
    addFPhoenixCorneaEDependencies()
}
