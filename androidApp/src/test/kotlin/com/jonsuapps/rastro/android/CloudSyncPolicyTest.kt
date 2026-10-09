package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.CloudSyncPolicy
import org.junit.Assert.*
import org.junit.Test

class CloudSyncPolicyTest {
    @Test fun disabledBackupNeverRunsEvenAfterWeeks() {
        assertFalse(CloudSyncPolicy.due(false, 0, CloudSyncPolicy.INTERVAL_MS * 5))
    }
    @Test fun enabledBackupRunsOnFirstUseAndAfterThreeDaysOnly() {
        assertTrue(CloudSyncPolicy.due(true, 0, 1))
        assertFalse(CloudSyncPolicy.due(true, 100, 100 + CloudSyncPolicy.INTERVAL_MS - 1))
        assertTrue(CloudSyncPolicy.due(true, 100, 100 + CloudSyncPolicy.INTERVAL_MS))
    }
    @Test fun clockMovingBackwardsDoesNotTriggerAnotherBackup() {
        assertFalse(CloudSyncPolicy.due(true, 1000, 500))
    }
    @Test fun guestAndAnonymousIdentitiesCannotWriteBackups() {
        assertFalse(CloudSyncPolicy.canWrite("local_student_guest", null, false))
        assertFalse(CloudSyncPolicy.canWrite("anonymous", "anonymous", true))
        assertFalse(CloudSyncPolicy.canWrite("", "", false))
    }
    @Test fun accountSwitchCannotWritePreviousAccount() {
        assertFalse(CloudSyncPolicy.canWrite("old", "new", false))
        assertTrue(CloudSyncPolicy.canWrite("new", "new", false))
    }
    @Test fun remoteChangeRequiresRecoveryInsteadOfSilentOverwrite() {
        assertFalse(CloudSyncPolicy.conflict(10, 10))
        assertTrue(CloudSyncPolicy.conflict(10, 11))
        assertTrue(CloudSyncPolicy.conflict(0, 11))
    }
}
