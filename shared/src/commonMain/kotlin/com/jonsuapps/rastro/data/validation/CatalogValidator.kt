package com.jonsuapps.rastro.data.validation

import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonDepth
import com.jonsuapps.rastro.model.LessonNode

/**
 * Severidad de los hallazgos del validador de catálogo.
 */
enum class ValidationSeverity {
    ERROR,   // Rompe la experiencia del usuario (índice inválido, opción vacía, etc.)
    WARNING, // Desviación pedagógica (menos preguntas del objetivo, teoría muy corta)
    INFO     // Información diagnóstica
}

data class ValidationIssue(
    val severity: ValidationSeverity,
    val lessonId: String,
    val subtema: String,
    val code: String,
    val message: String
)

data class LessonValidationReport(
    val lessonId: String,
    val subjectId: String,
    val semana: Int,
    val subtema: String,
    val title: String,
    val depth: LessonDepth,
    val challengeCount: Int,
    val targetCount: Int,
    val theoryLength: Int,
    val duplicateQuestionsCount: Int,
    val issues: List<ValidationIssue>
) {
    val hasErrors: Boolean get() = issues.any { it.severity == ValidationSeverity.ERROR }
    val hasWarnings: Boolean get() = issues.any { it.severity == ValidationSeverity.WARNING }
    val isClean: Boolean get() = issues.isEmpty()

    fun toFormattedString(): String {
        val icon = when {
            hasErrors -> "❌"
            hasWarnings -> "⚠️"
            else -> "✅"
        }
        val sb = StringBuilder()
        sb.appendLine("$icon [$subtema] $lessonId - \"$title\"")
        sb.appendLine("  Depth: $depth | Retos: $challengeCount / obj ~$targetCount | Teoría: ${theoryLength} chars")
        issues.forEach { issue ->
            val tag = if (issue.severity == ValidationSeverity.ERROR) "  [ERROR]" else "  [WARN]"
            sb.appendLine("$tag ${issue.code}: ${issue.message}")
        }
        return sb.toString().trimEnd()
    }
}

data class CatalogValidationSummary(
    val totalLessons: Int,
    val totalChallenges: Int,
    val averageChallengesPerLesson: Double,
    val cleanLessonsCount: Int,
    val errorCount: Int,
    val warningCount: Int,
    val reports: List<LessonValidationReport>,
    val globalIssues: List<ValidationIssue>
) {
    fun printSummary(): String {
        val sb = StringBuilder()
        sb.appendLine("============================================================")
        sb.appendLine("REPORTE DE AUDITORÍA Y VALIDACIÓN DE CATÁLOGO RASTRO")
        sb.appendLine("============================================================")
        sb.appendLine("Total Lecciones: $totalLessons")
        sb.appendLine("Total Retos: $totalChallenges")
        val avgFormatted = ((averageChallengesPerLesson * 100).toInt() / 100.0)
        sb.appendLine("Promedio: $avgFormatted retos / lección")
        sb.appendLine("Lecciones conformes: $cleanLessonsCount ($errorsPercent% sin alertas)")
        sb.appendLine("Alertas globales: ${globalIssues.size}")
        sb.appendLine("Errores críticos: $errorCount")
        sb.appendLine("Advertencias pedagógicas: $warningCount")
        sb.appendLine("============================================================")

        if (globalIssues.isNotEmpty()) {
            sb.appendLine("\n--- PROBLEMAS GLOBALES DE CATÁLOGO ---")
            globalIssues.forEach { sb.appendLine("  [${it.severity}] ${it.code}: ${it.message}") }
        }

        val errored = reports.filter { it.hasErrors }
        if (errored.isNotEmpty()) {
            sb.appendLine("\n--- LECCIONES CON ERRORES CRÍTICOS (${errored.size}) ---")
            errored.take(15).forEach { sb.appendLine(it.toFormattedString()) }
            if (errored.size > 15) sb.appendLine("  ... y ${errored.size - 15} lecciones más con errores.")
        }

        val warned = reports.filter { !it.hasErrors && it.hasWarnings }
        if (warned.isNotEmpty()) {
            sb.appendLine("\n--- LECCIONES CON ADVERTENCIAS PEDAGÓGICAS (${warned.size}) ---")
            warned.take(10).forEach { sb.appendLine(it.toFormattedString()) }
            if (warned.size > 10) sb.appendLine("  ... y ${warned.size - 10} lecciones más con advertencias.")
        }

        return sb.toString()
    }

    private val errorsPercent: Int
        get() = if (totalLessons > 0) (cleanLessonsCount * 100) / totalLessons else 100
}

/**
 * CatalogValidator: Validador de consistencia académica e integridad técnica de RASTRO.
 * Herramienta de desarrollo; NO afecta el runtime de los estudiantes.
 */
object CatalogValidator {

    fun validateCatalog(lessons: List<LessonNode>): CatalogValidationSummary {
        val reports = mutableListOf<LessonValidationReport>()
        val globalIssues = mutableListOf<ValidationIssue>()

        // 1. Detección global de IDs duplicados
        val idCounts = lessons.groupingBy { it.id }.eachCount()
        idCounts.filterValues { it > 1 }.forEach { (id, count) ->
            globalIssues.add(
                ValidationIssue(
                    severity = ValidationSeverity.ERROR,
                    lessonId = id,
                    subtema = "",
                    code = "DUPLICATE_LESSON_ID",
                    message = "El ID de lección '$id' se repite $count veces en el catálogo."
                )
            )
        }

        // 2. Detección de subtemas duplicados dentro de la misma asignatura y semana
        lessons.groupBy { "${it.subjectId}_sem${it.semana}" }.forEach { (groupKey, groupLessons) ->
            val subtemaCounts = groupLessons.groupingBy { it.subtema }.eachCount()
            subtemaCounts.filterValues { it > 1 }.forEach { (subtema, count) ->
                if (subtema.isNotBlank() && !subtema.startsWith("Semana", ignoreCase = true)) {
                    globalIssues.add(
                        ValidationIssue(
                            severity = ValidationSeverity.WARNING,
                            lessonId = groupKey,
                            subtema = subtema,
                            code = "DUPLICATE_SUBTEMA_CODE",
                            message = "El subtema '$subtema' se repite $count veces en $groupKey."
                        )
                    )
                }
            }
        }

        // 3. Validación individual de cada lección
        for (lesson in lessons) {
            reports.add(validateLesson(lesson))
        }

        val totalChallenges = lessons.sumOf { it.challenges.size }
        val avgChallenges = if (lessons.isNotEmpty()) totalChallenges.toDouble() / lessons.size else 0.0
        val totalErrors = reports.sumOf { r -> r.issues.count { it.severity == ValidationSeverity.ERROR } } +
                globalIssues.count { it.severity == ValidationSeverity.ERROR }
        val totalWarnings = reports.sumOf { r -> r.issues.count { it.severity == ValidationSeverity.WARNING } } +
                globalIssues.count { it.severity == ValidationSeverity.WARNING }
        val cleanCount = reports.count { it.isClean }

        return CatalogValidationSummary(
            totalLessons = lessons.size,
            totalChallenges = totalChallenges,
            averageChallengesPerLesson = avgChallenges,
            cleanLessonsCount = cleanCount,
            errorCount = totalErrors,
            warningCount = totalWarnings,
            reports = reports,
            globalIssues = globalIssues
        )
    }

    fun validateLesson(lesson: LessonNode): LessonValidationReport {
        val issues = mutableListOf<ValidationIssue>()

        // 1. Validación de Teoría
        val theoryResumen = lesson.theory.resumen.trim()
        if (theoryResumen.isBlank()) {
            issues.add(
                ValidationIssue(
                    severity = ValidationSeverity.ERROR,
                    lessonId = lesson.id,
                    subtema = lesson.subtema,
                    code = "EMPTY_THEORY",
                    message = "La lección no contiene texto de teoría en theory.resumen."
                )
            )
        } else if (theoryResumen.length < 80) {
            issues.add(
                ValidationIssue(
                    severity = ValidationSeverity.WARNING,
                    lessonId = lesson.id,
                    subtema = lesson.subtema,
                    code = "SHORT_THEORY",
                    message = "La teoría es extremadamente corta (${theoryResumen.length} caracteres). Se recomienda profundizar."
                )
            )
        }

        // 2. Validación de Challenges (Presencia)
        if (lesson.challenges.isEmpty()) {
            issues.add(
                ValidationIssue(
                    severity = ValidationSeverity.ERROR,
                    lessonId = lesson.id,
                    subtema = lesson.subtema,
                    code = "NO_CHALLENGES",
                    message = "La lección no contiene retos interactivos (challenges está vacío)."
                )
            )
        }

        // 3. Validación de LessonDepth vs Número Real de Preguntas
        // Nota: Tolerancia flexible según la regla del usuario (la calidad prima sobre el número exacto).
        val target = lesson.depth.targetChallenges
        val count = lesson.challenges.size
        val minAcceptable = when (lesson.depth) {
            LessonDepth.SIMPLE -> 5       // Objetivo ~7, tolerable desde 5
            LessonDepth.NORMAL -> 11      // Objetivo ~15, tolerable desde 11
            LessonDepth.EXTENSIVE -> 16   // Objetivo ~20, tolerable desde 16
        }

        if (count > 0 && count < minAcceptable) {
            issues.add(
                ValidationIssue(
                    severity = ValidationSeverity.WARNING,
                    lessonId = lesson.id,
                    subtema = lesson.subtema,
                    code = "DEPTH_CHALLENGE_SHORTFALL",
                    message = "Marcada como ${lesson.depth} (obj ~$target) pero solo cuenta con $count preguntas."
                )
            )
        }

        // 4. Detección de preguntas duplicadas dentro de la misma lección
        val statementsSeen = mutableSetOf<String>()
        val challengeIdsSeen = mutableSetOf<String>()
        var duplicatesCount = 0

        lesson.challenges.forEachIndexed { index, ch ->
            val normStatement = ch.statement.trim().lowercase()
            if (normStatement in statementsSeen) {
                duplicatesCount++
                issues.add(
                    ValidationIssue(
                        severity = ValidationSeverity.ERROR,
                        lessonId = lesson.id,
                        subtema = lesson.subtema,
                        code = "DUPLICATE_QUESTION_STATEMENT",
                        message = "Pregunta #${index + 1} duplica el enunciado de otra pregunta en esta lección: \"${ch.statement.take(40)}...\""
                    )
                )
            } else {
                statementsSeen.add(normStatement)
            }

            if (ch.id in challengeIdsSeen) {
                issues.add(
                    ValidationIssue(
                        severity = ValidationSeverity.ERROR,
                        lessonId = lesson.id,
                        subtema = lesson.subtema,
                        code = "DUPLICATE_CHALLENGE_ID",
                        message = "El challenge ID '${ch.id}' está repetido en la lección."
                    )
                )
            } else {
                challengeIdsSeen.add(ch.id)
            }

            // 5. Validación de opciones en MULTIPLE_CHOICE
            if (ch.type == ChallengeType.MULTIPLE_CHOICE) {
                if (ch.options.isEmpty()) {
                    issues.add(
                        ValidationIssue(
                            severity = ValidationSeverity.ERROR,
                            lessonId = lesson.id,
                            subtema = lesson.subtema,
                            code = "EMPTY_OPTIONS",
                            message = "Pregunta #${index + 1} (${ch.id}) de tipo MULTIPLE_CHOICE no tiene opciones."
                        )
                    )
                } else {
                    // Opciones duplicadas dentro de la misma pregunta
                    val distinctOptions = ch.options.map { it.trim().lowercase() }.distinct()
                    if (distinctOptions.size < ch.options.size) {
                        issues.add(
                            ValidationIssue(
                                severity = ValidationSeverity.ERROR,
                                lessonId = lesson.id,
                                subtema = lesson.subtema,
                                code = "DUPLICATE_OPTIONS_IN_QUESTION",
                                message = "Pregunta #${index + 1} (${ch.id}) tiene opciones idénticas duplicadas."
                            )
                        )
                    }

                    // correctIndex fuera de rango
                    if (ch.correctIndex !in ch.options.indices) {
                        issues.add(
                            ValidationIssue(
                                severity = ValidationSeverity.ERROR,
                                lessonId = lesson.id,
                                subtema = lesson.subtema,
                                code = "INVALID_CORRECT_INDEX",
                                message = "Pregunta #${index + 1} (${ch.id}): correctIndex=${ch.correctIndex} fuera de rango (0..${ch.options.lastIndex})."
                            )
                        )
                    }
                }
            }

            // 6. Explicaciones vacías
            if (ch.explanation.trim().isBlank()) {
                issues.add(
                    ValidationIssue(
                        severity = ValidationSeverity.WARNING,
                        lessonId = lesson.id,
                        subtema = lesson.subtema,
                        code = "EMPTY_EXPLANATION",
                        message = "Pregunta #${index + 1} (${ch.id}) no tiene explicación pedagógica."
                    )
                )
            }
        }

        return LessonValidationReport(
            lessonId = lesson.id,
            subjectId = lesson.subjectId,
            semana = lesson.semana,
            subtema = lesson.subtema,
            title = lesson.title,
            depth = lesson.depth,
            challengeCount = lesson.challenges.size,
            targetCount = lesson.depth.targetChallenges,
            theoryLength = theoryResumen.length,
            duplicateQuestionsCount = duplicatesCount,
            issues = issues
        )
    }
}
