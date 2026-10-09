package com.jonsuapps.rastro.android.data
import com.jonsuapps.rastro.monetization.*
import com.jonsuapps.rastro.gamification.GamificationManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.android.RastroApplication

/** The adapter confirms videos from Google's reward callback. The current wallet is not
 * server-authoritative: SSV is still required before adding paid or transferable credits. */
interface RastroAdProvider {
    val ready: Boolean
    fun rewarded(onEarned: (receiptId: String) -> Unit, onClosed: () -> Unit)
    fun interstitial(onClosed: (actuallyShown: Boolean) -> Unit)
}
object AdsPlacementController {
    fun adminPreview(): Boolean = FirebaseAuth.getInstance().currentUser?.let {
        !it.isAnonymous && com.jonsuapps.rastro.auth.AdminConfig.isAdmin(it.email) &&
            com.jonsuapps.rastro.auth.AdminConfig.isUserViewModeEnabled
    } == true
    var adminSurfaceActive: Boolean = false
    var provider: RastroAdProvider? = null
    private val support = MutableStateFlow(false)
    val showSupport = support.asStateFlow()
    fun dismissSupport() { support.value = false }
    private var playing = false
    private val prefs get() = RastroApplication.instance.getSharedPreferences("rastro_ad_frequency",android.content.Context.MODE_PRIVATE)
    fun rewarded(pack: RewardPack): Boolean {
        val adapter = provider?.takeIf { it.ready } ?: return false
        if(playing) return false
        playing = true
        val uid = FirebaseAuth.getInstance().currentUser?.uid.orEmpty()
        val progress = GamificationManager.openRewardPack(pack)
        MonetizationRepository.persistWallet()
        adapter.rewarded(onEarned = { receipt ->
            if(uid == FirebaseAuth.getInstance().currentUser?.uid.orEmpty()) {
                GamificationManager.confirmRewardedVideo(pack.id,progress.sessionId,receipt)
                MonetizationRepository.persistWallet()
                prefs.edit().putLong("${uid}_lastRewarded",System.currentTimeMillis()).apply()
            }
        }, onClosed = { playing=false })
        return true
    }
    fun naturalEnd(questionActive: Boolean = false) {
        val adapter = provider?.takeIf { it.ready } ?: return
        if(playing) return
        val user = FirebaseAuth.getInstance().currentUser ?: return
        // Unknown/offline entitlement must never expose a Pro tester to automatic ads.
        val preview = adminPreview()
        if (!preview && (MonetizationRepository.serverCheckedProUid != user.uid || !MonetizationRepository.billingChecked(user.uid))) return
        val now=System.currentTimeMillis();val uid=user.uid;val today=GamificationManager.getLocalDayString()
        val sessions=prefs.getInt("${uid}_${today}_sessions",0)+1
        prefs.edit().putInt("${uid}_${today}_sessions",sessions).apply()
        val created=user.metadata?.creationTimestamp ?: now
        val accountDay = java.time.temporal.ChronoUnit.DAYS.between(java.time.Instant.ofEpochMilli(created).atZone(java.time.ZoneId.of("America/Lima")).toLocalDate(),java.time.Instant.ofEpochMilli(now).atZone(java.time.ZoneId.of("America/Lima")).toLocalDate()).toInt()+1
        val admin = adminSurfaceActive
        val count=prefs.getInt("${uid}_${today}_ads",0)
        if (questionActive || admin) return
        if(!preview && !EconomyPolicy.shouldAdvertise(ProAccess.active(),admin,questionActive,accountDay,sessions,count,
            prefs.getLong("${uid}_lastAd",0),prefs.getLong("${uid}_lastRewarded",0),now,EconomySettings.config.value)) return
        fun display() {
        if(FirebaseAuth.getInstance().currentUser?.uid != uid || preview != adminPreview() ||
            (!preview && (ProAccess.active() || (MonetizationRepository.serverCheckedProUid != uid || !MonetizationRepository.billingChecked(uid)))) || adminSurfaceActive) { playing=false;return }
        adapter.interstitial { actuallyShown ->
            playing=false
            if(!actuallyShown) return@interstitial
            if (!preview) prefs.edit().putInt("${uid}_${today}_ads",count+1).putLong("${uid}_lastAd",now).apply()
            if(FirebaseAuth.getInstance().currentUser?.uid == uid && prefs.getString("${uid}_supportDay", null) != today) {
                prefs.edit().putString("${uid}_supportDay", today).apply()
                EntryNoticeRepository.claimDailyAdSupport(uid, today) { firstOfDay ->
                    if (firstOfDay && FirebaseAuth.getInstance().currentUser?.uid == uid) support.value = true
                }
            }
        }
        }
        playing=true
        display()
    }
}

