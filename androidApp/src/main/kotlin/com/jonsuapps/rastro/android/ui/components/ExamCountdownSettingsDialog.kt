package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.widgets.RastroWidgetManager
import com.jonsuapps.rastro.android.widgets.UnsaExamDates
import com.jonsuapps.rastro.theme.RastroPalette
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExamCountdownSettingsDialog(theme: RastroPalette, onDismiss: () -> Unit, onSaved: () -> Unit) {
    val context = LocalContext.current
    val dateFormat = remember { SimpleDateFormat("yyyy-MM-dd", Locale.US).apply {
        isLenient = false; timeZone = TimeZone.getTimeZone("UTC")
    } }
    val initialDate = remember { RastroWidgetManager.getExamDateYmd(context) }
    val initialDetails = remember { RastroWidgetManager.getExamDetails(context) }
    var name by remember { mutableStateOf(initialDetails.first) }
    var career by remember { mutableStateOf(initialDetails.third) }
    var date by remember { mutableStateOf(initialDate) }
    var custom by remember { mutableStateOf(initialDate.isNotBlank() && UnsaExamDates.options.none { it.date == initialDate }) }
    var preliminary by remember { mutableStateOf(UnsaExamDates.options.any { it.date == initialDate && it.preliminary }) }
    var menu by remember { mutableStateOf(false) }
    val picker = rememberDatePickerState(initialSelectedDateMillis = runCatching { dateFormat.parse(initialDate)?.time }.getOrNull())
    LaunchedEffect(picker.selectedDateMillis, custom) {
        if (custom) date = picker.selectedDateMillis?.let { dateFormat.format(Date(it)) }.orEmpty()
    }

    Dialog(onDismissRequest = onDismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(modifier = Modifier.widthIn(max = 520.dp).fillMaxWidth(.96f).fillMaxHeight(.88f),
            shape = RoundedCornerShape(24.dp), containerColor = theme.surface,
            strokeColor = theme.strokeBorder, bottomBevelColor = theme.cardBevel, bevelHeight = 4.dp) {
            Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text("Elige la fecha de tu examen", fontWeight = FontWeight.Black, fontSize = 18.sp, color = theme.textPrimary)
                Column(Modifier.weight(1f).verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text("El contador es personal: puedes elegir una evaluación UNSA o cualquier otra fecha.",
                        fontSize = 12.sp, color = theme.textSecondary)
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        listOf(false to "UNSA", true to "Personalizada").forEach { (mode, label) ->
                            Sticker3dButton(onClick = {
                                if (mode && !custom) picker.selectedDateMillis = runCatching { dateFormat.parse(date)?.time }.getOrNull()
                                if (!mode && custom) date = ""
                                custom = mode
                            }, modifier = Modifier.weight(1f), containerColor = if (custom == mode) theme.surfaceAccent else theme.surface,
                                bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                                Text(label, color = theme.textPrimary, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                    if (!custom) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = preliminary, onCheckedChange = { preliminary = it; date = "" })
                            Text("Evaluación Previa", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                        }
                        Text(if (preliminary) "Para Arquitectura, Artes en Plásticas o Música. Esta fecha es distinta del examen principal."
                            else "Conocimientos es el examen principal de admisión. Extraordinario utiliza Aptitudes académicas.",
                            color = theme.textSecondary, fontSize = 12.sp)
                        Box {
                            Sticker3dButton(onClick = { menu = true }, modifier = Modifier.fillMaxWidth(),
                                containerColor = theme.surfaceAccent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                                Text("Elegir evaluación UNSA", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                            }
                            DropdownMenu(expanded = menu, onDismissRequest = { menu = false }, modifier = Modifier.heightIn(max = 340.dp)) {
                                UnsaExamDates.options.filter { it.preliminary == preliminary }.forEach { option ->
                                    DropdownMenuItem(text = { Column {
                                        Text(option.title, fontWeight = FontWeight.Bold)
                                        Text(option.date.split('-').reversed().joinToString("/"), fontSize = 12.sp)
                                    } }, onClick = { name = option.title; date = option.date; menu = false })
                                }
                            }
                        }
                        Text("Fechas del cronograma 2026–2027 proporcionado para RASTRO. Filiales: Mollendo, Camaná y El Pedregal.",
                            color = theme.textSecondary, fontSize = 11.sp)
                    } else {
                        BoxWithConstraints(Modifier.fillMaxWidth()) {
                            val scale = (maxWidth / 360.dp).coerceAtMost(1f)
                            Box(Modifier.fillMaxWidth().height(420.dp * scale), contentAlignment = Alignment.TopCenter) {
                                DatePicker(state = picker, title = null, headline = null, showModeToggle = false,
                                    modifier = Modifier.wrapContentSize(Alignment.TopStart, unbounded = true).requiredSize(360.dp, 420.dp)
                                        .graphicsLayer { scaleX = scale; scaleY = scale; transformOrigin = TransformOrigin(0f, 0f) },
                                    colors = DatePickerDefaults.colors(containerColor = theme.surface,
                                        dayContentColor = theme.textPrimary, weekdayContentColor = theme.textSecondary,
                                        subheadContentColor = theme.textPrimary, navigationContentColor = theme.textPrimary,
                                        selectedDayContainerColor = theme.accent))
                            }
                        }
                    }
                    Text(if (date.isBlank()) "Selecciona una fecha" else "Fecha elegida: ${date.split('-').reversed().joinToString("/")}",
                        color = theme.accent, fontWeight = FontWeight.Bold)
                    OutlinedTextField(value = name, onValueChange = { name = it.take(80) }, modifier = Modifier.fillMaxWidth(),
                        label = { Text("Nombre del examen") }, singleLine = true)
                    OutlinedTextField(value = career, onValueChange = { career = it.take(80) }, modifier = Modifier.fillMaxWidth(),
                        label = { Text("Carrera (opcional)") }, singleLine = true)
                }
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = onDismiss) { Text("Cancelar", color = theme.textSecondary) }
                    Sticker3dButton(onClick = {
                        RastroWidgetManager.setCustomExam(context, name.trim(), date, career.trim())
                        onSaved()
                    }, enabled = date.isNotBlank() && name.isNotBlank(), containerColor = theme.surfaceAccent,
                        bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                        Text("Guardar contador", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
