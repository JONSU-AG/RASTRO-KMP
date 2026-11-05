package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.android.data.CanonicalFormula

/** Presentation only: catalog values and saved IDs remain unchanged. Never evaluates an expression. */
internal object ScientificMathSource {
    private val supers = "⁰¹²³⁴⁵⁶⁷⁸⁹⁺⁻⁼⁽⁾".zip("0123456789+-=()").toMap()
    private val subs = "₀₁₂₃₄₅₆₇₈₉₊₋₌₍₎".zip("0123456789+-=()").toMap()
    private val symbols = mapOf('·' to "\\cdot ", '×' to "\\times ", '÷' to "\\div ",
        '±' to "\\pm ", '∓' to "\\mp ", '−' to "-", '≤' to "\\leq ", '≥' to "\\geq ",
        '≠' to "\\neq ", '≈' to "\\approx ", '⇒' to "\\implies ", '→' to "\\to ",
        'π' to "\\pi ", 'θ' to "\\theta ", 'α' to "\\alpha ", 'β' to "\\beta ",
        'Δ' to "\\Delta ", 'λ' to "\\lambda ", 'ρ' to "\\rho ", 'ω' to "\\omega ",
        'Ω' to "\\Omega ", 'μ' to "\\mu ", 'ε' to "\\varepsilon ", 'σ' to "\\sigma ",
        'φ' to "\\varphi ", 'Σ' to "\\Sigma ", '∞' to "\\infty ", '°' to "^{\\circ}",
        '½' to "\\frac{1}{2}", '%' to "\\%")

    fun isMathSubject(subject: String) = subject in setOf("Física", "Química", "Álgebra", "Geometría",
        "Trigonometría", "Aritmética", "Razonamiento Matemático")

    fun normalize(raw: String): String {
        val explicit = raw.trim().let { it.startsWith("$") || it.startsWith("\\[") || it.startsWith("\\(") }
        val trimmed = raw.trim().removeSurrounding("$$").removeSurrounding("$")
            .removePrefix("\\[").removeSuffix("\\]")
            .removePrefix("\\(").removeSuffix("\\)")
        // Existing TeX is authoritative. Do not strip commands, braces or regroup its operators.
        if (explicit || '\\' in trimmed || Regex("[_^]\\{").containsMatchIn(trimmed)) return trimmed
        val result = StringBuilder()
        var i = 0
        while (i < trimmed.length) {
            val c = trimmed[i]
            val script = if (c in supers) supers else if (c in subs) subs else null
            if (script != null) {
                result.append(if (c in supers) "^{" else "_{")
                while (i < trimmed.length && trimmed[i] in script) result.append(script[trimmed[i++]])
                result.append('}'); continue
            }
            if (c == '_' && i + 1 < trimmed.length && trimmed[i + 1].isLetterOrDigit()) {
                result.append("_{"); i++
                val first = trimmed[i]
                while (i < trimmed.length && when {
                    first.isLowerCase() -> trimmed[i].isLowerCase() || trimmed[i].isDigit()
                    first.isUpperCase() -> trimmed[i].isUpperCase() || trimmed[i].isDigit()
                    else -> trimmed[i].isDigit()
                }) result.append(trimmed[i++])
                result.append('}'); continue
            }
            if (c == '√' && i + 1 < trimmed.length && trimmed[i + 1] == '(') {
                var end = i + 2; var depth = 1
                while (end < trimmed.length && depth > 0) {
                    if (trimmed[end] == '(') depth++
                    if (trimmed[end] == ')') depth--
                    end++
                }
                if (depth == 0) {
                    result.append("\\sqrt{").append(normalize(trimmed.substring(i + 2, end - 1))).append('}')
                    i = end; continue
                }
            }
            if (c.isLetter() && c !in symbols) {
                var end = i + 1
                while (end < trimmed.length && trimmed[end].isLetter() && trimmed[end] !in symbols) end++
                val word = trimmed.substring(i, end)
                result.append(when (word) {
                    "sin", "cos", "tan", "cot", "sec", "csc", "log", "ln" -> "\\$word "
                    "sen" -> "\\operatorname{sen} "
                    else -> if (word.length >= 3) "\\mathrm{$word}" else word
                })
                i = end; continue
            }
            result.append(symbols[c] ?: c.toString()); i++
        }
        return result.toString()
    }

    fun canonical(formula: CanonicalFormula): String {
        if (formula.numerator.isNullOrBlank() || formula.denominator.isNullOrBlank()) return normalize(formula.mainExpression)
        fun part(s: String) = if ('\\' !in s && Regex("[A-Za-zÁÉÍÓÚáéíóúñÑ]{3,} [A-Za-zÁÉÍÓÚáéíóúñÑ]+").containsMatchIn(s))
            "\\text{${s.replace("{", "").replace("}", "")}}" else normalize(s)
        return (if (formula.leftSide.isNotBlank()) normalize(formula.leftSide) + " = " else "") +
            normalize(formula.prefix) + "\\frac{${part(formula.numerator)}}{${part(formula.denominator)}}" + normalize(formula.suffix)
    }
}
