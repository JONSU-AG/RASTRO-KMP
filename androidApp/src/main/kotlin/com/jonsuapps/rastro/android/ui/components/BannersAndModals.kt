package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.window.DialogProperties
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.jonsuapps.rastro.theme.RastroColors
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.RastroThemeId

/**
 * Diálogo de Selección de Temas (9 temas del ecosistema RASTRO, §4.5 del mapa).
 */
@Composable
fun ThemeSelectorDialog(
    currentThemeId: RastroThemeId,
    onSelectTheme: (RastroThemeId) -> Unit,
    onDismiss: () -> Unit
) {
    val theme = com.jonsuapps.rastro.theme.ThemeManager.currentTheme
    val context = androidx.compose.ui.platform.LocalContext.current
    // Editor "Crear mi tema" como diálogo independiente (abre directo, sin scroll).
    var showEditorDialog by remember { mutableStateOf(false) }
    // "Mi tema" solo existe si alguna vez se guardó (clave escrita únicamente en Guardar).
    var hasCustomTheme by remember {
        mutableStateOf(
            context.getSharedPreferences("rastro_preferences", android.content.Context.MODE_PRIVATE)
                .contains("custom_highlight")
        )
    }
    Dialog(
        onDismissRequest = onDismiss,
        properties = androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            shape = RoundedCornerShape(24.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            modifier = Modifier.fillMaxWidth(0.92f).widthIn(max = 440.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Seleccionar Tema",
                        fontSize = 18.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                        color = theme.textPrimary
                    )
                    IconButton(onClick = onDismiss) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Cerrar",
                            tint = theme.textSecondary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Cuadrícula responsive de tarjetas (3/2/1 columnas según ancho).
                // parseColor precalculado una sola vez: abrir "Crear mi tema" no debe repetirlo por item.
                val themeBgDots = remember {
                    RastroThemeId.entries.filter { it != RastroThemeId.CUSTOM }.associateWith { entry ->
                        runCatching { Color(android.graphics.Color.parseColor(entry.bgHex)) }.getOrDefault(Color.Gray)
                    }
                }
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(minSize = 150.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.heightIn(max = 430.dp)
                ) {
                    items(RastroThemeId.entries.filter { it != RastroThemeId.CUSTOM }) { themeItem ->
                        val isSelected = themeItem == currentThemeId
                        Column {
                            Surface(
                                shape = RastroShapes.ButtonSquircle,
                                color = if (isSelected) theme.accent.copy(alpha = 0.15f) else theme.surfaceAccent,
                                border = if (isSelected) androidx.compose.foundation.BorderStroke(2.dp, theme.accent) else androidx.compose.foundation.BorderStroke(1.dp, theme.strokeBorder.copy(alpha = 0.35f)),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        DuolingoHaptics.playOptionSelected(context)
                                        // "Mi tema" selecciona los colores guardados sin reiniciarlos.
                                        onSelectTheme(themeItem)
                                    }
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 16.dp, vertical = 12.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                                    ) {
                                        if (themeItem == RastroThemeId.CUSTOM) {
                                            // Muestra de los 3 colores
                                            Row(horizontalArrangement = Arrangement.spacedBy((-6).dp)) {
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(com.jonsuapps.rastro.theme.ThemeManager.customColors.primary)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(com.jonsuapps.rastro.theme.ThemeManager.customColors.secondary)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(com.jonsuapps.rastro.theme.ThemeManager.customColors.accent)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(com.jonsuapps.rastro.theme.ThemeManager.customColors.highlight)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                            }
                                        } else {
                                            // Muestra de color de fondo
                                            Box(
                                                modifier = Modifier
                                                    .size(24.dp)
                                                    .clip(CircleShape)
                                                    .background(themeBgDots[themeItem] ?: Color.Gray)
                                                    .border(1.5.dp, theme.strokeBorder, CircleShape)
                                            )
                                        }
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = themeItem.displayName,
                                                fontSize = 12.5.sp,
                                                fontWeight = if (isSelected) androidx.compose.ui.text.font.FontWeight.Bold else androidx.compose.ui.text.font.FontWeight.Medium,
                                                color = if (isSelected) theme.accent else theme.textPrimary,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                            if (themeItem == RastroThemeId.MATERIAL_YOU) {
                                                Text(
                                                    text = "Colores de tu dispositivo",
                                                    fontSize = 10.sp,
                                                    color = theme.textSecondary,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis
                                                )
                                            }
                                        }
                                    }

                                    if (isSelected) {
                                        Icon(
                                            imageVector = Icons.Default.Check,
                                            contentDescription = null,
                                            tint = theme.accent
                                        )
                                    }
                                }
                            }

                        }
                    }
                    // Acción "Crear mi tema": abre el editor directamente (sin scroll ni selección).
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        Surface(
                            shape = RastroShapes.ButtonSquircle,
                            color = theme.surfaceAccent,
                            border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder.copy(alpha = 0.5f)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    DuolingoHaptics.playOptionSelected(context)
                                    showEditorDialog = true
                                }
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clip(CircleShape)
                                        .background(theme.accent)
                                        .border(1.5.dp, theme.strokeBorder, CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.Add,
                                        contentDescription = null,
                                        tint = androidx.compose.ui.graphics.Color.White,
                                        modifier = Modifier.size(14.dp)
                                    )
                                }
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Crear mi tema",
                                        fontSize = 13.sp,
                                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                        color = theme.textPrimary
                                    )
                                    Text(
                                        text = "Elige libremente 4 colores",
                                        fontSize = 11.sp,
                                        color = theme.textSecondary
                                    )
                                }
                            }
                        }
                    }
                    if (hasCustomTheme) {
                        item(span = { GridItemSpan(maxLineSpan) }) {
                            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                Text(
                                    text = "MIS TEMAS",
                                    fontSize = 12.sp,
                                    fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                                    color = theme.textSecondary,
                                    letterSpacing = 1.sp
                                )
                                val customs = com.jonsuapps.rastro.theme.ThemeManager.customColors
                                val isCustomSelected = currentThemeId == RastroThemeId.CUSTOM
                                Surface(
                                    shape = RastroShapes.ButtonSquircle,
                                    color = if (isCustomSelected) theme.accent.copy(alpha = 0.15f) else theme.surfaceAccent,
                                    border = if (isCustomSelected) androidx.compose.foundation.BorderStroke(2.dp, theme.accent) else androidx.compose.foundation.BorderStroke(1.dp, theme.strokeBorder.copy(alpha = 0.35f)),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            DuolingoHaptics.playOptionSelected(context)
                                            onSelectTheme(RastroThemeId.CUSTOM)
                                        }
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 16.dp, vertical = 12.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                                        ) {
                                            Row(horizontalArrangement = Arrangement.spacedBy((-6).dp)) {
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(customs.primary)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(customs.secondary)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(customs.accent)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                                Box(
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .clip(CircleShape)
                                                        .background(customs.highlight)
                                                        .border(1.2.dp, theme.strokeBorder, CircleShape)
                                                )
                                            }
                                            Text(
                                                text = "Mi tema",
                                                fontSize = 12.5.sp,
                                                fontWeight = if (isCustomSelected) androidx.compose.ui.text.font.FontWeight.Bold else androidx.compose.ui.text.font.FontWeight.Medium,
                                                color = if (isCustomSelected) theme.accent else theme.textPrimary,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        }
                                        if (isCustomSelected) {
                                            Icon(
                                                imageVector = Icons.Default.Check,
                                                contentDescription = null,
                                                tint = theme.accent
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (showEditorDialog) {
                        item(span = { GridItemSpan(maxLineSpan) }) {
                            // El editor es ventana independiente; el item no dibuja nada.
                            CustomThemeEditorDialog(
                                theme = theme,
                                onSaved = { hasCustomTheme = true },
                                onDismiss = { showEditorDialog = false }
                            )
                        }
                    }
                }
            }
        }
    }
}


/**
 * Test Vocacional Profesional RIASEC basado en la metodología O*NET® Interest Profiler™.
 * Reemplaza la antigua implementación de 12 preguntas por la arquitectura profesional de 60 actividades
 * respetando el modelo RIASEC de John Holland, sin diagnósticos psicológicos y con neutralidad educativa.
 */
private fun composeColorToHsv(color: Color): FloatArray {
    val out = FloatArray(3)
    android.graphics.Color.RGBToHSV(
        (color.red * 255f + 0.5f).toInt().coerceIn(0, 255),
        (color.green * 255f + 0.5f).toInt().coerceIn(0, 255),
        (color.blue * 255f + 0.5f).toInt().coerceIn(0, 255),
        out
    )
    return out
}

private fun hsvToComposeColor(h: Float, s: Float, v: Float): Color {
    val c = android.graphics.Color.HSVToColor(
        floatArrayOf(h.coerceIn(0f, 360f), s.coerceIn(0f, 1f), v.coerceIn(0f, 1f))
    )
    return Color(c)
}

private fun composeColorToHex6(color: Color): String {
    val r = (color.red * 255f + 0.5f).toInt().coerceIn(0, 255)
    val g = (color.green * 255f + 0.5f).toInt().coerceIn(0, 255)
    val b = (color.blue * 255f + 0.5f).toInt().coerceIn(0, 255)
    return "#%02X%02X%02X".format(r, g, b)
}

private fun isDraftLight(color: Color): Boolean =
    (0.299f * color.red + 0.587f * color.green + 0.114f * color.blue) > 0.5f

/**
 * Selector visual completo de color (HSV + RGB + HEX sincronizados, ✓/X
 * transaccional). Todo parte del único estado [temp]: mover, RGB o HEX
 * representan siempre el mismo color. X descarta, ✓ confirma al editor.
 */
@Composable
private fun FullColorPickerDialog(
    theme: RastroColors,
    initial: Color,
    onConfirm: (Color) -> Unit,
    onDismiss: () -> Unit
) {
    var temp by remember(initial) { mutableStateOf(initial) }
    var hexText by remember(initial) { mutableStateOf(composeColorToHex6(initial)) }
    var hexError by remember { mutableStateOf(false) }
    var squareSize by remember { mutableStateOf(IntSize.Zero) }
    var barWidth by remember { mutableStateOf(0) }

    LaunchedEffect(temp) {
        val formatted = composeColorToHex6(temp)
        if (hexText != formatted) {
            hexText = formatted
            hexError = false
        }
    }

    val hsv = remember(temp) { composeColorToHsv(temp) }
    val hueColor = remember(hsv[0]) { hsvToComposeColor(hsv[0], 1f, 1f) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            shape = RoundedCornerShape(22.dp),
            color = theme.surface,
            border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
            modifier = Modifier.fillMaxWidth(0.92f).widthIn(max = 400.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(18.dp)
                    .heightIn(max = 600.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Elegir color",
                        fontSize = 17.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                        color = theme.textPrimary
                    )
                    IconButton(onClick = onDismiss) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Cancelar",
                            tint = theme.textSecondary
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                // Área saturación/brillo del tono actual.
                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(14.dp))
                        .onSizeChanged { squareSize = it }
                        .pointerInput(Unit) {
                            awaitEachGesture {
                                val down = awaitFirstDown()
                                fun applyAt(pos: Offset) {
                                    val s = (pos.x / squareSize.width.toFloat()).coerceIn(0f, 1f)
                                    val v = 1f - (pos.y / squareSize.height.toFloat()).coerceIn(0f, 1f)
                                    temp = hsvToComposeColor(hsv[0], s, v)
                                }
                                applyAt(down.position)
                                do {
                                    val event = awaitPointerEvent()
                                    val change = event.changes.firstOrNull() ?: break
                                    if (!change.pressed) break
                                    applyAt(change.position)
                                } while (true)
                            }
                        }
                ) {
                    drawRect(brush = androidx.compose.ui.graphics.Brush.horizontalGradient(listOf(Color.White, hueColor)))
                    drawRect(brush = androidx.compose.ui.graphics.Brush.verticalGradient(listOf(Color.Transparent, Color.Black)))
                    val px = hsv[1] * size.width
                    val py = (1f - hsv[2]) * size.height
                    drawCircle(color = Color.White, radius = 9f, center = Offset(px, py))
                    drawCircle(color = theme.textPrimary, radius = 9f, center = Offset(px, py), style = androidx.compose.ui.graphics.drawscope.Stroke(width = 3f))
                }

                // Barra de tono.
                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(26.dp)
                        .clip(RoundedCornerShape(13.dp))
                        .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(13.dp))
                        .onSizeChanged { barWidth = it.width }
                        .pointerInput(Unit) {
                            awaitEachGesture {
                                val down = awaitFirstDown()
                                fun applyHue(pos: Offset) {
                                    if (barWidth <= 0) return
                                    temp = hsvToComposeColor((pos.x / barWidth.toFloat()).coerceIn(0f, 1f) * 360f, hsv[1], hsv[2])
                                }
                                applyHue(down.position)
                                do {
                                    val event = awaitPointerEvent()
                                    val change = event.changes.firstOrNull() ?: break
                                    if (!change.pressed) break
                                    applyHue(change.position)
                                } while (true)
                            }
                        }
                ) {
                    val stops = listOf(
                        Color.Red, Color.Yellow, Color.Green, Color.Cyan, Color.Blue, Color.Magenta, Color.Red
                    )
                    drawRect(brush = androidx.compose.ui.graphics.Brush.horizontalGradient(stops))
                    val hx = (hsv[0] / 360f).coerceIn(0f, 1f) * size.width
                    drawCircle(color = Color.White, radius = 8f, center = Offset(hx, size.height / 2f))
                }

                // RGB 0-255.
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf(
                        "R" to temp.red,
                        "G" to temp.green,
                        "B" to temp.blue
                    ).forEach { (label, channel) ->
                        OutlinedTextField(
                            value = ((channel * 255f) + 0.5f).toInt().coerceIn(0, 255).toString(),
                            onValueChange = { raw ->
                                val v = raw.toIntOrNull()
                                if (v != null && v in 0..255) {
                                    val f = v / 255f
                                    temp = when (label) {
                                        "R" -> temp.copy(red = f)
                                        "G" -> temp.copy(green = f)
                                        else -> temp.copy(blue = f)
                                    }
                                }
                            },
                            label = { Text(label, fontSize = 11.sp) },
                            singleLine = true,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(10.dp)
                        )
                    }
                }

                // HEX.
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = hexText,
                        onValueChange = { raw ->
                            hexText = raw
                            val clean = raw.trim().removePrefix("#")
                            val parsed = if (clean.length == 6) {
                                runCatching { Color(("FF$clean").toULong(16)) }.getOrNull()
                            } else null
                            if (parsed != null) {
                                temp = parsed
                                hexError = false
                            } else {
                                hexError = clean.isNotEmpty()
                            }
                        },
                        label = { Text("HEX (#RRGGBB)", fontSize = 11.sp) },
                        singleLine = true,
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(10.dp),
                        isError = hexError
                    )
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(temp)
                            .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(12.dp))
                    )
                }
                if (hexError) {
                    Text(
                        "HEX inválido (6 dígitos, ej. #7E57C2)",
                        fontSize = 11.sp,
                        color = Color(0xFFEF4444),
                        fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
                    )
                }
                Text(
                    text = "R: ${((temp.red * 255f) + 0.5f).toInt()}  G: ${((temp.green * 255f) + 0.5f).toInt()}  B: ${((temp.blue * 255f) + 0.5f).toInt()}   ·   $hexText",
                    fontSize = 11.sp,
                    color = theme.textSecondary
                )

                } // Fin contenido desplazable: acciones siempre visibles.
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = onDismiss) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = null,
                            tint = theme.textSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Cancelar", color = theme.textSecondary, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = { onConfirm(temp) },
                        colors = ButtonDefaults.buttonColors(containerColor = theme.accent)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            tint = androidx.compose.ui.graphics.Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Elegir", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.ui.graphics.Color.White)
                    }
                }
            }
        }
    }
}

/**
 * Editor "Crear mi tema" como diálogo independiente (abre directo, sin scroll).
 * Borrador transaccional: los 4 colores viven aquí; solo GUARDAR persiste.
 * Cancelar conserva el Mi tema guardado anterior.
 */
@Composable
private fun CustomThemeEditorDialog(
    theme: RastroColors,
    onSaved: () -> Unit,
    onDismiss: () -> Unit
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    var pickerSlot by remember { mutableStateOf<Int?>(null) }
    var draftPrimary by remember { mutableStateOf(com.jonsuapps.rastro.theme.ThemeManager.customColors.primary) }
    var draftSecondary by remember { mutableStateOf(com.jonsuapps.rastro.theme.ThemeManager.customColors.secondary) }
    var draftAccent by remember { mutableStateOf(com.jonsuapps.rastro.theme.ThemeManager.customColors.accent) }
    var draftHighlight by remember { mutableStateOf(com.jonsuapps.rastro.theme.ThemeManager.customColors.highlight) }
    Dialog(
        onDismissRequest = onDismiss,
        properties = androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            shape = RoundedCornerShape(22.dp),
            color = theme.surface,
            border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
            modifier = Modifier.fillMaxWidth(0.94f).widthIn(max = 440.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(18.dp)
                    .heightIn(max = 600.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Crear mi tema",
                        fontSize = 17.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                        color = theme.textPrimary
                    )
                    IconButton(onClick = onDismiss) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Cerrar",
                            tint = theme.textSecondary
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                val slotDefs = remember(draftPrimary, draftSecondary, draftAccent, draftHighlight) {
                    listOf(
                    Triple("Color de la app", "Botones, iconos activos y elementos principales.", draftPrimary),
                    Triple("Color de las tarjetas", "Tarjetas, navbar y paneles.", draftSecondary),
                    Triple("Color para destacar", "Racha, indicadores y detalles especiales.", draftAccent),
                    Triple("Color del fondo", "Fondo general de las pantallas.", draftHighlight)
                    )
                }
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    slotDefs.forEachIndexed { index, (label, desc, colorValue) ->
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = theme.surfaceAccent,
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.strokeBorder.copy(alpha = 0.35f)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { pickerSlot = index }
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(30.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(colorValue)
                                        .border(1.5.dp, theme.strokeBorder, RoundedCornerShape(8.dp))
                                )
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(label, fontSize = 12.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = theme.textPrimary, maxLines = 1)
                                    Text(desc, fontSize = 10.sp, color = theme.textSecondary, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                }
                            }
                        }
                    }
                }
                Text(
                    text = "Color del texto — Automático",
                    fontSize = 11.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = theme.textSecondary
                )
                Text(
                    text = "RASTRO adapta automáticamente el color del texto para mantenerlo visible sobre cada fondo.",
                    fontSize = 10.5.sp,
                    color = theme.textSecondary
                )
                Text(
                    text = "Vista previa en tiempo real (se aplica solo al GUARDAR):",
                    fontSize = 11.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = theme.textSecondary
                )
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = draftPrimary,
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = draftSecondary,
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.strokeBorder.copy(alpha = 0.5f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Texto sobre tarjeta",
                                fontSize = 12.sp,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                color = if (isDraftLight(draftSecondary)) androidx.compose.ui.graphics.Color(0xFF0F172A) else androidx.compose.ui.graphics.Color.White,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(20.dp),
                                color = draftAccent,
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "Botón principal",
                                    fontSize = 12.sp,
                                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                    color = if (isDraftLight(draftAccent)) androidx.compose.ui.graphics.Color(0xFF0F172A) else androidx.compose.ui.graphics.Color.White,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(CircleShape)
                                    .background(draftHighlight)
                                    .border(1.5.dp, theme.strokeBorder, CircleShape)
                            )
                        }
                                    Text(
                                        text = "Texto sobre fondo",
                                        fontSize = 12.sp,
                                        color = if (isDraftLight(draftPrimary)) androidx.compose.ui.graphics.Color(0xFF0F172A) else androidx.compose.ui.graphics.Color.White
                                    )
                                }
                            }
                    } // Fin contenido desplazable: Guardar/Cancelar siempre visibles.
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancelar", color = theme.textSecondary, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            com.jonsuapps.rastro.theme.ThemeManager.setCustomTheme(draftPrimary, draftSecondary, draftAccent, draftHighlight)
                            val prefs = context.getSharedPreferences("rastro_preferences", android.content.Context.MODE_PRIVATE)
                            prefs.edit()
                                .putString("selected_theme", RastroThemeId.CUSTOM.idName)
                                .putInt("custom_primary", draftPrimary.toArgb())
                                .putInt("custom_secondary", draftSecondary.toArgb())
                                .putInt("custom_accent", draftAccent.toArgb())
                                .putInt("custom_highlight", draftHighlight.toArgb())
                                .apply()
                            onSaved()
                            onDismiss()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = theme.accent)
                    ) {
                        Text("Guardar y aplicar", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.ui.graphics.Color.White)
                    }
                }
            }
        }
    }
    val pickerDraft = when (pickerSlot) {
        0 -> draftPrimary
        1 -> draftSecondary
        2 -> draftAccent
        else -> draftHighlight
    }
    if (pickerSlot != null) {
        FullColorPickerDialog(
            theme = theme,
            initial = pickerDraft,
            onConfirm = { chosen ->
                when (pickerSlot) {
                    0 -> draftPrimary = chosen
                    1 -> draftSecondary = chosen
                    2 -> draftAccent = chosen
                    else -> draftHighlight = chosen
                }
                pickerSlot = null
            },
            onDismiss = { pickerSlot = null }
        )
    }
}

@Composable
fun VocationalTestDialog(
    colors: RastroColors,
    onDismiss: () -> Unit,
    onCompleteRuta: ((String) -> Unit)? = null
) {
    com.jonsuapps.rastro.android.ui.screens.VocationalTestScreen(
        onDismiss = onDismiss
    )
}

/* DEPRECATED_VOCATIONAL_DIALOG_REMOVED


                // ── ETAPA 0: INTRODUCCIÓN ────────────────────────────────────
                if (currentStep == 0) {
                    Column(
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        OrsttyMascot(
                            size = 80.dp,
                            mood = MascotMood.HAPPY
                        )
                        Spacer(Modifier.height(14.dp))
                        Text(
                            text = "Descubre tu Auténtica Vocación",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.textPrimary,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = "Evaluación psicométrica basada en la Teoría Tipológica de John Holland (RIASEC). Calibra tus intereses cognitivos, destrezas naturales y afinidad con las áreas preuniversitarias (Ingenierías, Biomédicas y Sociales).",
                            fontSize = 12.sp,
                            color = colors.textSecondary,
                            lineHeight = 17.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )

                        Spacer(Modifier.height(16.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            listOf(
                                "12 Preguntas" to Color(0xFF3B82F6),
                                "~3 Minutos" to Color(0xFF10B981),
                                "Cálculo Real" to Color(0xFFF59E0B)
                            ).forEach { (label, tint) ->
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(tint.copy(alpha = 0.12f))
                                        .border(1.2.dp, tint.copy(alpha = 0.35f), RoundedCornerShape(12.dp))
                                        .padding(vertical = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = label,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = tint
                                    )
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    Sticker3dButton(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            currentStep = 1
                        },
                        containerColor = Color(0xFF0D9488),
                        bottomBevelColor = Color(0xFF115E59),
                        strokeColor = colors.strokeBorder,
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier.fillMaxWidth().height(48.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Iniciar Evaluación Psicométrica", fontWeight = FontWeight.Black, color = Color.White, fontSize = 13.5.sp)
                            Spacer(Modifier.width(6.dp))
                            Icon(Icons.AutoMirrored.Rounded.ArrowForward, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                        }
                    }
                }

                // ── ETAPA 1..12: PREGUNTAS INTERACTIVAS ──────────────────────
                else if (currentStep in 1..12) {
                    val question = vocationalQuestionsList[currentStep - 1]
                    val progress = currentStep / 12f

                    Column(
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        // Barra de progreso 3D
                        Column {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Progreso del Test",
                                    fontSize = 10.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = colors.textSecondary
                                )
                                Text(
                                    text = "${(progress * 100).toInt()}%",
                                    fontSize = 10.5.sp,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFF0D9488)
                                )
                            }
                            Spacer(Modifier.height(5.dp))
                            LinearProgressIndicator(
                                progress = { progress },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp)),
                                color = Color(0xFF0D9488),
                                trackColor = colors.surfaceBorder
                            )
                        }

                        // Enunciado de la Pregunta
                        Sticker3dCard(
                            modifier = Modifier.fillMaxWidth(),
                            containerColor = colors.surfaceAccent,
                            bottomBevelColor = colors.cardBevel,
                            strokeColor = colors.strokeBorder,
                            bevelHeight = 3.dp,
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(Modifier.padding(14.dp)) {
                                Text(
                                    text = "Rasgo: ${question.riasecName}",
                                    fontSize = 9.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF0D9488)
                                )
                                Spacer(Modifier.height(6.dp))
                                Text(
                                    text = question.text,
                                    fontSize = 14.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = colors.textPrimary,
                                    lineHeight = 20.sp
                                )
                            }
                        }

                        Text(
                            text = "¿Cuánto te identifica esta afirmación?",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textSecondary
                        )

                        // 5 Opciones Táctiles de Escala Likert
                        val options = listOf(
                            5 to ("¡Me apasiona totalmente!" to Color(0xFF10B981)),
                            4 to ("Me interesa bastante" to Color(0xFF3B82F6)),
                            3 to ("Interés moderado / Neutro" to Color(0xFFF59E0B)),
                            2 to ("Poco interés" to Color(0xFFEC4899)),
                            1 to ("Nada de interés" to Color(0xFF64748B))
                        )

                        options.forEach { (value, pair) ->
                            val (labelText, optColor) = pair
                            val isSelected = answers[question.id] == value

                            Sticker3dButton(
                                onClick = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    answers[question.id] = value
                                    if (currentStep < 12) {
                                        currentStep++
                                    } else {
                                        DuolingoHaptics.playAnswerCorrect(context)
                                        currentStep = 13 // Mostrar resultados
                                    }
                                },
                                modifier = Modifier.fillMaxWidth().height(44.dp),
                                containerColor = if (isSelected) optColor else colors.surface,
                                bottomBevelColor = if (isSelected) optColor.copy(alpha = 0.7f) else colors.cardBevel,
                                strokeColor = if (isSelected) optColor else colors.strokeBorder,
                                strokeWidth = if (isSelected) 1.8.dp else 1.2.dp,
                                bevelHeight = 3.dp,
                                shape = RoundedCornerShape(12.dp),
                                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = labelText,
                                        fontSize = 12.sp,
                                        fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                        color = if (isSelected) Color.White else colors.textPrimary
                                    )
                                    Text(
                                        text = "$value pts",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSelected) Color.White.copy(alpha = 0.85f) else colors.textSecondary
                                    )
                                }
                            }
                        }
                    }
                }

                // ── ETAPA 13: RESULTADOS & PODIO PSICOMÉTRICO ─────────────────
                else {
                    // Cálculo de puntajes por área
                    var scoreIngenierias = 0
                    var scoreBiomedicas = 0
                    var scoreSociales = 0

                    vocationalQuestionsList.forEach { q ->
                        val ans = answers[q.id] ?: 3
                        when (q.areaPrimary) {
                            "INGENIERIAS" -> scoreIngenierias += ans * 2
                            "BIOMEDICAS" -> scoreBiomedicas += ans * 2
                            "SOCIALES" -> scoreSociales += ans * 2
                        }
                        q.areaSecondary?.let { sec ->
                            when (sec) {
                                "INGENIERIAS" -> scoreIngenierias += ans
                                "BIOMEDICAS" -> scoreBiomedicas += ans
                                "SOCIALES" -> scoreSociales += ans
                            }
                        }
                    }

                    val maxPossible = 50f
                    val pctIng = ((scoreIngenierias / maxPossible) * 100).toInt().coerceIn(42, 98)
                    val pctBio = ((scoreBiomedicas / maxPossible) * 100).toInt().coerceIn(40, 98)
                    val pctSoc = ((scoreSociales / maxPossible) * 100).toInt().coerceIn(41, 98)

                    val topArea = when {
                        pctBio >= pctIng && pctBio >= pctSoc -> "BIOMEDICAS"
                        pctIng >= pctBio && pctIng >= pctSoc -> "INGENIERIAS"
                        else -> "SOCIALES"
                    }

                    val topCareer = when (topArea) {
                        "BIOMEDICAS" -> "Medicina Humana"
                        "INGENIERIAS" -> "Ingeniería de Sistemas"
                        else -> "Derecho"
                    }
                    val topCorte = when (topArea) {
                        "BIOMEDICAS" -> "84.50 pts"
                        "INGENIERIAS" -> "78.40 pts"
                        else -> "74.20 pts"
                    }
                    val riasecTopDesc = when (topArea) {
                        "BIOMEDICAS" -> "Investigador - Social (I-S)"
                        "INGENIERIAS" -> "Investigador - Realista (I-R)"
                        else -> "Emprendedor - Social (E-S)"
                    }
                    val secondaryCareers = when (topArea) {
                        "BIOMEDICAS" -> listOf("Biología Celular y Genética (88% afinidad)", "Enfermería (85% afinidad)")
                        "INGENIERIAS" -> listOf("Ingeniería Civil (91% afinidad)", "Ingeniería Industrial (87% afinidad)")
                        else -> listOf("Psicología (89% afinidad)", "Economía y Finanzas (86% afinidad)")
                    }

                    Column(
                        modifier = Modifier.weight(1f).fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            OrsttyMascot(size = 48.dp, mood = MascotMood.HAPPY)
                            Spacer(Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "¡Diagnóstico Completado!",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Black,
                                    color = colors.textPrimary
                                )
                                Text(
                                    text = "Perfil Predominante: $riasecTopDesc",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF0D9488)
                                )
                            }
                        }

                        // Tarjeta Principal de la Carrera Recomendada
                        Sticker3dCard(
                            modifier = Modifier.fillMaxWidth(),
                            containerColor = Color(0xFFFEF3C7),
                            bottomBevelColor = Color(0xFFD97706),
                            strokeColor = Color(0xFFF59E0B),
                            bevelHeight = 4.dp,
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(Modifier.padding(14.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text("⭐ 1ª AFINIDAD PRINCIPAL", fontSize = 10.sp, fontWeight = FontWeight.Black, color = Color(0xFFB45309))
                                    Text("Corte ref: $topCorte", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color(0xFF92400E))
                                }
                                Spacer(Modifier.height(4.dp))
                                Text(
                                    text = topCareer,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFF78350F)
                                )
                                Text(
                                    text = "Tu perfil muestra una marcada predisposición hacia los núcleos cognitivos de esta carrera.",
                                    fontSize = 11.sp,
                                    color = Color(0xFF92400E),
                                    lineHeight = 15.sp
                                )
                            }
                        }

                        // Desglose por Áreas Preuniversitarias
                        Text(
                            text = "Afinidad por Áreas de Admisión:",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textPrimary
                        )

                        listOf(
                            Triple("🧬 Biomédicas y Salud", pctBio, Color(0xFF10B981)),
                            Triple("📐 Ingenierías y Ciencias", pctIng, Color(0xFF0284C7)),
                            Triple("⚖️ Sociales y Humanidades", pctSoc, Color(0xFF8B5CF6))
                        ).forEach { (areaName, pct, barColor) ->
                            Column(Modifier.fillMaxWidth()) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(areaName, fontSize = 11.5.sp, fontWeight = FontWeight.Bold, color = colors.textPrimary)
                                    Text("$pct%", fontSize = 11.5.sp, fontWeight = FontWeight.Black, color = barColor)
                                }
                                Spacer(Modifier.height(3.dp))
                                LinearProgressIndicator(
                                    progress = { pct / 100f },
                                    modifier = Modifier.fillMaxWidth().height(6.dp).clip(RoundedCornerShape(3.dp)),
                                    color = barColor,
                                    trackColor = colors.surfaceBorder
                                )
                            }
                        }

                        // Carreras secundarias afines
                        Text(
                            text = "Otras carreras altamente compatibles:",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textSecondary
                        )
                        secondaryCareers.forEach { careerDesc ->
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Rounded.CheckCircle, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(14.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(careerDesc, fontSize = 11.5.sp, color = colors.textPrimary)
                            }
                        }
                    }

                    Spacer(Modifier.height(10.dp))

                    Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playAnswerCorrect(context)
                                onCompleteRuta(topCareer)
                            },
                            containerColor = Color(0xFF0D9488),
                            bottomBevelColor = Color(0xFF115E59),
                            strokeColor = colors.strokeBorder,
                            shape = RoundedCornerShape(16.dp),
                            modifier = Modifier.fillMaxWidth().height(48.dp)
                        ) {
                            Text("Fijar $topCareer y Comenzar Ruta", fontWeight = FontWeight.Black, color = Color.White, fontSize = 13.5.sp)
                        }

                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                answers.clear()
                                currentStep = 1
                            },
                            containerColor = colors.surfaceAccent,
                            bottomBevelColor = colors.cardBevel,
                            strokeColor = colors.strokeBorder,
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier.fillMaxWidth().height(40.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Rounded.Refresh, contentDescription = null, tint = colors.textPrimary, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text("Repetir Evaluación", fontWeight = FontWeight.Bold, color = colors.textPrimary, fontSize = 12.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}
*/

/**
 * Diálogo de confirmación o acción estilo Sticker / Cartoon 3D:
 * Reemplaza los Alert Dialogs genéricos y planos de Android por una experiencia visual
 * vibrante, con contorno definido, bisel y botones físicos tridimensionales (no planos).
 */
@Composable
fun RastroStickerDialog(
    onDismissRequest: () -> Unit,
    title: String,
    message: String,
    confirmText: String = "Aceptar",
    cancelText: String = "Cancelar",
    confirmColor: Color = Color(0xFFF472B6), // Rosa vívido de referencia
    confirmTextColor: Color = Color.White,
    onConfirm: () -> Unit,
    icon: androidx.compose.ui.graphics.vector.ImageVector? = null,
    isDestructive: Boolean = false,
    headerContent: (@Composable () -> Unit)? = null,
    stackButtons: Boolean = false,
    theme: com.jonsuapps.rastro.theme.RastroPalette = com.jonsuapps.rastro.theme.ThemeManager.currentTheme
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            shape = RoundedCornerShape(26.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            modifier = Modifier.fillMaxWidth(0.92f).widthIn(max = 440.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Cabecera: Mascota personalizada o Icono Sticker
                if (headerContent != null) {
                    headerContent()
                    Spacer(Modifier.height(14.dp))
                } else if (icon != null) {
                    Box(
                        modifier = Modifier
                            .size(54.dp)
                            .clip(RoundedCornerShape(18.dp))
                            .background(if (isDestructive) Color(0xFFFEE2E2) else theme.accent.copy(alpha = 0.15f))
                            .border(
                                2.dp,
                                if (isDestructive) Color(0xFFEF4444) else theme.strokeBorder,
                                RoundedCornerShape(18.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = if (isDestructive) Color(0xFFDC2626) else theme.accent,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                }

                // Título
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                    color = theme.textPrimary,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center
                )

                Spacer(Modifier.height(8.dp))

                // Mensaje
                Text(
                    text = message,
                    style = MaterialTheme.typography.bodyMedium,
                    color = theme.textSecondary,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    lineHeight = 20.sp
                )

                Spacer(Modifier.height(22.dp))

                // Botón Confirmar Sticker 3D con Bevel físico
                val actualConfirmColor = if (isDestructive) Color(0xFFEF4444) else confirmColor
                val bottomBevel = if (isDestructive) Color(0xFF991B1B) else theme.accentBevel

                if (stackButtons) {
                    // Diseño vertical: Botón principal arriba, secundario abajo
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Sticker3dButton(
                            onClick = onDismissRequest,
                            modifier = Modifier.fillMaxWidth().height(48.dp),
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(16.dp),
                            bevelHeight = 3.5.dp,
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = cancelText,
                                color = Color.White,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                                fontSize = 13.sp,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                        }

                        Sticker3dButton(
                            onClick = {
                                if (isDestructive) DuolingoHaptics.playAnswerIncorrect(context)
                                else DuolingoHaptics.playAnswerCorrect(context)
                                onConfirm()
                                onDismissRequest()
                            },
                            modifier = Modifier.fillMaxWidth().height(46.dp),
                            containerColor = actualConfirmColor,
                            bottomBevelColor = bottomBevel,
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(16.dp),
                            bevelHeight = 3.5.dp,
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = confirmText,
                                color = confirmTextColor,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                                fontSize = 13.sp,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                        }
                    }
                } else {
                    // Diseño horizontal: 2 botones con altura suficiente para evitar que el texto se corte
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Botón Cancelar Sticker 3D (No plano)
                        Sticker3dButton(
                            onClick = onDismissRequest,
                            shape = RoundedCornerShape(16.dp),
                            containerColor = theme.surfaceAccent,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.5.dp,
                            modifier = Modifier
                                .weight(1f)
                                .height(52.dp),
                            contentPadding = PaddingValues(horizontal = 6.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = cancelText,
                                color = theme.textPrimary,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                                fontSize = 11.5.sp,
                                lineHeight = 14.sp,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                maxLines = 2
                            )
                        }

                        Sticker3dButton(
                            onClick = {
                                if (isDestructive) DuolingoHaptics.playAnswerIncorrect(context)
                                else DuolingoHaptics.playAnswerCorrect(context)
                                onConfirm()
                                onDismissRequest()
                            },
                            containerColor = actualConfirmColor,
                            bottomBevelColor = bottomBevel,
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(16.dp),
                            bevelHeight = 3.5.dp,
                            modifier = Modifier
                                .weight(1.15f)
                                .height(52.dp),
                            contentPadding = PaddingValues(horizontal = 6.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = confirmText,
                                color = confirmTextColor,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                                fontSize = 11.5.sp,
                                lineHeight = 14.sp,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                maxLines = 2
                            )
                        }
                    }
                }
            }
        }
    }
}
