package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test
import java.io.File

/** Loading evidence for all resources. The diagnostic does not certify factual accuracy. */
class AcademicResourceLoadingAuditTest {
    @Test fun everyResourceBankCanBeReadByTheProductionLoaderWithoutLosingQuestions() = runBlocking {
        val root = File("../shared/src/commonMain/composeResources/files")
        val loader = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })
        val issues = mutableListOf<JsonObject>()
        val failures = mutableListOf<String>()
        var levels = 0
        var questions = 0
        root.resolve("aprender").walkTopDown().filter { it.name == "questions.json" }.sortedBy { it.path }.forEach { file ->
            val rel = file.relativeTo(root.resolve("aprender")).invariantSeparatorsPath.split('/')
            val subject = rel[0]
            val week = rel[1].removePrefix("semana").toInt()
            val subtopic = rel[2]
            val expected = Json.parseToJsonElement(file.readText().removePrefix("\uFEFF")).jsonArray.map { it.jsonObject.getValue("id").jsonPrimitive.content }
            try {
                val lesson = loader.loadLesson(subject, week, subtopic).lesson
                assertEquals(file.path, expected, lesson.challenges.map { it.id })
                val report = CatalogValidator.validateCatalog(listOf(lesson))
                report.reports.flatMap { it.issues }.forEach { issue ->
                    issues += buildJsonObject {
                        put("level", "$subject/$subtopic"); put("code", issue.code)
                        put("severity", issue.severity.name); put("message", issue.message)
                    }
                }
                levels++
                questions += lesson.challenges.size
            } catch (error: Exception) {
                failures += "$subject/$subtopic: ${error.message}"
            }
        }
        val output = File("../build/academic-resource-loading-audit.json")
        output.parentFile?.mkdirs()
        output.writeText(Json { prettyPrint = true }.encodeToString(JsonObject.serializer(), buildJsonObject {
            put("levels", levels); put("questions", questions)
            put("loadFailures", JsonArray(failures.map(::JsonPrimitive)))
            put("catalogIssues", JsonArray(issues))
            put("scope", "Resource loading only; no factual certification or Android execution.")
        }))
        assertTrue(failures.joinToString("\n"), failures.isEmpty())
        val errors = issues.filter { it["severity"]?.jsonPrimitive?.content == "ERROR" }
        assertTrue(errors.joinToString("\n"), errors.isEmpty())
        assertTrue("Expected all resource levels", levels >= 418)
        assertTrue("Expected all resource questions", questions >= 4500)
    }
}
