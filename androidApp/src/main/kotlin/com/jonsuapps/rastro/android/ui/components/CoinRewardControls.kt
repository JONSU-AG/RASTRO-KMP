package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.android.data.CoinRewardsRepository
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun CoinGiftAdminControls(uid: String) {
    val theme = ThemeManager.currentTheme
    var amount by remember { mutableStateOf("50") }
    var code by remember { mutableStateOf("") }
    var single by remember { mutableStateOf(false) }
    var enabled by remember { mutableStateOf(true) }
    var busy by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }
    var codeFilter by remember { mutableStateOf<Boolean?>(true) }
    var codeCursor by remember { mutableStateOf<com.google.firebase.firestore.DocumentSnapshot?>(null) }
    var codePage by remember { mutableStateOf<CoinRewardsRepository.PromoPage?>(null) }
    var codeRefresh by remember { mutableIntStateOf(0) }
    var codesLoading by remember { mutableStateOf(false) }
    LaunchedEffect(codeFilter, codeCursor, codeRefresh) {
        codesLoading=true
        try { codePage=CoinRewardsRepository.codes(codeCursor,codeFilter) }
        catch(e: kotlinx.coroutines.CancellationException) {throw e}
        catch(_: Exception) {message="No se pudieron cargar los códigos. Pulsa Actualizar códigos."; codePage=null}
        finally {codesLoading=false}
    }
    fun done(result: Result<Unit>) {
        busy = false
        message = if (result.isSuccess) "Guardado. Las monedas se reciben al actualizar regalos." else "No se guardó: ${result.exceptionOrNull()?.localizedMessage.orEmpty()}"
    }
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Regalos de monedas", color = theme.textPrimary, fontWeight = FontWeight.Black)
        OutlinedTextField(amount, { amount = it.filter(Char::isDigit).take(7) }, label = { Text("Monedas · 1 a 1000000") }, singleLine = true, enabled = !busy)
        Button(onClick = { busy = true; CoinRewardsRepository.gift(uid, amount.toIntOrNull() ?: 0, ::done) },
            enabled = !busy && uid.isNotBlank() && (amount.toIntOrNull() ?: 0) in 1..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD) { Text("Regalar a la cuenta elegida") }
        Text("Códigos promocionales", color = theme.textPrimary, fontWeight = FontWeight.Bold)
        Row(horizontalArrangement=Arrangement.spacedBy(4.dp)) {
            listOf("Activos" to true,"Inactivos" to false,"Todos" to null).forEach { (label,value) ->
                FilterChip(selected=codeFilter==value,onClick={codeFilter=value;codeCursor=null},label={Text(label)})
            }
        }
        codePage?.codes?.forEach { promo ->
            Sticker3dCard(Modifier.fillMaxWidth()) { Column(Modifier.padding(8.dp)) {
                Text("${promo.code} · ${promo.coins} monedas",color=theme.textPrimary,fontWeight=FontWeight.Bold)
                Text(if(promo.singleUser) "Un usuario · ${if(promo.redeemedBy==null) "Sin canjear" else "Canjeado"}" else "Un canje por cuenta",color=theme.textSecondary)
                Row {
                    TextButton(enabled=!busy,onClick={code=promo.code;amount=promo.coins.toString();single=promo.singleUser;enabled=promo.enabled}) {Text("Editar")}
                    TextButton(enabled=!busy,onClick={busy=true;CoinRewardsRepository.setCodeEnabled(promo.code,!promo.enabled) { result -> done(result);if(result.isSuccess) codeRefresh++ }}) {Text(if(promo.enabled) "Desactivar" else "Activar")}
                }
            } }
        }
        if(codesLoading) LinearProgressIndicator(Modifier.fillMaxWidth())
        if(!codesLoading && codePage?.codes?.isEmpty()==true) Text("No hay códigos en este filtro.",color=theme.textSecondary)
        Row {
            TextButton(enabled=!codesLoading&&!busy,onClick={codeCursor=null;codeRefresh++}) {Text("Actualizar códigos")}
            TextButton(enabled=!codesLoading&&!busy&&codePage?.hasMore==true,onClick={codeCursor=codePage?.cursor}) {Text("Más códigos")}
        }
        OutlinedTextField(code, { code = it.take(32) }, label = { Text("Código") }, singleLine = true, enabled = !busy)
        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Text("Un único usuario", color = theme.textPrimary, modifier = Modifier.weight(1f))
            Switch(single, { single = it }, enabled = !busy)
        }
        Text(if (single) "El primer canje reserva el código para esa cuenta." else "Varios usuarios; cada cuenta puede canjearlo una vez.", color = theme.textSecondary)
        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Text("Código activo", color = theme.textPrimary, modifier = Modifier.weight(1f))
            Switch(enabled, { enabled = it }, enabled = !busy)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            TextButton(enabled = !busy && code.isNotBlank(), onClick = {
                busy = true
                CoinRewardsRepository.loadCode(code) { result ->
                    busy = false
                    result.onSuccess { (coins, one, active) -> amount = coins.toString(); single = one; enabled = active; message = "Código cargado para editar. Los canjes anteriores se conservan." }
                        .onFailure { message = it.localizedMessage ?: "No se pudo consultar." }
                }
            }) { Text("Cargar código") }
            Button(enabled = !busy && code.isNotBlank() && (amount.toIntOrNull() ?: 0) in 1..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD,
                onClick = { busy = true; CoinRewardsRepository.saveCode(code, amount.toIntOrNull() ?: 0, single, enabled) { result -> done(result);if(result.isSuccess){codeCursor=null;codeRefresh++} } }) { Text("Guardar código") }
        }
        if (message.isNotBlank()) Text(message, color = theme.textPrimary)
    }
}

@Composable
fun CoinRewardUserControls() {
    val theme = ThemeManager.currentTheme
    var code by remember { mutableStateOf("") }
    var busy by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }
    var received by remember { mutableIntStateOf(0) }
    fun done(result: Result<Int>) {
        busy = false
        result.onSuccess { if (it > 0) received = it }
        message = result.fold({ if (it > 0) "+$it monedas recibidas" else "No tienes monedas nuevas por recibir." },
            { "No se pudo recibir: ${it.localizedMessage.orEmpty()}" })
    }
    Text("Regalos y códigos", color = theme.textPrimary, fontWeight = FontWeight.Bold)
    val user by com.jonsuapps.rastro.auth.UserManager.currentUser.collectAsState()
    if (com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == user.uid } != true) {
        Text("Inicia sesión con tu cuenta para recibir regalos y canjear códigos.", color = theme.textSecondary)
        return
    }
    OutlinedTextField(code, { code = it.take(32) }, label = { Text("Código promocional") }, singleLine = true,
        enabled = !busy, modifier = Modifier.fillMaxWidth())
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Button(onClick = { busy = true; CoinRewardsRepository.redeem(code, ::done) }, enabled = !busy && code.isNotBlank()) { Text("Canjear") }
        TextButton(onClick = { busy = true; CoinRewardsRepository.collect(::done) }, enabled = !busy) { Text("Actualizar regalos") }
    }
    if (message.isNotBlank()) Text(message, color = theme.textPrimary)
    if (received > 0) CoinReceiptDialog(received) { received = 0 }
}

@Composable
private fun CoinReceiptDialog(amount: Int, onClose: () -> Unit) {
    val theme = ThemeManager.currentTheme
    val count = remember(amount) { androidx.compose.animation.core.Animatable(0f) }
    val scale = remember(amount) { androidx.compose.animation.core.Animatable(0.85f) }
    val haptic = androidx.compose.ui.platform.LocalHapticFeedback.current
    LaunchedEffect(amount) {
        haptic.performHapticFeedback(androidx.compose.ui.hapticfeedback.HapticFeedbackType.LongPress)
        scale.animateTo(1f, androidx.compose.animation.core.spring(dampingRatio = 0.55f))
        count.animateTo(amount.toFloat(), androidx.compose.animation.core.tween(650))
    }
    androidx.compose.ui.window.Dialog(onDismissRequest = onClose) {
        Sticker3dCard(Modifier.fillMaxWidth().widthIn(max = 420.dp)
            .then(Modifier.graphicsLayerForReceipt(scale.value))) {
            Column(Modifier.padding(24.dp), horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("¡Recompensa recibida!", color = theme.textPrimary, fontWeight = FontWeight.Black)
                Text("🪙", style = MaterialTheme.typography.displayMedium)
                Text("+${count.value.toInt()}", color = theme.textPrimary,
                    style = MaterialTheme.typography.displaySmall, fontWeight = FontWeight.Black)
                Text("Recibiste $amount monedas", color = theme.textPrimary)
                Button(onClick = onClose, modifier = Modifier.fillMaxWidth()) { Text("¡Genial!") }
            }
        }
    }
}

private fun Modifier.graphicsLayerForReceipt(scale: Float): Modifier =
    graphicsLayer(scaleX = scale, scaleY = scale)

