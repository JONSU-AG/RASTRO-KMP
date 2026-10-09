package com.jonsuapps.rastro.android.data

/** Personal backups are independent from messages, playlists and competitive operations. */
object CloudSyncPolicy {
    const val INTERVAL_MS = 3L * 24 * 60 * 60 * 1000
    fun due(enabled: Boolean, lastSuccess: Long, now: Long): Boolean =
        enabled && (lastSuccess == 0L || now - lastSuccess >= INTERVAL_MS)
    fun canWrite(uid: String, authenticatedUid: String?, anonymous: Boolean): Boolean =
        uid.isNotBlank() && uid == authenticatedUid && !anonymous
    fun conflict(expected: Long, remote: Long): Boolean = expected != remote
}
