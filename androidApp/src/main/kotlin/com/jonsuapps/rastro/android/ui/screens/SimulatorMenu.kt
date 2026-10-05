package com.jonsuapps.rastro.android.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.android.data.DriveUploadRepository
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.theme.RastroPalette
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

internal data class SimulatorVisual(val vector: String = "exam", val image: String = "", val tint: Int = 0)
private val simulatorVectors = linkedMapOf("exam" to R.drawable.ic_nav_exam_outline,
    "trophy" to R.drawable.ic_nav_ranking_outline, "cards" to R.drawable.trail_layers,
    "brain" to R.drawable.trail_brain, "book" to R.drawable.trail_book_open)

internal fun simulatorMenuSurface(theme: RastroPalette, index: Int): Color =
    lerp(theme.surface, simulatorMenuAccent(theme, index), if (theme.isDark) .16f else .14f)

internal fun simulatorMenuText(theme: RastroPalette, index: Int, secondary: Boolean): Color {
    val surface = simulatorMenuSurface(theme, index)
    fun contrast(color: Color) = (maxOf(color.luminance(), surface.luminance()) + .05f) /
        (minOf(color.luminance(), surface.luminance()) + .05f)
    val initial = if(secondary) theme.textSecondary else theme.textPrimary
    val endpoint = if(contrast(Color.Black) > contrast(Color.White)) Color.Black else Color.White
    for(step in 0..20) {
        val candidate = lerp(initial, endpoint, step / 20f)
        if(contrast(candidate) >= 4.5f) return candidate
    }
    return endpoint
}

private fun simulatorMenuAccent(theme: RastroPalette, index: Int): Color = when (index) {
    0 -> theme.answerText(false)
    4 -> com.jonsuapps.rastro.theme.CartoonFinish.gold(theme)
    else -> theme.accent
}

@Composable private fun SimulatorVisualArt(visual: SimulatorVisual, theme: RastroPalette,
    index: Int, modifier: Modifier = Modifier) {
    val accent = when (visual.tint) { 1 -> theme.textPrimary; 2 -> theme.accent; else -> simulatorMenuAccent(theme, index) }
    Box(modifier, contentAlignment = Alignment.Center) {
        if (visual.image.isNotBlank()) {
            CachedRemoteImage(url = visual.image, contentDescription = "Ilustración de la tarjeta",
                modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Fit)
        } else {
            // Existing SVG companions, layered as an illustration rather than a tiny toolbar icon.
            Box(Modifier.fillMaxWidth(.85f).height(12.dp).align(Alignment.BottomCenter)
                .background(accent.copy(alpha = .12f), CircleShape))
            if (visual.vector == "cards") {
                Icon(painterResource(R.drawable.trail_book_open), null, tint = accent.copy(alpha = .35f),
                    modifier = Modifier.fillMaxSize(.78f).graphicsLayer { rotationZ = -13f; translationX = -8.dp.toPx() })
            }
            val artModifier = Modifier.fillMaxSize(.85f).graphicsLayer { rotationZ = if(index == 0) -8f else 0f }
            if (visual.vector == "exam" || visual.vector == "trophy") {
                Icon(painterResource(if(visual.vector == "exam") R.drawable.ic_nav_exam_filled else R.drawable.ic_nav_ranking_filled),
                    null, tint = if(visual.vector == "exam") lerp(theme.surface, accent, .12f) else accent, modifier = artModifier)
            }
            Icon(painterResource(simulatorVectors[visual.vector] ?: R.drawable.ic_nav_exam_outline), null,
                tint = if(visual.vector == "exam" || visual.vector == "trophy") theme.textPrimary else accent, modifier = artModifier)
            if (visual.vector == "exam") Icon(Icons.Rounded.Edit, null,
                tint = com.jonsuapps.rastro.theme.CartoonFinish.gold(theme),
                modifier = Modifier.size(32.dp).align(Alignment.BottomEnd).graphicsLayer { rotationZ = -12f })
            if (visual.vector == "cards") Icon(painterResource(R.drawable.trail_brain), null,
                tint = theme.textPrimary, modifier = Modifier.size(24.dp))
        }
    }
}

@Composable internal fun SimulatorMenu(theme: RastroPalette, selected: Int, onSelect: (Int) -> Unit) {
    val auth = FirebaseAuth.getInstance()
    var admin by remember { mutableStateOf(AdminConfig.isEffectiveAdmin(auth.currentUser?.email)) }
    DisposableEffect(auth) {
        val listener = FirebaseAuth.AuthStateListener { admin = AdminConfig.isEffectiveAdmin(it.currentUser?.email) }
        auth.addAuthStateListener(listener)
        onDispose { auth.removeAuthStateListener(listener) }
    }
    val visuals = remember { mutableStateMapOf<Int, SimulatorVisual>() }
    var editing by remember { mutableStateOf<Int?>(null) }
    val doc = remember { FirebaseFirestore.getInstance().collection("oficiales").document("simulator_visuals") }
    DisposableEffect(doc) {
        val listener = doc.addSnapshotListener { snapshot, _ ->
            listOf(0, 4, 3).forEach { index ->
                val value = snapshot?.get("card_$index") as? Map<*, *>
                if (value != null) visuals[index] = SimulatorVisual(value["vector"] as? String ?: "exam",
                    value["image"] as? String ?: "", (value["tint"] as? Number)?.toInt() ?: 0)
            }
        }
        onDispose { listener.remove() }
    }
    fun visual(index: Int) = visuals[index] ?: SimulatorVisual(when(index) { 4 -> "trophy"; 3 -> "cards"; else -> "exam" })
    BoxWithConstraints(Modifier.fillMaxWidth()) {
        val small = maxWidth < 360.dp
        val gap = if (small) 6.dp else 8.dp
        val illustrationHeight = (((maxWidth - gap * 2) / 3) * .36f).coerceIn(32.dp, 64.dp)
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(gap)) {
                listOf(0, 4, 3).forEach { index ->
                    val title = when(index) { 4 -> "Ranking"; 3 -> "Flashcards"; else -> "Simulacro" }
                    val subtitle = when(index) { 4 -> "Mira tu puesto"; 3 -> "Repasa conceptos"; else -> "Rinde un examen" }
                    val accent = simulatorMenuAccent(theme, index)
                    Sticker3dCard(Modifier.weight(1f), containerColor = simulatorMenuSurface(theme, index),
                        strokeColor = if (selected == index) accent else lerp(theme.strokeBorder, accent, .4f),
                        strokeWidth = 1.5.dp, bevelHeight = 3.dp, bevelColor = lerp(theme.cardBevel, accent, .25f),
                        shape = RoundedCornerShape(16.dp), onClick = { onSelect(index) }) {
                        Column(Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 6.dp)) {
                            SimulatorVisualArt(visual(index), theme, index,
                                Modifier.fillMaxWidth().height(illustrationHeight))
                            Spacer(Modifier.height(2.dp))
                            Text(title, color = simulatorMenuText(theme, index, false), fontWeight = FontWeight.Black,
                                fontSize = if(small) 12.sp else 14.sp, lineHeight = 17.sp, softWrap = false)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(subtitle, Modifier.weight(1f), color = simulatorMenuText(theme, index, true),
                                    fontSize = 9.sp, lineHeight = 12.sp)
                                MenuArrow(theme, accent, 19)
                            }
                        }
                        if (admin) IconButton(onClick = { editing = index }, modifier = Modifier.align(Alignment.TopEnd).size(32.dp)) {
                            Icon(Icons.Rounded.Edit, "Editar visual de $title", tint = theme.textPrimary, modifier = Modifier.size(13.dp))
                        }
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                listOf(1, 2).forEach { index ->
                    Sticker3dCard(Modifier.weight(1f), containerColor = theme.surface, strokeColor = theme.strokeBorder.copy(alpha = .7f),
                        strokeWidth = 1.5.dp, bevelHeight = 2.dp, shape = RoundedCornerShape(18.dp), onClick = { onSelect(index) }) {
                        Row(Modifier.fillMaxWidth().heightIn(min = 44.dp).padding(horizontal = 10.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(7.dp)) {
                            Icon(painterResource(if(index == 1) R.drawable.trail_zap else R.drawable.trail_chart_bar), null,
                                tint = simulatorMenuAccent(theme, if(index == 1) 4 else 3), modifier = Modifier.size(22.dp))
                            Column(Modifier.weight(1f)) {
                                Text(if(index == 1) "Rápido" else "Puntaje", color = theme.textPrimary, fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp, lineHeight = 15.sp)
                                Text(if(index == 1) "Practica por tema" else "Analiza tus resultados", color = theme.textSecondary,
                                    fontSize = 9.sp, lineHeight = 12.sp)
                            }
                            MenuArrow(theme, theme.accent, 18)
                        }
                    }
                }
            }
        }
    }
    editing?.let { index ->
        if (admin) SimulatorVisualEditor(index, visual(index), theme, onDismiss = { editing = null }, onSave = { value, done ->
            if (!AdminConfig.isEffectiveAdmin(auth.currentUser?.email)) { done("Sesión admin requerida"); return@SimulatorVisualEditor }
            doc.set(mapOf("card_$index" to mapOf("vector" to value.vector, "image" to value.image, "tint" to value.tint)),
                com.google.firebase.firestore.SetOptions.merge())
                .addOnSuccessListener { done(null); editing = null }
                .addOnFailureListener { done(it.localizedMessage ?: "No se pudo guardar") }
        })
    }
}

@Composable private fun MenuArrow(theme: RastroPalette, accent: Color, size: Int) {
    Box(Modifier.size(size.dp).background(accent.copy(alpha = .18f), CircleShape), contentAlignment = Alignment.Center) {
        Icon(Icons.Rounded.ChevronRight, null, tint = theme.textPrimary, modifier = Modifier.size((size - 3).dp))
    }
}

@Composable private fun SimulatorVisualEditor(index: Int, initial: SimulatorVisual, theme: RastroPalette,
    onDismiss: () -> Unit, onSave: (SimulatorVisual, (String?) -> Unit) -> Unit) {
    var draft by remember { mutableStateOf(initial) }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val picker = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if(uri != null) scope.launch {
            busy = true; error = null
            val bytes = withContext(Dispatchers.IO) { runCatching { context.contentResolver.openInputStream(uri)?.use { it.readBytes() } }.getOrNull() }
            if(bytes == null || bytes.isEmpty() || bytes.size > 5 * 1024 * 1024) {
                busy = false; error = "Selecciona una imagen de hasta 5 MB."
            } else DriveUploadRepository.uploadUserFile(context = context, bytes = bytes,
                displayName = "simulator_${System.currentTimeMillis()}", mimeType = context.contentResolver.getType(uri) ?: "image/png", makePublic = true,
                onResult = { result -> busy = false; result.onSuccess { draft = draft.copy(image = it.directUrl) }
                    .onFailure { error = it.localizedMessage ?: "No se pudo subir la imagen" } })
        }
    }
    AlertDialog(onDismissRequest = { if(!busy) onDismiss() }, containerColor = theme.surface,
        title = { Text("Visual de la tarjeta", color = theme.textPrimary) },
        text = { Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            SimulatorVisualArt(draft, theme, index, Modifier.fillMaxWidth().height(95.dp))
            Text("SVG locales · selecciona y ajusta el color", color = theme.textSecondary, fontSize = 12.sp)
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                simulatorVectors.forEach { (name, resource) -> IconButton(enabled = !busy,
                    onClick = { draft = draft.copy(vector = name, image = "") }, modifier = Modifier.size(40.dp)) {
                    Icon(painterResource(resource), "Seleccionar $name", tint = theme.accent)
                } }
            }
            Row { listOf("Original", "Tinta", "Acento").forEachIndexed { tint, name ->
                TextButton(enabled = !busy, onClick = { draft = draft.copy(tint = tint) }) { Text(name, color = theme.accent) }
            } }
            OutlinedButton(enabled = !busy, onClick = { picker.launch("image/*") }) { Text("Seleccionar imagen", color = theme.accent) }
            if(busy) CircularProgressIndicator(Modifier.size(24.dp), color = theme.accent)
            error?.let { Text(it, color = theme.textPrimary) }
        } }, confirmButton = { TextButton(enabled = !busy, onClick = { busy = true; error = null
            onSave(draft) { message -> busy = false; error = message } }) { Text("Guardar", color = theme.accent) } },
        dismissButton = { TextButton(enabled = !busy, onClick = onDismiss) { Text("Cancelar", color = theme.textPrimary) } })
}
