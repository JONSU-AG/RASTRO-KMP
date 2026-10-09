package com.jonsuapps.rastro.android.data

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.google.ads.mediation.admob.AdMobAdapter
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.google.android.ump.*
import com.jonsuapps.rastro.BuildConfig
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.lang.ref.WeakReference
import java.util.UUID

/** Only Google's earned-reward callback confirms a video; closing or load failure never does. */
object AdMobProvider : RastroAdProvider {
    private var host = WeakReference<Activity>(null)
    private var initialized = false
    private var initializing = false
    private var consent: ConsentInformation? = null
    private var rewardedAd: RewardedAd? = null
    private var interstitialAd: InterstitialAd? = null
    private var rewardedAt = 0L
    private var interstitialAt = 0L
    private var loadingReward = false
    private var loadingInterstitial = false
    private var requestGeneration = 0
    private var previewMode: Boolean? = null
    private val available = MutableStateFlow(false)
    val rewardedReady = available.asStateFlow()
    private val privacy = MutableStateFlow(false)
    val privacyRequired = privacy.asStateFlow()
    private val main = Handler(Looper.getMainLooper())
    private fun activity() = host.get()?.takeUnless { it.isFinishing || it.isDestroyed }
    private fun foreground(activity: Activity) = (activity as? androidx.lifecycle.LifecycleOwner)
        ?.lifecycle?.currentState?.isAtLeast(androidx.lifecycle.Lifecycle.State.RESUMED) == true
    override val ready get() = initialized && consent?.canRequestAds() == true && activity() != null

    fun attach(activity: Activity) {
        host = WeakReference(activity)
        AdsPlacementController.provider = this
        consent = UserMessagingPlatform.getConsentInformation(activity)
        consent?.requestConsentInfoUpdate(activity, ConsentRequestParameters.Builder().build(), {
            if (activity() !== activity) return@requestConsentInfoUpdate
            UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity) {
                updatePrivacy()
                initializeIfAllowed()
            }
        }, {
            updatePrivacy()
            // UMP may still permit requests using valid consent from a previous launch.
            initializeIfAllowed()
        })
    }

    private fun updatePrivacy() {
        privacy.value = consent?.privacyOptionsRequirementStatus == ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED
    }

    private fun initializeIfAllowed() {
        if (consent?.canRequestAds() != true || activity() == null) return
        if (initialized) { preload(); return }
        if (initializing) return
        initializing = true
        MobileAds.setRequestConfiguration(RequestConfiguration.Builder()
            .setMaxAdContentRating(RequestConfiguration.MAX_AD_CONTENT_RATING_G)
            .setPublisherPrivacyPersonalizationState(RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED)
            .build())
        val context = activity()?.applicationContext ?: return
        Thread {
            MobileAds.initialize(context) {
                main.post { initializing = false; initialized = true; preload() }
            }
        }.start()
    }

    private fun request(): AdRequest = AdRequest.Builder()
        .addNetworkExtrasBundle(AdMobAdapter::class.java, Bundle().apply { putString("npa", "1") })
        .build()

    fun preload() {
        val preview = AdsPlacementController.adminPreview()
        if (previewMode != preview) {
            previewMode = preview
            requestGeneration++
            rewardedAd = null; interstitialAd = null
            loadingReward = false; loadingInterstitial = false
            available.value = false
        }
        if (!ready) { available.value = false; return }
        val context = activity()?.applicationContext ?: return
        val generation = requestGeneration
        val now = System.currentTimeMillis()
        if (now - rewardedAt >= 3_600_000) rewardedAd = null
        if (now - interstitialAt >= 3_600_000) interstitialAd = null
        available.value = rewardedAd != null
        if (rewardedAd == null && !loadingReward) {
            loadingReward = true
            RewardedAd.load(context, if (preview) "ca-app-pub-3940256099942544/5224354917" else BuildConfig.ADMOB_REWARDED_ID, request(), object : RewardedAdLoadCallback() {
                override fun onAdLoaded(ad: RewardedAd) {
                    if (generation != requestGeneration) return
                    loadingReward = false; rewardedAd = ad; rewardedAt = System.currentTimeMillis()
                    available.value = ready
                }
                override fun onAdFailedToLoad(error: LoadAdError) {
                    if (generation == requestGeneration) { loadingReward = false; available.value = false }
                }
            })
        }
        if (interstitialAd == null && !loadingInterstitial) {
            loadingInterstitial = true
            InterstitialAd.load(context, if (preview) "ca-app-pub-3940256099942544/1033173712" else BuildConfig.ADMOB_INTERSTITIAL_ID, request(), object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    if (generation != requestGeneration) return
                    loadingInterstitial = false; interstitialAd = ad; interstitialAt = System.currentTimeMillis()
                }
                override fun onAdFailedToLoad(error: LoadAdError) { if (generation == requestGeneration) loadingInterstitial = false }
            })
        }
    }

    override fun rewarded(onEarned: (String) -> Unit, onClosed: () -> Unit) {
        if (previewMode != AdsPlacementController.adminPreview()) { preload(); onClosed(); return }
        val activity = activity()
        val ad = rewardedAd?.takeIf { System.currentTimeMillis() - rewardedAt < 3_600_000 }
        if (!ready || activity == null || !foreground(activity) || ad == null) { onClosed(); preload(); return }
        rewardedAd = null; available.value = false
        val receipt = ad.responseInfo?.responseId ?: UUID.randomUUID().toString()
        var earned = false
        var closed = false
        fun close() { if (!closed) { closed = true; onClosed(); preload() } }
        ad.fullScreenContentCallback = object : FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() = close()
            override fun onAdFailedToShowFullScreenContent(error: AdError) = close()
        }
        try { ad.show(activity) { if (!earned) { earned = true; onEarned(receipt) } } }
        catch (_: RuntimeException) { close() }
    }

    override fun interstitial(onClosed: (Boolean) -> Unit) {
        if (previewMode != AdsPlacementController.adminPreview()) { preload(); onClosed(false); return }
        val activity = activity()
        val ad = interstitialAd?.takeIf { System.currentTimeMillis() - interstitialAt < 3_600_000 }
        if (!ready || activity == null || !foreground(activity) || ad == null) { onClosed(false); preload(); return }
        interstitialAd = null
        var shown = false
        var closed = false
        fun close() { if (!closed) { closed = true; onClosed(shown); preload() } }
        ad.fullScreenContentCallback = object : FullScreenContentCallback() {
            override fun onAdShowedFullScreenContent() { shown = true }
            override fun onAdDismissedFullScreenContent() = close()
            override fun onAdFailedToShowFullScreenContent(error: AdError) = close()
        }
        try { ad.show(activity) } catch (_: RuntimeException) { close() }
    }

    fun showPrivacyOptions() {
        val activity = activity() ?: return
        UserMessagingPlatform.showPrivacyOptionsForm(activity) { error ->
            if (error != null) Toast.makeText(activity, "No se pudieron cargar las opciones. Inténtalo de nuevo.", Toast.LENGTH_SHORT).show()
            // Discard ads requested before the user's new choice.
            requestGeneration++; loadingReward = false; loadingInterstitial = false
            rewardedAd = null; interstitialAd = null; available.value = false
            updatePrivacy(); initializeIfAllowed()
        }
    }

    fun detach(activity: Activity) {
        if (host.get() === activity) { host.clear(); available.value = false }
    }
}
