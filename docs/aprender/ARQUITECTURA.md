# Arquitectura de Aprender — Cómo se Conectan las Piezas

> Diseño para contenido académico **reparable por piezas** (materia → semana → lección → teoría/preguntas).

---

## Principio Rectores

| Principio | Qué significa |
|-----------|---------------|
| **Estructura Compartida** | Modelos, loader, validadores, motor UI son comunes |
| **Contenido Aislado** | Cada lección es un archivo/carpeta independiente |
| **Errores Locales** | Fallo en 8.1/questions no contamina 8.2 ni Química |
| **Reparaciones Locales** | Reparas `questions.json` de 8.1 sin tocar teoría ni 8.2 |
| **Convivencia Legacy** | Semanas 1–7 siguen en Kotlin; 8+ usan nuevo loader |

---

## Granularidad Deseada (Modelo Conceptual)

```
aprender/
└── biologia/
    ├── manifest.json                 # Metadatos de la materia
    │
    ├── semana08/
    │   ├── manifest.json
    │   │
    │   ├── 8.1/
    │   │   ├── lesson.json           # Identidad + metadatos
    │   │   ├── theory.md             # Teoría completa (Markdown)
    │   │   └── questions.json        # Preguntas (array de objetos)
    │   │
    │   ├── 8.2/
    │   ├── 8.3/
    │   └── 8.4/
    │
    ├── semana09/
    └── ...
```

### Definición de Archivos

| Archivo | Contenido | Frecuencia de cambio |
|---------|-----------|----------------------|
| `manifest.json` (materia) | `subjectId`, `name`, `area`, `colorHex`, `weeks: 10`, `source: "TEMARIO_OFICIAL_UNSA.md"` | Raro |
| `manifest.json` (semana) | `week`, `title`, `lessons: ["8.1","8.2","8.3","8.4"]` | Raro |
| `lesson.json` | `id`, `subjectId`, `week`, `subtopic`, `title`, `depth`, `source`, `learningObjectives` | Medio |
| `theory.md` | Markdown completo con `# 8.1.1`, `# 8.1.2`, etc. | Medio |
| `questions.json` | Array de `Challenge` (id, statement, options, correctIndex, explanation, concept) | Alto |

---

## Identidad Explícita (Obligatoria)

Cada lección **DEBE** declarar explícitamente:

```json
{
  "subjectId": "biologia",
  "week": 8,
  "subtopic": "8.1",
  "lessonId": "bio_t08_s01",
  "title": "Sistema Digestivo Humano",
  "depth": "NORMAL",
  "source": "TEMARIO_OFICIAL_UNSA.md §3.4.2"
}
```

> **NUNCA** inferir materia/semana/lección por posición, índice, orden o archivo anterior.

---

## Loader Mínimo (`ContentLoader`)

### Responsabilidades
1. Cargar `manifest.json` de materia → validar estructura
2. Cargar `manifest.json` de semana → validar lecciones declaradas
3. Para cada lección: cargar `lesson.json` + `theory.md` + `questions.json`
4. **Validar identidad** (subjectId, week, subtopic coinciden con ruta)
5. Convertir a `LessonNode` existente (compatibilidad total con `LessonEngineScreen`)
4. Fallar **localmente** si algo no coincide (no fallback global)

### Interfaz (Kotlin)

```kotlin
interface ContentLoader {
    fun loadSubjectManifest(subjectId: String): SubjectManifest
    fun loadWeekManifest(subjectId: String, week: Int): WeekManifest
    fun loadLesson(subjectId: String, week: Int, subtopic: String): LessonContent
}

data class LessonContent(
    val lesson: LessonNode,           // Convertido a modelo existente
    val theoryMarkdown: String,       // Contenido crudo de theory.md
    val questionsJson: String         // Crudo de questions.json (para auditoría)
)
```

### Ubicación Técnica

```
shared/commonMain/kotlin/com/jonsuapps/rastro/data/content/
├── ContentLoader.kt                 // Interfaz
├── JsonContentLoader.kt             // Implementación JSON/MD
├── LessonContent.kt                 // Data class de salida
├── SubjectManifest.kt
├── WeekManifest.kt
└── validation/
    ├── ContentIdentityValidator.kt  // Valida subject/week/subtopic
    └── ContentAcademicValidator.kt  // Extiende AcademicSanitizer
```

---

## Convivencia Legacy / Nuevo

| | Legacy (Semanas 1–7) | Nuevo (Semana 8+) |
|--------------|----------------------|-------------------|
| **Origen** | `BiologiaPart1.kt` (Kotlin objects) | `aprender/biologia/semana08/8.1/` (JSON/MD) |
| **Loader** | `LearningPathCatalog` → `AprenderRepository` | `JsonContentLoader` → `AprenderRepository` |
| **Modelos** | `LessonNode`, `Challenge` (mismos) | `LessonNode`, `Challenge` (mismos) |
| **Motor UI** | `LessonEngineScreen` (igual) | `LessonEngineScreen` (igual) |
| **Validación** | `CatalogValidator` (global) | `ContentIdentityValidator` + `CatalogValidator` |

### Integración en `AprenderRepository`

```kotlin
object AprenderRepository {
    private val legacyCatalog = LearningPathCatalog
    private val contentLoader = JsonContentLoader()  // Nuevo
    
    fun getLessonsForSubject(subjectId: String): List<LessonNode> {
        val legacy = legacyCatalog.forSubject(subjectId)
        val nuevo = if (subjectId == "biologia") contentLoader.loadSubject(subjectId) else emptyList()
        return (legacy + nuevo).distinctBy { it.id }.sortedBy { it.semana }.withSubtemaIndex()
    }
}
```

> **Regla**: Mismo motor (`LessonEngineScreen`), mismos modelos (`LessonNode`, `Challenge`). Solo cambia el **origen de los datos**.

---

## Validación en Capas

| Capa | Qué valida | Dónde |
|------|------------|-------|
| **Identidad** | `subjectId`, `week`, `subtopic` coinciden con ruta; no hay cruce entre materias | `ContentIdentityValidator` (nuevo) |
| **Académica** | Sin contaminación STEM en humanidades; IDs deterministas; `correctIndex` válido | Extiende `AcademicSanitizer` + `CatalogValidator` |
| **Estructural** | IDs únicos, `correctIndex` en rango, opciones ≥2, explicaciones no vacías | `CatalogValidator` (existente) |
| **Pedagógica** | `depth` vs `challengeCount`, teoría ≥80 chars, explicaciones no vacías | `CatalogValidator` (existente) |

> **Regla**: Si `Biología 8.1 / questions` está corrupto → **FAIL LOCAL** (error claro en 8.1). NO fallback a 8.2, NO contaminar Química.

---

## Convención de Archivos (Ejemplo 8.1)

```
aprender/biologia/
├── manifest.json
├── semana08/
│   ├── manifest.json
│   ├── 8.1/
│   │   ├── lesson.json
│   │   ├── theory.md
│   │   └── questions.json
│   ├── 8.2/ ...
│   ├── 8.3/ ...
│   └── 8.4/ ...
├── semana09/ ...
└── semana13/ ...
```

### `lesson.json` (8.1)
```json
{
  "id": "bio_t08_s01",
  "subjectId": "biologia",
  "week": 8,
  "subtopic": "8.1",
  "title": "Sistema Digestivo Humano",
  "depth": "NORMAL",
  "source": "TEMARIO_OFICIAL_UNSA.md §3.4.2",
  "learningObjectives": [
    "Identificar células parietales y su relación con anemia perniciosa",
    "Describir digestión enzimática: ptialina, pepsina, tripsina, lipasa pancreática",
    "Explicar absorción: vellosidades, vena porta, vaso quilífero"
  ]
}
```

### `questions.json` (8.1)
```json
[
  {
    "id": "bio_t08_s01_c1",
    "type": "MULTIPLE_CHOICE",
    "statement": "A un paciente gastrectomizado se le extirpa el cuerpo y fondo del estómago. Para evitar anemia perniciosa por déficit de absorción de vitamina B12 en el íleon, se le debe administrar de por vida la vitamina inyectable. ¿Qué secreción de las células parietales gástricas se ha perdido?",
    "options": [
      "Pepsinógeno activado",
      "Factor intrínseco de Castle",
      "Gastrina estimulante",
      "Secretina duodenal",
      "Amilasa pancreática"
    ],
    "correctIndex": 1,
    "explanation": "Las células parietales u oxínticas del estómago producen ácido clorhídrico y el factor intrínseco de Castle, glicoproteína imprescindible para que la vitamina B₁₂ se absorba en el íleon terminal.",
    "concept": "8.1.2",
    "pedagogicalTier": "aplicación",
    "fuente": "temario"
  }
]
```

---

## Validación de Integridad (Checklist Técnico)

| Check | Herramienta | Cuándo |
|-------|-------------|--------|
| IDs deterministas, únicos | `CatalogValidator` (DUPLICATE_LESSON_ID, DUPLICATE_CHALLENGE_ID) | Cada commit |
| `subjectId`/`week`/`subtopic` coinciden con ruta | `ContentIdentityValidator` | Carga + test |
| `correctIndex` en rango, opciones ≥2, explicación no vacía | `CatalogValidator` | Cada commit |
| Sin contaminación STEM en humanidades | `AcademicSanitizer` | Cada commit |
| `depth` vs `challengeCount` coherente | `CatalogValidator` | Cada commit |
| IDs deterministas (no UUID aleatorio) | Convención + test | Cada commit |
| `subjectId` explícito en cada pregunta | `ContentIdentityValidator` | Carga |

---

## Escalado Futuro (Post-Piloto)

Cuando 8.1 esté validado:
1. Replicar estructura para 8.2, 8.3, 8.4
2. Semana 9, 10, ..., 13
3. Replicar para Química, Física, etc. (misma estructura, distinta carpeta)
4. Migrar Semanas 1–7 **solo si** el piloto demuestra superioridad comprobada

> **Regla**: No escalar hasta que 8.1 pase validación completa y revisión de usuario.

---

## Resumen de Archivos a Crear (Fase 4)

| Archivo | Qué hace |
|---------|----------|
| `shared/.../data/content/ContentLoader.kt` | Interfaz |
| `shared/.../data/content/JsonContentLoader.kt` | Implementación |
| `shared/.../data/content/LessonContent.kt` | Data class salida |
| `shared/.../data/content/SubjectManifest.kt` | Manifiesto materia |
| `shared/.../data/content/WeekManifest.kt` | Manifiesto semana |
| `shared/.../data/content/validation/ContentIdentityValidator.kt` | Valida identidad |
| `shared/.../data/content/validation/ContentAcademicValidator.kt` | Extiende AcademicSanitizer |
| `shared/.../data/content/loader/LessonLoader.kt` | Convierte JSON/MD → LessonNode |

> **Regla**: NO crear `LessonNodeV2`, `ChallengeV2`, `LessonEngine2`, `AprenderRepository2`, `JSONManager2`. Extender arquitectura actual mínimamente.