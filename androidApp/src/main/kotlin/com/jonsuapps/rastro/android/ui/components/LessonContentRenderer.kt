package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * LessonContentRenderer: Motor de presentación pedagógica dinámico y reutilizable
 * siguiendo fielmente el diseño de las Capturas 2 y 3.
 *
 * El diseño es global; el CONTENIDO es 100% dinámico según la lección recibida.
 * - Tarjeta introductoria suave (celeste) si existe párrafo introductorio.
 * - Secciones numeradas con círculo azul (①, ②, etc.) según los encabezados de la teoría.
 * - Tarjetas temáticas con ilustración doodle SVG cuando la sección contiene clasificaciones.
 * - Fórmulas matemáticas formatedas (LaTeX display) solo si la materia las define.
 * - Tarjeta "💡 Idea clave" solo si la lección posee concepto clave.
 * - Tarjeta "📑 Ejemplo resuelto" construida a partir de un reto real de la lección.
 * - Tarjeta "🔥 Clave fija de admisión" construida a partir del tip real de la lección.
 * - Tarjeta "📋 Resumen" construida a partir de las claves fijas / puntos relevantes reales.
 */
@Composable
fun LessonContentRenderer(
    lesson: LessonNode,
    modifier: Modifier = Modifier,
    theme: RastroPalette = ThemeManager.currentTheme
) {
    val theory = lesson.theory
    val parsedBlocks = remember(theory.id, theory.resumen) { parseAcademicContent(theory) }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        // 1. Tarjeta Introductoria Suave (Celeste claro) - Solo si hay texto introductorio
        if (parsedBlocks.intro.isNotBlank()) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                color = Color(0xFFF0F9FF), // Celeste muy suave
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFBAE6FD))
            ) {
                Text(
                    text = renderFormattedInlineText(parsedBlocks.intro),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFF0369A1), // Azul acero legible
                    lineHeight = 22.sp
                )
            }
        }

        // 2. Secciones Principales Numeradas Dinámicas
        parsedBlocks.sections.forEach { section ->
            AcademicSectionView(
                section = section,
                theme = theme
            )
        }

        // 3. Fórmulas Matemáticas (Física, Química, Matemática) - Solo si existen en la teoría
        if (!theory.formulaLatex.isNullOrBlank() || theory.formulas.isNotEmpty()) {
            AcademicFormulaSection(
                formulaName = theory.formulaName ?: "Fórmula fundamental",
                formulaLatex = theory.formulaLatex.orEmpty(),
                formulaDescription = theory.formulaDescription,
                extraFormulas = theory.formulas
            )
        }

        // 4. Tarjeta Semántica: Idea Clave (Amarillo muy suave) - Solo si existe en la data
        val ideaClaveText = remember(theory) {
            when {
                theory.conceptosClave.isNotEmpty() -> theory.conceptosClave.first()
                parsedBlocks.detectedKeyIdea.isNotBlank() -> parsedBlocks.detectedKeyIdea
                else -> null
            }
        }
        if (!ideaClaveText.isNullOrBlank()) {
            SemanticCard(
                title = "Idea clave",
                icon = Icons.Rounded.Lightbulb,
                iconTint = Color(0xFFD97706),
                containerColor = Color(0xFFFEFCE8), // Amarillo pastel muy suave
                borderColor = Color(0xFFFEF08A),
                titleColor = Color(0xFFB45309)
            ) {
                Text(
                    text = renderFormattedInlineText(ideaClaveText),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFF713F12),
                    lineHeight = 21.sp
                )
            }
        }

        // 5. Tarjeta Semántica: Ejemplo Resuelto (Azul muy suave) - Dinámico con el primer reto real
        val sampleChallenge = lesson.challenges.firstOrNull()
        if (sampleChallenge != null) {
            SolvedExampleCard(
                challenge = sampleChallenge,
                subject = theory.asignatura
            )
        }

        // 6. Tarjeta Semántica: Clave Fija de Admisión (Rojo/Rosa muy suave) - Solo si existe en la data
        val admissionTipText = theory.admissionTip?.takeIf(String::isNotBlank)
            ?: theory.admissionExplanation?.takeIf(String::isNotBlank)
        if (!admissionTipText.isNullOrBlank()) {
            SemanticCard(
                title = "Clave fija de admisión",
                icon = Icons.Rounded.LocalFireDepartment,
                iconTint = Color(0xFFEF4444),
                containerColor = Color(0xFFFFF1F2), // Rosa/rojo muy suave
                borderColor = Color(0xFFFECDD3),
                titleColor = Color(0xFFBE123C)
            ) {
                Text(
                    text = renderFormattedInlineText(admissionTipText),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFF881337),
                    lineHeight = 21.sp
                )
            }
        }

        // 7. Tarjeta Semántica: Resumen (Gris / Azul muy suave) - Dinámico con los puntos de esta lección
        val summaryItems = remember(theory) {
            when {
                theory.clavesFijas.isNotEmpty() -> theory.clavesFijas
                theory.hechosRelevantes.isNotEmpty() -> theory.hechosRelevantes
                theory.conceptosClave.size > 1 -> theory.conceptosClave.drop(1)
                parsedBlocks.summaryBullets.isNotEmpty() -> parsedBlocks.summaryBullets
                else -> emptyList()
            }
        }
        if (summaryItems.isNotEmpty()) {
            SemanticCard(
                title = "Resumen",
                icon = Icons.Rounded.Assignment,
                iconTint = Color(0xFF475569),
                containerColor = Color(0xFFF8FAFC), // Gris perla / pizarra suave
                borderColor = Color(0xFFE2E8F0),
                titleColor = Color(0xFF334155)
            ) {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    summaryItems.forEach { item ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Top
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(top = 7.dp, end = 10.dp)
                                    .size(6.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF3B82F6))
                            )
                            Text(
                                text = renderFormattedInlineText(item),
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color(0xFF334155),
                                lineHeight = 20.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * Renderizado de una sección numerada con su círculo azul (①, ②)
 */
@Composable
private fun AcademicSectionView(
    section: AcademicSection,
    theme: RastroPalette
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Cabecera numerada con círculo azul (①, ②, etc.) o píldora de subsección jerárquica (1.1.1)
        val subCodeMatch = remember(section.title) {
            Regex("""^(\d+\.\d+(?:\.\d+)*)\s*[—–-]?\s*(.*)""").find(section.title)
        }
        val subCode = subCodeMatch?.groupValues?.getOrNull(1)
        val titleText = subCodeMatch?.groupValues?.getOrNull(2)?.ifBlank { section.title } ?: section.title

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            if (subCode != null) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFE0F2FE),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFBAE6FD))
                ) {
                    Text(
                        text = subCode,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF0369A1),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            } else {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF0284C7)), // Azul intenso
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = section.number.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Black,
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = titleText,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0F172A)
            )
        }

        // Subtítulo o texto introductorio de la sección
        if (section.leadText.isNotBlank()) {
            Text(
                text = renderFormattedInlineText(section.leadText),
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF334155),
                lineHeight = 22.sp
            )
        }

        // Viñetas o pares de definición
        if (section.definitions.isNotEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                section.definitions.forEach { def ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(top = 7.dp, end = 10.dp)
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF0284C7))
                        )
                        Text(
                            text = renderFormattedInlineText(def),
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color(0xFF1E293B),
                            lineHeight = 20.sp
                        )
                    }
                }
            }
        }

        // Párrafo complementario
        if (section.bodyText.isNotBlank()) {
            Text(
                text = renderFormattedInlineText(section.bodyText),
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF334155),
                lineHeight = 22.sp
            )
        }

        // Sub-tarjetas temáticas dinámicas con sus ilustraciones correspondientes
        section.branchCards.forEach { branch ->
            AcademicBranchCard(branch = branch)
        }
    }
}

/**
 * Tarjeta temática suave con fondo personalizado e ilustración doodle SVG
 */
@Composable
private fun AcademicBranchCard(branch: AcademicBranch) {
    val (bgColor, borderColor, dotColor, badgeColor) = when (branch.conceptTag) {
        "zoologia" -> QuadColors(Color(0xFFFFF1F2), Color(0xFFFFE4E6), Color(0xFFF43F5E), Color(0xFFE11D48))
        "botanica" -> QuadColors(Color(0xFFF0FDF4), Color(0xFFDCFCE7), Color(0xFF22C55E), Color(0xFF15803D))
        "quimica" -> QuadColors(Color(0xFFFAF5FF), Color(0xFFF3E8FF), Color(0xFFA855F7), Color(0xFF7E22CE))
        "fisica" -> QuadColors(Color(0xFFF0F9FF), Color(0xFFE0F2FE), Color(0xFF0284C7), Color(0xFF0369A1))
        "matematica" -> QuadColors(Color(0xFFFFFBEB), Color(0xFFFEF3C7), Color(0xFFD97706), Color(0xFFB45309))
        "geografia" -> QuadColors(Color(0xFFECFDF5), Color(0xFFD1FAE5), Color(0xFF059669), Color(0xFF047857))
        "historia" -> QuadColors(Color(0xFFFFF7ED), Color(0xFFFFEDD5), Color(0xFFEA580C), Color(0xFFC2410C))
        "literatura" -> QuadColors(Color(0xFFEEF2FF), Color(0xFFE0E7FF), Color(0xFF6366F1), Color(0xFF4F46E5))
        else -> QuadColors(Color(0xFFF8FAFC), Color(0xFFE2E8F0), Color(0xFF64748B), Color(0xFF334155))
    }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        color = bgColor,
        border = androidx.compose.foundation.BorderStroke(1.dp, borderColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Título y Subtítulo de la disciplina
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(badgeColor.copy(alpha = 0.14f))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = branch.name,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = badgeColor
                        )
                    }
                }

                if (branch.subtitle.isNotBlank()) {
                    Text(
                        text = branch.subtitle,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF475569)
                    )
                }

                // Lista de viñetas con punto coloreado
                if (branch.bullets.isNotEmpty()) {
                    Column(
                        modifier = Modifier.padding(top = 4.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        branch.bullets.forEach { bullet ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.Top
                            ) {
                                Box(
                                    modifier = Modifier
                                        .padding(top = 7.dp, end = 8.dp)
                                        .size(6.dp)
                                        .clip(CircleShape)
                                        .background(dotColor)
                                )
                                Text(
                                    text = renderFormattedInlineText(bullet),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color(0xFF1E293B),
                                    lineHeight = 19.sp
                                )
                            }
                        }
                    }
                }
            }

            // Ilustración Académica Doodle SVG a la derecha
            Spacer(modifier = Modifier.width(12.dp))
            AcademicIllustration(
                concept = branch.conceptTag,
                size = 56.dp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

/**
 * Tarjeta Semántica Reutilizable (Idea Clave, Clave de Admisión, Resumen)
 */
@Composable
fun SemanticCard(
    title: String,
    icon: ImageVector,
    iconTint: Color,
    containerColor: Color,
    borderColor: Color,
    titleColor: Color,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        color = containerColor,
        border = androidx.compose.foundation.BorderStroke(1.dp, borderColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = iconTint,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = titleColor
                )
            }

            content()
        }
    }
}

/**
 * Tarjeta de Ejemplo Resuelto Dinámica construida con el reto real de la lección
 */
@Composable
private fun SolvedExampleCard(
    challenge: Challenge,
    subject: String
) {
    val statement = challenge.statement
    val options = challenge.options
    val correctAnswer = options.getOrNull(challenge.correctIndex) ?: challenge.correctText.orEmpty()
    val explanation = challenge.explanation

    SemanticCard(
        title = "Ejemplo resuelto",
        icon = Icons.Rounded.ListAlt,
        iconTint = Color(0xFF0284C7),
        containerColor = Color(0xFFF0F9FF), // Azul muy suave
        borderColor = Color(0xFFBAE6FD),
        titleColor = Color(0xFF0369A1)
    ) {
        Text(
            text = renderFormattedInlineText(statement),
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF1E293B),
            lineHeight = 21.sp
        )

        if (correctAnswer.isNotBlank()) {
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 2.dp)
            ) {
                Text(
                    text = "Respuesta correcta: ",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF334155)
                )
                Box(
                    modifier = Modifier
                        .clip(RastroShapes.Pill)
                        .background(Color(0xFFE0F2FE))
                        .padding(horizontal = 10.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = correctAnswer,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFF0284C7)
                    )
                }
            }
        }

        if (explanation.isNotBlank()) {
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = renderFormattedInlineText(explanation),
                style = MaterialTheme.typography.bodySmall,
                color = Color(0xFF475569),
                lineHeight = 18.sp
            )
        }
    }
}

/**
 * Sección de fórmulas matemáticas con soporte inline y display math
 */
@Composable
private fun AcademicFormulaSection(
    formulaName: String,
    formulaLatex: String,
    formulaDescription: String?,
    extraFormulas: List<String>
) {
    SemanticCard(
        title = formulaName,
        icon = Icons.Rounded.Functions,
        iconTint = Color(0xFF7C3AED),
        containerColor = Color(0xFFFAF5FF),
        borderColor = Color(0xFFE9D5FF),
        titleColor = Color(0xFF6D28D9)
    ) {
        if (formulaLatex.isNotBlank()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .border(1.dp, Color(0xFFDDD6FE), RoundedCornerShape(12.dp))
                    .padding(vertical = 12.dp, horizontal = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = formatMathSymbols(formulaLatex),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF5B21B6)
                )
            }
        }

        formulaDescription?.takeIf(String::isNotBlank)?.let { desc ->
            Text(
                text = desc,
                style = MaterialTheme.typography.bodySmall,
                color = Color(0xFF4C1D95),
                lineHeight = 18.sp
            )
        }

        extraFormulas.forEach { extra ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFFF3E8FF))
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Text(
                    text = formatMathSymbols(extra),
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF5B21B6)
                )
            }
        }
    }
}

/**
 * Limpiador y formateador de fórmulas matemáticas para display math e inline
 */
fun formatMathSymbols(raw: String): String {
    return raw
        .replace("\\times", "×")
        .replace("\\cdot", "·")
        .replace("\\implies", "⇒")
        .replace("\\rightarrow", "→")
        .replace("\\to", "→")
        .replace("\\pm", "±")
        .replace("\\neq", "≠")
        .replace("\\leq", "≤")
        .replace("\\geq", "≥")
        .replace("\\approx", "≈")
        .replace("\\Delta", "Δ")
        .replace("\\lambda", "λ")
        .replace("\\pi", "π")
        .replace("\\theta", "θ")
        .replace("\\alpha", "α")
        .replace("\\beta", "β")
        .replace("\\frac{", "(")
        .replace("}{", ")/(")
        .replace("\\sqrt{", "√(")
        .replace("\\text{", "")
        .replace("\\mathrm{", "")
        .replace("\\left", "")
        .replace("\\right", "")
        .replace("\\quad", "   ")
        .replace("{", "")
        .replace("}", "")
        .replace("\\", "")
}

/**
 * Renderiza texto enriquecido inline soportando **negrita**, *cursiva* y fórmulas
 */
fun renderFormattedInlineText(text: String): AnnotatedString {
    val clean = formatMathSymbols(text)
    return buildAnnotatedString {
        var currentIndex = 0
        val regex = Regex("(\\*\\*([^*]+)\\*\\*)|(\\*([^*]+)\\*)")
        val matches = regex.findAll(clean)

        for (match in matches) {
            val start = match.range.first
            val end = match.range.last + 1
            if (start > currentIndex) {
                append(clean.substring(currentIndex, start))
            }
            when {
                match.value.startsWith("**") -> {
                    val content = match.groupValues[2]
                    val boldStart = length
                    append(content)
                    addStyle(SpanStyle(fontWeight = FontWeight.Bold), boldStart, length)
                }
                match.value.startsWith("*") -> {
                    val content = match.groupValues[4]
                    val italicStart = length
                    append(content)
                    addStyle(SpanStyle(fontStyle = FontStyle.Italic), italicStart, length)
                }
            }
            currentIndex = end
        }

        if (currentIndex < clean.length) {
            append(clean.substring(currentIndex))
        }
    }
}

// -------------------------------------------------------------
// Parsers internos de contenido académico 100% DINÁMICOS
// -------------------------------------------------------------

data class AcademicContent(
    val intro: String,
    val sections: List<AcademicSection>,
    val detectedKeyIdea: String = "",
    val summaryBullets: List<String> = emptyList()
)

data class AcademicSection(
    val number: Int,
    val title: String,
    val leadText: String = "",
    val definitions: List<String> = emptyList(),
    val bodyText: String = "",
    val branchCards: List<AcademicBranch> = emptyList()
)

data class AcademicBranch(
    val name: String,
    val subtitle: String,
    val bullets: List<String>,
    val conceptTag: String
)

private data class QuadColors(
    val bg: Color,
    val border: Color,
    val dot: Color,
    val badge: Color
)

/**
 * Parsea el texto real de `theory.resumen` en secciones, párrafos y tarjetas estructuradas
 * SIN ninguna palabra fija ni ataduras a una materia particular.
 */
fun parseAcademicContent(theory: LessonTheory): AcademicContent {
    val rawLines = theory.resumen.lines().map { it.trim() }.filter { it.isNotBlank() }
    if (rawLines.isEmpty()) {
        return AcademicContent(intro = "", sections = emptyList())
    }

    var intro = ""
    val sections = mutableListOf<AcademicSection>()
    val summaryBullets = mutableListOf<String>()

    // Comprobar si hay encabezados estilo markdown (# o ##) o estilo numerado (1. Titulo)
    val headerIndices = mutableListOf<Int>()
    rawLines.forEachIndexed { index, line ->
        if (line.startsWith("#") || isNumberedHeader(line)) {
            headerIndices.add(index)
        }
    }

    // Párrafo introductorio (todo lo previo al primer encabezado)
    if (headerIndices.isNotEmpty()) {
        val firstHeaderIdx = headerIndices.first()
        if (firstHeaderIdx > 0) {
            intro = rawLines.take(firstHeaderIdx).joinToString(" ")
        }
    } else {
        // Si no hay encabezados, el primer párrafo es el intro
        intro = rawLines.first()
    }

    if (headerIndices.isNotEmpty()) {
        headerIndices.forEachIndexed { headerListIdx, lineIdx ->
            val headerLine = rawLines[lineIdx]
            val nextLineIdx = if (headerListIdx + 1 < headerIndices.size) headerIndices[headerListIdx + 1] else rawLines.size
            val contentLines = rawLines.subList(lineIdx + 1, nextLineIdx)

            val sectionTitle = cleanHeaderTitle(headerLine)
            val parsedSection = parseSectionLines(
                number = headerListIdx + 1,
                title = sectionTitle,
                lines = contentLines,
                subjectId = theory.asignatura
            )
            sections.add(parsedSection)
        }
    } else if (rawLines.size > 1) {
        // Sin encabezados explícitos: agrupar el resto de líneas como sección 1
        val remainingLines = rawLines.drop(1)
        val parsedSection = parseSectionLines(
            number = 1,
            title = theory.titulo.ifBlank { "Desarrollo del tema" },
            lines = remainingLines,
            subjectId = theory.asignatura
        )
        sections.add(parsedSection)
    }

    return AcademicContent(
        intro = intro,
        sections = sections,
        detectedKeyIdea = "",
        summaryBullets = summaryBullets
    )
}

/**
 * Detecta si una línea funciona como encabezado numerado (ej. "1. Observación", "2. Análisis")
 */
private fun isNumberedHeader(line: String): Boolean {
    return (line.matches(Regex("^[0-9]+(?:\\.[0-9]+)*[.)\\s—–-]+\\s*[A-ZÁÉÍÓÚ].*")) ||
            line.matches(Regex("^[0-9]+[.)]\\s+[A-ZÁÉÍÓÚ].*"))) && line.length < 85
}

/**
 * Limpia los prefijos '#', '1.', etc. para obtener el título puro de la sección
 */
private fun cleanHeaderTitle(header: String): String {
    val clean = header
        .removePrefix("###")
        .removePrefix("##")
        .removePrefix("#")
        .trim()
    // Si tiene numeración jerárquica tipo 1.1.1, la preservamos intacta para que la UI cree el badge
    if (clean.matches(Regex("^[0-9]+(?:\\.[0-9]+)+.*"))) {
        return clean
    }
    // Si es numeración simple tipo "1. ", limpiamos el prefijo para no duplicar con el círculo ①
    return clean.replace(Regex("^[0-9]+[.)]\\s*"), "").trim()
}

/**
 * Parsea las líneas internas de una sección clasificando viñetas, tarjetas y texto
 */
private fun parseSectionLines(
    number: Int,
    title: String,
    lines: List<String>,
    subjectId: String
): AcademicSection {
    var leadText = ""
    var bodyText = ""
    val definitions = mutableListOf<String>()
    val branchCards = mutableListOf<AcademicBranch>()

    // Regex para viñetas destacadas tipo: - **Nombre:** Descripción (subitems...)
    val bulletHighlightRegex = Regex("^[-*•]\\s*\\*\\*([^*:]+)\\*\\*\\s*:?\\s*(.*)")

    for (line in lines) {
        val match = bulletHighlightRegex.find(line)
        if (match != null) {
            val name = match.groupValues[1].trim()
            val details = match.groupValues[2].trim()

            // Si tiene detalles ricos o subelementos entre paréntesis
            val (sub, bullets) = extractSubtitleAndBullets(details)
            branchCards.add(
                AcademicBranch(
                    name = name,
                    subtitle = sub,
                    bullets = bullets,
                    conceptTag = AcademicIllustrationsCatalog.resolveConcept("$name $title $subjectId")
                )
            )
        } else if (line.startsWith("- ") || line.startsWith("* ") || line.startsWith("• ")) {
            // Viñeta estándar
            definitions.add(line.substring(2).trim())
        } else if (line.matches(Regex("^[0-9]+[.)]\\s+.*"))) {
            // Lista numerada estándar
            definitions.add(line.trim())
        } else {
            // Texto descriptivo
            if (leadText.isBlank() && branchCards.isEmpty() && definitions.isEmpty()) {
                leadText = line
            } else {
                bodyText = if (bodyText.isBlank()) line else "$bodyText\n\n$line"
            }
        }
    }

    return AcademicSection(
        number = number,
        title = title,
        leadText = leadText,
        definitions = definitions,
        bodyText = bodyText,
        branchCards = branchCards
    )
}

/**
 * Extrae subtítulo y viñetas secundarias si el texto contiene sub-ejemplos o paréntesis
 */
private fun extractSubtitleAndBullets(details: String): Pair<String, List<String>> {
    if (details.isBlank()) return Pair("", emptyList())

    // Si tiene paréntesis con elementos separados por coma o dos puntos
    val parenMatch = Regex("\\((.*?)\\)").find(details)
    if (parenMatch != null) {
        val outside = details.replace(parenMatch.value, "").trim().removeSuffix(".")
        val inside = parenMatch.groupValues[1].trim()
        val items = inside.split(",").map { it.trim() }.filter { it.isNotBlank() }
        if (items.size > 1) {
            return Pair(outside, items)
        }
    }

    return Pair(details, emptyList())
}
