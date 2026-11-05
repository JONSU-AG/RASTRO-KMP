package com.jonsuapps.rastro.android.ui.components

import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test
import java.io.File

/** Structural integrity only: does not certify the academic truth of any answer. */
class AcademicAllResourcesStructureTest {
    @Test fun allMultipleChoiceResourcesHaveDistinctAlternativesAndValidIndices() {
        val root=File("../shared/src/commonMain/composeResources/files/aprender")
        var count=0
        root.walkTopDown().filter {it.name=="questions.json"}.forEach { file ->
            val ids=mutableSetOf<String>()
            Json.parseToJsonElement(file.readText().removePrefix("\uFEFF")).jsonArray.forEach { element ->
                val q=element.jsonObject
                val id=q.getValue("id").jsonPrimitive.content
                assertTrue("Duplicate ID $id in ${file.path}",ids.add(id))
                if(q["type"]?.jsonPrimitive?.content=="MULTIPLE_CHOICE") {
                    val options=q.getValue("options").jsonArray.map {it.jsonPrimitive.content.trim()}
                    assertEquals("Repeated alternative: $id",options.size,options.distinct().size)
                    assertTrue("Invalid index: $id",q.getValue("correctIndex").jsonPrimitive.int in options.indices)
                    count++
                }
            }
        }
        assertTrue("Expected complete resource tree",count>4000)
    }
}
