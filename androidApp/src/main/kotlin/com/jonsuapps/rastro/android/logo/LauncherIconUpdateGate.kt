package com.jonsuapps.rastro.android.logo

import com.jonsuapps.rastro.logo.RastroLogoMood

/** Keep launcher component mutations outside the visible account transition. */
internal class LauncherIconUpdateGate {
    private var visible = false
    private var pending: RastroLogoMood? = null

    fun visibilityChanged(isVisible: Boolean): RastroLogoMood? {
        visible = isVisible
        if (visible) return null
        return pending.also { pending = null }
    }

    fun request(mood: RastroLogoMood): RastroLogoMood? {
        if (!visible) return mood
        pending = mood
        return null
    }
}
