package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.AdminUserDirectory
import org.junit.Assert.*
import org.junit.Test

class AdminUserDirectoryTest {
    @Test fun searchIncludesProfilesBeyondFirstHundredAndNormalizesNames() {
        val users = (1..130).map { AdminUserDirectory.fromProfile("user$it", mapOf("displayName" to "Persona $it", "email" to "user$it@mail.com")) }
        assertEquals("user130", users.single { AdminUserDirectory.matches(it, " USER130@MAIL.COM ") }.uid)
        val jose = AdminUserDirectory.fromProfile("jose-id", mapOf("displayName" to "José Pérez"))
        assertTrue(AdminUserDirectory.matches(jose, "jose perez"))
        assertTrue(AdminUserDirectory.matches(jose, "JOSE-ID"))
    }
    @Test fun legacyNamesAndEmailsAreSearchableWithoutUnsafeCasts() {
        val legacy = AdminUserDirectory.fromProfile("legacy", mapOf("displayName" to "", "name" to "Ana", "correo" to "ana@mail.com", "isAlly" to "invalid"))
        assertEquals("Ana", legacy.displayName)
        assertTrue(AdminUserDirectory.matches(legacy, "ana@mail.com"))
        assertFalse(legacy.isAlly)
    }
    @Test fun identityRepairPreservesStudentChosenNameAndDoesNotRewriteUnchangedProfile() {
        val fields = mapOf("displayName" to "Mi nombre elegido", "email" to "a@mail.com")
        assertTrue(AdminUserDirectory.missingIdentity(fields, "a@mail.com", "Nombre Google").isEmpty())
        assertEquals(mapOf("email" to "nuevo@mail.com"), AdminUserDirectory.missingIdentity(fields, "nuevo@mail.com", "Nombre Google"))
    }
    @Test fun activityOnlyProfileGetsDiscoverableIdentityWithoutAcademicDefaults() {
        val fields = AdminUserDirectory.missingIdentity(mapOf("totalTesterSeconds" to 50), "ana@mail.com", null)
        assertEquals(mapOf("email" to "ana@mail.com", "displayName" to "ana"), fields)
        assertFalse(fields.containsKey("targetCareer"))
    }
}
