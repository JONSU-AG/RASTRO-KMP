package com.jonsuapps.rastro.android.data

import android.content.Context
import org.json.JSONObject

class StudyGoalPreferences(context: Context, private val scope: String) {
    private val prefs = context.applicationContext.getSharedPreferences("rastro_study_goals", Context.MODE_PRIVATE)
    val handled get() = prefs.getBoolean("$scope:handled", false)
    fun load(): StudyGoal? = runCatching {
        val json = JSONObject(prefs.getString("$scope:goal", null) ?: return null)
        StudyGoal(json.getString("university"), json.getString("career"), json.optBoolean("catalog"),
            if (json.getString("university") == "unsa") runCatching { UnsaAdmissionRoute.valueOf(json.optString("unsaRoute")) }.getOrNull() else null)
            .takeIf { it.valid }
    }.getOrNull()
    fun save(goal: StudyGoal) {
        require(goal.valid)
        prefs.edit().putString("$scope:goal", JSONObject().put("university", goal.universityId)
            .put("career", goal.career.trim()).put("catalog", goal.catalogCareer)
            .put("preparationArea", goal.preparationArea?.name).put("unsaRoute", goal.unsaRoute?.name).toString())
            .putBoolean("$scope:handled", true).apply()
    }
    // Skipping/edit cancellation does not delete an existing goal.
    fun skip() { prefs.edit().putBoolean("$scope:handled", true).apply() }
    fun clear() { prefs.edit().remove("$scope:goal").remove("$scope:handled").apply() }
}
