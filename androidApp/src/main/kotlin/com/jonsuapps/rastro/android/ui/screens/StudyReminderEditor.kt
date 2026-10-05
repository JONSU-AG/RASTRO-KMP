package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.android.notifications.*
import com.jonsuapps.rastro.theme.RastroPalette
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

/** Editorial config only; does not broadcast or modify any student's progress. */
@Composable internal fun StudyReminderEditor(theme: RastroPalette) {
    var templates by remember { mutableStateOf(StudyReminderTemplates.defaults) }
    var category by remember { mutableStateOf(ReminderActivity.STILL_TIME) }
    var loaded by remember { mutableStateOf(false) }
    var saving by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf<String?>(null) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(Unit) {
        try {
            val snapshot = StudyReminderTemplates.document.get().await()
            templates = if (snapshot.exists()) StudyReminderTemplates.decode(snapshot.get("templates"))
                ?: error("Configuración inválida: revisa study_reminders sin sobrescribirla.") else StudyReminderTemplates.defaults
            loaded = true
        } catch (e: Exception) { message = e.message ?: "No se pudo cargar la configuración." }
    }
    Column(Modifier.fillMaxWidth().padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Text("Avisos automáticos por actividad", color = theme.textPrimary, style = MaterialTheme.typography.titleMedium)
        Text("Editar aquí cambia los próximos avisos. No envía una difusión. Horas de Lima; como máximo un aviso diario por actividad.", color = theme.textSecondary)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            ReminderActivity.entries.forEach { activity ->
                TextButton(onClick = { category = activity }, modifier = Modifier.weight(1f)) {
                    Text(activity.label, color = if (category == activity) theme.accent else theme.textSecondary)
                }
            }
        }
        if (!loaded && message == null) CircularProgressIndicator(color = theme.accent)
        templates.filter { it.activity == category }.forEach { template ->
            key(template.id) {
                fun update(next: StudyReminderTemplate) { templates = templates.map { if (it.id == next.id) next else it } }
                HorizontalDivider(color = theme.strokeBorder.copy(alpha = .3f))
                OutlinedTextField(template.title, { update(template.copy(title = it.take(100))) },
                    label = { Text("Título") }, enabled = loaded && !saving, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(template.body, { update(template.copy(body = it.take(500))) },
                    label = { Text("Mensaje") }, enabled = loaded && !saving, modifier = Modifier.fillMaxWidth())
                Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                    Text("Activo", color = theme.textPrimary)
                    Switch(template.enabled, { update(template.copy(enabled = it)) }, enabled = loaded && !saving)
                    TextButton(onClick = { templates = templates.filterNot { it.id == template.id } }, enabled = loaded && !saving) { Text("Quitar aviso") }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(template.startHour.toString(), { value -> value.toIntOrNull()?.takeIf { it in 0..template.endHour }?.let { update(template.copy(startHour = it)) } },
                        label = { Text("Desde (0–23 h)") }, enabled = loaded && !saving, modifier = Modifier.weight(1f), singleLine = true)
                    OutlinedTextField(template.endHour.toString(), { value -> value.toIntOrNull()?.takeIf { it in template.startHour..23 }?.let { update(template.copy(endHour = it)) } },
                        label = { Text("Hasta (0–23 h)") }, enabled = loaded && !saving, modifier = Modifier.weight(1f), singleLine = true)
                }
            }
        }
        TextButton(onClick = { templates = templates + StudyReminderTemplate(java.util.UUID.randomUUID().toString(), category, "Nuevo aviso", "Escribe tu mensaje.") },
            enabled = loaded && !saving && templates.size < 32) { Text("Agregar aviso a esta actividad", color = theme.accent) }
        Button(onClick = {
            saving = true; message = null
            scope.launch {
                try {
                    StudyReminderTemplates.document.set(mapOf("templates" to templates.map { it.payload() })).await()
                    message = "Avisos guardados."
                } catch (e: Exception) { message = "No se guardaron: ${e.message}" }
                finally { saving = false }
            }
        }, enabled = loaded && !saving && templates.all { it.title.isNotBlank() && it.body.isNotBlank() }) {
            Text(if (saving) "Guardando…" else "Guardar avisos automáticos")
        }
        message?.let { Text(it, color = theme.textPrimary) }
    }
}
