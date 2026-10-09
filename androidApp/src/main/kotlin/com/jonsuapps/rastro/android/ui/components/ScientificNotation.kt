package com.jonsuapps.rastro.android.ui.components

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.em

/** Display-only conversion: no rewriting, evaluating or replacing academic expressions. */
internal fun scientificNotation(expression: String): AnnotatedString = buildAnnotatedString {
    val subscripts = Regex("_([A-Za-z0-9]+)")
    var cursor = 0
    for (match in subscripts.findAll(expression)) {
        append(expression.substring(cursor, match.range.first))
        val start = length
        append(match.groupValues[1])
        addStyle(SpanStyle(baselineShift = BaselineShift.Subscript, fontSize = 0.75.em), start, length)
        cursor = match.range.last + 1
    }
    append(expression.substring(cursor))
}
