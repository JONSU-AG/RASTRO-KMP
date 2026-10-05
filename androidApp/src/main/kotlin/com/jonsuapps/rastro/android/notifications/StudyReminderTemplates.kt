package com.jonsuapps.rastro.android.notifications

import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withTimeout

internal enum class ReminderActivity(val label: String) {
    LESSON_DONE("Lección completada"), STILL_TIME("Aún puede estudiar hoy"), STREAK_LOST("Racha perdida")
}
internal data class StudyReminderTemplate(val id: String, val activity: ReminderActivity,
    val title: String, val body: String, val startHour: Int = 9, val endHour: Int = 21,
    val enabled: Boolean = true) {
    fun payload(): Map<String, Any> = mapOf("id" to id, "activity" to activity.name,
        "title" to title, "body" to body, "startHour" to startHour, "endHour" to endHour, "enabled" to enabled)
}
internal object StudyReminderTemplates {
    val document get() = FirebaseFirestore.getInstance().collection("oficiales").document("study_reminders")
    val defaults = listOf(
        StudyReminderTemplate("lesson_done", ReminderActivity.LESSON_DONE, "¡Buen avance hoy!", "Ya completaste una lección. Sigue construyendo tu meta paso a paso.", 15, 21),
        StudyReminderTemplate("morning", ReminderActivity.STILL_TIME, "¡Buen día, futuro cachimbo!", "Hoy puedes avanzar con una lección o repasar para tu examen.", 7, 11),
        StudyReminderTemplate("afternoon", ReminderActivity.STILL_TIME, "Momento de avanzar", "Completa una lección en el Camino de Aprendizaje. Aún tienes tiempo para estudiar hoy.", 15, 18),
        StudyReminderTemplate("evening", ReminderActivity.STILL_TIME, "¡Protege tu racha!", "Estudia antes de medianoche para mantener encendida tu racha.", 19, 23),
        StudyReminderTemplate("streak_lost", ReminderActivity.STREAK_LOST, "Volvamos a empezar", "Una pausa no termina tu camino. Vuelve a estudiar y construye una nueva racha.", 9, 21)
    )
    fun decode(raw: Any?): List<StudyReminderTemplate>? {
        val rows = raw as? List<*> ?: return null
        if (rows.size > 32) return null
        val parsed = rows.mapNotNull { value ->
            val row = value as? Map<*, *> ?: return@mapNotNull null
            val activity = runCatching { ReminderActivity.valueOf(row["activity"] as String) }.getOrNull() ?: return@mapNotNull null
            val title = row["title"] as? String ?: return@mapNotNull null
            val body = row["body"] as? String ?: return@mapNotNull null
            val id = row["id"] as? String ?: return@mapNotNull null
            val start = (row["startHour"] as? Number)?.toInt() ?: 9
            val end = (row["endHour"] as? Number)?.toInt() ?: 21
            if (id.isBlank() || title.isBlank() || title.length > 100 || body.isBlank() || body.length > 500 || start !in 0..23 || end !in start..23) return@mapNotNull null
            StudyReminderTemplate(id, activity, title, body, start, end, row["enabled"] as? Boolean ?: true)
        }
        return parsed.takeIf { it.size == rows.size && it.map { row -> row.id }.distinct().size == it.size }
    }
    suspend fun load(): List<StudyReminderTemplate> = runCatching {
        withTimeout(8000) { val snapshot = document.get().await(); decode(snapshot.get("templates")) ?: defaults }
    }.getOrDefault(defaults)
}

internal fun reminderActivity(today: java.time.LocalDate, completedToday: Boolean, lastActive: String,
    freezes: Int): ReminderActivity = when {
    completedToday -> ReminderActivity.LESSON_DONE
    runCatching { java.time.LocalDate.parse(lastActive) }.getOrNull()?.let {
        java.time.temporal.ChronoUnit.DAYS.between(it, today) > 1 && freezes <= 0
    } == true -> ReminderActivity.STREAK_LOST
    else -> ReminderActivity.STILL_TIME
}
