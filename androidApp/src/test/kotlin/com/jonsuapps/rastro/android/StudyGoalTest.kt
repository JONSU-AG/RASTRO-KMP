package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.*
import org.junit.Assert.*
import org.junit.Test

class StudyGoalTest {
    @Test fun unsaRouteIsOptionalAndCannotLeakToAnotherUniversity() {
        val existingGoal=StudyGoal("unsa", "Ingeniería de Sistemas", true)
        assertTrue(existingGoal.valid)
        assertNull(existingGoal.unsaRoute)
        UnsaAdmissionRoute.entries.forEach { route ->
            assertTrue(existingGoal.copy(unsaRoute=route).valid)
            assertFalse(StudyGoal("unmsm", "Medicina Humana", true, route).valid)
        }
        assertEquals(StudyCareerAreas.classify(existingGoal), StudyCareerAreas.classify(existingGoal.copy(unsaRoute=UnsaAdmissionRoute.CEPRUNSA)))
    }
    @Test fun searchAcceptsAccentsAcronymsAndMultipleTerms() {
        assertTrue(StudyGoalCatalog.matches("UNSA Universidad Nacional de San Agustín de Arequipa", "unsa agustin"))
        assertTrue(StudyGoalCatalog.matches("Ingeniería de Sistemas", "ingenieria sistemas"))
        assertFalse(StudyGoalCatalog.matches("Ingeniería de Sistemas", "medicina"))
    }
    @Test fun guestAndSignedInScopesDoNotSharePreferences() {
        assertEquals("guest", studyGoalScope("anonymous", true, true))
        assertEquals("guest", studyGoalScope("local_student_guest", false, false))
        assertNotEquals(studyGoalScope("alice", true, false), studyGoalScope("bob", true, false))
        assertNotEquals("guest", studyGoalScope("alice", true, false))
    }
    @Test fun careerFromAnotherUniversityCannotBePresentedAsVerified() {
        assertFalse(StudyGoal("uni", "Medicina Humana", true).valid)
        assertTrue(StudyGoal("unmsm", "Medicina Humana", true).valid)
        assertTrue(StudyGoal("uni", "Mi meta personal", false).valid)
    }
    @Test fun blankUnknownAndOverlongGoalsAreRejected() {
        assertFalse(StudyGoal("missing", "Carrera", false).valid)
        assertFalse(StudyGoal("unsa", "   ", false).valid)
        assertFalse(StudyGoal("unsa", "x".repeat(121), false).valid)
    }
    @Test fun sourcesAndIdentitiesArePresentAndCareersDoNotRepeatWithinUniversity() {
        assertEquals(StudyGoalCatalog.universities.size, StudyGoalCatalog.universities.map { it.id }.distinct().size)
        StudyGoalCatalog.universities.forEach {
            assertTrue(it.sources.all { source -> source.startsWith("https://") })
            assertTrue(it.careers.isNotEmpty())
            assertEquals(it.careers.size, it.careers.distinct().size)
        }
    }
    @Test fun extendedPublicUniversitiesKeepTheirOwnCareersAndIdentities() {
        assertTrue(StudyGoalCatalog.universities.map { it.id }.containsAll(listOf("unap-puno", "unsaac", "unjbg", "uncp")))
        assertEquals("Puno", StudyGoalCatalog.find("unap-puno")!!.city)
        assertTrue(StudyGoal("unap-puno", "Ingeniería de Sistemas", true).valid)
        assertFalse(StudyGoal("unap-puno", "Ingeniería Informática y de Sistemas", true).valid)
        assertTrue(StudyGoal("unsaac", "Ingeniería Informática y de Sistemas", true).valid)
        assertTrue(StudyGoal("unjbg", "Ingeniería en Informática y Sistemas", true).valid)
        assertTrue(StudyGoalCatalog.matches("UNAP Universidad Nacional del Altiplano Puno", "unap puno"))
    }
}
