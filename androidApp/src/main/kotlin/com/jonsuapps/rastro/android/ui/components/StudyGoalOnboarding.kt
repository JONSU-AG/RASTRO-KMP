package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.School
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.*
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.theme.accentText

/** One local goal per identity. No Auth/profile writes and no catalog or exam routing effects. */
@Composable
fun StudyGoalEntry(user: UserData, allowPrompt: Boolean, footer: (@Composable () -> Unit)? = null) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    val owner = studyGoalScope(user.uid, user.isAuthenticated, user.isAnonymous)
    key(owner) {
        val store = remember(owner) { StudyGoalPreferences(context, owner) }
        var goal by remember(owner) { mutableStateOf(store.load()) }
        val legacy = listOf(user.targetUniversity.takeUnless { it == "Universidad Nacional" }.orEmpty(),
            user.targetCareer).filter { it.isNotBlank() }.joinToString(" · ")
        var open by rememberSaveable(owner) { mutableStateOf(!store.handled && legacy.isBlank()) }
        Sticker3dCard(modifier = Modifier.fillMaxWidth(), onClick = { open = true }) {
            Column {
            Row(Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 9.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                if (goal != null) UniversityBadge(goal!!.universityId, Modifier.size(42.dp))
                else Icon(Icons.Rounded.School, null, tint = theme.accentText, modifier = Modifier.size(30.dp))
                Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                    Text(goal?.university?.let { "${it.acronym} · ${it.city}" } ?: "Tu meta universitaria",
                        color = theme.textPrimary, fontSize = 13.sp, lineHeight = 16.sp, fontWeight = FontWeight.Black)
                    Text(goal?.career ?: legacy.ifBlank { "Elegir universidad y carrera" }, color = theme.textSecondary,
                        fontSize = 11.sp, lineHeight = 14.sp, maxLines = 2, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis)
                }
                Icon(Icons.Rounded.Edit, "Editar meta", tint = theme.accentText, modifier = Modifier.size(18.dp))
            }
            if (footer != null) {
                HorizontalDivider(Modifier.padding(horizontal = 14.dp), color = theme.borderSubtle)
                footer()
            }
            }
        }
        if (open && allowPrompt) {
            StudyGoalDialog(initial = goal, onClose = { store.skip(); open = false }, onSave = {
                store.save(it); goal = it; open = false
            })
        }
    }
}

@Composable
private fun StudyGoalDialog(initial: StudyGoal?, onClose: () -> Unit, onSave: (StudyGoal) -> Unit) {
    val theme = ThemeManager.currentTheme
    var step by rememberSaveable { mutableIntStateOf(0) }
    var universityId by rememberSaveable { mutableStateOf(initial?.universityId.orEmpty()) }
    var career by rememberSaveable { mutableStateOf(initial?.career.orEmpty()) }
    var custom by rememberSaveable { mutableStateOf(initial?.catalogCareer == false) }
    var query by rememberSaveable { mutableStateOf("") }
    val university = StudyGoalCatalog.find(universityId)
    var admissionRoute by rememberSaveable { mutableStateOf(initial?.unsaRoute) }
    val draft = StudyGoal(universityId, career.trim(), !custom, admissionRoute.takeIf { universityId == "unsa" })
    fun back() { step = 0; query = "" }
    Dialog(onDismissRequest = { if (step == 1) back() else onClose() },
        properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Surface(modifier = Modifier.safeDrawingPadding().imePadding().padding(12.dp)
            .widthIn(max = 560.dp).fillMaxWidth().fillMaxHeight(.92f),
            shape = RoundedCornerShape(28.dp), color = theme.background,
            border = androidx.compose.foundation.BorderStroke(2.dp, theme.strokeBorder)) {
            Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (step == 1) IconButton(onClick = { back() }) {
                        Icon(Icons.AutoMirrored.Rounded.ArrowBack, "Volver a universidades", tint = theme.textPrimary)
                    }
                    Text("TU SIGUIENTE META", Modifier.weight(1f), color = theme.accentText,
                        style = MaterialTheme.typography.labelLarge, fontWeight = FontWeight.Black)
                    Text("Paso ${step + 1} de 2", color = theme.textSecondary,
                        style = MaterialTheme.typography.labelMedium)
                }
                LinearProgressIndicator(progress = { (step + 1) / 2f }, modifier = Modifier.fillMaxWidth(),
                    color = theme.accent, trackColor = theme.surfaceAccent)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Column(Modifier.weight(1f)) {
                        Text(if (step == 0) "¿A dónde quieres llegar?" else "¿Qué quieres estudiar?",
                            color = theme.textPrimary, fontWeight = FontWeight.Black,
                            style = MaterialTheme.typography.headlineSmall)
                        Text(if (step == 0) "Elige tu universidad." else university?.name.orEmpty(),
                            color = theme.textSecondary, style = MaterialTheme.typography.bodySmall)
                    }
                    if (step == 1 && university != null) UniversityBadge(university.id)
                    else ClassicArtwork(ClassicAppearance.HAPPY, Modifier.size(70.dp), WelcomeIdentity.character)
                }
                OutlinedTextField(query, onValueChange = { query = it.take(100) }, singleLine = true,
                    label = { Text(if (step == 0) "Buscar universidad" else "Buscar carrera") },
                    leadingIcon = { Icon(Icons.Rounded.Search, null) }, modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp))
                LazyColumn(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(9.dp),
                    contentPadding = PaddingValues(bottom = 8.dp)) {
                    if (step == 0) {
                        val options = StudyGoalCatalog.universities.filter {
                            StudyGoalCatalog.matches("${it.acronym} ${it.name} ${it.city}", query)
                        }
                        items(options, key = { it.id }) { option ->
                            GoalOption(option.acronym, "${option.name} · ${option.city}", option.id == universityId,
                                universityId = option.id) {
                                if (universityId != option.id) { career = ""; custom = false; admissionRoute = null }
                                universityId = option.id
                            }
                        }
                        if (options.isEmpty()) item { Text("No aparece en esta selección inicial. Puedes continuar sin meta.", color = theme.textSecondary) }
                    } else {
                        if (universityId == "unsa") item {
                            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                Text("Modalidad de preparación UNSA", fontWeight = FontWeight.Bold, color = theme.textPrimary)
                                Row(Modifier.horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                    FilterChip(selected = admissionRoute == null, onClick = { admissionRoute = null }, label = { Text("Por decidir") })
                                    com.jonsuapps.rastro.android.data.UnsaAdmissionRoute.entries.forEach { route ->
                                        FilterChip(selected = admissionRoute == route, onClick = { admissionRoute = route }, label = { Text(route.label) })
                                    }
                                }
                                Text("Es una meta de preparación. Los requisitos de postulación se consultan en admision.unsa.edu.pe. No cambia temarios ni ponderaciones.", style = MaterialTheme.typography.bodySmall, color = theme.textSecondary)
                            }
                        }
                        item { Text("Carreras verificadas · selección inicial", color = theme.textSecondary,
                            style = MaterialTheme.typography.labelMedium) }
                        val options = university?.careers.orEmpty().filter { StudyGoalCatalog.matches(it, query) }.sorted()
                        items(options, key = { it }) { option ->
                            GoalOption(option, null, !custom && option == career) { career = option; custom = false }
                        }
                        if (options.isEmpty()) item { Text("No hay coincidencias.", color = theme.textSecondary) }
                        item {
                            GoalOption("Escribir otra carrera", "Se guarda como meta personal", custom) {
                                if (!custom) career = ""
                                custom = true
                            }
                        }
                        if (custom) item {
                            OutlinedTextField(career, onValueChange = { career = it.take(120) },
                                label = { Text("Mi carrera") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
                        }
                    }
                }
                Text("Esta meta no cambia tus preguntas ni el temario de RASTRO.",
                    color = theme.textSecondary, style = MaterialTheme.typography.bodySmall)
                Sticker3dButton(onClick = {
                    if (step == 0) { step = 1; query = "" } else onSave(draft)
                }, enabled = if (step == 0) university != null else draft.valid,
                    modifier = Modifier.fillMaxWidth().heightIn(min = 52.dp)) {
                    Text(if (step == 0) "Continuar" else "Guardar mi meta", color = theme.onAccent,
                        fontWeight = FontWeight.Black)
                    Spacer(Modifier.width(8.dp))
                    Icon(Icons.AutoMirrored.Rounded.ArrowForward, null, tint = theme.onAccent)
                }
                TextButton(onClick = onClose, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(if (initial == null) "Decidir después" else "Cancelar", color = theme.textSecondary)
                }
            }
        }
    }
}

@Composable
private fun GoalOption(title: String, detail: String?, selected: Boolean, universityId: String? = null, onSelect: () -> Unit) {
    val theme = ThemeManager.currentTheme
    Surface(shape = RoundedCornerShape(18.dp), color = if (selected) theme.surfaceAccent else theme.surface,
        border = androidx.compose.foundation.BorderStroke(if (selected) 2.dp else 1.dp,
            if (selected) theme.accent else theme.strokeBorder),
        modifier = Modifier.fillMaxWidth().selectable(selected, role = Role.RadioButton, onClick = onSelect)) {
        Row(Modifier.padding(12.dp).heightIn(min = 38.dp), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            if (universityId != null) UniversityBadge(universityId)
            else Icon(Icons.Rounded.School, null, tint = theme.accentText)
            Column(Modifier.weight(1f)) {
                Text(title, fontWeight = FontWeight.ExtraBold, color = theme.textPrimary)
                if (detail != null) Text(detail, style = MaterialTheme.typography.bodySmall, color = theme.textSecondary)
            }
            if (selected) Icon(Icons.Rounded.CheckCircle, "Seleccionado", tint = theme.accentText)
            else RadioButton(selected = false, onClick = null)
        }
    }
}
