package com.jonsuapps.rastro.android.ui.screens
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun EntryNoticesAdminPanel() {
    val db = remember { FirebaseFirestore.getInstance() }
    val theme = ThemeManager.currentTheme
    var title by remember { mutableStateOf("Bienvenido a RASTRO") }
    var message by remember { mutableStateOf("") }
    var welcomeStartsAt by remember { mutableLongStateOf(System.currentTimeMillis()) }
    var enabled by remember { mutableStateOf(false) }
    var start by remember { mutableStateOf("") }
    var end by remember { mutableStateOf("") }
    var editingId by remember { mutableStateOf<String?>(null) }
    var announcements by remember { mutableStateOf(emptyList<DocumentSnapshot>()) }
    var status by remember { mutableStateOf("") }
    var busy by remember { mutableStateOf(false) }
    DisposableEffect(Unit) {
        val welcome = db.collection("site_settings").document("welcome").addSnapshotListener { doc, error ->
            if(error!=null) status=error.localizedMessage.orEmpty()
            else { title=doc?.getString("title")?:title;message=doc?.getString("message").orEmpty();enabled=doc?.getBoolean("enabled") == true; welcomeStartsAt = doc?.getLong("startsAt") ?: welcomeStartsAt }
        }
        val notices = db.collection("notificaciones").whereEqualTo("recipientUid","all").limit(50).addSnapshotListener { doc,error ->
            if(error!=null) status=error.localizedMessage.orEmpty() else announcements=doc?.documents.orEmpty().sortedByDescending { it.getLong("startsAt") ?: 0 }
        }
        onDispose { welcome.remove();notices.remove() }
    }
    fun millis(text:String)=java.time.LocalDateTime.parse(text,java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).atZone(java.time.ZoneId.of("America/Lima")).toInstant().toEpochMilli()
    fun done(error:Exception?=null) { busy=false;status=error?.localizedMessage ?: "Guardado" }
    Column(verticalArrangement=Arrangement.spacedBy(10.dp)) {
        Text("Bienvenida y avisos temporales",color=theme.textPrimary)
        Text("La bienvenida solo alcanza cuentas creadas desde su activación. Cada cuenta ve un aviso vigente una sola vez; no acumula avisos vencidos.",color=theme.textSecondary)
        OutlinedTextField(title,{title=it.take(120)},label={Text("Título")},modifier=Modifier.fillMaxWidth())
        OutlinedTextField(message,{message=it.take(3000)},label={Text("Mensaje")},modifier=Modifier.fillMaxWidth())
        Row { Text("Bienvenida activa",modifier=Modifier.weight(1f),color=theme.textPrimary);Switch(enabled,{enabled=it}) }
        Button(onClick={busy=true;db.collection("site_settings").document("welcome").set(mapOf("title" to title,"message" to message,"enabled" to enabled,"startsAt" to welcomeStartsAt),SetOptions.merge()).addOnSuccessListener{done()}.addOnFailureListener{done(it)}},enabled=!busy) { Text("Guardar bienvenida") }
        OutlinedTextField(start,{start=it},label={Text("Inicio · yyyy-MM-dd HH:mm (Lima)")},modifier=Modifier.fillMaxWidth())
        OutlinedTextField(end,{end=it},label={Text("Fin · yyyy-MM-dd HH:mm (Lima)")},modifier=Modifier.fillMaxWidth())
        Button(onClick={runCatching{millis(start) to millis(end)}.onSuccess { (from,to) ->
            if(to<=from || message.isBlank()) { status="Revisa fechas y mensaje";return@onSuccess }
            busy=true
            val ref=editingId?.let { db.collection("notificaciones").document(it) } ?: db.collection("notificaciones").document()
            ref.set(mapOf("title" to title,"message" to message,"recipientUid" to "all","type" to "aviso","startsAt" to from,"endsAt" to to,"timestamp" to System.currentTimeMillis(),"read" to false),SetOptions.merge()).addOnSuccessListener{editingId=null;done()}.addOnFailureListener{done(it)}
        }.onFailure{status="Formato de fecha incorrecto"}},enabled=!busy) { Text(if(editingId==null) "Crear aviso temporal" else "Guardar aviso") }
        announcements.forEach { notice ->
            Text(notice.getString("title").orEmpty(),color=theme.textPrimary)
            Row {
                TextButton(onClick={editingId=notice.id;title=notice.getString("title").orEmpty();message=notice.getString("message").orEmpty();val fmt=java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").apply{timeZone=java.util.TimeZone.getTimeZone("America/Lima")};start=fmt.format(java.util.Date(notice.getLong("startsAt")?:0));end=fmt.format(java.util.Date(notice.getLong("endsAt")?:0))}) { Text("Editar") }
                TextButton(onClick={db.collection("notificaciones").document(notice.id).update("endsAt",System.currentTimeMillis()).addOnFailureListener{done(it)}}) { Text("Desactivar") }
                TextButton(onClick={db.collection("notificaciones").document(notice.id).delete().addOnFailureListener{done(it)}}) { Text("Eliminar") }
            }
        }
        if(status.isNotBlank()) Text(status,color=theme.textPrimary)
    }
}
