@file:OptIn(androidx.compose.foundation.layout.ExperimentalLayoutApi::class)

package com.jonsuapps.rastro.android.ui.screens

import android.content.Intent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.collectAsState
import com.jonsuapps.rastro.auth.UserManager
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.ui.res.painterResource
import com.jonsuapps.rastro.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.data.LiteraturaRepository
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.android.data.OfficialMaterialRepository
import com.jonsuapps.rastro.android.data.OfficialMaterialResource
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.android.ui.components.UploadMaterialDialog
import com.jonsuapps.rastro.android.ui.components.appleGlass
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.android.ui.components.SkeletonCourseCard
import com.jonsuapps.rastro.android.ui.components.SkeletonPostCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dPill
import com.jonsuapps.rastro.android.ui.components.CartoonAvatar
import com.jonsuapps.rastro.android.ui.components.Sticker3dReactionPill
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.EditUploadDialog
import com.jonsuapps.rastro.android.ui.components.LucideBookmarkIcon
import com.jonsuapps.rastro.android.ui.components.LucideChatIcon
import com.jonsuapps.rastro.android.ui.components.LucideShareIcon
import com.jonsuapps.rastro.android.ui.components.LucideStarIcon
import com.jonsuapps.rastro.android.ui.components.LucideTrashIcon
import com.jonsuapps.rastro.android.ui.components.ReportPostDialog
import com.jonsuapps.rastro.android.ui.components.RastroStickerDialog
import com.jonsuapps.rastro.android.data.UserProfileRepository
import com.jonsuapps.rastro.android.data.FavoritesRepository
import com.jonsuapps.rastro.android.data.FavoriteType
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.auth.AdminConfig

@Composable
fun BibliotecaScreen(
    modifier: Modifier = Modifier,
    onNavigateToAuth: () -> Unit = {},
    onNavigateToProfile: (String) -> Unit = {}
) {
    val theme = ThemeManager.currentTheme
    val uriHandler = LocalUriHandler.current
    var communityUploads by remember { mutableStateOf(emptyList<UserUpload>()) }
    var selectedTab by remember { mutableIntStateOf(0) }
    var isUploadDialogOpen by remember { mutableStateOf(false) }
    var showAllPreviews by remember { mutableStateOf(true) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedCategoryFilter by remember { mutableStateOf("Todas") }
    val categories = listOf("Todas", "Literatura Peruana", "Literatura Universal")

    var selectedObraForModal by remember { mutableStateOf<ObraLiteraria?>(null) }
    val savedObraIds by UserManager.savedObraIds.collectAsState()
    var officialMaterials by remember { mutableStateOf(emptyList<OfficialMaterialResource>()) }
    val displayedOfficialMaterials = remember(officialMaterials, searchQuery) {
        officialMaterials.filter { item ->
            searchQuery.isBlank() || listOf(item.title, item.description, item.type)
                .any { it.contains(searchQuery.trim(), ignoreCase = true) }
        }
    }

    var bookEdits by remember { mutableStateOf<Map<String, Map<String, Any>>>(emptyMap()) }
    DisposableEffect(Unit) {
        val listener = com.google.firebase.firestore.FirebaseFirestore.getInstance().collection("libros")
            .addSnapshotListener { snap, _ -> if (snap != null) bookEdits = snap.documents.associate { it.id to it.data.orEmpty() } }
        onDispose { listener.remove() }
    }
    val displayedObras = remember(selectedCategoryFilter, searchQuery, bookEdits) {
        LiteraturaRepository.getByCategoria(selectedCategoryFilter).map { original ->
            val edit = bookEdits[original.id].orEmpty()
            original.copy(titulo = edit["titulo"] as? String ?: original.titulo,
                autor = edit["autor"] as? String ?: original.autor,
                sinopsis = edit["sinopsis"] as? String ?: original.sinopsis,
                contextoHistorico = edit["contextoHistorico"] as? String ?: original.contextoHistorico,
                coverUrl = edit["coverUrl"] as? String ?: original.coverUrl)
        }.filter { obra ->
            searchQuery.isBlank() || listOf(obra.titulo, obra.autor, obra.categoria, obra.corriente)
                .any { it.contains(searchQuery.trim(), ignoreCase = true) }
        }
    }
    val displayedUploads = remember(communityUploads, searchQuery) {
        communityUploads.filter { upload ->
            searchQuery.isBlank() || listOf(upload.title, upload.author, upload.category, upload.description)
                .any { it.contains(searchQuery.trim(), ignoreCase = true) }
        }
    }

    var isLoadingCommunity by remember { mutableStateOf(true) }
    var isLoadingOfficial by remember { mutableStateOf(true) }

    DisposableEffect(Unit) {
        val listener = UserUploadRepository.observeCommunity {
            communityUploads = it
            isLoadingCommunity = false
        }
        onDispose { listener.remove() }
    }
    DisposableEffect(Unit) {
        val listener = OfficialMaterialRepository.observe {
            officialMaterials = it
            isLoadingOfficial = false
        }
        onDispose { listener.remove() }
    }

    // Modal Visor Detallado de la Obra (LiteraturaViewerModal)
    selectedObraForModal?.let { obra ->
        LiteraturaViewerDialog(
            obra = displayedObras.firstOrNull { it.id == obra.id } ?: obra,
            theme = theme,
            onDismiss = { selectedObraForModal = null }
        )
    }
    UploadMaterialDialog(
        isOpen = isUploadDialogOpen,
        onClose = { isUploadDialogOpen = false },
        onRequestSignIn = onNavigateToAuth
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 760.dp),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        // Cabecera de la Biblioteca
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(RastroShapes.Pill)
                            .background(theme.accent.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.AutoStories,
                            contentDescription = null,
                            tint = theme.accent,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Column {
                        Text(
                            text = "Biblioteca Digital de Recursos",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Tomos oficiales, aportes de la comunidad y obras literarias.",
                            style = MaterialTheme.typography.bodySmall,
                            color = theme.textSecondary,
                            lineHeight = 16.sp
                        )
                    }
                }
            }
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(theme.surface)
                    .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(20.dp))
                    .padding(6.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                listOf(
                    "Material Oficial" to displayedOfficialMaterials.size,
                    "Aportes" to displayedUploads.size,
                    "Obras" to displayedObras.size
                ).forEachIndexed { index, (label, count) ->
                    val isSelected = selectedTab == index
                    Sticker3dPill(
                        selected = isSelected,
                        onClick = { selectedTab = index },
                        modifier = Modifier.weight(1f),
                        selectedColor = theme.accent,
                        unselectedColor = Color.Transparent,
                        selectedBevel = theme.accentBevel,
                        unselectedBevel = Color.Transparent,
                        strokeColor = if (isSelected) theme.strokeBorder else Color.Transparent,
                        strokeWidth = if (isSelected) 1.5.dp else 0.dp,
                        bevelHeight = if (isSelected) 2.5.dp else 0.dp
                    ) {
                        Text(
                            text = "$label\n($count)",
                            maxLines = 2,
                            textAlign = TextAlign.Center,
                            lineHeight = 13.sp,
                            fontSize = 11.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            color = if (isSelected) Color.White else theme.textSecondary
                        )
                    }
                }
            }
        }

        item {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                placeholder = { Text("Buscar tomo, aporte, libro o tema") },
                leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null, tint = theme.accent) },
                trailingIcon = if (searchQuery.isNotBlank()) ({
                    IconButton(onClick = { searchQuery = "" }) { Icon(Icons.Rounded.Close, contentDescription = "Limpiar búsqueda") }
                }) else null,
                shape = RastroShapes.Pill,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = theme.accent,
                    unfocusedBorderColor = theme.strokeBorder,
                    focusedContainerColor = theme.surface,
                    unfocusedContainerColor = theme.surface
                )
            )
        }

        if (selectedTab == 0) item {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text("Material Oficial CEPRE / UNSA", style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold, color = theme.textPrimary)
                if (isLoadingOfficial && displayedOfficialMaterials.isEmpty()) {
                    repeat(3) {
                        SkeletonCourseCard(theme = theme)
                    }
                } else if (displayedOfficialMaterials.isEmpty()) {
                    Card(colors = CardDefaults.cardColors(containerColor = theme.surface),
                        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)) {
                        Text(if (searchQuery.isBlank()) "No hay material oficial disponible." else "No se encontraron materiales.",
                            modifier = Modifier.padding(16.dp), color = theme.textSecondary)
                    }
                } else {
                    displayedOfficialMaterials.forEach { item -> OfficialMaterialCard(item, theme) }
                }
            }
        }

        if (selectedTab == 1) item {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = theme.surface,
                    strokeColor = theme.strokeBorder,
                    bevelColor = theme.cardBevel,
                    bevelHeight = 4.dp,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(Modifier.fillMaxWidth().padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text("Muro y aportes de la comunidad", style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Black, color = theme.textPrimary)
                        Text("Publicaciones y materiales compartidos por estudiantes y docentes.",
                            style = MaterialTheme.typography.bodySmall, color = theme.textSecondary)
                        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Mostrar vistas previas", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                            Switch(checked = showAllPreviews, onCheckedChange = { showAllPreviews = it })
                        }
                        Sticker3dButton(
                            onClick = { isUploadDialogOpen = true },
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder,
                            shape = RastroShapes.Pill,
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 9.dp)
                        ) {
                            Icon(Icons.Rounded.CloudUpload, contentDescription = null, tint = Color.White)
                            Spacer(Modifier.width(8.dp))
                            Text("Aportar material", fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }
                }
                CommunityWallComposer(onNavigateToAuth = onNavigateToAuth)
                if (isLoadingCommunity && displayedUploads.isEmpty()) {
                    repeat(2) {
                        SkeletonPostCard(theme = theme)
                    }
                } else if (displayedUploads.isEmpty()) {
                    Card(colors = CardDefaults.cardColors(containerColor = theme.surface),
                        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)) {
                        Text(if (searchQuery.isBlank()) "Los aportes publicados aparecerán aquí." else "No se encontraron aportes.", modifier = Modifier.padding(16.dp),
                            color = theme.textSecondary, style = MaterialTheme.typography.bodyMedium)
                    }
                } else {
                    displayedUploads.forEach { upload ->
                        CommunityUploadCard(
                            upload = upload,
                            theme = theme,
                            defaultPreviewOpen = showAllPreviews,
                            onNavigateToProfile = onNavigateToProfile,
                            onRequestSignIn = onNavigateToAuth
                        )
                    }
                }
            }
        }

        // Filtro por Categoría
        if (selectedTab == 2) item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(categories) { cat ->
                    val isSelected = cat == selectedCategoryFilter
                    FilterChip(
                        selected = isSelected,
                        onClick = { selectedCategoryFilter = cat },
                        label = { Text(text = cat, style = MaterialTheme.typography.labelSmall) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = theme.accent,
                            selectedLabelColor = theme.surface,
                            containerColor = theme.surface,
                            labelColor = theme.textSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            borderColor = if (isSelected) theme.accent else theme.borderSubtle,
                            selectedBorderColor = theme.accent,
                            enabled = true,
                            selected = isSelected
                        ),
                        shape = RastroShapes.Pill
                    )
                }
            }
        }

        // Listado de Obras
        if (selectedTab == 2) items(displayedObras, key = { it.id }) { obra ->
            val isFav = savedObraIds.contains(obra.id)
            ObraLiterariaCard(
                obra = obra,
                isFavorito = isFav,
                theme = theme,
                onToggleFavorito = {
                    UserManager.toggleSaveObra(obra.id)
                },
                onClick = { selectedObraForModal = obra }
            )
        }
    }
}
}

@Composable
private fun OfficialMaterialCard(item: OfficialMaterialResource, theme: com.jonsuapps.rastro.theme.RastroPalette) {
    val uriHandler = LocalUriHandler.current
    var showPreview by remember(item.id) { mutableStateOf(false) }
    val uploadForPreview = remember(item) {
        UserUpload(
            id = item.id,
            title = item.title,
            author = "CEPRE / UNSA",
            category = item.type,
            description = item.description,
            url = item.url,
            createdAtMillis = 0L,
            isPdf = item.isPdf,
            isFolder = item.isFolder
        )
    }
    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        containerColor = theme.surface,
        strokeColor = theme.strokeBorder,
        bevelColor = theme.cardBevel,
        bevelHeight = 4.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(Modifier.size(38.dp).clip(RoundedCornerShape(12.dp)).background(theme.accent.copy(alpha = 0.15f)).border(1.2.dp, theme.strokeBorder.copy(alpha = 0.4f), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center) {
                    Icon(if (item.isFolder) Icons.Rounded.FolderOpen else Icons.Rounded.Description,
                        contentDescription = null, tint = theme.accent)
                }
                Spacer(Modifier.width(10.dp))
                Column(Modifier.weight(1f)) {
                    Text("MATERIAL OFICIAL CEPRE / UNSA", style = MaterialTheme.typography.labelSmall,
                        color = theme.accent, fontWeight = FontWeight.Bold)
                    Text(item.title, style = MaterialTheme.typography.titleSmall,
                        color = theme.textPrimary, fontWeight = FontWeight.Bold)
                }

                // Botón de Favorito Animado (Lucide Animated)
                val context = LocalContext.current
                val allFavorites by FavoritesRepository.favoritesFlow.collectAsState()
                val isFav = allFavorites.any { it.itemId == item.id && it.type == FavoriteType.MATERIAL }

                LucideStarIcon(
                    isStarred = isFav,
                    onClick = {
                        DuolingoHaptics.playOptionSelected(context)
                        FavoritesRepository.toggle(
                            type = FavoriteType.MATERIAL,
                            itemId = item.id,
                            title = item.title,
                            subtitle = item.description,
                            subject = item.type,
                            area = "General",
                            extra = item.url
                        )
                    },
                    activeColor = Color(0xFFD97706),
                    inactiveColor = theme.textSecondary,
                    size = 20.dp
                )
            }
            Text(item.description, style = MaterialTheme.typography.bodySmall, color = theme.textSecondary)
            if (showPreview) UserUploadPreview(upload = uploadForPreview, theme = theme)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Sticker3dButton(
                    onClick = { runCatching { uriHandler.openUri(item.url) } },
                    modifier = Modifier.weight(1f),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill,
                    contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                ) {
                    Icon(Icons.Rounded.OpenInNew, contentDescription = null, modifier = Modifier.size(16.dp), tint = Color.White)
                    Spacer(Modifier.width(6.dp))
                    Text(if (item.isFolder) "Abrir en Drive" else "Abrir recurso", maxLines = 1, fontWeight = FontWeight.Bold, color = Color.White)
                }
                Sticker3dButton(
                    onClick = { showPreview = !showPreview },
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill,
                    contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                ) {
                    Icon(
                        imageVector = if (showPreview) Icons.Rounded.VisibilityOff else Icons.Rounded.Visibility,
                        contentDescription = if (showPreview) "Ocultar portada" else "Ver portada",
                        tint = theme.textPrimary,
                        modifier = Modifier.size(17.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun CommunityUploadCard(
    upload: UserUpload,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    defaultPreviewOpen: Boolean = true,
    onNavigateToProfile: ((String) -> Unit)? = null,
    onRequestSignIn: () -> Unit = {}
) {
    val user by UserManager.currentUser.collectAsState()
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
    var showComments by remember(upload.id) { mutableStateOf(false) }
    var comments by remember(upload.id) { mutableStateOf(emptyList<com.jonsuapps.rastro.android.data.UploadComment>()) }
    var commentText by remember(upload.id) { mutableStateOf("") }
    var localReactions by remember(upload.reactions) { mutableStateOf(upload.reactions) }
    var editingCommentId by remember(upload.id) { mutableStateOf<String?>(null) }
    var editingCommentText by remember(upload.id) { mutableStateOf("") }
    var confirmReport by remember(upload.id) { mutableStateOf(false) }
    var showEditDialog by remember(upload.id) { mutableStateOf(false) }
    var showDeleteConfirm by remember(upload.id) { mutableStateOf(false) }
    var isFollowingAuthor by remember(upload.ownerUid, user.uid) { mutableStateOf(false) }
    var localSavedState by remember(upload.id, upload.savedBy) { mutableStateOf(user.uid in upload.savedBy) }
    val isSaved = localSavedState
    val canInteract = user.isAuthenticated && !user.isAnonymous
    val isOwnUpload = user.uid == upload.ownerUid
    val canManageUpload = canInteract && (isOwnUpload || user.email?.lowercase() in setOf(
        "aguilar.jonsu@gmail.com", "rumbo.jonsu@gmail.com", "jhojan.aguilar.13.10@gmail.com",
        "rulua617@gmail.com", "147279812+rulua617@users.noreply.github.com"
    ))

    DisposableEffect(upload.id) {
        val listener = UserUploadRepository.observeComments(upload.id) { comments = it }
        onDispose { listener.remove() }
    }

    DisposableEffect(upload.ownerUid, user.uid) {
        if (canInteract && upload.ownerUid.isNotBlank() && !isOwnUpload) {
            val listener = UserProfileRepository.observeIsFollowing(user.uid, upload.ownerUid) {
                isFollowingAuthor = it
            }
            onDispose { listener?.remove() }
        } else {
            onDispose { }
        }
    }

    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        containerColor = theme.surface,
        strokeColor = theme.strokeBorder,
        bevelColor = theme.cardBevel,
        bevelHeight = 4.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            // 1. Cabecera: Foto y Nombre clickeables para ir al perfil + Botón Seguir
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .weight(1f)
                        .clickable(enabled = upload.ownerUid.isNotBlank()) {
                            onNavigateToProfile?.invoke(upload.ownerUid)
                        }
                ) {
                    CartoonAvatar(
                        photoUrl = upload.ownerPhotoUrl,
                        size = 40.dp,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.8.dp,
                        bevelColor = theme.cardBevel,
                        bevelOffset = 2.dp,
                        contentDescription = "Foto de ${upload.author}"
                    )
                    Spacer(Modifier.width(10.dp))
                    Column {
                        Text(
                            text = upload.author.ifBlank { "Estudiante RASTRO" },
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary
                        )
                        if (upload.category.isNotBlank()) {
                            Text(
                                text = upload.category,
                                color = theme.accent,
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (canInteract && !isOwnUpload && upload.ownerUid.isNotBlank()) {
                        Surface(
                            modifier = Modifier.bouncyClick(scaleDown = 0.94f) {
                                UserProfileRepository.toggleFollow(user.uid, upload.ownerUid, !isFollowingAuthor)
                            },
                            shape = RastroShapes.Pill,
                            color = if (isFollowingAuthor) theme.surfaceAccent else theme.accent,
                            border = if (isFollowingAuthor) androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle) else null
                        ) {
                            FlowRow(
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(
                                    imageVector = if (isFollowingAuthor) Icons.Rounded.Check else Icons.Rounded.Add,
                                    contentDescription = null,
                                    tint = if (isFollowingAuthor) theme.textSecondary else Color.White,
                                    modifier = Modifier.size(13.dp)
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = if (isFollowingAuthor) "Siguiendo" else "Seguir",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isFollowingAuthor) theme.textSecondary else Color.White
                                )
                            }
                        }
                        Spacer(Modifier.width(4.dp))
                    }

                    // Estrella / Pin Interactivo Animado (Lucide Star)
                    LucideStarIcon(
                        isStarred = upload.isFeatured || upload.isPinned,
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            if (canManageUpload) {
                                UserUploadRepository.togglePinned(upload.id, !upload.isPinned)
                            } else if (AdminConfig.isEffectiveAdmin(user.email)) {
                                UserUploadRepository.toggleFeatured(upload.id, !upload.isFeatured, user.uid)
                            }
                        },
                        activeColor = Color(0xFFF59E0B),
                        inactiveColor = theme.textSecondary,
                        size = 20.dp
                    )
                    Spacer(Modifier.width(4.dp))

                    // Menú desplegable de 3 Puntos (⋮) con opciones según rol (Imagen 2)
                    var showThreeDotsMenu by remember { mutableStateOf(false) }
                    Box {
                        IconButton(
                            onClick = { showThreeDotsMenu = true },
                            modifier = Modifier.size(32.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.MoreVert,
                                contentDescription = "Más opciones",
                                tint = theme.textSecondary,
                                modifier = Modifier.size(18.dp)
                            )
                        }

                        DropdownMenu(
                            expanded = showThreeDotsMenu,
                            onDismissRequest = { showThreeDotsMenu = false }
                        ) {
                            val isAdmin = AdminConfig.isEffectiveAdmin(user.email)

                            if (isOwnUpload) {
                                DropdownMenuItem(
                                    text = { Text("Editar", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Edit, contentDescription = null, tint = theme.accent) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        showEditDialog = true
                                    }
                                )
                                DropdownMenuItem(
                                    text = { Text(if (upload.isPinned) "Desfijar de perfil" else "Fijar en perfil", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.PushPin, contentDescription = null, tint = theme.accent) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        UserUploadRepository.togglePinned(upload.id, !upload.isPinned)
                                    }
                                )
                                DropdownMenuItem(
                                    text = { Text("Eliminar", color = Color(0xFFEF4444), fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Delete, contentDescription = null, tint = Color(0xFFEF4444)) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        showDeleteConfirm = true
                                    }
                                )
                            } else if (isAdmin) {
                                DropdownMenuItem(
                                    text = { Text("Editar", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Edit, contentDescription = null, tint = theme.accent) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        showEditDialog = true
                                    }
                                )
                                DropdownMenuItem(
                                    text = { Text(if (upload.isFeatured) "Quitar destacado" else "Destacar", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Star, contentDescription = null, tint = Color(0xFFF59E0B)) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        UserUploadRepository.toggleFeatured(upload.id, !upload.isFeatured, user.uid)
                                    }
                                )
                                DropdownMenuItem(
                                    text = { Text(if (upload.isHidden) "Restaurar para todos" else "Ocultar para todos", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(if (upload.isHidden) Icons.Rounded.Visibility else Icons.Rounded.VisibilityOff, contentDescription = null) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        UserUploadRepository.setUploadHidden(upload.id, !upload.isHidden)
                                    }
                                )
                                DropdownMenuItem(
                                    text = { Text("Reportar", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Flag, contentDescription = null) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        confirmReport = true
                                    }
                                )
                                DropdownMenuItem(
                                    text = { Text("Eliminar", color = Color(0xFFEF4444), fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Delete, contentDescription = null, tint = Color(0xFFEF4444)) },
                                    onClick = {
                                        showThreeDotsMenu = false
                                        showDeleteConfirm = true
                                    }
                                )
                            } else {
                                DropdownMenuItem(
                                    text = { Text("Reportar", fontWeight = FontWeight.Bold) },
                                    leadingIcon = { Icon(Icons.Rounded.Flag, contentDescription = null) },
                                    enabled = canInteract && user.uid !in upload.reportedBy,
                                    onClick = {
                                        showThreeDotsMenu = false
                                        confirmReport = true
                                    }
                                )
                            }
                        }
                    }
                }
            }

            // 2. Título y descripción
            Text(upload.title, color = theme.textPrimary, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)
            if (upload.description.isNotBlank()) {
                Text(upload.description, color = theme.textSecondary, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp)
            }

            // 3. Vista previa
            if (defaultPreviewOpen) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(theme.surfaceAccent)
                        .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(16.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    UserUploadPreview(
                        upload = upload,
                        theme = theme,
                        modifier = Modifier.fillMaxWidth().height(210.dp)
                    )
                }
            }

            // 4. Botón principal: ABRIR RECURSO (manda a Google Drive / URL)
            if (upload.url.isNotBlank()) {
                Sticker3dButton(
                    onClick = { runCatching { uriHandler.openUri(upload.url) } },
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill,
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 11.dp)
                ) {
                    Icon(Icons.Rounded.OpenInNew, contentDescription = null, modifier = Modifier.size(18.dp), tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Abrir recurso", fontWeight = FontWeight.Bold, fontSize = 13.sp, color = Color.White)
                }
            }

            // 5. Barra de acciones secundarias: Comentar -> Guardar -> Compartir (Icono SVG sin texto, 100% Responsivo)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier.weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Sticker3dActionPill(
                        icon = Icons.Rounded.ChatBubbleOutline,
                        label = "Comentarios (${comments.size})",
                        isSelected = showComments,
                        theme = theme,
                        onClick = { showComments = !showComments }
                    )

                    Sticker3dActionPill(
                        icon = if (localSavedState) Icons.Rounded.BookmarkAdded else Icons.Rounded.BookmarkAdd,
                        label = if (localSavedState) "Guardado" else "Guardar",
                        isSelected = localSavedState,
                        enabled = canInteract,
                        theme = theme,
                        onClick = {
                            val nextSaved = !localSavedState
                            localSavedState = nextSaved
                            DuolingoHaptics.playOptionSelected(context)
                            UserUploadRepository.toggleSaved(upload.id, user.uid, nextSaved)
                        }
                    )
                }

                // Botón Compartir NATIVO SVG Animado (Sin texto para evitar saltos de línea o deformación)
                Surface(
                    shape = CircleShape,
                    color = theme.surfaceAccent,
                    border = BorderStroke(1.2.dp, theme.strokeBorder.copy(alpha = 0.35f))
                ) {
                    LucideShareIcon(
                        onClick = {
                            val share = Intent(Intent.ACTION_SEND).apply {
                                type = "text/plain"
                                putExtra(Intent.EXTRA_TEXT, listOf(upload.title, upload.description, upload.url).filter(String::isNotBlank).joinToString("\n"))
                            }
                            context.startActivity(Intent.createChooser(share, "Compartir material"))
                        },
                        tint = theme.textPrimary,
                        size = 18.dp,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }

            if (!canInteract) {
                TextButton(onClick = onRequestSignIn) {
                    Icon(Icons.Rounded.Person, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(Modifier.width(5.dp))
                    Text("Inicia sesión para interactuar", fontSize = 12.sp)
                }
            }

            // 6. Reacciones Cartoon Vector SVG (Like 👍, Corazón ❤️, Fuego 🔥) - 0ms Respuesta Instantánea Optimista
            val reactionMeta = listOf(
                Triple("👍", null, Color(0xFF0284C7)),
                Triple("❤️", R.drawable.ic_reaction_heart, Color(0xFFEF4444)),
                Triple("🔥", R.drawable.ic_reaction_fire, Color(0xFFF97316))
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                reactionMeta.forEach { (emojiKey, iconRes, activeColor) ->
                    val currentUsers = localReactions[emojiKey].orEmpty()
                    val reacted = user.uid in currentUsers
                    val count = currentUsers.size
                    Sticker3dReactionPill(
                        iconResId = iconRes,
                        imageVector = if (iconRes == null) Icons.Rounded.ThumbUp else null,
                        count = count,
                        isReacted = reacted,
                        activeColor = activeColor,
                        theme = theme,
                        enabled = canInteract,
                        onClick = {
                            val updatedUsers = if (reacted) currentUsers - user.uid else currentUsers + user.uid
                            localReactions = localReactions + (emojiKey to updatedUsers)
                            DuolingoHaptics.playOptionSelected(context)
                            UserUploadRepository.toggleReaction(upload, emojiKey, user.uid, user.displayName)
                        }
                    )
                }
            }

            // Comentarios (Editar, Eliminar y Notificar al dueño)
            if (showComments) {
                HorizontalDivider(color = theme.borderSubtle)
                comments.forEach { comment ->
                    val isMyComment = comment.authorUid == user.uid || (comment.authorUid.isBlank() && comment.authorName == user.displayName)
                    val canManageComment = isMyComment || canManageUpload
                    if (editingCommentId == comment.id) {
                        Column(
                            Modifier.fillMaxWidth().padding(vertical = 4.dp)
                                .background(theme.surfaceAccent.copy(alpha = 0.5f), RoundedCornerShape(10.dp))
                                .padding(8.dp)
                        ) {
                            Text("Editando comentario:", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.accent)
                            Spacer(Modifier.height(4.dp))
                            OutlinedTextField(
                                value = editingCommentText,
                                onValueChange = { editingCommentText = it },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 3
                            )
                            Spacer(Modifier.height(6.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Sticker3dButton(
                                    onClick = {
                                        if (editingCommentText.isNotBlank()) {
                                            UserUploadRepository.editComment(comment.id, editingCommentText, upload, user.uid, user.displayName)
                                            editingCommentId = null
                                            DuolingoHaptics.playOptionSelected(context)
                                        }
                                    },
                                    containerColor = theme.accent,
                                    bottomBevelColor = theme.accentBevel,
                                    strokeColor = theme.strokeBorder,
                                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                                ) {
                                    Icon(Icons.Rounded.Check, contentDescription = null, tint = Color.White, modifier = Modifier.size(13.dp))
                                    Spacer(Modifier.width(4.dp))
                                    Text("Guardar", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                }
                                Sticker3dButton(
                                    onClick = { editingCommentId = null },
                                    containerColor = theme.surface,
                                    bottomBevelColor = theme.cardBevel,
                                    strokeColor = theme.strokeBorder,
                                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                                ) {
                                    Icon(Icons.Rounded.Close, contentDescription = null, tint = theme.textSecondary, modifier = Modifier.size(13.dp))
                                    Spacer(Modifier.width(4.dp))
                                    Text("Cancelar", color = theme.textSecondary, fontSize = 11.sp)
                                }
                            }
                        }
                    } else {
                        Row(
                            Modifier.fillMaxWidth().padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(Modifier.weight(1f).padding(end = 6.dp)) {
                                Text(comment.authorName, style = MaterialTheme.typography.labelSmall, color = theme.accent, fontWeight = FontWeight.Bold)
                                Text(comment.text, style = MaterialTheme.typography.bodySmall, color = theme.textPrimary)
                            }
                            if (canManageComment) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    if (isMyComment) {
                                        IconButton(
                                            onClick = {
                                                editingCommentId = comment.id
                                                editingCommentText = comment.text
                                            },
                                            modifier = Modifier.size(26.dp)
                                        ) {
                                            Icon(Icons.Rounded.Edit, contentDescription = "Editar", tint = theme.accent, modifier = Modifier.size(15.dp))
                                        }
                                    }
                                    IconButton(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            UserUploadRepository.deleteComment(comment.id, upload, user.uid, user.displayName)
                                        },
                                        modifier = Modifier.size(26.dp)
                                    ) {
                                        Icon(Icons.Rounded.DeleteOutline, contentDescription = "Eliminar", tint = Color(0xFFEF4444), modifier = Modifier.size(15.dp))
                                    }
                                }
                            }
                        }
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    OutlinedTextField(
                        value = commentText,
                        onValueChange = { commentText = it },
                        enabled = canInteract,
                        modifier = Modifier.weight(1f),
                        placeholder = { Text("Escribe un comentario", fontSize = 12.sp) },
                        singleLine = true
                    )
                    val canComment = canInteract && commentText.isNotBlank()
                    val commentBtnColor = if (canComment) Color.White else Color(0xFF475569)
                    Sticker3dButton(
                        enabled = canComment,
                        onClick = {
                            UserUploadRepository.addComment(upload, user.uid, user.displayName, commentText)
                            commentText = ""
                        },
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder,
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                    ) {
                        Icon(Icons.Rounded.Send, contentDescription = null, tint = commentBtnColor, modifier = Modifier.size(13.dp))
                        Spacer(Modifier.width(5.dp))
                        Text(
                            "Publicar",
                            color = commentBtnColor,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }
                }
            }

            if (confirmReport) {
                ReportPostDialog(
                    upload = upload,
                    currentUser = user,
                    onDismiss = { confirmReport = false }
                )
            }

            if (showEditDialog) {
                EditUploadDialog(
                    upload = upload,
                    onDismiss = { showEditDialog = false }
                )
            }

            if (showDeleteConfirm) {
                RastroStickerDialog(
                    onDismissRequest = { showDeleteConfirm = false },
                    title = "Eliminar publicación",
                    message = "¿Estás seguro de que deseas eliminar este aporte? Esta acción retirará el material de la comunidad permanentemente.",
                    confirmText = "Eliminar",
                    cancelText = "Conservar",
                    isDestructive = true,
                    icon = Icons.Rounded.Delete,
                    onConfirm = {
                        showDeleteConfirm = false
                        UserUploadRepository.deleteUpload(upload.id) { }
                    },
                    theme = theme
                )
            }
        }
    }
}

@Composable
private fun Sticker3dActionPill(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    isSelected: Boolean = false,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(12.dp)
    Box(
        modifier = Modifier
            .heightIn(min = 40.dp)
            .bouncyClick(scaleDown = 0.92f, enabled = enabled, onClick = onClick)
    ) {
        // Bisel inferior 3D
        Box(
            modifier = Modifier
                .matchParentSize()
                .offset(y = 2.dp)
                .clip(shape)
                .background(if (isSelected) theme.accentBevel else theme.cardBevel)
        )
        // Cara frontal
        Box(
            modifier = Modifier
                .heightIn(min = 38.dp)
                .clip(shape)
                .background(if (isSelected) theme.accent else theme.surface)
                .border(1.5.dp, if (isSelected) theme.accent else theme.strokeBorder, shape)
                .padding(horizontal = 11.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (isSelected) Color.White else theme.textPrimary,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = label,
                    fontSize = 11.sp,
                    fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                    color = if (isSelected) Color.White else theme.textPrimary
                )
            }
        }
    }
}



@Composable
fun ObraLiterariaCard(
    obra: ObraLiteraria,
    isFavorito: Boolean,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onToggleFavorito: () -> Unit,
    onClick: () -> Unit
) {
    val coverColor = remember(obra.colorHex) {
        try {
            Color(android.graphics.Color.parseColor(obra.colorHex))
        } catch (e: Exception) {
            theme.accent
        }
    }

    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        containerColor = theme.surface,
        strokeColor = theme.strokeBorder,
        bevelColor = theme.cardBevel,
        bevelHeight = 4.dp,
        shape = RoundedCornerShape(20.dp),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Portada Estilizada
            Box(
                modifier = Modifier
                    .size(width = 54.dp, height = 72.dp)
                    .clip(RastroShapes.Squircle)
                    .background(coverColor)
                    .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.5f), RastroShapes.Squircle),
                contentAlignment = Alignment.Center
            ) {
                if (obra.coverUrl.isNotBlank()) com.jonsuapps.rastro.android.ui.components.CachedRemoteImage(
                    url = obra.coverUrl, contentDescription = "Portada de ${obra.titulo}",
                    modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                else Icon(
                    imageVector = Icons.Rounded.MenuBook,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.9f),
                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = obra.categoria,
                    style = MaterialTheme.typography.labelSmall,
                    color = coverColor,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = obra.titulo,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = theme.textPrimary
                )
                Text(
                    text = "${obra.autor} (${obra.anio})",
                    style = MaterialTheme.typography.bodySmall,
                    color = theme.textSecondary
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "${obra.corriente} • ${obra.especie}",
                    style = MaterialTheme.typography.labelSmall,
                    color = theme.textSecondary.copy(alpha = 0.8f)
                )
            }

            IconButton(onClick = onToggleFavorito) {
                Icon(
                    imageVector = if (isFavorito) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                    contentDescription = "Favorito",
                    tint = if (isFavorito) Color(0xFFF59E0B) else theme.textSecondary
                )
            }
        }
    }
}

@Composable
fun LiteraturaViewerDialog(
    obra: ObraLiteraria,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onDismiss: () -> Unit
) {
    var showBookEditor by remember { mutableStateOf(false) }
    val editorUser by UserManager.currentUser.collectAsState()
    if (showBookEditor) BookEditorDialog(obra) { showBookEditor = false }
    var activeTab by remember { mutableIntStateOf(0) } // 0: Resumen Detallado, 1: Apunte de Repaso
    val savedObraIds by UserManager.savedObraIds.collectAsState()
    val isSaved = obra.id in savedObraIds
    val context = LocalContext.current
    var fontScaleState by remember { mutableIntStateOf(1) } // 0: Compact, 1: Normal, 2: Large
    val bodyFontSize = when (fontScaleState) {
        0 -> 13.sp
        1 -> 15.sp
        else -> 17.sp
    }
    val lineHeight = when (fontScaleState) {
        0 -> 18.sp
        1 -> 22.sp
        else -> 26.sp
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.65f))
                .padding(horizontal = 10.dp, vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = 680.dp)
                    .fillMaxHeight(0.96f)
                    .clickable(enabled = false) {}, // Evita que se cierre al hacer clic adentro
                shape = RoundedCornerShape(26.dp),
                containerColor = theme.background,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 5.dp
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    // ──────────────── 1. CABECERA CON PORTADA Y ACCIONES ────────────────
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Brush.verticalGradient(
                                    listOf(
                                        Color(0xFF065F46),
                                        Color(0xFF047857)
                                    )
                                )
                            )
                            .padding(16.dp)
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                            // Fila superior de controles
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Surface(
                                        shape = RoundedCornerShape(8.dp),
                                        color = Color.White.copy(alpha = 0.18f),
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White.copy(alpha = 0.25f))
                                    ) {
                                        Text(
                                            text = obra.categoria.uppercase(),
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Black,
                                            color = Color.White,
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                            letterSpacing = 0.5.sp
                                        )
                                    }

                                    Surface(
                                        shape = RoundedCornerShape(8.dp),
                                        color = Color.Black.copy(alpha = 0.28f),
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White.copy(alpha = 0.15f))
                                    ) {
                                        Text(
                                            text = obra.anio,
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White,
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                        )
                                    }
                                }

                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    // Editar obra
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = Color.White.copy(alpha = 0.18f),
                                        border = BorderStroke(1.dp, Color.White.copy(alpha = 0.25f)),
                                        modifier = Modifier
                                            .size(34.dp)
                                            .clickable { showBookEditor = true }
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(Icons.Rounded.Edit, contentDescription = "Editar obra", tint = Color.White, modifier = Modifier.size(16.dp))
                                        }
                                    }

                                    // Botón T (Ajustar fuente)
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = Color.White.copy(alpha = 0.15f),
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White.copy(alpha = 0.25f)),
                                        modifier = Modifier
                                            .size(34.dp)
                                            .clickable { fontScaleState = (fontScaleState + 1) % 3 }
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Text("T", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                        }
                                    }

                                    // Botón Compartir
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = Color.White.copy(alpha = 0.15f),
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White.copy(alpha = 0.25f)),
                                        modifier = Modifier
                                            .size(34.dp)
                                            .clickable {
                                                val share = android.content.Intent(android.content.Intent.ACTION_SEND).apply {
                                                    type = "text/plain"
                                                    putExtra(android.content.Intent.EXTRA_TEXT, "${obra.titulo} — ${obra.autor}\nResumen y apuntes en RASTRO")
                                                }
                                                context.startActivity(android.content.Intent.createChooser(share, "Compartir obra"))
                                            }
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(Icons.Rounded.Share, contentDescription = "Compartir", tint = Color.White, modifier = Modifier.size(16.dp))
                                        }
                                    }

                                    // Botón Marcador Guardado (Amarillo)
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = Color(0xFFF59E0B),
                                        modifier = Modifier
                                            .size(34.dp)
                                            .clickable { UserManager.toggleSaveObra(obra.id) }
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = if (isSaved) Icons.Rounded.Bookmark else Icons.Rounded.BookmarkBorder,
                                                contentDescription = if (isSaved) "Quitar de guardados" else "Guardar",
                                                tint = Color.White,
                                                modifier = Modifier.size(17.dp)
                                            )
                                        }
                                    }

                                    // Botón Cerrar (X)
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = Color.White.copy(alpha = 0.15f),
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White.copy(alpha = 0.25f)),
                                        modifier = Modifier
                                            .size(34.dp)
                                            .clickable { onDismiss() }
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = Color.White, modifier = Modifier.size(17.dp))
                                        }
                                    }
                                }
                            }

                            // Fila de Portada de Libro + Info
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(14.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Portada
                                Box(
                                    modifier = Modifier
                                        .size(width = 80.dp, height = 110.dp)
                                        .clip(RoundedCornerShape(14.dp))
                                        .background(Color.White.copy(alpha = 0.15f))
                                        .border(2.dp, Color.White.copy(alpha = 0.4f), RoundedCornerShape(14.dp)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    if (obra.coverUrl.isNotBlank()) {
                                        CachedRemoteImage(
                                            url = obra.coverUrl,
                                            contentDescription = "Portada de ${obra.titulo}",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )
                                    } else {
                                        Icon(Icons.Rounded.MenuBook, contentDescription = null, tint = Color.White, modifier = Modifier.size(36.dp))
                                    }
                                }

                                Column(
                                    modifier = Modifier.weight(1f),
                                    verticalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    Text(
                                        text = obra.titulo,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Black,
                                        color = Color.White,
                                        lineHeight = 25.sp
                                    )
                                    Text(
                                        text = "${obra.autor} (${obra.anio})",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White.copy(alpha = 0.95f)
                                    )
                                    Text(
                                        text = "${obra.genero} • ${obra.especie}",
                                        fontSize = 11.5.sp,
                                        color = Color.White.copy(alpha = 0.85f)
                                    )
                                    if (obra.corriente.isNotBlank()) {
                                        Text(
                                            text = obra.corriente,
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.SemiBold,
                                            color = Color(0xFFFDE68A)
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // ──────────────── 2. DOS PESTAÑAS (RESUMEN DETALLADO / APUNTE DE REPASO) ────────────────
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(theme.surface)
                            .padding(horizontal = 16.dp, vertical = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Pestaña 0: Resumen Detallado
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clickable { activeTab = 0 },
                            shape = RoundedCornerShape(14.dp),
                            color = if (activeTab == 0) Color(0xFFFFF1F2) else Color.Transparent,
                            border = androidx.compose.foundation.BorderStroke(
                                1.5.dp,
                                if (activeTab == 0) Color(0xFFBE123C) else Color.Transparent
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Rounded.MenuBook,
                                    contentDescription = null,
                                    tint = if (activeTab == 0) Color(0xFFBE123C) else theme.textSecondary,
                                    modifier = Modifier.size(17.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Resumen\nDetallado",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (activeTab == 0) Color(0xFFBE123C) else theme.textSecondary,
                                    textAlign = TextAlign.Center,
                                    lineHeight = 14.sp
                                )
                            }
                        }

                        // Pestaña 1: Apunte de Repaso
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clickable { activeTab = 1 },
                            shape = RoundedCornerShape(14.dp),
                            color = if (activeTab == 1) Color(0xFFFFF1F2) else Color.Transparent,
                            border = androidx.compose.foundation.BorderStroke(
                                1.5.dp,
                                if (activeTab == 1) Color(0xFFBE123C) else Color.Transparent
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Rounded.Description,
                                    contentDescription = null,
                                    tint = if (activeTab == 1) Color(0xFFBE123C) else theme.textSecondary,
                                    modifier = Modifier.size(17.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Apunte de Repaso",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (activeTab == 1) Color(0xFFBE123C) else theme.textSecondary,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }

                    // ──────────────── 3. CUERPO DESPLAZABLE CON CARDS ESTRUCTURADAS (Foto 4) ────────────────
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        if (activeTab == 0) {
                            // ─── CARD 1: ARGUMENTO Y SINOPSIS REAL DE LA OBRA ───
                            com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(20.dp),
                                containerColor = theme.surface,
                                strokeColor = theme.strokeBorder,
                                bottomBevelColor = theme.cardBevel,
                                bevelHeight = 3.dp
                            ) {
                                Column(modifier = Modifier.padding(18.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            Icons.Rounded.AutoAwesome,
                                            contentDescription = null,
                                            tint = Color(0xFF007AFF),
                                            modifier = Modifier.size(18.dp)
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "ARGUMENTO COMPLETO DE LA OBRA",
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Black,
                                            color = Color(0xFF831843),
                                            letterSpacing = 0.5.sp
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(12.dp))

                                    Text(
                                        text = obra.sinopsis.ifBlank { obra.temaPrincipal },
                                        fontSize = bodyFontSize,
                                        lineHeight = lineHeight,
                                        color = theme.textPrimary,
                                        fontWeight = FontWeight.Normal
                                    )
                                }
                            }

                            // ─── CARD 2: CONTEXTO HISTÓRICO Y CORRIENTE ───
                            com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(20.dp),
                                containerColor = theme.surface,
                                strokeColor = theme.strokeBorder,
                                bottomBevelColor = theme.cardBevel,
                                bevelHeight = 3.dp
                            ) {
                                Column(modifier = Modifier.padding(18.dp)) {
                                    Text(
                                        text = "CONTEXTO HISTÓRICO Y MOVIMIENTO",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Black,
                                        color = Color(0xFF047857),
                                        letterSpacing = 0.5.sp
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = obra.contextoHistorico.ifBlank { "Obra representativa del ${obra.corriente} publicada en ${obra.anio} (${obra.pais})." },
                                        fontSize = bodyFontSize,
                                        lineHeight = lineHeight,
                                        color = theme.textSecondary
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = "Género: ${obra.genero} • Especie: ${obra.especie} • Corriente: ${obra.corriente}",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF047857)
                                    )
                                }
                            }

                            // ─── CARD 3: PERSONAJES (SI EXISTEN) ───
                            if (obra.personajes.isNotEmpty()) {
                                com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(20.dp),
                                    containerColor = theme.surface,
                                    strokeColor = theme.strokeBorder,
                                    bottomBevelColor = theme.cardBevel,
                                    bevelHeight = 3.dp
                                ) {
                                    Column(modifier = Modifier.padding(18.dp)) {
                                        Text(
                                            text = "PERSONAJES CLAVE",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Black,
                                            color = Color(0xFF8B5CF6),
                                            letterSpacing = 0.5.sp
                                        )
                                        Spacer(modifier = Modifier.height(10.dp))
                                        obra.personajes.forEach { p ->
                                            Column(Modifier.padding(vertical = 4.dp)) {
                                                Text("${p.nombre} (${p.rol})", fontWeight = FontWeight.Bold, fontSize = 13.sp, color = theme.textPrimary)
                                                if (p.descripcion.isNotBlank()) {
                                                    Text(p.descripcion, fontSize = 12.sp, color = theme.textSecondary)
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            // ─── CARD 4: TRAMA POR ACTOS / EPISODIOS ───
                            obra.analisisTrama.forEach { escena ->
                                com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(18.dp),
                                    containerColor = theme.surface,
                                    strokeColor = theme.strokeBorder,
                                    bottomBevelColor = theme.cardBevel,
                                    bevelHeight = 3.dp
                                ) {
                                    Column(modifier = Modifier.padding(16.dp)) {
                                        Text(
                                            text = escena.titulo,
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textPrimary
                                        )
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(
                                            text = escena.detalle,
                                            fontSize = bodyFontSize,
                                            lineHeight = lineHeight,
                                            color = theme.textSecondary
                                        )
                                    }
                                }
                            }
                        } else {
                            // ─── PESTAÑA: APUNTE DE REPASO CEPREUNSA ───
                            com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(20.dp),
                                containerColor = Color(0xFFF0FDF4),
                                strokeColor = theme.strokeBorder,
                                bottomBevelColor = Color(0xFF86EFAC),
                                bevelHeight = 3.dp
                            ) {
                                Column(modifier = Modifier.padding(18.dp)) {
                                    Text(
                                        text = "SÍNTESIS EXPRESS PARA EL EXAMEN",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Black,
                                        color = Color(0xFF166534),
                                        letterSpacing = 0.5.sp
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = "${obra.titulo} (${obra.autor}, ${obra.anio}): ${obra.temaPrincipal}",
                                        fontSize = bodyFontSize,
                                        lineHeight = lineHeight,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(0xFF14532D)
                                    )
                                }
                            }

                            // Símbolos clave
                            if (obra.simbolosClave.isNotEmpty()) {
                                com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(20.dp),
                                    containerColor = theme.surface,
                                    strokeColor = theme.strokeBorder,
                                    bottomBevelColor = theme.cardBevel,
                                    bevelHeight = 3.dp
                                ) {
                                    Column(modifier = Modifier.padding(18.dp)) {
                                        Text(
                                            text = "SÍMBOLOS RECURRENTES EN EXÁMENES UNSA",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Black,
                                            color = Color(0xFFD97706),
                                            letterSpacing = 0.5.sp
                                        )
                                        Spacer(modifier = Modifier.height(10.dp))
                                        obra.simbolosClave.forEach { simbolo ->
                                            Row(modifier = Modifier.padding(vertical = 4.dp)) {
                                                Text("✦", color = Color(0xFFD97706), fontWeight = FontWeight.Bold)
                                                Spacer(modifier = Modifier.width(8.dp))
                                                Text(simbolo, fontSize = bodyFontSize, color = theme.textPrimary)
                                            }
                                        }
                                    }
                                }
                            }

                            // Preguntas Clave
                            obra.preguntasClave.forEach { pregunta ->
                                com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(18.dp),
                                    containerColor = theme.surface,
                                    strokeColor = theme.strokeBorder,
                                    bottomBevelColor = theme.cardBevel,
                                    bevelHeight = 3.dp
                                ) {
                                    Column(modifier = Modifier.padding(16.dp)) {
                                        Text(
                                            text = pregunta.pregunta,
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textPrimary
                                        )
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(
                                            text = pregunta.respuesta,
                                            fontSize = bodyFontSize,
                                            lineHeight = lineHeight,
                                            color = theme.textSecondary
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
