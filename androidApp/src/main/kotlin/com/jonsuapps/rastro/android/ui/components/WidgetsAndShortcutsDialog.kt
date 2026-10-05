package com.jonsuapps.rastro.android.ui.components

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Widgets
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.lifecycle.repeatOnLifecycle
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.widgets.RastroWidgetManager
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes

/**
 * Hub y Vista Previa en Vivo de Widgets para la Pantalla de Inicio de Android.
 * Muestra vista previa en vivo estilo Sticker 3D de los 4 widgets de RASTRO:
 * 1. Racha Diaria (Streak)
 * 2. Racha Semanal (Calendario L-D)
 * 3. Contador de Días para Examen de Admisión
 * 4. Motivación & Frase Diaria Preu
 */
@Composable
fun WidgetsAndShortcutsDialog(
    theme: RastroPalette,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var showEditExamDialog by remember { mutableStateOf(false) }
    var pinCountdownAfterSave by remember { mutableStateOf(false) }
    var previewRevision by remember { mutableIntStateOf(0) }
    val lifecycle = androidx.lifecycle.compose.LocalLifecycleOwner.current.lifecycle
    LaunchedEffect(lifecycle) {
        lifecycle.repeatOnLifecycle(androidx.lifecycle.Lifecycle.State.STARTED) {
            while (true) {
                val now = System.currentTimeMillis()
                val hour = 3_600_000L
                kotlinx.coroutines.delay((now / hour + 1) * hour - now)
                previewRevision++
            }
        }
    }
    DisposableEffect(context, lifecycle) {
        val stop = RastroWidgetManager.observeChanges(context) { previewRevision++ }
        val observer = androidx.lifecycle.LifecycleEventObserver { _, event ->
            if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
                previewRevision++
            }
        }
        lifecycle.addObserver(observer)
        onDispose { stop(); lifecycle.removeObserver(observer) }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .widthIn(max = 480.dp)
                .fillMaxWidth(0.92f)
                .heightIn(max = 640.dp),
            shape = RoundedCornerShape(24.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(theme.accent.copy(alpha = 0.15f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Rounded.Widgets, contentDescription = null, tint = theme.accent, modifier = Modifier.size(20.dp))
                        }
                        Column {
                            Text("Widgets de Inicio", fontSize = 16.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
                            Text("Vista previa e instalación en Android", fontSize = 11.sp, color = theme.textSecondary)
                        }
                    }

                    IconButton(onClick = onDismiss, modifier = Modifier.size(32.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary, modifier = Modifier.size(18.dp))
                    }
                }

                com.jonsuapps.rastro.android.widgets.RastroWidgetKind.entries.forEach { kind ->
                    WidgetPreviewCard(
                        title = "${kind.title} · ${kind.cells} × 1",
                        subtitle = "La misma vista y los mismos datos del widget de Android",
                        theme = theme,
                        onPin = {
                            if (kind == com.jonsuapps.rastro.android.widgets.RastroWidgetKind.COUNTDOWN) {
                                pinCountdownAfterSave = true
                                showEditExamDialog = true
                            } else pinWidgetToHomeScreen(context, kind.provider)
                        }
                    ) {
                        RealWidgetPreview(kind, previewRevision)
                        if (kind == com.jonsuapps.rastro.android.widgets.RastroWidgetKind.COUNTDOWN) {
                            TextButton(onClick = { pinCountdownAfterSave = false; showEditExamDialog = true }) {
                                Text("Configurar examen", color = theme.accent)
                            }
                        }
                    }
                }
            }
        }
    }

    if (showEditExamDialog) ExamCountdownSettingsDialog(theme,
        onDismiss = { showEditExamDialog = false; pinCountdownAfterSave = false },
        onSaved = {
            previewRevision++; showEditExamDialog = false
            if (pinCountdownAfterSave) pinWidgetToHomeScreen(context,
                com.jonsuapps.rastro.android.widgets.RastroWidgetKind.COUNTDOWN.provider)
            pinCountdownAfterSave = false
        })
}
@Composable
private fun WidgetPreviewCard(
    title: String,
    subtitle: String,
    theme: RastroPalette,
    onPin: () -> Unit,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(18.dp))
            .background(theme.surfaceAccent)
            .border(1.2.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(18.dp))
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Column {
            Text(title, fontWeight = FontWeight.Bold, fontSize = 13.sp, color = theme.textPrimary)
            Text(subtitle, fontSize = 11.sp, color = theme.textSecondary)
        }

        content()

        Sticker3dButton(
            onClick = onPin,
            modifier = Modifier.fillMaxWidth().height(36.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            shape = RastroShapes.Pill,
            contentPadding = PaddingValues(0.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Icon(Icons.Rounded.Add, contentDescription = null, tint = theme.accent, modifier = Modifier.size(15.dp))
                Text("Anclar Widget a la Pantalla de Inicio", fontSize = 11.5.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
            }
        }
    }
}

private fun pinWidgetToHomeScreen(context: Context, providerClass: Class<*>) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val appWidgetManager = AppWidgetManager.getInstance(context)
        val myProvider = ComponentName(context, providerClass)
        if (appWidgetManager.isRequestPinAppWidgetSupported) {
            val kind = com.jonsuapps.rastro.android.widgets.RastroWidgetKind.entries.first { it.provider == providerClass }
            val extras = android.os.Bundle().apply {
                putParcelable(AppWidgetManager.EXTRA_APPWIDGET_PREVIEW,
                    com.jonsuapps.rastro.android.widgets.RastroWidgetViews.create(context, kind))
            }
            val requested = runCatching { appWidgetManager.requestPinAppWidget(myProvider, extras, null) }.getOrDefault(false)
            Toast.makeText(context, if (requested) "Confirma el widget en el diálogo de Android." else
                "Agrega el widget manteniendo pulsada tu pantalla de inicio.", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Manten presionado en tu pantalla de inicio para agregar este widget.", Toast.LENGTH_LONG).show()
        }
    } else {
        Toast.makeText(context, "Manten presionado en tu pantalla de inicio para agregar este widget.", Toast.LENGTH_LONG).show()
    }
}
