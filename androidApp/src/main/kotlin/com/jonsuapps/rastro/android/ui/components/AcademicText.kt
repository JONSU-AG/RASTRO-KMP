package com.jonsuapps.rastro.android.ui.components

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/** Shared scientific prose for theory, questions and explanations. No content rewriting. */
@Composable
internal fun AcademicText(text: String, modifier: Modifier = Modifier, color: Color = Color.Unspecified,
    style: TextStyle = LocalTextStyle.current, fontSize: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = null, lineHeight: TextUnit = TextUnit.Unspecified, textAlign: TextAlign? = null,
    onMathClick: (() -> Unit)? = null, theoryStyle: Boolean = false) {
    val cleaned = remember(text) {AcademicPresentationText.clean(text)}
    val displayText = remember(cleaned,theoryStyle) {if(theoryStyle)academicTheoryMarkup(cleaned) else cleaned}
    if (hasScientificMarkup(displayText)) {
        ScientificMath(emptyList(), color.takeIf { it != Color.Unspecified } ?: LocalContentColor.current, modifier,
            fontSize = (if (fontSize != TextUnit.Unspecified) fontSize else
                style.fontSize.takeIf { it != TextUnit.Unspecified } ?: 16.sp).value, richText = displayText, onClick = onMathClick, theoryStyle = theoryStyle)
    } else Text(renderFormattedInlineText(displayText, theoryStyle, com.jonsuapps.rastro.theme.ThemeManager.currentTheme.isDark), modifier, color = color, style = style,
        fontSize = fontSize, fontWeight = fontWeight, lineHeight = lineHeight, textAlign = textAlign)
}

internal fun hasScientificMarkup(text: String) = Regex("""\\[A-Za-z]+|[A-Za-z\]]\s*[\^_][{A-Za-z0-9-]|\b[A-Za-z]\s*=|\$[^$]+\$""").containsMatchIn(text)
