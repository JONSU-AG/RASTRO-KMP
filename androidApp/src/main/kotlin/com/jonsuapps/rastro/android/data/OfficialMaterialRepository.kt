package com.jonsuapps.rastro.android.data

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration

data class OfficialMaterialResource(
    val id: String,
    val title: String,
    val description: String,
    val url: String,
    val type: String
) {
    val isFolder: Boolean get() = url.contains("/folders/", ignoreCase = true) || type == "folder"
    val isPdf: Boolean get() = !isFolder && (url.substringBefore('?').endsWith(".pdf", ignoreCase = true) || type == "pdf")
}

object OfficialMaterialRepository {
    private val defaults = listOf(
        OfficialMaterialResource(
            "official-tomos-ceprequintos-2027", "Tomos y Prácticas CEPREQUINTOS 2027",
            "Material de estudio oficial, tomos y prácticas especializadas de CEPREQUINTOS.",
            "https://drive.google.com/drive/folders/1RfSFh4w496DoJ3-TShLXjgTLOALnJKDr", "tomo"
        ),
        OfficialMaterialResource(
            "official-tomos-cepreunsa", "Tomos CEPREUNSA",
            "Compendios y material de estudio organizado por áreas de CEPREUNSA.",
            "https://drive.google.com/drive/folders/1nzuWdHTmM6SC6cwxQcvs9JNQ4N0rEiHF", "tomo"
        ),
        OfficialMaterialResource(
            "official-examenes-admision", "Exámenes de Admisión Pasados",
            "Recopilación de exámenes anteriores resueltos para entrenar velocidad y precisión.",
            "https://drive.google.com/drive/folders/1SvOPvIwppyUTJ-16ImBpfnh6wDWaKNVZ", "tomo"
        ),
        OfficialMaterialResource(
            "official-material-resumenes", "Material y Resúmenes Clave",
            "Fichas teóricas, formularios y resúmenes complementarios para reforzar el estudio.",
            "https://drive.google.com/drive/folders/1fNBpQ7M-QKWELu6S2aSsW340ULCZnM4z", "tomo"
        ),
        OfficialMaterialResource(
            "official-temario-matriz-2027", "Temario y Matriz de Evaluación 2027",
            "Temario oficial y matriz de evaluación para el proceso de admisión 2027.",
            "https://rumbo-jonsu.web.app/assets/TEMARIO-y-MATRIZ-ADMISION-2027.pdf", "pdf"
        ),
        OfficialMaterialResource(
            "official-ceprequintos-practicas-2027", "CEPREQUINTOS 2027",
            "Material en proceso y actualización constante para postulantes de 5to de secundaria.",
            "https://drive.google.com/drive/folders/1RfSFh4w496DoJ3-TShLXjgTLOALnJKDr", "practica"
        ),
        OfficialMaterialResource(
            "official-practicas-cepreunsa", "Prácticas CEPREUNSA",
            "Bancos de preguntas y prácticas para reforzar la preparación en todas las áreas.",
            "https://drive.google.com/drive/folders/1dLvDGUtO4xJFOw30zyaH24vWiJtjlJZ3", "practica"
        )
    )

    fun observe(onResources: (List<OfficialMaterialResource>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("oficiales")
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) {
                    onResources(defaults)
                    return@addSnapshotListener
                }
                val custom = snapshot.documents.mapNotNull { document ->
                    val url = document.getString("link")?.takeIf(String::isNotBlank) ?: return@mapNotNull null
                    val title = document.getString("titulo")?.takeIf(String::isNotBlank) ?: "Material oficial"
                    OfficialMaterialResource(
                        id = document.id,
                        title = title,
                        description = document.getString("descripcion") ?: url,
                        url = url,
                        type = document.getString("type") ?: "tomo"
                    )
                }.sortedByDescending { it.id }
                onResources(custom + defaults)
            }
}
