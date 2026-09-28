package com.jonsuapps.rastro.android.data

import android.content.Context
import android.content.SharedPreferences
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.json.JSONArray
import org.json.JSONObject

enum class FavoriteType {
    PLAYLIST,
    VIDEO,
    FORMULA,
    FLASHCARD,
    QUESTION,
    MATERIAL,
    MNEMOTECNIA
}

data class FavoriteItem(
    val id: String,
    val type: FavoriteType,
    val title: String,
    val subtitle: String = "",
    val category: String = "", // Materia / Tema (e.g. "Biología", "Física")
    val area: String = "General", // "Ingenierías", "Biomédicas", "Sociales", "General"
    val imageUrl: String? = null,
    val extraPayload: String = "", // Expresión, respuesta correcta, link o JSON
    val timestamp: Long = System.currentTimeMillis()
) {
    val itemId: String get() = id
    val subject: String get() = category
    val extra: String get() = extraPayload
    val question: String get() = title
    val answer: String get() = subtitle
}

object FavoritesRepository {

    private val _favoritesFlow = MutableStateFlow<List<FavoriteItem>>(emptyList())
    val favoritesFlow: StateFlow<List<FavoriteItem>> = _favoritesFlow.asStateFlow()

    private var currentLoadedUid: String? = null

    private fun getPrefs(context: Context): SharedPreferences {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: "local_student"
        return context.getSharedPreferences("rastro_user_favorites_$uid", Context.MODE_PRIVATE)
    }

    fun init(context: Context) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: "local_student"
        if (currentLoadedUid != uid) {
            currentLoadedUid = uid
            loadFromPrefs(context)
        }
    }

    private fun loadFromPrefs(context: Context) {
        val prefs = getPrefs(context)
        val jsonString = prefs.getString("favorites_list", "[]") ?: "[]"
        try {
            val array = JSONArray(jsonString)
            val list = mutableListOf<FavoriteItem>()
            for (i in 0 until array.length()) {
                val obj = array.getJSONObject(i)
                val typeName = obj.optString("type", FavoriteType.FLASHCARD.name)
                val type = runCatching { FavoriteType.valueOf(typeName) }.getOrDefault(FavoriteType.FLASHCARD)
                list.add(
                    FavoriteItem(
                        id = obj.getString("id"),
                        type = type,
                        title = obj.optString("title", ""),
                        subtitle = obj.optString("subtitle", ""),
                        category = obj.optString("category", ""),
                        area = obj.optString("area", "General"),
                        imageUrl = obj.optString("imageUrl", "").takeIf { it.isNotBlank() },
                        extraPayload = obj.optString("extraPayload", ""),
                        timestamp = obj.optLong("timestamp", System.currentTimeMillis())
                    )
                )
            }
            _favoritesFlow.value = list
        } catch (e: Exception) {
            _favoritesFlow.value = emptyList()
        }
    }

    private fun saveToPrefs(context: Context, list: List<FavoriteItem>) {
        val prefs = getPrefs(context)
        val array = JSONArray()
        list.forEach { item ->
            val obj = JSONObject()
            obj.put("id", item.id)
            obj.put("type", item.type.name)
            obj.put("title", item.title)
            obj.put("subtitle", item.subtitle)
            obj.put("category", item.category)
            obj.put("area", item.area)
            obj.put("imageUrl", item.imageUrl ?: "")
            obj.put("extraPayload", item.extraPayload)
            obj.put("timestamp", item.timestamp)
            array.put(obj)
        }
        prefs.edit().putString("favorites_list", array.toString()).apply()
        _favoritesFlow.value = list
    }

    fun isFavorite(id: String, type: FavoriteType): Boolean {
        return _favoritesFlow.value.any { it.id == id && it.type == type }
    }

    fun isFavorite(type: FavoriteType, id: String): Boolean = isFavorite(id, type)

    fun toggle(
        type: FavoriteType,
        itemId: String,
        title: String,
        subtitle: String = "",
        subject: String = "",
        area: String = "General",
        imageUrl: String? = null,
        extra: String? = "",
        context: Context? = null
    ): Boolean {
        val targetContext = context ?: com.jonsuapps.rastro.android.RastroApplication.instance
        val item = FavoriteItem(
            id = itemId,
            type = type,
            title = title,
            subtitle = subtitle,
            category = subject,
            area = area,
            imageUrl = imageUrl,
            extraPayload = extra ?: ""
        )
        return toggle(item, targetContext)
    }

    /**
     * Alterna el estado de favorito (si existe lo borra, si no existe lo agrega).
     * Retorna true si ahora es favorito, false si fue removido.
     */
    fun toggle(item: FavoriteItem, context: Context): Boolean {
        init(context)
        val current = _favoritesFlow.value.toMutableList()
        val existingIndex = current.indexOfFirst { it.id == item.id && it.type == item.type }
        val nowFavorite: Boolean
        if (existingIndex >= 0) {
            current.removeAt(existingIndex)
            nowFavorite = false
        } else {
            current.add(0, item.copy(timestamp = System.currentTimeMillis()))
            nowFavorite = true
        }
        saveToPrefs(context, current)
        return nowFavorite
    }

    fun remove(id: String, type: FavoriteType, context: Context) {
        init(context)
        val current = _favoritesFlow.value.toMutableList()
        val filtered = current.filterNot { it.id == id && it.type == type }
        saveToPrefs(context, filtered)
    }

    fun getByType(type: FavoriteType): List<FavoriteItem> {
        return _favoritesFlow.value.filter { it.type == type }
    }

    fun getFlashcards(): List<FavoriteItem> = getByType(FavoriteType.FLASHCARD)

    fun getQuestions(): List<FavoriteItem> = getByType(FavoriteType.QUESTION)

    fun getFlashcardSubjects(): List<String> {
        return getFlashcards()
            .map { it.category.ifBlank { "General" } }
            .distinct()
            .sorted()
    }

    fun getFlashcardsBySubject(subject: String): List<FavoriteItem> {
        if (subject.equals("Todas", ignoreCase = true) || subject.isBlank()) {
            return getFlashcards()
        }
        return getFlashcards().filter { it.category.equals(subject, ignoreCase = true) }
    }

    fun getFlashcardsByArea(area: String): List<FavoriteItem> {
        if (area.equals("Todas", ignoreCase = true) || area.isBlank()) {
            return getFlashcards()
        }
        return getFlashcards().filter { it.area.equals(area, ignoreCase = true) || it.area.equals("General", ignoreCase = true) }
    }

    /**
     * Retorna una mezcla aleatoria de las flashcards favoritas del usuario para sesión de repaso.
     */
    fun getFlashcardsMix(limit: Int = 30): List<FavoriteItem> {
        return getFlashcards().shuffled().take(limit)
    }

    /**
     * Retorna una mezcla aleatoria de las preguntas de examen favoritas del usuario.
     */
    fun getQuestionsMix(limit: Int = 30): List<FavoriteItem> {
        return getQuestions().shuffled().take(limit)
    }
}
