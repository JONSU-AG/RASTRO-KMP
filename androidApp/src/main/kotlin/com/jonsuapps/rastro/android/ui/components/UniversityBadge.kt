package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.R

internal fun universityArtwork(id: String): Int? = when (id) {
    "unsa" -> R.drawable.university_unsa
    "unmsm" -> R.drawable.university_unmsm
    "uni" -> R.drawable.university_uni
    "unt" -> R.drawable.university_unt
    "unap-puno" -> R.drawable.university_unap
    "unsaac" -> R.drawable.university_unsaac
    "unjbg" -> R.drawable.university_unjbg
    "uncp" -> R.drawable.university_uncp
    else -> null
}

/** Local, untinted institution marks. White marks retain a dark, theme-independent plate. */
@Composable
fun UniversityBadge(id: String, modifier: Modifier = Modifier) {
    val resource = universityArtwork(id) ?: return
    val painter = painterResource(resource)
    // Show the original emblem, without shrinking a horizontal university wordmark to a tiny line.
    val crop = when (id) {
        "unmsm" -> Rect(0f, 0f, painter.intrinsicSize.width * 50f / 211f, painter.intrinsicSize.height)
        "uni" -> Rect(0f, 0f, 105f, 129f)
        "unt" -> Rect(320f, 8f, 690f, 306f)
        "unap-puno" -> Rect(0f, 0f, 97f, 100f)
        else -> Rect(0f, 0f, painter.intrinsicSize.width, painter.intrinsicSize.height)
    }
    Canvas(modifier = modifier.size(64.dp, 60.dp).clip(RoundedCornerShape(12.dp))
            .background(if (id == "uni" || id == "unmsm") Color(0xFF172036) else Color.White)
            .padding(5.dp)) {
        val factor = minOf(size.width / crop.width, size.height / crop.height)
        val left = (size.width - crop.width * factor) / 2f - crop.left * factor
        val top = (size.height - crop.height * factor) / 2f - crop.top * factor
        clipRect {
            translate(left, top) { with(painter) {
                draw(Size(intrinsicSize.width * factor, intrinsicSize.height * factor))
            } }
        }
    }
}
