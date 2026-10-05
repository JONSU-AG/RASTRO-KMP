package com.jonsuapps.rastro.android.data

import com.google.firebase.firestore.FieldValue

internal fun friendNotification(actorUid: String, recipientUid: String, counterpartName: String,
    title: String, message: String, type: String, streakId: String): Map<String, Any> = mapOf(
    "senderUid" to actorUid, "recipientUid" to recipientUid, "senderName" to counterpartName,
    "title" to title, "message" to message, "type" to type, "streakId" to streakId,
    "read" to false, "createdAt" to FieldValue.serverTimestamp()
)
