package com.jonsuapps.rastro.data.content

import java.io.File

actual fun readResourceText(path: String): String? {
    val cleanPath = path.removePrefix("/")
    try {
        val stream = Thread.currentThread().contextClassLoader?.getResourceAsStream(cleanPath)
            ?: ResourceReaderAndroid::class.java.classLoader?.getResourceAsStream(cleanPath)
            ?: ClassLoader.getSystemResourceAsStream(cleanPath)
            ?: ResourceReaderAndroid::class.java.getResourceAsStream("/$cleanPath")
            ?: ResourceReaderAndroid::class.java.getResourceAsStream(cleanPath)
        if (stream != null) {
            return stream.use { it.bufferedReader(Charsets.UTF_8).readText() }
        }
    } catch (_: Exception) {}

    return try {
        val candidates = listOf(
            File("shared/src/commonMain/resources/$cleanPath"),
            File("src/commonMain/resources/$cleanPath")
        )
        candidates.firstOrNull { it.exists() }?.readText(Charsets.UTF_8)
    } catch (_: Exception) {
        null
    }
}

private object ResourceReaderAndroid
