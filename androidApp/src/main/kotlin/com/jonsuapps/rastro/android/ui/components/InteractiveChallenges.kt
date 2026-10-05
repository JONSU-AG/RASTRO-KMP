package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.theme.RastroPalette

/** Pair color is stable for the activity, with a number/check as a non-color cue. */
internal fun relationColor(index: Int, total: Int, dark: Boolean): Color =
    Color.hsl(75f + index * 200f / total.coerceAtLeast(1), .65f, if (dark) .68f else .36f)

@Composable fun MatchingChallengeView(challenge: Challenge, state: MatchAnswerState,
    selectedLeft: Int?, selectedRight: Int?, checked: Boolean, theme: RastroPalette,
    onLeft: (Int) -> Unit, onRight: (Int) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Text("Selecciona un elemento de cada lado · ${state.links.size}/${challenge.pairs.size}",
            color = theme.textPrimary, fontWeight = FontWeight.Bold, fontSize = 13.sp)
        if (state.lastMismatch) Text("No corresponden. Prueba otra pareja; las correctas siguen bloqueadas.",
            color = theme.answerText(false), fontSize = 13.sp)
        if (state.mistakes > 0 && !state.lastMismatch) Text("Hubo una pareja incorrecta: este reto se repasará en Fénix al comprobar.",
            color = theme.textSecondary, fontSize = 12.sp)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                challenge.pairs.forEachIndexed { index, pair ->
                    RelationButton(pair.left, index.takeIf { index in state.links }, index == selectedLeft,
                        checked, challenge.pairs.size, theme, state.lastMismatch && state.mismatchLeft == index) { onLeft(index) }
                }
            }
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                ChallengeInteraction.rightOptions(challenge).forEachIndexed { index, option ->
                    RelationButton(option.text, state.links.entries.firstOrNull { it.value == index }?.key,
                        index == selectedRight, checked, challenge.pairs.size, theme, state.lastMismatch && state.mismatchRight == index) { onRight(index) }
                }
            }
        }
    }
}

@Composable private fun RelationButton(label: String, pair: Int?, selected: Boolean,
    checked: Boolean, total: Int, theme: RastroPalette, mismatch: Boolean = false, onClick: () -> Unit) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val color = relationColor(pair ?: 0, total, theme.isDark)
    val fill = when {
        mismatch -> theme.answerSurface(false)
        pair != null -> color.copy(alpha = .22f).compositeOver(theme.surface)
        selected -> color.copy(alpha = .12f).compositeOver(theme.surface)
        else -> theme.surface
    }
    val content: @Composable RowScope.() -> Unit = {
        if (pair != null) Icon(Icons.Rounded.Check, null, tint = contrastingText(fill), modifier = Modifier.size(15.dp))
        Text(if (pair == null) label else "${pair + 1}. $label", color = contrastingText(fill),
            fontSize = 13.sp, lineHeight = 18.sp, fontWeight = FontWeight.Bold)
    }
    val modifier = Modifier.fillMaxWidth().heightIn(min = 52.dp)
    if (checked || pair != null) {
        Sticker3dCard(modifier = modifier.semantics { disabled() }, containerColor = fill,
            bevelColor = theme.cardBevel, strokeColor = if (pair != null) color else theme.strokeBorder,
            shape = RoundedCornerShape(15.dp)) {
            Row(Modifier.padding(10.dp), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically, content = content)
        }
    } else Sticker3dButton(onClick = { DuolingoHaptics.playOptionSelected(context); onClick() }, modifier = modifier,
        containerColor = fill, bottomBevelColor = theme.cardBevel,
        strokeColor = if (mismatch) theme.answerText(false) else if (selected) color else theme.strokeBorder,
        shape = RoundedCornerShape(15.dp), contentPadding = PaddingValues(10.dp), content = content)
}

@OptIn(ExperimentalLayoutApi::class)
@Composable fun FillTheoryChallengeView(challenge: Challenge, answers: Map<String, String>,
    checked: Boolean, theme: RastroPalette, onAnswer: (String, String) -> Unit) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val blanks = remember(challenge) { ChallengeInteraction.blanks(challenge) }
    var activeId by remember(challenge.id) { mutableStateOf(blanks.firstOrNull()?.id) }
    val choices = remember(challenge.id) { blanks.associate { it.id to it.options.shuffled() } }
    val active = blanks.firstOrNull { it.id == activeId } ?: blanks.firstOrNull()
    val template = ChallengeInteraction.template(challenge)
    val marker = ChallengeInteraction.templateMarker
    Sticker3dCard(containerColor = theme.surface, strokeColor = theme.strokeBorder,
        bevelColor = theme.cardBevel, shape = RoundedCornerShape(18.dp)) {
        Column(Modifier.fillMaxWidth().padding(16.dp), verticalArrangement = Arrangement.spacedBy(14.dp)) {
            FlowRow(horizontalArrangement = Arrangement.spacedBy(0.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                var start = 0
                fun plain(text: String): List<String> = text.split(Regex("\\s+")).filter { it.isNotEmpty() }
                marker.findAll(template).forEach { match ->
                    plain(template.substring(start, match.range.first)).forEach { word ->
                        Text("$word ", color = theme.textPrimary, fontSize = 16.sp, lineHeight = 24.sp)
                    }
                    val id = match.groupValues[1]
                    val blank = blanks.first { it.id == id }
                    val answer = answers[id]
                    val correct = answer?.trim().equals(blank.correctText.trim(), ignoreCase = true)
                    val fill = if (checked) theme.answerSurface(correct) else theme.surfaceAccent
                    if (checked) {
                        Sticker3dCard(containerColor = fill, bevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder, shape = RoundedCornerShape(10.dp)) {
                            Text(answer ?: "____", modifier = Modifier.padding(horizontal = 9.dp, vertical = 6.dp),
                                color = theme.answerText(correct), fontWeight = FontWeight.Black, fontSize = 15.sp)
                        }
                    } else Sticker3dButton(onClick = { activeId = id },
                        containerColor = fill, bottomBevelColor = theme.cardBevel,
                        strokeColor = if (id == activeId) theme.accent else theme.strokeBorder,
                        shape = RoundedCornerShape(10.dp), bevelHeight = 2.dp,
                        contentPadding = PaddingValues(horizontal = 9.dp, vertical = 6.dp)) {
                        Text(answer ?: "____", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 15.sp)
                    }
                    start = match.range.last + 1
                }
                plain(template.substring(start)).forEach { word ->
                    Text("$word ", color = theme.textPrimary, fontSize = 16.sp, lineHeight = 24.sp)
                }
            }
            Text(if (checked) "Texto completado" else "Toca un espacio y elige su opción. Puedes cambiarla antes de comprobar.",
                fontSize = 12.sp, color = theme.textSecondary)
        }
    }
    if (!checked && active != null) {
        Text("Opciones del espacio ${blanks.indexOf(active) + 1}", color = theme.textPrimary, fontWeight = FontWeight.Bold)
        FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            choices[active.id].orEmpty().forEach { option ->
                val selected = answers[active.id] == option
                val fill = if (selected) theme.accent else theme.surface
                Sticker3dButton(onClick = {
                    DuolingoHaptics.playOptionSelected(context)
                    onAnswer(active.id, option)
                    activeId = blanks.firstOrNull { it.id != active.id && it.id !in answers }?.id ?: active.id
                }, containerColor = fill, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder,
                    shape = RoundedCornerShape(14.dp), contentPadding = PaddingValues(12.dp)) {
                    Text(option, color = contrastingText(fill), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                }
            }
        }
    }
}
