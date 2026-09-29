package com.jonsuapps.rastro.data.content

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import kotlinx.serialization.Serializable

/**
 * Contenido completo de una lección cargado desde archivos aislados.
 * Se convierte a [LessonNode] para compatibilidad total con el motor existente.
 */
@Serializable
data class LessonContent(
    val lesson: LessonNode,           // Modelo existente (compatibilidad total)
    val theoryMarkdown: String,       // Contenido crudo de theory.md (para auditoría)
    val questionsJson: String         // Contenido crudo de questions.json (para auditoría)
)

/**
 * Representación JSON de una pregunta para carga desde questions.json
 * Se mapea a [Challenge] existente.
 */
@Serializable
data class QuestionJson(
    val id: String,
    val type: String = "MULTIPLE_CHOICE",
    val statement: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String,
    val formula: String? = null,
    val subject: String = "",
    val semana: Int = 1,
    val correctText: String? = null,
    val sentenceBefore: String? = null,
    val sentenceAfter: String? = null,
    val chips: List<String> = emptyList(),
    val pairs: List<PairJson> = emptyList(),
    val rightOptions: List<MatchOptionJson> = emptyList(),
    val instruction: String? = null,
    val pedagogicalTier: String? = null,
    val fuente: String? = null,
    val concept: String? = null
)

@Serializable
data class PairJson(
    val id: String,
    val left: String,
    val right: String
)

@Serializable
data class MatchOptionJson(
    val id: String,
    val text: String
)

/**
 * Conversión de JSON a modelos existentes.
 */
object LessonContentMapper {
    fun toLessonNode(content: LessonContent): LessonNode = content.lesson

    fun toChallenges(questionsJson: List<QuestionJson>): List<com.jonsuapps.rastro.model.Challenge> {
        return questionsJson.map { q ->
            com.jonsuapps.rastro.model.Challenge(
                id = q.id,
                type = com.jonsuapps.rastro.model.ChallengeType.valueOf(q.type),
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
    }
}