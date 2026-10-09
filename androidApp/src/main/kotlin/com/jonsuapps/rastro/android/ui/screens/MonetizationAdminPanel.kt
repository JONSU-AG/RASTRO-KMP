package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.android.data.MonetizationRepository
import com.jonsuapps.rastro.monetization.*
import com.jonsuapps.rastro.theme.ThemeManager
import com.google.firebase.firestore.FirebaseFirestore
import com.jonsuapps.rastro.android.data.AdminUserDirectory
import com.jonsuapps.rastro.model.UserData
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import kotlinx.coroutines.tasks.await

@Composable
fun MonetizationAdminPanel() {
    var open by remember { mutableStateOf(false) }
    Column {
        Text("Pro, regalos y códigos",fontWeight=FontWeight.Black,color=ThemeManager.currentTheme.textPrimary)
        Button(onClick={open=true}) {Text("Administrar Pro y promociones")}
    }
    if(open) androidx.compose.ui.window.Dialog(onDismissRequest={open=false},properties=androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth=false)) {
        Sticker3dCard(Modifier.fillMaxWidth(0.96f).widthIn(max=820.dp).fillMaxHeight(0.92f)) {
            Column(Modifier.padding(14.dp)) {
                Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                    Text("Pro y promociones",fontWeight=FontWeight.Black,color=ThemeManager.currentTheme.textPrimary)
                    TextButton(onClick={open=false}) {Text("Cerrar ✕")}
                }
                Column(Modifier.weight(1f).verticalScroll(rememberScrollState())) {MonetizationAdminContent()}
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun MonetizationAdminContent() {
    val theme = ThemeManager.currentTheme
    var users by remember { mutableStateOf(emptyList<UserData>()) }
    var refresh by remember { mutableIntStateOf(0) }
    var loading by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var uid by remember { mutableStateOf("") }
    var plan by remember { mutableStateOf("Permanente") }
    var start by remember { mutableStateOf(java.time.LocalDateTime.now(java.time.ZoneId.of("America/Lima")).format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))) }
    var end by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }
    var saving by remember { mutableStateOf(false) }
    val config by EconomySettings.config.collectAsState()
    var draft by remember(config) { mutableStateOf(config) }
    var pro by remember(uid) { mutableStateOf(ProGrant()) }
    var grants by remember {mutableStateOf(emptyMap<String,ProGrant>())}
    var proFilter by remember {mutableStateOf("Todos")}
    var visibleUsers by remember {mutableIntStateOf(20)}
    DisposableEffect(uid) {
        var active = true
        val listener = if(uid.isNotBlank()) FirebaseFirestore.getInstance().collection("rastro_pro").document(uid).addSnapshotListener { doc, error ->
            if (!active) return@addSnapshotListener
            if(error != null) message = error.localizedMessage ?: "No se pudo consultar Pro"
            else pro = ProGrant(doc?.getString("plan").orEmpty(),doc?.getLong("startsAt") ?: 0,doc?.getLong("endsAt"),doc?.getBoolean("enabled") == true,doc?.getString("grantId").orEmpty())
        } else null
        onDispose { active = false; listener?.remove() }
    }
    LaunchedEffect(refresh) {
        loading = true
        try {
            users = AdminUserDirectory.load(force = refresh > 0)
            val all = mutableMapOf<String,ProGrant>()
            var cursor: com.google.firebase.firestore.DocumentSnapshot? = null
            do {
                val query=FirebaseFirestore.getInstance().collection("rastro_pro").orderBy(com.google.firebase.firestore.FieldPath.documentId()).limit(100)
                val page=(if(cursor==null) query else query.startAfter(cursor!!)).get(com.google.firebase.firestore.Source.SERVER).await()
                page.documents.forEach { d -> all[d.id]=ProGrant(d.getString("plan").orEmpty(),d.getLong("startsAt") ?: 0,d.getLong("endsAt"),d.getBoolean("enabled")==true,d.getString("grantId").orEmpty()) }
                cursor=page.documents.lastOrNull()
                if(page.size()<100) break
            } while(cursor!=null)
            grants=all
        } catch (cancelled: kotlinx.coroutines.CancellationException) { throw cancelled
        } catch (_: Exception) { message = "No se pudieron consultar los usuarios. Pulsa Actualizar usuarios para reintentar."
        } finally { loading = false }
    }
    fun millis(text: String): Long = java.time.LocalDateTime.parse(text,java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
        .atZone(java.time.ZoneId.of("America/Lima")).toInstant().toEpochMilli()
    fun result(result: Result<Unit>) { saving = false; message = if(result.isSuccess) "Cambios guardados" else result.exceptionOrNull()?.localizedMessage ?: "No se pudo guardar"; if(result.isSuccess) refresh++ }
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("RASTRO Pro y economía", color = theme.textPrimary, fontWeight = FontWeight.Black)
        Text("A los testers asígnales Pro permanente. No existe un modo tester; puedes retirar el beneficio cuando quieras.",color = theme.textSecondary)
        Text("El beneficio se activa directamente en la cuenta elegida; el estudiante no necesita aceptar ni pagar.",color=theme.textSecondary)
        OutlinedTextField(search,{search=it;uid="";message=""},label={Text("Buscar por correo, nombre o UID")},modifier=Modifier.fillMaxWidth(),singleLine=true,enabled=!saving)
        FlowRow(horizontalArrangement=Arrangement.spacedBy(4.dp)) {listOf("Todos","Pro manual","Sin Pro manual").forEach {option ->
            FilterChip(selected=proFilter==option,onClick={proFilter=option;visibleUsers=20},label={Text(option)})
        }}
        Text("Esta lista muestra concesiones Admin. Las compras verificadas se consultan en RevenueCat; no se clasifican como gratuitas por no tener un regalo.",color=theme.textSecondary)
        val context=androidx.compose.ui.platform.LocalContext.current
        TextButton(onClick={runCatching {context.startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW,android.net.Uri.parse("https://app.revenuecat.com/projects/173d075d/customers")))}}) {Text("Ver compradores en RevenueCat")}
        val now=System.currentTimeMillis()
        val matches = users.filter { (search.isBlank() || AdminUserDirectory.matches(it,search)) && when(proFilter){"Pro manual"->grants[it.uid]?.active(now)==true;"Sin Pro manual"->grants[it.uid]?.active(now)!=true;else->true} }
        FlowRow(horizontalArrangement=Arrangement.spacedBy(6.dp)) {
            matches.take(visibleUsers).forEach { user -> FilterChip(selected=uid==user.uid,onClick={uid=user.uid},enabled=!saving,label={Text("${user.displayName} · ${user.email ?: user.uid}${if(grants[user.uid]?.active(now)==true) " · Pro" else ""}")}) }
        }
        if(matches.size>visibleUsers) TextButton(onClick={visibleUsers+=20}) {Text("Ver más usuarios (${matches.size})")}
        if(!loading && search.isNotBlank() && matches.isEmpty()) Text("No hay perfiles con ese criterio. Actualiza o revisa el correo.",color=theme.textSecondary)
        Row {
            TextButton(onClick={refresh++},enabled=!loading&&!saving) { Text(if(loading) "Cargando…" else "Actualizar usuarios") }
            TextButton(onClick={
                val self = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
                if (self != null) { uid=self.uid; search=self.email.orEmpty() }
            },enabled=!saving) { Text("Elegirme a mí") }
        }
        if(uid.isNotBlank()) {
            val selectedUser = users.firstOrNull { it.uid == uid }
            Text("Cuenta elegida: ${selectedUser?.displayName ?: "Mi cuenta"} · ${selectedUser?.email ?: uid}",color=theme.textPrimary,fontWeight=FontWeight.Bold)
            Text(if(pro.active(System.currentTimeMillis())) "Pro activo: ${pro.plan}" else "Pro inactivo",color=theme.textPrimary)
            if(pro.enabled) Text("Inicio: ${java.util.Date(pro.startsAt)} · Fin: ${pro.endsAt?.let { java.util.Date(it).toString() } ?: "Permanente"}",color=theme.textSecondary)
        }
        FlowRow(horizontalArrangement=Arrangement.spacedBy(6.dp)) { listOf("1 mes","6 meses","12 meses","Permanente","Personalizado").forEach { option ->
            FilterChip(selected=plan==option,onClick={ plan=option; end=if(option=="Permanente") "" else java.time.LocalDateTime.now(java.time.ZoneId.of("America/Lima")).plusMonths(when(option){"6 meses"->6;"12 meses"->12;else->1}).format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) },label={Text(option)})
        } }
        OutlinedTextField(start,{start=it},label={Text("Inicio · yyyy-MM-dd HH:mm (Lima)")},modifier=Modifier.fillMaxWidth())
        if(plan!="Permanente") OutlinedTextField(end,{end=it},label={Text("Fin · yyyy-MM-dd HH:mm (Lima)")},modifier=Modifier.fillMaxWidth())
        Row {
            Button(onClick={ runCatching { millis(start) to if(plan=="Permanente") null else millis(end) }.onSuccess { (from,to) -> saving=true; MonetizationRepository.grant(uid,plan,from,to,::result) }.onFailure { message="Revisa las fechas" } }, enabled=uid.isNotBlank()&&!saving) { Text("Asignar Pro") }
            TextButton(onClick={saving=true; MonetizationRepository.revoke(uid,::result)},enabled=uid.isNotBlank()&&!saving) { Text("Retirar Pro") }
        }
        CoinGiftAdminControls(uid)
        Text("Economía remota",color=theme.textPrimary,fontWeight=FontWeight.Bold)
        EconomyNumber("Máximo de vidas",draft.maxLives,1..100) { draft=draft.copy(maxLives=it) }
        EconomyNumber("Minutos por vida",draft.recoveryMinutes.toInt(),1..1440) { draft=draft.copy(recoveryMinutes=it.toLong()) }
        EconomyNumber("Precio 5 vidas",draft.fiveLivesPrice,1..10000) { draft=draft.copy(fiveLivesPrice=it) }
        EconomyNumber("Precio 10 vidas",draft.tenLivesPrice,1..10000) { draft=draft.copy(tenLivesPrice=it) }
        EconomyNumber("Precio recarga completa",draft.fullLivesPrice,1..10000) { draft=draft.copy(fullLivesPrice=it) }
        EconomyNumber("Precio examen rápido",draft.quickExamPrice,1..10000) { draft=draft.copy(quickExamPrice=it) }
        EconomyNumber("Precio Ranking/Simulacro",draft.examPrice,1..10000) { draft=draft.copy(examPrice=it) }
        Row { Text("Anuncios automáticos",color=theme.textPrimary,modifier=Modifier.weight(1f)); Switch(draft.automaticAds,{draft=draft.copy(automaticAds=it)}) }
        Text("Los anuncios automáticos respetan Pro y estos límites. Se muestran tras actividades, nunca durante preguntas.",color=theme.textSecondary)
        EconomyNumber("Primer día con anuncios",draft.firstAdDay,2..30) { draft=draft.copy(firstAdDay=it) }
        EconomyNumber("Separación mínima (min)",draft.minimumAdGapMinutes,1..1440) { draft=draft.copy(minimumAdGapMinutes=it) }
        EconomyNumber("Máximo diario",draft.maxDailyAds,0..20) { draft=draft.copy(maxDailyAds=it) }
        EconomyNumber("Día 2: uno cada N cierres",draft.secondDayEvery,1..20) { draft=draft.copy(secondDayEvery=it) }
        EconomyNumber("Día 3: uno cada N cierres",draft.thirdDayEvery,1..20) { draft=draft.copy(thirdDayEvery=it) }
        EconomyNumber("Habitual: uno cada N cierres",draft.normalEvery,1..20) { draft=draft.copy(normalEvery=it) }
        draft.packs.forEachIndexed { index, pack ->
            Text(pack.name,color=theme.textPrimary,fontWeight=FontWeight.Bold)
            Switch(pack.enabled,{ value -> draft=draft.copy(packs=draft.packs.mapIndexed { i,p -> if(i==index) p.copy(enabled=value) else p }) })
            EconomyNumber("Videos",pack.videos,1..5) { value -> draft=draft.copy(packs=draft.packs.mapIndexed { i,p -> if(i==index) p.copy(videos=value) else p }) }
            EconomyNumber("Monedas",pack.coins,1..1000) { value -> draft=draft.copy(packs=draft.packs.mapIndexed { i,p -> if(i==index) p.copy(coins=value) else p }) }
        }
        Button(onClick={saving=true;MonetizationRepository.saveEconomy(draft,::result)},enabled=!saving) { Text("Guardar economía") }
        if(message.isNotBlank()) Text(message,color=theme.textPrimary)
    }
}
@Composable
private fun EconomyNumber(label: String, value: Int, range: IntRange, onValue: (Int) -> Unit) {
    var text by remember(value) { mutableStateOf(value.toString()) }
    OutlinedTextField(text,{ raw -> text=raw.filter(Char::isDigit).take(5);text.toIntOrNull()?.takeIf { it in range }?.let(onValue) },
        label={Text(label)},modifier=Modifier.fillMaxWidth(),singleLine=true,
        keyboardOptions=androidx.compose.foundation.text.KeyboardOptions(keyboardType=androidx.compose.ui.text.input.KeyboardType.Number))
}
