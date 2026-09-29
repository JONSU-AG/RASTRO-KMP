package com.jonsuapps.rastro.data.content

import com.jonsuapps.rastro.data.withSubtemaIndex
import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonDepth
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.coroutines.Dispatchers
import java.io.InputStreamReader
import kotlinx.coroutines.flow.map

/**
 * Implementación de [ContentLoader] que carga contenido desde
 * `commonMain/resources/aprender/{materia}/` (JSON + Markdown).
 */
class JsonContentLoader(
    private val json: Json = Json { ignoreUnknownKeys = true; isLenient = true },
    private val classLoader: ClassLoader = JsonContentLoader::class.java.classLoader!!
) : ContentLoader {

    private val BASE_PATH = "aprender"
    private val _subjectCache = MutableStateFlow<Map<String, SubjectManifest>>(emptyMap())

    override fun observeSubjectLessons(subjectId: String): kotlinx.coroutines.flow.Flow<List<com.jonsuapps.rastro.model.LessonNode>> {
        return kotlinx.coroutines.flow.flow {
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
        return withContext(Dispatchers.IO) {
            val manifest = loadJsonFromResources<SubjectManifest>("$BASE_PATH/$subjectId/manifest.json")
            _subjectCache.value = _subjectCache.value + (subjectId to manifest)
            manifest
        }
    }

    override suspend fun loadWeekManifest(subjectId: String, week: Int): WeekManifest {
        val path = "$BASE_PATH/$subjectId/semana${"%02d".format(week)}/manifest.json"
        return withContext(Dispatchers.IO) {
            loadJsonFromResources<WeekManifest>(path)
        }
    }

    override suspend fun loadLesson(
        subjectId: String,
        week: Int,
        subtopic: String
    ): LessonContent {
        return withContext(Dispatchers.IO) {
            val lessonPath = "$BASE_PATH/$subjectId/semana${"%02d".format(week)}/$subtopic"

            // 1. Cargar lesson.json (identidad + metadatos)
            val lessonNode = loadJsonFromResources<LessonNode>("$lessonPath/lesson.json")

            // 2. VALIDACIÓN DE IDENTIDAD (FAIL LOCAL)
            ContentIdentityValidator.validate(lessonNode, subjectId, week, subtopic)

            // 2. Cargar theory.md
            val theoryMarkdown = loadTextFromResources("$lessonPath/theory.md")

            // 3. Cargar questions.json
            val questionsJson = loadTextFromResources("$lessonPath/questions.json")
            val questions = json.decodeFromString<List<QuestionJson>>(questionsJson)

            // 4. VALIDACIÓN ACADÉMICA (FAIL LOCAL)
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
                    pairs = q.pairs.map { com.jonsuapps.rastro.model.ChallengePair(it.id, it.left, it.right) },
                    rightOptions = q.rightOptions.map { com.jonsuapps.rastro.model.ChallengeMatchOption(it.id, it.text) },
                    instruction = q.instruction,
                    pedagogicalTier = q.pedagogicalTier,
                    fuente = q.fuente
                )
            }

            // 5. Construir LessonNode con teoría completa y challenges
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
                    resumen = lessonNode.theory.resumen,
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

            // 5. VALIDACIÓN ESTRUCTURAL FINAL (CatalogValidator)
            com.jonsuapps.rastro.data.validation.CatalogValidator.validateLesson(lessonNode)

            LessonContent(
                lesson = lessonNodeFull,
                theoryMarkdown = theoryMarkdown,
                questionsJson = questionsJson
            )
        }
    }

    override suspend fun loadSubjectLessons(subjectId: String): List<LessonNode> {
        return withContext(Dispatchers.IO) {
            val manifest = loadSubjectManifest(subjectId)
            val allLessons = mutableListOf<LessonNode>()

            for (weekRef in manifest.weekManifests) {
                val weekManifest = loadWeekManifest(subjectId, weekRef.week)
                for (lessonRef in weekManifest.lessons) {
                    val content = loadLesson(subjectId, weekRef.week, lessonRef.subtopic)
                    allLessons.add(content.lesson)
                }
            }

            allLessons.sortedBy { it.semana }.withSubtemaIndex()
        }
    }

    // ==================== HELPERS PRIVADOS ====================

    private inline suspend fun <reified T> loadJsonFromResources(path: String): T {
        return withContext(Dispatchers.IO) {
            val resource = classLoader.getResourceAsStream(path)
                ?: throw IllegalStateException("Recurso no encontrado: $path")
            val reader = InputStreamReader(resource, "UTF-8")
            try {
                val jsonStr = reader.readText()
                json.decodeFromString<T>(jsonStr)
            } finally {
                reader.close()
            }
        }
    }

    private suspend fun loadTextFromResources(path: String): String {
        return withContext(Dispatchers.IO) {
            val resource = classLoader.getResourceAsStream(path)
                ?: throw IllegalStateException("Recurso no encontrado: $path")
            val reader = InputStreamReader(resource, "UTF-8")
            try {
                reader.readText()
            } finally {
                reader.close()
            }
        }
    }

    private fun loadSubjectLessonsSync(subjectId: String): List<LessonNode> {
        // Synchronous version for cache - simplified, assumes cached manifest
        return runBlocking {
            loadSubjectLessons(subjectId)
        }
    }

    companion object {
        val json = kotlinx.serialization.json.Json {
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
    fun validate(lesson: com.jonsuapps.rastro.model.LessonNode, expectedSubjectId: String, expectedWeek: Int, expectedSubtopic: String) {
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
        if (!lesson.id.contains(expectedSubtopic.replace(".", "_"), ignoreCase = true)) {
            errors.add("lesson.id '\${lesson.id}' no contiene subtema esperado '\${expectedSubtopic}'")
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
    fun validate(lesson: com.jonsuapps.rastro.model.LessonNode, questions: List<QuestionJson>) {
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

        // 3. subjectId explícito en cada pregunta
        for (q in questions) {
            if (q.subject.isBlank()) {
                errors.add("Pregunta ${q.id}: subjectId vacío (debe ser 'biologia')")
            } else if (!q.subject.equals("biologia", ignoreCase = true)) {
                errors.add("Pregunta ${q.id}: subject='${q.subject}' no coincide con materia 'biologia'")
            }
            if (q.semana != 8) {
                errors.add("Pregunta ${q.id}: semana=${q.semana} no coincide con semana 8")
            }
        }

        if (errors.isNotEmpty()) {
            throw IllegalStateException("FAIL LOCAL - Validación académica fallida:\n${errors.joinToString("\n")}")
        }
    }
}