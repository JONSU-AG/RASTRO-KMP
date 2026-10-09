package com.jonsuapps.rastro.android.data
import com.jonsuapps.rastro.model.ExamQuestion
import com.jonsuapps.rastro.model.AreaAdmision
import com.jonsuapps.rastro.model.RankingExamConfig
import com.jonsuapps.rastro.android.RastroApplication
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString

@Serializable
data class SavedExamSession(val uid: String, val tab: Int, val area: AreaAdmision, val attemptId: String,
    val questions: List<ExamQuestion>, val answers: Map<String,Int>, val index: Int, val ranking: RankingExamConfig? = null)
internal object ExamSessionCodec {
    private val json = Json { ignoreUnknownKeys = true }
    fun encode(session: SavedExamSession): String = json.encodeToString(SavedExamSession.serializer(), session)
    fun decode(encoded: String): SavedExamSession = json.decodeFromString(SavedExamSession.serializer(), encoded)
}
object ExamSessionStore {
    private val writer = java.util.concurrent.Executors.newSingleThreadExecutor()
    private val generation = java.util.concurrent.atomic.AtomicLong()
    private val lock = Any()
    private val prefs get() = RastroApplication.instance.getSharedPreferences("rastro_exam_sessions",android.content.Context.MODE_PRIVATE)
    fun save(session: SavedExamSession) {
        val ticket = generation.get()
        writer.execute {
            // A failed checkpoint must not terminate the exam or overwrite its last valid copy.
            try {
                val encoded = ExamSessionCodec.encode(session)
                synchronized(lock) { if(generation.get() == ticket) prefs.edit().putString(session.uid.ifBlank { "guest" },encoded).apply() }
            } catch (error: Exception) {
                android.util.Log.e("ExamSessionStore", "No se pudo guardar la sesión local del examen", error)
            }
        }
    }
    fun load(uid: String): SavedExamSession? = runCatching { ExamSessionCodec.decode(prefs.getString(uid.ifBlank { "guest" },null) ?: return@runCatching null) }.getOrNull()?.takeIf { it.uid == uid && it.questions.isNotEmpty() }
    fun clear(uid: String) { synchronized(lock) { generation.incrementAndGet(); prefs.edit().remove(uid.ifBlank { "guest" }).apply() } }
}
