package com.jonsuapps.rastro.android.ui.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import com.jonsuapps.rastro.android.data.CanonicalFormula
import com.jonsuapps.rastro.android.data.FavoritesRepository
import com.jonsuapps.rastro.android.data.FavoriteType
import com.jonsuapps.rastro.theme.RastroPalette

/**
 * Componente visual que demuestra geométricamente el Teorema de Pitágoras (a² + b² = c²)
 * dibujando el triángulo rectángulo (3-4-5) y los cuadrados construidos sobre cada uno
 * de sus catetos e hipotenusa (áreas 9 + 16 = 25).
 *
 * Mantiene estricta separación académica con la figura de Pitágoras como filósofo presocrático
 * (quien acuñó 'philosophia' e identificó el arjé en los números).
 */
@Composable
fun PythagorasGeometricGraphic(
    theme: RastroPalette,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF0F172A))
            .border(1.5.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Título del gráfico y relación algebraica
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = "📐",
                    fontSize = 14.sp
                )
                Text(
                    text = "Demostración Geométrica",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Black,
                    color = Color(0xFFF8FAFC)
                )
            }
            Text(
                text = "a² + b² = c²",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                color = Color(0xFF38BDF8)
            )
        }

        // Lienzo gráfico con triángulo 3-4-5 y cuadrados de áreas (9, 16, 25)
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        ) {
            val canvasW = size.width
            val canvasH = size.height

            // Unidad modular de dibujo
            val u = (canvasH / 12.5f).coerceAtMost(canvasW / 12f)

            // Vértice del ángulo recto C
            val cX = canvasW * 0.40f
            val cY = canvasH * 0.58f

            val aLen = 3f * u // Cateto a (vertical hacia arriba)
            val bLen = 4f * u // Cateto b (horizontal hacia la derecha)

            // Vértices del triángulo rectángulo
            val aPtX = cX
            val aPtY = cY - aLen
            val bPtX = cX + bLen
            val bPtY = cY

            // 1. Cuadrado sobre Cateto a (área a² = 9): dibujado a la izquierda
            val squareAPath = Path().apply {
                moveTo(cX, cY)
                lineTo(cX - aLen, cY)
                lineTo(cX - aLen, cY - aLen)
                lineTo(cX, cY - aLen)
                close()
            }
            drawPath(squareAPath, color = Color(0x3338BDF8))
            drawPath(squareAPath, color = Color(0xFF38BDF8), style = Stroke(width = 2.dp.toPx()))

            // Líneas de grilla para 3x3 = 9 unidades en el cuadrado A
            for (i in 1..2) {
                val frac = i.toFloat() / 3f
                drawLine(
                    color = Color(0x4438BDF8),
                    start = Offset(cX - frac * aLen, cY),
                    end = Offset(cX - frac * aLen, cY - aLen),
                    strokeWidth = 1.dp.toPx()
                )
                drawLine(
                    color = Color(0x4438BDF8),
                    start = Offset(cX, cY - frac * aLen),
                    end = Offset(cX - aLen, cY - frac * aLen),
                    strokeWidth = 1.dp.toPx()
                )
            }

            // 2. Cuadrado sobre Cateto b (área b² = 16): dibujado hacia abajo
            val squareBPath = Path().apply {
                moveTo(cX, cY)
                lineTo(cX + bLen, cY)
                lineTo(cX + bLen, cY + bLen)
                lineTo(cX, cY + bLen)
                close()
            }
            drawPath(squareBPath, color = Color(0x33F59E0B))
            drawPath(squareBPath, color = Color(0xFFF59E0B), style = Stroke(width = 2.dp.toPx()))

            // Líneas de grilla para 4x4 = 16 unidades en el cuadrado B
            for (i in 1..3) {
                val frac = i.toFloat() / 4f
                drawLine(
                    color = Color(0x44F59E0B),
                    start = Offset(cX + frac * bLen, cY),
                    end = Offset(cX + frac * bLen, cY + bLen),
                    strokeWidth = 1.dp.toPx()
                )
                drawLine(
                    color = Color(0x44F59E0B),
                    start = Offset(cX, cY + frac * bLen),
                    end = Offset(cX + bLen, cY + frac * bLen),
                    strokeWidth = 1.dp.toPx()
                )
            }

            // 3. Cuadrado sobre Hipotenusa c (área c² = 25): proyectado hacia el exterior
            val bPrimeX = bPtX + aLen
            val bPrimeY = bPtY - bLen
            val aPrimeX = aPtX + aLen
            val aPrimeY = aPtY - bLen

            val squareCPath = Path().apply {
                moveTo(aPtX, aPtY)
                lineTo(bPtX, bPtY)
                lineTo(bPrimeX, bPrimeY)
                lineTo(aPrimeX, aPrimeY)
                close()
            }
            drawPath(squareCPath, color = Color(0x3310B981))
            drawPath(squareCPath, color = Color(0xFF10B981), style = Stroke(width = 2.dp.toPx()))

            // 4. Triángulo rectángulo ABC
            val trianglePath = Path().apply {
                moveTo(cX, cY)
                lineTo(aPtX, aPtY)
                lineTo(bPtX, bPtY)
                close()
            }
            drawPath(trianglePath, color = Color(0xFFF1F5F9))
            drawPath(trianglePath, color = Color(0xFF0F172A), style = Stroke(width = 2.5.dp.toPx()))

            // Marcador de ángulo recto (90°) en C
            val rightAngleSize = 0.6f * u
            val rightAnglePath = Path().apply {
                moveTo(cX, cY - rightAngleSize)
                lineTo(cX + rightAngleSize, cY - rightAngleSize)
                lineTo(cX + rightAngleSize, cY)
            }
            drawPath(rightAnglePath, color = Color(0xFF64748B), style = Stroke(width = 1.5.dp.toPx()))
        }

        // Leyenda de equivalencia de áreas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Box(modifier = Modifier.size(8.dp).clip(CircleShape).background(Color(0xFF38BDF8)))
                Text("a² = 9 (3²)", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color(0xFF38BDF8))
            }
            Text("+", fontSize = 11.sp, fontWeight = FontWeight.Black, color = Color(0xFF94A3B8))
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Box(modifier = Modifier.size(8.dp).clip(CircleShape).background(Color(0xFFF59E0B)))
                Text("b² = 16 (4²)", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color(0xFFF59E0B))
            }
            Text("=", fontSize = 11.sp, fontWeight = FontWeight.Black, color = Color(0xFF94A3B8))
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Box(modifier = Modifier.size(8.dp).clip(CircleShape).background(Color(0xFF10B981)))
                Text("c² = 25 (5²)", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color(0xFF10B981))
            }
        }

        // Pie explicativo de rigor académico (Separación de Filosofía)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFF1E293B))
                .padding(horizontal = 8.dp, vertical = 6.dp)
        ) {
            Text(
                text = "✨ Demostración euclidiana: La suma de las áreas de los cuadrados sobre los catetos iguala el área sobre la hipotenusa (9 + 16 = 25).\n📌 Nota académica: Este es el teorema geométrico en Matemáticas. La biografía filosófica y el arjé ('todo es número') corresponden al curso de Filosofía Antigua.",
                fontSize = 9.5.sp,
                color = Color(0xFF94A3B8),
                lineHeight = 13.sp
            )
        }
    }
}

/**
 * Componente visual para renderizar fórmulas científicas y matemáticas
 * con formato especial: fracciones apiladas verticales, exponentes, radicales
 * y variables con unidades del Sistema Internacional.
 */
@Composable
fun FormattedFraction(
    numerator: String,
    denominator: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color(0xFFF8FAFC),
    lineColor: Color = Color(0xFF94A3B8)
) {
    Column(
        modifier = modifier.padding(horizontal = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = numerator,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = textColor,
            fontFamily = FontFamily.Serif
        )
        Box(
            modifier = Modifier
                .widthIn(min = 28.dp)
                .height(2.dp)
                .background(lineColor, RoundedCornerShape(1.dp))
                .padding(horizontal = 2.dp)
        )
        Text(
            text = denominator,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = textColor,
            fontFamily = FontFamily.Serif
        )
    }
}

@Composable
fun MathFormulaDisplayBox(
    formula: CanonicalFormula,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF0F172A)) // Tablero matemático pizarra oscura
            .border(1.8.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
            .padding(horizontal = 16.dp, vertical = 14.dp),
        contentAlignment = Alignment.Center
    ) {
        if (!formula.numerator.isNullOrBlank() && !formula.denominator.isNullOrBlank()) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                if (formula.leftSide.isNotBlank()) {
                    Text(
                        text = "${formula.leftSide} = ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFF60A5FA), // Azul cielo matemático
                        fontFamily = FontFamily.Serif
                    )
                }
                if (formula.prefix.isNotBlank()) {
                    Text(
                        text = formula.prefix,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF8FAFC),
                        fontFamily = FontFamily.Serif
                    )
                }
                FormattedFraction(
                    numerator = formula.numerator,
                    denominator = formula.denominator,
                    textColor = Color(0xFFF8FAFC),
                    lineColor = Color(0xFF94A3B8)
                )
                if (formula.suffix.isNotBlank()) {
                    Text(
                        text = formula.suffix,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF8FAFC),
                        fontFamily = FontFamily.Serif
                    )
                }
            }
        } else {
            // Ecuación directa en línea
            Text(
                text = formula.mainExpression,
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                color = Color(0xFFF8FAFC),
                fontFamily = FontFamily.Serif,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }
    }
}

@Composable
fun CanonicalFormulaCard(
    formula: CanonicalFormula,
    theme: RastroPalette,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var isExpanded by remember { mutableStateOf(false) }
    var showMnemotecnia by remember { mutableStateOf(false) }

    val subjectBadgeColor = when (formula.subject) {
        "Física" -> Color(0xFF0284C7)
        "Química" -> Color(0xFF10B981)
        "Trigonometría" -> Color(0xFF8B5CF6)
        "Aritmética" -> Color(0xFFF59E0B)
        "Lenguaje" -> Color(0xFFEC4899)
        "Biología" -> Color(0xFF14B8A6)
        else -> theme.accent
    }

    Sticker3dCard(
        modifier = modifier.fillMaxWidth(),
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 4.dp,
        shape = RoundedCornerShape(22.dp)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Fila de encabezado: Badges, Botón Mnemotecnia y Botón Copiar
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(subjectBadgeColor.copy(alpha = 0.15f))
                            .border(1.dp, subjectBadgeColor.copy(alpha = 0.4f), RoundedCornerShape(8.dp))
                            .padding(horizontal = 8.dp, vertical = 3.dp)
                    ) {
                        Text(
                            text = formula.subject.uppercase(),
                            fontSize = 9.5.sp,
                            fontWeight = FontWeight.Black,
                            color = subjectBadgeColor
                        )
                    }

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(theme.surfaceAccent)
                            .padding(horizontal = 8.dp, vertical = 3.dp)
                    ) {
                        Text(
                            text = formula.level,
                            fontSize = 9.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (formula.level.contains("UNSA")) Color(0xFFF59E0B) else theme.textSecondary
                        )
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Botón táctil para ver Mnemotecnia
                    if (formula.mnemotecnia.isNotBlank() || formula.datoClave.isNotBlank()) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(9.dp))
                                .background(if (showMnemotecnia) Color(0xFFFEF3C7) else theme.surfaceAccent)
                                .border(
                                    1.dp,
                                    if (showMnemotecnia) Color(0xFFF59E0B) else theme.borderSubtle,
                                    RoundedCornerShape(9.dp)
                                )
                                .bouncyClick(scaleDown = 0.90f) {
                                    DuolingoHaptics.playOptionSelected(context)
                                    showMnemotecnia = !showMnemotecnia
                                }
                                .padding(horizontal = 7.dp, vertical = 5.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(3.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.Lightbulb,
                                    contentDescription = "Mnemotecnia",
                                    tint = if (showMnemotecnia) Color(0xFFD97706) else theme.accent,
                                    modifier = Modifier.size(13.dp)
                                )
                                Text(
                                    text = "Mnemotecnia",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (showMnemotecnia) Color(0xFF92400E) else theme.textSecondary
                                )
                            }
                        }
                    }

                    // Botón de Favorito
                    val allFavorites by FavoritesRepository.favoritesFlow.collectAsState()
                    val isFav = allFavorites.any { it.itemId == formula.id && it.type == FavoriteType.FORMULA }

                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(if (isFav) Color(0xFFFEF3C7) else theme.surfaceAccent)
                            .border(
                                1.dp,
                                if (isFav) Color(0xFFF59E0B) else theme.borderSubtle,
                                RoundedCornerShape(9.dp)
                            )
                            .bouncyClick(scaleDown = 0.88f) {
                                DuolingoHaptics.playOptionSelected(context)
                                FavoritesRepository.toggle(
                                    type = FavoriteType.FORMULA,
                                    itemId = formula.id,
                                    title = formula.name,
                                    subtitle = formula.mainExpression,
                                    subject = formula.subject,
                                    area = "General",
                                    extra = formula.description
                                )
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = if (isFav) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                            contentDescription = "Favorito",
                            tint = if (isFav) Color(0xFFF59E0B) else theme.textSecondary,
                            modifier = Modifier.size(17.dp)
                        )
                    }

                    // Botón de copiado táctil
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(theme.surfaceAccent)
                            .bouncyClick(scaleDown = 0.88f) {
                                DuolingoHaptics.playOptionSelected(context)
                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
                                val clip = ClipData.newPlainText("Fórmula RASTRO", "${formula.name}: ${formula.mainExpression}")
                                clipboard?.setPrimaryClip(clip)
                                Toast.makeText(context, "Fórmula copiada al portapapeles", Toast.LENGTH_SHORT).show()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.ContentCopy,
                            contentDescription = "Copiar fórmula",
                            tint = theme.textSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }

            // Título de la fórmula
            Column {
                Text(
                    text = formula.name,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary
                )
                Text(
                    text = formula.topic,
                    fontSize = 11.sp,
                    color = theme.textSecondary
                )
            }

            // ── TABLERO MATEMÁTICO CON FORMATO ESPECIAL ──
            MathFormulaDisplayBox(formula = formula)

            // Gráfico de demostración geométrica (Teorema de Pitágoras)
            if (formula.graphicType == "pythagoras") {
                PythagorasGeometricGraphic(theme = theme, modifier = Modifier.fillMaxWidth())
            }

            // Desplegable de Mnemotecnia con estilo Sticker 3D
            AnimatedVisibility(visible = showMnemotecnia) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color(0xFFFFFBEB))
                        .border(1.5.dp, Color(0xFFF59E0B), RoundedCornerShape(14.dp))
                        .padding(12.dp)
                ) {
                    Row(verticalAlignment = Alignment.Top) {
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFFDE68A)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Lightbulb,
                                contentDescription = null,
                                tint = Color(0xFFD97706),
                                modifier = Modifier.size(16.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
                            Text(
                                text = "💡 Mnemotecnia / Regla Nemotécnica:",
                                fontSize = 11.5.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFF92400E)
                            )
                            Text(
                                text = formula.mnemotecnia.ifBlank { formula.datoClave },
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF78350F),
                                lineHeight = 16.sp
                            )
                        }
                    }
                }
            }

            // Breve descripción
            Text(
                text = formula.description,
                fontSize = 11.5.sp,
                color = theme.textSecondary,
                lineHeight = 16.sp
            )

            // Desplegable de Despejes y Variables
            AnimatedVisibility(visible = isExpanded) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(top = 4.dp)
                ) {
                    // Despejes
                    if (formula.despejes.isNotEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(theme.surfaceAccent)
                                .border(1.dp, theme.borderSubtle, RoundedCornerShape(12.dp))
                                .padding(10.dp)
                        ) {
                            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                Text(
                                    text = "Despejes y Formas Equivalentes:",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.accent
                                )
                                formula.despejes.forEach { desp ->
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(text = desp.name, fontSize = 11.sp, color = theme.textPrimary)
                                        Text(
                                            text = desp.mathExpression,
                                            fontSize = 11.5.sp,
                                            fontWeight = FontWeight.Black,
                                            color = theme.accent,
                                            fontFamily = FontFamily.Serif
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // Leyenda de Variables y Unidades S.I.
                    if (formula.vars.isNotEmpty()) {
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text(
                                text = "Variables y Unidades (S.I.):",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.textSecondary
                            )
                            formula.vars.forEach { v ->
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(vertical = 1.dp)
                                ) {
                                    Text(
                                        text = "${v.symbol}: ",
                                        fontSize = 11.5.sp,
                                        fontWeight = FontWeight.Black,
                                        color = theme.accent,
                                        fontFamily = FontFamily.Serif
                                    )
                                    Text(
                                        text = "${v.name} ",
                                        fontSize = 11.sp,
                                        color = theme.textPrimary
                                    )
                                    Text(
                                        text = "[${v.unit}]",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = theme.textSecondary
                                    )
                                }
                            }
                        }
                    }

                    // Dato Clave / Fija UNSA
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFFFEF3C7))
                            .border(1.2.dp, Color(0xFFF59E0B), RoundedCornerShape(12.dp))
                            .padding(10.dp)
                    ) {
                        Row(verticalAlignment = Alignment.Top) {
                            Icon(
                                imageVector = Icons.Rounded.Lightbulb,
                                contentDescription = null,
                                tint = Color(0xFFD97706),
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(
                                    text = "Dato Clave UNSA:",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFF92400E)
                                )
                                Text(
                                    text = formula.datoClave,
                                    fontSize = 11.sp,
                                    color = Color(0xFF78350F),
                                    lineHeight = 15.sp
                                )
                            }
                        }
                    }
                }
            }

            // Botón Expandir / Colapsar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .bouncyClick(scaleDown = 0.98f) {
                        DuolingoHaptics.playOptionSelected(context)
                        isExpanded = !isExpanded
                    }
                    .padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (isExpanded) "Ocultar detalles" else "Ver despejes y unidades",
                    fontSize = 11.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = theme.accent
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    imageVector = if (isExpanded) Icons.Rounded.KeyboardArrowUp else Icons.Rounded.KeyboardArrowDown,
                    contentDescription = null,
                    tint = theme.accent,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
