package com.jonsuapps.rastro.android.ui.screens
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.android.ui.components.rastroAcademicBackground
import com.jonsuapps.rastro.android.ui.components.RastroAdaptiveViewport
import com.jonsuapps.rastro.android.ui.components.RastroBoundedBlock


import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Build
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.collectAsState
import com.jonsuapps.rastro.android.data.FavoritesRepository
import com.jonsuapps.rastro.android.data.FavoriteType
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.android.ui.components.LucideSettingsIcon
import com.jonsuapps.rastro.android.ui.components.LucideTrashIcon
import com.jonsuapps.rastro.android.ui.components.appleGlass
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dPill
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.android.data.SharedPlaylistsRepository
import com.jonsuapps.rastro.android.ui.components.YouTubePlaylistPlayer
import com.jonsuapps.rastro.android.ui.components.RastroYouTubeChromeClient
import com.jonsuapps.rastro.android.ui.components.findActivity
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.data.CoursePlaylist
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.android.ui.components.bouncyClick

import androidx.compose.ui.platform.LocalContext
import androidx.compose.material.icons.outlined.Calculate
import com.jonsuapps.rastro.android.data.CustomVideoItem
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import com.jonsuapps.rastro.android.data.UserPlaylistsRepository
import com.jonsuapps.rastro.theme.RastroPalette

@Composable
fun YouTubePlaylistWebView(playlistId: String) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    val id = UserPlaylistsRepository.extractPlaylistId(playlistId)
    val isPlaylist = id.startsWith("PL") || id.startsWith("UU") || id.startsWith("LL") || id.startsWith("RD") || id.startsWith("OLAK")
    val publicUrl = if (isPlaylist) "https://www.youtube.com/playlist?list=$id" else "https://www.youtube.com/watch?v=$id"
    val origin = "https://${context.packageName.lowercase()}"
    // Cargar el embed directamente evita que un iframe anidado pierda el Referer en Android WebView.
    // YouTube rechaza esos embeds con los errores 152/153 o deja el área negra.
    val source = Uri.Builder()
        .scheme("https")
        .authority("www.youtube.com")
        .appendPath("embed")
        .apply { if (isPlaylist) appendPath("videoseries") else appendPath(id) }
        .appendQueryParameter("list", id.takeIf { isPlaylist })
        .appendQueryParameter("playsinline", "1")
        .build()
        .toString()
    var loadError by remember(id) { mutableStateOf<String?>(null) }

    Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        if (id.isNotBlank()) {
            AndroidView(
                factory = { ctx ->
                    WebView(ctx).apply {
                        settings.javaScriptEnabled = true
                        settings.domStorageEnabled = true
                        settings.mediaPlaybackRequiresUserGesture = true
                        settings.allowFileAccess = false
                        settings.allowContentAccess = false
                        CookieManager.getInstance().setAcceptCookie(true)
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)
                        webViewClient = object : WebViewClient() {
                            override fun onReceivedError(
                                view: WebView,
                                request: WebResourceRequest,
                                error: android.webkit.WebResourceError
                            ) {
                                if (request.isForMainFrame) {
                                    loadError = "No se pudo conectar con YouTube. Verifica tu conexión."
                                }
                            }
                        }
                        webChromeClient = RastroYouTubeChromeClient(ctx.findActivity())
                        tag = id
                        loadUrl(source, mapOf("Referer" to origin))
                    }
                },
                update = { view ->
                    if (view.tag != id) {
                        view.tag = id
                        loadError = null
                        view.loadUrl(source, mapOf("Referer" to origin))
                    }
                },
                onRelease = { view ->
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        (view.webChromeClient as? RastroYouTubeChromeClient)?.exitFullscreen()
                    }
                    view.stopLoading()
                    view.loadUrl("about:blank")
                    view.destroy()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f)
                    .heightIn(min = 200.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(16.dp))
            )
            loadError?.let { message ->
                Text(message, color = theme.textSecondary, fontSize = 11.sp, modifier = Modifier.padding(horizontal = 4.dp))
            }
        }

        Sticker3dButton(
            onClick = {
                runCatching {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(publicUrl)).apply {
                        setPackage("com.google.android.youtube")
                    }
                    context.startActivity(intent)
                }.onFailure {
                    runCatching {
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(publicUrl)))
                    }
                }
            },
            enabled = id.isNotBlank(),
            modifier = Modifier.fillMaxWidth().height(42.dp),
            containerColor = Color(0xFFDC2626),
            bottomBevelColor = Color(0xFF991B1B),
            strokeColor = theme.strokeBorder,
            shape = RastroShapes.Pill,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
            Spacer(Modifier.width(6.dp))
            Text("Abrir en App de YouTube", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp, maxLines = 1)
        }
        Text(
            "Si YouTube indica que el video no está disponible, su propietario no permitió verlo integrado. Ábrelo en YouTube para continuar.",
            color = theme.textSecondary,
            fontSize = 10.sp,
            lineHeight = 14.sp,
            modifier = Modifier.padding(horizontal = 4.dp)
        )
    }
}


@Composable
fun CoursePlaylistCard(
    playlist: CoursePlaylist,
    theme: RastroPalette,
    onPlay: () -> Unit,
    onEdit: (() -> Unit)? = null,
    onDelete: (() -> Unit)? = null,
    isShared: Boolean = false,
    sharingBusy: Boolean = false,
    onShare: (() -> Unit)? = null
) {
    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        containerColor = theme.surface,
        strokeColor = theme.strokeBorder,
        bevelColor = theme.cardBevel,
        bevelHeight = 4.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(theme.accent.copy(alpha = 0.15f))
                            .border(1.2.dp, theme.strokeBorder.copy(alpha = 0.45f), RastroShapes.Pill)
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = playlist.subject,
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.accentText,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (onShare != null) {
                        Text(if (sharingBusy) "Guardando…" else "Compartir", fontSize = 11.sp, color = theme.textSecondary)
                        Box(Modifier.size(48.dp)
                            .toggleable(value = isShared, enabled = !sharingBusy, role = Role.Switch,
                                onValueChange = { next -> if (next != isShared) onShare() })
                            .semantics { contentDescription = "Compartir playlist con la comunidad" },
                            contentAlignment = Alignment.Center) {
                            androidx.compose.material3.Switch(checked = isShared, onCheckedChange = null, enabled = !sharingBusy,
                                modifier = Modifier.graphicsLayer { scaleX = .72f; scaleY = .72f }.clearAndSetSemantics {})
                        }
                    }

                    if (onEdit != null) {
                        Spacer(modifier = Modifier.width(6.dp))
                        LucideSettingsIcon(
                            onClick = onEdit,
                            tint = theme.accentText,
                            size = 18.dp
                        )
                    }

                    if (onDelete != null) {
                        Spacer(modifier = Modifier.width(6.dp))
                        LucideTrashIcon(
                            onClick = onDelete,
                            tint = Color(0xFFEF4444),
                            size = 18.dp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = playlist.title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = playlist.channelTitle,
                style = MaterialTheme.typography.bodySmall,
                color = theme.textSecondary
            )

            if (playlist.description.isNotBlank()) {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = playlist.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = theme.textSecondary,
                    lineHeight = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Sticker3dButton(
                onClick = onPlay,
                containerColor = theme.accent,
                bottomBevelColor = theme.accentBevel,
                strokeColor = theme.strokeBorder,
                shape = RastroShapes.Pill,
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(vertical = 10.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.PlayArrow,
                    contentDescription = null,
                    tint = theme.onAccent,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Ver Lista de Clases",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = theme.onAccent
                )
            }

        }
    }
}

@Composable
fun CreateOrEditPlaylistDialog(
    initialPlaylist: CoursePlaylist?,
    theme: RastroPalette,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var inputTitle by remember(initialPlaylist) { mutableStateOf(initialPlaylist?.title ?: "") }
    var inputSubject by remember(initialPlaylist) { mutableStateOf(initialPlaylist?.subject ?: "Física") }
    var inputDescription by remember(initialPlaylist) { mutableStateOf(initialPlaylist?.description ?: "") }
    var isCustomList by remember(initialPlaylist) {
        mutableStateOf(if (initialPlaylist != null) UserPlaylistsRepository.isCustomListMap[initialPlaylist.id] == true else false)
    }
    var inputPlaylistUrl by remember(initialPlaylist) { mutableStateOf(initialPlaylist?.playlistId ?: "") }
    var videoItems by remember(initialPlaylist) {
        mutableStateOf(
            if (initialPlaylist != null) {
                UserPlaylistsRepository.customVideosMap[initialPlaylist.id].orEmpty().ifEmpty { listOf(CustomVideoItem()) }
            } else listOf(CustomVideoItem())
        )
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            shape = RoundedCornerShape(24.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .widthIn(max = 500.dp)
                .heightIn(max = 660.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = if (initialPlaylist == null) "Nueva Playlist o Colección" else "Editar Playlist / Colección",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary
                )

                // Modo Selector: Playlist Oficial de YouTube vs Colección de Videos
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(theme.surfaceAccent)
                        .padding(4.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Sticker3dButton(
                        onClick = { isCustomList = false },
                        modifier = Modifier.weight(1f).height(38.dp),
                        containerColor = if (!isCustomList) theme.accent else Color.Transparent,
                        bottomBevelColor = if (!isCustomList) theme.accentBevel else Color.Transparent,
                        strokeColor = if (!isCustomList) theme.strokeBorder else Color.Transparent,
                        bevelHeight = if (!isCustomList) 2.dp else 0.dp,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text("Playlist Oficial YT", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = if (!isCustomList) Color.White else theme.textSecondary)
                    }

                    Sticker3dButton(
                        onClick = { isCustomList = true },
                        modifier = Modifier.weight(1f).height(38.dp),
                        containerColor = if (isCustomList) theme.accent else Color.Transparent,
                        bottomBevelColor = if (isCustomList) theme.accentBevel else Color.Transparent,
                        strokeColor = if (isCustomList) theme.strokeBorder else Color.Transparent,
                        bevelHeight = if (isCustomList) 2.dp else 0.dp,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text("Colección Personalizada", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = if (isCustomList) Color.White else theme.textSecondary)
                    }
                }

                OutlinedTextField(
                    value = inputTitle,
                    onValueChange = { inputTitle = it },
                    label = { Text("Título de la Playlist / Colección") },
                    placeholder = { Text("Ej: Álgebra y Geometría Pre-U") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                OutlinedTextField(
                    value = inputSubject,
                    onValueChange = { inputSubject = it },
                    label = { Text("Materia") },
                    placeholder = { Text("Física, Química, Álgebra...") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                OutlinedTextField(
                    value = inputDescription,
                    onValueChange = { inputDescription = it },
                    label = { Text("Descripción (opcional)") },
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 2
                )

                if (!isCustomList) {
                    // Modo Playlist Oficial de YouTube
                    OutlinedTextField(
                        value = inputPlaylistUrl,
                        onValueChange = { inputPlaylistUrl = it },
                        label = { Text("Enlace o ID de Playlist de YouTube") },
                        placeholder = { Text("https://www.youtube.com/playlist?list=PL...") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                } else {
                    // Modo Colección de Videos Personalizados
                    Text(
                        text = "Videos de la Colección (${videoItems.size}):",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )

                    videoItems.forEachIndexed { index, video ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp))
                                .background(theme.surfaceAccent)
                                .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(14.dp))
                                .padding(12.dp)
                        ) {
                            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Video #${index + 1}",
                                        fontSize = 11.5.sp,
                                        fontWeight = FontWeight.Black,
                                        color = theme.accentText
                                    )
                                    if (videoItems.size > 1) {
                                        IconButton(
                                            onClick = {
                                                videoItems = videoItems.toMutableList().apply { removeAt(index) }
                                            },
                                            modifier = Modifier.size(24.dp)
                                        ) {
                                            Icon(Icons.Rounded.Delete, contentDescription = "Eliminar video", tint = Color(0xFFEF4444), modifier = Modifier.size(16.dp))
                                        }
                                    }
                                }

                                OutlinedTextField(
                                    value = video.title,
                                    onValueChange = { newTitle ->
                                        videoItems = videoItems.toMutableList().apply {
                                            this[index] = this[index].copy(title = newTitle)
                                        }
                                    },
                                    label = { Text("Título del video (opcional)") },
                                    placeholder = { Text("Ej: Clase 1: Vectores") },
                                    singleLine = true,
                                    modifier = Modifier.fillMaxWidth()
                                )

                                OutlinedTextField(
                                    value = video.urlOrId,
                                    onValueChange = { newUrl ->
                                        videoItems = videoItems.toMutableList().apply {
                                            this[index] = this[index].copy(urlOrId = newUrl)
                                        }
                                    },
                                    label = { Text("Enlace o ID de YouTube") },
                                    placeholder = { Text("https://youtu.be/xxx") },
                                    singleLine = true,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    }

                    Sticker3dButton(
                        onClick = {
                            videoItems = videoItems + CustomVideoItem()
                        },
                        modifier = Modifier.fillMaxWidth().height(42.dp),
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Icon(Icons.Rounded.Add, contentDescription = null, tint = theme.accentText, modifier = Modifier.size(16.dp))
                            Text("Agregar otro video", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                        }
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                    }
                    Spacer(Modifier.width(10.dp))

                    val canSave = if (!isCustomList) inputPlaylistUrl.isNotBlank() else videoItems.any { it.urlOrId.isNotBlank() }
                    Sticker3dButton(
                        onClick = {
                            if (canSave) {
                                DuolingoHaptics.playAnswerCorrect(context)
                                UserPlaylistsRepository.saveUserPlaylist(
                                    context = context,
                                    existingId = initialPlaylist?.id,
                                    title = inputTitle,
                                    urlOrId = if (!isCustomList) inputPlaylistUrl else videoItems.firstOrNull { it.urlOrId.isNotBlank() }?.urlOrId.orEmpty(),
                                    subject = inputSubject,
                                    description = inputDescription,
                                    isCustomList = isCustomList,
                                    videos = videoItems.filter { it.urlOrId.isNotBlank() }
                                )
                                onDismiss()
                            }
                        },
                        enabled = canSave,
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder,
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 9.dp)
                    ) {
                        Text("Guardar Cambios", color = theme.onAccent, fontWeight = FontWeight.Black, fontSize = 13.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun CursosScreen(
    onOpenCourseDetail: (String) -> Unit = {},
    onOpenPeriodicTable: () -> Unit = {},
    onOpenVocationalTest: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var accountUid by remember { mutableStateOf(FirebaseAuth.getInstance().currentUser?.uid) }
    var sharingBusy by remember { mutableStateOf<String?>(null) }
    var actionMessage by remember { mutableStateOf<String?>(null) }
    val community by SharedPlaylistsRepository.community.collectAsState()
    val sharedIds by SharedPlaylistsRepository.sharedIds.collectAsState()
    val loadedLimit by SharedPlaylistsRepository.loadedLimit.collectAsState()
    val communityMessage by SharedPlaylistsRepository.message.collectAsState()
    DisposableEffect(Unit) {
        val auth = FirebaseAuth.getInstance()
        val listener = FirebaseAuth.AuthStateListener { accountUid = it.currentUser?.uid }
        auth.addAuthStateListener(listener)
        onDispose { auth.removeAuthStateListener(listener); SharedPlaylistsRepository.stop(); UserPlaylistsRepository.stopSync() }
    }

    val theme = ThemeManager.currentTheme
    var selectedTabIndex by remember { mutableIntStateOf(1) }
    val tabs = listOf("Mías", "Comunidad", "Compartidas")

    var selectedSubjectFilter by remember { mutableStateOf("Todas") }
    val subjects = listOf("Todas", "Física", "Química", "Biología", "Álgebra", "Historia")

    var activePlayingPlaylist by remember { mutableStateOf<CoursePlaylist?>(null) }
    var showCreatePlaylistDialog by remember { mutableStateOf(false) }
    var playlistToEdit by remember { mutableStateOf<CoursePlaylist?>(null) }
    var playlistToDelete by remember { mutableStateOf<CoursePlaylist?>(null) }

    LaunchedEffect(accountUid) {
        activePlayingPlaylist = null
        playlistToEdit = null
        playlistToDelete = null
        UserPlaylistsRepository.init(context)
        SharedPlaylistsRepository.start(accountUid)
    }

    val currentCategory = tabs[selectedTabIndex]
    val byCategory = when (currentCategory) {
        "Mías" -> UserPlaylistsRepository.playlists.toList()
        "Compartidas" -> UserPlaylistsRepository.playlists.filter { it.id in sharedIds }
        else -> community.map { row ->
            // Namespaced public IDs prevent collisions between different users' lists.
            row.playlist.copy(id = if (row.ownerUid == accountUid) row.playlist.id else "${row.ownerUid}:${row.playlist.id}")
        }
    }
    val displayedPlaylists = byCategory.filter {
        selectedSubjectFilter == "Todas" || it.subject.equals(selectedSubjectFilter, ignoreCase = true)
    }
    fun openPlaylist(playlist: CoursePlaylist) {
        if (currentCategory == "Comunidad") {
            val row = community.firstOrNull { (if (it.ownerUid == accountUid) it.playlist.id else "${it.ownerUid}:${it.playlist.id}") == playlist.id }
            if (row != null && row.custom) {
                UserPlaylistsRepository.customVideosMap[playlist.id] = row.videos
                UserPlaylistsRepository.isCustomListMap[playlist.id] = true
            }
        }
        activePlayingPlaylist = playlist
    }

    // Modal de Reproducción YouTube Seguro
    activePlayingPlaylist?.let { playlist ->
        var fetchedVideos by remember(playlist.id) {
            mutableStateOf(if (UserPlaylistsRepository.isCustomListMap[playlist.id] == true) UserPlaylistsRepository.customVideosMap[playlist.id].orEmpty() else emptyList())
        }
        var isLoadingFeed by remember(playlist.id) {
            mutableStateOf(fetchedVideos.isEmpty())
        }

        LaunchedEffect(playlist.id) {
            if (fetchedVideos.isEmpty()) {
                isLoadingFeed = true
                val items = UserPlaylistsRepository.fetchYouTubePlaylistVideos(playlist.playlistId)
                if (items.isNotEmpty()) {
                    fetchedVideos = items
                    UserPlaylistsRepository.customVideosMap[playlist.id] = items
                }
                isLoadingFeed = false
            }
        }

        val realTitles = remember(playlist.id) { mutableStateMapOf<String,String>() }
        LaunchedEffect(playlist.id, fetchedVideos.map { it.urlOrId }) {
            com.jonsuapps.rastro.android.data.YouTubeVideoTitles.resolve(fetchedVideos) { id, title -> realTitles[id] = title }
        }
        var videoSearch by remember(playlist.id) { mutableStateOf("") }
        val effectiveVideos = fetchedVideos.map { video ->
            val id = UserPlaylistsRepository.extractPlaylistId(video.urlOrId)
            video.copy(title = realTitles[id] ?: video.title)
        }
        var queueFailed by remember(playlist.id) { mutableStateOf(false) }
        var selectedVideoId by remember(playlist.id) { mutableStateOf<String?>(null) }
        val playlistId = UserPlaylistsRepository.extractPlaylistId(playlist.playlistId)
        val isYouTubePlaylist = playlistId.startsWith("PL") || playlistId.startsWith("UU") ||
            playlistId.startsWith("LL") || playlistId.startsWith("RD") || playlistId.startsWith("OLAK")
        var playerFullscreen by remember(playlist.id) { mutableStateOf(false) }
        var playerWasWide by remember(playlist.id) { mutableStateOf(false) }
        fun openInYouTube(urlOrId: String, isPlaylist: Boolean = false) {
            val id = UserPlaylistsRepository.extractPlaylistId(urlOrId)
            if (id.isBlank()) return
            val url = if (isPlaylist) {
                "https://www.youtube.com/playlist?list=$id"
            } else {
                "https://www.youtube.com/watch?v=$id"
            }
            com.jonsuapps.rastro.android.ui.components.openYouTube(context, url)
        }

        @Composable fun playerPane(modifier: Modifier) {
            Column(modifier.verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        YouTubePlaylistPlayer(if (isYouTubePlaylist) playlistId else "",
                            selectedVideoId ?: effectiveVideos.firstOrNull()?.let { UserPlaylistsRepository.extractPlaylistId(it.urlOrId) },
                            onVideos = { videos ->
                                if (fetchedVideos.isEmpty()) fetchedVideos = videos
                                queueFailed = false
                            }, onError = { queueFailed = true }, onFullscreenChanged = { playerFullscreen = it })
                        val playing = effectiveVideos.firstOrNull { UserPlaylistsRepository.extractPlaylistId(it.urlOrId) == selectedVideoId } ?: effectiveVideos.firstOrNull()
                        if (playing != null) Text(
                            playing.title.takeUnless { com.jonsuapps.rastro.android.data.YouTubeVideoTitles.missing(it) } ?: "Título no disponible",
                            fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = theme.textPrimary,
                            maxLines = 3, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis)
                        if (queueFailed && fetchedVideos.isEmpty()) Text(
                            "No pudimos obtener la lista. Puedes continuar en YouTube.", color = theme.textSecondary, fontSize = 11.sp)
                        if (effectiveVideos.isNotEmpty()) Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            val index = effectiveVideos.indexOfFirst { UserPlaylistsRepository.extractPlaylistId(it.urlOrId) == selectedVideoId }.coerceAtLeast(0)
                            TextButton(enabled = index > 0, onClick = {
                                selectedVideoId = UserPlaylistsRepository.extractPlaylistId(effectiveVideos[index-1].urlOrId)
                            }) { Text("Anterior", color = theme.accentText) }
                            Text("${index+1}/${effectiveVideos.size}", color = theme.textSecondary, fontSize = 12.sp)
                            TextButton(enabled = index < effectiveVideos.lastIndex, onClick = {
                                selectedVideoId = UserPlaylistsRepository.extractPlaylistId(effectiveVideos[index+1].urlOrId)
                            }) { Text("Siguiente", color = theme.accentText) }
                        }
                        if (isYouTubePlaylist) {
                            Sticker3dButton(
                                onClick = { openInYouTube(playlist.playlistId, isPlaylist = true) },
                                modifier = Modifier.fillMaxWidth().height(44.dp),
                                containerColor = Color(0xFFDC2626),
                                bottomBevelColor = Color(0xFF991B1B),
                                strokeColor = theme.strokeBorder,
                                shape = RastroShapes.Pill,
                                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                            ) {
                                Icon(Icons.Rounded.PlaylistPlay, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(7.dp))
                                Text("Abrir playlist en YouTube", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                            }
                        }

            }
        }
        @Composable fun videoPane(modifier: Modifier) {
            Column(modifier, verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        // Lista de Clases / Videos estilo Curso
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Videos (${effectiveVideos.size})",
                                fontSize = 12.5.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.textPrimary
                            )

                            if (isLoadingFeed) {
                                Text(
                                    text = "Cargando clases...",
                                    fontSize = 11.sp,
                                    color = theme.accentText,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        OutlinedTextField(value = videoSearch, onValueChange = { videoSearch = it },
                            modifier = Modifier.fillMaxWidth(), singleLine = true,
                            placeholder = { Text("Buscar tema o video", fontSize = 12.sp) },
                            leadingIcon = { Icon(Icons.Rounded.Search, null) }, shape = RoundedCornerShape(12.dp))
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(effectiveVideos.withIndex().filter { videoSearch.isBlank() || it.value.title.contains(videoSearch, ignoreCase = true) }, key = { "${it.value.id}_${it.index}" }) { indexedVideo ->
                                val video = indexedVideo.value
                                val cleanVideoId = UserPlaylistsRepository.extractPlaylistId(video.urlOrId)
                                val thumbUrl = "https://img.youtube.com/vi/$cleanVideoId/mqdefault.jpg"

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(14.dp))
                                        .background(if (selectedVideoId == cleanVideoId) theme.accent.copy(alpha = .15f) else theme.surfaceAccent)
                                        .clickable { selectedVideoId = cleanVideoId }
                                        .border(
                                            1.2.dp,
                                            theme.strokeBorder.copy(alpha = 0.25f),
                                            RoundedCornerShape(14.dp)
                                        )
                                        .padding(8.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    // Miniatura Thumbnail del video de YouTube (estilo YouTube/Curso)
                                    Box(
                                        modifier = Modifier
                                            .width(88.dp)
                                            .height(54.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .border(1.dp, theme.strokeBorder.copy(alpha = 0.3f), RoundedCornerShape(8.dp)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        CachedRemoteImage(
                                            url = thumbUrl,
                                            contentDescription = video.title,
                                            modifier = Modifier.fillMaxSize()
                                        )
                                        Box(
                                            modifier = Modifier
                                                .size(22.dp)
                                                .clip(CircleShape)
                                                .background(Color.Black.copy(alpha = 0.55f)),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Icon(
                                                imageVector = Icons.Rounded.PlayArrow,
                                                contentDescription = null,
                                                tint = Color.White,
                                                modifier = Modifier.size(14.dp)
                                            )
                                        }
                                    }

                                    Column(
                                        modifier = Modifier.weight(1f),
                                        verticalArrangement = Arrangement.spacedBy(2.dp)
                                    ) {
                                        Text(
                                            text = video.title.takeUnless { com.jonsuapps.rastro.android.data.YouTubeVideoTitles.missing(it) } ?: "Título no disponible",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textPrimary,
                                            maxLines = 3,
                                            lineHeight = 16.sp
                                        )

                                    }

                                    IconButton(onClick = { openInYouTube(video.urlOrId) }) {
                                        Icon(Icons.Rounded.OpenInNew, contentDescription = "Abrir video en YouTube", tint = theme.accentText, modifier = Modifier.size(18.dp))
                                    }
                                }
                            }
                        }

                        Text(
                            "Estos videos son públicos y pertenecen a sus creadores en YouTube. Rastro solo los organiza como referencias de estudio y no aloja ni controla ese contenido.",
                            color = theme.textSecondary,
                            fontSize = 10.sp,
                            lineHeight = 14.sp,
                            modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                        )            }
        }
        val currentPlayerPane by androidx.compose.runtime.rememberUpdatedState<@Composable (Modifier) -> Unit>({ playerPane(it) })
        val movablePlayer = remember(playlist.id) {
            androidx.compose.runtime.movableContentOf<Modifier> { modifier -> currentPlayerPane(modifier) }
        }
        Dialog(
            onDismissRequest = { activePlayingPlaylist = null },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxSize()
                    .appleGlass(cornerRadius = 0.dp, isDark = !theme.isLight, alpha = if (theme.isLight) 0.28f else 0.42f)
                    .windowInsetsPadding(WindowInsets.safeDrawing)
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                val widePlayer = if (playerFullscreen) playerWasWide else maxWidth >= 620.dp
                val playerPaneMaxHeight = (maxHeight * .6f).coerceAtLeast(200.dp)
                androidx.compose.runtime.SideEffect { if (!playerFullscreen) playerWasWide = widePlayer }
                Sticker3dCard(
                    modifier = Modifier
                        .widthIn(max = if (widePlayer) 1000.dp else 560.dp)
                        .fillMaxWidth()
                        .height((maxHeight * .94f).coerceAtMost(940.dp)),
                    shape = RoundedCornerShape(24.dp),
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 5.dp
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = playlist.title,
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Black,
                                    color = theme.textPrimary,
                                    maxLines = 1
                                )
                                Text(
                                    text = "${playlist.subject} • ${effectiveVideos.size} clases",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = theme.accentText,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                if (UserPlaylistsRepository.playlists.any { it.id == playlist.id }) {
                                    IconButton(
                                        onClick = {
                                            playlistToEdit = playlist
                                            activePlayingPlaylist = null
                                        },
                                        modifier = Modifier.size(32.dp)
                                    ) {
                                        Icon(Icons.Rounded.Edit, contentDescription = "Editar videos", tint = theme.accentText, modifier = Modifier.size(18.dp))
                                    }
                                }

                                IconButton(onClick = { activePlayingPlaylist = null }, modifier = Modifier.size(32.dp)) {
                                    Icon(
                                        imageVector = Icons.Rounded.Close,
                                        contentDescription = "Cerrar reproductor",
                                        tint = theme.textSecondary
                                    )
                                }
                            }
                        }


                        if (widePlayer) Row(Modifier.weight(1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            movablePlayer(Modifier.weight(1f).fillMaxHeight())
                            videoPane(Modifier.weight(1f).fillMaxHeight())
                        } else {
                            movablePlayer(Modifier.fillMaxWidth().heightIn(max = playerPaneMaxHeight))
                            videoPane(Modifier.weight(1f).fillMaxWidth())
                        }
                    }
                }
            }
        }
    }

    RastroAdaptiveViewport(modifier.rastroAcademicBackground(theme)) { layout ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(layout.columns),
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        item(span = { GridItemSpan(maxLineSpan) }) {
                RastroBoundedBlock {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Sticker3dButton(
                    onClick = onOpenVocationalTest,
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 8.dp)
                ) {
                    Text("Test Vocacional", maxLines = 1, fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.onAccent)
                }
                Sticker3dButton(
                    onClick = onOpenPeriodicTable,
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 8.dp)
                ) {
                    Icon(Icons.Outlined.Calculate, contentDescription = null, modifier = Modifier.size(16.dp), tint = theme.onAccent)
                    Spacer(Modifier.width(6.dp))
                    Text("Tabla Periódica", maxLines = 1, fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.onAccent)
                }
            }

                }
            }

        // Pestañas privadas / comunidad / propias compartidas
        item(span = { GridItemSpan(maxLineSpan) }) {
                RastroBoundedBlock {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                tabs.forEachIndexed { index, title ->
                    val active = selectedTabIndex == index
                    Sticker3dButton(
                        onClick = { selectedTabIndex = index; actionMessage = null },
                        modifier = Modifier.weight(1f).heightIn(min = 48.dp).semantics { selected = active },
                        containerColor = if (active) theme.accent else theme.surface,
                        bottomBevelColor = if (active) theme.accentBevel else theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        contentPadding = PaddingValues(horizontal = 3.dp, vertical = 10.dp)
                    ) { Text(title, fontSize = 12.sp, fontWeight = FontWeight.Bold,
                        color = if (active) theme.onAccent else theme.textPrimary, maxLines = 1) }
                }
            }

                }
            }

        item(span = { GridItemSpan(maxLineSpan) }) {
            RastroBoundedBlock {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text(when (currentCategory) {
                        "Mías" -> "Tus listas privadas y compartidas. Tú eliges cuáles publicar."
                        "Compartidas" -> "Tus playlists publicadas. Retíralas de Comunidad cuando quieras."
                        else -> "Playlists que los usuarios han elegido compartir."
                    }, color = theme.textSecondary, fontSize = 12.sp)
                    (actionMessage ?: UserPlaylistsRepository.syncError.value ?: communityMessage)?.let {
                        Text(it, color = theme.textSecondary, fontSize = 12.sp)
                        if (communityMessage != null) TextButton(onClick = { SharedPlaylistsRepository.start(accountUid) }) {
                            Text("Reintentar", color = theme.accentText)
                        }
                        if (UserPlaylistsRepository.syncError.value != null) TextButton(onClick = { UserPlaylistsRepository.init(context) }) {
                            Text("Sincronizar de nuevo", color = theme.accentText)
                        }
                    }
                    if (currentCategory == "Mías" && UserPlaylistsRepository.hasMore.value) {
                        TextButton(onClick = { UserPlaylistsRepository.loadMore() }) { Text("Cargar más playlists", color = theme.accentText) }
                    }
                    if ((currentCategory == "Comunidad" && community.size.toLong() >= loadedLimit) ||
                        (currentCategory == "Compartidas" && sharedIds.size.toLong() >= loadedLimit)) {
                        TextButton(onClick = { SharedPlaylistsRepository.loadMore() }) {
                            Text("Cargar más playlists", color = theme.accentText)
                        }
                    }
                }
            }
        }

        // Filtro por materias
        item(span = { GridItemSpan(maxLineSpan) }) {
                RastroBoundedBlock {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(subjects) { subj ->
                    val isSelected = subj == selectedSubjectFilter
                    Sticker3dPill(
                        text = subj,
                        isSelected = isSelected,
                        onClick = { selectedSubjectFilter = subj },
                        selectedBgColor = theme.accent,
                        unselectedBgColor = theme.surface,
                        unselectedContentColor = theme.textSecondary,
                        strokeColor = theme.strokeBorder,
                        selectedBevel = theme.accentBevel,
                        unselectedBevel = theme.cardBevel,
                        bevelHeight = 2.dp
                    )
                }
            }

                }
            }

        // Si estamos en la pestaña "Mías", mostramos la opción de Crear Playlist de YouTube
        if (currentCategory == "Mías") {
            item(span = { GridItemSpan(maxLineSpan) }) {
                RastroBoundedBlock {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Mis Playlists de YouTube",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Agrega tus listas favoritas de YouTube",
                            style = MaterialTheme.typography.bodySmall,
                            color = theme.textSecondary
                        )
                    }
                    Button(
                        onClick = { showCreatePlaylistDialog = true },
                        colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = theme.accent),
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                    ) {
                        Icon(Icons.Rounded.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("Crear Playlist", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }

                }
            }
        }

        // Listado de Playlists
        if (displayedPlaylists.isEmpty()) {
            item(span = { GridItemSpan(maxLineSpan) }) {
                RastroBoundedBlock {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Rounded.VideoLibrary,
                            contentDescription = null,
                            tint = theme.textSecondary.copy(alpha = 0.5f),
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = if (currentCategory == "Mías") "Aún no has agregado ninguna playlist de YouTube" else if (currentCategory == "Compartidas") "Todavía no compartiste ninguna playlist" else "Aún no hay playlists compartidas para esta materia",
                            style = MaterialTheme.typography.bodyMedium,
                            color = theme.textSecondary
                        )
                        if (currentCategory == "Mías") {
                            Spacer(modifier = Modifier.height(12.dp))
                            Button(
                                onClick = { showCreatePlaylistDialog = true },
                                colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = theme.accent),
                                shape = RastroShapes.Pill
                            ) {
                                Icon(Icons.Rounded.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text("Crear mi primera playlist")
                            }
                        }
                    }
                }

                }
            }
        } else {
            items(displayedPlaylists, key = { it.id }) { playlist ->
                CoursePlaylistCard(
                    playlist = playlist,
                    theme = theme,
                    onPlay = { openPlaylist(playlist) },
                    onEdit = if (UserPlaylistsRepository.playlists.any { it.id == playlist.id }) {
                        { playlistToEdit = playlist }
                    } else null,
                    onDelete = if (UserPlaylistsRepository.playlists.any { it.id == playlist.id }) {
                        { playlistToDelete = playlist }
                    } else null,
                    isShared = playlist.id in sharedIds,
                    sharingBusy = sharingBusy != null,
                    onShare = if (UserPlaylistsRepository.playlists.any { it.id == playlist.id }) {
                        {
                            sharingBusy = playlist.id
                            scope.launch {
                                val publish = playlist.id !in sharedIds
                                runCatching { SharedPlaylistsRepository.setShared(playlist, publish) }
                                    .onSuccess { actionMessage = if (publish) "Playlist compartida con Comunidad." else "La playlist ya no se comparte." }
                                    .onFailure { actionMessage = if (it is IllegalArgumentException) it.message else "No se pudo cambiar la publicación. Revisa la conexión y vuelve a intentarlo." }
                                sharingBusy = null
                            }
                        }
                    } else null
                )
            }
        }

            item(span = { GridItemSpan(maxLineSpan) }) {
                RastroBoundedBlock { com.jonsuapps.rastro.android.ui.components.MainPageEnd()
                }
            }
        }
    }

    // Modal para Crear o Editar Playlist / Colección
    if (showCreatePlaylistDialog || playlistToEdit != null) {
        CreateOrEditPlaylistDialog(
            initialPlaylist = playlistToEdit,
            theme = theme,
            onDismiss = {
                showCreatePlaylistDialog = false
                playlistToEdit = null
            }
        )
    }

    // Modal de Confirmación para Eliminar Playlist con diseño Sticker 3D
    playlistToDelete?.let { playlist ->
        com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
            onDismissRequest = { playlistToDelete = null },
            title = "¿Eliminar Playlist?",
            message = "¿Estás seguro de que deseas eliminar \"${playlist.title}\"? Esta acción no se puede deshacer.",
            confirmText = "Eliminar",
            cancelText = "Cancelar",
            isDestructive = true,
            icon = Icons.Rounded.Close,
            onConfirm = {
                scope.launch {
                    runCatching {
                        if (playlist.id in sharedIds) SharedPlaylistsRepository.setShared(playlist, false)
                        UserPlaylistsRepository.deletePlaylist(context, playlist.id)
                        playlistToDelete = null
                    }.onFailure { actionMessage = "No se pudo retirar la lista de Comunidad; no se ha eliminado." }
                }
            },
            theme = theme
        )
    }
}
