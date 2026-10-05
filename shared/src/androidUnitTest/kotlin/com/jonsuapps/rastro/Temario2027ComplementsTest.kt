package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.model.LessonSpecialActivities
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.serialization.json.Json
import kotlin.test.*

class Temario2027ComplementsTest {
    @Test fun complementsReachExistingEngineWithoutNewLessonsOrContamination() {
        val cl = Thread.currentThread().contextClassLoader ?: ClassLoader.getSystemClassLoader()
        AprenderRepository.testLoaderOverride = JsonContentLoader(
            json = Json { ignoreUnknownKeys = true; isLenient = true }, readBytesOverride = { path ->
                cl.getResourceAsStream("composeResources/rastro.shared.generated.resources/files/$path")?.readBytes()
                    ?: error("Missing fixture: $path")
            })
        val expected = listOf(
            Triple("algebra", "1.1", "Conjuntos: notación, pertenencia e inclusión"),
            Triple("algebra", "16.2", "Interpretación de gráficos algebraicos"),
            Triple("geometria", "1.1", "Postulados, teoremas y demostración"),
            Triple("geometria", "6.2", "Criterios de semejanza de triángulos"),
            Triple("geometria", "7.2", "Circunferencia inscrita y circunscrita"),
            Triple("geometria", "10.2", "Tronco de cilindro: corte oblicuo"),
            Triple("trigonometria", "6.2", "Transformaciones de suma y diferencia a producto"),
            Triple("trigonometria", "11.2", "Funciones inversas: dominio, rango y gráfica"),
            Triple("historia_universal", "1.1", "Hecho histórico, tiempo e interpretación"),
            Triple("historia_peru", "5.1", "Antecedentes y consolidación de la independencia"),
            Triple("geografia", "5.2", "Inundaciones, sequías y efectos socioeconómicos"),
            Triple("geografia", "6.1", "Peligros oceanográficos y riesgo de desastre"),
            Triple("geografia", "10.2", "Reservas de biósfera y patrimonio natural"),
            Triple("geografia", "13.2", "Fronteras y comparación de espacios continentales"),
            Triple("quimica", "2.2", "Sólidos, líquidos y cambios de estado"),
            Triple("quimica", "4.2", "Dualidad, configuración de iones y radio iónico"),
            Triple("quimica", "8.2", "Pureza y cantidad efectiva de reactivo"),
            Triple("quimica", "10.2", "Importancia de las soluciones"),
            Triple("quimica", "15.2", "Fenoles y tipos de reacciones orgánicas"),
            Triple("biologia", "11.3", "Herencia influenciada, restricta al sexo y asesoramiento genético"),
            Triple("biologia", "12.4", "Principales phyla y divisiones: clasificación e importancia"),
            Triple("biologia", "13.3", "Relaciones intraespecíficas e interespecíficas"),
            Triple("biologia", "13.4", "Restauración ecológica y desarrollo sostenible"),
            Triple("fisica", "2.2", "Posición, desplazamiento y gráficos de movimiento"),
            Triple("fisica", "3.2", "Sistema físico, masa y peso"),
            Triple("fisica", "5.2", "Impulso, conservación y campo gravitatorio"),
            Triple("fisica", "6.2", "Teorema trabajo-energía"),
            Triple("fisica", "7.2", "Equilibrio térmico y capacidad calorífica"),
            Triple("fisica", "9.2", "Energía potencial eléctrica y potencial"),
            Triple("fisica", "10.2", "Flujo magnético e inducción"),
            Triple("fisica", "11.2", "Propagación de la luz"),
            Triple("fisica", "12.2", "Radiactividad: usos y límites"),
            Triple("psicologia", "15.1", "Crecimiento, maduración y desarrollo: diferencias"),
            Triple("filosofia", "5.2", "Ciencia, tecnología y pensamiento crítico"),
            Triple("filosofia", "12.2", "Igualdad, justicia social y derechos humanos"),
            Triple("filosofia", "2.2", "Experiencia y valoración estética"),
            Triple("civica", "2.2", "Identidad regional, organizaciones sociales y responsabilidad"),
            Triple("civica", "11.2", "Derechos, deberes y universidad en el desarrollo regional"),
            Triple("lenguaje", "2.1", "Variedad situacional y origen latino del español"),
            Triple("lenguaje", "3.1", "Propiedades del lenguaje y silabeo"),
            Triple("lenguaje", "4.1", "Flexión y formación de palabras"),
            Triple("lenguaje", "5.2", "Frases: clase, núcleo y función"),
            Triple("lenguaje", "8.1", "Clases de signo, significado y contexto"),
            Triple("literatura", "1.1", "Funciones estética, social y cultural"),
            Triple("literatura", "5.1", "Discurso en el Politeama: texto y colección"),
            Triple("literatura", "5.2", "Los heraldos negros y las colecciones de Vallejo"),
            Triple("literatura", "6.2", "Percy Gibson y José Luis Ayala: obras verificadas"),
            Triple("ingles", "7.2", "Places, directions, services and everyday vocabulary"),
            Triple("ingles", "3.2", "Instructions, permission, ability and obligation"),
            Triple("comprension_lectora", "1.1", "Ubicar información específica e inferir con evidencia")
        )
        try {
            expected.groupBy { it.first }.forEach { (subject, rows) ->
                val catalog = AprenderRepository.getLessonsForSubjectSync(subject)
                val affected = rows.map { (_, subtema, heading) ->
                    val lesson = catalog.single { it.subtema == subtema }
                    assertTrue(lesson.theory.resumen.contains(heading), "${lesson.id}: $heading")
                    val complement = lesson.theory.resumen.substringAfter("## $heading")
                    assertFalse(AcademicSanitizer.hasUnrelatedStemContamination(subject, complement), lesson.id)
                    lesson
                }
                val report = CatalogValidator.validateCatalog(affected.map(LessonSpecialActivities::prepare))
                val baseline = CatalogValidator.validateCatalog(affected.map { lesson ->
                    val heading = rows.single { it.second == lesson.subtema }.third
                    LessonSpecialActivities.prepare(lesson.copy(theory = lesson.theory.copy(
                        resumen = lesson.theory.resumen.substringBefore("## $heading"))))
                })
                fun issues(summary: com.jonsuapps.rastro.data.validation.CatalogValidationSummary) =
                    (summary.reports.flatMap { it.issues } + summary.globalIssues)
                        .map { Triple(it.lessonId, it.code, it.severity) }.sortedBy { it.toString() }
                assertEquals(issues(baseline), issues(report), "El complemento no debe introducir ni ocultar defectos del banco: $subject")
                // Record inherited duplicate-stem/count failures, never weaken the validator.
                println("COMPLEMENT_VALIDATION $subject: lessons=${affected.size} errors=${report.errorCount} warnings=${report.warningCount}")
                println(report.printSummary())
                if (subject == "biologia") {
                    val question = catalog.single { it.subtema == "11.3" }.challenges.single { it.id == "bio_t11_s03_c06" }
                    assertFalse(question.statement.contains("hipertricosis", ignoreCase = true))
                    assertTrue(question.explanation.contains("No debe confundirse"))
                }
            }
        } finally { AprenderRepository.testLoaderOverride = null }
    }
}
