package com.jonsuapps.rastro.android.ui.components

/** A lossless rectangular Markdown table. Malformed tables remain original prose for review. */
data class AcademicTable(val headers: List<String>, val rows: List<List<String>>)

internal fun extractAcademicTables(lines: List<String>): Pair<List<String>, List<AcademicTable>> {
    fun cells(line: String) = line.trim().removePrefix("|").removeSuffix("|")
        .split(Regex("(?<!\\\\)\\|")).map { it.trim().replace("\\|", "|") }
    val prose = mutableListOf<String>()
    val tables = mutableListOf<AcademicTable>()
    var i = 0
    while (i < lines.size) {
        if (lines[i].startsWith("|") && i + 1 < lines.size &&
            cells(lines[i + 1]).all { it.matches(Regex(":?-{3,}:?")) }) {
            val start = i
            val headers = cells(lines[i]); i += 2
            val rows = mutableListOf<List<String>>()
            while (i < lines.size && lines[i].startsWith("|")) rows += cells(lines[i++])
            if (headers.size >= 2 && rows.isNotEmpty() && rows.all { it.size == headers.size }) {
                tables += AcademicTable(headers, rows)
            } else prose += lines.subList(start, i)
        } else prose += lines[i++]
    }
    return prose to tables
}
