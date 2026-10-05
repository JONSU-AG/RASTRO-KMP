package com.jonsuapps.rastro.android.ui.screens

/** Presentation only: keep the academic content intact and separate existing explanation headings. */
internal data class FlashcardAnswerParts(val answer: String, val heading: String?, val explanation: String?)
internal fun flashcardAnswerParts(text: String): FlashcardAnswerParts {
    val marker = Regex("(?m)^\\s*(?:📌\\s*)?(Fundamento|Explicación|Explicacion)\\s*:\\s*", RegexOption.IGNORE_CASE).find(text)
        ?: return FlashcardAnswerParts(text.trim(), null, null)
    return FlashcardAnswerParts(text.substring(0, marker.range.first).trim(), marker.groupValues[1],
        text.substring(marker.range.last + 1).trim())
}
