package com.jonsuapps.rastro.android.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.jonsuapps.rastro.theme.ThemeManager

/** Display-only cleanup. Greek, biological sex symbols and mathematical operators remain intact. */
internal object AcademicPresentationText {
    private val decorations = setOf(0x2705, 0x274C, 0x26A0, 0x2B50, 0x2728, 0x2139, 0xFE0F, 0x200D)
    private const val LABEL = "(?:claves?\\s+fijas?(?:\\s+(?:de|del|para))?\\s+(?:admisi[oó]n|examen|UNSA)|fijas?\\s+(?:de\\s+)?(?:admisi[oó]n|examen|UNSA)|dato\\s+(?:clave|fijo)(?:\\s+(?:de\\s+)?(?:admisi[oó]n|examen|UNSA))?|consejo\\s+de\\s+examen|claves?\\s+fijas?)"
    private val wholeLabel = Regex("(?i)^$LABEL(?:\\s+UNSA)?[!:. -]*$")
    private val prefixLabel = Regex("(?im)^(\\s*(?:#{1,6}\\s*)?(?:\\d+(?:\\.\\d+)*[.)]?\\s*)?(?:\\*\\*)?)$LABEL(?:\\s+UNSA)?[!:. -]*(?=\\*\\*|\\s|$)")
    fun clean(raw: String): String {
        val out = StringBuilder()
        raw.codePoints().forEach { cp ->
            val decoration = cp in 0x1F300..0x1FAFF || cp in 0x1F1E6..0x1F1FF ||
                cp in decorations
            if (!decoration) out.appendCodePoint(cp)
        }
        val text = out.toString().trim()
        if (wholeLabel.matches(text.removeSurrounding("**"))) return "Importante"
        return prefixLabel.replace(text) { "${it.groupValues[1]}Importante: " }
            .replace(Regex("Importante: [ \\t]+"), "Importante: ")
    }
    fun isImportant(raw: String) = clean(raw).replace(Regex("^\\d+(?:\\.\\d+)*[.)]?\\s*"), "")
        .removePrefix("**").removeSuffix("**").trim().removeSuffix(":").equals("Importante", true)
}

internal data class AcademicImportantColors(val background: Color, val border: Color, val text: Color)

/** Keep every original note, but only one Important heading in a lesson. */
internal fun consolidateAcademicImportant(sections:List<AcademicSection>,extra:List<String>):List<AcademicSection> {
    val notes=sections.filter {AcademicPresentationText.isImportant(it.title)}
    val definitions=(notes.flatMap {it.definitions}+extra.map(AcademicPresentationText::clean).filter(String::isNotBlank)).distinct()
    if(notes.isEmpty() && definitions.isEmpty()) return sections
    val merged=AcademicSection(number=notes.firstOrNull()?.number ?: ((sections.maxOfOrNull {it.number} ?: 0)+1),title="Importante",
        leadText=notes.map {it.leadText}.filter(String::isNotBlank).distinct().joinToString("\n\n"),
        bodyText=notes.map {it.bodyText}.filter(String::isNotBlank).distinct().joinToString("\n\n"),definitions=definitions,
        branchCards=notes.flatMap {it.branchCards},tables=notes.flatMap {it.tables})
    return sections.filterNot {AcademicPresentationText.isImportant(it.title)}+merged
}
internal data class AcademicInk(val concept: Color, val secondary: Color, val underline: Color)
internal fun academicInk(dark: Boolean) = if (dark)
    AcademicInk(Color(0xFF9DCCFF), Color(0xFFDBB8FF), Color(0xFF8DE3D7)) else
    AcademicInk(Color(0xFF1754A0), Color(0xFF7138A8), Color(0xFF006B62))

/** Emphasize an explicit definition label, never guess important words inside prose. */
internal fun academicTheoryMarkup(text: String): String = text.lines().joinToString("\n") { line ->
    val match = Regex("^([\\p{L}][\\p{L}\\p{N} ()/-]{1,59}):(\\s+.+)$").matchEntire(line)
    if (match != null && !line.contains("://")) "**${match.groupValues[1]}:**${match.groupValues[2]}" else line
}
internal fun academicImportantColors(dark: Boolean) = if (dark)
    AcademicImportantColors(Color(0xFF382E19), Color(0xFFA27A2B), Color(0xFFFFE1A0)) else
    AcademicImportantColors(Color(0xFFFFF1D6), Color(0xFFD99B24), Color(0xFF6B3A0E))

@Composable
internal fun AcademicImportantCard(text: String, modifier: Modifier = Modifier) {
    val palette = academicImportantColors(ThemeManager.currentTheme.isDark)
    SemanticCard(title = "Importante", icon = Icons.Rounded.Info, iconTint = palette.text,
        containerColor = palette.background, borderColor = palette.border, titleColor = palette.text,
        modifier = modifier) {
        AcademicText(text, style = MaterialTheme.typography.bodyMedium, color = palette.text)
    }
}

/** Only homogeneous, self-contained label/definition lists qualify; never invent missing cells. */
internal fun academicDefinitionTable(definitions: List<String>): AcademicTable? {
    if (definitions.size !in 3..8) return null
    val rows = definitions.map { raw ->
        val line = AcademicPresentationText.clean(raw).removePrefix("- ").replace("**", "")
        val match = Regex("^([\\p{L}][\\p{L}\\p{N} ()/-]{1,59}):\\s+(.{3,320})$").matchEntire(line) ?: return null
        listOf(match.groupValues[1], match.groupValues[2])
    }
    if (rows.map { it[0].lowercase() }.distinct().size != rows.size) return null
    return AcademicTable(listOf("Concepto", "Descripción"), rows)
}
