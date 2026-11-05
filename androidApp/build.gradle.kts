import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.google.services)
}

val localSecrets = Properties().apply {
    rootProject.file("local.properties").takeIf { it.exists() }?.inputStream()?.use { load(it) }
}

// Signing material stays outside Git, in the existing ignored local.properties.
val releaseSigningKeys = listOf("storeFile", "storePassword", "keyAlias", "keyPassword")
val releaseSigningValues = releaseSigningKeys.associateWith {
    localSecrets.getProperty("rastro.signing.$it").orEmpty()
}
val hasReleaseSigning = releaseSigningValues.values.any { it.isNotEmpty() }
if (hasReleaseSigning) {
    require(releaseSigningValues.values.all { it.isNotEmpty() }) {
        "Incomplete local RASTRO release signing configuration."
    }
    require(rootProject.file(releaseSigningValues.getValue("storeFile")).isFile) {
        "RASTRO release keystore not found."
    }
}

android {
    namespace = "com.jonsuapps.rastro"
    // Single source of truth. Android's asset merge tracks these files on every build.
    // Replacing a PNG with the same name requires no manual copy/import or code change.
    sourceSets.getByName("main").assets.srcDir(rootProject.file("LOGO/BANNER-CURSOS"))
    compileSdk = 36
    val youtubeDataApiKey = providers.gradleProperty("YOUTUBE_DATA_API_KEY").orNull
        ?: localSecrets.getProperty("YOUTUBE_DATA_API_KEY").orEmpty()

    defaultConfig {
        // Temporary thesis build; -Prastro.presentation=false restores the configured monetization.
        buildConfigField("boolean", "PRESENTATION_MODE", providers.gradleProperty("rastro.presentation").orElse("true").get().toBooleanStrict().toString())
        applicationId = "com.jonsuapps.rastro"
        minSdk = 24
        targetSdk = 36
        versionCode = 206
        versionName = "2.0.4"
        buildConfigField("String", "YOUTUBE_DATA_API_KEY", "\"$youtubeDataApiKey\"")
        manifestPlaceholders["admobAppId"] = "ca-app-pub-4563495447517759~3422086209"
        buildConfigField("String", "ADMOB_INTERSTITIAL_ID", "\"ca-app-pub-4563495447517759/3633839193\"")
        buildConfigField("String", "ADMOB_REWARDED_ID", "\"ca-app-pub-4563495447517759/2646217272\"")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    if (hasReleaseSigning) {
        signingConfigs {
            create("rastroRelease") {
                storeFile = rootProject.file(releaseSigningValues.getValue("storeFile"))
                storePassword = releaseSigningValues.getValue("storePassword")
                keyAlias = releaseSigningValues.getValue("keyAlias")
                keyPassword = releaseSigningValues.getValue("keyPassword")
            }
        }
    }

    buildTypes {
        debug {
            manifestPlaceholders["admobAppId"] = "ca-app-pub-3940256099942544~3347511713"
            buildConfigField("String", "ADMOB_INTERSTITIAL_ID", "\"ca-app-pub-3940256099942544/1033173712\"")
            buildConfigField("String", "ADMOB_REWARDED_ID", "\"ca-app-pub-3940256099942544/5224354917\"")
        }
        release {
            isDebuggable = false
            if (hasReleaseSigning) {
                signingConfig = signingConfigs.getByName("rastroRelease")
            }
            isMinifyEnabled = true
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

// Mascotas y logos son recursos locales versionados; el build no lee ni escribe copias externas.

dependencies {
    implementation("com.revenuecat.purchases:purchases:10.26.0")
    implementation("com.google.android.play:app-update:2.1.0")
    // 24.x remains compatible with the project's Kotlin 2.1 compiler (25.5 requires 2.3).
    implementation("com.google.android.gms:play-services-ads:24.9.0")
    implementation("com.google.android.ump:user-messaging-platform:4.0.0")
    implementation("com.airbnb.android:lottie:6.6.7")
    implementation(project(":shared"))
    testImplementation("junit:junit:4.13.2")
    testImplementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.serialization.json)
    
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
    implementation(libs.kotlinx.datetime)
    
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
    implementation("com.google.firebase:firebase-functions")
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.storage)
    implementation(libs.firebase.analytics)
}

// Prepared RASTRO artwork is packaged verbatim; export/source manifests stay outside the app.
val prepareLearningArtwork by tasks.registering(Sync::class) {
    from(rootProject.file("LOGO")) {
        include("ANIMACION/*.json", "SONIDOS/*.mp3")
    }
    into(layout.buildDirectory.dir("generated/learningArtwork"))
}
android.sourceSets.getByName("main").assets.srcDir(layout.buildDirectory.dir("generated/learningArtwork"))
tasks.named("preBuild") { dependsOn(prepareLearningArtwork) }
