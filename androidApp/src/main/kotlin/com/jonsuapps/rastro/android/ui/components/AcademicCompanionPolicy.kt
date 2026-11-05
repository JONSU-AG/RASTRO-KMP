package com.jonsuapps.rastro.android.ui.components

import java.text.Normalizer
import java.util.Locale

/** Every supported key has an explicit drawing; there is no DNA fallback. */
enum class AcademicArtwork(val key: String, val family: String) {
    BOOKS("popup_hero", "literatura"), LITERATURE("literatura", "literatura"),
    DNA("adn", "biologia"), CELL("biologia", "biologia"),
    CAT("zoologia", "zoologia"), PAW("fauna", "zoologia"), PLANT("botanica", "botanica"),
    FLASK("quimica", "quimica"), ATOM("fisica", "fisica"), BRAIN("psicologia", "psicologia"),
    GLOBE("geografia", "geografia"), PIN("ubicacion", "geografia"), WEATHER("clima", "geografia"),
    MOUNTAIN("relieve", "geografia"), WATER("hidrografia", "geografia"), PEOPLE("poblacion", "geografia"),
    POTTERY("ceramica_historica", "historia"), TEXTILE("tejido_historico", "historia"), TEMPLE("templo_andino", "historia"), QUIPU("quipu", "historia"),
    SCROLL("historia", "historia"), SCALES("civica", "historia"),
    MATH("matematica", "matematica"), TRIANGLE("geometria", "matematica"),
    SPEECH("lenguaje", "literatura"), IDEA("razonamiento", "psicologia")
}

private fun academicWords(raw: String): String = Normalizer.normalize(raw, Normalizer.Form.NFD)
    .replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT).replace('_', ' ').trim()

/** The subject is supplied separately: a word in the prose cannot override it. */
internal fun academicSubjectFamily(subject: String): String {
    val s = academicWords(subject)
    return when {
        s in listOf("adn", "biologia", "biologia general", "botanica", "zoologia") -> "biologia"
        s.startsWith("geograf") -> "geografia"
        s.startsWith("geometr") || s.startsWith("trigonom") || s.startsWith("algebr") || s.startsWith("aritmet") || s.startsWith("matemat") -> "matematica"
        s.startsWith("fisic") -> "fisica"
        s.startsWith("quimic") -> "quimica"
        s.startsWith("historia") -> "historia"
        s.startsWith("civic") || s.startsWith("educacion civic") -> "civica"
        s.startsWith("psicolog") -> "psicologia"
        s.startsWith("filosof") || s.startsWith("raz log") || s.startsWith("raz mat") || s.startsWith("razonamiento log") || s.startsWith("razonamiento mat") -> "razonamiento"
        s.startsWith("literat") -> "literatura"
        s.startsWith("lengua") || s.startsWith("ingles") || s.startsWith("comprension lect") || s.startsWith("raz verbal") || s.startsWith("razonamiento verbal") -> "lenguaje"
        else -> ""
    }
}

internal fun academicArtworkFor(subject: String, topic: String): AcademicArtwork? {
    val s = academicWords(subject)
    val words = academicWords(topic).split(Regex("[^a-z0-9]+"))
    fun has(vararg roots: String) = words.any { word -> roots.any { word.startsWith(it) } }
    return when (academicSubjectFamily(subject)) {
        "geografia" -> when {
            has("localiza", "coordenad", "cartograf", "latitud", "longitud") -> AcademicArtwork.PIN
            has("clima", "atmosfer", "meteor", "temperatura", "precipit") -> AcademicArtwork.WEATHER
            has("relieve", "cordiller", "montan", "geomorf") -> AcademicArtwork.MOUNTAIN
            has("hidrograf", "hidrosfer", "rio", "cuenca", "agua", "ocean", "marino") -> AcademicArtwork.WATER
            has("poblacion", "demograf", "migracion") -> AcademicArtwork.PEOPLE
            has("agricult", "vegetacion", "flora") -> AcademicArtwork.PLANT
            else -> AcademicArtwork.GLOBE
        }
        "matematica" -> if (s.startsWith("geometr") || s.startsWith("trigonom") || has("triangul", "poligon", "circunfer")) AcademicArtwork.TRIANGLE else AcademicArtwork.MATH
        "biologia" -> when {
            has("adn", "genet", "cromosom", "herencia") -> AcademicArtwork.DNA
            has("botanic", "plant", "flora", "fotosinte") -> AcademicArtwork.PLANT
            has("gato", "felino") -> AcademicArtwork.CAT
            has("zoolog", "animal", "fauna") -> AcademicArtwork.PAW
            else -> AcademicArtwork.CELL
        }
        "quimica" -> AcademicArtwork.FLASK
        "fisica" -> AcademicArtwork.ATOM
        "historia" -> when {
            has("quipu", "khipu") -> AcademicArtwork.QUIPU
            has("textil", "tejido", "telar", "manto", "paracas") -> AcademicArtwork.TEXTILE
            has("ceramic", "alfarer", "moche", "mochica", "nasca", "nazca") -> AcademicArtwork.POTTERY
            (has("chavin", "caral") || (s.contains("peru") && has("templo", "piramid", "arquitect"))) -> AcademicArtwork.TEMPLE
            else -> AcademicArtwork.SCROLL
        }
        "civica" -> AcademicArtwork.SCALES
        "psicologia" -> AcademicArtwork.BRAIN
        "razonamiento" -> AcademicArtwork.IDEA
        "literatura" -> AcademicArtwork.LITERATURE
        "lenguaje" -> AcademicArtwork.SPEECH
        else -> null
    }
}

/** Stable selection during parsing: at most one per section, three distinct per lesson. */
internal fun withAcademicCompanions(sections: List<AcademicSection>, subject: String): List<AcademicSection> {
    val seen = mutableSetOf<AcademicArtwork>()
    var lastSection = -2
    return sections.mapIndexed { index, section ->
        var selected = false
        section.copy(branchCards = section.branchCards.map { branch ->
            val name = academicWords(branch.name).replace(Regex("^[0-9. )]+"), "").trim()
            val generic = name in setOf("autor", "autores", "fundamento", "definicion", "concepto", "ejemplo", "ejemplos", "importante", "respuesta", "formula", "datos", "caracteristicas", "que es", "como funciona", "por que")
            val topic="${branch.name} ${section.title}"
            val drawing = academicArtworkFor(subject,topic)?.takeIf {academicCompanionMatches(it,topic)}
            // Specific scientific diagrams already accompany Physics; avoid generic atoms there.
            val show = !generic && !selected && seen.size < 3 && index > lastSection + 1 &&
                drawing != null && drawing != AcademicArtwork.ATOM && drawing !in seen
            if (show) {
                selected = true
                seen.add(drawing!!)
                lastSection = index
            }
            branch.copy(artwork = drawing.takeIf { show })
        })
    }
}

/** A subject-wide illustration is suitable for a course banner, not evidence for each topic. */
internal fun academicCompanionMatches(art:AcademicArtwork,topic:String):Boolean {
    val text=academicWords(topic)
    fun has(vararg roots:String)=text.split(Regex("[^a-z0-9]+")).any {word->roots.any(word::startsWith)}
    return when(art) {
        AcademicArtwork.CELL->has("celul","citolog","organel","mitocond","procariot","eucariot","membrana")
        AcademicArtwork.DNA->has("adn","genet","cromosom","herencia")
        AcademicArtwork.FLASK->has("laborator","mezcla","solucion","densidad","reactiv","experimen")
        AcademicArtwork.ATOM->has("atom","nucle","electron")
        AcademicArtwork.BRAIN->has("cerebr","encefal","neuron","nervios","memoria","cognit")
        AcademicArtwork.GLOBE->has("tierra","continente","planeta","globo","geograf")
        AcademicArtwork.POTTERY->has("ceramic","alfarer","moche","mochica","nasca","nazca")
        AcademicArtwork.TEXTILE->has("textil","tejido","telar","manto","paracas")
        AcademicArtwork.TEMPLE->has("templo","piramid","arquitect","chavin","caral")
        AcademicArtwork.QUIPU->has("quipu","khipu")
        AcademicArtwork.SCROLL->has("escritura","document","fuente","cronica","tratado","constitucion")
        else->true
    }
}
