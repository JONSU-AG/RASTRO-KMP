package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
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
    "Metales del bloque p", "No metal", "Halógeno", "Gas noble"
)

@Composable
fun PeriodicTableDialog(theme: RastroPalette, onDismiss: () -> Unit) {
    val context = LocalContext.current
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
                            text = "Elementos, Valencias & Tips Pre-U",
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

                // Subbarra de Conteo
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Mostrando ${filtered.size} elementos",
                        fontSize = 11.sp,
                        color = Color(0xFF059669),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Seleccionado: ${selectedElement.symbol} (${selectedElement.name})",
                        fontSize = 11.sp,
                        color = theme.textSecondary,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1
                    )
                }

                // ── GRILLA DE ELEMENTOS COLECCIONABLES 3D ──
                BoxWithConstraints(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
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
                                            text = "G${element.group}",
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
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
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
                                    text = "Masa: ${selectedElement.mass}  ·  Bloque [${selectedElement.block}]  ·  Periodo ${selectedElement.period}  ·  Grupo ${selectedElement.group}",
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
                                    text = "Valencias",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF059669)
                                )
                                Text(
                                    text = selectedElement.valences.joinToString(", "),
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

