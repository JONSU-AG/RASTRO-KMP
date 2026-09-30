package com.jonsuapps.rastro.data.content

import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.data.withSubtemaIndex
import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeMatchOption
import com.jonsuapps.rastro.model.ChallengePair
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.jetbrains.compose.resources.ExperimentalResourceApi
import rastro.shared.generated.resources.Res

/**
 * Implementación de [ContentLoader] que carga contenido desde
 * `commonMain/composeResources/files/aprender/{materia}/` (JSON + Markdown)
 * vía `Res.readBytes`: único mecanismo empaquetado en el APK en runtime.
 */
class JsonContentLoader(
    private val json: Json = Json { ignoreUnknownKeys = true; isLenient = true },
    /**
     * Fuente de bytes opcional (solo tests). En producción es null y se usa
     * `Res.readBytes`, único mecanismo empaquetado en el APK en runtime
     * (en unit tests JVM no hay Context Android y `Res` no resuelve).
     */
    private val readBytesOverride: (suspend (String) -> ByteArray)? = null
) : ContentLoader {

    private val BASE_PATH = "aprender"
    private val _subjectCache = MutableStateFlow<Map<String, SubjectManifest>>(emptyMap())

    private fun formatWeek(week: Int): String = if (week < 10) "0$week" else "$week"

    override fun observeSubjectLessons(subjectId: String): Flow<List<LessonNode>> {
        return flow {
            val cache = _subjectCache.value
            val manifest = cache[subjectId]
            if (manifest != null) {
                val lessons = loadSubjectLessonsSync(subjectId)
                emit(lessons)
            } else {
                emit(emptyList())
            }
        }
    }

    // ==================== CARGA PÚBLICA ====================

    override suspend fun loadSubjectManifest(subjectId: String): SubjectManifest {
        val cached = _subjectCache.value[subjectId]
        if (cached != null) return cached
        return withContext(Dispatchers.Default) {
            val manifest = loadJsonFromResources<SubjectManifest>("$BASE_PATH/$subjectId/manifest.json")
            _subjectCache.value = _subjectCache.value + (subjectId to manifest)
            manifest
        }
    }

    override suspend fun loadWeekManifest(subjectId: String, week: Int): WeekManifest {
        val path = "$BASE_PATH/$subjectId/semana${formatWeek(week)}/manifest.json"
        return withContext(Dispatchers.Default) {
            loadJsonFromResources<WeekManifest>(path)
        }
    }

    override suspend fun loadLesson(
        subjectId: String,
        week: Int,
        subtopic: String
    ): LessonContent {
        return withContext(Dispatchers.Default) {
            val lessonPath = "$BASE_PATH/$subjectId/semana${formatWeek(week)}/$subtopic"

            // 1. Cargar lesson.json (identidad + metadatos)
            val lessonNode = loadJsonFromResources<LessonNode>("$lessonPath/lesson.json")

            // 2. VALIDACIÓN DE IDENTIDAD (FAIL LOCAL)
            ContentIdentityValidator.validate(lessonNode, subjectId, week, subtopic)

            // 3. Cargar theory.md
            val theoryMarkdown = loadTextFromResources("$lessonPath/theory.md")

            // 4. Cargar questions.json
            val questionsJson = loadTextFromResources("$lessonPath/questions.json")
            val questions = json.decodeFromString<List<QuestionJson>>(questionsJson)

            // 5. VALIDACIÓN ACADÉMICA (FAIL LOCAL)
            ContentAcademicValidator.validate(lessonNode, questions)

            // Convertir questions a Challenge existente
            val challenges = questions.map { q ->
                Challenge(
                    id = q.id,
                    type = ChallengeType.valueOf(q.type),
                    statement = q.statement,
                    options = q.options,
                    correctIndex = q.correctIndex,
                    explanation = q.explanation,
                    formula = q.formula,
                    subject = q.subject,
                    semana = q.semana,
                    correctText = q.correctText,
                    sentenceBefore = q.sentenceBefore,
                    sentenceAfter = q.sentenceAfter,
                    chips = q.chips,
                    pairs = q.pairs.map { ChallengePair(it.id, it.left, it.right) },
                    rightOptions = q.rightOptions.map { ChallengeMatchOption(it.id, it.text) },
                    instruction = q.instruction,
                    pedagogicalTier = q.pedagogicalTier,
                    fuente = q.fuente
                )
            }

            // Construir LessonNode con teoría completa y challenges.
            // La teoría íntegra viaja en theory.resumen (es lo que renderiza
            // LessonContentRenderer); theory.md es la fuente canónica.
            val fullResumen = theoryMarkdown.ifBlank { lessonNode.theory.resumen }
            val lessonNodeFull = LessonNode(
                id = lessonNode.id,
                subjectId = lessonNode.subjectId,
                semana = lessonNode.semana,
                subtema = lessonNode.subtema,
                title = lessonNode.title,
                theory = LessonTheory(
                    id = "th_${lessonNode.id}",
                    asignatura = lessonNode.theory.asignatura,
                    semana = lessonNode.theory.semana,
                    titulo = lessonNode.theory.titulo,
                    resumen = fullResumen,
                    conceptosClave = lessonNode.theory.conceptosClave,
                    fechasYPersonajes = lessonNode.theory.fechasYPersonajes,
                    hechosRelevantes = lessonNode.theory.hechosRelevantes,
                    formulas = lessonNode.theory.formulas,
                    clavesFijas = lessonNode.theory.clavesFijas,
                    advertenciasErroresComunes = lessonNode.theory.advertenciasErroresComunes,
                    formulaName = lessonNode.theory.formulaName,
                    formulaLatex = lessonNode.theory.formulaLatex,
                    formulaDescription = lessonNode.theory.formulaDescription,
                    admissionTip = lessonNode.theory.admissionTip,
                    admissionExplanation = lessonNode.theory.admissionExplanation
                ),
                challenges = challenges,
                learningObjectives = lessonNode.learningObjectives,
                depth = lessonNode.depth,
                isLocked = lessonNode.isLocked,
                isCompleted = lessonNode.isCompleted,
                stars = lessonNode.stars,
                isCurrent = lessonNode.isCurrent
            )

            // VALIDACIÓN ESTRUCTURAL FINAL (CatalogValidator)
            CatalogValidator.validateLesson(lessonNode)

            LessonContent(
                lesson = lessonNodeFull,
                theoryMarkdown = theoryMarkdown,
                questionsJson = questionsJson
            )
        }
    }

    override suspend fun loadSubjectLessons(subjectId: String): List<LessonNode> {
        return withContext(Dispatchers.Default) {
            val manifest = try {
                loadSubjectManifest(subjectId)
            } catch (e: Exception) {
                if (!isMissingResource(e)) throw e
                return@withContext emptyList()
            }
            val allLessons = mutableListOf<LessonNode>()

            for (weekRef in manifest.weekManifests) {
                try {
                    val weekManifest = loadWeekManifest(subjectId, weekRef.week)
                    for (lessonRef in weekManifest.lessons) {
                        try {
                            val content = loadLesson(subjectId, weekRef.week, lessonRef.subtopic)
                            allLessons.add(content.lesson)
                        } catch (e: Exception) {
                            // Solo se omite lo AUSENTE; lo corrupto falla visible (fail-local).
                            if (!isMissingResource(e)) throw e
                        }
                    }
                } catch (e: Exception) {
                    if (!isMissingResource(e)) throw e
                }
            }

            allLessons.sortedBy { it.semana }.withSubtemaIndex()
        }
    }

    /** Recurso ausente ≠ contenido corrupto: solo lo ausente se omite en el listado. */
    private fun isMissingResource(e: Exception): Boolean =
        e is IllegalStateException && (e.message ?: "").startsWith("Recurso no encontrado")

    // ==================== HELPERS PRIVADOS ====================

    private inline suspend fun <reified T> loadJsonFromResources(path: String): T {
        val jsonStr = loadTextFromResources(path)
        return json.decodeFromString<T>(jsonStr)
    }

    @OptIn(ExperimentalResourceApi::class)
    private suspend fun loadTextFromResources(path: String): String {
        return withContext(Dispatchers.Default) {
            // Falla de lectura = recurso ausente (lo corrupto falla después, en decode/validación).
            try {
                val bytes = readBytesOverride?.invoke(path)
                    ?: Res.readBytes("files/$path")
                bytes.decodeToString()
            } catch (e: Exception) {
                if (e is IllegalStateException && (e.message ?: "").startsWith("Recurso no encontrado")) throw e
                throw IllegalStateException("Recurso no encontrado: $path")
            }
        }
    }

    private fun loadSubjectLessonsSync(subjectId: String): List<LessonNode> {
        return runBlocking {
            loadSubjectLessons(subjectId)
        }
    }

    companion object {
        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
            prettyPrint = true
        }
    }
}

// ==================== VALIDADORES ====================

/**
 * Valida que la identidad declarada en el contenido coincida con la ruta y parámetros esperados.
 * FAIL LOCAL si hay discrepancia.
 */
object ContentIdentityValidator {
    fun validate(lesson: LessonNode, expectedSubjectId: String, expectedWeek: Int, expectedSubtopic: String) {
        val errors = mutableListOf<String>()

        if (!lesson.subjectId.equals(expectedSubjectId, ignoreCase = true)) {
            errors.add("subjectId mismatch: contenido='${lesson.subjectId}' vs esperado='$expectedSubjectId'")
        }
        if (lesson.semana != expectedWeek) {
            errors.add("semana mismatch: contenido=${lesson.semana} vs esperado=$expectedWeek")
        }
        if (!lesson.subtema.equals(expectedSubtopic, ignoreCase = true)) {
            errors.add("subtema mismatch: contenido='${lesson.subtema}' vs esperado='$expectedSubtopic'")
        }
        if (lesson.id.isBlank()) {
            errors.add("lesson.id está vacío")
        }
        val subParts = expectedSubtopic.split(".")
        val formattedSub = if (subParts.size == 2) {
            val subPadded = if ((subParts[1].toIntOrNull() ?: 0) < 10) "0${subParts[1]}" else subParts[1]
            "s${subPadded}"
        } else {
            expectedSubtopic.replace(".", "_")
        }

        val matchFound = lesson.id.contains(expectedSubtopic.replace(".", "_"), ignoreCase = true) ||
                lesson.id.contains(formattedSub, ignoreCase = true)

        if (!matchFound) {
            errors.add("lesson.id '${lesson.id}' no contiene subtema esperado '$expectedSubtopic'")
        }

        if (errors.isNotEmpty()) {
            throw IllegalStateException("FAIL LOCAL - Identidad inválida en ${lesson.id}:\n${errors.joinToString("\n")}")
        }
    }
}

/**
 * Extiende AcademicSanitizer para validaciones académicas específicas del contenido nuevo.
 */
object ContentAcademicValidator {
    fun validate(lesson: LessonNode, questions: List<QuestionJson>) {
        val errors = mutableListOf<String>()
        val warnings = mutableListOf<String>()

        // 1. Anti-contaminación STEM en Biología
        if (lesson.subjectId.equals("biologia", ignoreCase = true)) {
            for ((index, q) in questions.withIndex()) {
                if (AcademicSanitizer.hasUnrelatedStemContamination("biologia", q.statement)) {
                    errors.add("Pregunta ${q.id}: contaminación STEM detectada en Biología (fórmulas SI, newton, joule, etc.)")
                }
            }
        }

        // 2. IDs deterministas (no UUID aleatorios)
        for ((index, q) in questions.withIndex()) {
            if (q.id.startsWith("uuid_") || q.id.length > 50) {
                println("[WARN] Pregunta ${q.id}: ID sospechoso de ser aleatorio (debe ser determinista: bio_t08_s01_cN)")
            }
        }

        // 3. subjectId y semana explícitos en cada pregunta (contra la lección, no hardcodeados).
        for (q in questions) {
            if (q.subject.isBlank()) {
                errors.add("Pregunta ${q.id}: subjectId vacío (debe ser '${lesson.subjectId}')")
            } else if (!q.subject.equals(lesson.subjectId, ignoreCase = true)) {
                errors.add("Pregunta ${q.id}: subject='${q.subject}' no coincide con materia '${lesson.subjectId}'")
            }
            if (q.semana != lesson.semana) {
                errors.add("Pregunta ${q.id}: semana=${q.semana} no coincide con semana ${lesson.semana}")
            }
        }

        if (errors.isNotEmpty()) {
            throw IllegalStateException("FAIL LOCAL - Validación académica fallida:\n${errors.joinToString("\n")}")
        }
    }
}
