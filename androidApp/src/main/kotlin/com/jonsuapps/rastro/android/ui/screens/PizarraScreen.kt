package com.jonsuapps.rastro.android.ui.screens

import android.graphics.Bitmap
import android.graphics.Paint
import android.graphics.Path as AndroidPath
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.drag
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.Undo
import androidx.compose.material.icons.rounded.DeleteOutline
import androidx.compose.material.icons.rounded.GridOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * Controlador de Lienzo de Alta Velocidad (Hardware Accelerated Doble Búfer)
 * Diseñado con arquitectura tipo GoodNotes para 0ms de retraso táctil a 120 FPS.
 */
class GoodNotesCanvasEngine {
    var size: IntSize = IntSize.Zero
    var bitmap: Bitmap? = null
    var canvas: android.graphics.Canvas? = null

    // Pila de deshacer (Undo) de bitmaps en memoria
    val undoStack = ArrayDeque<Bitmap>()
    private val maxUndoSteps = 12

    // Trazo activo en curso
    val currentPath = AndroidPath()
    var currentPaint = Paint().apply {
        isAntiAlias = true
        isDither = true
        style = Paint.Style.STROKE
        strokeJoin = Paint.Join.ROUND
        strokeCap = Paint.Cap.ROUND
    }

    var isDrawing by mutableStateOf(false)
    var triggerRedraw by mutableLongStateOf(0L)
    var canUndo by mutableStateOf(false)

    fun resize(newWidth: Int, newHeight: Int) {
        if (newWidth <= 0 || newHeight <= 0) return
        if (size.width == newWidth && size.height == newHeight && bitmap != null) return

        size = IntSize(newWidth, newHeight)
        val oldBitmap = bitmap
        val newBitmap = Bitmap.createBitmap(newWidth, newHeight, Bitmap.Config.ARGB_8888)
        val newCanvas = android.graphics.Canvas(newBitmap)

        if (oldBitmap != null) {
            newCanvas.drawBitmap(oldBitmap, 0f, 0f, null)
            oldBitmap.recycle()
        } else {
            newCanvas.drawColor(android.graphics.Color.WHITE)
        }

        bitmap = newBitmap
        canvas = newCanvas
        triggerRedraw++
    }

    fun startStroke(x: Float, y: Float, color: Color, strokeWidth: Float) {
        currentPaint.color = color.toArgb()
        currentPaint.strokeWidth = strokeWidth
        currentPath.reset()
        currentPath.moveTo(x, y)
        isDrawing = true
        triggerRedraw++
    }

    fun continueStroke(x: Float, y: Float) {
        currentPath.lineTo(x, y)
        triggerRedraw++
    }

    fun finishStroke() {
        val bmp = bitmap
        val cvs = canvas
        if (bmp != null && cvs != null && !currentPath.isEmpty) {
            // Guardar copia para Undo antes de pintar permanentemente
            val snapshot = Bitmap.createBitmap(bmp)
            if (undoStack.size >= maxUndoSteps) {
                val old = undoStack.removeFirst()
                if (!old.isRecycled) old.recycle()
            }
            undoStack.addLast(snapshot)
            canUndo = true

            // Renderizado por hardware directo en el bitmap
            cvs.drawPath(currentPath, currentPaint)
        }
        currentPath.reset()
        isDrawing = false
        triggerRedraw++
    }

    fun undo() {
        if (undoStack.isNotEmpty()) {
            val previous = undoStack.removeLast()
            val cvs = canvas
            if (cvs != null) {
                // Restaurar el snapshot
                val p = Paint()
                cvs.drawBitmap(previous, 0f, 0f, p)
                previous.recycle()
                canUndo = undoStack.isNotEmpty()
                triggerRedraw++
            }
        }
    }

    fun clear() {
        val bmp = bitmap
        val cvs = canvas
        if (bmp != null && cvs != null) {
            val snapshot = Bitmap.createBitmap(bmp)
            if (undoStack.size >= maxUndoSteps) {
                val old = undoStack.removeFirst()
                if (!old.isRecycled) old.recycle()
            }
            undoStack.addLast(snapshot)
            canUndo = true

            cvs.drawColor(android.graphics.Color.WHITE)
            triggerRedraw++
        }
    }
}

/**
 * Pantalla Pizarra Libre (Arquitectura GoodNotes / 0ms Lag).
 * Utiliza rasterizado nativo de alto rendimiento por GPU para dibujar con fluidez instantánea.
 */
@Composable
fun PizarraScreen(
    onBack: () -> Unit
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current

    val engine = remember { GoodNotesCanvasEngine() }

    // Paleta de colores atractiva estilo estudio
    val palette = listOf(
        Color(0xFF0F172A), // Carbón escolar
        Color(0xFF2563EB), // Azul Royal
        Color(0xFFDC2626), // Rojo Corrector
        Color(0xFF16A34A), // Verde Esmeralda
        Color(0xFFF59E0B), // Ámbar Resaltador
        Color(0xFF8B5CF6), // Violeta Creativo
        Color(0xFFEC4899), // Rosa Fluorescente
        Color(0xFFFFFFFF)  // Blanco Borrador
    )

    val strokeSizes = listOf(4f, 9f, 18f, 32f)

    var currentColor by remember { mutableStateOf(Color(0xFF0F172A)) }
    var currentStrokeWidth by remember { mutableFloatStateOf(9f) }
    var showGrid by remember { mutableStateOf(true) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = theme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(14.dp)
        ) {
            // ─── HEADER DE HERRAMIENTAS RÁPIDAS ───
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Botón volver
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(theme.surface)
                            .border(2.dp, theme.strokeBorder, RoundedCornerShape(12.dp))
                            .bouncyClick(scaleDown = 0.90f) {
                                DuolingoHaptics.playOptionSelected(context)
                                onBack()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                            contentDescription = "Volver",
                            tint = theme.textPrimary,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Column {
                        Text(
                            text = "🎨 Pizarra Libre",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Trazos fluidos · 0ms retardo",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF10B981)
                        )
                    }
                }

                // Acciones: Cuadrícula, Deshacer y Limpiar
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    // Alternar Cuadrícula GoodNotes
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(if (showGrid) theme.accent.copy(alpha = 0.15f) else theme.surface)
                            .border(
                                2.dp,
                                if (showGrid) theme.accent else theme.strokeBorder,
                                RoundedCornerShape(12.dp)
                            )
                            .bouncyClick(scaleDown = 0.90f) {
                                DuolingoHaptics.playOptionSelected(context)
                                showGrid = !showGrid
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.GridOn,
                            contentDescription = "Cuadrícula GoodNotes",
                            tint = if (showGrid) theme.accent else theme.textSecondary,
                            modifier = Modifier.size(19.dp)
                        )
                    }

                    // Deshacer (Undo)
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(if (engine.canUndo) theme.surface else theme.surface.copy(alpha = 0.5f))
                            .border(2.dp, theme.strokeBorder, RoundedCornerShape(12.dp))
                            .bouncyClick(
                                scaleDown = 0.90f,
                                enabled = engine.canUndo
                            ) {
                                if (engine.canUndo) {
                                    DuolingoHaptics.playOptionSelected(context)
                                    engine.undo()
                                }
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.Undo,
                            contentDescription = "Deshacer trazo",
                            tint = if (engine.canUndo) theme.textPrimary else theme.textSecondary.copy(alpha = 0.35f),
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    // Limpiar todo (Clear)
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFFFEE2E2))
                            .border(2.dp, Color(0xFFEF4444), RoundedCornerShape(12.dp))
                            .bouncyClick(scaleDown = 0.90f) {
                                DuolingoHaptics.playCelebration(context)
                                engine.clear()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.DeleteOutline,
                            contentDescription = "Limpiar lienzo",
                            tint = Color(0xFFDC2626),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }

            // ─── LIENZO ACELERADO POR GPU (CANVAS ENGINE) ───
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(22.dp))
                    .background(Color.White)
                    .border(2.5.dp, theme.strokeBorder, RoundedCornerShape(22.dp))
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(22.dp))
                    .onSizeChanged { size ->
                        engine.resize(size.width, size.height)
                    }
            ) {
                Canvas(
                    modifier = Modifier
                        .fillMaxSize()
                        .pointerInput(currentColor, currentStrokeWidth) {
                            awaitEachGesture {
                                val down = awaitFirstDown()
                                engine.startStroke(
                                    down.position.x,
                                    down.position.y,
                                    currentColor,
                                    currentStrokeWidth
                                )

                                drag(down.id) { change ->
                                    change.consume()
                                    engine.continueStroke(change.position.x, change.position.y)
                                }

                                engine.finishStroke()
                            }
                        }
                ) {
                    // Leer trigger para redibujar en 0ms
                    engine.triggerRedraw

                    // 1. Cuadrícula de puntos sutiles estilo GoodNotes / Libreta punteada
                    if (showGrid) {
                        val spacing = 28.dp.toPx()
                        val dotRadius = 1.2.dp.toPx()
                        val dotColor = Color(0xFFE2E8F0)
                        var y = spacing
                        while (y < size.height) {
                            var x = spacing
                            while (x < size.width) {
                                drawCircle(
                                    color = dotColor,
                                    radius = dotRadius,
                                    center = Offset(x, y)
                                )
                                x += spacing
                            }
                            y += spacing
                        }
                    }

                    // 2. Renderizado del buffer en memoria
                    val bmp = engine.bitmap
                    if (bmp != null) {
                        drawIntoCanvas { canvas ->
                            canvas.nativeCanvas.drawBitmap(bmp, 0f, 0f, null)
                            // 3. Renderizado del trazo activo en tiempo real
                            if (engine.isDrawing && !engine.currentPath.isEmpty) {
                                canvas.nativeCanvas.drawPath(engine.currentPath, engine.currentPaint)
                            }
                        }
                    }
                }

                if (!engine.canUndo && !engine.isDrawing) {
                    Text(
                        text = "✍️ ¡Garabatea libremente aquí! (Modo GoodNotes)",
                        color = Color(0xFF94A3B8),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .background(Color(0xFFF8FAFC), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(12.dp))
                            .padding(horizontal = 14.dp, vertical = 8.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // ─── BARRA DE HERRAMIENTAS: PALETA Y GROSORES ───
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(18.dp))
                    .background(theme.surface)
                    .border(2.dp, theme.strokeBorder, RoundedCornerShape(18.dp))
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // Selector de colores vibrantes
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    palette.forEach { color ->
                        val isSelected = currentColor == color
                        val isEraser = color == Color(0xFFFFFFFF)

                        Box(
                            modifier = Modifier
                                .size(34.dp)
                                .clip(CircleShape)
                                .background(color)
                                .border(
                                    width = if (isSelected) 3.5.dp else 1.5.dp,
                                    color = if (isSelected) theme.accent else Color(0xFFCBD5E1),
                                    shape = CircleShape
                                )
                                .bouncyClick(scaleDown = 0.85f) {
                                    DuolingoHaptics.playOptionSelected(context)
                                    currentColor = color
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            if (isEraser) {
                                Text(
                                    text = "🧽",
                                    fontSize = 13.sp
                                )
                            }
                        }
                    }
                }

                // Selector de grosor de trazo
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Grosor:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textSecondary
                    )

                    strokeSizes.forEach { size ->
                        val isSelected = currentStrokeWidth == size
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(32.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(if (isSelected) theme.accent.copy(alpha = 0.15f) else theme.background)
                                .border(
                                    width = if (isSelected) 2.dp else 1.dp,
                                    color = if (isSelected) theme.accent else theme.borderSubtle,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clickable {
                                    DuolingoHaptics.playOptionSelected(context)
                                    currentStrokeWidth = size
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(
                                        width = (size * 1.5f).dp.coerceIn(8.dp, 28.dp),
                                        height = (size * 0.7f).dp.coerceIn(3.dp, 16.dp)
                                    )
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(if (isSelected) theme.accent else theme.textPrimary)
                            )
                        }
                    }
                }
            }
        }
    }
}
