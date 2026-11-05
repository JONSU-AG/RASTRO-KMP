package com.jonsuapps.rastro.android.ui.components

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.theme.accentText
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import com.jonsuapps.rastro.monetization.*
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.android.data.MonetizationRepository
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.delay

@Composable
fun ProPromotion(onClick: () -> Unit) {
    if (com.jonsuapps.rastro.monetization.PresentationMode.enabled) return
    val theme = ThemeManager.currentTheme
    val active by ProAccess.isActive.collectAsState()
    Sticker3dCard(containerColor = theme.surfaceAccent, bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder, modifier = Modifier.fillMaxWidth()) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                androidx.compose.foundation.Image(androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.ic_pro_crown_sticker), null, Modifier.size(36.dp))
                Text(if (active) "RASTRO Pro activo" else "RASTRO Pro", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 18.sp)
            }
            Text("Vidas ilimitadas · monedas y XP x2 · sin anuncios automáticos", color = theme.textSecondary)
            Sticker3dButton(onClick = onClick, modifier = Modifier.fillMaxWidth(), containerColor = theme.accent,
                bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder,
                contentPadding = PaddingValues(8.dp)) {
                Text(if (active) "Ver mis beneficios Pro" else "Conocer RASTRO Pro", color = theme.onAccent, fontWeight = FontWeight.Black)
            }
        }
    }
}

@Composable
fun RastroProDialog(onDismiss: () -> Unit) {
    if (com.jonsuapps.rastro.monetization.PresentationMode.enabled) return
    val theme = ThemeManager.currentTheme
    val context = androidx.compose.ui.platform.LocalContext.current
    val billing = remember { MonetizationRepository.playBilling(context) }
    val billingStatus by billing.status.collectAsState()
    var storeProducts by remember { mutableStateOf(emptyList<com.android.billingclient.api.ProductDetails>()) }
    var refreshProducts by remember { mutableIntStateOf(0) }
    LaunchedEffect(billing, refreshProducts) {
        billing.refreshEntitlement()
        listOf(true, false).forEach { subscription -> billing.queryProducts(subscription) { result ->
            if (result.responseCode == com.android.billingclient.api.BillingClient.BillingResponseCode.OK)
                storeProducts = (storeProducts + result.products).distinctBy { it.productId }
        } }
    }
    val grant by ProAccess.grant.collectAsState()
    var showAdminCheckout by remember { mutableStateOf(false) }
    val verifiedAdmin = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.let {
        com.jonsuapps.rastro.android.data.GamificationRepository.isVerifiedAdmin(it.uid)
    } == true
    var now by remember { mutableLongStateOf(System.currentTimeMillis()) }
    LaunchedEffect(grant) { while(true) { now = System.currentTimeMillis(); delay(1000) } }
    EconomyDialog(onDismiss = onDismiss, title = "RASTRO Pro", subtitle = "Estudia sin límites") {
        Column(Modifier.verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            EconomyHighlight(Icons.Rounded.WorkspacePremium, "Tu estudio, sin pausas", "RASTRO Pro · más práctica, más impulso")
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                BenefitTile(Icons.Rounded.Favorite, "Vidas", "Ilimitadas", Modifier.weight(1f))
                BenefitTile(Icons.Rounded.Bolt, "XP y monedas", "x2 al estudiar", Modifier.weight(1f))
            }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                BenefitTile(Icons.Rounded.Block, "Anuncios", "Sin automáticos", Modifier.weight(1f))
                BenefitTile(Icons.Rounded.Assignment, "Simulacro", "3 intentos Pro", Modifier.weight(1f))
            }
            if(grant.active(now) && !(verifiedAdmin && showAdminCheckout)) {
                Text("Pro activo · ${grant.plan}", color = theme.textPrimary, fontWeight = FontWeight.Black)
                Text(grant.endsAt?.let { "Vence: " + java.text.SimpleDateFormat("dd/MM/yyyy HH:mm", java.util.Locale.getDefault()).format(java.util.Date(it)) }
                    ?: "Pro permanente", color = theme.textSecondary)
                if (verifiedAdmin) TextButton(onClick = { showAdminCheckout = true }) { Text("Probar compras (Admin)") }
            } else {
                Text("Vidas ilimitadas en Aprender, x2 monedas de estudio, x2 XP, sin anuncios automáticos y 3 intentos Pro de Simulacro.", color = theme.textPrimary)
                Text("El primer Simulacro es gratuito para todos. Pro no modifica estrellas, racha, notas ni respuestas. Los anuncios para conseguir monedas siguen siendo voluntarios.", color = theme.textSecondary)
                Text(if (com.jonsuapps.rastro.android.data.PlayBillingConfig.checkoutEnabled)
                    "Las suscripciones se renuevan automáticamente. Puedes cancelarlas en Google Play. Permanente es un único pago."
                    else "Compras todavía no disponibles. Los precios se consultarán en Google Play.", color = theme.textSecondary)
                com.jonsuapps.rastro.android.data.PlayBillingConfig.configuredProducts.forEach { product ->
                    val details = storeProducts.singleOrNull { it.productId == product.productId }
                    val offer = details?.subscriptionOfferDetails?.singleOrNull { it.basePlanId == product.basePlanId && it.offerId == null }
                    val price = if (product.subscription) offer?.pricingPhases?.pricingPhaseList?.singleOrNull()?.formattedPrice
                        else details?.oneTimePurchaseOfferDetailsList?.singleOrNull()?.formattedPrice
                    val label = when (product.plan) {
                        com.jonsuapps.rastro.android.data.ProPlayPlan.MONTHLY -> "Pro mensual · 1 mes"
                        com.jonsuapps.rastro.android.data.ProPlayPlan.SIX_MONTHS -> "Pro semestral · 6 meses"
                        com.jonsuapps.rastro.android.data.ProPlayPlan.ANNUAL -> "Pro anual · 12 meses"
                        com.jonsuapps.rastro.android.data.ProPlayPlan.PERMANENT -> "Pro permanente · un solo pago"
                    }
                    Sticker3dButton(modifier = Modifier.fillMaxWidth(),
                        containerColor = theme.accent, bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder,
                        enabled = price != null && com.jonsuapps.rastro.android.data.PlayBillingConfig.checkoutEnabled && !billingStatus.loading,
                        onClick = {
                            var host: android.content.Context = context
                            while (host is android.content.ContextWrapper && host !is android.app.Activity) host = host.baseContext
                            (host as? android.app.Activity)?.let { billing.purchase(it, product) }
                        }) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text(label, color = theme.onAccent, fontWeight = FontWeight.Black)
                            Text(price ?: "Precio no disponible · actualiza los planes", color = theme.onAccent,
                                fontWeight = FontWeight.Bold, fontSize = 18.sp)
                        }
                    }
                }
                TextButton(onClick = { refreshProducts++ }, enabled = !billingStatus.loading) { Text("Actualizar planes y precios") }
            }
            if (billingStatus.loading) LinearProgressIndicator(Modifier.fillMaxWidth())
            if (billingStatus.message.isNotBlank()) Text(billingStatus.message, color = theme.textSecondary)
            if (com.jonsuapps.rastro.android.data.PlayBillingConfig.checkoutEnabled) TextButton(onClick = { billing.restorePurchases() }, enabled = !billingStatus.loading) { Text("Restaurar compras") }
            TextButton(onClick = onDismiss) { Text("Cerrar") }
        }
    }
}

@Composable
fun CoinAndLivesDialog(onDismiss: () -> Unit) {
    val theme = ThemeManager.currentTheme
    val state by GamificationManager.state.collectAsState()
    val storedProActive by ProAccess.isActive.collectAsState()
    val proActive = storedProActive && !com.jonsuapps.rastro.monetization.PresentationMode.enabled
    val config by EconomySettings.config.collectAsState()
    val rewardedReady by com.jonsuapps.rastro.android.data.AdMobProvider.rewardedReady.collectAsState()
    var showPro by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }
    EconomyDialog(onDismiss = onDismiss, title = "Conseguir monedas", subtitle = "${state.coins} monedas · ${state.hearts}/${state.maxHearts} vidas") {
        Column(Modifier.verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            ProPromotion { showPro = true }
            Text("Recupera tus vidas", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 20.sp)
            Text(if (proActive) "Con Pro tienes vidas ilimitadas." else "Una vida cada ${config.recoveryMinutes} min · máximo ${state.maxHearts}", color = theme.textSecondary, fontSize = 12.sp)
            listOf(Triple("5 vidas",5,config.fiveLivesPrice),Triple("10 vidas",10,config.tenLivesPrice),Triple("Recarga completa",state.maxHearts,config.fullLivesPrice)).forEach { (label, amount, price) ->
                Sticker3dButton(onClick = {
                    message = if(GamificationManager.buyLives(amount, price)) { MonetizationRepository.persistWallet(); "Vidas recargadas" } else "No tienes monedas suficientes o tus vidas ya están completas."
                }, enabled = !proActive && state.hearts < state.maxHearts, modifier = Modifier.fillMaxWidth(), containerColor = theme.accent, bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder) {
                    val lifeContentColor = if (!proActive && state.hearts < state.maxHearts) theme.onAccent else theme.textSecondary
                    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        androidx.compose.foundation.Image(androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.ic_reaction_heart), null, Modifier.size(24.dp))
                        Text(label, Modifier.weight(1f), color = lifeContentColor, fontWeight = FontWeight.Black)
                        Text("$price monedas", color = lifeContentColor, fontWeight = FontWeight.Bold)
                    }
                }
            }
            CoinRewardUserControls()
            if (!com.jonsuapps.rastro.monetization.PresentationMode.enabled) Text("Misiones de monedas", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 20.sp)
            (if (com.jonsuapps.rastro.monetization.PresentationMode.enabled) emptyList() else config.packs).filter { it.enabled }.forEach { pack ->
                Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surfaceAccent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                    Column(Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(5.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                            androidx.compose.foundation.Image(androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.ic_reward_video_sticker), null, Modifier.size(32.dp))
                            Column(Modifier.weight(1f)) {
                                Text(pack.name, color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 15.sp)
                            }
                            Text("+${pack.coins}", color = theme.accentText, fontWeight = FontWeight.Black, fontSize = 20.sp)
                        }
                        val progress = state.rewardPacks[pack.id]?.takeUnless { it.claimed }
                        val completed = progress?.receipts?.size ?: 0
                        val required = (progress?.required ?: pack.videos).coerceAtLeast(1)
                        LinearProgressIndicator(progress = { (completed.toFloat() / required).coerceIn(0f, 1f) },
                            modifier = Modifier.fillMaxWidth().height(6.dp), color = theme.accent, trackColor = theme.cardBevel)
                        Text("$completed / $required videos · ${pack.coins} monedas al completar", color = theme.textSecondary, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                        if(progress?.complete == true) Sticker3dButton(modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(horizontal = 12.dp, vertical = 7.dp), containerColor = theme.accent, bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder, onClick = {
                            GamificationManager.claimRewardPack(pack.id); MonetizationRepository.persistWallet()
                        }) { Icon(Icons.Rounded.Paid, null, tint = theme.onAccent); Spacer(Modifier.width(8.dp)); Text("Reclamar monedas", color = theme.onAccent, fontWeight = FontWeight.Black) }
                        else Sticker3dButton(modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(horizontal = 12.dp, vertical = 7.dp), containerColor = theme.accent, bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder, onClick = {
                            com.jonsuapps.rastro.android.data.AdsPlacementController.rewarded(pack)
                        }, enabled = rewardedReady) {
                            val videoContentColor = if (rewardedReady) theme.onAccent else theme.textSecondary
                            Icon(Icons.Rounded.PlayArrow, null, tint = videoContentColor)
                            Spacer(Modifier.width(8.dp))
                            Text(if (rewardedReady) "Ver video y avanzar" else "Video no disponible", color = videoContentColor, fontWeight = FontWeight.Black)
                        }
                    }
                }
            }
            Text("Completa los videos del pack para reclamar sus monedas. Cerrar un anuncio antes de obtener la recompensa no cuenta como video completado.", color = theme.textSecondary)
            if (!rewardedReady) TextButton(onClick = { com.jonsuapps.rastro.android.data.AdMobProvider.preload() }) { Text("Buscar anuncio disponible") }
            if(message.isNotBlank()) Text(message, color = theme.textPrimary)
            TextButton(onClick = onDismiss) { Text("Continuar") }
        }
    }
    if(showPro) RastroProDialog { showPro = false }
}

/** Invoke only after a real provider reports that an automatic ad was shown and dismissed. */
@Composable
fun AdSupportDialog(onDismiss: () -> Unit, onPro: () -> Unit) {
    val theme = ThemeManager.currentTheme
    EconomyDialog(onDismiss = onDismiss, title = "Gracias por apoyar RASTRO", subtitle = "Tu apoyo nos ayuda a seguir") {
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surfaceAccent,
                bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text("Tu apoyo mantiene RASTRO", color = theme.accentText, fontWeight = FontWeight.Black, fontSize = 18.sp)
                    Text("Este anuncio ayuda a mantener RASTRO y cubrir parte de nuestros servicios.", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                }
            }
            if(!ProAccess.active()) ProPromotion(onPro)
            TextButton(onClick = onDismiss) { Text("Continuar") }
        }
    }
}

@Composable
private fun EconomyDialog(onDismiss: () -> Unit, title: String, subtitle: String, content: @Composable () -> Unit) {
    val theme = ThemeManager.currentTheme
    androidx.compose.ui.window.Dialog(onDismissRequest = onDismiss, properties = androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(modifier = Modifier.widthIn(max = 560.dp).fillMaxWidth(.94f).heightIn(max = 640.dp),
            containerColor = theme.surface, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
            Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Text(title, Modifier.weight(1f), color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 22.sp)
                    IconButton(onClick = onDismiss) { Icon(Icons.Rounded.Close, "Cerrar", tint = theme.textPrimary) }
                }
                Text(subtitle, color = theme.textSecondary)
                Box(Modifier.weight(1f, fill = false).clipToBounds()) { content() }
            }
        }
    }
}

@Composable
private fun EconomyHighlight(icon: ImageVector, title: String, subtitle: String) {
    val theme = ThemeManager.currentTheme
    Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surfaceAccent,
        bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
        Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(14.dp)) {
            if (icon == Icons.Rounded.WorkspacePremium) androidx.compose.foundation.Image(
                androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.ic_pro_crown_sticker), null, Modifier.size(44.dp))
            else Icon(icon, null, tint = theme.accent, modifier = Modifier.size(44.dp))
            Column(Modifier.weight(1f)) {
                Text(title, color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 22.sp)
                Text(subtitle, color = theme.textSecondary, fontSize = 13.sp)
            }
        }
    }
}

@Composable
private fun BenefitTile(icon: ImageVector, title: String, subtitle: String, modifier: Modifier) {
    val theme = ThemeManager.currentTheme
    Sticker3dCard(modifier = modifier, containerColor = theme.surfaceAccent,
        bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(5.dp)) {
            val badgeColor = when (icon) {
                Icons.Rounded.Favorite -> androidx.compose.ui.graphics.Color(0xFFFBB8CC)
                Icons.Rounded.Bolt -> androidx.compose.ui.graphics.Color(0xFFFFD65B)
                Icons.Rounded.Block -> androidx.compose.ui.graphics.Color(0xFFBDA1F5)
                else -> androidx.compose.ui.graphics.Color(0xFF9EE7D1)
            }
            Surface(color = badgeColor, shape = androidx.compose.foundation.shape.RoundedCornerShape(10.dp),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, androidx.compose.ui.graphics.Color(0xFF17263C))) {
                Icon(icon, null, tint = androidx.compose.ui.graphics.Color(0xFF17263C), modifier = Modifier.padding(6.dp).size(24.dp))
            }
            Text(title, color = theme.textPrimary, fontWeight = FontWeight.Black)
            Text(subtitle, color = theme.textSecondary, fontSize = 12.sp)
        }
    }
}
