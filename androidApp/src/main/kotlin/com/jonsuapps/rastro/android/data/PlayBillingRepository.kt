package com.jonsuapps.rastro.android.data

import android.app.Activity
import android.content.Context
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.ProductDetails
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.monetization.ProAccess
import com.jonsuapps.rastro.monetization.ProGrant
import com.revenuecat.purchases.*
import com.revenuecat.purchases.models.GoogleStoreProduct
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.security.MessageDigest

/** The existing store adapter, now verified by RevenueCat without paid Firebase Functions. */
class PlayBillingRepository(context: Context) : AutoCloseable {
    data class CatalogResult(val products: List<ProductDetails> = emptyList(), val responseCode: Int)
    data class Status(val loading: Boolean = false, val message: String = "", val pending: Boolean = false)
    private val appContext = context.applicationContext
    private val mutableStatus = MutableStateFlow(Status())
    val status = mutableStatus.asStateFlow()
    private var closed = false
    private var signingIn = false
    private val identityWaiters = mutableListOf<Pair<String, (Boolean) -> Unit>>()
    var checkedUid: String? = null
        private set
    private fun uid() = FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid
    private fun bound(account: String) = !closed && uid() == account &&
        Purchases.isConfigured && Purchases.sharedInstance.appUserID == account

    private fun identified(account: String, callback: (Boolean) -> Unit) {
        if (closed || uid() != account || !PlayBillingConfig.checkoutEnabled) { callback(false); return }
        if (!Purchases.isConfigured) {
            Purchases.configure(PurchasesConfiguration.Builder(appContext, PlayBillingConfig.revenueCatApiKey)
                .appUserID(account).entitlementVerificationMode(EntitlementVerificationMode.INFORMATIONAL).build())
        }
        Purchases.sharedInstance.updatedCustomerInfoListener = com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener { info ->
            if (bound(account) && info.originalAppUserId == account) applyInfo(account, info)
        }
        if (!signingIn && Purchases.sharedInstance.appUserID == account) { callback(true); return }
        identityWaiters += account to callback
        if (signingIn) return
        signingIn = true
        checkedUid = null
        ProAccess.updatePurchased(ProGrant())
        Purchases.sharedInstance.logInWith(account, onError = {
            signingIn = false
            val pending = identityWaiters.toList(); identityWaiters.clear()
            pending.forEach { it.second(false) }
        }, onSuccess = { info, _ ->
            signingIn = false
            if (bound(account)) applyInfo(account, info)
            val pending = identityWaiters.toList(); identityWaiters.clear()
            pending.forEach { (requested, action) ->
                if (bound(requested)) action(true)
                else if (uid() == requested && !closed) identified(requested, action)
                else action(false)
            }
        })
    }

    private fun applyInfo(account: String, info: CustomerInfo): Boolean {
        if (!bound(account) || info.originalAppUserId != account) return false
        if (!info.entitlements.verification.isVerified) {
            checkedUid = null
            ProAccess.updatePurchased(ProGrant())
            mutableStatus.value = Status(message = "No se pudo verificar Pro. Reintenta con conexión.")
            return false
        }
        val entitlement = info.entitlements[PlayBillingConfig.entitlementId]
        val product = entitlement?.let { e -> PlayBillingConfig.products.singleOrNull {
            it.productId == e.productIdentifier && (!it.subscription || it.basePlanId == e.productPlanIdentifier)
        } }
        val valid = entitlement != null && entitlement.isActive && entitlement.verification.isVerified &&
            entitlement.store == Store.PLAY_STORE && product != null &&
            (!product.subscription || entitlement.expirationDate != null)
        ProAccess.updatePurchased(if (valid) ProGrant(
            plan = product!!.plan.name,
            startsAt = entitlement!!.originalPurchaseDate.time,
            endsAt = entitlement.expirationDate?.time,
            enabled = true,
            grantId = "play:" + accountHash("$account:${entitlement.productIdentifier}:${entitlement.originalPurchaseDate.time}")
        ) else ProGrant())
        checkedUid = account
        return true
    }

    fun refreshEntitlement() {
        val account = uid()
        if (account == null) { checkedUid = null; ProAccess.updatePurchased(ProGrant()); return }
        identified(account) { ready ->
            if (!ready) return@identified
            Purchases.sharedInstance.getCustomerInfoWith(onError = {
                if (bound(account)) mutableStatus.value = Status(message = "No se pudo actualizar Pro. Reintenta con conexión.")
            }, onSuccess = { applyInfo(account, it) })
        }
    }

    fun queryProducts(subscription: Boolean, callback: (CatalogResult) -> Unit) {
        val account = uid() ?: run { callback(CatalogResult(responseCode = BillingClient.BillingResponseCode.SERVICE_DISCONNECTED)); return }
        val configured = PlayBillingConfig.configuredProducts.filter { it.subscription == subscription }
        identified(account) { ready ->
            if (!ready) { callback(CatalogResult(responseCode = BillingClient.BillingResponseCode.SERVICE_DISCONNECTED)); return@identified }
            Purchases.sharedInstance.getProductsWith(configured.mapNotNull { it.productId }.distinct(),
                if (subscription) ProductType.SUBS else ProductType.INAPP,
                onError = { if (bound(account)) callback(CatalogResult(responseCode = BillingClient.BillingResponseCode.SERVICE_UNAVAILABLE)) },
                onGetStoreProducts = { products ->
                    if (bound(account)) callback(CatalogResult(products.filterIsInstance<GoogleStoreProduct>()
                        .map { it.productDetails }.distinctBy { it.productId }, BillingClient.BillingResponseCode.OK))
                })
        }
    }

    fun purchase(activity: Activity, product: ProPlayProduct) {
        val account = uid()
        if (account == null || !product.configured || !PlayBillingConfig.checkoutEnabled) {
            mutableStatus.value = Status(message = "Inicia sesión para comprar Pro."); return
        }
        if (mutableStatus.value.loading) return
        mutableStatus.value = Status(loading = true, message = "Consultando Google Play…")
        identified(account) { ready ->
            if (!ready) { mutableStatus.value = Status(message = "No se pudo conectar con tu cuenta."); return@identified }
            Purchases.sharedInstance.getProductsWith(listOf(requireNotNull(product.productId)),
                if (product.subscription) ProductType.SUBS else ProductType.INAPP,
                onError = { if (bound(account)) mutableStatus.value = Status(message = "No se pudo consultar este plan. Reintenta.") },
                onGetStoreProducts = { products ->
                    if (!bound(account) || activity.isFinishing || activity.isDestroyed) { mutableStatus.value = Status(); return@getProductsWith }
                    val selected = products.filterIsInstance<GoogleStoreProduct>().singleOrNull {
                        it.productId == product.productId && (!product.subscription || it.basePlanId == product.basePlanId)
                    }
                    val base = selected?.subscriptionOptions?.basePlan
                    if (selected == null || (product.subscription && base == null)) {
                        mutableStatus.value = Status(message = "Este plan todavía no está disponible en Google Play."); return@getProductsWith
                    }
                    val params = if (product.subscription) PurchaseParams.Builder(activity, requireNotNull(base)).build()
                        else PurchaseParams.Builder(activity, selected).build()
                    Purchases.sharedInstance.purchaseWith(params,
                        onError = { error, cancelled ->
                            if (bound(account)) mutableStatus.value = Status(
                                pending = error.code == PurchasesErrorCode.PaymentPendingError,
                                message = if (cancelled) "Compra cancelada."
                                else if (error.code == PurchasesErrorCode.PaymentPendingError) "Pago pendiente. Pro se activará cuando Google lo confirme."
                                else if (error.code == PurchasesErrorCode.PurchaseInvalidError) "Google Play no reconoce esta instalación para comprar. Comprueba la cuenta de pruebas y la versión instalada desde el canal interno."
                                else "No se pudo completar la compra. Puedes reintentar o restaurarla.")
                        }, onSuccess = { _, info ->
                            if (applyInfo(account, info)) mutableStatus.value = Status(message =
                                if (ProAccess.active()) "RASTRO Pro activo. ¡A estudiar!" else "La compra aún no otorga Pro. Puedes restaurarla para reintentar.")
                        })
                })
        }
    }

    /** Explicit only: never restore/transfer receipts automatically when switching accounts. */
    fun restorePurchases() {
        val account = uid() ?: run { mutableStatus.value = Status(message = "Inicia sesión para restaurar compras."); return }
        if (mutableStatus.value.loading) return
        mutableStatus.value = Status(loading = true, message = "Restaurando compras…")
        identified(account) { ready ->
            if (!ready) { mutableStatus.value = Status(message = "No se pudo conectar con tu cuenta."); return@identified }
            Purchases.sharedInstance.restorePurchasesWith(onError = {
                if (bound(account)) mutableStatus.value = Status(message = "No se pudo restaurar. Comprueba la cuenta de Google Play y reintenta.")
            }, onSuccess = { info ->
                if (applyInfo(account, info)) mutableStatus.value = Status(message =
                    if (ProAccess.active()) "Pro restaurado." else "No hay compras Pro activas para esta cuenta.")
            })
        }
    }

    override fun close() {
        closed = true; checkedUid = null
        if (Purchases.isConfigured) Purchases.sharedInstance.updatedCustomerInfoListener = null
        val pending = identityWaiters.toList(); identityWaiters.clear(); pending.forEach { it.second(false) }
    }
    companion object {
        fun accountHash(uid: String): String = MessageDigest.getInstance("SHA-256").digest(uid.toByteArray(Charsets.UTF_8))
            .joinToString("") { "%02x".format(it) }
    }
}
