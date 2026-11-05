package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
data class EducationalVisualCatalog(val schemaVersion: Int, val resources: List<EducationalVisual>)

fun educationalVisualsForLesson(resources:List<EducationalVisual>,subjectId:String,lessonId:String):List<EducationalVisual> =
    resources.filter {it.subjectId==subjectId && lessonId in it.lessonIds}

/** Data-only contract shared with future web readers. Files and licences belong to each resource. */
@Serializable
data class EducationalVisual(
    val id: String, val title: String, val subjectId: String, val lessonIds: List<String>,
    val poster: String, val source: String, val license: String, val licenseUrl: String,
    val attribution: String, val description: String, val bytes: Long, val sha256: String,
    val version: String, val changes: String,
    val model: String? = null, val modelBytes: Long? = null, val modelSha256: String? = null,
    val modelSource: String? = null, val modelLicense: String? = null, val modelLicenseUrl: String? = null,
    val modelAttribution: String? = null, val modelDescription: String? = null,
    val sectionKeywords: List<String> = emptyList()
)

fun safeEducationalAsset(path: String): Boolean = path.matches(Regex("[a-zA-Z0-9_.-]+")) && !path.contains("..")

fun validEducationalVisual(resource: EducationalVisual): Boolean {
    val licences=setOf("CC0-1.0","Public domain","CC-BY-3.0","CC-BY-4.0","CC-BY-SA-2.1-JP","CC-BY-SA-4.0","MIT")
    return resource.id.isNotBlank() && resource.lessonIds.isNotEmpty() && resource.attribution.isNotBlank() &&
        resource.source.startsWith("https://") && resource.license in licences && resource.licenseUrl.startsWith("https://") &&
        safeEducationalAsset(resource.poster) && listOf(".svg",".png",".jpg",".webp").any(resource.poster::endsWith) && resource.bytes in 1L..2_000_000L &&
        resource.sha256.matches(Regex("[a-f0-9]{64}")) && (resource.model==null || (
        safeEducationalAsset(resource.model) && resource.model.endsWith(".glb") && resource.modelBytes?.let { it in 1L..8_000_000L }==true &&
        resource.modelLicense in licences && !resource.modelAttribution.isNullOrBlank() &&
        resource.modelLicenseUrl?.startsWith("https://")==true && resource.modelSource?.startsWith("https://")==true &&
        resource.modelSha256?.matches(Regex("[a-f0-9]{64}"))==true))
}

/** -1: lesson introduction; -2: configured section missing, so do not attach to unrelated content. */
fun educationalVisualAnchor(resource:EducationalVisual,titles:List<String>):Int =
    if(resource.sectionKeywords.isEmpty()) -1 else titles.indexOfFirst {title->
        resource.sectionKeywords.any {it.isNotBlank() && title.contains(it,ignoreCase=true)}
    }.let {if(it<0)-2 else it}
