package com.jonsuapps.rastro.model

/** Presentation only. Neither progress nor availability participates in icon identity. */
object TrailIllustrations {
    /** Explicit editorial overrides by lesson ID, independent of catalog/question data. */
    val overrides: Map<String, String> = emptyMap()
    private val subjectPools = mapOf(
        "biologia" to "microscope circle-dot",
        "fisica" to "atom magnet zap orbit gauge waves-horizontal thermometer circuit-board rocket weight",
        "quimica" to "flask-conical flask-round test-tube test-tubes beaker pipette bubbles hexagon gem radiation",
        "historia" to "scroll crown landmark castle shield swords ship amphora hourglass flag",
        "literatura" to "book-open feather drama book-bookmark notebook-pen quote library-big pen-tool",
        "lenguaje" to "speech languages text-initial quote newspaper notebook-pen book-open",
        "matematica" to "pi sigma radical divide percent ruler triangle chart-line binary calculator",
        "geografia" to "earth globe mountain map compass wind trees satellite",
        "psicologia" to "brain eye heart-pulse speech puzzle network",
        "filosofia" to "lightbulb scale scroll message-circle eye",
        "civica" to "scale handshake landmark shield flag"
    )
    // Human/cellular concepts must not fall back to a rotation of unrelated organisms.
    private val biologyPools = listOf(
        "gamet|menstrual|reproduct|reproduc|ovul|fecund|embri" to "circle-dot dna",
        "meiosis|recombin|cromos|adn|arn|genet|herencia|mendel|nucleico" to "dna network",
        "mitosis|division celular|citocinesis" to "bubbles circle-dot",
        "ciclo celular|control celular" to "circle-dot microscope",
        "respiracion celular|respiracion aerob|glucolisis|ferment" to "circle-dot zap",
        "nucleo|membrana|organel|celula|procariot|endomembrana" to "circle-dot microscope",
        "tejido|epitel|conectivo|histolog" to "layers microscope",
        "excret|renal|nefron|rinon" to "droplet pipette",
        "endocr|hormona" to "droplet network",
        "digest|nutricion|aliment" to "beaker circle-dot",
        "respiratorio|hematosis|pulmon" to "wind heart-pulse",
        "nerv|cerebr|sinaps" to "brain network",
        "cardio|circul|sangre" to "heart-pulse droplet",
        "oseo|hueso|esqueleto" to "bone",
        "muscul" to "weight move",
        "virus|inmun|patolog|enfermedad" to "biohazard syringe microscope",
        "fotosint|cloroplast" to "leaf sun",
        "vegetal|botan|planta" to "leaf sprout flower-2",
        "ecologia|ecosistema|ambiente|sostenib" to "trees leaf earth",
        "evoluc|origen de la vida" to "dna microscope",
        "invertebr|artrop" to "bug shell",
        "molusco" to "shell snail",
        "ave" to "bird",
        "pez|peces" to "fish",
        "vertebr|zoolog|reino animal" to "fish bird turtle rabbit",
        "bioelement|biomolecul|lipid|proteina|enzima|carbohidrat|glucid" to "hexagon network",
        "organizacion|caracteristica|seres vivos" to "layers circle-dot",
        "objeto de estudio|ramas de la biologia|metodo cientifico|biologia" to "microscope book-open"
    )
    private val topicPools = listOf(
        "adn|arn|genet|herencia|cromos|mendel" to "dna dna-off network",
        "celula|membrana|organel|mitosis|meiosis" to "microscope circle-dot bubbles",
        "nerv|cerebr|sinaps|cognit|pensamiento" to "brain network zap",
        "cardio|circul|sangre" to "heart-pulse droplet",
        "oseo|hueso|esqueleto" to "bone weight",
        "virus|inmun|patolog|enfermedad" to "biohazard syringe microscope",
        "planta|botan|vegetal|fotosint|cloroplast" to "leaf sprout flower-2 sun",
        "ecosistema|ecologia|bosque|ambiente" to "trees tree-pine leaf earth",
        "animal|zoolog|vertebr" to "fish bird turtle rabbit",
        "invertebr|molusco|artrop" to "bug snail shell",
        "atomo|atomica|cuantic" to "atom orbit radiation",
        "enlace|molecula|compuesto" to "hexagon network diamond",
        "reaccion|laboratorio|quimica organica" to "flask-conical test-tubes beaker pipette",
        "acido|base|solucion|mezcla" to "flask-round test-tube droplet",
        "electr|corriente|circuit|carga" to "zap circuit-board lightbulb",
        "magnet" to "magnet compass",
        "onda|sonido|acust" to "waves-horizontal radio",
        "calor|temperatura|termo" to "thermometer flame snowflake",
        "optica|luz|lumin" to "sun eclipse lightbulb",
        "fuerza|newton|equilibrio|dinamica" to "weight scale move",
        "cinemat|velocidad|mru|movimiento" to "gauge timer route",
        "planeta|astronom|universo|gravita" to "orbit satellite rocket telescope",
        "agua|hidro|fluido" to "droplet waves-horizontal",
        "antigua|grecia|roma|clasica" to "landmark amphora columns-3",
        "medieval|feudal|reino|monarqu" to "castle crown shield swords",
        "independ|republic|revoluc|guerra" to "flag swords shield scroll",
        "navega|conquista|descubr|maritim" to "ship anchor compass map",
        "prehist|origen|arqueo" to "bone amphora hourglass",
        "poes|poema|liric" to "feather quote pen-tool",
        "teatro|drama|traged|comedia" to "drama speech scroll-text",
        "novela|narrat|cuento|autor|obra" to "book-bookmark book-open notebook-pen library-big",
        "texto|comunic|lengua|verbal" to "text-initial speech languages newspaper",
        "geometr|triang|angulo|poligon" to "triangle pentagon ruler square",
        "circulo|circunfer" to "circle compass chart-pie",
        "ecuacion|algebra|polinom|factor" to "sigma radical calculator pi",
        "fraccion|porcent|probab" to "divide percent chart-pie",
        "estadist|grafica|funcion" to "chart-line chart-bar chart-pie",
        "logica|suces|serie|inferen" to "binary puzzle network infinity",
        "relieve|cordillera|montana" to "mountain earth map",
        "clima|atmosfera|viento" to "wind sun snowflake",
        "mapa|cartograf|coordenada" to "map globe compass",
        "derecho|constit|ciudadan|democr" to "scale landmark handshake shield"
    )
    private fun normalized(value: String): String {
        var result = value.lowercase()
        "áéíóúüñ".zip("aeiouun").forEach { (a,b) -> result = result.replace(a,b) }
        return result
    }
    fun candidates(lesson: LessonNode): List<String> {
        val subject = normalized(lesson.subjectId)
        if (subject == "biologia") {
            // Resolve the main title first; broader topic metadata cannot override its concept.
            for (text in listOf(normalized(lesson.title), normalized(lesson.subtema))) {
                biologyPools.firstOrNull { (words, _) -> words.split('|').any { it in text } }
                    ?.let { return it.second.split(' ') }
            }
            return subjectPools.getValue("biologia").split(' ')
        }
        val text = normalized("${lesson.title} ${lesson.subtema}")
        topicPools.firstOrNull { (words, _) -> words.split('|').any { it in text } }?.let { return it.second.split(' ') }
        return (subjectPools[subject] ?: if ("matematic" in subject || "logico" in subject)
            subjectPools.getValue("matematica") else if ("verbal" in subject) subjectPools.getValue("lenguaje")
            else "puzzle target graduation-cap lightbulb book-check compass globe route").split(' ')
    }
    /** Stable ID hash selects within compatible topic art; the previous ID prevents adjacent duplicates. */
    fun resolve(lesson: LessonNode, previous: String? = null): String {
        overrides[lesson.id]?.let { return it }
        val pool = candidates(lesson)
        val hash = "${lesson.subjectId}|${lesson.semana}|${lesson.subtema}|${lesson.depth}|${lesson.id}".hashCode().toUInt()
        val first = (hash % pool.size.toUInt()).toInt()
        return pool.indices.map { pool[(first + it) % pool.size] }.firstOrNull { it != previous } ?: pool[first]
    }
    fun resolvePath(lessons: List<LessonNode>): List<String> {
        val result = mutableListOf<String>()
        lessons.forEach { result += resolve(it, result.lastOrNull()) }
        return result
    }
}
