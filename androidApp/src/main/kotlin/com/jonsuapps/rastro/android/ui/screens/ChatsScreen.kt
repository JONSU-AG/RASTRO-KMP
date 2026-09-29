package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.ChatRepository
import com.jonsuapps.rastro.android.ui.components.CartoonAvatar
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.model.DirectChatConversation
import com.jonsuapps.rastro.model.DirectChatMessage
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private fun formatChatTime(millis: Long): String {
    if (millis <= 0L) return ""
    val now = System.currentTimeMillis()
    val diff = now - millis
    return when {
        diff < 60_000L -> "Ahora"
        diff < 3600_000L -> "${diff / 60_000L}m"
        diff < 86400_000L -> SimpleDateFormat("hh:mm a", Locale.getDefault()).format(Date(millis))
        else -> SimpleDateFormat("dd/MM", Locale.getDefault()).format(Date(millis))
    }
}

@Composable
fun ChatsScreen(
    isAuthenticated: Boolean = true,
    onNavigateToAuth: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val currentUser by UserManager.currentUser.collectAsState()

    var searchQuery by remember { mutableStateOf("") }
    var activeConversation by remember { mutableStateOf<DirectChatConversation?>(null) }
    var isNewChatDialogOpen by remember { mutableStateOf(false) }

    val conversations = remember { mutableStateListOf<DirectChatConversation>() }
    var isLoadingConversations by remember { mutableStateOf(true) }

    // Conexión en tiempo real con la colección 'mensajes_directos_privados' de Firebase Firestore
    DisposableEffect(currentUser.uid) {
        if (currentUser.isAuthenticated && currentUser.uid.isNotBlank()) {
            val listener = ChatRepository.observeConversations(currentUser.uid) { list ->
                conversations.clear()
                conversations.addAll(list)
                isLoadingConversations = false
            }
            onDispose { listener.remove() }
        } else {
            conversations.clear()
            isLoadingConversations = false
            onDispose { }
        }
    }

    val filteredConversations = remember(searchQuery, conversations.toList()) {
        if (searchQuery.isBlank()) conversations.toList()
        else conversations.filter {
            it.otherName.contains(searchQuery, ignoreCase = true) ||
            it.otherAcademicStatus.contains(searchQuery, ignoreCase = true) ||
            it.lastMessageText.contains(searchQuery, ignoreCase = true)
        }
    }

    if (!currentUser.isAuthenticated || currentUser.isAnonymous || currentUser.uid.isBlank()) {
        // Pantalla de protección para usuarios no autenticados
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(theme.background)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = 420.dp),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(theme.accent.copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Lock,
                            contentDescription = null,
                            tint = theme.accent,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Mensajería Directa Privada",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Para chatear en tiempo real con otros postulantes de la comunidad y coordinar dudas preuniversitarias, inicia sesión con tu cuenta oficial de RASTRO.",
                        fontSize = 12.sp,
                        color = theme.textSecondary,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        lineHeight = 17.sp
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Sticker3dButton(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            onNavigateToAuth()
                        },
                        modifier = Modifier.fillMaxWidth().height(46.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Icon(Icons.Rounded.Login, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Iniciar Sesión", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    }
                }
            }
        }
        return
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Cabecera con Botón de Nuevo Chat
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Mensajes Directos",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )
                    Text(
                        text = "Conectado a Firebase Firestore en vivo",
                        fontSize = 11.sp,
                        color = theme.accent,
                        fontWeight = FontWeight.Bold
                    )
                }

                Sticker3dButton(
                    onClick = {
                        DuolingoHaptics.playOptionSelected(context)
                        isNewChatDialogOpen = true
                    },
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 7.dp)
                ) {
                    Icon(Icons.Rounded.PersonAdd, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Nuevo Chat", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                }
            }
        }

        // Buscador de chats
        item {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = {
                    Text("Buscar en tus conversaciones...", fontSize = 12.sp, color = theme.textSecondary)
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Rounded.Search, contentDescription = null, tint = theme.textSecondary)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RastroShapes.Squircle),
                singleLine = true,
                shape = RastroShapes.Squircle,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = theme.accent,
                    unfocusedBorderColor = theme.borderSubtle,
                    focusedContainerColor = theme.surface,
                    unfocusedContainerColor = theme.surface
                )
            )
        }

        // Estado vacío o lista de conversaciones reales
        if (filteredConversations.isEmpty()) {
            item {
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .clip(CircleShape)
                                .background(theme.surfaceAccent),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.ChatBubbleOutline,
                                contentDescription = null,
                                tint = theme.textSecondary,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = if (searchQuery.isBlank()) "No tienes mensajes todavía" else "Sin resultados para \"$searchQuery\"",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = theme.textPrimary
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Inicia un chat con cualquier estudiante registrado en la comunidad para resolver dudas o compartir material.",
                            fontSize = 12.sp,
                            color = theme.textSecondary,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                            lineHeight = 16.sp
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                isNewChatDialogOpen = true
                            },
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder,
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            Icon(Icons.Rounded.Search, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Buscar Estudiantes Registrados", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                        }
                    }
                }
            }
        } else {
            items(filteredConversations, key = { it.id }) { chat ->
                DirectChatConversationCard3D(
                    chat = chat,
                    theme = theme,
                    onClick = {
                        DuolingoHaptics.playOptionSelected(context)
                        activeConversation = chat
                    }
                )
            }
        }
    }

    // Modal de Diálogo de Chat Activo
    activeConversation?.let { conversation ->
        DirectChatThreadDialog(
            conversation = conversation,
            currentUser = currentUser,
            theme = theme,
            onDismiss = { activeConversation = null }
        )
    }

    // Modal para Buscar Usuarios Reales de Firestore
    if (isNewChatDialogOpen) {
        NewChatUserSearchDialog(
            currentUserUid = currentUser.uid,
            theme = theme,
            onDismiss = { isNewChatDialogOpen = false },
            onSelectUser = { targetUser ->
                isNewChatDialogOpen = false
                val participants = listOf(currentUser.uid, targetUser.uid).sorted()
                val convId = participants.joinToString("_")
                activeConversation = DirectChatConversation(
                    id = convId,
                    participantUids = participants,
                    otherUid = targetUser.uid,
                    otherName = targetUser.displayName,
                    otherPhotoUrl = targetUser.photoURL.orEmpty(),
                    otherAcademicStatus = targetUser.targetCareer.ifBlank { "Postulante pre-U" },
                    lastMessageText = "",
                    lastMessageTime = System.currentTimeMillis()
                )
            }
        )
    }
}

@Composable
fun DirectChatConversationCard3D(
    chat: DirectChatConversation,
    theme: RastroPalette,
    onClick: () -> Unit
) {
    Sticker3dCard(
        onClick = onClick,
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 3.5.dp,
        shape = RoundedCornerShape(18.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CartoonAvatar(
                photoUrl = chat.otherPhotoUrl.takeIf { it.isNotBlank() },
                size = 46.dp,
                strokeColor = theme.strokeBorder,
                bevelColor = theme.cardBevel,
                strokeWidth = 2.dp,
                bevelOffset = 2.5.dp
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = chat.otherName,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        if (chat.lastMessageTime > 0) {
                            Text(
                                text = formatChatTime(chat.lastMessageTime),
                                fontSize = 10.sp,
                                color = theme.textSecondary
                            )
                        }
                        if (chat.unreadCount > 0) {
                            Box(
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color(0xFFEF4444))
                                    .padding(horizontal = 7.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = "${chat.unreadCount}",
                                    color = Color.White,
                                    fontWeight = FontWeight.Black,
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }
                }

                Text(
                    text = chat.otherAcademicStatus,
                    fontSize = 11.sp,
                    color = theme.accent,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(3.dp))

                Text(
                    text = chat.lastMessageText.ifBlank { "Comienza la conversación..." },
                    fontSize = 12.sp,
                    color = if (chat.unreadCount > 0) theme.textPrimary else theme.textSecondary,
                    fontWeight = if (chat.unreadCount > 0) FontWeight.Bold else FontWeight.Normal,
                    maxLines = 1
                )
            }
        }
    }
}

@Composable
fun DirectChatThreadDialog(
    conversation: DirectChatConversation,
    currentUser: UserData,
    theme: RastroPalette,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var inputText by remember { mutableStateOf("") }
    val listState = rememberLazyListState()

    var messages by remember(conversation.id) { mutableStateOf(emptyList<DirectChatMessage>()) }

    // Listener en tiempo real a la conversación exacta en Firestore
    DisposableEffect(conversation.id, currentUser.uid) {
        val listener = ChatRepository.observeMessages(conversation.id, currentUser.uid) { msgs ->
            messages = msgs
        }
        onDispose { listener.remove() }
    }

    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.size - 1)
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.92f)
                .widthIn(max = 540.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(26.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(14.dp)
            ) {
                // Cabecera del chat
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onDismiss, modifier = Modifier.size(34.dp)) {
                        Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Volver", tint = theme.textPrimary)
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    CartoonAvatar(
                        photoUrl = conversation.otherPhotoUrl.takeIf { it.isNotBlank() },
                        size = 38.dp,
                        strokeColor = theme.strokeBorder,
                        bevelColor = theme.cardBevel,
                        strokeWidth = 2.dp,
                        bevelOffset = 2.dp
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = conversation.otherName,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary
                        )
                        Text(
                            text = conversation.otherAcademicStatus,
                            fontSize = 10.5.sp,
                            color = theme.accent,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }

                HorizontalDivider(color = theme.borderSubtle.copy(alpha = 0.5f))

                // Historial de mensajes en tiempo real desde Firestore
                if (messages.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No hay mensajes anteriores.\n¡Saluda a tu compañero para empezar a estudiar!",
                            color = theme.textSecondary,
                            fontSize = 12.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                            lineHeight = 17.sp
                        )
                    }
                } else {
                    LazyColumn(
                        state = listState,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .padding(vertical = 10.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(messages, key = { it.id }) { msg ->
                            val isMe = msg.senderUid == currentUser.uid
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = if (isMe) Arrangement.End else Arrangement.Start
                            ) {
                                Box(
                                    modifier = Modifier
                                        .widthIn(max = 280.dp)
                                        .clip(
                                            RoundedCornerShape(
                                                topStart = 16.dp,
                                                topEnd = 16.dp,
                                                bottomStart = if (isMe) 16.dp else 4.dp,
                                                bottomEnd = if (isMe) 4.dp else 16.dp
                                            )
                                        )
                                        .background(if (isMe) theme.accent else theme.surfaceAccent)
                                        .border(
                                            1.dp,
                                            if (isMe) theme.accentBevel else theme.strokeBorder.copy(alpha = 0.3f),
                                            RoundedCornerShape(
                                                topStart = 16.dp,
                                                topEnd = 16.dp,
                                                bottomStart = if (isMe) 16.dp else 4.dp,
                                                bottomEnd = if (isMe) 4.dp else 16.dp
                                            )
                                        )
                                        .padding(horizontal = 12.dp, vertical = 8.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = msg.text,
                                            fontSize = 13.sp,
                                            color = if (isMe) Color.White else theme.textPrimary,
                                            lineHeight = 17.sp
                                        )
                                        Text(
                                            text = formatChatTime(msg.timestamp),
                                            fontSize = 9.sp,
                                            color = if (isMe) Color.White.copy(alpha = 0.75f) else theme.textSecondary,
                                            modifier = Modifier.align(Alignment.End).padding(top = 2.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // Barra de entrada de texto
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = inputText,
                        onValueChange = { inputText = it },
                        placeholder = { Text("Escribe un mensaje...", fontSize = 12.sp, color = theme.textSecondary) },
                        modifier = Modifier
                            .weight(1f)
                            .height(50.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = theme.accent,
                            unfocusedBorderColor = theme.borderSubtle,
                            focusedContainerColor = theme.surfaceAccent,
                            unfocusedContainerColor = theme.surfaceAccent
                        ),
                        singleLine = true
                    )

                    Sticker3dButton(
                        onClick = {
                            if (inputText.isNotBlank()) {
                                DuolingoHaptics.playOptionSelected(context)
                                val textToSend = inputText.trim()
                                inputText = ""
                                ChatRepository.sendMessage(
                                    currentUser = currentUser,
                                    partnerUid = conversation.otherUid,
                                    partnerName = conversation.otherName,
                                    partnerPhoto = conversation.otherPhotoUrl,
                                    text = textToSend
                                )
                            }
                        },
                        modifier = Modifier.size(48.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Icon(Icons.Rounded.Send, contentDescription = "Enviar", tint = Color.White, modifier = Modifier.size(20.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun NewChatUserSearchDialog(
    currentUserUid: String,
    theme: RastroPalette,
    onDismiss: () -> Unit,
    onSelectUser: (UserData) -> Unit
) {
    val context = LocalContext.current
    var queryText by remember { mutableStateOf("") }
    var results by remember { mutableStateOf(emptyList<UserData>()) }
    var isSearching by remember { mutableStateOf(true) }

    LaunchedEffect(queryText) {
        isSearching = true
        ChatRepository.searchRegisteredUsers(queryText, currentUserUid) { users ->
            results = users
            isSearching = false
        }
    }

    Dialog(onDismissRequest = onDismiss) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.75f),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Buscar Compañeros",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )
                    IconButton(onClick = onDismiss, modifier = Modifier.size(30.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = queryText,
                    onValueChange = { queryText = it },
                    placeholder = { Text("Escribe nombre o carrera...", fontSize = 12.sp) },
                    leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null, tint = theme.textSecondary) },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(12.dp))

                if (isSearching) {
                    Box(modifier = Modifier.weight(1f).fillMaxWidth(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(color = theme.accent, modifier = Modifier.size(32.dp))
                    }
                } else if (results.isEmpty()) {
                    Box(modifier = Modifier.weight(1f).fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Text(
                            text = "No se encontraron estudiantes registrados con esa búsqueda.",
                            color = theme.textSecondary,
                            fontSize = 12.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(results, key = { it.uid }) { user ->
                            Sticker3dCard(
                                onClick = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    onSelectUser(user)
                                },
                                containerColor = theme.surfaceAccent,
                                bottomBevelColor = theme.cardBevel,
                                strokeColor = theme.strokeBorder,
                                bevelHeight = 2.dp,
                                shape = RoundedCornerShape(14.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    CartoonAvatar(
                                        photoUrl = user.photoURL,
                                        size = 38.dp,
                                        strokeColor = theme.strokeBorder,
                                        bevelColor = theme.cardBevel,
                                        strokeWidth = 1.5.dp,
                                        bevelOffset = 1.5.dp
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = user.displayName,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 13.sp,
                                            color = theme.textPrimary
                                        )
                                        Text(
                                            text = user.targetCareer.ifBlank { user.targetUniversity.ifBlank { "Postulante Pre-U" } },
                                            fontSize = 10.5.sp,
                                            color = theme.accent,
                                            maxLines = 1
                                        )
                                    }
                                    Icon(
                                        Icons.Rounded.Chat,
                                        contentDescription = "Chatear",
                                        tint = theme.accent,
                                        modifier = Modifier.size(18.dp)
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
