package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.asImageBitmap
import android.graphics.BitmapFactory
import android.content.Intent
import androidx.compose.foundation.BorderStroke
import com.jonsuapps.rastro.android.data.UserProfileRepository
import com.jonsuapps.rastro.android.data.ProfileConnection
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.google.firebase.auth.FirebaseAuth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.ui.components.UploadMaterialDialog
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.community.CommunityManager
import com.jonsuapps.rastro.community.MuroPost
import com.jonsuapps.rastro.community.PostComment
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.android.ui.components.SkeletonBox
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dPill
import com.jonsuapps.rastro.android.ui.components.CartoonAvatar
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.android.data.ErrorBankRepository
import com.jonsuapps.rastro.android.data.FailedQuestion
import com.jonsuapps.rastro.navigation.RastroScreen
import com.jonsuapps.rastro.theme.RastroPalette
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL

@Composable
fun UserProfileScreen(
    onOpenSettings: () -> Unit = {},
    onNavigate: (String) -> Unit = {},
    onOpenPomodoro: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val currentUser by UserManager.currentUser.collectAsState()
    val streakState by GamificationManager.streakState.collectAsState()
    val errorBankQuestions by ErrorBankRepository.errors.collectAsState()
    val unsolvedErrorsCount = remember(errorBankQuestions) { errorBankQuestions.count { !it.isSolved } }
    var showErrorBankModal by remember { mutableStateOf(false) }
    var userUploads by remember(currentUser.uid) { mutableStateOf(emptyList<UserUpload>()) }
    var savedUploads by remember(currentUser.uid) { mutableStateOf(emptyList<UserUpload>()) }
    var followersCount by remember(currentUser.uid) { mutableIntStateOf(0) }
    var followingCount by remember(currentUser.uid) { mutableIntStateOf(0) }
    var showProfileEditor by remember { mutableStateOf(false) }
    var editName by remember { mutableStateOf(currentUser.displayName) }
    var editBio by remember { mutableStateOf(currentUser.bio) }
    var editWhatsApp by remember { mutableStateOf(currentUser.whatsappChannel) }
    var editTikTok by remember { mutableStateOf(currentUser.tiktokUrl) }
    var editInstagram by remember { mutableStateOf(currentUser.instagramUrl) }
    var selectedBanner by remember { mutableStateOf(currentUser.coverGradient) }
    var clearCoverImage by remember { mutableStateOf(false) }
    var savingProfile by remember { mutableStateOf(false) }
    var uploadingCover by remember { mutableStateOf(false) }
    var uploadingAvatar by remember { mutableStateOf(false) }
    var profileMessage by remember { mutableStateOf<String?>(null) }
    var connectionDialogTitle by remember { mutableStateOf<String?>(null) }
    var connectionUsers by remember { mutableStateOf(emptyList<ProfileConnection>()) }
    var loadingConnections by remember { mutableStateOf(false) }
    var showStreakInfo by remember { mutableStateOf(false) }
    val uriHandler = LocalUriHandler.current
    val context = LocalContext.current
    val openProfileEditor = {
        editName = currentUser.displayName
        editBio = currentUser.bio
        editWhatsApp = currentUser.whatsappChannel
        editTikTok = currentUser.tiktokUrl
        editInstagram = currentUser.instagramUrl
        selectedBanner = currentUser.coverGradient
        clearCoverImage = false
        profileMessage = null
        showProfileEditor = true
    }
    val bannerColors = remember(currentUser.coverGradient, theme.accent) {
        Regex("#[0-9A-Fa-f]{6}").findAll(currentUser.coverGradient.orEmpty())
            .mapNotNull { match -> runCatching { Color(android.graphics.Color.parseColor(match.value)) }.getOrNull() }
            .toList().ifEmpty { listOf(theme.accent, theme.accent.copy(alpha = 0.78f)) }
    }

    DisposableEffect(currentUser.uid) {
        if (currentUser.uid.isBlank()) return@DisposableEffect onDispose { }
        val registration = UserUploadRepository.observe(currentUser.uid) { userUploads = it }
        val savedRegistration = UserUploadRepository.observeSaved(currentUser.uid) { savedUploads = it }
        val profileRegistration = UserProfileRepository.observe(currentUser.uid) { data ->
            UserManager.applyProfileFields(
                displayName = data["displayName"] as? String,
                photoURL = data["photoURL"] as? String,
                bio = data["bio"] as? String,
                coverUrl = data["coverUrl"] as? String,
                coverGradient = data["coverGradient"] as? String,
                whatsappChannel = data["whatsappChannel"] as? String,
                tiktokUrl = data["tiktokUrl"] as? String,
                instagramUrl = data["instagram"] as? String,
                uploadCount = (data["uploadCount"] as? Number)?.toInt()
            )
        }
        val connectionListeners = UserProfileRepository.observeConnections(currentUser.uid) { followers, following ->
            followersCount = followers
            followingCount = following
        }
        onDispose {
            registration.remove()
            savedRegistration.remove()
            profileRegistration.remove()
            connectionListeners.first.remove()
            connectionListeners.second.remove()
        }
    }

    val coverPicker = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null && currentUser.uid.isNotBlank()) {
            uploadingCover = true
            UserProfileRepository.uploadCover(currentUser.uid, uri) { result ->
                uploadingCover = false
                result.onSuccess { url ->
                    UserManager.applyProfileFields(coverUrl = url)
                    clearCoverImage = false
                    profileMessage = "Portada actualizada."
                }.onFailure { error -> profileMessage = error.localizedMessage ?: "No se pudo subir la portada." }
            }
        }
    }
    val avatarPicker = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null && currentUser.uid.isNotBlank() && currentUser.isAuthenticated && !currentUser.isAnonymous) {
            uploadingAvatar = true
            UserProfileRepository.uploadAvatar(currentUser.uid, uri) { result ->
                uploadingAvatar = false
                result.onSuccess { url ->
                    UserManager.applyProfileFields(photoURL = url)
                    profileMessage = "Foto de perfil actualizada."
                }.onFailure { error -> profileMessage = error.localizedMessage ?: "No se pudo subir la foto." }
            }
        } else if (uri != null) {
            profileMessage = "Inicia sesión para cambiar tu foto de perfil."
        }
    }

    var selectedTab by remember { mutableIntStateOf(0) } // 0: Muros y aportes, 1: Guardados
    var showFilterDropdown by remember { mutableStateOf(false) }
    var isUploadDialogOpen by remember { mutableStateOf(false) }
    val openUploadDialog = {
        if (currentUser.isAuthenticated && !currentUser.isAnonymous) isUploadDialogOpen = true
        else onNavigate("auth")
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 120.dp)
        ) {
            // ──────────────── 1. PORTADA CON CORAJE (Fondo Rosa Oficial) ────────────────
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(bottomStart = 36.dp, bottomEnd = 36.dp))
                        .background(Brush.linearGradient(bannerColors))
                ) {
                    currentUser.coverUrl?.takeIf(String::isNotBlank)?.let { cover ->
                        CachedRemoteImage(cover, Modifier.fillMaxSize(), ContentScale.Crop, "Portada del perfil")
                    }

                    // Gradiente sutil
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    listOf(
                                        Color.Black.copy(alpha = 0.25f),
                                        Color.Transparent,
                                        Color.Black.copy(alpha = 0.2f)
                                    )
                                )
                            )
                    )

                    // Botones rápidos sobre la portada (Configuración / Compartir)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color.Black.copy(alpha = 0.55f),
                            contentColor = Color.White,
                            modifier = Modifier
                                .size(38.dp)
                                .clickable { onOpenSettings() }
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(Icons.Rounded.Settings, contentDescription = "Ajustes", modifier = Modifier.size(18.dp))
                            }
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color.Black.copy(alpha = 0.55f),
                            contentColor = Color.White,
                            modifier = Modifier
                                .size(38.dp)
                                .clickable {
                                    val profileUrl = "https://rumbo-jonsu.web.app/#/usuario/${currentUser.uid}"
                                    val shareIntent = Intent(Intent.ACTION_SEND).apply {
                                        type = "text/plain"
                                        putExtra(Intent.EXTRA_TEXT, "Mira el perfil de ${currentUser.displayName}: $profileUrl")
                                    }
                                    context.startActivity(Intent.createChooser(shareIntent, "Compartir perfil"))
                                }
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(Icons.Rounded.Share, contentDescription = "Compartir", modifier = Modifier.size(18.dp))
                            }
                        }
                    }
                }
            }

            // ──────────────── 2. TARJETA PRINCIPAL DEL PERFIL ────────────────
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = (-45).dp)
                        .padding(horizontal = 16.dp)
                ) {
                    // Avatar con marco 3D Cartoon y botón de cámara táctil
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(126.dp)
                    ) {
                        val firebaseUser = FirebaseAuth.getInstance().currentUser
                        val googlePhoto = currentUser.photoURL?.takeIf(String::isNotBlank)
                            ?: firebaseUser?.photoUrl?.toString()?.takeIf(String::isNotBlank)
                            ?: firebaseUser?.providerData?.firstOrNull { it.providerId == "google.com" }
                                ?.photoUrl?.toString()?.takeIf(String::isNotBlank)

                        CartoonAvatar(
                            photoUrl = googlePhoto,
                            size = 118.dp,
                            strokeColor = theme.strokeBorder,
                            strokeWidth = 2.5.dp,
                            bevelColor = theme.cardBevel,
                            bevelOffset = 3.5.dp,
                            modifier = Modifier.align(Alignment.Center)
                        )

                        // Botón naranja de cámara estilo Sticker 3D
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.BottomEnd)
                                .bouncyClick(scaleDown = 0.88f) {
                                    if (currentUser.isAuthenticated && !currentUser.isAnonymous) avatarPicker.launch("image/*")
                                    else onNavigate("auth")
                                }
                        ) {
                            Box(
                                modifier = Modifier
                                    .matchParentSize()
                                    .offset(y = 2.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF9A3412))
                            )
                            Box(
                                modifier = Modifier
                                    .matchParentSize()
                                    .clip(CircleShape)
                                    .background(Color(0xFFEA580C))
                                    .border(1.8.dp, theme.strokeBorder, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                if (uploadingAvatar) {
                                    CircularProgressIndicator(Modifier.size(17.dp), color = Color.White, strokeWidth = 2.dp)
                                } else {
                                    Icon(Icons.Rounded.PhotoCamera, contentDescription = "Cambiar foto de perfil", tint = Color.White, modifier = Modifier.size(17.dp))
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Nombre del Estudiante
                    Text(
                        text = currentUser.displayName.ifBlank { "Estudiante RASTRO" },
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        letterSpacing = (-0.5).sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Fila de Acciones Principales (UN SOLO "Editar Perfil" + "Amigos y Rachas")
                    Row(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Sticker3dButton(
                            onClick = { openProfileEditor() },
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                Icon(Icons.Rounded.Edit, contentDescription = null, tint = theme.accent, modifier = Modifier.size(15.dp))
                                Text("Editar Perfil", fontSize = 12.5.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                            }
                        }

                        var showFriendsAndStreaksDialog by remember { mutableStateOf(false) }
                        if (showFriendsAndStreaksDialog) {
                            FriendsAndStreaksDialog(
                                currentUserUid = currentUser.uid,
                                currentUserName = currentUser.displayName,
                                theme = theme,
                                onDismiss = { showFriendsAndStreaksDialog = false }
                            )
                        }

                        Sticker3dButton(
                            onClick = { showFriendsAndStreaksDialog = true },
                            containerColor = Color(0xFFF97316),
                            bottomBevelColor = Color(0xFFC2410C),
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                Icon(Icons.Rounded.Group, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                Text("Amigos y Rachas", fontSize = 12.5.sp, fontWeight = FontWeight.Black, color = Color.White)
                            }
                        }
                    }

                    if (!currentUser.isAuthenticated || currentUser.isAnonymous) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = { onNavigate("auth") },
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            colors = ButtonDefaults.buttonColors(containerColor = theme.accent),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Rounded.Login, contentDescription = null, modifier = Modifier.size(17.dp))
                            Spacer(Modifier.width(8.dp))
                            Text("Iniciar sesión con Google", fontWeight = FontWeight.Bold)
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Fila de Seguidores y Seguidos
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Sticker3dCard(
                            onClick = {
                                connectionDialogTitle = "Seguidores"
                                loadingConnections = true
                                connectionUsers = emptyList()
                                UserProfileRepository.loadConnections(currentUser.uid, followers = true) {
                                    connectionUsers = it
                                    loadingConnections = false
                                }
                            },
                            containerColor = theme.accent.copy(alpha = 0.08f),
                            bottomBevelColor = theme.accent.copy(alpha = 0.22f),
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Rounded.Group, contentDescription = null, tint = theme.accent, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "$followersCount seguidores",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.textPrimary
                                )
                            }
                        }

                        Sticker3dCard(
                            onClick = {
                                connectionDialogTitle = "Seguidos"
                                loadingConnections = true
                                connectionUsers = emptyList()
                                UserProfileRepository.loadConnections(currentUser.uid, followers = false) {
                                    connectionUsers = it
                                    loadingConnections = false
                                }
                            },
                            containerColor = theme.accent.copy(alpha = 0.08f),
                            bottomBevelColor = theme.accent.copy(alpha = 0.22f),
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Rounded.PersonAdd, contentDescription = null, tint = theme.accent, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "$followingCount seguidos",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.textPrimary
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // ──────────────── 3. CARD MOTIVACIONAL + BOTONES WHATSAPP & TIKTOK ────────────────
                    Sticker3dCard(
                        modifier = Modifier.fillMaxWidth(),
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 4.dp
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(
                                text = currentUser.bio,
                                fontStyle = FontStyle.Italic,
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Medium
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Botón WhatsApp
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color(0xFF25D366),
                                    shadowElevation = 3.dp,
                                    modifier = Modifier.clickable {
                                        val link = currentUser.whatsappChannel
                                        if (link.isNotBlank()) runCatching { uriHandler.openUri(link) } else openProfileEditor()
                                    }
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_whatsapp),
                                            contentDescription = "WhatsApp",
                                            tint = Color.White,
                                            modifier = Modifier.size(15.dp)
                                        )
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text(
                                            text = "WhatsApp",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(8.dp))

                                // Botón TikTok
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color.Black,
                                    shadowElevation = 3.dp,
                                    modifier = Modifier.clickable {
                                        val link = currentUser.tiktokUrl
                                        if (link.isNotBlank()) runCatching { uriHandler.openUri(link) } else openProfileEditor()
                                    }
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_tiktok),
                                            contentDescription = "TikTok",
                                            tint = Color.White,
                                            modifier = Modifier.size(15.dp)
                                        )
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text(
                                            text = "TikTok",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                    }
                                }

                                if (currentUser.instagramUrl.isNotBlank()) {
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = theme.accent,
                                        shadowElevation = 3.dp,
                                        modifier = Modifier.clickable { runCatching { uriHandler.openUri(currentUser.instagramUrl) } }
                                    ) {
                                        Row(Modifier.padding(horizontal = 10.dp, vertical = 7.dp), verticalAlignment = Alignment.CenterVertically) {
                                            Icon(Icons.Rounded.CameraAlt, contentDescription = "Instagram", tint = Color.White, modifier = Modifier.size(15.dp))
                                            Spacer(Modifier.width(5.dp))
                                            Text("Instagram", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                        }
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // ──────────────── 4. TARJETAS KPI (APORTES COMPACTO & MIS ERRORES) ────────────────
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Card 1: Aportes Muro (Compacto)
                        Sticker3dCard(
                            onClick = { openUploadDialog() },
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 9.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(28.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(theme.accent.copy(alpha = 0.15f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.MenuBook,
                                        contentDescription = null,
                                        tint = theme.accent,
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Column {
                                    Text(
                                        text = "${userUploads.size}",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Black,
                                        color = theme.accent,
                                        lineHeight = 16.sp
                                    )
                                    Text(
                                        text = "APORTES",
                                        fontSize = 9.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = theme.textSecondary,
                                        letterSpacing = 0.4.sp
                                    )
                                }
                            }
                        }

                        // Card 2: Mis Errores (Reemplaza a Reputación)
                        Sticker3dCard(
                            onClick = { showErrorBankModal = true },
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 9.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(28.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xFFEF4444).copy(alpha = 0.15f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.Rule,
                                        contentDescription = null,
                                        tint = Color(0xFFEF4444),
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Column {
                                    Text(
                                        text = "$unsolvedErrorsCount",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Black,
                                        color = Color(0xFFEF4444),
                                        lineHeight = 16.sp
                                    )
                                    Text(
                                        text = "MIS ERRORES",
                                        fontSize = 9.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = theme.textSecondary,
                                        letterSpacing = 0.4.sp
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // ──────────────── 5. HERRAMIENTAS DE ESTUDIO (5 BOTONES RÁPIDOS) ────────────────
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        ProfileToolButton(
                            title = "Pomodoro",
                            icon = Icons.Rounded.Timer,
                            badgeColor = Color(0xFFA855F7),
                            modifier = Modifier.weight(1f),
                            onClick = onOpenPomodoro
                        )
                        ProfileToolButton(
                            title = "Fórmulas",
                            icon = Icons.Rounded.Tune,
                            badgeColor = theme.accent,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate("formulario") }
                        )
                        ProfileToolButton(
                            title = "Aportar",
                            icon = Icons.Rounded.CloudUpload,
                            badgeColor = theme.accent,
                            modifier = Modifier.weight(1f),
                            onClick = openUploadDialog
                        )
                        ProfileToolButton(
                            title = "Ranking",
                            icon = Icons.Rounded.EmojiEvents,
                            badgeColor = Color(0xFFF59E0B),
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate("simulador") }
                        )
                        ProfileToolButton(
                            title = "Racha",
                            icon = Icons.Rounded.LocalFireDepartment,
                            badgeColor = Color(0xFFEF4444),
                            modifier = Modifier.weight(1f),
                            onClick = { showStreakInfo = true }
                        )
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    // ──────────────── 6. PESTAÑAS (MUROS Y APORTES / GUARDADOS) ────────────────
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        // Muros y aportes
                        Sticker3dPill(
                            text = "Muros y aportes (${userUploads.size})",
                            isSelected = selectedTab == 0,
                            selectedBgColor = theme.accent,
                            selectedContentColor = Color.White,
                            unselectedBgColor = theme.surface,
                            unselectedContentColor = theme.textSecondary,
                            strokeColor = theme.strokeBorder,
                            onClick = { selectedTab = 0 },
                            modifier = Modifier.weight(1f)
                        )

                        // Guardados
                        Sticker3dPill(
                            text = "Guardados",
                            isSelected = selectedTab == 1,
                            selectedBgColor = theme.accent,
                            selectedContentColor = Color.White,
                            unselectedBgColor = theme.surface,
                            unselectedContentColor = theme.textSecondary,
                            strokeColor = theme.strokeBorder,
                            onClick = { selectedTab = 1 },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    if (selectedTab == 0) {
                        CommunityWallComposer(onNavigateToAuth = { onNavigate("auth") })
                        Spacer(modifier = Modifier.height(14.dp))
                    }

                    // ──────────────── 7. ENCABEZADO DE SECCIÓN Y BOTÓN SUBIR APORTE ────────────────
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    Icons.Rounded.AutoAwesome,
                                    contentDescription = null,
                                    tint = theme.accent,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = if (selectedTab == 0) "Mis aportes (${userUploads.size})" else "Materiales guardados",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Black,
                                    color = theme.textPrimary
                                )
                            }
                            Text(
                                text = "Enlaces y materiales que compartiste.",
                                style = MaterialTheme.typography.bodySmall,
                                color = theme.textSecondary,
                                fontSize = 11.sp
                            )
                        }

                        // Botón "+ Subir Aporte"
                        Sticker3dButton(
                            onClick = openUploadDialog,
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Icon(Icons.Rounded.Add, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Aportar", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Publicar enlaza el formulario con Firestore y aumenta el contador real de aportes.
                    Sticker3dCard(
                        onClick = openUploadDialog,
                        modifier = Modifier.fillMaxWidth(),
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 3.dp,
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Rounded.Link, contentDescription = null, tint = theme.accent)
                            Spacer(Modifier.width(10.dp))
                            Text("Comparte un enlace o material con la comunidad", color = theme.textSecondary, modifier = Modifier.weight(1f), fontSize = 12.sp)
                            Text("Publicar", color = theme.accent, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
// ──────────────── 9. FEED DE APORTES REALES DEL MURO ────────────────
                    if (selectedTab == 0) {
                        if (userUploads.isEmpty()) {
                            Text("Aún no compartiste materiales. Usa Aportar para publicar un enlace y verlo aquí.", color = theme.textSecondary, fontSize = 13.sp)
                        } else {
                            userUploads.forEach { upload ->
                                CommunityUploadCard(
                                    upload = upload,
                                    theme = theme,
                                    onNavigateToProfile = { uid -> onNavigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                                    onRequestSignIn = { onNavigate("auth") }
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                            }
                        }
                    } else {
                        // Sección Guardados
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            color = theme.surface,
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.Bookmark,
                                        contentDescription = null,
                                        tint = theme.accent,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Text("Materiales guardados", fontWeight = FontWeight.Bold, color = theme.textPrimary, fontSize = 14.sp)
                                }
                                if (savedUploads.isEmpty()) {
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text("El material que guardes aparecerá aquí.", fontSize = 12.sp, color = theme.textSecondary)
                                } else {
                                    Spacer(modifier = Modifier.height(12.dp))
                                    savedUploads.forEach { saved ->
                                        CommunityUploadCard(
                                            upload = saved,
                                            theme = theme,
                                            onNavigateToProfile = { uid -> onNavigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                                            onRequestSignIn = { onNavigate("auth") }
                                        )
                                        Spacer(modifier = Modifier.height(10.dp))
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // ──────────────── 10. AJUSTES, TEMAS Y CUMPLIMIENTO GOOGLE PLAY ────────────────
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(
                            text = "CONFIGURACIÓN & POLÍTICAS",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textSecondary,
                            letterSpacing = 0.5.sp
                        )

                        // Botón Ajustes de Perfil y Temas
                        Sticker3dCard(
                            onClick = onOpenSettings,
                            modifier = Modifier.fillMaxWidth(),
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.5.dp,
                            shape = RoundedCornerShape(18.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(14.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(38.dp)
                                            .clip(RoundedCornerShape(12.dp))
                                            .background(theme.accent.copy(alpha = 0.12f))
                                            .border(1.2.dp, theme.accent.copy(alpha = 0.3f), RoundedCornerShape(12.dp)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Rounded.Settings,
                                            contentDescription = null,
                                            tint = theme.accent,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                    Column {
                                        Text(
                                            text = "Ajustes y Temas RASTRO",
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textPrimary
                                        )
                                        Text(
                                            text = "Tema visual, datos y opciones de cuenta",
                                            fontSize = 11.sp,
                                            color = theme.textSecondary
                                        )
                                    }
                                }
                                Icon(
                                    imageVector = Icons.Rounded.ChevronRight,
                                    contentDescription = null,
                                    tint = theme.textSecondary,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }

                        // Botón Políticas y Eliminación de Cuenta Google Play
                        Sticker3dCard(
                            onClick = onOpenSettings,
                            modifier = Modifier.fillMaxWidth(),
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.5.dp,
                            shape = RoundedCornerShape(18.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(14.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(38.dp)
                                            .clip(RoundedCornerShape(12.dp))
                                            .background(Color(0xFF10B981).copy(alpha = 0.12f))
                                            .border(1.2.dp, Color(0xFF10B981).copy(alpha = 0.3f), RoundedCornerShape(12.dp)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Rounded.Security,
                                            contentDescription = null,
                                            tint = Color(0xFF10B981),
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                    Column {
                                        Text(
                                            text = "Políticas & Normativa Play Store",
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textPrimary
                                        )
                                        Text(
                                            text = "Privacidad, Términos UGC y eliminación de datos",
                                            fontSize = 11.sp,
                                            color = theme.textSecondary
                                        )
                                    }
                                }
                                Icon(
                                    imageVector = Icons.Rounded.ChevronRight,
                                    contentDescription = null,
                                    tint = theme.textSecondary,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        if (showProfileEditor) {
            Dialog(onDismissRequest = { if (!savingProfile && !uploadingCover) showProfileEditor = false }) {
                Sticker3dCard(
                    modifier = Modifier
                        .fillMaxWidth(0.96f)
                        .widthIn(max = 480.dp),
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 5.dp,
                    shape = RoundedCornerShape(26.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(22.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Personalizar Perfil",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Black,
                                color = theme.textPrimary
                            )
                            IconButton(onClick = { if (!savingProfile && !uploadingCover) showProfileEditor = false }) {
                                Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                            }
                        }

                        Spacer(Modifier.height(12.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(max = 440.dp)
                                .verticalScroll(rememberScrollState()),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            profileMessage?.let {
                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = if (it.startsWith("No se pudo")) Color(0xFFFEE2E2) else Color(0xFFD1FAE5),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = it,
                                        color = if (it.startsWith("No se pudo")) Color(0xFFEF4444) else Color(0xFF10B981),
                                        fontSize = 12.sp,
                                        modifier = Modifier.padding(10.dp),
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            OutlinedTextField(
                                editName,
                                { editName = it.take(30) },
                                label = { Text("Nombre (2 a 30 caracteres)") },
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = theme.accent,
                                    unfocusedBorderColor = theme.borderSubtle
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            OutlinedTextField(
                                editBio,
                                { editBio = it },
                                label = { Text("Biografía") },
                                minLines = 2,
                                maxLines = 4,
                                shape = RoundedCornerShape(14.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = theme.accent,
                                    unfocusedBorderColor = theme.borderSubtle
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            OutlinedTextField(
                                editWhatsApp,
                                { editWhatsApp = it },
                                label = { Text("Enlace de WhatsApp") },
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = theme.accent,
                                    unfocusedBorderColor = theme.borderSubtle
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            OutlinedTextField(
                                editTikTok,
                                { editTikTok = it },
                                label = { Text("Enlace de TikTok") },
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = theme.accent,
                                    unfocusedBorderColor = theme.borderSubtle
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            OutlinedTextField(
                                editInstagram,
                                { editInstagram = it },
                                label = { Text("Enlace de Instagram") },
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = theme.accent,
                                    unfocusedBorderColor = theme.borderSubtle
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Text("Portada de Perfil", fontWeight = FontWeight.Bold, color = theme.textPrimary, fontSize = 13.sp)
                            listOf(
                                "linear-gradient(135deg, #701A75 0%, #831843 50%, #BE123C 100%)",
                                "linear-gradient(135deg, #007AFF 0%, #0051A8 100%)",
                                "linear-gradient(135deg, #1E3A8A 0%, #2563EB 50%, #3B82F6 100%)",
                                "linear-gradient(135deg, #065F46 0%, #059669 50%, #10B981 100%)",
                                "linear-gradient(135deg, #B45309 0%, #D97706 50%, #F59E0B 100%)",
                                "linear-gradient(135deg, #1E293B 0%, #334155 50%, #475569 100%)"
                            ).chunked(3).forEach { row ->
                                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                    row.forEach { gradient ->
                                        val swatches = Regex("#[0-9A-Fa-f]{6}").findAll(gradient)
                                            .map { Color(android.graphics.Color.parseColor(it.value)) }.toList()
                                        FilterChip(
                                            selected = selectedBanner == gradient,
                                            onClick = { selectedBanner = gradient; clearCoverImage = true },
                                            label = { Text(" ", modifier = Modifier.background(Brush.linearGradient(swatches)).padding(horizontal = 8.dp)) },
                                            shape = RoundedCornerShape(10.dp)
                                        )
                                    }
                                }
                            }
                            OutlinedButton(
                                onClick = { coverPicker.launch("image/*") },
                                enabled = !uploadingCover,
                                shape = RastroShapes.Pill,
                                border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.borderSubtle),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(if (uploadingCover) "Subiendo portada…" else "Elegir foto personalizada para portada")
                            }
                        }

                        Spacer(Modifier.height(18.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            OutlinedButton(
                                onClick = { showProfileEditor = false },
                                enabled = !savingProfile && !uploadingCover,
                                shape = RastroShapes.Pill,
                                border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.borderSubtle),
                                modifier = Modifier.weight(1f).height(44.dp)
                            ) {
                                Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                            }

                            // Botón Físico 3D estilo Sticker (Ganar XP)
                            com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                                onClick = {
                                    savingProfile = true
                                    profileMessage = null
                                    val fields = mapOf(
                                        "displayName" to editName.trim(),
                                        "hasChosenUsername" to true,
                                        "bio" to editBio.trim(),
                                        "whatsappChannel" to editWhatsApp.trim(),
                                        "tiktokUrl" to editTikTok.trim(),
                                        "instagram" to editInstagram.trim(),
                                        "coverGradient" to selectedBanner,
                                        "coverUrl" to if (clearCoverImage) "" else (currentUser.coverUrl ?: "")
                                    )
                                    UserProfileRepository.save(currentUser.uid, fields) { result ->
                                        savingProfile = false
                                        result.onSuccess {
                                            UserManager.applyProfileFields(
                                                displayName = editName.trim(),
                                                bio = editBio.trim(),
                                                whatsappChannel = editWhatsApp.trim(),
                                                tiktokUrl = editTikTok.trim(),
                                                instagramUrl = editInstagram.trim(),
                                                coverGradient = selectedBanner,
                                                coverUrl = if (clearCoverImage) "" else currentUser.coverUrl
                                            )
                                            showProfileEditor = false
                                        }.onFailure { error ->
                                            profileMessage = "No se pudo guardar: ${error.localizedMessage ?: "error de conexión"}"
                                        }
                                    }
                                },
                                enabled = !savingProfile && !uploadingCover && editName.trim().length >= 2,
                                containerColor = theme.accent,
                                shape = RastroShapes.Pill,
                                modifier = Modifier.weight(1.3f),
                                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 9.dp)
                            ) {
                                Text(
                                    if (savingProfile) "Guardando…" else "Guardar cambios",
                                    color = Color.White,
                                    fontWeight = FontWeight.Black,
                                    fontSize = 13.sp
                                )
                            }
                        }
                    }
                }
            }
        }

        if (showStreakInfo) {
            com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
                onDismissRequest = { showStreakInfo = false },
                title = "Tu racha de estudio",
                message = "Llevas ${streakState.currentStreak} días consecutivos de actividad académica. ¡Sigue aprendiendo hoy para mantener viva tu racha!",
                confirmText = "¡A darle con todo!",
                cancelText = "Cerrar",
                icon = Icons.Rounded.LocalFireDepartment,
                confirmColor = Color(0xFFF97316),
                theme = theme,
                onConfirm = { showStreakInfo = false }
            )
        }

        connectionDialogTitle?.let { title ->
            Dialog(onDismissRequest = { connectionDialogTitle = null }) {
                Sticker3dCard(
                    modifier = Modifier
                        .fillMaxWidth(0.92f)
                        .widthIn(max = 420.dp),
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 5.dp,
                    shape = RoundedCornerShape(22.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = title,
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Black,
                                fontSize = 17.sp
                            )
                            IconButton(onClick = { connectionDialogTitle = null }, modifier = Modifier.size(28.dp)) {
                                Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                            }
                        }

                        if (loadingConnections) {
                            Box(modifier = Modifier.fillMaxWidth().height(100.dp), contentAlignment = Alignment.Center) {
                                CircularProgressIndicator(color = theme.accent)
                            }
                        } else if (connectionUsers.isEmpty()) {
                            Text("Aún no hay conexiones.", color = theme.textSecondary, fontSize = 12.sp)
                        } else {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(max = 300.dp)
                                    .verticalScroll(rememberScrollState()),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                connectionUsers.forEach { friend ->
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(12.dp))
                                            .background(theme.surfaceAccent)
                                            .padding(10.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        CartoonAvatar(
                                            photoUrl = friend.photoUrl,
                                            size = 36.dp,
                                            strokeColor = theme.strokeBorder
                                        )
                                        Spacer(Modifier.width(10.dp))
                                        Text(
                                            text = friend.displayName,
                                            color = theme.textPrimary,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 13.sp,
                                            modifier = Modifier.weight(1f)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Modal para Subir Aporte de Material
        UploadMaterialDialog(
            isOpen = isUploadDialogOpen,
            onClose = { isUploadDialogOpen = false },
            onRequestSignIn = { onNavigate("auth") }
        )

        // Modal Banco de Errores (Mis Errores)
        if (showErrorBankModal) {
            ErrorBankDialog(
                questions = errorBankQuestions,
                theme = theme,
                onDismiss = { showErrorBankModal = false },
                onSolve = { id -> ErrorBankRepository.markAsSolved(id) }
            )
        }
    }
}

@Composable
fun FriendsAndStreaksDialog(
    currentUserUid: String,
    currentUserName: String,
    theme: RastroPalette,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var selectedTab by remember { mutableIntStateOf(0) } // 0: Mis Amigos, 1: Agregar Amigos, 2: Rachas & Escudos
    var friendSearchQuery by remember { mutableStateOf("") }
    var statusMessage by remember { mutableStateOf<String?>(null) }
    var isSending by remember { mutableStateOf(false) }

    Dialog(onDismissRequest = onDismiss) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.96f)
                .widthIn(max = 460.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 6.dp,
            shape = RoundedCornerShape(26.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Cabecera
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFF97316)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Rounded.Group, contentDescription = null, tint = Color.White, modifier = Modifier.size(20.dp))
                        }
                        Text(
                            text = "Amigos y Rachas",
                            color = theme.textPrimary,
                            fontWeight = FontWeight.Black,
                            fontSize = 18.sp
                        )
                    }

                    IconButton(onClick = onDismiss, modifier = Modifier.size(30.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                // Selector de Pestañas
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(theme.surfaceAccent)
                        .padding(4.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    listOf("Mis Amigos", "Agregar", "Rachas").forEachIndexed { index, label ->
                        val isSelected = selectedTab == index
                        Sticker3dButton(
                            onClick = { selectedTab = index },
                            modifier = Modifier.weight(1f).height(38.dp),
                            containerColor = if (isSelected) theme.accent else Color.Transparent,
                            bottomBevelColor = if (isSelected) theme.accentBevel else Color.Transparent,
                            strokeColor = if (isSelected) theme.strokeBorder else Color.Transparent,
                            bevelHeight = if (isSelected) 2.dp else 0.dp,
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Text(
                                text = label,
                                fontSize = 11.5.sp,
                                fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                color = if (isSelected) Color.White else theme.textSecondary
                            )
                        }
                    }
                }

                when (selectedTab) {
                    // Pestaña 0: Mis Amigos
                    0 -> {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text(
                                text = "Elige con qué amigos compartir racha (puedes activar con uno, varios o muchos):",
                                fontSize = 12.sp,
                                color = theme.textSecondary,
                                lineHeight = 16.sp
                            )

                            // Muestra lista de amigos
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(theme.surfaceAccent)
                                    .padding(12.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                                        CartoonAvatar(photoUrl = null, size = 36.dp, strokeColor = theme.strokeBorder)
                                        Column {
                                            Text("Estudiante RASTRO", fontWeight = FontWeight.Bold, fontSize = 13.sp, color = theme.textPrimary)
                                            Text("Amigo de estudio", fontSize = 11.sp, color = theme.textSecondary)
                                        }
                                    }

                                    Sticker3dButton(
                                        onClick = {
                                            DuolingoHaptics.playAnswerCorrect(context)
                                            statusMessage = "¡Racha activada con este amigo!"
                                        },
                                        containerColor = Color(0xFFF97316),
                                        bottomBevelColor = Color(0xFFC2410C),
                                        strokeColor = theme.strokeBorder,
                                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                            Icon(Icons.Rounded.LocalFireDepartment, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
                                            Text("Activar Racha", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // Pestaña 1: Agregar Amigos con Búsqueda por Lupita
                    1 -> {
                        var searchResults by remember { mutableStateOf(emptyList<ProfileConnection>()) }
                        var isSearching by remember { mutableStateOf(false) }

                        val doSearch = {
                            if (friendSearchQuery.isNotBlank()) {
                                isSearching = true
                                UserProfileRepository.searchUsers(friendSearchQuery) { results ->
                                    searchResults = results
                                    isSearching = false
                                }
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text(
                                text = "Buscar amigos por Nombre o ID:",
                                fontSize = 12.5.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.textPrimary
                            )

                            OutlinedTextField(
                                value = friendSearchQuery,
                                onValueChange = {
                                    friendSearchQuery = it
                                    doSearch()
                                },
                                placeholder = { Text("Ejemplo: Jonsu o correo@ejemplo.com") },
                                singleLine = true,
                                shape = RoundedCornerShape(12.dp),
                                trailingIcon = {
                                    IconButton(onClick = { doSearch() }) {
                                        Icon(Icons.Rounded.Search, contentDescription = "Buscar", tint = theme.accent)
                                    }
                                },
                                modifier = Modifier.fillMaxWidth()
                            )

                            if (isSearching) {
                                Box(modifier = Modifier.fillMaxWidth().height(60.dp), contentAlignment = Alignment.Center) {
                                    CircularProgressIndicator(color = theme.accent, modifier = Modifier.size(24.dp))
                                }
                            } else if (searchResults.isNotEmpty()) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .heightIn(max = 240.dp)
                                        .verticalScroll(rememberScrollState()),
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    searchResults.forEach { user ->
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(12.dp))
                                                .background(theme.surfaceAccent)
                                                .padding(10.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Row(
                                                modifier = Modifier.weight(1f).padding(end = 8.dp),
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                                            ) {
                                                CartoonAvatar(photoUrl = user.photoUrl, size = 36.dp, strokeColor = theme.strokeBorder)
                                                Text(
                                                    text = user.displayName,
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 12.5.sp,
                                                    color = theme.textPrimary,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis
                                                )
                                            }

                                            Sticker3dButton(
                                                onClick = {
                                                    isSending = true
                                                    UserProfileRepository.inviteDualStreak(
                                                        senderUid = currentUserUid,
                                                        friendUid = user.uid,
                                                        senderName = currentUserName
                                                    ) { success ->
                                                        isSending = false
                                                        statusMessage = if (success) {
                                                            DuolingoHaptics.playAnswerCorrect(context)
                                                            "¡Solicitud enviada a ${user.displayName}!"
                                                        } else "No se pudo enviar la solicitud."
                                                    }
                                                },
                                                enabled = !isSending,
                                                containerColor = theme.accent,
                                                bottomBevelColor = theme.accentBevel,
                                                strokeColor = theme.strokeBorder,
                                                contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp)
                                            ) {
                                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                                    Icon(Icons.Rounded.PersonAdd, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
                                                    Text("Solicitud", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.White, maxLines = 1)
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (friendSearchQuery.isNotBlank()) {
                                Text("Presiona la lupita para buscar usuarios.", fontSize = 11.5.sp, color = theme.textSecondary)
                            }
                        }
                    }

                    // Pestaña 2: Rachas & Escudos de Protección
                    2 -> {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = Color(0xFFEFF6FF),
                                border = BorderStroke(1.dp, Color(0xFFDBEAFE))
                            ) {
                                Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                        Icon(Icons.Rounded.Shield, contentDescription = null, tint = Color(0xFF2563EB), modifier = Modifier.size(18.dp))
                                        Text("Reglas de Escudos de Protección:", fontWeight = FontWeight.Black, fontSize = 12.5.sp, color = Color(0xFF1E40AF))
                                    }
                                    Text("• 10+ días consecutivos = 1 Escudo de Protección", fontSize = 11.5.sp, color = Color(0xFF1E3A8A))
                                    Text("• 20+ días consecutivos = 2 Escudos de Protección", fontSize = 11.5.sp, color = Color(0xFF1E3A8A))
                                    Text("• 30+ días consecutivos = 3 Escudos de Protección (Máximo 3)", fontSize = 11.5.sp, color = Color(0xFF1E3A8A))
                                    Text("• Si solo uno de los dos no cumple su estudio diario (1 lección o 5 min), la racha se rompe a menos que tengan un Escudo activo.", fontSize = 11.sp, color = Color(0xFF1D4ED8), lineHeight = 15.sp)
                                }
                            }

                            // Estado actual de Escudos
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(theme.surfaceAccent)
                                    .padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Icon(Icons.Rounded.Shield, contentDescription = null, tint = Color(0xFF3B82F6), modifier = Modifier.size(22.dp))
                                    Column {
                                        Text("Escudos Acumulados", fontWeight = FontWeight.Bold, fontSize = 12.5.sp, color = theme.textPrimary)
                                        Text("Protege tu racha compartida", fontSize = 10.5.sp, color = theme.textSecondary)
                                    }
                                }

                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color(0xFF2563EB)
                                ) {
                                    Text("1 / 3 Escudos", modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp), color = Color.White, fontWeight = FontWeight.Black, fontSize = 11.sp)
                                }
                            }
                        }
                    }
                }

                statusMessage?.let { msg ->
                    Text(msg, color = theme.accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun ProfileToolButton(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    badgeColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val theme = ThemeManager.currentTheme
    Sticker3dCard(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 2.5.dp,
        modifier = modifier.fillMaxWidth().heightIn(min = 72.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = badgeColor.copy(alpha = 0.14f),
                modifier = Modifier.size(32.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(icon, contentDescription = title, tint = badgeColor, modifier = Modifier.size(19.dp))
                }
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = title,
                fontSize = 9.sp,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary,
                maxLines = 1
            )
        }
    }
}

@Composable
private fun ProfileUploadCard(
    upload: UserUpload,
    theme: com.jonsuapps.rastro.theme.RastroPalette
) {
    var previewOpen by remember(upload.id) { mutableStateOf(false) }
    val uriHandler = LocalUriHandler.current
    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 4.dp
    ) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(upload.category.ifBlank { "Material compartido" }, color = theme.accent, fontSize = 11.sp, fontWeight = FontWeight.Bold)
            Text(upload.title, color = theme.textPrimary, fontSize = 15.sp, fontWeight = FontWeight.Bold)
            if (upload.description.isNotBlank()) Text(upload.description, color = theme.textSecondary, fontSize = 13.sp, lineHeight = 18.sp)
            UserUploadPreview(upload = upload, theme = theme)
            if (upload.author.isNotBlank()) Text("Autor: ${upload.author}", color = theme.textSecondary, fontSize = 11.sp)
            Text(upload.url, color = theme.accent, fontSize = 11.sp, maxLines = 2)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedButton(onClick = { previewOpen = true }) { Text("Vista previa") }
                Button(onClick = { runCatching { uriHandler.openUri(upload.url) } }) { Text("Abrir enlace") }
            }
        }
    }

    if (previewOpen) {
        Dialog(onDismissRequest = { previewOpen = false }) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth(0.96f)
                    .heightIn(min = 300.dp, max = 720.dp),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(22.dp)
            ) {
                Column {
                    Row(
                        Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(upload.title, modifier = Modifier.weight(1f), color = theme.textPrimary, fontWeight = FontWeight.Bold, maxLines = 1)
                        TextButton(onClick = { previewOpen = false }) { Text("Cerrar") }
                    }
                    UserUploadPreview(upload = upload, theme = theme, modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun RemoteProfileImage(
    url: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    contentDescription: String = "Foto de perfil"
) {
    CachedRemoteImage(
        url = url,
        modifier = modifier,
        contentScale = contentScale,
        contentDescription = contentDescription
    )
}

@Composable
fun MuroPostCard(
    post: MuroPost,
    currentUserUid: String,
    currentUserName: String,
    theme: com.jonsuapps.rastro.theme.RastroPalette
) {
    val context = LocalContext.current
    var showComments by remember { mutableStateOf(false) }
    var commentText by remember { mutableStateOf("") }
    var localPostReactions by remember(post.reactions) { mutableStateOf(post.reactions) }

    val reactionEmojis = listOf("❤️", "🔥", "⭐", "👍")

    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        color = theme.surface,
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle),
        shadowElevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header del post
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    CartoonAvatar(
                        photoUrl = null,
                        size = 38.dp,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.6.dp,
                        bevelColor = theme.cardBevel,
                        bevelOffset = 1.5.dp,
                        contentDescription = post.authorName
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(post.authorName, fontWeight = FontWeight.Bold, fontSize = 13.sp, color = theme.textPrimary)
                        Text(post.timeAgo, fontSize = 11.sp, color = theme.textSecondary)
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = theme.accent.copy(alpha = 0.1f)
                    ) {
                        Text(
                            text = post.tag,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = theme.accent,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }

                    // Botón para borrar si es el autor
                    if (post.authorUid == currentUserUid) {
                        Spacer(modifier = Modifier.width(4.dp))
                        IconButton(
                            onClick = { CommunityManager.deletePost(post.id, currentUserUid) },
                            modifier = Modifier.size(28.dp)
                        ) {
                            Icon(Icons.Rounded.DeleteOutline, contentDescription = "Eliminar", tint = Color(0xFFEF4444), modifier = Modifier.size(16.dp))
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Título si existe
            if (post.title.isNotBlank() && post.title != "Publicación de Muro") {
                Text(
                    text = post.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = theme.textPrimary
                )
                Spacer(modifier = Modifier.height(4.dp))
            }

            // Contenido del aporte
            Text(
                text = post.content,
                fontSize = 13.sp,
                lineHeight = 19.sp,
                color = theme.textPrimary
            )

            // Enlace o material si existe
            if (!post.fileUrl.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(10.dp))
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = theme.accent.copy(alpha = 0.08f),
                    border = androidx.compose.foundation.BorderStroke(1.dp, theme.accent.copy(alpha = 0.2f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Rounded.CloudDownload, contentDescription = null, tint = theme.accent, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Material Académico Adjunto (Drive / PDF)",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = theme.accent
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // ─── REACCIONES MULTI-EMOJI FUNCIONALES ───
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    reactionEmojis.forEach { emoji ->
                        val users = localPostReactions[emoji].orEmpty()
                        val count = users.size
                        val hasReacted = currentUserUid in users

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = if (hasReacted) theme.accent.copy(alpha = 0.15f) else theme.surfaceAccent,
                            border = androidx.compose.foundation.BorderStroke(
                                1.dp,
                                if (hasReacted) theme.accent else Color.Transparent
                            ),
                            modifier = Modifier.clickable {
                                val updated = if (hasReacted) users - currentUserUid else users + currentUserUid
                                localPostReactions = localPostReactions + (emoji to updated)
                                DuolingoHaptics.playOptionSelected(context)
                                CommunityManager.togglePostReaction(post.id, emoji, currentUserUid)
                            }
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(emoji, fontSize = 13.sp)
                                if (count > 0) {
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        "$count",
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (hasReacted) theme.accent else theme.textSecondary
                                    )
                                }
                            }
                        }
                    }
                }

                // Botón Desplegar Comentarios
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { showComments = !showComments }
                ) {
                    Icon(
                        Icons.Rounded.ChatBubbleOutline,
                        contentDescription = null,
                        tint = if (showComments) theme.accent else theme.textSecondary,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        if (post.comments.isNotEmpty()) "Comentarios (${post.comments.size})" else "Comentar",
                        fontSize = 12.sp,
                        color = if (showComments) theme.accent else theme.textSecondary,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            // ─── SECCIÓN INTERACTIVA DE COMENTARIOS ───
            AnimatedVisibility(visible = showComments) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp)
                ) {
                    Divider(color = theme.borderSubtle, thickness = 0.5.dp)
                    Spacer(modifier = Modifier.height(10.dp))

                    // Lista de Comentarios existentes
                    post.comments.forEach { comment ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.avatar_maneki_neko),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(26.dp)
                                    .clip(CircleShape)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = theme.surfaceAccent,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(8.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(comment.authorName, fontWeight = FontWeight.Bold, fontSize = 11.sp, color = theme.textPrimary)
                                            Text(comment.timeAgo, fontSize = 9.sp, color = theme.textSecondary)
                                        }
                                        Spacer(modifier = Modifier.height(2.dp))
                                        Text(comment.text, fontSize = 12.sp, color = theme.textPrimary)
                                    }
                                }

                                // Reacción a comentario y borrar si es propio
                                Row(
                                    modifier = Modifier.padding(top = 2.dp, start = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    val commentLikes = comment.reactions["👍"]?.size ?: 0
                                    val hasLiked = comment.hasUserReacted("👍", currentUserUid)
                                    Text(
                                        text = if (hasLiked) "Te gusta ($commentLikes)" else if (commentLikes > 0) "👍 $commentLikes" else "Me gusta",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = if (hasLiked) theme.accent else theme.textSecondary,
                                        modifier = Modifier.clickable {
                                            CommunityManager.toggleCommentReaction(post.id, comment.id, "👍", currentUserUid)
                                        }
                                    )

                                    if (comment.authorUid == currentUserUid) {
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Eliminar",
                                            fontSize = 10.sp,
                                            color = Color(0xFFEF4444),
                                            fontWeight = FontWeight.Medium,
                                            modifier = Modifier.clickable {
                                                CommunityManager.deleteComment(post.id, comment.id, currentUserUid)
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Input para agregar nuevo comentario
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = commentText,
                            onValueChange = { commentText = it },
                            placeholder = { Text("Escribe una respuesta...", fontSize = 12.sp) },
                            modifier = Modifier
                                .weight(1f)
                                .height(46.dp),
                            shape = RoundedCornerShape(20.dp),
                            singleLine = true,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = theme.accent,
                                unfocusedBorderColor = theme.borderSubtle
                            )
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        IconButton(
                            onClick = {
                                if (commentText.isNotBlank()) {
                                    CommunityManager.addComment(
                                        postId = post.id,
                                        text = commentText.trim(),
                                        userUid = currentUserUid,
                                        userName = currentUserName
                                    )
                                    commentText = ""
                                }
                            },
                            enabled = commentText.isNotBlank(),
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                Icons.Rounded.Send,
                                contentDescription = "Enviar",
                                tint = if (commentText.isNotBlank()) theme.accent else theme.textSecondary,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ErrorBankDialog(
    questions: List<FailedQuestion>,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onDismiss: () -> Unit,
    onSolve: (String) -> Unit
) {
    val haptic = androidx.compose.ui.platform.LocalHapticFeedback.current
    Dialog(onDismissRequest = onDismiss) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.96f)
                .fillMaxHeight(0.88f),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(0xFFEF4444).copy(alpha = 0.14f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Rounded.Rule, contentDescription = null, tint = Color(0xFFEF4444), modifier = Modifier.size(20.dp))
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text("Mis Errores", fontWeight = FontWeight.Black, fontSize = 18.sp, color = theme.textPrimary)
                            Text("Banco de preguntas falladas", fontSize = 11.sp, color = theme.textSecondary)
                        }
                    }
                    IconButton(onClick = onDismiss, modifier = Modifier.size(32.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                Spacer(Modifier.height(14.dp))
                HorizontalDivider(color = theme.borderSubtle)
                Spacer(Modifier.height(14.dp))

                val unsolved = questions.filter { !it.isSolved }
                if (unsolved.isEmpty()) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(Icons.Rounded.CheckCircle, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(54.dp))
                            Spacer(Modifier.height(12.dp))
                            Text("¡Sin errores pendientes!", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = theme.textPrimary)
                            Spacer(Modifier.height(4.dp))
                            Text("Has repasado y dominado todas las preguntas falladas.", fontSize = 12.sp, color = theme.textSecondary, textAlign = TextAlign.Center)
                        }
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        items(unsolved.size, key = { unsolved[it].id }) { index ->
                            val item = unsolved[index]
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.cardColors(containerColor = theme.surfaceAccent.copy(alpha = 0.5f)),
                                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
                            ) {
                                Column(modifier = Modifier.padding(14.dp)) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Surface(
                                            shape = RastroShapes.Pill,
                                            color = theme.accent.copy(alpha = 0.12f)
                                        ) {
                                            Text(
                                                text = "${item.subject} • ${item.subtema}",
                                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                                fontSize = 10.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = theme.accent
                                            )
                                        }
                                        Text(
                                            text = "Pendiente",
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            color = Color(0xFFEF4444)
                                        )
                                    }

                                    Spacer(Modifier.height(8.dp))
                                    Text(item.question, fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = theme.textPrimary, lineHeight = 18.sp)
                                    Spacer(Modifier.height(10.dp))

                                    // Opciones
                                    item.options.forEachIndexed { optIndex, optText ->
                                        val isCorrect = optIndex == item.correctAnswerIndex
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(vertical = 2.dp)
                                                .clip(RoundedCornerShape(8.dp))
                                                .background(if (isCorrect) Color(0xFF10B981).copy(alpha = 0.12f) else Color.Transparent)
                                                .padding(horizontal = 8.dp, vertical = 4.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(
                                                text = ('A' + optIndex).toString(),
                                                fontSize = 11.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = if (isCorrect) Color(0xFF10B981) else theme.textSecondary
                                            )
                                            Spacer(Modifier.width(6.dp))
                                            Text(
                                                text = optText,
                                                fontSize = 12.sp,
                                                fontWeight = if (isCorrect) FontWeight.Bold else FontWeight.Normal,
                                                color = if (isCorrect) Color(0xFF047857) else theme.textPrimary,
                                                modifier = Modifier.weight(1f)
                                            )
                                            if (isCorrect) {
                                                Icon(Icons.Rounded.CheckCircle, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(16.dp))
                                            }
                                        }
                                    }

                                    if (item.explanation.isNotBlank()) {
                                        Spacer(Modifier.height(8.dp))
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(8.dp))
                                                .background(theme.surface)
                                                .border(1.dp, theme.borderSubtle, RoundedCornerShape(8.dp))
                                                .padding(8.dp)
                                        ) {
                                            Text(item.explanation, fontSize = 11.sp, color = theme.textSecondary, lineHeight = 15.sp)
                                        }
                                    }

                                    Spacer(Modifier.height(10.dp))
                                    Button(
                                        onClick = {
                                            haptic.performHapticFeedback(androidx.compose.ui.hapticfeedback.HapticFeedbackType.LongPress)
                                            onSolve(item.id)
                                        },
                                        modifier = Modifier.fillMaxWidth().height(36.dp).bouncyClick {
                                            haptic.performHapticFeedback(androidx.compose.ui.hapticfeedback.HapticFeedbackType.LongPress)
                                            onSolve(item.id)
                                        },
                                        shape = RastroShapes.Pill,
                                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF10B981))
                                    ) {
                                        Icon(Icons.Rounded.Check, contentDescription = null, modifier = Modifier.size(14.dp), tint = Color.White)
                                        Spacer(Modifier.width(6.dp))
                                        Text("Ya lo entendí (Resolver)", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.White)
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


