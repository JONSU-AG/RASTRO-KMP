package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.data.SharedStreakMath
import com.jonsuapps.rastro.android.data.UserProfileRepository
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.accentText

@Composable
internal fun GroupStreakSection(streaks: List<Map<String, Any>>, uid: String, theme: RastroPalette, onMessage: (String) -> Unit) {
    var choosing by remember { mutableStateOf(false) }
    var selected by remember(uid) { mutableStateOf(emptySet<String>()) }
    var busy by remember { mutableStateOf(false) }
    val friends = streaks.filter { it["type"] != "group" && it["status"] == "active" }
    if (friends.isNotEmpty()) {
        TextButton(onClick = { choosing = !choosing }, enabled = !busy) { Text("Crear racha grupal", color = theme.accentText) }
        if (choosing) {
            Text("Elige amigos · de 2 a 10 participantes contigo", color = theme.textSecondary, fontSize = 12.sp)
            friends.forEach { friend ->
                val incoming = friend["user2Uid"] == uid
                val other = friend[if (incoming) "user1Uid" else "user2Uid"] as? String ?: return@forEach
                Row(Modifier.fillMaxWidth()) {
                    Checkbox(checked = other in selected, enabled = !busy && (selected.size < 9 || other in selected),
                        onCheckedChange = { selected = if (it) selected + other else selected - other })
                    Text((friend[if (incoming) "senderName" else "recipientName"] as? String) ?: "Estudiante RASTRO",
                        modifier = Modifier.padding(top = 14.dp), color = theme.textPrimary, fontSize = 13.sp)
                }
            }
            TextButton(onClick = {
                busy = true
                UserProfileRepository.createGroupStreak(selected) { ok ->
                    busy = false
                    if (ok) { choosing = false; selected = emptySet() }
                    onMessage(if (ok) "Invitaciones enviadas. La racha inicia cuando todos acepten." else "No se pudo crear el grupo. Inténtalo de nuevo.")
                }
            }, enabled = !busy && selected.isNotEmpty()) { Text("Invitar al grupo", color = theme.accentText) }
        }
    }
    streaks.filter { it["type"] == "group" && it["status"] != "rejected" }.forEach { group ->
        val id = group["id"] as? String ?: return@forEach
        val accepted = (group["accepted"] as? Map<*, *>).orEmpty()
        val names = (group["memberNames"] as? Map<*, *>).orEmpty()
        val members = (group["participants"] as? List<*>)?.filterIsInstance<String>().orEmpty()
        Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = theme.surfaceAccent)) {
            Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text("Racha grupal · ${members.size} amigos", color = theme.textPrimary)
                Text(members.joinToString { names[it]?.toString() ?: "Estudiante RASTRO" }, color = theme.textSecondary, fontSize = 12.sp)
                Text(if (group["status"] == "active") "${SharedStreakMath.days(group)} días juntos" else "${accepted.values.count { it == true }}/${members.size} aceptaron",
                    color = theme.accentText, fontSize = 12.sp)
                if (group["status"] == "pending" && accepted[uid] != true) Row {
                    listOf(true to "Aceptar", false to "Rechazar").forEach { (accept, label) ->
                        TextButton(enabled = !busy, onClick = {
                            busy = true
                            UserProfileRepository.respondGroupStreak(id, accept) { ok ->
                                busy = false
                                onMessage(if (ok) "Respuesta guardada." else "No se pudo responder. Inténtalo de nuevo.")
                            }
                        }) { Text(label, color = theme.accentText) }
                    }
                }
            }
        }
    }
}
