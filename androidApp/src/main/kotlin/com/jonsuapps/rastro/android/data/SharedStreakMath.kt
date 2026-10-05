package com.jonsuapps.rastro.android.data

import java.time.LocalDate

/** Every accepted member must qualify; opening the app alone does not qualify. */
object SharedStreakMath {
    fun days(data: Map<String, Any>, today: LocalDate = LocalDate.now()): Int {
        if (data["status"] != "active") return 0
        val members = ((data["participants"] as? List<*>)?.filterIsInstance<String>()
            ?: listOfNotNull(data["user1Uid"] as? String, data["user2Uid"] as? String)).distinct()
        if (members.size < 2) return 0
        val activity = (data["dailyActivity"] as? Map<*, *>).orEmpty()
        fun complete(day: LocalDate) = members.all { (activity[it] as? Map<*, *>)?.get(day.toString()) == true }
        var day = if (complete(today)) today else today.minusDays(1)
        var count = 0
        while (complete(day)) { count++; day = day.minusDays(1) }
        return count
    }
}
