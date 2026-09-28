package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Campaign
import androidx.compose.material.icons.rounded.CheckCircleOutline
import androidx.compose.material.icons.rounded.ClearAll
import androidx.compose.material.icons.rounded.DeleteOutline
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.NotificationsActive
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.RastroNotification
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes

@Composable
fun NotificationsDialog(
    notifications: List<RastroNotification>,
    theme: RastroPalette,
    onClose: () -> Unit,
    onRead: (String) -> Unit,
    onReadAll: () -> Unit,
    onDelete: (String) -> Unit,
    onDeleteNotification: ((RastroNotification) -> Unit)? = null,
    onClearAllAvisos: (() -> Unit)? = null,
    onClearAllPersonal: (() -> Unit)? = null,
    onSelect: (RastroNotification) -> Unit
) {
    var selectedTab by remember { mutableIntStateOf(0) }
    val avisos = remember(notifications) { notifications.filter { it.isBroadcast } }
    val personal = remember(notifications) { notifications.filterNot { it.isBroadcast } }

    Dialog(onDismissRequest = onClose, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(
            modifier = Modifier.fillMaxWidth(0.94f).fillMaxHeight(0.85f),
            shape = RoundedCornerShape(26.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp
        ) {
            Column(Modifier.padding(18.dp)) {
                // Header superior
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column {
                        Text(
                            text = "Centro de Avisos",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Comunidad RASTRO & Actividad",
                            style = MaterialTheme.typography.bodySmall,
                            color = theme.textSecondary
                        )
                    }

                    // Acciones en un solo clic
                    if (selectedTab == 0 && avisos.isNotEmpty()) {
                        TextButton(
                            onClick = { onClearAllAvisos?.invoke() ?: avisos.forEach { onDelete(it.id) } },
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Icon(Icons.Rounded.ClearAll, contentDescription = null, tint = theme.accent, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(4.dp))
                            Text("Limpiar avisos", fontWeight = FontWeight.Bold, color = theme.accent, fontSize = 12.sp)
                        }
                    } else if (selectedTab == 1 && personal.isNotEmpty()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            if (personal.any { !it.read }) {
                                TextButton(
                                    onClick = onReadAll,
                                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text("Leer todas", fontWeight = FontWeight.Bold, color = theme.accent, fontSize = 11.sp)
                                }
                            }
                            TextButton(
                                onClick = { onClearAllPersonal?.invoke() ?: personal.forEach { onDelete(it.id) } },
                                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Text("Limpiar", fontWeight = FontWeight.Bold, color = Color(0xFFEF4444), fontSize = 11.sp)
                            }
                        }
                    }
                }

                Spacer(Modifier.height(12.dp))

                // Selector de pestañas: Avisos & Comunicados vs Mis Notificaciones
                TabRow(
                    selectedTabIndex = selectedTab,
                    containerColor = theme.surfaceAccent,
                    contentColor = theme.accent,
                    indicator = { tabPositions ->
                        TabRowDefaults.SecondaryIndicator(
                            Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                            color = theme.accent
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.5f), RoundedCornerShape(14.dp))
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0 },
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Rounded.Campaign, contentDescription = null, modifier = Modifier.size(17.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    text = "Avisos (${avisos.size})",
                                    fontWeight = if (selectedTab == 0) FontWeight.Black else FontWeight.Bold,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1 },
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Rounded.NotificationsActive, contentDescription = null, modifier = Modifier.size(17.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    text = "Personales (${personal.count { !it.read }})",
                                    fontWeight = if (selectedTab == 1) FontWeight.Black else FontWeight.Bold,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    )
                }

                Spacer(Modifier.height(14.dp))

                val currentList = if (selectedTab == 0) avisos else personal

                if (currentList.isEmpty()) {
                    Box(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                imageVector = if (selectedTab == 0) Icons.Rounded.Campaign else Icons.Rounded.Notifications,
                                contentDescription = null,
                                tint = theme.textSecondary.copy(alpha = 0.45f),
                                modifier = Modifier.size(48.dp)
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = if (selectedTab == 0)
                                    "No hay comunicados o avisos activos del administrador."
                                else
                                    "No tienes notificaciones personales pendientes.",
                                color = theme.textSecondary,
                                fontWeight = FontWeight.Medium,
                                fontSize = 13.sp,
                                modifier = Modifier.padding(horizontal = 24.dp)
                            )
                        }
                    }
                } else {
                    LazyColumn(
                        Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(currentList, key = { it.id }) { item ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .bouncyClick(scaleDown = 0.97f) {
                                        onRead(item.id)
                                        onSelect(item)
                                    }
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(if (item.read) theme.surface else theme.surfaceAccent)
                                        .border(
                                            width = if (!item.read) 2.dp else 1.2.dp,
                                            color = if (!item.read) theme.accent else theme.strokeBorder.copy(alpha = 0.35f),
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                        .padding(14.dp)
                                ) {
                                    Row(verticalAlignment = Alignment.Top) {
                                        Box(
                                            modifier = Modifier
                                                .size(36.dp)
                                                .clip(CircleShape)
                                                .background(
                                                    if (item.isBroadcast) Color(0xFFF59E0B).copy(alpha = 0.18f)
                                                    else theme.accent.copy(alpha = 0.18f)
                                                ),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Icon(
                                                imageVector = if (item.isBroadcast) Icons.Rounded.Campaign else Icons.Rounded.Notifications,
                                                contentDescription = null,
                                                tint = if (item.isBroadcast) Color(0xFFD97706) else theme.accent,
                                                modifier = Modifier.size(20.dp)
                                            )
                                        }

                                        Spacer(Modifier.width(12.dp))

                                        Column(Modifier.weight(1f)) {
                                            Row(verticalAlignment = Alignment.CenterVertically) {
                                                Text(
                                                    text = item.title,
                                                    color = theme.textPrimary,
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 14.sp,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis,
                                                    modifier = Modifier.weight(1f, fill = false)
                                                )
                                                if (item.isBroadcast) {
                                                    Spacer(Modifier.width(6.dp))
                                                    Box(
                                                        modifier = Modifier
                                                            .clip(RastroShapes.Pill)
                                                            .background(Color(0xFFF59E0B).copy(alpha = 0.15f))
                                                            .padding(horizontal = 6.dp, vertical = 2.dp)
                                                    ) {
                                                        Text(
                                                            text = "Aviso Oficial",
                                                            fontSize = 9.sp,
                                                            fontWeight = FontWeight.Black,
                                                            color = Color(0xFFD97706)
                                                        )
                                                    }
                                                }
                                            }

                                            if (item.senderName.isNotBlank()) {
                                                Text(
                                                    text = item.senderName,
                                                    color = theme.accent,
                                                    style = MaterialTheme.typography.labelSmall,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            }

                                            Spacer(Modifier.height(3.dp))
                                            Text(
                                                text = item.message,
                                                color = theme.textSecondary,
                                                style = MaterialTheme.typography.bodySmall,
                                                lineHeight = 17.sp
                                            )
                                        }

                                        Column(
                                            horizontalAlignment = Alignment.End,
                                            verticalArrangement = Arrangement.spacedBy(4.dp)
                                        ) {
                                            if (!item.read) {
                                                TextButton(
                                                    onClick = { onRead(item.id) },
                                                    contentPadding = PaddingValues(0.dp)
                                                ) {
                                                    Text("Leída", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.accent)
                                                }
                                            }
                                            IconButton(
                                                onClick = {
                                                    if (onDeleteNotification != null) {
                                                        onDeleteNotification(item)
                                                    } else {
                                                        onDelete(item.id)
                                                    }
                                                },
                                                modifier = Modifier.size(28.dp)
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Rounded.DeleteOutline,
                                                    contentDescription = "Eliminar aviso",
                                                    tint = theme.textSecondary.copy(alpha = 0.7f),
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

                Spacer(Modifier.height(12.dp))

                Sticker3dButton(
                    onClick = onClose,
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text("Cerrar", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
