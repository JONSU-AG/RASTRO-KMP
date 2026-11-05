package com.jonsuapps.rastro.android.ui.screens

import android.content.Context
import org.json.JSONObject

internal class MaterialReaderStore(context: Context, scope: String) {
    private val prefs = context.applicationContext.getSharedPreferences(fileName(scope),Context.MODE_PRIVATE)
    fun selection(subject: String) = runCatching {
        val value = JSONObject(prefs.getString("selection:$subject",null) ?: return MaterialSelection())
        MaterialSelection(MaterialKind.valueOf(value.getString("kind")),MaterialNavigation.valueOf(value.getString("navigation")),
            value.optInt("week").takeIf { it>0 },value.optString("lesson").takeIf(String::isNotBlank))
    }.getOrDefault(MaterialSelection())
    fun saveSelection(subject: String, selection: MaterialSelection) {
        prefs.edit().putString("selection:$subject",JSONObject().put("kind",selection.kind.name)
            .put("navigation",selection.navigation.name).put("week",selection.week ?: 0).put("lesson",selection.lessonId.orEmpty()).toString()).apply()
    }
    private fun positionKey(subject: String, s: MaterialSelection) = "position:$subject:${s.kind}:${s.week}:${s.lessonId}"
    fun position(subject: String, s: MaterialSelection): Pair<String?,Int> = runCatching {
        val j=JSONObject(prefs.getString(positionKey(subject,s),null) ?: return null to 0)
        j.getString("id") to j.optInt("offset").coerceAtLeast(0)
    }.getOrDefault(null to 0)
    fun savePosition(subject: String,s: MaterialSelection,id: String,offset: Int) {
        prefs.edit().putString(positionKey(subject,s),JSONObject().put("id",id).put("offset",offset.coerceAtLeast(0)).toString()).apply()
    }
    fun marks(): Map<String,MaterialMark> = prefs.all.filterKeys { it.startsWith("mark:") }.mapNotNull { (key,v) ->
        runCatching { val j=JSONObject(v as String); key.removePrefix("mark:") to MaterialMark(j.getString("fingerprint"),MaterialReview.valueOf(j.getString("status")),j.optString("note")) }.getOrNull()
    }.toMap()
    fun mark(unit: MaterialUnit,status: MaterialReview,note: String): MaterialMark {
        val value=MaterialMark(unit.fingerprint,status,note.take(1000))
        prefs.edit().putString("mark:${unit.id}",JSONObject().put("fingerprint",value.fingerprint).put("status",value.status.name).put("note",value.note).toString()).apply()
        return value
    }
    companion object {
        private fun fileName(scope: String) = "rastro_material_"+materialHash(scope).take(24)
        fun clear(context: Context,uid: String) { context.getSharedPreferences(fileName(uid),Context.MODE_PRIVATE).edit().clear().apply() }
    }
}
