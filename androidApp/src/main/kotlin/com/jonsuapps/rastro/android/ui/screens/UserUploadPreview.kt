package com.jonsuapps.rastro.android.ui.screens

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.BrokenImage
import androidx.compose.material.icons.rounded.FolderOpen
import androidx.compose.material.icons.rounded.OpenInNew
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

private sealed class PreviewResult {
    data object Loading : PreviewResult()
    data class Ready(val bitmap: ImageBitmap) : PreviewResult()
    data object Failed : PreviewResult()
}

@Composable
fun UserUploadPreview(
    upload: UserUpload,
    theme: RastroPalette,
    modifier: Modifier = Modifier
) {
    var selectedImage by remember(upload.id) { mutableStateOf<ImageBitmap?>(null) }
    val uriHandler = LocalUriHandler.current
    val context = LocalContext.current

    val isFolder = upload.isFolder ||
        upload.url.contains("/folders/", ignoreCase = true) ||
        upload.url.contains("folderview", ignoreCase = true) ||
        upload.title.contains("carpeta", ignoreCase = true) ||
        upload.category.contains("carpeta", ignoreCase = true)

    val driveId = remember(upload.url) { driveFileId(upload.url) }

    when {
        // 1. CARPETA DE GOOGLE DRIVE: No intentar cargar imagen, mostrar tarjeta informativa amigable con estilo Sticker
        isFolder -> {
            FolderPreviewCard(
                upload = upload,
                theme = theme,
                modifier = modifier,
                onOpenDrive = {
                    if (upload.url.isNotBlank()) {
                        runCatching { uriHandler.openUri(upload.url) }
                    }
                }
            )
        }

        // 2. ARCHIVO DE DRIVE O IMAGEN/PDF REMOTO
        else -> {
            val candidateUrls = remember(upload.url, driveId, upload.previewUrls) {
                buildList {
                    // Prioridad 1: URLs directas de imagen si fueron subidas
                    addAll(upload.previewUrls)
                    // Prioridad 2: Si tiene ID de Google Drive (sea PDF o Imagen JPG/PNG), las miniaturas oficiales de Drive
                    if (driveId != null) {
                        add("https://drive.google.com/thumbnail?id=$driveId&sz=w1000")
                        add("https://lh3.googleusercontent.com/d/$driveId=w800")
                        add("https://drive.google.com/uc?export=view&id=$driveId")
                    }
                    // Prioridad 3: URL original si parece ser imagen directa
                    if (upload.url.isNotBlank() && (upload.isImage || upload.url.contains("firebasestorage"))) {
                        add(upload.url)
                    }
                }.distinct()
            }

            if (candidateUrls.isNotEmpty()) {
                RemoteUploadImageWithFallback(
                    candidateUrls = candidateUrls,
                    theme = theme,
                    modifier = modifier.fillMaxWidth().heightIn(min = 190.dp, max = 340.dp),
                    onImageClick = { bmp -> selectedImage = bmp }
                )
            } else if (upload.isPdf) {
                // PDF directo sin Google Drive: renderizado de primera página
                val result by produceState<PreviewResult>(PreviewResult.Loading, upload.url) {
                    value = withContext(Dispatchers.IO) {
                        renderPdfCover(context, upload.url)?.let(PreviewResult::Ready) ?: PreviewResult.Failed
                    }
                }
                when (result) {
                    PreviewResult.Loading -> PreviewLoading(theme, modifier)
                    is PreviewResult.Ready -> {
                        val bmp = (result as PreviewResult.Ready).bitmap
                        Box(
                            modifier = modifier
                                .fillMaxWidth()
                                .heightIn(min = 190.dp, max = 340.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(if (theme.isLight) Color(0xFFF8FAFC) else Color(0xFF0F172A))
                                .border(1.8.dp, theme.strokeBorder, RoundedCornerShape(16.dp))
                                .clickable { selectedImage = bmp },
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                bitmap = bmp,
                                contentDescription = "Portada de ${upload.title}",
                                modifier = Modifier.fillMaxWidth().heightIn(min = 190.dp, max = 340.dp),
                                contentScale = ContentScale.Fit
                            )
                        }
                    }
                    PreviewResult.Failed -> PreviewPlaceholder(
                        title = "Portada de PDF no disponible",
                        detail = "Abre el recurso para consultar el documento completo.",
                        theme = theme,
                        modifier = modifier
                    )
                }
            } else {
                PreviewPlaceholder(
                    title = "Sin vista previa",
                    detail = "Este recurso no cuenta con miniatura. Abre el enlace para consultarlo.",
                    theme = theme,
                    modifier = modifier
                )
            }
        }
    }

    // Modal a pantalla completa para ampliar imagen / portada
    selectedImage?.let { bmp ->
        Dialog(onDismissRequest = { selectedImage = null }) {
            com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                modifier = Modifier.fillMaxWidth(0.96f),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(22.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = upload.title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary,
                            maxLines = 1,
                            modifier = Modifier.weight(1f)
                        )
                        TextButton(onClick = { selectedImage = null }) {
                            Text("Cerrar", color = theme.accent, fontWeight = FontWeight.Bold)
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(min = 280.dp, max = 560.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color.Black.copy(alpha = 0.85f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            bitmap = bmp,
                            contentDescription = "Vista ampliada",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            }
        }
    }
}

/**
 * Tarjeta exclusiva para Carpetas de Google Drive (replica exacta del mensaje que pide el usuario)
 */
@Composable
private fun FolderPreviewCard(
    upload: UserUpload,
    theme: RastroPalette,
    modifier: Modifier = Modifier,
    onOpenDrive: () -> Unit
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        color = theme.surface,
        border = androidx.compose.foundation.BorderStroke(2.dp, if (theme.isLight) Color(0xFFBAE6FD) else Color(0xFF0369A1))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Icono Sticker Carpeta
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFF38BDF8).copy(alpha = 0.15f))
                    .border(2.dp, Color(0xFF0284C7), RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.FolderOpen,
                    contentDescription = "Carpeta",
                    tint = Color(0xFF0284C7),
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(Modifier.height(12.dp))

            // Badge
            Box(
                modifier = Modifier
                    .clip(RastroShapes.Pill)
                    .background(Color(0xFF0284C7))
                    .padding(horizontal = 10.dp, vertical = 3.dp)
            ) {
                Text(
                    text = "CARPETA DE ARCHIVOS · GOOGLE DRIVE",
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Black,
                    letterSpacing = 0.5.sp
                )
            }

            Spacer(Modifier.height(10.dp))

            // Título
            Text(
                text = upload.title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Black,
                color = theme.textPrimary,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(6.dp))

            // Mensaje amigable recordatorio para carpetas
            Text(
                text = "Esta es una carpeta de archivos, es por eso que no hay vista previa, ten un buen día estudiante promedio 💙",
                style = MaterialTheme.typography.bodySmall,
                color = theme.textSecondary,
                textAlign = TextAlign.Center,
                lineHeight = 18.sp
            )

            Spacer(Modifier.height(16.dp))

            // Botón Táctil 3D para abrir en Drive
            Sticker3dButton(
                onClick = onOpenDrive,
                containerColor = Color(0xFF0284C7),
                bottomBevelColor = Color(0xFF075985),
                strokeColor = Color(0xFF082F49),
                contentPadding = PaddingValues(horizontal = 18.dp, vertical = 8.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.OpenInNew,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    text = "Abrir Carpeta en Drive",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

/**
 * Cargador de imagen con fallback escalonado y decodificación optimizada para imágenes verticales y horizontales
 */
@Composable
private fun RemoteUploadImageWithFallback(
    candidateUrls: List<String>,
    theme: RastroPalette,
    modifier: Modifier = Modifier,
    onImageClick: (ImageBitmap) -> Unit = {}
) {
    val result by produceState<PreviewResult>(PreviewResult.Loading, candidateUrls) {
        value = withContext(Dispatchers.IO) {
            var loadedBitmap: ImageBitmap? = null
            for (url in candidateUrls) {
                val bmp = fetchBitmapSafe(url)
                if (bmp != null) {
                    loadedBitmap = bmp
                    break
                }
            }
            loadedBitmap?.let(PreviewResult::Ready) ?: PreviewResult.Failed
        }
    }

    when (result) {
        PreviewResult.Loading -> PreviewLoading(theme, modifier)
        is PreviewResult.Ready -> {
            val bmp = (result as PreviewResult.Ready).bitmap
            Box(
                modifier = modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(if (theme.isLight) Color(0xFFF1F5F9) else Color(0xFF0B132B))
                    .border(1.8.dp, theme.strokeBorder, RoundedCornerShape(16.dp))
                    .clickable { onImageClick(bmp) },
                contentAlignment = Alignment.Center
            ) {
                Image(
                    bitmap = bmp,
                    contentDescription = "Portada del recurso",
                    modifier = Modifier.fillMaxWidth().heightIn(min = 190.dp, max = 340.dp),
                    contentScale = ContentScale.Fit // Preserva proporción vertical u horizontal sin recortes
                )
            }
        }
        PreviewResult.Failed -> PreviewPlaceholder(
            title = "Portada no disponible",
            detail = "No se pudo cargar la miniatura de este recurso. Toca para abrirlo.",
            theme = theme,
            modifier = modifier
        )
    }
}

@Composable
private fun PreviewLoading(theme: RastroPalette, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(theme.surfaceAccent)
            .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(modifier = Modifier.size(24.dp), strokeWidth = 2.dp, color = theme.accent)
    }
}

@Composable
private fun PreviewPlaceholder(
    title: String,
    detail: String,
    theme: RastroPalette,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth().heightIn(min = 160.dp, max = 220.dp),
        shape = RoundedCornerShape(16.dp),
        color = theme.surfaceAccent,
        border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 22.dp, vertical = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.BrokenImage,
                contentDescription = null,
                tint = Color(0xFFB45309),
                modifier = Modifier.size(32.dp)
            )
            Spacer(Modifier.height(8.dp))
            Text(title, color = theme.textPrimary, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(4.dp))
            Text(detail, color = theme.textSecondary, style = MaterialTheme.typography.bodySmall, textAlign = TextAlign.Center)
        }
    }
}

/**
 * Descargador seguro con seguimiento de redirecciones y sampleSize para imágenes verticales de alta resolución
 */
private fun fetchBitmapSafe(urlString: String): ImageBitmap? = runCatching {
    var currentUrl = urlString
    var redirectCount = 0
    var connection: HttpURLConnection? = null
    var stream: InputStream? = null

    while (redirectCount < 4) {
        val conn = (URL(currentUrl).openConnection() as HttpURLConnection).apply {
            connectTimeout = 12_000
            readTimeout = 15_000
            setRequestProperty("User-Agent", "Mozilla/5.0 (Android; Mobile; rv:109.0)")
            instanceFollowRedirects = true
        }
        val responseCode = conn.responseCode
        if (responseCode in 300..399) {
            val location = conn.getHeaderField("Location") ?: break
            currentUrl = location
            redirectCount++
            conn.disconnect()
        } else if (responseCode == HttpURLConnection.HTTP_OK) {
            connection = conn
            stream = conn.inputStream
            break
        } else {
            conn.disconnect()
            return null
        }
    }

    val bytes = stream?.use { it.readBytes() } ?: return null
    connection?.disconnect()

    if (bytes.isEmpty()) return null

    // Leer dimensiones primero para calcular inSampleSize
    val boundsOptions = BitmapFactory.Options().apply { inJustDecodeBounds = true }
    BitmapFactory.decodeByteArray(bytes, 0, bytes.size, boundsOptions)

    var sampleSize = 1
    val maxDimension = maxOf(boundsOptions.outWidth, boundsOptions.outHeight)
    while (maxDimension / sampleSize > 1400) {
        sampleSize *= 2
    }

    val decodeOptions = BitmapFactory.Options().apply {
        inSampleSize = sampleSize
        inPreferredConfig = Bitmap.Config.RGB_565 // Optimizado para memoria
    }

    BitmapFactory.decodeByteArray(bytes, 0, bytes.size, decodeOptions)?.asImageBitmap()
}.getOrNull()

fun driveFileId(rawUrl: String): String? =
    Regex("/file/d/([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)
        ?: Regex("/d/([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)
        ?: Regex("[?&]id=([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)
        ?: Regex("open\\?id=([A-Za-z0-9_-]+)").find(rawUrl)?.groupValues?.getOrNull(1)

private fun renderPdfCover(context: Context, url: String): ImageBitmap? = runCatching {
    val connection = URL(url).openConnection().apply {
        connectTimeout = 12_000
        readTimeout = 20_000
    }
    val file = File.createTempFile("rastro-cover-", ".pdf", context.cacheDir)
    try {
        connection.getInputStream().use { input ->
            file.outputStream().use { output ->
                val buffer = ByteArray(16 * 1024)
                var total = 0
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    total += count
                    if (total > 24 * 1024 * 1024) error("PDF demasiado grande para mostrar su portada")
                    output.write(buffer, 0, count)
                }
            }
        }
        val descriptor = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
        PdfRenderer(descriptor).use { renderer ->
            if (renderer.pageCount == 0) return null
            renderer.openPage(0).use { page ->
                val scale = minOf(1400f / page.width, 1800f / page.height, 1.5f)
                val bitmap = Bitmap.createBitmap(
                    (page.width * scale).toInt().coerceAtLeast(1),
                    (page.height * scale).toInt().coerceAtLeast(1),
                    Bitmap.Config.ARGB_8888
                )
                page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                bitmap.asImageBitmap()
            }
        }
    } finally {
        file.delete()
    }
}.getOrNull()
