package com.jonsuapps.rastro.android.ui.components

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.Widgets
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.widgets.ExamCountdownWidgetProvider
import com.jonsuapps.rastro.android.widgets.MotivacionWidgetProvider
import com.jonsuapps.rastro.android.widgets.RachaSemanalWidgetProvider
import com.jonsuapps.rastro.android.widgets.RachaWidgetProvider
import com.jonsuapps.rastro.android.widgets.RastroWidgetManager
import com.jonsuapps.rastro.R
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
    var streakCount by remember { mutableIntStateOf(RastroWidgetManager.getStreak(context)) }
    var examDetails by remember { mutableStateOf(RastroWidgetManager.getExamDetails(context)) }
    var showEditExamDialog by remember { mutableStateOf(false) }
    // Datos REALES compartidos con los widgets del launcher.
    val weekActive by remember { mutableStateOf(RastroWidgetManager.getWeeklyActiveDates(context)) }
    val weekDoneCount = weekActive.count { it }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .widthIn(max = 480.dp)
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

                // 1. Vista Previa Widget Racha Diaria
                WidgetPreviewCard(
                    title = "🔥 Racha Diaria de Estudio",
                    subtitle = "Mantiene viva tu motivación en tu pantalla de inicio",
                    theme = theme,
                    onPin = { pinWidgetToHomeScreen(context, RachaWidgetProvider::class.java) }
                ) {
                    // Vista previa real: mismo PNG de fondo + mismos datos que el widget 2x1.
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(2f)
                            .clip(RoundedCornerShape(16.dp))
                            .border(1.5.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.widget_bg_racha_diaria),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.weight(0.40f))
                            Surface(
                                modifier = Modifier.weight(0.56f),
                                shape = RoundedCornerShape(18.dp),
                                color = Color(0xFFFFF8EC),
                                border = BorderStroke(1.dp, Color(0xFFE7DCC3))
                            ) {
                                Column(
                                    modifier = Modifier.padding(10.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text("🔥", fontSize = 20.sp)
                                    Text("$streakCount", color = Color(0xFFEA580C), fontWeight = FontWeight.Black, fontSize = 36.sp)
                                    Text(
                                        if (streakCount == 1) "DÍA DE RACHA" else "DÍAS DE RACHA",
                                        color = Color(0xFF0F172A),
                                        fontWeight = FontWeight.Black,
                                        fontSize = 10.sp
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.weight(0.04f))
                        }
                    }
                }

                // 2. Vista Previa Widget Racha Semanal (L-D)
                WidgetPreviewCard(
                    title = "📅 Racha Semanal (L-D)",
                    subtitle = "Visualiza tus días de estudio de la semana de un vistazo",
                    theme = theme,
                    onPin = { pinWidgetToHomeScreen(context, RachaSemanalWidgetProvider::class.java) }
                ) {
                    // Vista previa real: mismo PNG de fondo + mismos datos que el widget 4x1.
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(4f)
                            .clip(RoundedCornerShape(16.dp))
                            .border(1.5.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.widget_bg_racha_semanal),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                            Column(
                                modifier = Modifier
                                    .weight(0.64f)
                                    .padding(10.dp),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color(0xFF6D28D9)
                                ) {
                                    Text(
                                        "⚡ RACHA SEMANAL",
                                        color = Color.White,
                                        fontWeight = FontWeight.Black,
                                        fontSize = 9.sp,
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                    )
                                }
                                Surface(
                                    shape = RoundedCornerShape(16.dp),
                                    color = Color(0xFFFFF8EC),
                                    border = BorderStroke(1.dp, Color(0xFFE7DCC3))
                                ) {
                                    Row(
                                        modifier = Modifier.padding(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier.padding(end = 8.dp)
                                        ) {
                                            Row(verticalAlignment = Alignment.Bottom) {
                                                Text("$weekDoneCount", color = Color(0xFF6D28D9), fontWeight = FontWeight.Black, fontSize = 18.sp)
                                                Text("/7", color = Color(0xFF94A3B8), fontWeight = FontWeight.Black, fontSize = 13.sp)
                                            }
                                            Text("DÍAS", color = Color(0xFF64748B), fontWeight = FontWeight.Bold, fontSize = 7.sp)
                                        }
                                        listOf("L", "M", "M", "J", "V", "S", "D").forEachIndexed { index, day ->
                                            val isDone = weekActive.getOrElse(index) { false }
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                modifier = Modifier.weight(1f)
                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .size(22.dp)
                                                        .clip(CircleShape)
                                                        .background(if (isDone) Color(0xFF6D28D9) else Color.Transparent)
                                                        .border(1.dp, if (isDone) Color(0xFF6D28D9) else Color(0xFFC4BFD4), CircleShape),
                                                    contentAlignment = Alignment.Center
                                                ) {
                                                    Text(
                                                        if (isDone) "✓" else "○",
                                                        color = if (isDone) Color.White else Color(0xFFB6B0C6),
                                                        fontWeight = FontWeight.Black,
                                                        fontSize = 10.sp
                                                    )
                                                }
                                                Text(day, color = Color(0xFF0F172A), fontWeight = FontWeight.Bold, fontSize = 8.sp)
                                            }
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.weight(0.36f))
                        }
                    }
                }

                // 3. Vista Previa Widget Contador Examen
                WidgetPreviewCard(
                    title = "🎯 Contador de Días para Admisión",
                    subtitle = "Falta poco para tu examen de ingreso universitario",
                    theme = theme,
                    onPin = { pinWidgetToHomeScreen(context, ExamCountdownWidgetProvider::class.java) }
                ) {
                    // Vista previa real: mismo PNG de fondo + mismos datos que el widget 2x1.
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(2f)
                            .clip(RoundedCornerShape(16.dp))
                            .border(1.5.dp, Color(0xFF38BDF8), RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.widget_bg_contador),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.weight(0.08f))
                            Surface(
                                modifier = Modifier.weight(0.50f),
                                shape = RoundedCornerShape(16.dp),
                                color = Color(0xFFFFF8EC),
                                border = BorderStroke(1.dp, Color(0xFFE7DCC3))
                            ) {
                                Column(
                                    modifier = Modifier.padding(8.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(examDetails.first, color = Color(0xFF0F172A), fontWeight = FontWeight.Black, fontSize = 11.sp, maxLines = 2, textAlign = TextAlign.Center)
                                    Text("${examDetails.second}", color = Color(0xFF0F172A), fontWeight = FontWeight.Black, fontSize = 38.sp)
                                    Text(
                                        if (examDetails.second == 1) "DÍA RESTANTE" else "DÍAS RESTANTES",
                                        color = Color(0xFF64748B),
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 9.sp
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.weight(0.42f))
                        }
                        IconButton(onClick = { showEditExamDialog = true }, modifier = Modifier.align(Alignment.TopEnd).size(28.dp)) {
                            Icon(Icons.Rounded.Edit, contentDescription = "Editar examen", tint = Color(0xFF0F172A), modifier = Modifier.size(15.dp))
                        }
                    }
                }

                // 4. Vista Previa Widget Motivación Preu
                WidgetPreviewCard(
                    title = "💡 Motivación & Frase Diaria",
                    subtitle = "Frases cortas seleccionadas para impulsarte cada mañana",
                    theme = theme,
                    onPin = { pinWidgetToHomeScreen(context, MotivacionWidgetProvider::class.java) }
                ) {
                    val quote = RastroWidgetManager.getDailyQuote()
                    // Vista previa real: mismo PNG de fondo + misma frase que el widget 4x1.
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(4f)
                            .clip(RoundedCornerShape(16.dp))
                            .border(1.5.dp, Color(0xFF7C3AED), RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.widget_bg_frase),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.weight(0.10f))
                            Column(
                                modifier = Modifier.weight(0.80f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Spacer(modifier = Modifier.weight(0.30f))
                                Text(
                                    "\"${quote.first}\"",
                                    color = Color(0xFF0F172A),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 11.sp,
                                    lineHeight = 14.sp,
                                    maxLines = 4,
                                    textAlign = TextAlign.Center
                                )
                                Text("— RASTRO", color = Color(0xFF64748B), fontSize = 9.sp, fontWeight = FontWeight.Medium)
                                Spacer(modifier = Modifier.weight(0.18f))
                            }
                            Spacer(modifier = Modifier.weight(0.10f))
                        }
                    }
                }
            }
        }
    }

    // Modal para editar examen objetivo
    if (showEditExamDialog) {
        var inputExamName by remember { mutableStateOf(examDetails.first) }
        var inputCareer by remember { mutableStateOf(examDetails.third) }
        var inputExamDate by remember { mutableStateOf(RastroWidgetManager.getExamDateYmd(context)) }

        Dialog(onDismissRequest = { showEditExamDialog = false }) {
            Sticker3dCard(
                shape = RoundedCornerShape(20.dp),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 4.dp,
                modifier = Modifier.padding(16.dp)
            ) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text("Configurar Examen Objetivo", fontWeight = FontWeight.Black, fontSize = 14.sp, color = theme.textPrimary)
                    OutlinedTextField(value = inputExamName, onValueChange = { inputExamName = it }, label = { Text("Examen (ej. UNSA 2025)") }, singleLine = true)
                    OutlinedTextField(value = inputCareer, onValueChange = { inputCareer = it }, label = { Text("Carrera Objetivo") }, singleLine = true)
                    OutlinedTextField(
                        value = inputExamDate,
                        onValueChange = { inputExamDate = it },
                        label = { Text("Fecha del examen (AAAA-MM-DD)") },
                        placeholder = { Text("2026-04-12") },
                        singleLine = true
                    )

                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                        TextButton(onClick = { showEditExamDialog = false }) { Text("Cancelar") }
                        Sticker3dButton(
                            onClick = {
                                val typedDate = inputExamDate.trim()
                                val dateOk = typedDate.isBlank() || runCatching {
                                    val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
                                    sdf.isLenient = false
                                    sdf.parse(typedDate)
                                    typedDate.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))
                                }.getOrDefault(false)
                                if (!dateOk) {
                                    Toast.makeText(context, "Fecha inválida. Usa AAAA-MM-DD.", Toast.LENGTH_SHORT).show()
                                } else {
                                    val finalDate = typedDate.ifBlank { RastroWidgetManager.getExamDateYmd(context) }
                                    RastroWidgetManager.setCustomExam(context, inputExamName, finalDate, inputCareer)
                                    examDetails = RastroWidgetManager.getExamDetails(context)
                                    showEditExamDialog = false
                                }
                            },
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder
                        ) {
                            Text("Guardar", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
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
            appWidgetManager.requestPinAppWidget(myProvider, null, null)
            Toast.makeText(context, "Solicitando anclar widget...", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Manten presionado en tu pantalla de inicio para agregar este widget.", Toast.LENGTH_LONG).show()
        }
    } else {
        Toast.makeText(context, "Manten presionado en tu pantalla de inicio para agregar este widget.", Toast.LENGTH_LONG).show()
    }
}
