package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Verified
import androidx.compose.material.icons.rounded.VideoLibrary
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.data.CursosRepository
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun AcademyDetailScreen(
    courseId: String,
    colors: RastroPalette = ThemeManager.currentTheme,
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val theme = colors
    val playlist = remember(courseId) {
        CursosRepository.playlists.firstOrNull { it.id == courseId }
            ?: CursosRepository.playlists.first()
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Cabecera con botón Volver
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBack,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RastroShapes.Pill)
                        .background(theme.surface)
                        .border(1.dp, theme.borderSubtle, RastroShapes.Pill)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = "Volver a Cursos",
                        tint = theme.textPrimary
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = playlist.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary,
                        maxLines = 1
                    )
                    Text(
                        text = "${playlist.channelTitle} • ${playlist.subject}",
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.textSecondary
                    )
                }
            }
        }

        // Reproductor de YouTube Integrado Seguro
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                YouTubePlaylistWebView(playlistId = playlist.playlistId)
            }
        }

        // Ficha Informativa del Curso
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
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
                                    .background(theme.accent.copy(alpha = 0.12f))
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    text = playlist.subject,
                                    style = MaterialTheme.typography.labelSmall,
                                    color = theme.accent,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            if (playlist.isVerified) {
                                Spacer(modifier = Modifier.width(6.dp))
                                Icon(
                                    imageVector = Icons.Rounded.Verified,
                                    contentDescription = "Verificado",
                                    tint = Color(0xFF3B82F6),
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }

                        Text(
                            text = "${playlist.videoCount} clases oficiales",
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.textSecondary
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = playlist.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = theme.textSecondary,
                        lineHeight = 18.sp
                    )
                }
            }
        }

        // Título de Lista de Clases
        item {
            Text(
                text = "Temario y Clases de la Playlist",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary
            )
        }

        // Clases de Ejemplo de la Playlist
        items(playlist.videoCount) { classIndex ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { /* Reproducir este índice */ },
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(RastroShapes.Pill)
                            .background(theme.accent.copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = null,
                            tint = theme.accent,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Clase ${classIndex + 1}: Fundamentos y Resolución de Problemas",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "${playlist.subject} • Clase Preuniversitaria",
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.textSecondary
                        )
                    }
                }
            }
        }
    }
}
