package com.jonsuapps.rastro.android.ui.screens.literatura

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.theme.RastroPalette

internal fun readingContrast(a: Color, b: Color): Float =
    (maxOf(a.luminance(), b.luminance()) + .05f) / (minOf(a.luminance(), b.luminance()) + .05f)

private fun readable(candidate: Color, backgrounds: List<Color>): Color {
    fun contrast(color: Color) = backgrounds.minOf { readingContrast(color, it) }
    if (contrast(candidate) >= 4.5f) return candidate
    val destination = if (contrast(Color.Black) > contrast(Color.White)) Color.Black else Color.White
    for (step in 1..20) {
        val adjusted = lerp(candidate, destination, step / 20f)
        if (contrast(adjusted) >= 4.5f) return adjusted
    }
    return destination
}

internal data class ReadingPastels(val surface: Color, val marker: Color, val border: Color,
    val text: Color, val accent: Color)

internal fun readingPastels(theme: RastroPalette): ReadingPastels {
    // Mixing into the active surface keeps dark/AMOLED notes dark; no fixed pastel palette.
    val surface = lerp(theme.surface, theme.accent, if (theme.isDark) .07f else .04f)
    val marker = lerp(theme.surface, theme.accent, if (theme.isDark) .18f else .13f)
    val text = readable(theme.textPrimary, listOf(surface, theme.surface, theme.background))
    val accent = readable(theme.accent, listOf(surface, marker, theme.surface, theme.background))
    return ReadingPastels(surface, marker, lerp(surface, accent, .22f), text, accent)
}

internal data class ReadingEmphasis(val text: AnnotatedString, val markers: List<IntRange>)

/** Never rewrites, truncates or summarizes the academic text. Match exact existing terms only. */
internal fun emphasizeReading(source: String, terms: List<String>, palette: ReadingPastels): ReadingEmphasis {
    val builder = AnnotatedString.Builder(source)
    val matches = mutableListOf<IntRange>()
    val markerBudget = minOf(48, source.length / 20)
    for (term in terms.map(String::trim).filter { it.length in 3..48 }.distinct().take(8)) {
        val match = Regex("(?<![\\p{L}\\p{N}])${Regex.escape(term)}(?![\\p{L}\\p{N}])", RegexOption.IGNORE_CASE)
            .find(source) ?: continue
        if (matches.any { match.range.first <= it.last && match.range.last >= it.first }) continue
        matches += match.range
        builder.addStyle(SpanStyle(fontWeight = FontWeight.SemiBold), match.range.first, match.range.last + 1)
        // Only one short marker, at most 5% of the text, and four emphasized terms total.
        if (matches.size == 4) break
    }
    val marker = matches.firstOrNull { it.count() <= markerBudget }
    marker?.let { builder.addStyle(SpanStyle(color = palette.accent), it.first, it.last + 1) }
    return ReadingEmphasis(builder.toAnnotatedString(), listOfNotNull(marker))
}

@Composable internal fun ObraReadingText(text: String, theme: RastroPalette, fontSize: TextUnit,
    lineHeight: TextUnit = fontSize * 1.4f, terms: List<String> = emptyList(), modifier: Modifier = Modifier) {
    val palette = readingPastels(theme)
    val emphasis = remember(text, terms, palette) { emphasizeReading(text, terms, palette) }
    var layout by remember(text, fontSize, lineHeight) { mutableStateOf<TextLayoutResult?>(null) }
    Text(emphasis.text, fontSize = fontSize, lineHeight = lineHeight, color = palette.text,
        modifier = modifier.drawBehind {
            val result = layout ?: return@drawBehind
            for (range in emphasis.markers) {
                // A short marker can wrap naturally; paint rounded pieces on each measured line.
                for (line in result.getLineForOffset(range.first)..result.getLineForOffset(range.last)) {
                    val start = maxOf(range.first, result.getLineStart(line))
                    val end = minOf(range.last + 1, result.getLineEnd(line, visibleEnd = true))
                    if (start >= end) continue
                    var bounds = result.getBoundingBox(start)
                    for (index in start + 1 until end) {
                        val next = result.getBoundingBox(index)
                        bounds = androidx.compose.ui.geometry.Rect(minOf(bounds.left, next.left), minOf(bounds.top, next.top),
                            maxOf(bounds.right, next.right), maxOf(bounds.bottom, next.bottom))
                    }
                    drawRoundRect(palette.marker, Offset(bounds.left - 1.dp.toPx(), bounds.top),
                        Size(bounds.width + 2.dp.toPx(), bounds.height), CornerRadius(3.dp.toPx()))
                }
            }
        }, onTextLayout = { layout = it })
}

/** A single existing pedagogical field, not a card around every paragraph. */
@Composable internal fun ObraReadingNote(title: String, text: String, theme: RastroPalette, fontSize: TextUnit) {
    val palette = readingPastels(theme)
    Row(Modifier.fillMaxWidth().background(palette.surface, RoundedCornerShape(12.dp))
        .border(1.dp, palette.border, RoundedCornerShape(12.dp)).padding(9.dp),
        horizontalArrangement = Arrangement.spacedBy(7.dp), verticalAlignment = Alignment.Top) {
        Icon(painterResource(R.drawable.trail_lightbulb), null, tint = palette.accent, modifier = Modifier.size(17.dp))
        Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(3.dp)) {
            Text(title, fontSize = fontSize, lineHeight = fontSize * 1.3f, fontWeight = FontWeight.SemiBold, color = palette.accent)
            ObraReadingText(text, theme, fontSize)
        }
    }
}
