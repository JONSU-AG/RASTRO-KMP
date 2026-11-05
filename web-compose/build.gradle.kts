import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform") version "2.2.21"
    kotlin("plugin.serialization") version "2.2.21"
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.21"
    id("org.jetbrains.compose") version "1.9.3"
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs { browser(); binaries.executable() }
    sourceSets {
        commonMain {
            // Read original sources. Never copy changes back into Android/shared.
            kotlin.srcDir("../shared/src/commonMain/kotlin")
            kotlin.srcDir("../androidApp/src/main/kotlin")
            kotlin.include("com/jonsuapps/rastro/web/**")
            kotlin.include("com/jonsuapps/rastro/theme/**")
            kotlin.include("com/jonsuapps/rastro/model/AprenderModels.kt")
            kotlin.include("com/jonsuapps/rastro/data/catalog/FilosofiaCatalog.kt")
            kotlin.include("com/jonsuapps/rastro/android/ui/screens/LearningRewards.kt")
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation(compose.materialIconsExtended)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
            }
        }
    }
}
