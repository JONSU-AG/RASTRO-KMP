package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * AcademicIllustration: Sistema centralizado de ilustraciones académicas estilo OpenMoji / Twemoji
 * con estética doodle, cartoon, contornos definidos y paleta colorida amigable.
 *
 * Resuelve automáticamente el SVG/vector según el concepto pedagógico indicado por la data.
 */
object AcademicIllustrationsCatalog {
    fun resolveConcept(raw: String): String {
        val normalized = raw.lowercase().trim()
        return when {
            normalized.contains("popup") || normalized.contains("presentacion") -> "popup_hero"
            normalized.contains("zool") || normalized.contains("animal") || normalized.contains("mastozoo") || normalized.contains("ornit") || normalized.contains("ictio") -> "zoologia"
            normalized.contains("botan") || normalized.contains("planta") || normalized.contains("fitol") || normalized.contains("flora") -> "botanica"
            normalized.contains("quim") || normalized.contains("matraz") || normalized.contains("molecul") || normalized.contains("laboratorio") || normalized.contains("reaccion") -> "quimica"
            normalized.contains("fisic") || normalized.contains("atomo") || normalized.contains("energi") || normalized.contains("cinemat") || normalized.contains("dinam") || normalized.contains("vector") || normalized.contains("fuerza") || normalized.contains("electr") -> "fisica"
            normalized.contains("mate") || normalized.contains("algeb") || normalized.contains("geom") || normalized.contains("trigono") || normalized.contains("aritmet") || normalized.contains("numero") || normalized.contains("calcul") -> "matematica"
            normalized.contains("geog") || normalized.contains("mapa") || normalized.contains("tierra") || normalized.contains("cartog") || normalized.contains("espacio") -> "geografia"
            normalized.contains("liter") || normalized.contains("libro") || normalized.contains("novela") || normalized.contains("lenguaj") || normalized.contains("verbal") || normalized.contains("gramat") || normalized.contains("lector") -> "literatura"
            normalized.contains("hist") || normalized.contains("peru") || normalized.contains("cultur") || normalized.contains("civic") || normalized.contains("constituc") || normalized.contains("derecho") -> "historia"
            normalized.contains("psic") || normalized.contains("cerebro") || normalized.contains("mente") || normalized.contains("filosof") -> "psicologia"
            normalized.contains("biol") || normalized.contains("adn") || normalized.contains("vida") || normalized.contains("celul") || normalized.contains("organism") || normalized.contains("ecolog") -> "biologia"
            else -> "popup_hero"
        }
    }

    /**
     * Mapeo de códigos hexadecimales oficiales OpenMoji y Twemoji
     */
    fun getOpenMojiHex(concept: String): String {
        return when (concept) {
            "zoologia" -> "1F436" // Perro doodle OpenMoji
            "botanica" -> "1F331" // Plántula / brote verde OpenMoji
            "biologia" -> "1F9EC" // ADN
            "quimica" -> "1F9EA" // Tubo de ensayo / matraz
            "fisica" -> "269B"  // Átomo
            "matematica" -> "1F522" // 1234 números
            "geografia" -> "1F30D" // Globo terráqueo
            "literatura" -> "1F4DA" // Libros apilados
            "historia" -> "1F4DC" // Papiro / pergamino
            "psicologia" -> "1F9E0" // Cerebro
            else -> "1F4DA"
        }
    }
}

@Composable
fun AcademicIllustration(
    concept: String,
    modifier: Modifier = Modifier,
    size: Dp = 48.dp
) {
    val resolved = AcademicIllustrationsCatalog.resolveConcept(concept)

    Box(
        modifier = modifier.size(size),
        contentAlignment = Alignment.Center
    ) {
        when (resolved) {
            "popup_hero" -> AcademicPopupHeroBooks(modifier = Modifier.fillMaxSize())
            "zoologia" -> ZoologyCatDoodle(modifier = Modifier.fillMaxSize())
            "botanica" -> BotanyPlantDoodle(modifier = Modifier.fillMaxSize())
            "quimica" -> ChemistryFlaskDoodle(modifier = Modifier.fillMaxSize())
            "fisica" -> PhysicsAtomDoodle(modifier = Modifier.fillMaxSize())
            "literatura" -> LiteratureBooksDoodle(modifier = Modifier.fillMaxSize())
            "psicologia" -> PsychologyBrainDoodle(modifier = Modifier.fillMaxSize())
            else -> BiologyDnaDoodle(modifier = Modifier.fillMaxSize())
        }
    }
}

/**
 * Ilustración exacta de la zona visual del POPUP (Captura 1):
 * Pila de libros coloridos (azul, blanco/amarillo) con plantas verdes y brotes estilizados
 * tipo doodle/sticker con trazos negros marcados estilo OpenMoji.
 */
@Composable
fun AcademicPopupHeroBooks(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        // Hojas superiores y laterales (Plantas OpenMoji)
        val leafGreen = Color(0xFF48BB78)
        val leafDark = Color(0xFF2F855A)
        val outlineColor = Color(0xFF1A202C)
        val strokeW = (w * 0.038f).coerceAtLeast(2f)

        // Hoja izquierda
        val leafPathLeft = Path().apply {
            moveTo(w * 0.28f, h * 0.40f)
            cubicTo(w * 0.15f, h * 0.32f, w * 0.18f, h * 0.18f, w * 0.32f, h * 0.22f)
            cubicTo(w * 0.38f, h * 0.26f, w * 0.36f, h * 0.36f, w * 0.28f, h * 0.40f)
            close()
        }
        drawPath(leafPathLeft, leafGreen, style = Fill)
        drawPath(leafPathLeft, outlineColor, style = Stroke(width = strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Hoja central alta
        val leafPathCenter = Path().apply {
            moveTo(w * 0.50f, h * 0.38f)
            cubicTo(w * 0.35f, h * 0.16f, w * 0.45f, h * 0.05f, w * 0.50f, h * 0.04f)
            cubicTo(w * 0.55f, h * 0.05f, w * 0.65f, h * 0.16f, w * 0.50f, h * 0.38f)
            close()
        }
        drawPath(leafPathCenter, leafGreen, style = Fill)
        drawPath(leafPathCenter, outlineColor, style = Stroke(width = strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Nervadura central
        drawLine(
            color = outlineColor,
            start = Offset(w * 0.50f, h * 0.36f),
            end = Offset(w * 0.50f, h * 0.12f),
            strokeWidth = strokeW * 0.8f,
            cap = StrokeCap.Round
        )

        // Hoja derecha
        val leafPathRight = Path().apply {
            moveTo(w * 0.70f, h * 0.40f)
            cubicTo(w * 0.82f, h * 0.32f, w * 0.80f, h * 0.18f, w * 0.66f, h * 0.22f)
            cubicTo(w * 0.60f, h * 0.26f, w * 0.62f, h * 0.36f, w * 0.70f, h * 0.40f)
            close()
        }
        drawPath(leafPathRight, leafDark, style = Fill)
        drawPath(leafPathRight, outlineColor, style = Stroke(width = strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Hojas inferiores laterales pequeñas
        val leafPathSmall = Path().apply {
            moveTo(w * 0.88f, h * 0.65f)
            cubicTo(w * 0.98f, h * 0.58f, w * 0.95f, h * 0.48f, w * 0.82f, h * 0.52f)
            cubicTo(w * 0.78f, h * 0.56f, w * 0.80f, h * 0.63f, w * 0.88f, h * 0.65f)
            close()
        }
        drawPath(leafPathSmall, leafGreen, style = Fill)
        drawPath(leafPathSmall, outlineColor, style = Stroke(width = strokeW * 0.8f, cap = StrokeCap.Round))

        // Pila de libros
        // Libro 1 (superior - celeste/azul)
        val b1Y = h * 0.44f
        val b1H = h * 0.15f
        val b1W = w * 0.64f
        val b1X = w * 0.18f
        drawRoundRect(
            color = Color(0xFF38BDF8),
            topLeft = Offset(b1X, b1Y),
            size = Size(b1W, b1H),
            cornerRadius = CornerRadius(6.dp.toPx(), 6.dp.toPx()),
            style = Fill
        )
        // Páginas blancas del libro 1
        drawRect(
            color = Color.White,
            topLeft = Offset(b1X + b1W * 0.25f, b1Y + b1H * 0.2f),
            size = Size(b1W * 0.7f, b1H * 0.6f)
        )
        drawRoundRect(
            color = outlineColor,
            topLeft = Offset(b1X, b1Y),
            size = Size(b1W, b1H),
            cornerRadius = CornerRadius(6.dp.toPx(), 6.dp.toPx()),
            style = Stroke(width = strokeW)
        )

        // Libro 2 (medio - azul marino / índigo)
        val b2Y = h * 0.60f
        val b2H = h * 0.16f
        val b2W = w * 0.70f
        val b2X = w * 0.15f
        drawRoundRect(
            color = Color(0xFF3182CE),
            topLeft = Offset(b2X, b2Y),
            size = Size(b2W, b2H),
            cornerRadius = CornerRadius(6.dp.toPx(), 6.dp.toPx()),
            style = Fill
        )
        // Páginas blancas del libro 2
        drawRect(
            color = Color.White,
            topLeft = Offset(b2X + b2W * 0.22f, b2Y + b2H * 0.2f),
            size = Size(b2W * 0.72f, b2H * 0.6f)
        )
        drawRoundRect(
            color = outlineColor,
            topLeft = Offset(b2X, b2Y),
            size = Size(b2W, b2H),
            cornerRadius = CornerRadius(6.dp.toPx(), 6.dp.toPx()),
            style = Stroke(width = strokeW)
        )

        // Libro 3 (base - verde bosque / esmeralda)
        val b3Y = h * 0.77f
        val b3H = h * 0.17f
        val b3W = w * 0.76f
        val b3X = w * 0.12f
        drawRoundRect(
            color = Color(0xFF22C55E),
            topLeft = Offset(b3X, b3Y),
            size = Size(b3W, b3H),
            cornerRadius = CornerRadius(7.dp.toPx(), 7.dp.toPx()),
            style = Fill
        )
        // Páginas blancas del libro 3
        drawRect(
            color = Color.White,
            topLeft = Offset(b3X + b3W * 0.20f, b3Y + b3H * 0.2f),
            size = Size(b3W * 0.75f, b3H * 0.6f)
        )
        drawRoundRect(
            color = outlineColor,
            topLeft = Offset(b3X, b3Y),
            size = Size(b3W, b3H),
            cornerRadius = CornerRadius(7.dp.toPx(), 7.dp.toPx()),
            style = Stroke(width = strokeW)
        )
    }
}

/**
 * Doodle ilustrado de Zoología (perrito / gatito caricatura estilo OpenMoji)
 * como en la Captura 2 al lado de Zoología.
 */
@Composable
fun ZoologyCatDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.05f).coerceAtLeast(2f)
        val outline = Color(0xFF2D3748)
        val orangeFur = Color(0xFFFF9800)
        val creamFur = Color(0xFFFFF3E0)

        // Orejas
        val leftEar = Path().apply {
            moveTo(w * 0.22f, h * 0.40f)
            lineTo(w * 0.15f, h * 0.15f)
            lineTo(w * 0.40f, h * 0.25f)
            close()
        }
        drawPath(leftEar, orangeFur, style = Fill)
        drawPath(leftEar, outline, style = Stroke(strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        val rightEar = Path().apply {
            moveTo(w * 0.78f, h * 0.40f)
            lineTo(w * 0.85f, h * 0.15f)
            lineTo(w * 0.60f, h * 0.25f)
            close()
        }
        drawPath(rightEar, orangeFur, style = Fill)
        drawPath(rightEar, outline, style = Stroke(strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Cabeza redonda
        drawCircle(
            color = orangeFur,
            radius = w * 0.38f,
            center = Offset(w * 0.5f, h * 0.52f)
        )
        // Hocico claro
        drawOval(
            color = creamFur,
            topLeft = Offset(w * 0.32f, h * 0.50f),
            size = Size(w * 0.36f, h * 0.30f)
        )
        // Ojos
        drawCircle(color = outline, radius = w * 0.055f, center = Offset(w * 0.38f, h * 0.48f))
        drawCircle(color = Color.White, radius = w * 0.02f, center = Offset(w * 0.365f, h * 0.465f))
        drawCircle(color = outline, radius = w * 0.055f, center = Offset(w * 0.62f, h * 0.48f))
        drawCircle(color = Color.White, radius = w * 0.02f, center = Offset(w * 0.605f, h * 0.465f))

        // Naricita marrón / oscura
        val nosePath = Path().apply {
            moveTo(w * 0.46f, h * 0.58f)
            lineTo(w * 0.54f, h * 0.58f)
            lineTo(w * 0.50f, h * 0.63f)
            close()
        }
        drawPath(nosePath, Color(0xFF6D4C41), style = Fill)

        // Contorno de cabeza
        drawCircle(
            color = outline,
            radius = w * 0.38f,
            center = Offset(w * 0.5f, h * 0.52f),
            style = Stroke(strokeW)
        )

        // Mejillas rosadas
        drawCircle(color = Color(0xFFFF8A80).copy(alpha = 0.6f), radius = w * 0.05f, center = Offset(w * 0.25f, h * 0.58f))
        drawCircle(color = Color(0xFFFF8A80).copy(alpha = 0.6f), radius = w * 0.05f, center = Offset(w * 0.75f, h * 0.58f))
    }
}

/**
 * Doodle ilustrado de Botánica (hojas / planta verde estilo OpenMoji)
 * como en la Captura 2 al lado de Botánica.
 */
@Composable
fun BotanyPlantDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.05f).coerceAtLeast(2f)
        val outline = Color(0xFF1B4332)
        val lightGreen = Color(0xFF52B788)
        val darkGreen = Color(0xFF2D6A4F)

        // Maceta o tallo
        val stemPath = Path().apply {
            moveTo(w * 0.5f, h * 0.88f)
            cubicTo(w * 0.5f, h * 0.65f, w * 0.48f, h * 0.45f, w * 0.5f, h * 0.30f)
        }
        drawPath(stemPath, darkGreen, style = Stroke(strokeW * 1.2f, cap = StrokeCap.Round))

        // Hoja grande izquierda
        val leafLeft = Path().apply {
            moveTo(w * 0.50f, h * 0.55f)
            cubicTo(w * 0.15f, h * 0.50f, w * 0.10f, h * 0.28f, w * 0.42f, h * 0.32f)
            cubicTo(w * 0.48f, h * 0.34f, w * 0.50f, h * 0.45f, w * 0.50f, h * 0.55f)
            close()
        }
        drawPath(leafLeft, lightGreen, style = Fill)
        drawPath(leafLeft, outline, style = Stroke(strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Hoja derecha alta
        val leafRight = Path().apply {
            moveTo(w * 0.50f, h * 0.45f)
            cubicTo(w * 0.85f, h * 0.40f, w * 0.90f, h * 0.18f, w * 0.58f, h * 0.22f)
            cubicTo(w * 0.52f, h * 0.24f, w * 0.50f, h * 0.35f, w * 0.50f, h * 0.45f)
            close()
        }
        drawPath(leafRight, darkGreen, style = Fill)
        drawPath(leafRight, outline, style = Stroke(strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Hoja superior pequeña brote
        val leafTop = Path().apply {
            moveTo(w * 0.50f, h * 0.30f)
            cubicTo(w * 0.40f, h * 0.15f, w * 0.55f, h * 0.08f, w * 0.58f, h * 0.12f)
            cubicTo(w * 0.62f, h * 0.18f, w * 0.55f, h * 0.25f, w * 0.50f, h * 0.30f)
            close()
        }
        drawPath(leafTop, Color(0xFF74C69D), style = Fill)
        drawPath(leafTop, outline, style = Stroke(strokeW * 0.8f, cap = StrokeCap.Round))
    }
}

/**
 * Doodle de Química (matraz / tubo de ensayo con burbujas)
 */
@Composable
fun ChemistryFlaskDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.05f).coerceAtLeast(2f)
        val outline = Color(0xFF1E293B)
        val liquidColor = Color(0xFF8B5CF6)

        // Cuerpo del matraz
        val flaskPath = Path().apply {
            moveTo(w * 0.42f, h * 0.15f)
            lineTo(w * 0.42f, h * 0.40f)
            lineTo(w * 0.20f, h * 0.82f)
            cubicTo(w * 0.18f, h * 0.88f, w * 0.24f, h * 0.90f, w * 0.30f, h * 0.90f)
            lineTo(w * 0.70f, h * 0.90f)
            cubicTo(w * 0.76f, h * 0.90f, w * 0.82f, h * 0.88f, w * 0.80f, h * 0.82f)
            lineTo(w * 0.58f, h * 0.40f)
            lineTo(w * 0.58f, h * 0.15f)
            close()
        }

        // Líquido
        val liquidPath = Path().apply {
            moveTo(w * 0.32f, h * 0.62f)
            lineTo(w * 0.22f, h * 0.82f)
            lineTo(w * 0.78f, h * 0.82f)
            lineTo(w * 0.68f, h * 0.62f)
            close()
        }
        drawPath(liquidPath, liquidColor, style = Fill)

        // Burbujas
        drawCircle(color = Color.White.copy(alpha = 0.8f), radius = w * 0.04f, center = Offset(w * 0.40f, h * 0.72f))
        drawCircle(color = Color.White.copy(alpha = 0.8f), radius = w * 0.03f, center = Offset(w * 0.55f, h * 0.76f))
        drawCircle(color = liquidColor.copy(alpha = 0.7f), radius = w * 0.035f, center = Offset(w * 0.50f, h * 0.32f))

        // Contorno
        drawPath(flaskPath, outline, style = Stroke(strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Borde superior
        drawRoundRect(
            color = outline,
            topLeft = Offset(w * 0.38f, h * 0.12f),
            size = Size(w * 0.24f, h * 0.06f),
            cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx())
        )
    }
}

/**
 * Doodle de Física (Átomo con órbitas y núcleo)
 */
@Composable
fun PhysicsAtomDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.045f).coerceAtLeast(2f)

        // Órbitas elípticas
        drawOval(
            color = Color(0xFF0284C7),
            topLeft = Offset(w * 0.12f, h * 0.32f),
            size = Size(w * 0.76f, h * 0.36f),
            style = Stroke(strokeW)
        )

        // Núcleo central
        drawCircle(color = Color(0xFFEF4444), radius = w * 0.10f, center = Offset(w * 0.5f, h * 0.5f))
        drawCircle(color = Color(0xFFF59E0B), radius = w * 0.06f, center = Offset(w * 0.54f, h * 0.48f))

        // Electrones en órbita
        drawCircle(color = Color(0xFF38BDF8), radius = w * 0.045f, center = Offset(w * 0.20f, h * 0.42f))
        drawCircle(color = Color(0xFF38BDF8), radius = w * 0.045f, center = Offset(w * 0.80f, h * 0.58f))
    }
}

/**
 * Doodle de Biología (Hélice ADN simplificada)
 */
@Composable
fun BiologyDnaDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.05f).coerceAtLeast(2f)

        // Líneas conectoras / bases
        for (i in 0..4) {
            val y = h * (0.2f + i * 0.15f)
            val offsetFactor = if (i % 2 == 0) 0.18f else 0.08f
            drawLine(
                color = if (i % 2 == 0) Color(0xFF38BDF8) else Color(0xFFF43F5E),
                start = Offset(w * (0.35f - offsetFactor), y),
                end = Offset(w * (0.65f + offsetFactor), y),
                strokeWidth = strokeW,
                cap = StrokeCap.Round
            )
        }

        // Hélice izquierda
        val p1 = Path().apply {
            moveTo(w * 0.25f, h * 0.12f)
            cubicTo(w * 0.45f, h * 0.35f, w * 0.20f, h * 0.65f, w * 0.35f, h * 0.88f)
        }
        drawPath(p1, Color(0xFF0284C7), style = Stroke(strokeW * 1.2f, cap = StrokeCap.Round))

        // Hélice derecha
        val p2 = Path().apply {
            moveTo(w * 0.75f, h * 0.12f)
            cubicTo(w * 0.55f, h * 0.35f, w * 0.80f, h * 0.65f, w * 0.65f, h * 0.88f)
        }
        drawPath(p2, Color(0xFF10B981), style = Stroke(strokeW * 1.2f, cap = StrokeCap.Round))
    }
}

/**
 * Doodle de Literatura (libros)
 */
@Composable
fun LiteratureBooksDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.045f).coerceAtLeast(2f)

        drawRoundRect(
            color = Color(0xFFF59E0B),
            topLeft = Offset(w * 0.15f, h * 0.35f),
            size = Size(w * 0.70f, h * 0.24f),
            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx())
        )
        drawRoundRect(
            color = Color(0xFF1E293B),
            topLeft = Offset(w * 0.15f, h * 0.35f),
            size = Size(w * 0.70f, h * 0.24f),
            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx()),
            style = Stroke(strokeW)
        )

        drawRoundRect(
            color = Color(0xFF3B82F6),
            topLeft = Offset(w * 0.18f, h * 0.62f),
            size = Size(w * 0.68f, h * 0.26f),
            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx())
        )
        drawRoundRect(
            color = Color(0xFF1E293B),
            topLeft = Offset(w * 0.18f, h * 0.62f),
            size = Size(w * 0.68f, h * 0.26f),
            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx()),
            style = Stroke(strokeW)
        )
    }
}

/**
 * Doodle de Psicología (cerebro con chispas de pensamiento)
 */
@Composable
fun PsychologyBrainDoodle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = (w * 0.05f).coerceAtLeast(2f)
        val outline = Color(0xFF1E293B)
        val pink = Color(0xFFF472B6)

        drawOval(
            color = pink,
            topLeft = Offset(w * 0.18f, h * 0.22f),
            size = Size(w * 0.64f, h * 0.56f)
        )
        drawOval(
            color = outline,
            topLeft = Offset(w * 0.18f, h * 0.22f),
            size = Size(w * 0.64f, h * 0.56f),
            style = Stroke(strokeW)
        )
        // Surcos cerebrales
        drawLine(
            color = outline,
            start = Offset(w * 0.50f, h * 0.22f),
            end = Offset(w * 0.50f, h * 0.78f),
            strokeWidth = strokeW * 0.9f
        )
    }
}
