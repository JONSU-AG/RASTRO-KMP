package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.ui.geometry.Offset
import kotlin.math.abs
import kotlin.math.ceil

internal fun studyDocumentPoint(screen:Offset,scrollY:Float)=Offset(screen.x,screen.y-scrollY)

/** Grow in blocks instead of allocating a bitmap for every pixel of scrolling. */
internal fun studyInkBufferHeight(viewportHeight:Int,scrollY:Float):Int {
    val offset=if(scrollY.isFinite()) abs(scrollY.toDouble()) else 0.0
    return (ceil((viewportHeight.coerceAtLeast(1)+offset)/512.0)*512.0).coerceAtMost(Int.MAX_VALUE.toDouble()).toInt()
}
