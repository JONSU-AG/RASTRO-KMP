package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

/** A narrow outline only on course artwork; one accessible text, unchanged layout. */
@Composable internal fun BannerOutlinedText(text: String, fontSize: TextUnit, fontWeight: FontWeight,
    modifier: Modifier = Modifier, lineHeight: TextUnit = TextUnit.Unspecified) {
    val outline = with(LocalDensity.current) { .8.dp.toPx() * 2 }
    Box(modifier) {
        Text(text, color = Color.Black.copy(alpha = .9f), fontSize = fontSize, fontWeight = fontWeight,
            lineHeight = lineHeight, style = TextStyle(drawStyle = Stroke(outline)),
            modifier = Modifier.clearAndSetSemantics {})
        Text(text, color = Color.White, fontSize = fontSize, fontWeight = fontWeight, lineHeight = lineHeight)
    }
}
