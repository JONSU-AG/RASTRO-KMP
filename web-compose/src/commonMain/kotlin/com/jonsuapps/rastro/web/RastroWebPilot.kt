package com.jonsuapps.rastro.web

import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.data.catalog.FilosofiaCatalog
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.theme.*
import com.jonsuapps.rastro.android.ui.screens.EarnedStars

/** Pilot only: original academic content, no invented rewards or remote account writes. */
@Composable
fun RastroWebPilot() {
    val palette = ThemeManager.currentTheme
    var page by remember { mutableStateOf("home") }
    var questionIndex by remember { mutableIntStateOf(0) }
    var selected by remember { mutableStateOf<Int?>(null) }
    var checked by remember { mutableStateOf(false) }
    var correct by remember { mutableIntStateOf(0) }
    val lesson = remember { FilosofiaCatalog.lessons.first() }
    // Other challenge types remain pending; never turn a relationship into ABCD.
    val questions = remember { lesson.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE && it.options.isNotEmpty() } }
    MaterialTheme(colorScheme = if (palette.isLight) lightColorScheme(primary = palette.accent, background = palette.background, surface = palette.surface, onSurface = palette.textPrimary, onBackground = palette.textPrimary) else darkColorScheme(primary = palette.accent, background = palette.background, surface = palette.surface, onSurface = palette.textPrimary, onBackground = palette.textPrimary)) {
        Surface(Modifier.fillMaxSize(), color = palette.background) {
            Column(Modifier.fillMaxSize().padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Row(Modifier.widthIn(max = 760.dp).fillMaxWidth().padding(vertical = 16.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("RASTRO", fontSize = 27.sp, fontWeight = FontWeight.Black, color = palette.readableAccent)
                    TextButton(onClick = { ThemeManager.setTheme(if (palette.isLight) RastroThemeId.DARK else RastroThemeId.LIGHT) }) { Text(if (palette.isLight) "Tema oscuro" else "Tema claro") }
                }
                Column(Modifier.widthIn(max = 760.dp).fillMaxWidth().weight(1f).verticalScroll(rememberScrollState()).padding(bottom = 24.dp), verticalArrangement = Arrangement.spacedBy(18.dp)) {
                    if (page == "home") {
                        PhysicalCard {
                            Text("¡Hola!", fontSize = 23.sp, fontWeight = FontWeight.Black)
                            Text("Tu siguiente paso empieza aquí", fontSize = 30.sp, fontWeight = FontWeight.Black)
                            Text("Estudia a tu ritmo con RASTRO.", color = palette.textSecondary)
                        }
                        Text("Aprender · Filosofía", fontSize = 25.sp, fontWeight = FontWeight.Black)
                        PhysicalCard {
                            Text(lesson.title, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                            Text(lesson.theory.titulo, color = palette.textSecondary)
                            PhysicalButton("Comenzar") { page = "theory" }
                        }
                        Text("Vista preliminar web · Más secciones próximamente", color = palette.textMuted)
                    } else if (page == "theory") {
                        Text(lesson.theory.titulo, fontSize = 28.sp, fontWeight = FontWeight.Black)
                        PhysicalCard { Text(lesson.theory.resumen, fontSize = 18.sp, lineHeight = 28.sp) }
                        PhysicalButton("Practicar") { questionIndex = 0; correct = 0; selected = null; checked = false; page = "quiz" }
                        TextButton(onClick = { page = "home" }) { Text("Volver a Inicio") }
                    } else if (page == "quiz" && questions.isNotEmpty()) {
                        val question = questions[questionIndex]
                        Text("Pregunta ${questionIndex + 1} de ${questions.size}", color = palette.textSecondary)
                        LinearProgressIndicator(progress = { questionIndex.toFloat() / questions.size }, modifier = Modifier.fillMaxWidth())
                        Text(question.statement, fontSize = 23.sp, fontWeight = FontWeight.Bold)
                        question.options.forEachIndexed { index, option ->
                            val feedback = when {
                                checked && index == question.correctIndex -> " ✓"
                                checked && index == selected -> " ✕"
                                !checked && index == selected -> " · Seleccionado"
                                else -> ""
                            }
                            PhysicalButton(option + feedback, enabled = !checked) { selected = index }
                        }
                        if (checked) PhysicalCard {
                            Text(if (selected == question.correctIndex) "¡Correcto!" else "Repasemos", fontWeight = FontWeight.Black)
                            Text(question.explanation, fontSize = 17.sp, lineHeight = 25.sp)
                        }
                        PhysicalButton(if (checked) "Continuar" else "Comprobar", enabled = checked || selected != null) {
                            if (!checked) { if (selected == question.correctIndex) correct++; checked = true }
                            else if (questionIndex + 1 == questions.size) page = "result"
                            else { questionIndex++; selected = null; checked = false }
                        }
                        TextButton(onClick = { page = "theory" }) { Text("Volver a la teoría") }
                    } else if (page == "result") {
                        var target by remember { mutableIntStateOf(0) }
                        val count by animateIntAsState(target, tween(650), label = "correctCount")
                        LaunchedEffect(Unit) { target = correct }
                        PhysicalCard {
                            Text("¡Práctica completada!", fontSize = 29.sp, fontWeight = FontWeight.Black)
                            EarnedStars(when { correct >= questions.size -> 3; correct * 2 >= questions.size -> 2; else -> 1 })
                            Text("$count / ${questions.size}", fontSize = 48.sp, fontWeight = FontWeight.Black, color = palette.readableAccent)
                            Text("Respuestas correctas", fontWeight = FontWeight.Bold)
                        }
                        PhysicalButton("Continuar") { page = "home" }
                    }
                }
            }
        }
    }
}

@Composable
private fun PhysicalCard(content: @Composable ColumnScope.() -> Unit) {
    val p = ThemeManager.currentTheme
    val shape = RoundedCornerShape(CartoonFinish.cardRadius)
    Box(Modifier.fillMaxWidth().padding(bottom = CartoonFinish.depth)) {
        Box(Modifier.matchParentSize().offset(y = CartoonFinish.depth).background(p.cardBevel, shape))
        Column(Modifier.fillMaxWidth().background(p.surface, shape).border(CartoonFinish.outline, p.strokeBorder, shape).padding(22.dp), verticalArrangement = Arrangement.spacedBy(12.dp), content = content)
    }
}

@Composable
private fun PhysicalButton(label: String, enabled: Boolean = true, onClick: () -> Unit) {
    val p = ThemeManager.currentTheme
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val travel by animateFloatAsState(if (pressed) 3f else 0f, spring(dampingRatio = .65f, stiffness = 650f), label = "buttonDepth")
    val shape = RoundedCornerShape(CartoonFinish.compactRadius)
    Box(Modifier.fillMaxWidth().padding(bottom = 4.dp)) {
        Box(Modifier.matchParentSize().offset(y = 4.dp).background(p.accentBevel, shape))
        Box(Modifier.fillMaxWidth().graphicsLayer { translationY = travel.dp.toPx(); alpha = if (enabled) 1f else .65f }.background(p.accent, shape).border(2.dp, p.strokeBorder, shape).clickable(interactionSource = interaction, indication = null, enabled = enabled, role = Role.Button, onClick = onClick).padding(16.dp), contentAlignment = Alignment.Center) {
            Text(label, color = p.accentForeground, fontSize = 18.sp, fontWeight = FontWeight.Black)
        }
    }
}
