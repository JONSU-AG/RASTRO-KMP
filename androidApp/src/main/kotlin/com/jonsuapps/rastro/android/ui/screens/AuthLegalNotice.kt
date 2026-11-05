package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.accentText

/** Reading a link is not acceptance. Acceptance is recorded only by the access callbacks. */
@Suppress("DEPRECATION")
@Composable
internal fun AuthLegalNotice(onOpenDocument: (Int) -> Unit) {
    val theme = ThemeManager.currentTheme
    val linkStyle = SpanStyle(color = theme.accentText, fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline)
    val notice = buildAnnotatedString {
        append("Al continuar, aceptas nuestros ")
        pushStringAnnotation("LEGAL_TAB", "1")
        withStyle(linkStyle) { append("Términos y Condiciones") }
        pop()
        append(" y la ")
        pushStringAnnotation("LEGAL_TAB", "0")
        withStyle(linkStyle) { append("Política de Privacidad") }
        pop()
        append(".")
    }
    ClickableText(notice, modifier = Modifier.fillMaxWidth(),
        style = MaterialTheme.typography.bodySmall.copy(color = theme.textSecondary, textAlign = TextAlign.Center),
        onClick = { offset -> notice.getStringAnnotations("LEGAL_TAB", offset, offset)
            .firstOrNull()?.item?.toIntOrNull()?.let(onOpenDocument) })
}
