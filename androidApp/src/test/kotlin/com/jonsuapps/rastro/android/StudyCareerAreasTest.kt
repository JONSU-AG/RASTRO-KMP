package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.*
import com.jonsuapps.rastro.model.AreaAdmision
import org.junit.Assert.*
import org.junit.Test

class StudyCareerAreasTest {
    @Test fun assignsAreasWithoutExtraUserInput() {
        assertEquals(AreaAdmision.INGENIERIAS, StudyGoal("unsa", "Ingeniería de Sistemas", true).preparationArea)
        assertEquals(AreaAdmision.SOCIALES, StudyGoal("unsa", "Psicología", true).preparationArea)
        assertEquals(AreaAdmision.BIOMEDICAS, StudyGoal("unsa", "Medicina", true).preparationArea)
        assertEquals(AreaAdmision.BIOMEDICAS, StudyGoal("unsa", "Ingeniería Pesquera", true).preparationArea)
        assertEquals(AreaAdmision.INGENIERIAS, StudyGoal("unsa", "Ingeniería de Industrias Alimentarias", true).preparationArea)
    }
    @Test fun doesNotGuessUnknownOrInvalidCareers() {
        assertNull(StudyGoal("unsa", "Carrera futura", false).preparationArea)
        assertNull(StudyGoal("uni", "Medicina", true).preparationArea)
    }
    @Test fun everyCatalogCareerHasAnInternalPreparationGroup() {
        val missing = StudyGoalCatalog.universities.flatMap { university -> university.careers.mapNotNull { career ->
            "${university.id}: $career".takeIf { StudyGoal(university.id, career, true).preparationArea == null }
        } }
        assertTrue(missing.joinToString("\n"), missing.isEmpty())
    }
}
