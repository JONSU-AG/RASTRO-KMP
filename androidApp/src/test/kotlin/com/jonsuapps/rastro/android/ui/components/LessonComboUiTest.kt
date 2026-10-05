package com.jonsuapps.rastro.android.ui.components

import androidx.compose.runtime.saveable.SaverScope
import com.jonsuapps.rastro.model.LessonComboState
import org.junit.Assert.*
import org.junit.Test

class LessonComboUiTest {
    @Test fun savedComboRetainsDeduplicationWithoutAnAnimationEvent() {
        val original = LessonComboState(5, setOf("false:5:q", "true:1:q"))
        val scope = object : SaverScope { override fun canBeSaved(value: Any) = true }
        val saved = with(LessonComboSaver) { scope.save(original) }!!
        val restored = LessonComboSaver.restore(saved)!!
        assertEquals(original, restored)
        assertTrue(restored.answer("false:5:q", true).events.isEmpty())
        assertTrue(restored.answer("false:6:q", true).events.isEmpty())
    }

    @Test fun maximumPlaceholderUsesExistingClassicAnimationForOneBriefPlayback() {
        val visual = resolveComboEffect(ComboMilestoneEffect.MAX_COMBO)
        assertEquals(ClassicAppearance.IN_LOVE, visual.appearance)
        assertEquals(ClassicCharacter.LOKI, visual.character)
        assertEquals(1600L, visual.durationMillis)
        assertEquals(4000f / visual.speed, visual.durationMillis.toFloat(), 1f)
    }
}
