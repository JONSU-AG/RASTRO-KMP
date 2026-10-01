package com.jonsuapps.rastro.android.ui.screens.literatura

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
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
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.screens.BookEditorDialog
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.theme.RastroPalette

/**
 * Descriptor dinámico de sección existente para una obra literaria.
 */
private enum class ObraSectionType(val displayTitle: String) {
    SINOPSIS("Resumen / Argumento"),
    CONTEXTO("Contexto Histórico"),
    PERSONAJES("Personajes"),
    TRAMA("Trama y Escenas"),
    SIMBOLOS("Símbolos Clave"),
    PREGUNTAS("Preguntas Clave")
}

/**
 * Pantalla / Visor detallado y dinámico para una obra literaria.
 *
 * Características:
 * - Renderer GENÉRICO: detecta y muestra únicamente las secciones que realmente existen en el modelo.
 * - Sin superresúmenes: respeta el 100% de los párrafos, datos y personajes originales.
 * - Cabecera cartoon con banner superior opcional (crop controlado) y portada con fallback cartoon.
 * - Responsive para móviles pequeños, grandes y tablets.
 */
@Composable
fun ObraDetailView(
    obra: ObraLiteraria,
    theme: RastroPalette,
    onDismiss: () -> Unit
) {
    var showBookEditor by remember { mutableStateOf(false) }
    if (showBookEditor) {
        BookEditorDialog(book = obra) { showBookEditor = false }
    }

    val savedObraIds by UserManager.savedObraIds.collectAsState()
    val isSaved = obra.id in savedObraIds
    val context = LocalContext.current

    // Selector de tamaño de fuente (0: Compacto, 1: Normal, 2: Amplio)
    var fontScaleState by remember { mutableIntStateOf(1) }
    val bodyFontSize = when (fontScaleState) {
        0 -> 13.5.sp
        1 -> 15.sp
        else -> 17.sp
    }
    val bodyLineHeight = when (fontScaleState) {
        0 -> 20.sp
        1 -> 23.sp
        else -> 27.sp
    }

    val themeColor = runCatching {
        Color(android.graphics.Color.parseColor(obra.colorHex))
    }.getOrDefault(Color(0xFF047857))

    // Detección 100% DINÁMICA de las secciones reales disponibles en esta obra
    val availableSections = remember(obra) {
        buildList {
            if (obra.sinopsis.isNotBlank()) add(ObraSectionType.SINOPSIS)
            if (obra.contextoHistorico.isNotBlank()) add(ObraSectionType.CONTEXTO)
            if (obra.personajes.isNotEmpty()) add(ObraSectionType.PERSONAJES)
            if (obra.analisisTrama.isNotEmpty()) add(ObraSectionType.TRAMA)
            if (obra.simbolosClave.isNotEmpty()) add(ObraSectionType.SIMBOLOS)
            if (obra.preguntasClave.isNotEmpty()) add(ObraSectionType.PREGUNTAS)
        }
    }

    var selectedSection by remember(availableSections) {
        mutableStateOf(availableSections.firstOrNull() ?: ObraSectionType.SINOPSIS)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.68f))
            .padding(horizontal = 8.dp, vertical = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 720.dp)
                .fillMaxHeight(0.97f)
                .clickable(enabled = false) {},
            shape = RoundedCornerShape(24.dp),
            containerColor = theme.background,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // ──────────────── 1. CABECERA CARTOON CON BANNER OPCIONAL Y ACCIONES ────────────────
                Box(modifier = Modifier.fillMaxWidth()) {
                    // Banner opcional integrado o fondo cartoon
                    ObraBannerGraphic(
                        bannerUrl = obra.bannerUrl,
                        themeColor = themeColor,
                        height = 110.dp
                    )

                    // Fila superior de botones de acción
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Badge de Categoría
                        if (obra.categoria.isNotBlank()) {
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = Color.Black.copy(alpha = 0.55f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f))
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
                        } else {
                            Spacer(Modifier.width(1.dp))
                        }

                        // Botones de control superiores
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Editar obra (Admin)
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = Color.Black.copy(alpha = 0.45f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                                modifier = Modifier
                                    .size(34.dp)
                                    .clickable { showBookEditor = true }
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(Icons.Rounded.Edit, contentDescription = "Editar obra", tint = Color.White, modifier = Modifier.size(16.dp))
                                }
                            }

                            // Botón "T" (Escalar tamaño de fuente)
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = Color.Black.copy(alpha = 0.45f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                                modifier = Modifier
                                    .size(34.dp)
                                    .clickable { fontScaleState = (fontScaleState + 1) % 3 }
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text("T", fontSize = 14.sp, fontWeight = FontWeight.Black, color = Color.White)
                                }
                            }

                            // Botón Compartir
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = Color.Black.copy(alpha = 0.45f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                                modifier = Modifier
                                    .size(34.dp)
                                    .clickable {
                                        val share = Intent(Intent.ACTION_SEND).apply {
                                            type = "text/plain"
                                            putExtra(Intent.EXTRA_TEXT, "${obra.titulo} — ${obra.autor}\nEn RASTRO Preuniversitario")
                                        }
                                        context.startActivity(Intent.createChooser(share, "Compartir obra"))
                                    }
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(Icons.Rounded.Share, contentDescription = "Compartir", tint = Color.White, modifier = Modifier.size(16.dp))
                                }
                            }

                            // Botón Guardar Favorito
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = if (isSaved) Color(0xFFF59E0B) else Color.Black.copy(alpha = 0.45f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                                modifier = Modifier
                                    .size(34.dp)
                                    .clickable { UserManager.toggleSaveObra(obra.id) }
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = if (isSaved) Icons.Rounded.Bookmark else Icons.Rounded.BookmarkBorder,
                                        contentDescription = "Guardar",
                                        tint = Color.White,
                                        modifier = Modifier.size(17.dp)
                                    )
                                }
                            }

                            // Botón Cerrar (X)
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = Color.Black.copy(alpha = 0.55f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
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
                }

                // Fila de Portada + Metadatos de la Obra (Solapada sutilmente con la cabecera)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Portada con fallback cartoon
                    ObraCoverGraphic(
                        obra = obra,
                        width = 82.dp,
                        height = 112.dp
                    )

                    // Metadatos reales disponibles (sin inventar ni forzar campos vacíos)
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        Text(
                            text = obra.titulo,
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary,
                            lineHeight = 23.sp
                        )

                        if (obra.autor.isNotBlank()) {
                            Text(
                                text = if (obra.anio.isNotBlank()) "${obra.autor} (${obra.anio})" else obra.autor,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.textSecondary
                            )
                        }

                        // Badges de Género, Especie y Corriente (solo los no vacíos)
                        val metaTags = buildList {
                            if (obra.genero.isNotBlank()) add(obra.genero)
                            if (obra.especie.isNotBlank()) add(obra.especie)
                            if (obra.corriente.isNotBlank()) add(obra.corriente)
                        }

                        if (metaTags.isNotEmpty()) {
                            Text(
                                text = metaTags.joinToString(" • "),
                                fontSize = 11.5.sp,
                                color = themeColor,
                                fontWeight = FontWeight.SemiBold,
                                lineHeight = 14.sp
                            )
                        }

                        if (obra.temaPrincipal.isNotBlank()) {
                            Text(
                                text = "Tema: ${obra.temaPrincipal}",
                                fontSize = 11.sp,
                                color = theme.textMuted,
                                maxLines = 2
                            )
                        }
                    }
                }

                // ──────────────── 2. NAVEGACIÓN DINÁMICA POR SECCIONES REALES ────────────────
                if (availableSections.size > 1) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(theme.surface.copy(alpha = 0.5f))
                            .horizontalScroll(rememberScrollState())
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        availableSections.forEach { section ->
                            val countLabel = when (section) {
                                ObraSectionType.PERSONAJES -> " (${obra.personajes.size})"
                                ObraSectionType.TRAMA -> " (${obra.analisisTrama.size})"
                                ObraSectionType.SIMBOLOS -> " (${obra.simbolosClave.size})"
                                ObraSectionType.PREGUNTAS -> " (${obra.preguntasClave.size})"
                                else -> ""
                            }
                            ObraSectionChip(
                                title = "${section.displayTitle}$countLabel",
                                isSelected = selectedSection == section,
                                onClick = { selectedSection = section },
                                theme = theme
                            )
                        }
                    }
                }

                Divider(thickness = 1.dp, color = theme.strokeBorder.copy(alpha = 0.25f))

                // ──────────────── 3. CONTENIDO COMPLETO SIN SUPERRESUMEN (SCROLL LARGO) ────────────────
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    when (selectedSection) {
                        ObraSectionType.SINOPSIS -> {
                            SectionHeaderBadge("Argumento de la obra", Icons.Rounded.MenuBook, themeColor)
                            Text(
                                text = obra.sinopsis,
                                fontSize = bodyFontSize,
                                lineHeight = bodyLineHeight,
                                color = theme.textPrimary
                            )
                        }

                        ObraSectionType.CONTEXTO -> {
                            SectionHeaderBadge("Contexto histórico y cultural", Icons.Rounded.HistoryEdu, themeColor)
                            Text(
                                text = obra.contextoHistorico,
                                fontSize = bodyFontSize,
                                lineHeight = bodyLineHeight,
                                color = theme.textPrimary
                            )
                        }

                        ObraSectionType.PERSONAJES -> {
                            SectionHeaderBadge("Personajes de la obra", Icons.Rounded.Group, themeColor)
                            obra.personajes.forEach { personaje ->
                                PersonajeCardCartoon(personaje = personaje, theme = theme, bodyFontSize = bodyFontSize)
                            }
                        }

                        ObraSectionType.TRAMA -> {
                            SectionHeaderBadge("Desarrollo de la trama y escenas", Icons.Rounded.Timeline, themeColor)
                            obra.analisisTrama.forEachIndexed { index, escena ->
                                EscenaTramaCardCartoon(index = index + 1, escena = escena, theme = theme, bodyFontSize = bodyFontSize)
                            }
                        }

                        ObraSectionType.SIMBOLOS -> {
                            SectionHeaderBadge("Símbolos y motivos clave", Icons.Rounded.Lightbulb, themeColor)
                            obra.simbolosClave.forEach { simbolo ->
                                SimboloCardCartoon(simbolo = simbolo, theme = theme, bodyFontSize = bodyFontSize)
                            }
                        }

                        ObraSectionType.PREGUNTAS -> {
                            SectionHeaderBadge("Preguntas clave tipo examen", Icons.Rounded.Quiz, themeColor)
                            obra.preguntasClave.forEachIndexed { index, pregunta ->
                                PreguntaClaveCardCartoon(index = index + 1, pregunta = pregunta, theme = theme, bodyFontSize = bodyFontSize)
                            }
                        }
                    }

                    Spacer(Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
private fun SectionHeaderBadge(title: String, icon: androidx.compose.ui.graphics.vector.ImageVector, accentColor: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(bottom = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(accentColor.copy(alpha = 0.15f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(icon, contentDescription = null, tint = accentColor, modifier = Modifier.size(16.dp))
        }
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Black,
            color = accentColor
        )
    }
}

@Composable
private fun PersonajeCardCartoon(
    personaje: com.jonsuapps.rastro.model.PersonajeLiterario,
    theme: RastroPalette,
    bodyFontSize: androidx.compose.ui.unit.TextUnit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(theme.surface)
            .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.4f), RoundedCornerShape(16.dp))
            .padding(14.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            verticalAlignment = Alignment.Top
        ) {
            // Avatar con fallback cartoon
            PersonajeAvatarGraphic(personaje = personaje, size = 58.dp)

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = personaje.nombre,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )

                    if (personaje.rol.isNotBlank()) {
                        Surface(
                            shape = RoundedCornerShape(6.dp),
                            color = Color(0xFF1E293B).copy(alpha = 0.08f)
                        ) {
                            Text(
                                text = personaje.rol,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.accent,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                Text(
                    text = personaje.descripcion,
                    fontSize = bodyFontSize,
                    lineHeight = 20.sp,
                    color = theme.textSecondary
                )
            }
        }
    }
}

@Composable
private fun EscenaTramaCardCartoon(
    index: Int,
    escena: com.jonsuapps.rastro.model.EscenaTrama,
    theme: RastroPalette,
    bodyFontSize: androidx.compose.ui.unit.TextUnit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(theme.surface)
            .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(14.dp))
            .padding(14.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF2563EB))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "$index",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.White
                )
            }

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = escena.titulo,
                    fontSize = 14.5.sp,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary
                )
                Text(
                    text = escena.detalle,
                    fontSize = bodyFontSize,
                    lineHeight = 20.sp,
                    color = theme.textSecondary
                )
            }
        }
    }
}

@Composable
private fun SimboloCardCartoon(
    simbolo: String,
    theme: RastroPalette,
    bodyFontSize: androidx.compose.ui.unit.TextUnit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(theme.surface)
            .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp))
            .padding(12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Icon(
                Icons.Rounded.AutoAwesome,
                contentDescription = null,
                tint = Color(0xFFD97706),
                modifier = Modifier.size(18.dp)
            )
            Text(
                text = simbolo,
                fontSize = bodyFontSize,
                lineHeight = 20.sp,
                color = theme.textPrimary
            )
        }
    }
}

@Composable
private fun PreguntaClaveCardCartoon(
    index: Int,
    pregunta: com.jonsuapps.rastro.model.PreguntaClaveObra,
    theme: RastroPalette,
    bodyFontSize: androidx.compose.ui.unit.TextUnit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(theme.surface)
            .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(14.dp))
            .padding(14.dp)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color(0xFF059669)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Q$index",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Black,
                        color = Color.White
                    )
                }
                Text(
                    text = pregunta.pregunta,
                    fontSize = 14.5.sp,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary
                )
            }
            Text(
                text = pregunta.respuesta,
                fontSize = bodyFontSize,
                lineHeight = 20.sp,
                color = theme.textSecondary
            )
        }
    }
}
