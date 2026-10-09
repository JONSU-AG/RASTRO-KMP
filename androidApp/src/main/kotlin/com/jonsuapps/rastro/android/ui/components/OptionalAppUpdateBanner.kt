package com.jonsuapps.rastro.android.ui.components

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.SystemUpdate
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.data.OptionalAppUpdateRepository
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.onAccent

@Composable
fun OptionalAppUpdateBanner() {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    val version by OptionalAppUpdateRepository.availableVersion.collectAsState()
    val visibility = remember { MutableTransitionState(false) }
    visibility.targetState = version != null
    AnimatedVisibility(visibleState = visibility,
        enter = slideInVertically(tween(280)) { it } + fadeIn(tween(220)),
        exit = slideOutVertically(tween(180)) { it } + fadeOut(tween(160))) {
        Sticker3dCard(Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 6.dp),
            containerColor = theme.surface, strokeColor = theme.strokeBorder, bottomBevelColor = theme.cardBevel) {
            Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Rounded.SystemUpdate, null, tint = theme.accent, modifier = Modifier.size(28.dp))
                    Text("Actualización disponible", Modifier.weight(1f).padding(start = 8.dp),
                        color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 16.sp)
                    IconButton(onClick = { OptionalAppUpdateRepository.dismiss(context) }) {
                        Icon(Icons.Rounded.Close, "Cerrar aviso de actualización", tint = theme.textPrimary)
                    }
                }
                Text("Hay una nueva versión de RASTRO. Puedes actualizar cuando quieras.",
                    color = theme.textSecondary, fontSize = 12.sp)
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = { OptionalAppUpdateRepository.dismiss(context) }) { Text("Cerrar", color = theme.textSecondary) }
                    Sticker3dButton(onClick = {
                        val packageId = context.packageName
                        try {
                            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageId"))
                                .setPackage("com.android.vending"))
                            OptionalAppUpdateRepository.dismiss(context)
                        } catch (_: ActivityNotFoundException) {
                            try {
                                context.startActivity(Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://play.google.com/store/apps/details?id=$packageId")))
                                OptionalAppUpdateRepository.dismiss(context)
                            } catch (_: RuntimeException) {
                                Toast.makeText(context, "No se pudo abrir Google Play. Inténtalo de nuevo.", Toast.LENGTH_SHORT).show()
                            }
                        } catch (_: RuntimeException) {
                            Toast.makeText(context, "No se pudo abrir Google Play. Inténtalo de nuevo.", Toast.LENGTH_SHORT).show()
                        }
                    }, containerColor = theme.accent, bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder) {
                        Text("Actualizar", color = theme.onAccent, fontWeight = FontWeight.Black)
                    }
                }
            }
        }
    }
}
