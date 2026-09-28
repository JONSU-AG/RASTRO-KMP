package com.jonsuapps.rastro.android.data

import android.content.Context
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.model.ExamQuestion
import org.json.JSONArray

object ExamQuestionRepository {
    fun reportQuestion(
        question: ExamQuestion,
        reason: String,
        details: String,
        onComplete: (Result<Unit>) -> Unit
    ) {
        val user = FirebaseAuth.getInstance().currentUser
        val payload = mapOf(
            "targetId" to question.id,
            "targetTitle" to question.q,
            "targetType" to "examen",
            "reportedUser" to null,
            "reporterUid" to (user?.uid ?: "anonimo"),
            "reporterEmail" to (user?.email ?: "anonimo"),
            "reason" to reason,
            "reasonLabel" to reason,
            "details" to details.trim(),
            "autoHideApplied" to false,
            "status" to "pendiente",
            "createdAt" to FieldValue.serverTimestamp(),
            "timestamp" to System.currentTimeMillis()
        )
        FirebaseFirestore.getInstance().collection("reportes").add(payload)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun createCommunityQuestion(
        question: String,
        options: List<String>,
        answerIndex: Int,
        subject: String,
        explanation: String,
        imageUrl: String? = null,
        area: String = "General",
        onComplete: (Result<Unit>) -> Unit
    ) {
        val user = FirebaseAuth.getInstance().currentUser
        val payload = mapOf(
            "q" to question.trim(),
            "options" to options.map(String::trim),
            "answer" to answerIndex.coerceIn(0, options.lastIndex),
            "asignatura" to subject,
            "area" to area,
            "imageUrl" to imageUrl?.trim()?.takeIf { it.isNotBlank() },
            "explanation" to explanation.trim(),
            "authorName" to (user?.displayName ?: "Estudiante RASTRO"),
            "authorUid" to user?.uid,
            "createdAt" to FieldValue.serverTimestamp()
        )
        FirebaseFirestore.getInstance().collection("preguntas_examen").add(payload)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun loadOfficialBank(context: Context): List<ExamQuestion> = runCatching {
        context.assets.open("bancoPreguntasCepreunsa.json").bufferedReader(Charsets.UTF_8).use { reader ->
            val array = JSONArray(reader.readText())
            buildList(array.length()) {
                for (index in 0 until array.length()) {
                    val item = array.optJSONObject(index) ?: continue
                    val question = item.optString("q").trim()
                    val optionsJson = item.optJSONArray("options") ?: continue
                    val options = buildList {
                        for (optionIndex in 0 until optionsJson.length()) {
                            optionsJson.optString(optionIndex).takeIf(String::isNotBlank)?.let(::add)
                        }
                    }
                    if (question.isBlank() || options.size < 2) continue
                    add(
                        ExamQuestion(
                            id = item.optString("id", "cepre_$index"),
                            q = question,
                            options = options,
                            answer = answerIndex(item.opt("answer"), options.size),
                            asignatura = item.optString("asignatura", item.optString("subject", "General")),
                            curso = item.optString("curso", item.optString("subject", "")),
                            area = item.optString("area", ""),
                            explanation = item.optString("explanation", ""),
                            imageUrl = item.optString("imageUrl", item.optString("img", "")).takeIf(String::isNotBlank),
                            valorPonderado = item.optDouble("valorPonderado").takeIf { !it.isNaN() && it > 0.0 },
                            semana = item.optInt("semana").takeIf { item.has("semana") },
                            authorName = item.optString("authorName", item.optString("fuente", "CEPREUNSA Solucionario Oficial")),
                            subtema = item.optString("subtema", ""),
                            destinoUso = item.optString("destinoUso", "SOLO_EXAMEN"),
                            nivelDificultad = item.optString("nivelDificultad", "INTERMEDIO"),
                            aptoExamenRepaso = item.optBoolean("aptoExamenRepaso", true),
                            estadoGrafico = item.optString("estadoGrafico", "SIN_GRAFICO_TEXTUAL"),
                            tipoFormato = item.optString("tipoFormato", "TEORICO_DIRECTO"),
                            observacion = item.optString("observacion", "")
                        )
                    )
                }
            }
        }
    }.getOrDefault(emptyList())

    /**
     * Filtra preguntas aptas para Simulacros Oficiales y Prácticas Cronometradas.
     * Excluye preguntas con gráficos rotos/faltantes y combina problemas de examen
     * con flashcards conceptuales de alto nivel (aptoExamenRepaso == true).
     */
    fun getQuestionsForSimulacro(questions: List<ExamQuestion>): List<ExamQuestion> {
        return questions.filter { 
            it.estadoGrafico != "REQUIERE_GRAFICO_FALTANTE" && 
            (it.destinoUso == "SOLO_EXAMEN" || it.aptoExamenRepaso)
        }
    }

    /**
     * Convierte y filtra preguntas conceptuales puras en Flashcards interactivas,
     * excluyendo cálculos numéricos pesados, secuencias V/F o gráficos rotos.
     */
    fun getQuestionsForFlashcards(
        questions: List<ExamQuestion>,
        subtema: String? = null,
        subject: String? = null
    ): List<com.jonsuapps.rastro.model.FlashcardItem> {
        return questions
            .filter { 
                it.estadoGrafico != "REQUIERE_GRAFICO_FALTANTE" && 
                it.destinoUso in listOf("SOLO_FLASHCARD", "FLASHCARD_Y_REPASO")
            }
            .filter { subtema == null || it.subtema.equals(subtema, ignoreCase = true) }
            .filter { subject == null || it.asignatura.equals(subject, ignoreCase = true) }
            .map { q ->
                val correctText = q.options.getOrNull(q.answer) ?: ""
                val fullAnswer = if (q.explanation.isNotBlank()) {
                    "$correctText\n\n📌 Fundamento:\n${q.explanation}"
                } else {
                    correctText
                }
                com.jonsuapps.rastro.model.FlashcardItem(
                    id = q.id,
                    q = q.q,
                    a = fullAnswer,
                    subject = q.asignatura,
                    authorName = q.authorName,
                    semana = q.semana,
                    subtemaTitle = q.subtema.ifBlank { null },
                    imageUrl = q.imageUrl
                )
            }
    }

    /**
     * Filtra preguntas para exámenes de repaso focalizados por subtema y/o nivel de dificultad.
     */
    fun getQuestionsForRepaso(
        questions: List<ExamQuestion>,
        subtema: String? = null,
        nivel: String? = null
    ): List<ExamQuestion> {
        return questions
            .filter { it.estadoGrafico != "REQUIERE_GRAFICO_FALTANTE" && it.aptoExamenRepaso }
            .filter { subtema == null || it.subtema.equals(subtema, ignoreCase = true) }
            .filter { nivel == null || it.nivelDificultad.equals(nivel, ignoreCase = true) }
    }

    fun observeCommunity(onQuestions: (List<ExamQuestion>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("preguntas_examen")
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onQuestions(snapshot.documents.mapNotNull(::toQuestion))
            }

    private fun toQuestion(document: DocumentSnapshot): ExamQuestion? {
        val question = document.getString("q")?.trim()?.takeIf(String::isNotBlank) ?: return null
        val options = (document.get("options") as? List<*>)?.mapNotNull { it as? String }.orEmpty()
        if (options.size < 2) return null
        return ExamQuestion(
            id = document.id,
            q = question,
            options = options,
            answer = answerIndex(document.get("answer"), options.size),
            asignatura = document.getString("asignatura") ?: document.getString("subject") ?: "General",
            curso = document.getString("curso") ?: document.getString("subject").orEmpty(),
            area = document.getString("area").orEmpty(),
            explanation = document.getString("explanation").orEmpty(),
            imageUrl = document.getString("imageUrl") ?: document.getString("img"),
            valorPonderado = document.getDouble("valorPonderado"),
            semana = document.getLong("semana")?.toInt(),
            authorName = document.getString("authorName") ?: "Comunidad RASTRO",
            authorUid = document.getString("authorUid")
        )
    }

    private fun answerIndex(raw: Any?, optionCount: Int): Int {
        val index = when (raw) {
            is Number -> raw.toInt().let { if (it in 1..optionCount && it == optionCount) it - 1 else it }
            is String -> {
                val value = raw.trim().uppercase()
                val letterIndex = value.firstOrNull()?.let { it - 'A' }
                if (letterIndex != null && letterIndex in 0 until optionCount) letterIndex
                else value.toIntOrNull()?.let { if (it in 1..optionCount && it == optionCount) it - 1 else it } ?: 0
            }
            else -> 0
        }
        return index.coerceIn(0, optionCount - 1)
    }
}
