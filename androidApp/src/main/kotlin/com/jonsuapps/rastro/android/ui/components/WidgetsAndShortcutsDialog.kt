package com.jonsuapps.rastro.android.ui.components

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.widget.Toast
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
import androidx.compose.material.icons.rounded.LocalFireDepartment
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.Widgets
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
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
import com.jonsuapps.rastro.android.widgets.ExamCountdownWidgetProvider
import com.jonsuapps.rastro.android.widgets.MotivacionWidgetProvider
import com.jonsuapps.rastro.android.widgets.RachaSemanalWidgetProvider
import com.jonsuapps.rastro.android.widgets.RachaWidgetProvider
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
    var streakCount by remember { mutableIntStateOf(RastroWidgetManager.getStreak(context)) }
    var examDetails by remember { mutableStateOf(RastroWidgetManager.getExamDetails(context)) }
    var showEditExamDialog by remember { mutableStateOf(false) }

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
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color(0xFF1E293B))
                            .border(1.5.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                            Box(
                                modifier = Modifier
                                    .size(42.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFFF97316)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(Icons.Rounded.LocalFireDepartment, contentDescription = null, tint = Color.White, modifier = Modifier.size(26.dp))
                            }
                            Column {
                                Text("$streakCount Días de Racha", color = Color.White, fontWeight = FontWeight.Black, fontSize = 14.sp)
                                Text("¡Tu racha está activa hoy!", color = Color(0xFF94A3B8), fontSize = 10.5.sp)
                            }
                        }

                        Box(
                            modifier = Modifier
                                .clip(RastroShapes.Pill)
                                .background(Color(0xFFF59E0B))
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text("ACTIVO", color = Color.Black, fontWeight = FontWeight.Black, fontSize = 9.5.sp)
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
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color(0xFF0F172A))
                            .border(1.5.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
                            .padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text("RASTRA SEMANAL", color = Color(0xFF38BDF8), fontWeight = FontWeight.Black, fontSize = 11.sp)
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            listOf("L", "M", "M", "J", "V", "S", "D").forEachIndexed { index, day ->
                                val isDone = index < 5
                                Box(
                                    modifier = Modifier
                                        .size(32.dp)
                                        .clip(CircleShape)
                                        .background(if (isDone) Color(0xFFF97316) else Color(0xFF1E293B))
                                        .border(1.dp, if (isDone) Color(0xFFFDBA74) else Color(0xFF475569), CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(day, color = if (isDone) Color.White else Color(0xFF94A3B8), fontWeight = FontWeight.Black, fontSize = 11.sp)
                                }
                            }
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
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color(0xFF0284C7))
                            .border(1.5.dp, Color(0xFF38BDF8), RoundedCornerShape(16.dp))
                            .padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                            Text(examDetails.first, color = Color.White, fontWeight = FontWeight.Black, fontSize = 12.sp)
                            IconButton(onClick = { showEditExamDialog = true }, modifier = Modifier.size(24.dp)) {
                                Icon(Icons.Rounded.Edit, contentDescription = "Editar examen", tint = Color.White, modifier = Modifier.size(15.dp))
                            }
                        }

                        Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Text("${examDetails.second}", color = Color.White, fontWeight = FontWeight.Black, fontSize = 28.sp)
                            Text("días restantes", color = Color(0xFFE0F2FE), fontWeight = FontWeight.Bold, fontSize = 12.sp, modifier = Modifier.padding(bottom = 4.dp))
                        }

                        Text("Carrera: ${examDetails.third}", color = Color(0xFFBAE6FD), fontSize = 10.5.sp, fontWeight = FontWeight.Medium)
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
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color(0xFF4C1D95))
                            .border(1.5.dp, Color(0xFF7C3AED), RoundedCornerShape(16.dp))
                            .padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text("FRASE DEL DÍA", color = Color(0xFFA7F3D0), fontWeight = FontWeight.Black, fontSize = 10.sp)
                        Text("\"${quote.first}\"", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 11.5.sp, lineHeight = 15.sp)
                        Text(quote.second, color = Color(0xFFDDD6FE), fontSize = 10.sp, fontWeight = FontWeight.Medium)
                    }
                }
            }
        }
    }

    // Modal para editar examen objetivo
    if (showEditExamDialog) {
        var inputExamName by remember { mutableStateOf(examDetails.first) }
        var inputCareer by remember { mutableStateOf(examDetails.third) }

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

                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                        TextButton(onClick = { showEditExamDialog = false }) { Text("Cancelar") }
                        Sticker3dButton(
                            onClick = {
                                RastroWidgetManager.setCustomExam(context, inputExamName, "2025-03-30", inputCareer)
                                examDetails = RastroWidgetManager.getExamDetails(context)
                                showEditExamDialog = false
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
