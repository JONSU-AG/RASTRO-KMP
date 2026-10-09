package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.AccountDeletionPlan
import org.junit.Assert.*
import org.junit.Test

class AccountDeletionPlanTest {
    @Test fun driveCleanupCannotSelectPersonalFilesOrAnotherUid() {
        assertTrue(AccountDeletionPlan.isGeneratedProfileImage("uid", "uid_profile_123.jpg"))
        assertTrue(AccountDeletionPlan.isGeneratedProfileImage("uid", "uid_cover_123.jpg"))
        assertFalse(AccountDeletionPlan.isGeneratedProfileImage("uid", "other_profile_123.jpg"))
        assertFalse(AccountDeletionPlan.isGeneratedProfileImage("uid", "uid_mis_apuntes.pdf"))
        assertFalse(AccountDeletionPlan.isGeneratedProfileImage("uid", "uid_profile_familia.jpg"))
    }
    @Test fun cleanupRequiresRecentRealAuthentication() {
        assertFalse(AccountDeletionPlan.hasRecentLogin(0, 1000))
        assertFalse(AccountDeletionPlan.hasRecentLogin(700, 1000))
        assertFalse(AccountDeletionPlan.hasRecentLogin(1001, 1000))
        assertTrue(AccountDeletionPlan.hasRecentLogin(800, 1000))
    }
}
