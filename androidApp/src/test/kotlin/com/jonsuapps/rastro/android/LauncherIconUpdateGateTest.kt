package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.logo.LauncherIconUpdateGate
import com.jonsuapps.rastro.logo.RastroLogoMood
import org.junit.Assert.*
import org.junit.Test

class LauncherIconUpdateGateTest {
    @Test fun accountSwitchCannotDisableVisibleLauncherAndOnlyLastMoodIsApplied() {
        val gate = LauncherIconUpdateGate()
        gate.visibilityChanged(true)
        assertNull(gate.request(RastroLogoMood.TRISTE))
        assertNull(gate.request(RastroLogoMood.BASE))
        assertEquals(RastroLogoMood.BASE, gate.visibilityChanged(false))
        assertNull(gate.visibilityChanged(false))
    }
    @Test fun configurationChangeKeepsPendingIconUntilScreenLeaves() {
        val gate = LauncherIconUpdateGate()
        gate.visibilityChanged(true)
        gate.request(RastroLogoMood.ENOJO)
        assertNull(gate.visibilityChanged(true))
        assertEquals(RastroLogoMood.ENOJO, gate.visibilityChanged(false))
        assertEquals(RastroLogoMood.FURIA, gate.request(RastroLogoMood.FURIA))
    }
}
