package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.accentText

/** One identity for entry, password, goal selection and the default Home greeting. */
object WelcomeIdentity {
    val character = ClassicCharacter.LOKI
}

@Composable
fun WelcomeHero(modifier: Modifier = Modifier, name: String? = null, passwordFocused: Boolean = false) {
    val theme = ThemeManager.currentTheme
    if (name == null) {
        Column(modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            androidx.compose.material3.Surface(shape = RoundedCornerShape(24.dp), color = theme.surface,
                border = androidx.compose.foundation.BorderStroke(2.dp, theme.strokeBorder)) {
                Text("Tu próxima meta empieza aquí", Modifier.padding(horizontal = 22.dp, vertical = 14.dp),
                    style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Black,
                    color = theme.textPrimary, textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            }
            ClassicArtwork(if (passwordFocused) ClassicAppearance.SLEEP else ClassicAppearance.WELCOME,
                Modifier.size(210.dp), character = WelcomeIdentity.character)
            Text("Aprende y practica a tu ritmo.", style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold, color = theme.textPrimary,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center)
        }
        return
    }
    val shape = RoundedCornerShape(24.dp)
    Sticker3dCard(modifier = modifier.fillMaxWidth(), shape = shape) {
        Box(Modifier.fillMaxWidth().background(Brush.linearGradient(listOf(theme.surface, theme.surfaceAccent)))) {
            Row(Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp).heightIn(min = 104.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1.25f), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(if (name == null) "Tu preparación empieza aquí" else "¡Hola, ${name.trim().ifBlank { "estudiante" }}!",
                        style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Black,
                        color = theme.textPrimary)
                    Text("Hoy puedes dar otro paso.",
                        color = theme.textSecondary, style = MaterialTheme.typography.bodySmall)
                }
                ClassicArtwork(if (passwordFocused) ClassicAppearance.SLEEP else ClassicAppearance.WELCOME,
                    Modifier.weight(1f).height(104.dp), character = WelcomeIdentity.character)
            }
        }
    }
}
