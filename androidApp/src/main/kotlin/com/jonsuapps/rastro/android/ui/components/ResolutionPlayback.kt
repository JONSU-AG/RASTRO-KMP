package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
internal fun PauseLearningPlaybackWhenInactive(onPause: () -> Unit) {
    val owner = androidx.lifecycle.compose.LocalLifecycleOwner.current
    val callback by rememberUpdatedState(onPause)
    DisposableEffect(owner) {
        val observer = androidx.lifecycle.LifecycleEventObserver { _, event ->
            if (event == androidx.lifecycle.Lifecycle.Event.ON_PAUSE) callback()
        }
        owner.lifecycle.addObserver(observer)
        onDispose { owner.lifecycle.removeObserver(observer) }
    }
}

/** Reading segments from the actual explanation, not generated mathematical deductions. */
internal fun resolutionSegments(source: String): List<String> {
    if (source.isBlank()) return emptyList()
    val result = mutableListOf<String>()
    var start = 0
    var braces = 0
    var math: String? = null
    val closingQuotes = mutableListOf<Char>()
    var i = 0
    val abbreviations = setOf("sr", "sra", "dr", "dra", "etc", "ej", "aprox", "fig", "pág")
    while (i < source.length) {
        val token = listOf("\\(", "\\)", "\\[", "\\]", "$$", "$").firstOrNull { source.startsWith(it, i) }
        if (token != null) {
            if (math == token) math = null
            else if (math == null && token !in listOf("\\)", "\\]")) math = when (token) { "\\(" -> "\\)"; "\\[" -> "\\]"; else -> token }
            i += token.length; continue
        }
        val c = source[i]
        if (c == '{') braces++
        if (c == '}') braces = (braces - 1).coerceAtLeast(0)
        if (math == null && braces == 0) {
            // Keep cited evidence together, including nested Spanish/curly quotes.
            // Apostrophes are not delimiters: English contractions must stay ordinary text.
            if (source.getOrNull(i - 1) != '\\') {
                when (c) {
                    '“' -> closingQuotes.add('”')
                    '«' -> closingQuotes.add('»')
                    '"' -> if (closingQuotes.lastOrNull() == '"') closingQuotes.removeAt(closingQuotes.lastIndex)
                        else closingQuotes.add('"')
                    '”', '»' -> if (closingQuotes.lastOrNull() == c) closingQuotes.removeAt(closingQuotes.lastIndex)
                }
            }
            val rest = source.substring(i + 1)
            val word = source.substring(start, i).takeLastWhile { it.isLetter() }.lowercase()
            val initial = word.length == 1 && i > 0 && source[i - 1].isUpperCase()
            val enumeration = source.substring(start, i).trim().matches(Regex("\\d{1,2}"))
            val sentence = c in ".!?" && word !in abbreviations && !initial && !enumeration &&
                Regex("^\\s+[A-ZÁÉÍÓÚÜÑ¿¡]").containsMatchIn(rest)
            if (closingQuotes.isEmpty() && (sentence || c == '\n')) {
                source.substring(start, i + 1).trim().takeIf(String::isNotEmpty)?.let(result::add)
                start = i + 1
            }
        }
        i++
    }
    source.substring(start).trim().takeIf(String::isNotEmpty)?.let(result::add)
    return result
}

/** Text explanations are readable immediately; real visual constructions own their controls. */
@Composable
internal fun ResolutionPlayback(explanation: String, modifier: Modifier = Modifier) {
    val theme = ThemeManager.currentTheme
    val parts = remember(explanation) { resolutionSegments(explanation) }
    if (parts.isEmpty()) return
    Column(modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        parts.forEach { text ->
            AcademicText(text, theoryStyle = true, color = theme.textPrimary,
                style = MaterialTheme.typography.bodyMedium)
        }
    }
}
