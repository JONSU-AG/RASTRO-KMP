package com.jonsuapps.rastro.android.data

import java.text.Normalizer

/** Initial, curated selection, not a vacancy list. Sources reviewed on 2026-11-01.
 * See docs/inicio-personalizado/FUENTES.md. No academic path is selected by this catalog. */
data class GoalUniversity(
    val id: String,
    val acronym: String,
    val name: String,
    val city: String,
    val sources: List<String>,
    val careers: List<String>
)

object StudyGoalCatalog {
    val universities = listOf(
        GoalUniversity("unsa", "UNSA", "Universidad Nacional de San Agustín de Arequipa", "Arequipa",
            listOf("https://admision.unsa.edu.pe/categorias/area-de-ingenierias/",
                "https://admision.unsa.edu.pe/categorias/area-de-sociales/",
                "https://admision.unsa.edu.pe/categorias/area-de-biomedicas/"),
            listOf("Ingeniería de Sistemas", "Ciencia de la Computación", "Ingeniería Civil",
                "Ingeniería Industrial", "Ingeniería Mecánica", "Ingeniería Ambiental",
                "Ingeniería Eléctrica", "Ingeniería Electrónica", "Ingeniería de Telecomunicaciones",
                "Ingeniería de Minas", "Ingeniería Geológica", "Ingeniería Geofísica",
                "Ingeniería Química", "Ingeniería Metalúrgica", "Ingeniería de Materiales",
                "Ingeniería de Industrias Alimentarias", "Ingeniería Sanitaria", "Arquitectura",
                "Química", "Matemáticas", "Física", "Administración", "Contabilidad",
                "Economía", "Derecho", "Psicología", "Ciencias de la Comunicación",
                "Relaciones Industriales", "Literatura y Lingüística", "Filosofía", "Artes",
                "Turismo y Hotelería", "Antropología", "Trabajo Social", "Sociología",
                "Historia", "Educación", "Finanzas", "Gestión", "Banca y Seguros", "Marketing",
                "Agronomía", "Ingeniería Pesquera", "Ciencias de la Nutrición", "Biología",
                "Medicina", "Enfermería")),
        GoalUniversity("unmsm", "UNMSM", "Universidad Nacional Mayor de San Marcos", "Lima",
            listOf("https://admision.unmsm.edu.pe/Website20271/A/A.html"),
            listOf("Administración", "Administración de Negocios Internacionales", "Administración de Turismo",
                "Antropología", "Arqueología", "Arquitectura y Urbanismo", "Arte",
                "Bibliotecología y Ciencias de la Información", "Ciencia de la Computación", "Ciencia Política",
                "Ciencias Biológicas", "Ciencias de los Alimentos", "Computación Científica", "Comunicación Social",
                "Conservación y Restauración", "Contabilidad", "Danza", "Derecho", "Economía",
                "Economía Internacional", "Economía Pública", "Educación Física", "Educación Inicial",
                "Educación Primaria", "Educación Secundaria", "Enfermería", "Estadística",
                "Farmacia y Bioquímica", "Filosofía", "Física", "Genética y Biotecnología", "Geografía",
                "Historia", "Ingeniería Agroindustrial", "Ingeniería Ambiental", "Ingeniería Biomédica",
                "Ingeniería Civil", "Ingeniería de Minas", "Ingeniería de Sistemas", "Ingeniería de Software",
                "Ingeniería de Telecomunicaciones", "Ingeniería Eléctrica", "Ingeniería Electrónica",
                "Ingeniería Geológica", "Ingeniería Industrial", "Ingeniería Química", "Lingüística",
                "Literatura", "Marketing", "Matemática", "Medicina Humana", "Medicina Veterinaria",
                "Microbiología y Parasitología", "Nutrición", "Obstetricia", "Odontología", "Psicología",
                "Química", "Sociología", "Toxicología", "Trabajo Social")),
        GoalUniversity("uni", "UNI", "Universidad Nacional de Ingeniería", "Lima",
            listOf("https://admision.uni.edu.pe/wp-content/uploads/2026/06/CUADRO-VACANTES-2026-2.pdf"),
            listOf("Arquitectura", "Urbanismo", "Física", "Matemática", "Química", "Ingeniería Física",
                "Ciencia de la Computación", "Ingeniería Sanitaria", "Ingeniería de Higiene y Seguridad Industrial",
                "Ingeniería Ambiental", "Ingeniería Civil", "Ingeniería Económica", "Ingeniería Estadística",
                "Ingeniería Eléctrica", "Ingeniería Electrónica", "Ingeniería de Telecomunicaciones",
                "Ingeniería de Ciberseguridad", "Ingeniería Biomédica", "Ingeniería Geológica",
                "Ingeniería Metalúrgica", "Ingeniería de Minas", "Ingeniería Industrial", "Ingeniería de Sistemas",
                "Ingeniería de Software", "Ingeniería de Inteligencia Artificial", "Ingeniería Mecánica",
                "Ingeniería Naval", "Ingeniería Mecánica-Eléctrica", "Ingeniería Mecatrónica",
                "Ingeniería Aeroespacial", "Ingeniería de Petróleo y Gas Natural", "Ingeniería Petroquímica",
                "Ingeniería Química", "Ingeniería Textil")),
        GoalUniversity("unt", "UNT", "Universidad Nacional de Trujillo", "Trujillo",
            listOf("https://www.unitru.edu.pe/", "https://admisionunt.info/docs/VACANTES_2027.pdf"),
            listOf("Administración", "Antropología", "Arqueología", "Arquitectura y Urbanismo",
                "Biología Pesquera", "Ciencias Biológicas", "Ciencias de la Comunicación",
                "Contabilidad y Finanzas", "Derecho", "Economía", "Educación Inicial", "Educación Primaria",
                "Enfermería", "Estadística", "Estomatología", "Farmacia y Bioquímica", "Física", "Historia",
                "Ingeniería Agrícola", "Ingeniería Agroindustrial", "Ingeniería Ambiental", "Ingeniería Civil",
                "Ingeniería de Materiales", "Ingeniería Industrial", "Ingeniería Mecánica", "Ingeniería Mecatrónica",
                "Ingeniería Metalúrgica", "Ingeniería de Minas", "Ingeniería Química", "Ingeniería de Sistemas",
                "Matemáticas", "Medicina", "Microbiología y Parasitología", "Trabajo Social", "Turismo")),
        GoalUniversity("unap-puno", "UNAP", "Universidad Nacional del Altiplano", "Puno",
            listOf("https://portal.unap.edu.pe/escuelas-profesionales",
                "https://inscripciones.admision.unap.edu.pe/documentos/reglamentos/1771856981_GENERAL-2026.pdf"),
            listOf("Ingeniería Agronómica", "Ingeniería Agroindustrial", "Ingeniería Topográfica y Agrimensura",
                "Ingeniería Agrícola", "Ingeniería Civil", "Arquitectura y Urbanismo", "Ingeniería Económica",
                "Ingeniería Estadística e Informática", "Ingeniería Geológica", "Ingeniería Metalúrgica",
                "Ingeniería Electrónica", "Ingeniería Mecánica Eléctrica", "Ingeniería de Sistemas",
                "Ingeniería de Minas", "Ingeniería Química", "Medicina Veterinaria y Zootecnia",
                "Enfermería", "Medicina Humana", "Nutrición Humana", "Odontología", "Ciencias Contables",
                "Trabajo Social", "Sociología", "Educación Primaria", "Educación Inicial", "Educación Física",
                "Antropología", "Derecho", "Turismo", "Ciencias de la Comunicación Social", "Administración",
                "Biología: Pesquería", "Biología: Microbiología y laboratorio clínico", "Biología: Ecología",
                "Arte: Música", "Arte: Artes Plásticas", "Arte: Danza", "Psicología",
                "Ciencias Físico Matemáticas: Física", "Ciencias Físico Matemáticas: Matemáticas",
                "Ingeniería de Inteligencia Artificial y Ciencia de datos")),
        GoalUniversity("unsaac", "UNSAAC", "Universidad Nacional de San Antonio Abad del Cusco", "Cusco",
            listOf("https://admision.unsaac.edu.pe/carreras/"),
            listOf("Arquitectura", "Ingeniería Eléctrica", "Ingeniería Geológica", "Ingeniería Metalúrgica",
                "Ingeniería de Minas", "Ingeniería Mecánica", "Ingeniería Química", "Ingeniería Civil",
                "Química", "Física", "Matemática", "Ingeniería Informática y de Sistemas",
                "Ingeniería Agroindustrial (Sicuani)", "Ingeniería Electrónica", "Ingeniería Petroquímica",
                "Agronomía", "Biología", "Enfermería", "Medicina Humana", "Zootecnia",
                "Ingeniería Forestal (Puerto Maldonado)", "Odontología",
                "Ingeniería Agropecuaria (Santo Tomás y Andahuaylas)", "Obstetricia (Andahuaylas)",
                "Medicina Veterinaria (Sicuani)", "Medicina Veterinaria (Espinar)",
                "Ingeniería del Medio Ambiente y Recursos Naturales", "Ciencias Administrativas",
                "Contabilidad", "Economía", "Turismo", "Antropología", "Arqueología", "Derecho",
                "Historia", "Ciencias de la Comunicación", "Psicología", "Filosofía",
                "Educación – Cusco", "Educación – Filial Canas", "Educación – Filial Espinar")),
        GoalUniversity("unjbg", "UNJBG", "Universidad Nacional Jorge Basadre Grohmann", "Tacna",
            listOf("https://admision.unjbg.edu.pe/carreras"),
            listOf("Medicina Veterinaria y Zootecnia", "Biología – Microbiología", "Farmacia y Bioquímica",
                "Enfermería", "Obstetricia", "Odontología", "Medicina Humana", "Ingeniería Metalúrgica",
                "Ingeniería de Minas", "Ingeniería Ambiental", "Matemática", "Física Aplicada",
                "Ingeniería Química", "Ingeniería Geológica – Geotecnia", "Ingeniería Mecánica",
                "Agronomía", "Ingeniería Pesquera", "Ingeniería en Industrias Alimentarias",
                "Ingeniería en Informática y Sistemas", "Ingeniería Civil", "Historia",
                "Educación: Matemática, Computación e Informática",
                "Educación: Ciencias Sociales y Promoción Socio-Cultural", "Educación: Lengua y Literatura",
                "Educación: Idioma Extranjero", "Educación: Ciencias de la Naturaleza y Promoción Educativa Ambiental",
                "Artes", "Ciencias de la Comunicación", "Arquitectura", "Derecho y Ciencias Políticas",
                "Educación Inicial", "Educación Primaria", "Psicología", "Ciencias Administrativas",
                "Ciencias Contables y Financieras", "Ingeniería Comercial", "Economía Agraria")),
        GoalUniversity("uncp", "UNCP", "Universidad Nacional del Centro del Perú", "Huancayo",
            listOf("https://uncp.edu.pe/pregrado/facultades/", "https://uncpadmision.edu.pe/"),
            listOf("Enfermería", "Medicina Humana", "Arquitectura", "Ingeniería Civil", "Ingeniería de Minas",
                "Ingeniería de Sistemas", "Ingeniería Eléctrica", "Ingeniería Mecánica",
                "Ingeniería Metalúrgica y de Materiales", "Ingeniería Química", "Ingeniería Química Industrial",
                "Ingeniería Química Ambiental", "Administración de Empresas", "Contabilidad", "Economía",
                "Administración de Negocios - Tarma", "Administración Hotelera y Turismo - Tarma",
                "Antropología", "Ciencias de la Comunicación", "Derecho y Ciencias Políticas", "Sociología",
                "Trabajo Social", "Educación Inicial", "Educación Primaria",
                "Educación Filosofía, Ciencias Sociales y Relaciones Humanas",
                "Educación Lengua, Literatura y Comunicación", "Educación Ciencias Naturales y Ambientales",
                "Educación Ciencias Matemáticas e Informática", "Educación Física y Psicomotricidad",
                "Agronomía", "Ingeniería Forestal y Ambiental", "Ingeniería en Industrias Alimentarias", "Zootecnia",
                "Ingeniería Agroindustrial - Tarma", "Ingeniería Agronomía Tropical - Satipo",
                "Ingeniería Forestal Tropical - Satipo", "Ingeniería Industrias Alimentarias Tropical - Satipo",
                "Zootecnia Tropical - Satipo"))
    )

    fun find(id: String?) = universities.find { it.id == id }
    private fun normalized(text: String) = Normalizer.normalize(text, Normalizer.Form.NFD)
        .replace(Regex("\\p{M}+"), "").lowercase(java.util.Locale.ROOT).trim()
    fun matches(text: String, query: String) = normalized(query).split(Regex("\\s+"))
        .all { normalized(text).contains(it) }
}

enum class UnsaAdmissionRoute(val label: String) {
    ORDINARIO("Ordinario"), EXTRAORDINARIO("Extraordinario"), CEPRUNSA("CEPRUNSA I / II Fase"), CEPRUNSA_QUINTOS("CEPRUNSA Ciclo Quintos")
}

data class StudyGoal(val universityId: String, val career: String, val catalogCareer: Boolean, val unsaRoute: UnsaAdmissionRoute? = null) {
    val preparationArea get() = StudyCareerAreas.classify(this)
    val university get() = StudyGoalCatalog.find(universityId)
    val valid get() = university != null && career.isNotBlank() && career.length <= 120 &&
        (!catalogCareer || career in university!!.careers) && (unsaRoute == null || universityId == "unsa")
}

/** Guests share one local scope. Signed-in accounts never inherit another user's choice. */
fun studyGoalScope(uid: String, authenticated: Boolean, anonymous: Boolean) =
    if (authenticated && !anonymous && uid.isNotBlank() && uid != "local_student_guest") "user:$uid" else "guest"
