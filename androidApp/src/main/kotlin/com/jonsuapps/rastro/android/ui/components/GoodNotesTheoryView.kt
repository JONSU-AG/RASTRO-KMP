package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoStories
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.CalendarToday
import androidx.compose.material.icons.rounded.FormatQuote
import androidx.compose.material.icons.rounded.Lightbulb
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.PushPin
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * Componente estilo Apunte Digital GoodNotes / Knowunity
 * Presenta la teoría preuniversitaria con alta jerarquía visual:
 * - Washi tape superior pastel.
 * - Marcatextos Stabilo pastel (amarillo, menta, lavanda, coral).
 * - Fichas post-it para hechos relevantes, fechas y personajes clave.
 * - Fórmulas destacadas y advertencias de examen.
 */
@Composable
fun GoodNotesTheoryView(
    theory: LessonTheory,
    theme: RastroPalette = ThemeManager.currentTheme,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (theme.isDark) Color(0xFF1E293B) else Color(0xFFFFFDF7) // Papel crema GoodNotes
        ),
        border = androidx.compose.foundation.BorderStroke(
            1.5.dp,
            if (theme.isDark) Color(0xFF334155) else Color(0xFFE2E8F0)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Cintas Washi Tape decorativas estilo GoodNotes
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .width(76.dp)
                        .height(15.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .background(Color(0xFFFDE047).copy(alpha = 0.85f)) // Amarillo pastel
                        .rotate(-3f)
                )

                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(15.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .background(Color(0xFFE9D5FF).copy(alpha = 0.85f)) // Lavanda pastel
                        .rotate(2.5f)
                )
            }

            // Título Principal con Mascota Orstty en Modo Estudio
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "${theory.asignatura} • SEMANA ${theory.semana}",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = theme.accent,
                        letterSpacing = 1.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = theory.titulo,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = if (theme.isDark) Color(0xFFF8FAFC) else Color(0xFF0F172A),
                        lineHeight = 28.sp
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                // Orstty Mascota en Modo Estudio acompañando el apunte digital
                OrsttyMascot(
                    size = 54.dp,
                    mood = MascotMood.STUDYING
                )
            }

            // Resumen introductorio con textura de apunte subrayado Stabilo Boss
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RastroShapes.Squircle)
                    .background(
                        if (theme.isDark) Color(0xFF334155).copy(alpha = 0.4f)
                        else Color(0xFFFEF9C3).copy(alpha = 0.65f) // Resaltador amarillo Stabilo
                    )
                    .border(
                        1.dp,
                        if (theme.isDark) Color(0xFF475569) else Color(0xFFFDE047).copy(alpha = 0.7f),
                        RastroShapes.Squircle
                    )
                    .padding(14.dp)
            ) {
                Row(verticalAlignment = Alignment.Top) {
                    Icon(
                        imageVector = Icons.Rounded.FormatQuote,
                        contentDescription = null,
                        tint = if (theme.isDark) Color(0xFFFDE047) else Color(0xFF854D0E),
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = theory.resumen,
                        style = MaterialTheme.typography.bodyMedium,
                        color = if (theme.isDark) Color(0xFFE2E8F0) else Color(0xFF713F12),
                        lineHeight = 22.sp,
                        fontStyle = FontStyle.Italic
                    )
                }
            }

            // Sección 1: Cronología, Fechas y Personajes Históricos Clave (Estilo Ficha GoodNotes)
            if (theory.fechasYPersonajes.isNotEmpty()) {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Rounded.CalendarToday,
                            contentDescription = null,
                            tint = Color(0xFF8B5CF6),
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Cronología, Fechas & Personajes Clave",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (theme.isDark) Color(0xFFDDD6FE) else Color(0xFF5B21B6)
                        )
                    }

                    theory.fechasYPersonajes.forEach { item ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RastroShapes.Squircle)
                                .background(if (theme.isDark) Color(0xFF2E1065).copy(alpha = 0.5f) else Color(0xFFF3E8FF))
                                .border(1.dp, if (theme.isDark) Color(0xFF581C87) else Color(0xFFD8B4FE), RastroShapes.Squircle)
                                .padding(horizontal = 12.dp, vertical = 10.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Rounded.Person,
                                    contentDescription = null,
                                    tint = if (theme.isDark) Color(0xFFC084FC) else Color(0xFF7E22CE),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = item,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.SemiBold,
                                    color = if (theme.isDark) Color(0xFFE9D5FF) else Color(0xFF4C1D95),
                                    lineHeight = 18.sp
                                )
                            }
                        }
                    }
                }
            }

            // Sección 2: Hechos Relevantes & Acontecimientos Decisivos (Estilo Post-It Menta)
            if (theory.hechosRelevantes.isNotEmpty()) {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Rounded.Lightbulb,
                            contentDescription = null,
                            tint = Color(0xFF059669),
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Hechos Relevantes & Acontecimientos Decisivos",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (theme.isDark) Color(0xFFA7F3D0) else Color(0xFF065F46)
                        )
                    }

                    theory.hechosRelevantes.forEach { hecho ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RastroShapes.Squircle)
                                .background(if (theme.isDark) Color(0xFF064E3B).copy(alpha = 0.45f) else Color(0xFFDCFCE7))
                                .border(1.dp, if (theme.isDark) Color(0xFF047857) else Color(0xFF86EFAC), RastroShapes.Squircle)
                                .padding(horizontal = 12.dp, vertical = 10.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Rounded.Star,
                                    contentDescription = null,
                                    tint = if (theme.isDark) Color(0xFF34D399) else Color(0xFF15803D),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = hecho,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Medium,
                                    color = if (theme.isDark) Color(0xFFD1FAE5) else Color(0xFF14532D),
                                    lineHeight = 18.sp
                                )
                            }
                        }
                    }
                }
            }

            // Hechos y Conceptos Clave de Admisión (Estilo Post-it Knowunity)
            if (theory.conceptosClave.isNotEmpty()) {
                Text(
                    text = "Conceptos Esenciales de Admisión",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = if (theme.isDark) Color(0xFFE2E8F0) else Color(0xFF1E293B)
                )

                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    theory.conceptosClave.forEachIndexed { index, concepto ->
                        val chipColor = when (index % 3) {
                            0 -> if (theme.isDark) Color(0xFF065F46) else Color(0xFFDCFCE7) // Menta
                            1 -> if (theme.isDark) Color(0xFF581C87) else Color(0xFFF3E8FF) // Lavanda
                            else -> if (theme.isDark) Color(0xFF1E3A8A) else Color(0xFFE0F2FE) // Cielo
                        }
                        val textColor = when (index % 3) {
                            0 -> if (theme.isDark) Color(0xFFA7F3D0) else Color(0xFF166534)
                            1 -> if (theme.isDark) Color(0xFFE9D5FF) else Color(0xFF6B21A8)
                            else -> if (theme.isDark) Color(0xFFBAE6FD) else Color(0xFF075985)
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RastroShapes.Squircle)
                                .background(chipColor)
                                .padding(horizontal = 12.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Bookmark,
                                contentDescription = null,
                                tint = textColor,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = concepto,
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium,
                                color = textColor,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }

            // Fórmulas Matemáticas y Físicas
            if (theory.formulas.isNotEmpty()) {
                Text(
                    text = "Ecuaciones y Despejes Obligatorios",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = if (theme.isDark) Color(0xFFE2E8F0) else Color(0xFF1E293B)
                )

                theory.formulas.forEach { formula ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RastroShapes.Squircle)
                            .background(if (theme.isDark) Color(0xFF0F172A) else Color(0xFFF1F5F9))
                            .border(1.dp, theme.borderSubtle, RastroShapes.Squircle)
                            .padding(horizontal = 14.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = formula,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.accent,
                            letterSpacing = 0.5.sp
                        )
                    }
                }
            }

            // Claves Fijas de Examen (Ficha Coral)
            if (theory.clavesFijas.isNotEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RastroShapes.Squircle)
                        .background(
                            if (theme.isDark) Color(0xFF7C2D12).copy(alpha = 0.35f)
                            else Color(0xFFFFEDD5) // Coral pastel
                        )
                        .border(
                            1.dp,
                            if (theme.isDark) Color(0xFF9A3412) else Color(0xFFFDBA74),
                            RastroShapes.Squircle
                        )
                        .padding(14.dp)
                ) {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Rounded.Star,
                                contentDescription = null,
                                tint = if (theme.isDark) Color(0xFFFDBA74) else Color(0xFFC2410C),
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "¡Fija de Admisión!",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = if (theme.isDark) Color(0xFFFDBA74) else Color(0xFF9A3412)
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        theory.clavesFijas.forEach { fija ->
                            Text(
                                text = "• $fija",
                                style = MaterialTheme.typography.bodySmall,
                                color = if (theme.isDark) Color(0xFFFFEDD5) else Color(0xFF7C2D12),
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }

            // Trampas Comunes y Errores Típicos
            if (theory.advertenciasErroresComunes.isNotEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RastroShapes.Squircle)
                        .background(
                            if (theme.isDark) Color(0xFF7F1D1D).copy(alpha = 0.35f)
                            else Color(0xFFFEE2E2)
                        )
                        .border(
                            1.dp,
                            if (theme.isDark) Color(0xFF991B1B) else Color(0xFFFCA5A5),
                            RastroShapes.Squircle
                        )
                        .padding(14.dp)
                ) {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Rounded.PushPin,
                                contentDescription = null,
                                tint = Color(0xFFDC2626),
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "¡No caigas en esta trampa!",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = if (theme.isDark) Color(0xFFFCA5A5) else Color(0xFF991B1B)
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        theory.advertenciasErroresComunes.forEach { trampa ->
                            Text(
                                text = "• $trampa",
                                style = MaterialTheme.typography.bodySmall,
                                color = if (theme.isDark) Color(0xFFFEE2E2) else Color(0xFF7F1D1D),
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
