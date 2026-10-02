package com.jonsuapps.rastro.android.data

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.google.android.gms.auth.api.identity.AuthorizationRequest
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.Scope
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.FirebaseAuth
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import kotlin.concurrent.thread

/**
 * Subida real de archivos al Google Drive DEL USUARIO (único punto central).
 *
 * Flujo: cuenta Google de la sesión → OAuth scope drive.file (solo archivos
 * creados por RASTRO) → carpeta "RASTRO" (se crea si no existe) → files.create
 * multipart → permissions.create anyone/reader (si [makePublic]) → fileId + URL
 * directa del ARCHIVO (https://drive.google.com/file/d/<id>/view).
 *
 * No usa Firebase Storage. No devuelve URL de carpeta.
 */
data class DriveUploadedFile(
    val fileId: String,
    val directUrl: String,
    val name: String,
    val mimeType: String
)

object DriveUploadRepository {

    private const val DRIVE_FILE_SCOPE = "https://www.googleapis.com/auth/drive.file"
    private const val RASTRO_FOLDER = "RASTRO"
    private const val FOLDER_MIME = "application/vnd.google-apps.folder"

    /** URL de vista del archivo en Drive (visor web, abre el ARCHIVO, no la carpeta). */
    fun fileViewUrl(fileId: String): String = "https://drive.google.com/file/d/$fileId/view"

    private const val DRIVE_APP_PACKAGE = "com.google.android.apps.docs"

    /**
     * Extrae el fileId de Drive de URLs file/d, /d/, ?id=, open?id=.
     * Null si no es un archivo Drive (carpetas /folders/, otros hosts, vacío).
     */
    fun extractDriveFileId(rawUrl: String): String? =
        Regex("/file/d/([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)
            ?: Regex("/d/([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)
                ?.takeIf { !rawUrl.contains("/drive/folders/", ignoreCase = true) }
            ?: Regex("[?&]id=([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)
            ?: Regex("open\\?id=([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)

    /**
     * Abre un recurso: si es archivo Drive con fileId, intenta la app Google Drive
     * instalada; si no está o falla, navegador con file/d/<id>/view. Sin fileId,
     * abre la URL tal cual (comportamiento anterior). Las previews no se tocan.
     */
    fun openDriveResource(context: Context, url: String): Boolean {
        if (url.isBlank()) return false
        val fileId = extractDriveFileId(url)
        if (fileId != null) {
            val viaApp = Intent(Intent.ACTION_VIEW, Uri.parse(fileViewUrl(fileId))).apply {
                `package` = DRIVE_APP_PACKAGE
            }
            if (launch(context, viaApp)) return true
            if (launch(context, Intent(Intent.ACTION_VIEW, Uri.parse(fileViewUrl(fileId))))) return true
            return false
        }
        return launch(context, Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    private fun launch(context: Context, intent: Intent): Boolean = runCatching {
        if (context !is Activity) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
        true
    }.getOrDefault(false)

    /**
     * URL directa con BYTES del archivo (apta para <Image>/Coil/miniaturas y para
     * ACTION_VIEW, que abre el archivo mismo). Imágenes → thumbnail; resto
     * (PDF/docs) → descarga directa. Requiere el archivo público (makePublic).
     */
    fun directFileUrl(fileId: String, mimeType: String): String =
        if (mimeType.startsWith("image", ignoreCase = true)) {
            "https://drive.google.com/thumbnail?id=$fileId&sz=w1000"
        } else {
            "https://drive.google.com/uc?export=download&id=$fileId"
        }

    /**
     * Sube [bytes] con [displayName]/[mimeType] a Drive del usuario.
     * Llama a [onResult] siempre en el hilo principal.
     */
    /**
     * Resolución segura de Activity desde cualquier Context (incluye
     * ContextWrapper de Dialogs). Centralizada: todos los flujos la reutilizan.
     */
    fun resolveActivity(context: Context): Activity? {
        var current: Context? = context
        while (current != null) {
            if (current is Activity) return current
            current = if (current is android.content.ContextWrapper) current.baseContext else null
        }
        return null
    }

    fun uploadUserFile(
        context: Context,
        bytes: ByteArray,
        displayName: String,
        mimeType: String,
        makePublic: Boolean,
        onResult: (Result<DriveUploadedFile>) -> Unit
    ) {
        val contextClass = context::class.java.name
        Log.d("DRIVE_AUTH", "DRIVE_AUTH inicio uploadUserFile context=$contextClass archivo=$displayName mime=$mimeType public=$makePublic")
        val activity = resolveActivity(context)
        Log.d("DRIVE_AUTH", "DRIVE_AUTH activityEncontrada=${activity != null} activityClass=${activity?.let { it::class.java.name } ?: "ninguna"}")
        if (activity == null) {
            Log.d("DRIVE_AUTH", "DRIVE_AUTH ERROR=sin Activity tras desenvolver ContextWrapper")
            onResult(Result.failure(IllegalStateException("No se pudo abrir la autorización de Google Drive.")))
            return
        }
        val email = FirebaseAuth.getInstance().currentUser?.email
        if (email.isNullOrBlank()) {
            onResult(Result.failure(IllegalStateException("Inicia sesión con Google para subir archivos a tu Drive.")))
            return
        }
        if (bytes.isEmpty()) {
            onResult(Result.failure(IllegalStateException("El archivo está vacío.")))
            return
        }
        val screen = activity::class.java.simpleName
        Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen activityDisponible=SI archivo=$displayName public=$makePublic")
        thread {
            try {
                val token = requestAccessToken(activity, screen)
                Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen token=OK")
                val folderId = findOrCreateRastroFolder(token)
                Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen carpeta=OK")
                val fileId = uploadMultipart(token, folderId, bytes, displayName, mimeType)
                Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen upload=OK fileId=$fileId")
                if (makePublic) setAnyoneReader(token, fileId)
                val file = DriveUploadedFile(fileId, directFileUrl(fileId, mimeType), displayName, mimeType)
                postMain { onResult(Result.success(file)) }
            } catch (e: Exception) {
                Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen upload=ERROR clase=${e::class.java.simpleName} mensaje=${e.localizedMessage}")
                postMain { onResult(Result.failure(e)) }
            }
        }
    }

    // ==================== OAuth (drive.file, cuenta de la sesión) ====================

    private fun requestAccessToken(activity: Activity, screen: String): String {
        val request = AuthorizationRequest.builder()
            .setRequestedScopes(listOf(Scope(DRIVE_FILE_SCOPE)))
            .build()
        Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen solicitandoToken scope=drive.file")
        try {
            val result = Tasks.await(Identity.getAuthorizationClient(activity).authorize(request))
            Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen resultadoAutorizacion=OK")
            return result.accessToken
                ?: throw IllegalStateException("Google no otorgó acceso a Drive.")
        } catch (e: ApiException) {
            val hasResolution = e.status.hasResolution()
            Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen resultadoAutorizacion=ERROR clase=${e::class.java.simpleName} codigo=${e.statusCode} resolucion=$hasResolution mensaje=${e.localizedMessage}")
            // Si el sistema exige consentimiento con UI, se lanza y el permiso queda
            // otorgado: el usuario reintenta y la segunda vez entra en silencio.
            try {
                if (hasResolution) {
                    Log.d("DRIVE_AUTH", "DRIVE_AUTH pantalla=$screen consentimientoUI=lanzado reintento=pendiente")
                    e.status.startResolutionForResult(activity, 9001)
                }
            } catch (_: Exception) {
            }
            throw IllegalStateException("Autoriza el acceso a Google Drive e inténtalo de nuevo.")
        }
    }

    // ==================== Drive REST v3 (HttpURLConnection, sin deps nuevas) ====================

    private fun findOrCreateRastroFolder(token: String): String {
        val q = URLEncoder.encode(
            "name = '$RASTRO_FOLDER' and mimeType = '$FOLDER_MIME' and trashed = false",
            "UTF-8"
        )
        val found = driveRequest(
            token, "GET",
            "https://www.googleapis.com/drive/v3/files?q=$q&fields=files(id)&spaces=drive",
            null, null
        )
        val files = JSONObject(found).optJSONArray("files")
        if (files != null && files.length() > 0) return files.getJSONObject(0).getString("id")
        val created = driveRequest(
            token, "POST",
            "https://www.googleapis.com/drive/v3/files?fields=id",
            JSONObject().put("name", RASTRO_FOLDER).put("mimeType", FOLDER_MIME).toString().toByteArray(Charsets.UTF_8),
            "application/json; charset=UTF-8"
        )
        return JSONObject(created).getString("id")
    }

    private fun uploadMultipart(
        token: String,
        folderId: String,
        bytes: ByteArray,
        displayName: String,
        mimeType: String
    ): String {
        val boundary = "rastro_${System.currentTimeMillis()}"
        val meta = JSONObject()
            .put("name", displayName)
            .put("mimeType", mimeType)
            .put("parents", org.json.JSONArray().put(folderId))
            .toString()
        val out = ByteArrayOutputStream()
        fun part(text: String) = out.write(text.toByteArray(Charsets.UTF_8))
        part("--$boundary\r\nContent-Type: application/json; charset=UTF-8\r\n\r\n")
        part(meta)
        part("\r\n--$boundary\r\nContent-Type: $mimeType\r\n\r\n")
        out.write(bytes)
        part("\r\n--$boundary--\r\n")
        val resp = driveRequest(
            token, "POST",
            "https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart&fields=id",
            out.toByteArray(),
            "multipart/related; boundary=$boundary"
        )
        return JSONObject(resp).getString("id")
    }

    private fun setAnyoneReader(token: String, fileId: String) {
        driveRequest(
            token, "POST",
            "https://www.googleapis.com/drive/v3/files/$fileId/permissions?fields=id",
            JSONObject().put("type", "anyone").put("role", "reader").toString().toByteArray(Charsets.UTF_8),
            "application/json; charset=UTF-8"
        )
    }

    private fun driveRequest(
        token: String,
        method: String,
        url: String,
        body: ByteArray?,
        contentType: String?
    ): String {
        val conn = (URL(url).openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 20000
            readTimeout = 120000
            setRequestProperty("Authorization", "Bearer $token")
            if (body != null) {
                doOutput = true
                setRequestProperty("Content-Type", contentType)
                setFixedLengthStreamingMode(body.size)
                outputStream.use { it.write(body) }
            }
        }
        val code = conn.responseCode
        val text = try {
            (if (code in 200..299) conn.inputStream else conn.errorStream)
                ?.bufferedReader()?.use { it.readText() }.orEmpty()
        } catch (_: Exception) {
            ""
        }
        if (code !in 200..299) throw IllegalStateException("Drive ($code): ${text.take(200)}")
        return text
    }

    private fun postMain(block: () -> Unit) {
        Handler(Looper.getMainLooper()).post(block)
    }
}
