package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.calculateZoom
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Calculate
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.theme.RastroPalette

private val periodicCategories = listOf(
    "Todos", "Alcalino", "Alcalinotérreo", "Metal de transición", "Metaloide",
    "Metales del bloque p", "No metal", "Halógeno", "Gas noble", "Lantánido", "Actínido"
)

@Composable
fun PeriodicTableDialog(theme: RastroPalette, onDismiss: () -> Unit) {
    val context = LocalContext.current
    var tableView by remember { mutableStateOf(true) }
    var zoom by remember { mutableFloatStateOf(1f) }
    var query by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("Todos") }
    var selectedElement by remember { mutableStateOf(PeriodicElementCatalog.elements.first()) }
    var isDetailExpanded by remember { mutableStateOf(false) }

    val filtered = remember(query, selectedCategory) {
        PeriodicElementCatalog.elements.filter { element ->
            val search = query.trim()
            (search.isBlank() || element.number.toString() == search ||
                element.symbol.contains(search, ignoreCase = true) || element.name.contains(search, ignoreCase = true)) &&
                (selectedCategory == "Todos" || selectedCategory == element.category)
        }
    }

    Dialog(onDismissRequest = onDismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.96f)
                .fillMaxHeight(0.93f)
                .widthIn(max = 560.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(26.dp)
        ) {
            Column(Modifier.fillMaxSize()) {
                // Cabecera Vibrante 3D con Gradiente Esmeralda
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Brush.horizontalGradient(listOf(Color(0xFF059669), Color(0xFF0D9488), Color(0xFF047857))))
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.White.copy(alpha = 0.2f))
                            .border(1.2.dp, Color.White.copy(alpha = 0.4f), RoundedCornerShape(12.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Outlined.Calculate, contentDescription = null, tint = Color.White, modifier = Modifier.size(22.dp))
                    }
                    Spacer(Modifier.width(10.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = "TABLA PERIÓDICA INTERACTIVA",
                            fontSize = 9.sp,
                            letterSpacing = 0.8.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFA7F3D0)
                        )
                        Text(
                            text = "118 elementos · Tabla completa",
                            color = Color.White,
                            fontWeight = FontWeight.Black,
                            fontSize = 15.sp,
                            maxLines = 1
                        )
                    }
                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(Color.Black.copy(alpha = 0.2f))
                    ) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = Color.White, modifier = Modifier.size(18.dp))
                    }
                }

                // Buscador con Estilo Sticker 3D
                OutlinedTextField(
                    value = query,
                    onValueChange = { query = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 8.dp),
                    singleLine = true,
                    placeholder = { Text("Buscar por símbolo, nombre o número (Fe, Au, Oxígeno, 26)...", fontSize = 11.5.sp) },
                    leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null, tint = Color(0xFF059669)) },
                    trailingIcon = {
                        if (query.isNotBlank()) {
                            IconButton(onClick = { query = "" }) {
                                Icon(Icons.Rounded.Close, contentDescription = "Limpiar", tint = theme.textSecondary, modifier = Modifier.size(16.dp))
                            }
                        }
                    },
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = theme.textPrimary,
                        unfocusedTextColor = theme.textPrimary,
                        focusedBorderColor = Color(0xFF059669),
                        unfocusedBorderColor = theme.borderSubtle,
                        focusedContainerColor = theme.surfaceAccent,
                        unfocusedContainerColor = theme.surfaceAccent
                    )
                )

                // Filtros de Categoría tipo Botones Mecánicos 3D
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                        .padding(horizontal = 12.dp, vertical = 2.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    periodicCategories.forEach { category ->
                        val isSelected = selectedCategory == category
                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                selectedCategory = category
                            },
                            containerColor = if (isSelected) Color(0xFF059669) else theme.surface,
                            bottomBevelColor = if (isSelected) Color(0xFF047857) else theme.cardBevel,
                            strokeColor = if (isSelected) Color(0xFF059669) else theme.strokeBorder,
                            strokeWidth = if (isSelected) 1.5.dp else 1.dp,
                            bevelHeight = 2.5.dp,
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
                        ) {
                            Text(
                                text = category,
                                fontSize = 10.5.sp,
                                fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                color = if (isSelected) Color.White else theme.textSecondary,
                                maxLines = 1
                            )
                        }
                    }
                }

                Column(Modifier.fillMaxWidth().padding(horizontal = 14.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        listOf(true to "Tabla", false to "Lista").forEach { (mode, label) ->
                            Sticker3dButton(onClick = { tableView = mode }, modifier = Modifier.weight(1f),
                                containerColor = if (tableView == mode) theme.accent else theme.surface,
                                bottomBevelColor = if (tableView == mode) theme.accentBevel else theme.cardBevel,
                                strokeColor = theme.strokeBorder, contentPadding = PaddingValues(8.dp)) {
                                Icon(if (mode) Icons.Rounded.GridView else Icons.Rounded.ViewList, null, Modifier.size(18.dp),
                                    tint = if (tableView == mode) com.jonsuapps.rastro.theme.onColor(theme.accent) else theme.textPrimary)
                                Spacer(Modifier.width(6.dp))
                                Text(label, fontWeight = FontWeight.Black, fontSize = 12.sp,
                                    color = if (tableView == mode) com.jonsuapps.rastro.theme.onColor(theme.accent) else theme.textPrimary)
                            }
                        }
                    }
                    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Text("${filtered.size} elementos", Modifier.weight(1f), fontSize = 11.sp, color = theme.textSecondary)
                        if (tableView) {
                            IconButton(onClick = { zoom = boundedPeriodicZoom(zoom, 1 / 1.2f) }) {
                                Icon(Icons.Rounded.ZoomOut, "Alejar", tint = theme.textPrimary)
                            }
                            TextButton(onClick = { zoom = 1f }) { Text("${(zoom * 100).toInt()}%", color = theme.textPrimary) }
                            IconButton(onClick = { zoom = boundedPeriodicZoom(zoom, 1.2f) }) {
                                Icon(Icons.Rounded.ZoomIn, "Acercar", tint = theme.textPrimary)
                            }
                        }
                    }
                }

                // ── GRILLA DE ELEMENTOS COLECCIONABLES 3D ──
                BoxWithConstraints(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    if (tableView) {
                        PeriodicTableLayout(theme, filtered, selectedElement.number, zoom, { zoom = it }) { element ->
                            DuolingoHaptics.playOptionSelected(context)
                            selectedElement = element; isDetailExpanded = true
                        }
                    } else {
                    val columns = if (maxWidth < 420.dp) 3 else 4
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(columns),
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(start = 10.dp, end = 10.dp, top = 4.dp, bottom = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(filtered, key = { it.number }) { element ->
                            val accent = Color(element.colorHex)
                            val isSelected = selectedElement.number == element.number

                            Sticker3dCard(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(90.dp)
                                    .clickable {
                                        DuolingoHaptics.playOptionSelected(context)
                                        selectedElement = element
                                        isDetailExpanded = true
                                    },
                                containerColor = if (isSelected) accent.copy(alpha = 0.15f) else theme.surface,
                                bottomBevelColor = if (isSelected) accent.copy(alpha = 0.7f) else theme.cardBevel,
                                strokeColor = if (isSelected) accent else theme.strokeBorder.copy(alpha = 0.4f),
                                strokeWidth = if (isSelected) 2.dp else 1.2.dp,
                                bevelHeight = 3.dp,
                                shape = RoundedCornerShape(14.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(horizontal = 7.dp, vertical = 6.dp),
                                    verticalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = "${element.number}",
                                            fontSize = 9.sp,
                                            fontWeight = FontWeight.Black,
                                            color = theme.textSecondary
                                        )
                                        Text(
                                            text = if (element.group == 0) "f" else "G${element.group}",
                                            fontSize = 8.5.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = accent
                                        )
                                    }
                                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                                        Text(
                                            text = element.symbol,
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Black,
                                            fontFamily = FontFamily.Serif,
                                            color = accent
                                        )
                                        Text(
                                            text = element.name,
                                            fontSize = 9.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textPrimary,
                                            maxLines = 1
                                        )
                                    }
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Text(
                                            text = element.mass,
                                            fontSize = 8.sp,
                                            color = theme.textSecondary,
                                            fontWeight = FontWeight.Medium
                                        )
                                    }
                                }
                            }
                        }
                    }
                    }
                }

                // ── PANEL INFERIOR DE DETALLE TÁCTIL 3D ──
                val heroAccent = Color(selectedElement.colorHex)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                        .background(theme.surfaceAccent)
                        .border(1.5.dp, theme.strokeBorder.copy(alpha = 0.4f), RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                        .padding(12.dp)
                ) {
                    Column(Modifier.heightIn(max = 180.dp).verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Ficha Gigante 3D del Elemento
                            Sticker3dCard(
                                modifier = Modifier.size(54.dp),
                                containerColor = heroAccent.copy(alpha = 0.15f),
                                bottomBevelColor = heroAccent.copy(alpha = 0.6f),
                                strokeColor = heroAccent,
                                bevelHeight = 3.dp,
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Text(
                                            text = "${selectedElement.number}",
                                            fontSize = 8.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textSecondary
                                        )
                                        Text(
                                            text = selectedElement.symbol,
                                            fontSize = 19.sp,
                                            fontWeight = FontWeight.Black,
                                            fontFamily = FontFamily.Serif,
                                            color = heroAccent
                                        )
                                    }
                                }
                            }

                            Spacer(Modifier.width(10.dp))

                            Column(Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = selectedElement.name,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Black,
                                        color = theme.textPrimary
                                    )
                                    Spacer(Modifier.width(6.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(6.dp))
                                            .background(heroAccent.copy(alpha = 0.15f))
                                            .padding(horizontal = 6.dp, vertical = 2.dp)
                                    ) {
                                        Text(
                                            text = selectedElement.category,
                                            fontSize = 9.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = heroAccent
                                        )
                                    }
                                }
                                Text(
                                    text = "Masa: ${selectedElement.mass}  ·  Bloque [${selectedElement.block}]  ·  Periodo ${selectedElement.period}  ·  Grupo ${if (selectedElement.group == 0) "—" else selectedElement.group}",
                                    fontSize = 10.sp,
                                    color = theme.textSecondary,
                                    fontWeight = FontWeight.Medium
                                )
                                if (selectedElement.electronConfig.isNotBlank()) {
                                    Text(
                                        text = "Configuración: ${selectedElement.electronConfig}",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF059669)
                                    )
                                }
                            }

                            // Valencias / Estados de Oxidación en Badges
                            Column(horizontalAlignment = Alignment.End) {
                                Text(
                                    text = "Estados de oxidación",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF059669)
                                )
                                Text(
                                    text = selectedElement.valences.joinToString(", ").ifBlank { "No disponible" },
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Black,
                                    color = heroAccent
                                )
                                if (selectedElement.electronegativity != "—") {
                                    Text(
                                        text = "EN: ${selectedElement.electronegativity}",
                                        fontSize = 9.5.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = theme.textSecondary
                                    )
                                }
                            }
                        }

                        // Tip de Examen UNSA / Pre-U
                        if (selectedElement.examTip.isNotBlank()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color(0xFFFEF3C7))
                                    .border(1.dp, Color(0xFFF59E0B), RoundedCornerShape(10.dp))
                                    .padding(horizontal = 10.dp, vertical = 6.dp)
                            ) {
                                Row(verticalAlignment = Alignment.Top) {
                                    Icon(
                                        imageVector = Icons.Rounded.Lightbulb,
                                        contentDescription = null,
                                        tint = Color(0xFFD97706),
                                        modifier = Modifier.size(15.dp)
                                    )
                                    Spacer(Modifier.width(6.dp))
                                    Text(
                                        text = "Fija Examen: ${selectedElement.examTip}",
                                        fontSize = 10.sp,
                                        color = Color(0xFF78350F),
                                        lineHeight = 13.5.sp
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


@Composable
private fun PeriodicTableLayout(theme: RastroPalette, filtered: List<PeriodicElement>, selected: Int,
    zoom: Float, onZoom: (Float) -> Unit, onSelect: (PeriodicElement) -> Unit) {
    val positions = remember { PeriodicElementCatalog.elements.associateBy(PeriodicElementCatalog::tablePosition) }
    val visible = remember(filtered) { filtered.map { it.number }.toSet() }
    val zoomState by rememberUpdatedState(zoom)
    val changeZoom by rememberUpdatedState(onZoom)
    Box(Modifier.fillMaxSize().pointerInput(Unit) {
        awaitEachGesture {
            awaitFirstDown(requireUnconsumed = false)
            do {
                val event = awaitPointerEvent()
                if (event.changes.count { it.pressed } >= 2) {
                    changeZoom(boundedPeriodicZoom(zoomState, event.calculateZoom()))
                    event.changes.forEach { it.consume() }
                }
            } while (event.changes.any { it.pressed })
        }
    }.horizontalScroll(rememberScrollState()).verticalScroll(rememberScrollState())) {
        Column(Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(5.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                (1..18).forEach { Text(it.toString(), Modifier.width(56.dp * zoom), color = theme.textSecondary,
                    fontSize = 10.sp, textAlign = androidx.compose.ui.text.style.TextAlign.Center) }
            }
            (1..9).forEach { row ->
                Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                    (1..18).forEach { column ->
                        val element = positions[row to column]
                        if (element == null) {
                            Box(Modifier.size(56.dp * zoom, 64.dp * zoom), contentAlignment = Alignment.Center) {
                                if (column == 3 && row in 6..7) Text(if (row == 6) "57–71 ↓" else "89–103 ↓",
                                    fontSize = 10.sp, color = theme.textSecondary)
                            }
                        } else {
                            val shown = element.number in visible
                            val accent = Color(element.colorHex)
                            Column(Modifier.size(56.dp * zoom, 64.dp * zoom)
                                .graphicsLayer { alpha = if (shown) 1f else 0.25f }
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected == element.number) theme.surfaceAccent else theme.surface)
                                .border(if (selected == element.number) 2.dp else 1.dp, accent, RoundedCornerShape(10.dp))
                                .clickable(enabled = shown) { onSelect(element) }.padding(4.dp),
                                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {
                                Text(element.number.toString(), color = theme.textSecondary, fontSize = 9.sp)
                                Text(element.symbol, color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = (18 * zoom).sp)
                                Text(element.mass, color = theme.textSecondary, fontSize = (8 * zoom).sp, maxLines = 1)
                            }
                        }
                    }
                }
            }
        }
    }
}

internal fun boundedPeriodicZoom(current: Float, factor: Float): Float =
    if (factor.isFinite() && factor > 0) (current * factor).coerceIn(0.6f, 2.25f) else current
