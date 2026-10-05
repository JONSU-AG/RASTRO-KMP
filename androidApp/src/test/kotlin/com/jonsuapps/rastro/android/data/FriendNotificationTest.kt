package com.jonsuapps.rastro.android.data

import org.junit.Assert.*
import org.junit.Test

class FriendNotificationTest {
    @Test fun requestUsesRealSenderAndRecipient() {
        val notification = friendNotification("juan", "gustavo", "Juan", "Solicitud de amistad",
            "Juan te envió una solicitud de amistad.", "friend_request", "gustavo_juan")
        assertEquals("juan", notification["senderUid"])
        assertEquals("gustavo", notification["recipientUid"])
        assertEquals("Juan", notification["senderName"])
        assertEquals(false, notification["read"])
        assertEquals("gustavo_juan", notification["streakId"])
    }
    @Test fun acceptanceNotifiesBothWithCounterpartNamesAndAuthorizedActor() {
        val toSender = friendNotification("gustavo", "juan", "Gustavo", "Amistad activa",
            "Racha de amigos activa con Gustavo.", "friend_active", "gustavo_juan")
        val toRecipient = friendNotification("gustavo", "gustavo", "Juan", "Amistad activa",
            "Racha de amigos activa con Juan.", "friend_active", "gustavo_juan")
        assertEquals("gustavo", toSender["senderUid"])
        assertEquals("gustavo", toRecipient["senderUid"])
        assertEquals("juan", toSender["recipientUid"])
        assertEquals("gustavo", toRecipient["recipientUid"])
        assertEquals("Gustavo", toSender["senderName"])
        assertEquals("Juan", toRecipient["senderName"])
    }
}
