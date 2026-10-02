package com.jonsuapps.rastro.android.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.LruCache
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.graphics.asImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.security.MessageDigest

/**
 * ImageCacheManager: Sistema de caché ultra-rápido de 2 niveles (Memoria LRU + Disco Local)
 * para fotos de perfil, portadas y recursos visuales de RASTRO.
 * 
 * Garantiza:
 * 1. Carga inmediata síncrona en el fotograma 0 si ya está en memoria (CERO parpadeos ni recargas al cambiar de pantalla).
 * 2. Persistencia en disco local para evitar re-descargas por red.
 * 3. Descarga asíncrona segura en background con timeouts optimizados.
 */
object ImageCacheManager {

    // Caché en memoria RAM (LRU): guarda hasta 50 imágenes decodificadas listas para dibujar
    private val memoryCache = object : LruCache<String, ImageBitmap>(50) {
        override fun sizeOf(key: String, value: ImageBitmap): Int {
            return 1
        }
    }

    private var cacheDir: File? = null

    fun initialize(context: Context) {
        if (cacheDir == null) {
            cacheDir = File(context.cacheDir, "rastro_image_cache").apply {
                if (!exists()) mkdirs()
            }
        }
    }

    /**
     * Consulta síncrona de memoria RAM. Retorna null si aún no se ha cargado.
     */
    fun getFromMemory(url: String): ImageBitmap? {
        if (url.isBlank()) return null
        return memoryCache.get(url)
    }

    /**
     * Invalida una URL concreta (memoria + disco) cuando su imagen fue REEMPLAZADA.
     * Llamar con la URL ANTERIOR justo al confirmar la subida nueva: así la próxima
     * lectura refetch/lee el contenido vigente en vez de reutilizar el bitmap viejo.
     * No afecta a ninguna otra imagen en caché.
     */
    fun evict(url: String) {
        if (url.isBlank()) return
        memoryCache.remove(url)
        runCatching {
            val dir = cacheDir ?: return@runCatching
            val f = File(dir, "${sha256(url)}.cache")
            if (f.exists()) f.delete()
        }
    }

    /**
     * Carga la imagen consultando primero la memoria, luego el disco local, y finalmente la red.
     */
    suspend fun loadImage(context: Context, url: String): ImageBitmap? {
        if (url.isBlank()) return null

        // 1. Memoria RAM
        memoryCache.get(url)?.let { return it }

        // Inicializar directorio si no está listo
        if (cacheDir == null) {
            initialize(context.applicationContext)
        }

        return withContext(Dispatchers.IO) {
            // 2. Disco local
            val diskFile = getDiskCacheFile(url)
            if (diskFile != null && diskFile.exists() && diskFile.length() > 0) {
                runCatching {
                    BitmapFactory.decodeFile(diskFile.absolutePath)?.asImageBitmap()?.also { bitmap ->
                        memoryCache.put(url, bitmap)
                        return@withContext bitmap
                    }
                }
            }

            // 3. Descarga de red
            runCatching {
                val connection = URL(url).openConnection().apply {
                    connectTimeout = 7_000
                    readTimeout = 8_000
                }
                connection.getInputStream().use { inputStream ->
                    val bytes = inputStream.readBytes()
                    val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)?.asImageBitmap()
                    if (bitmap != null) {
                        memoryCache.put(url, bitmap)
                        // Guardar en disco para próximas visitas
                        if (diskFile != null) {
                            runCatching {
                                FileOutputStream(diskFile).use { it.write(bytes) }
                            }
                        }
                        bitmap
                    } else {
                        null
                    }
                }
            }.getOrNull()
        }
    }

    private fun getDiskCacheFile(url: String): File? {
        val dir = cacheDir ?: return null
        val hash = sha256(url)
        return File(dir, "$hash.cache")
    }

    private fun sha256(text: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val hashBytes = digest.digest(text.toByteArray(Charsets.UTF_8))
        return hashBytes.joinToString("") { "%02x".format(it) }
    }
}
