import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.google.services)
}

val localSecrets = Properties().apply {
    rootProject.file("local.properties").takeIf { it.exists() }?.inputStream()?.use { load(it) }
}

android {
    namespace = "com.jonsuapps.rastro"
    compileSdk = 36
    val youtubeDataApiKey = providers.gradleProperty("YOUTUBE_DATA_API_KEY").orNull
        ?: localSecrets.getProperty("YOUTUBE_DATA_API_KEY").orEmpty()

    defaultConfig {
        applicationId = "com.jonsuapps.rastro"
        minSdk = 24
        targetSdk = 36
        versionCode = 3
        versionName = "1.0.3"
        buildConfigField("String", "YOUTUBE_DATA_API_KEY", "\"$youtubeDataApiKey\"")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

// Sincronización automática inmediata de mascotas y logos desde copia rastro react
val mascotSrcDir = file("../copia rastro react/public/assets/mascots")
val resDrawableDir = file("src/main/res/drawable")
if (mascotSrcDir.exists() && resDrawableDir.exists()) {
    mascotSrcDir.listFiles()?.filter { it.extension.equals("png", ignoreCase = true) }?.forEach { f ->
        val destFile = File(resDrawableDir, f.name.lowercase().replace("-", "_"))
        if (!destFile.exists() || destFile.length() != f.length()) {
            f.copyTo(destFile, overwrite = true)
        }
    }
    val assetsSrcDir = file("../copia rastro react/public/assets")
    File(assetsSrcDir, "ARTYON.png").let { if (it.exists()) it.copyTo(File(resDrawableDir, "artyon_banner.png"), overwrite = true) }
    File(assetsSrcDir, "ORSTYY_ARTYON.png").let { if (it.exists()) it.copyTo(File(resDrawableDir, "orstty_artyon.png"), overwrite = true) }
    File(assetsSrcDir, "ORSTYY_ARTYON2.png").let { if (it.exists()) it.copyTo(File(resDrawableDir, "orstty_artyon2.png"), overwrite = true) }
    val pubSrcDir = file("../copia rastro react/public")
    File(pubSrcDir, "applogo.png").let { if (it.exists()) it.copyTo(File(resDrawableDir, "app_logo.png"), overwrite = true) }
    File(pubSrcDir, "astrologo.png").let { if (it.exists()) it.copyTo(File(resDrawableDir, "astro_logo.png"), overwrite = true) }
}

val copyMascotAssets by tasks.registering(Copy::class) {
    from(file("../copia rastro react/public/assets/mascots")) {
        rename { name -> name.lowercase().replace("-", "_") }
    }
    from(file("../copia rastro react/public/assets")) {
        include("ARTYON.png")
        rename { "artyon_banner.png" }
    }
    from(file("../copia rastro react/public/assets")) {
        include("ORSTYY_ARTYON.png")
        rename { "orstty_artyon.png" }
    }
    from(file("../copia rastro react/public/assets")) {
        include("ORSTYY_ARTYON2.png")
        rename { "orstty_artyon2.png" }
    }
    from(file("../copia rastro react/public")) {
        include("applogo.png")
        rename { "app_logo.png" }
    }
    from(file("../copia rastro react/public")) {
        include("astrologo.png")
        rename { "astro_logo.png" }
    }
    into(file("src/main/res/drawable"))
}

tasks.named("preBuild") {
    dependsOn(copyMascotAssets)
}

dependencies {
    implementation(project(":shared"))
    testImplementation("junit:junit:4.13.2")
    
    // Compose BoM Oficial
    implementation(platform(libs.compose.bom))

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.viewmodel)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material.icons.extended)
    implementation(libs.androidx.compose.ui.tooling.preview)
    debugImplementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.work.runtime.ktx)
    
    // Credential Manager para Google Sign-In Nativo
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)

    // Reproductor YouTube Nativo Oficial (Sin Error 150/152-4, 100% Google Play)
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")
    implementation(libs.googleid)
    implementation(libs.play.services.auth)

    // Firebase Android BoM
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.storage)
}
