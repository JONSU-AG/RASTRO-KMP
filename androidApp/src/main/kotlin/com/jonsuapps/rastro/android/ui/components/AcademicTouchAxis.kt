package com.jonsuapps.rastro.android.ui.components

internal enum class AcademicTouchAxis { UNDECIDED, HORIZONTAL, VERTICAL }

/** Lock only after touch slop; diagonal/vertical intent belongs to the containing reader. */
internal fun academicTouchAxis(dx:Float,dy:Float,slop:Float):AcademicTouchAxis {
    val x=kotlin.math.abs(dx);val y=kotlin.math.abs(dy)
    if(maxOf(x,y)<=slop)return AcademicTouchAxis.UNDECIDED
    return if(x>y*1.2f)AcademicTouchAxis.HORIZONTAL else AcademicTouchAxis.VERTICAL
}
