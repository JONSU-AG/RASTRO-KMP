package com.jonsuapps.rastro.android.data

import org.junit.Assert.*
import org.junit.Test

class AppFeedbackInputTest {
    @Test fun acceptsBothTypesAndRejectsUnknownKinds() {
        assertTrue(AppFeedbackInput.valid("error","El botón no responde"))
        assertTrue(AppFeedbackInput.valid("suggestion","Me gustaría una opción nueva"))
        assertFalse(AppFeedbackInput.valid("public","Texto válido"))
    }
    @Test fun limitsTrimmedMessagesWithoutAllowingBlankOrOversizedText() {
        assertFalse(AppFeedbackInput.valid("error","     "))
        assertFalse(AppFeedbackInput.valid("error","abcd"))
        assertTrue(AppFeedbackInput.valid("error","  abcde  "))
        assertTrue(AppFeedbackInput.valid("error","a".repeat(2000)))
        assertFalse(AppFeedbackInput.valid("error","a".repeat(2001)))
    }
}
