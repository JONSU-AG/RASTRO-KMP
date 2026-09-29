# Aprender — Documentación del Módulo

> Módulo de aprendizaje estructurado por 15 materias, 10 semanas cada una, 4 lecciones por semana (520 lecciones totales).

---

## Qué es Aprender

Aprender es el motor educativo central de RASTRO. Ofrece:
- **15 materias** oficiales UNSA/CEPRUNSA
- **10 semanas** por materia (4 lecciones/semana = 40 lecciones/materia)
- **Progresión**: lecciones bloqueadas → desbloqueadas → completadas → maestría (estrellas)
- **Motor interactivo** (`LessonEngineScreen`): teoría GoodNotes → retos (opción múltiple, emparejar, completar) → modo Fénix (redención) → victoria con estrellas
- **Racha diaria** + **XP** + **Vidas (200)** sincronizados con `GamificationManager`

---

## Arquitectura General

```
shared/commonMain/kotlin/com/jonsuapps/rastro/
├── model/AprenderModels.kt          # LessonNode, LessonTheory, Challenge, LessonDepth, SubtemaCode
├── data/
│   ├── AprenderRepository.kt        # Fachada: subjects, getLessonsForSubject, getLessonById
│   ├── LearningPathCatalog.kt       # Índice plano de todas las LessonNode (agrega catálogos por materia)
│   ├── validation/CatalogValidator.kt   # Validación estructural + pedagógica
│   ├── validation/CatalogValidator.kt   # Validador académico (anti-contaminación)
│   └── catalog/                     # 15 catálogos por materia (BiologiaCatalog, QuimicaCatalog, etc.)
│       ├── BiologiaCatalog.kt       # Wrapper: Part1 + Part2
│       ├── BiologiaPart1.kt         # Semanas 1-7 (28 lecciones)
│       └── BiologiaPart2.kt         # Semanas 8-13 (24 lecciones)
```

---

## Flujo de Datos

```
AprenderScreen
    → AprenderRepository.getLessonsForSubject("biologia")
        → LearningPathCatalog.forSubject("biologia")
            → BiologiaCatalog.lessons (Part1 + Part2)
                → LessonNode { teoria, challenges, depth, ... }
                    → LessonEngineScreen (LessonNode)
                        → LessonContentRenderer (teoría)
                        → ChallengeQuestionView (retos)
```

---

## Modelos Clave

### `LessonNode` (identidad + contenido)
```kotlin
data class LessonNode(
    val id: String,                    // "bio_t08_s01"  ← ID determinista, estable
    val subjectId: String,             // "biologia"      ← identidad explícita
    val semana: Int,                   // 8                ← semana canónica
    val subtema: String,               // "Semana 8"       ← código de subtema
    val title: String,                 // "Sistema Digestivo Humano"
    val theory: LessonTheory,          # teoría completa
    val challenges: List<Challenge>,   # retos interactivos
    val depth: LessonDepth = NORMAL,   # SIMPLE(7) | NORMAL(15) | EXTENSIVE(20)
    val learningObjectives: List<String>,
    val isLocked: Boolean,
    val isCompleted: Boolean,
    val stars: Int,
    val isCurrent: Boolean
)
```

### `LessonTheory` (contenido académico)
```kotlin
data class LessonTheory(
    val id: String,
    val asignatura: String,
    val semana: Int,
    val titulo: String,
    val resumen: String,              // Teoría completa en Markdown simple
    val conceptosClave: List<String>,
    val fechasYPersonajes: List<String>,
    val hechosRelevantes: List<String>,
    val formulas: List<String>,
    val clavesFijas: List<String>,
    val advertenciasErroresComunes: List<String>,
    val admissionTip: String?,        // Tip para examen
    val admissionExplanation: String?
)
```

### `Challenge` (reto interactivo)
```kotlin
data class Challenge(
    val id: String,                   // "bio_t08_s01_c1"  ← ID determinista
    val type: ChallengeType = MULTIPLE_CHOICE,
    val statement: String,            // Enunciado
    val options: List<String>,        // A–E (4-5 opciones)
    val correctIndex: Int,            // Índice correcto
    val explanation: String,          // Explicación pedagógica obligatoria
    val subject: String = "",         // "biologia" (identidad explícita)
    val semana: Int = 1,              // 8 (validación de aislamiento)
    val correctText: String?,         // Para FILL_BLANK
    val pedagogicalTier: String?,     // "concepto" | "aplicación" | "análisis"
    val fuente: String?               // "banco" | "generado" | "temario"
)
```

---

## Catálogos Existentes (Legacy: Semanas 1–7)

| Archivo | Materia | Semanas | Lecciones | Estado |
|---------|---------|---------|-----------|--------|
| `BiologiaPart1.kt` | Biología | 1–7 | 28 | ✅ Completo, validado |
| `BiologiaPart2.kt` | Biología | 8–13 | 24 | ✅ Existe (incluye 8.1–8.4) |
| `QuimicaCatalog.kt` (+Part1/2) | Química | 1–13 | 52 | ✅ |
| `FisicaCatalog.kt` | Física | 1–13 | 52 | ✅ |
| ... | ... | ... | ... | ✅ |

> **Nota**: Semanas 1–7 son **LEGACY** — funcionan con arquitectura actual (`LessonNode` incrustado en Kotlin). NO migrarlas en esta intervención.

---

## Validación Existente

| Validador | Ubicación | Qué hace |
|-----------|-----------|----------|
| `CatalogValidator` | `shared/.../validation/CatalogValidator.kt` | IDs duplicados, subtemas duplicados, teoría vacía, challenges vacíos, depth vs count, preguntas duplicadas, opciones vacías/duplicadas, correctIndex fuera de rango, explicaciones vacías |
| `AcademicSanitizer` | `shared/.../utils/AcademicSanitizer.kt` | Detecta contaminación STEM en humanidades (fórmulas SI, newton, joule en literatura/historia) |
| `CatalogPilotValidationTest` | `shared/.../test/CatalogPilotValidationTest.kt` | Tests piloto para Biología Semana 1 (4 lecciones) y Bloque 1 (semanas 2-4) |

---

## Convenciones de IDs

| Elemento | Formato | Ejemplo |
|----------|---------|---------|
| Materia | `subjectId` | `biologia`, `fisica`, `quimica` |
| Lección | `bio_t{week}_s{subtopic}` | `bio_t08_s01`, `bio_t01_s01` |
| Teoría | `th_{lessonId}` | `th_bio_t08_s01` |
| Challenge | `{lessonId}_c{num}` | `bio_t08_s01_c1` |
| Subtema (legacy) | `"{week}.{num}"` | `1.1`, `1.2`, `8.1` |

> **Regla**: IDs son **deterministas, estables, únicos**. NO usar `UUID.randomUUID()`, timestamps, ni aleatorios para contenido académico permanente.

---

## Convivencia Legacy / Nuevo

| Arquitectura | Semanas | Formato | Loader |
|--------------|---------|---------|--------|
| **Legacy** | 1–7 | `LessonNode` en Kotlin (`BiologiaPart1.kt`) | `LearningPathCatalog` → `AprenderRepository` |
| **Nuevo** | 8+ | Archivos aislados (JSON/MD) por lección | **Nuevo `ContentLoader`** (ver ARQUITECTURA.md) |

> **Regla**: Mismo motor (`LessonEngineScreen`), mismos modelos (`LessonNode`, `Challenge`). Solo cambia el **origen de los datos**.

---

## Próximos Pasos

Ver `docs/aprender/ARQUITECTURA.md` para el diseño del nuevo loader y `docs/aprender/biologia/` para el piloto 8.1.