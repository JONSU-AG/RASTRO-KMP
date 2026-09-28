# Reglas Proguard / R8 para RASTRO - Kotlin Multiplatform & Jetpack Compose
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable

# Jetpack Compose
-keepclassmembers class androidx.compose.ui.platform.AndroidComposeView { *; }
-dontwarn androidx.compose.**

# Kotlin Multiplatform
-keep class kotlin.Metadata { *; }
-keepclassmembers class * extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    <fields>;
}

# Kotlin Serialization / kotlinx
-keepattributes *JavascriptInterface*
-keepclassmembers class * {
    @kotlinx.serialization.SerialName <fields>;
}

# Firebase & Play Services
-keepattributes Signature
-keepattributes InnerClasses
-dontwarn com.google.firebase.**
-dontwarn com.google.android.gms.**

# Modelos y Dominio Rastro
-keep class com.jonsuapps.rastro.model.** { *; }
-keep class com.jonsuapps.rastro.data.** { *; }
-keep class com.jonsuapps.rastro.theme.** { *; }
-keep class com.jonsuapps.rastro.gamification.** { *; }
-keep class com.jonsuapps.rastro.auth.** { *; }
