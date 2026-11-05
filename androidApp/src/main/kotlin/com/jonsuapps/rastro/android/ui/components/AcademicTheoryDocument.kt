package com.jonsuapps.rastro.android.ui.components

import java.text.Normalizer
import java.util.Locale

data class AcademicMapNode(val id: String, val label: String)
data class AcademicMapEdge(val from: String, val to: String, val label: String = "")
data class AcademicSourceDiagram(val nodes: List<AcademicMapNode>, val edges: List<AcademicMapEdge>, val source: String)
internal data class AcademicTheoryDocument(val text: String, val diagrams: List<AcademicSourceDiagram>)

/** Keep display equations/matrices in one prose block instead of splitting their opening command. */
internal fun groupAcademicMathLines(lines: List<String>): List<String> {
    val out=mutableListOf<String>()
    var i=0
    while(i<lines.size) {
        val line=lines[i]
        val environment=Regex("""\\begin\{([^}]+)\}""").find(line)
        val closer=when {
            environment!=null && !line.contains("\\end{${environment.groupValues[1]}}") -> "\\end{${environment.groupValues[1]}}"
            line.contains("$$") && line.indexOf("$$",line.indexOf("$$")+2)<0 -> "$$"
            line.contains("\\[") && !line.contains("\\]") -> "\\]"
            else -> null
        }
        if(closer==null) {out.add(line);i++;continue}
        val end=(i+1 until lines.size).firstOrNull {lines[it].contains(closer) || lines[it].trimStart().startsWith("#")}
        if(end==null || !lines[end].contains(closer)) {out.add(line);i++;continue}
        out.add(lines.subList(i,end+1).joinToString("\n"));i=end+1
    }
    return out
}

private const val MAP_ID = """[\p{L}_][\p{L}\p{N}_]*"""

private fun plainKey(text: String) = Normalizer.normalize(text, Normalizer.Form.NFD)
    .replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT)
    .replace(Regex("[*#|]"), "").trim().replace(Regex("^\\d+(?:\\.\\d+)*[.)]?\\s*"), "")

/** Presentation policy: remove administrative blocks, never a scientific score/result inside an example. */
internal fun prepareAcademicTheory(raw: String): AcademicTheoryDocument {
    val out = mutableListOf<String>()
    val diagrams = mutableListOf<AcademicSourceDiagram>()
    var skippingLevel: Int? = null
    val lines = raw.lines()
    var i = 0
    while (i < lines.size) {
        val line = lines[i]
        val heading = Regex("^(#{1,6})\\s+(.+)$").find(line.trim())
        if (heading != null) {
            val level = heading.groupValues[1].length
            if (skippingLevel != null && level <= skippingLevel) skippingLevel = null
            val key = plainKey(heading.groupValues[2])
            if (skippingLevel == null && (key.startsWith("ficha tecnica") || key.startsWith("portada y ficha tecnica") || key.startsWith("matriz de competencias") ||
                    key.startsWith("matriz de indicadores") || key.startsWith("competencias clave del prospecto") ||
                    key.startsWith("ponderacion oficial") || key.startsWith("ponderacion unsa") || key.startsWith("puntaje oficial") ||
                    key.startsWith("motor de gamificacion"))) skippingLevel = level
            if (skippingLevel != null) { i++; continue }
            val replacement = when {
                key == "marco conceptual y ontologia" -> null
                key.startsWith("desarrollo teorico formal") || key.startsWith("desarrollo teorico avanzado") -> "Explicación del tema"
                key.startsWith("mapa taxonomico") || key.startsWith("mapa conceptual") -> "Mapa del tema"
                key.startsWith("formulario maestro") -> "Fórmulas de consulta"
                key.startsWith("marco teorico riguroso") || key.startsWith("base teorica completa") -> "Conceptos del tema"
                key.startsWith("zona de trampas") || key.startsWith("errores frecuentes y trampas") -> "Errores frecuentes"
                key.startsWith("mnemotecnias de combate") || key.startsWith("mnemotecnias preuniversitarias") -> "Para recordar"
                key.startsWith("tecnicas y artificios de calculo") || key.startsWith("hacking y reglas") -> "Cómo resolver ejercicios"
                else -> heading.groupValues[2]
            }
            if (replacement != null) out.add("${heading.groupValues[1]} $replacement")
            i++; continue
        }
        if (skippingLevel != null) { i++; continue }
        val key = plainKey(line).trimStart('-', ' ')
        if (Regex("^(ponderacion (?:oficial|unsa|por pregunta|del curso)|puntaje (?:oficial|unsa|del curso)|nivel de recurrencia|frecuencia en examenes|tiempo estimado|eje tematico|area disciplinar|peso en (?:el )?examen|referencia prospecto|nivel de complejidad|conexion interuniversitaria)\\b").containsMatchIn(key)) { i++; continue }
        if (line.trim().startsWith("```")) {
            val language = line.trim().removePrefix("```").trim()
            val body = mutableListOf<String>()
            i++
            while (i < lines.size && !lines[i].trim().startsWith("```")) body.add(lines[i++])
            if (i < lines.size) i++
            val source = body.joinToString("\n")
            if (language in setOf("math","latex","tex")) {
                out.add("$$\n$source\n$$")
                continue
            }
            if (language == "json" && (source.contains("\"xp") || source.contains("\"retos\""))) continue
            val diagram = parseAcademicSourceDiagram(source, language)
            if (diagram != null) diagrams.add(diagram)
            else if (source.isNotBlank()) diagrams.add(AcademicSourceDiagram(emptyList(), emptyList(), source))
            continue
        }
        out.add(line); i++
    }
    return AcademicTheoryDocument(out.joinToString("\n"), diagrams)
}

/** Small explicit Mermaid graph subset. Labels and edges are copied, not inferred from prose. */
internal fun parseAcademicSourceDiagram(source: String, language: String = "mermaid"): AcademicSourceDiagram? {
    if (language.isBlank() && listOf("LA MATERIA","SUSTANCIA PURA","MEZCLA","ELEMENTO","COMPUESTO","HOMOGÉNEA","HETEROGÉNEA").all {source.contains(it)}) {
        val labels = listOf("Materia","Sustancia pura","Mezcla","Elemento","Compuesto","Homogénea","Heterogénea")
        return AcademicSourceDiagram(labels.mapIndexed {index,label -> AcademicMapNode("n$index",label)},
            listOf(0 to 1,0 to 2,1 to 3,1 to 4,2 to 5,2 to 6).map {(a,b)->AcademicMapEdge("n$a","n$b")},source)
    }
    if (language != "mermaid" && !source.trimStart().startsWith("graph ") && !source.trimStart().startsWith("flowchart ")) return null
    if (!Regex("(?m)^\\s*(?:graph|flowchart)\\s+(?:TD|TB|LR|RL|BT)\\b").containsMatchIn(source)) return null
    val nodes = linkedMapOf<String,String>()
    val edges = mutableListOf<AcademicMapEdge>()
    for (rawLine in source.lines()) {
        var line = rawLine.trim().removeSuffix(";")
        if (line.isBlank() || line.startsWith("%%") || Regex("^(graph|flowchart|style|classDef|class|linkStyle|direction)\\b").containsMatchIn(line)) continue
        val definitions = Regex("($MAP_ID)\\s*\\[")
        while (true) {
            val match = definitions.find(line) ?: break
            val opening = match.range.last
            var end = opening + 1; var depth = 1
            var quoted = false
            while (end < line.length && depth > 0) {
                if (line[end] == '"' && line.getOrNull(end-1) != '\\') quoted = !quoted
                if (!quoted && line[end] == '[' && line.getOrNull(end-1) != '\\') depth++
                if (!quoted && line[end] == ']' && line.getOrNull(end-1) != '\\') depth--
                end++
            }
            if (depth != 0) return null
            val id = match.groupValues[1]
            val label = line.substring(opening+1,end-1).trim().removeSurrounding("\"").replace(Regex("<br\\s*/?>"),"\n")
            nodes[id] = label
            line = line.replaceRange(match.range.first,end,id)
        }
        if (line.any { it in "(){}" }) return null
        val arrow = Regex("($MAP_ID)\\s*(?:-->|==>|-\\.->)\\s*(?:\\|([^|]*)\\|\\s*)?($MAP_ID)")
        var start = 0
        var found = false
        while (start < line.length) {
            val match = arrow.find(line,start) ?: break
            val from=match.groupValues[1];val to=match.groupValues[3]
            edges.add(AcademicMapEdge(from,to,match.groupValues[2]))
            nodes.putIfAbsent(from,from);nodes.putIfAbsent(to,to)
            start=match.range.last-to.length+1;found=true
        }
        if (!found && !line.matches(Regex(MAP_ID))) return null
    }
    if (nodes.isEmpty() || nodes.size>120 || edges.isEmpty()) return null
    return AcademicSourceDiagram(nodes.map {(id,label)->AcademicMapNode(id,label)},edges.distinct(),source)
}
