package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bolt
import androidx.compose.material.icons.rounded.LocalFireDepartment
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.model.LessonComboState
import com.jonsuapps.rastro.theme.RastroPalette

val LessonComboSaver = mapSaver(
    save = { state: LessonComboState -> mapOf("value" to state.value, "attempts" to state.answeredAttempts.toList()) },
    restore = { saved -> LessonComboState((saved["value"] as Int).coerceIn(0, LessonComboState.MAX),
        (saved["attempts"] as List<*>).filterIsInstance<String>().toSet()) }
)

/** Change this resolver when the final x5 Classic animation becomes available. */
enum class ComboMilestoneEffect { MAX_COMBO }
data class ComboEffectVisual(val appearance: ClassicAppearance, val character: ClassicCharacter,
    val speed: Float, val durationMillis: Long)
fun resolveComboEffect(effect: ComboMilestoneEffect): ComboEffectVisual = when (effect) {
    ComboMilestoneEffect.MAX_COMBO -> ComboEffectVisual(ClassicAppearance.IN_LOVE, ClassicCharacter.LOKI, 2.5f, 1600L)
}

@Composable fun LessonComboIndicator(value: Int, popEvent: Int, theme: RastroPalette) {
    if (value < 2) return
    val scale = remember { Animatable(1f) }
    LaunchedEffect(popEvent) {
        if (popEvent > 0) {
            scale.snapTo(1f)
            scale.animateTo(if (value == LessonComboState.MAX) 1.12f else 1.08f, tween(90))
            scale.animateTo(1f, tween(140))
        }
    }
    val shape = RoundedCornerShape(12.dp)
    Surface(color = theme.surfaceAccent, shape = shape, modifier = Modifier
        .graphicsLayer { scaleX = scale.value; scaleY = scale.value }
        .border(1.dp, theme.strokeBorder, shape)
        .semantics { contentDescription = "Combo de $value respuestas correctas consecutivas" }) {
        Row(Modifier.padding(horizontal = 6.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(3.dp)) {
            Icon(if (value == LessonComboState.MAX) Icons.Rounded.LocalFireDepartment else Icons.Rounded.Bolt,
                null, tint = theme.textPrimary, modifier = Modifier.size(14.dp))
            Text("x$value", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 11.sp, maxLines = 1)
        }
    }
}
