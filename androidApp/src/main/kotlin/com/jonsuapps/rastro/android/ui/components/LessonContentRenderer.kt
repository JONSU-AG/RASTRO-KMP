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
    val parsedBlocks = remember(theory) { parseAcademicContent(theory) }
    val visualResources=rememberLessonEducationalVisuals(lesson)
    val visualAnchors=remember(visualResources,parsedBlocks.sections){visualResources.groupBy {com.jonsuapps.rastro.model.educationalVisualAnchor(it,parsedBlocks.sections.map {s->s.title})}}

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        visualAnchors[-1].orEmpty().forEach {EducationalVisualCard(it)}
        // 1. Tarjeta Introductoria Suave (Celeste claro) - Solo si hay texto introductorio
        if (parsedBlocks.intro.isNotBlank()) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                color = ThemeManager.currentTheme.surfaceAccent, // Celeste muy suave
                border = androidx.compose.foundation.BorderStroke(1.dp, ThemeManager.currentTheme.borderSubtle)
            ) {
                AcademicText(
                    theoryStyle = true,
                    text = parsedBlocks.intro,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = ThemeManager.currentTheme.accent, // Azul acero legible
                    lineHeight = 22.sp
                )
            }
        }

        parsedBlocks.tables.forEach { ScientificMath(emptyList(), theme.textPrimary, fontSize = 15f, theoryStyle = true, tables = listOf(it)) }

        AcademicLessonDiagram(lesson)
        parsedBlocks.diagrams.forEach { AcademicSourceMap(it) }

        // 2. Secciones Principales Numeradas Dinámicas
        parsedBlocks.sections.forEachIndexed { sectionIndex,section ->
            AcademicSectionView(
                section = section,
                theme = theme
            )
            geometryDiagramFor(lesson.subjectId, section.title)?.let { GeometryConstructionCard(it) }
            if (lesson.subjectId == "algebra" && section.title.contains("Operaciones Fundamentales entre Conjuntos", ignoreCase = true)) SetOperationsCard()
            if (lesson.subjectId == "aritmetica" && section.title.contains("Álgebra de Conjuntos", ignoreCase = true)) SetOperationsCard()
            if (lesson.subjectId == "quimica" && section.title.contains("Propiedades de la Materia",ignoreCase=true)) DensityLearningCard()
            if (lesson.subjectId == "fisica" && section.title.contains("MOVIMIENTO PARABÓLICO DE CAÍDA LIBRE",ignoreCase=true)) PhysicsDiagramCard(PhysicsLearningDiagram.PROJECTILE)
            if (lesson.subjectId == "fisica" && (section.title.contains("ÁLGEBRA VECTORIAL",ignoreCase=true) || section.title.contains("Operaciones Geométricas con Vectores",ignoreCase=true))) PhysicsDiagramCard(PhysicsLearningDiagram.VECTORS)
            if (lesson.subjectId == "fisica" && section.title.contains("Representación Cartesiana y Operaciones Analíticas",ignoreCase=true)) PhysicsDiagramCard(PhysicsLearningDiagram.COMPONENTS)
            algebraStudyGraphic(lesson.subjectId,section.title)?.let {AlgebraRealLineCard(it)}
            visualAnchors[sectionIndex].orEmpty().forEach {EducationalVisualCard(it)}
            if(parsedBlocks.diagrams.isEmpty()) AcademicConceptMap(section)
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

        // 5. Tarjeta Semántica: Ejemplo Resuelto (Azul muy suave) - Dinámico con el primer reto real
        val sampleChallenge = lesson.challenges.firstOrNull()
        if (sampleChallenge != null) {
            SolvedExampleCard(
                challenge = sampleChallenge,
                subject = theory.asignatura
            )
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
                iconTint = ThemeManager.currentTheme.textSecondary,
                containerColor = ThemeManager.currentTheme.surfaceAccent, // Gris perla / pizarra suave
                borderColor = ThemeManager.currentTheme.borderSubtle,
                titleColor = ThemeManager.currentTheme.textPrimary
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
                            AcademicText(
                    theoryStyle = true,
                                text = item,
                                style = MaterialTheme.typography.bodyMedium,
                                color = ThemeManager.currentTheme.textPrimary,
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
internal fun AcademicSectionView(
    section: AcademicSection,
    theme: RastroPalette
) {
    val important = AcademicPresentationText.isImportant(section.title)
    val importantColors = academicImportantColors(theme.isDark)
    Column(
        modifier = Modifier.fillMaxWidth().then(if (important) Modifier
            .clip(RoundedCornerShape(16.dp)).background(importantColors.background)
            .border(1.5.dp, importantColors.border, RoundedCornerShape(16.dp)).padding(14.dp) else Modifier),
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
            if (important) {
                Icon(Icons.Rounded.Info, null, tint = importantColors.text, modifier = Modifier.size(22.dp))
            } else if (subCode != null) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = ThemeManager.currentTheme.surfaceAccent,
                    border = androidx.compose.foundation.BorderStroke(1.dp, ThemeManager.currentTheme.borderSubtle)
                ) {
                    Text(
                        text = subCode,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.ExtraBold,
                        color = ThemeManager.currentTheme.accent,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            } else {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(ThemeManager.currentTheme.accent), // Azul intenso
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = section.number.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Black,
                        color = contrastingText(ThemeManager.currentTheme.accent)
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            AcademicText(
                text = AcademicPresentationText.clean(titleText),
                theoryStyle = true,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = ThemeManager.currentTheme.textPrimary
            )
        }

        // A heading followed by equations belongs with those equations, not in an empty badge.
        if(section.flowText.isNotBlank()) {
            AcademicText(section.flowText,theoryStyle=true,color=theme.textPrimary,
                style=MaterialTheme.typography.bodyMedium,lineHeight=22.sp)
            section.tables.forEach {ScientificMath(emptyList(),theme.textPrimary,fontSize=15f,theoryStyle=true,tables=listOf(it))}
            return@Column
        }
        // Subtítulo o texto introductorio de la sección
        if (section.leadText.isNotBlank()) {
            AcademicText(
                    theoryStyle = true,
                text = section.leadText,
                style = MaterialTheme.typography.bodyMedium,
                color = ThemeManager.currentTheme.textPrimary,
                lineHeight = 22.sp
            )
        }

        // Viñetas o pares de definición
        val definitionTable = remember(section.definitions) { academicDefinitionTable(section.definitions) }
        if (definitionTable != null) ScientificMath(emptyList(), theme.textPrimary, fontSize = 15f, theoryStyle = true, tables = listOf(definitionTable))
        else if (section.definitions.isNotEmpty()) {
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
                                .background(ThemeManager.currentTheme.accent)
                        )
                        AcademicText(
                    theoryStyle = true,
                            text = def,
                            style = MaterialTheme.typography.bodyMedium,
                            color = ThemeManager.currentTheme.textPrimary,
                            lineHeight = 20.sp
                        )
                    }
                }
            }
        }

        // Párrafo complementario
        if (section.bodyText.isNotBlank()) {
            AcademicText(
                    theoryStyle = true,
                text = section.bodyText,
                style = MaterialTheme.typography.bodyMedium,
                color = ThemeManager.currentTheme.textPrimary,
                lineHeight = 22.sp
            )
        }

        // Sub-tarjetas temáticas dinámicas con sus ilustraciones correspondientes
        section.tables.forEach { table ->
            ScientificMath(emptyList(), theme.textPrimary, fontSize = 15f, theoryStyle = true, tables = listOf(table))
        }

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
    if (branch.subtitle.isBlank() && branch.bullets.isEmpty()) {
        AcademicText(branch.name, theoryStyle=true, color=ThemeManager.currentTheme.textPrimary,
            fontWeight=FontWeight.Bold, style=MaterialTheme.typography.titleSmall)
        return
    }
    val (bgColor, borderColor, dotColor, badgeColor) = when (branch.conceptTag) {
        "zoologia" -> QuadColors(ThemeManager.currentTheme.surfaceAccent, Color(0xFFFFE4E6), Color(0xFFF43F5E), Color(0xFFE11D48))
        "botanica" -> QuadColors(Color(0xFFF0FDF4), Color(0xFFDCFCE7), Color(0xFF22C55E), Color(0xFF15803D))
        "quimica" -> QuadColors(ThemeManager.currentTheme.surfaceAccent, ThemeManager.currentTheme.surfaceAccent, Color(0xFFA855F7), Color(0xFF7E22CE))
        "fisica" -> QuadColors(ThemeManager.currentTheme.surfaceAccent, ThemeManager.currentTheme.surfaceAccent, ThemeManager.currentTheme.accent, ThemeManager.currentTheme.accent)
        "matematica" -> QuadColors(Color(0xFFFFFBEB), Color(0xFFFEF3C7), Color(0xFFD97706), ThemeManager.currentTheme.accent)
        "geografia" -> QuadColors(Color(0xFFECFDF5), Color(0xFFD1FAE5), Color(0xFF059669), Color(0xFF047857))
        "historia" -> QuadColors(Color(0xFFFFF7ED), Color(0xFFFFEDD5), Color(0xFFEA580C), Color(0xFFC2410C))
        "literatura" -> QuadColors(Color(0xFFEEF2FF), Color(0xFFE0E7FF), Color(0xFF6366F1), Color(0xFF4F46E5))
        else -> QuadColors(ThemeManager.currentTheme.surfaceAccent, ThemeManager.currentTheme.borderSubtle, Color(0xFF64748B), ThemeManager.currentTheme.textPrimary)
    }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        color = if (ThemeManager.currentTheme.isDark) ThemeManager.currentTheme.surfaceAccent else bgColor,
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
                        AcademicText(
                            text = branch.name,
                            theoryStyle = true,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (ThemeManager.currentTheme.isDark) ThemeManager.currentTheme.accent else badgeColor
                        )
                    }
                }

                if (branch.subtitle.isNotBlank()) {
                    AcademicText(
                        text = branch.subtitle,
                        theoryStyle = true,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium,
                        color = ThemeManager.currentTheme.textSecondary
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
                                AcademicText(
                    theoryStyle = true,
                                    text = bullet,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = ThemeManager.currentTheme.textPrimary,
                                    lineHeight = 19.sp
                                )
                            }
                        }
                    }
                }
            }

            // Ilustración Académica Doodle SVG a la derecha
            if (branch.artwork != null) {
                Spacer(modifier = Modifier.width(12.dp))
                AcademicIllustration(
                    concept = branch.artwork.key,
                    size = 56.dp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
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
        iconTint = ThemeManager.currentTheme.accent,
        containerColor = ThemeManager.currentTheme.surfaceAccent, // Azul muy suave
        borderColor = ThemeManager.currentTheme.borderSubtle,
        titleColor = ThemeManager.currentTheme.accent
    ) {
        AcademicText(
                    theoryStyle = true,
            text = statement,
            style = MaterialTheme.typography.bodyMedium,
            color = ThemeManager.currentTheme.textPrimary,
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
                    color = ThemeManager.currentTheme.textPrimary
                )
                Box(
                    modifier = Modifier
                        .clip(RastroShapes.Pill)
                        .background(ThemeManager.currentTheme.surfaceAccent)
                        .padding(horizontal = 10.dp, vertical = 2.dp)
                ) {
                    AcademicText(
                    theoryStyle = true,
                        text = correctAnswer,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Black,
                        color = ThemeManager.currentTheme.accent
                    )
                }
            }
        }

        if (explanation.isNotBlank()) {
            Spacer(modifier = Modifier.height(2.dp))
            ResolutionPlayback(explanation)
            challenge.angleDegrees?.let { AngularConversionCard(it) }
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
        iconTint = ThemeManager.currentTheme.accent,
        containerColor = ThemeManager.currentTheme.surfaceAccent,
        borderColor = ThemeManager.currentTheme.borderSubtle,
        titleColor = ThemeManager.currentTheme.accent
    ) {
        ScientificMath(
            expressions = (listOf(formulaLatex) + extraFormulas).filter(String::isNotBlank)
                .map(ScientificMathSource::normalize).distinct(),
            color = ThemeManager.currentTheme.textPrimary
        )

        formulaDescription?.takeIf(String::isNotBlank)?.let { desc ->
            Text(
                text = desc,
                style = MaterialTheme.typography.bodySmall,
                color = ThemeManager.currentTheme.textPrimary,
                lineHeight = 18.sp
            )
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
fun renderFormattedInlineText(text: String, theoryStyle: Boolean = false, dark: Boolean = false): AnnotatedString {
    val cleaned = AcademicPresentationText.clean(text)
    val clean = formatMathSymbols(if (theoryStyle) academicTheoryMarkup(cleaned) else cleaned)
    val ink = academicInk(dark)
    return buildAnnotatedString {
        var currentIndex = 0
        val regex = Regex("""(\*\*([^*]+)\*\*)|(\*([^*]+)\*)|(<u>([^<>]+)</u>)""")
        for (match in regex.findAll(clean)) {
            if (match.range.first > currentIndex) append(clean.substring(currentIndex, match.range.first))
            val start = length
            when {
                match.value.startsWith("**") -> {
                    append(match.groupValues[2])
                    addStyle(SpanStyle(fontWeight = FontWeight.Bold, color = if (theoryStyle) ink.concept else Color.Unspecified), start, length)
                }
                match.value.startsWith("<u>") -> {
                    append(match.groupValues[6])
                    addStyle(SpanStyle(textDecoration = androidx.compose.ui.text.style.TextDecoration.Underline,
                        color = if (theoryStyle) ink.underline else Color.Unspecified), start, length)
                }
                else -> {
                    append(match.groupValues[4])
                    addStyle(SpanStyle(fontStyle = FontStyle.Italic, color = if (theoryStyle) ink.secondary else Color.Unspecified), start, length)
                }
            }
            currentIndex = match.range.last + 1
        }
        if (currentIndex < clean.length) append(clean.substring(currentIndex))
    }
}

// -------------------------------------------------------------
// Parsers internos de contenido académico 100% DINÁMICOS
// -------------------------------------------------------------

data class AcademicContent(
    val intro: String,
    val sections: List<AcademicSection>,
    val detectedKeyIdea: String = "",
    val summaryBullets: List<String> = emptyList(),
    val tables: List<AcademicTable> = emptyList(),
    internal val diagrams: List<AcademicSourceDiagram> = emptyList()
)

data class AcademicSection(
    val number: Int,
    val title: String,
    val leadText: String = "",
    val definitions: List<String> = emptyList(),
    val bodyText: String = "",
    val branchCards: List<AcademicBranch> = emptyList(),
    val tables: List<AcademicTable> = emptyList(),
    val flowText: String = ""
)

data class AcademicBranch(
    val name: String,
    val subtitle: String,
    val bullets: List<String>,
    val conceptTag: String,
    val artwork: AcademicArtwork? = null
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
// Bounded by source value: corrected content replaces its cached presentation automatically.
private val academicContentCache = object : LinkedHashMap<LessonTheory, AcademicContent>(32, .75f, true) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<LessonTheory, AcademicContent>?) = size > 64
}
fun parseAcademicContent(theory: LessonTheory): AcademicContent {
    synchronized(academicContentCache) { academicContentCache[theory]?.let { return it } }
    val parsed = parseAcademicContentUncached(theory)
    synchronized(academicContentCache) { academicContentCache[theory] = parsed }
    return parsed
}
private fun parseAcademicContentUncached(theory: LessonTheory): AcademicContent {
    val document = prepareAcademicTheory(theory.resumen)
    val rawLines = groupAcademicMathLines(
        AcademicPresentationText.clean(document.text).lines().map { it.trim() }
            .filter { it.isNotBlank() }
            // Separadores temáticos Markdown (---, ***, ___) no se renderizan.
            .filterNot { it.matches(Regex("^(-{3,}|\\*{3,}|_{3,})$")) }
    )
    if (rawLines.isEmpty()) {
        return AcademicContent(intro = "", sections = emptyList(), diagrams = document.diagrams)
    }

    var intro = ""
    var introTables = emptyList<AcademicTable>()
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
            val (prose, tables) = extractAcademicTables(rawLines.take(firstHeaderIdx))
            intro = prose.joinToString(" ")
            introTables = tables
        }
    } else {
        // Si no hay encabezados, el primer párrafo es el intro
        intro = rawLines.first().takeUnless { it.startsWith("|") }.orEmpty()
    }

    if (headerIndices.isNotEmpty()) {
        headerIndices.forEachIndexed { headerListIdx, lineIdx ->
            val headerLine = rawLines[lineIdx]
            val nextLineIdx = if (headerListIdx + 1 < headerIndices.size) headerIndices[headerListIdx + 1] else rawLines.size
            val contentLines = rawLines.subList(lineIdx + 1, nextLineIdx)

            val sectionTitle = cleanHeaderTitle(headerLine)
            val parsedSection = parseSectionLines(
                number = sections.size + 1,
                title = sectionTitle,
                lines = contentLines,
                subjectId = theory.asignatura
            )
            if (parsedSection.leadText.isNotBlank() || parsedSection.bodyText.isNotBlank() || parsedSection.definitions.isNotEmpty() || parsedSection.branchCards.isNotEmpty() || parsedSection.tables.isNotEmpty()) sections.add(parsedSection)
        }
    } else if (rawLines.size > 1) {
        // Sin encabezados explícitos: agrupar el resto de líneas como sección 1
        val remainingLines = if (rawLines.first().startsWith("|")) rawLines else rawLines.drop(1)
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
        sections = withAcademicCompanions(consolidateAcademicImportant(sections, theory.conceptosClave + listOfNotNull(theory.admissionTip,theory.admissionExplanation)), theory.asignatura),
        detectedKeyIdea = "",
        summaryBullets = summaryBullets,
        tables = introTables,
        diagrams = document.diagrams
    )
}

/**
 * Convierte bloques de tabla Markdown en viñetas destacadas (- **...:** ...),
 * que el renderer ya dibuja como tarjetas. Genérico: sin ataduras a materia.
 * Filas con igual nº de columnas que el encabezado usan sus nombres;
 * la primera columna va en negrita como nombre de tarjeta.
 */
private fun expandMarkdownTables(lines: List<String>): List<String> {
    val out = mutableListOf<String>()
    var i = 0
    while (i < lines.size) {
        val line = lines[i]
        if (line.startsWith("|") && line.endsWith("|") && i + 1 < lines.size &&
            lines[i + 1].matches(Regex("^\\|[\\s:|-]+\\|$"))
        ) {
            val headers = splitTableRow(line)
            i += 2 // salta encabezado + separador
            while (i < lines.size && lines[i].startsWith("|")) {
                val cells = splitTableRow(lines[i])
                out.add(formatTableRowAsBullet(headers, cells))
                i++
            }
        } else {
            out.add(line)
            i++
        }
    }
    return out
}

private fun splitTableRow(line: String): List<String> =
    line.trim().removePrefix("|").removeSuffix("|").split("|").map { it.trim() }

private fun formatTableRowAsBullet(headers: List<String>, cells: List<String>): String {
    if (cells.isEmpty()) return ""
    val name = cells[0].ifBlank { "Dato" }
    if (cells.size == 1 || headers.isEmpty()) return "- **$name**"
    val rest = cells.drop(1).mapIndexed { idx, cell ->
        val h = headers.getOrNull(idx + 1)?.ifBlank { null }
        if (h != null) "$h: $cell" else cell
    }.filter { it.isNotBlank() }.joinToString(" · ")
    return if (rest.isBlank()) "- **$name**" else "- **$name:** $rest"
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
        .replace(Regex("^#+\\s*"), "")
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
    val bulletHighlightRegex = Regex("^[-*•]\\s*\\*\\*([^*]+)\\*\\*\\s*:?\\s*(.*)")

    val (contentLines, tables) = extractAcademicTables(lines)
    for (line in contentLines) {
        val match = bulletHighlightRegex.find(line)
        if (match != null) {
            val name = match.groupValues[1].trim().removeSuffix(":")
            val details = match.groupValues[2].trim()

            if (details.isBlank()) {
                definitions.add("**$name**")
                continue
            }
            val (sub, bullets) = extractSubtitleAndBullets(details)
            branchCards.add(
                AcademicBranch(
                    name = name,
                    subtitle = sub,
                    bullets = bullets,
                    conceptTag = AcademicIllustrationsCatalog.resolveConcept(subjectId)
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
        branchCards = branchCards,
        tables = tables,
        flowText = if(contentLines.any { line -> hasScientificMarkup(line) || bulletHighlightRegex.find(line)?.groupValues?.get(2)?.isBlank()==true })
            contentLines.joinToString("\n") else ""
    )
}

/**
 * Extrae subtítulo y viñetas secundarias si el texto contiene sub-ejemplos o paréntesis
 */
private fun extractSubtitleAndBullets(details: String): Pair<String, List<String>> {
    if (details.isBlank()) return Pair("", emptyList())

    // Parentheses can hold coordinates, units, references or TeX. Never infer a list from commas.
    return Pair(details, emptyList())
}
