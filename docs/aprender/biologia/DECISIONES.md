# DECISIONES.md — Biología (Decisiones Arquitectónicas Duraderas)

> Registro de decisiones técnicas tomadas durante la intervención. No es un diario: solo decisiones que afectan arquitectura, formato, ubicación o validación.

---

## 1. Formato de Contenido Nuevo

**Decisión**: Usar **JSON + Markdown** por lección (no un solo archivo gigante).

| Archivo | Formato | Razón |
|---------|---------|-------|
| `lesson.json` | JSON | Identidad + metadatos estructurados, parseable, validable |
| `theory.md` | Markdown | Teoría legible, versionable, renderizable directo en UI |
| `questions.json` | JSON | Preguntas estructuradas, validables individualmente |

**Alternativas descartadas**:
- Un solo `lesson.json` con teoría embebida → teoría ilegible en JSON, diffs gigantes
- Un solo archivo por materia → archivo gigante, conflictos de merge, carga completa innecesaria
- Base de datos SQLite / Room → complejidad innecesaria, no portable entre plataformas KMP

---

## 2. Ubicación del Contenido Nuevo

**Decisión**: `shared/src/commonMain/resources/aprender/{materia}/`

```
shared/src/commonMain/resources/
└── aprender/
    └── biologia/
        ├── manifest.json
        ├── semana08/
        │   ├── manifest.json
        │   ├── 8.1/
        │   │   ├── lesson.json
        │   │   ├── theory.md
        │   │   └── questions.json
        │   └── ...
        └── ...
```

**Razones**:
- `commonMain/resources` → accesible desde `commonMain` (KMP) y Android
- `resources` (no `assets`) → accesible vía `classloader.getResourceAsStream()` en KMP
- Estructura paralela a `data/catalog/` (Kotlin) pero **aislada** (contenido vs código)
- Fácil de empaquetar en JAR/AAR, accesible en runtime multiplataforma

**Alternativas descartadas**:
- `androidApp/src/main/assets/` → solo Android, no KMP
- `shared/src/commonMain/assets/` → no existe en KMP estándar
- Base de datos / Firebase → contenido académico estático no necesita DB

---

## 3. Granularidad de Contenido

**Decisión**: **Una lección = una carpeta con 3 archivos** (`lesson.json` + `theory.md` + `questions.json`)

| Granularidad | Decisión | Por qué |
|--------------|----------|---------|
| Teoría | **Un archivo `theory.md` por lección** (secciones `# 8.1.1`, `# 8.1.2`) | Un archivo por subsección (`8.1.1.md`, `8.1.2.md`) → 3-4 archivos extra por lección, over-engineering |
| Preguntas | **Un archivo `questions.json` por lección** (array de challenges) | Un archivo por pregunta (`q01.json`...) → cientos de archivos, gestión pesada |
| Subsecciones (`8.1.1`, `8.1.2`) | **Encabezados Markdown dentro de `theory.md`** (`# 8.1.1`, `## 8.1.2`) | No son `LessonNode` independientes; son secciones de teoría dentro de la lección |

> **Regla**: `LessonNode` = 1 lección = 1 carpeta = 3 archivos. No más, no menos.

---

## 4. Convención de IDs (Deterministas, Estables)

| Elemento | Patrón | Ejemplo |
|----------|--------|---------|
| Materia | `subjectId` | `biologia`, `fisica`, `quimica` |
| Lección | `{subject}_t{week}_s{subtopic}` | `bio_t08_s01`, `bio_t10_s03` |
| Teoría | `th_{lessonId}` | `th_bio_t08_s01` |
| Pregunta | `{lessonId}_c{num}` | `bio_t08_s01_c1`, `bio_t08_s01_c15` |
| Subtema (código) | `{week}.{num}` | `8.1`, `8.2`, `10.3` |
| Semana (manifiesto) | `semana{week:02d}` | `semana08`, `semana10` |

> **Regla**: NO usar `UUID.randomUUID()`, `System.currentTimeMillis()`, `Random.nextInt()` para contenido académico permanente. La identidad **DEBE** ser reproducible y estable entre builds.

---

## 5. Estrategia Legacy / Nuevo (Convivencia)

| Aspecto | Legacy (Semanas 1–7) | Nuevo (Semana 8+) |
|---------|----------------------|-------------------|
| **Origen** | `BiologiaPart1.kt` (Kotlin objects) | `resources/aprender/biologia/semana08/8.1/` |
| **Loader** | `LearningPathCatalog` → `AprenderRepository` | `JsonContentLoader` → `AprenderRepository` |
| **Modelos** | `LessonNode`, `Challenge` (mismos) | `LessonNode`, `Challenge` (mismos) |
| **Motor UI** | `LessonEngineScreen` (igual) | `LessonEngineScreen` (igual) |
| **Validación** | `CatalogValidator` (global) | `ContentIdentityValidator` + `CatalogValidator` |

> **Regla**: Mismo motor (`LessonEngineScreen`), mismos modelos (`LessonNode`, `Challenge`). Solo cambia el **origen de los datos**. NO crear `LessonNodeV2`, `LessonEngine2`, `AprenderRepository2`.

---

## 6. Estrategia Anti-Contaminación (Aislamiento)

| Nivel | Mecanismo |
|-------|-----------|
| **Materia** | `ContentIdentityValidator` valida `subjectId` en cada carga; `AcademicSanitizer` detecta STEM en humanidades |
| **Semana** | `WeekManifest` valida `week` en manifiesto vs ruta; `LessonNode.semana` debe coincidir |
| **Lección** | `LessonContent.lesson.id` debe coincidir con `lesson.json.id`; `Challenge.semana` debe = `week` |
| **Pregunta** | `Challenge.subject` = `subjectId`; `Challenge.semana` = `week`; ID determinista |

> **FAIL LOCAL**: Si validación falla en 8.1/questions → error localizado en 8.1. NO fallback a 8.2, NO contaminar Química.

---

## 7. Validación en Capas (Pipeline)

```
Carga contenido
    ↓
ContentIdentityValidator (identidad explícita, rutas, subject/week/subtopic)
    ↓
JsonContentLoader → LessonContent (LessonNode + theory.md + questions.json)
    ↓
ContentAcademicValidator (extiende AcademicSanitizer + validación académica)
    ↓
CatalogValidator (estructura: IDs, correctIndex, opciones, explicaciones, depth)
    ↓
LessonNode listo para LessonEngineScreen
```

> **Regla**: Si cualquier capa falla → **FAIL LOCAL** (error claro, ámbito acotado). NO fallback silencioso.

---

## 7. Source Lock para 8.1 (Registro Inmutable)

| Campo | Valor Fijado |
|-------|--------------|
| **SUBJECT** | `biologia` |
| **WEEK** | `8` |
| **SUBTOPIC** | `8.1` |
| **LESSON ID** | `bio_t08_s01` |
| **TITLE** | `Sistema Digestivo Humano` |
| **DEPTH** | `NORMAL` (objetivo 15 preguntas) |
| **SOURCE** | `TEMARIO_OFICIAL_UNSA.md §3.4.2` + `BiologiaPart2.kt` líneas 28–74 |
| **SOURCE FILES** | `theory.md` (desde Part2 líneas 33–53) + `questions.json` (1 existente + 14 nuevas) |

> **Inmutable**: Estos valores NO cambian durante la intervención. Si hay ambigüedad → detener y consultar.

---

## 8. Validación Académica Específica (Biología)

| Regla | Implementación |
|-------|----------------|
| No fórmulas físicas/matemáticas en biología | `AcademicSanitizer.hasUnrelatedStemContamination("biologia", questionText)` |
| Células parietales → Factor Intrínseco Castle → B12 → anemia perniciosa | Clave fija verificada en preguntas |
| Neumocitos Tipo II → surfactante → enfermedad membrana hialina | Clave fija |
| Neumocito I = hematosis; Tipo II = surfactante | Clave fija |
| CO₂ viaja mayormente como HCO₃⁻ | Clave fija |
| Factor intrínseco → absorción B12 en íleon terminal | Clave fija |
| Crossing-over = Paquinema (Paquiteno) | Clave fija |
| p53 = guardián del genoma → apoptosis si daño irreparable | Clave fija |

> **Regla**: NO inventar claves fijas. Solo usar las verificadas en `BiologiaPart1/2.kt` y `TEMARIO_OFICIAL_UNSA.md`.

---

## 9. Source Lock para 8.1 — Registro Inmutable

> **Este registro NO cambia durante la intervención.** Si hay ambigüedad → detener y consultar.

```
SUBJECT       = biologia
WEEK          = 8
SUBTOPIC      = 8.1
LESSON_ID     = bio_t08_s01
TITLE         = Sistema Digestivo Humano
DEPTH         = NORMAL (objetivo 15 preguntas)
SOURCE        = TEMARIO_OFICIAL_UNSA.md §3.4.2 + BiologiaPart2.kt líneas 28–74
THEORY_SOURCE = BiologiaPart2.kt líneas 33–53 (resumen completo)
QUESTIONS_SRC = 1 existente (bio_t08_s01_c1) + 14 nuevas a generar
```

---

## 10. Próximas Decisiones Pendientes (Post-Piloto)

| Tema | Decisión pendiente |
|------|-------------------|
| Migrar semanas 1–7 a nuevo formato | Solo si piloto demuestra superioridad |
| Formato `theory.md` vs `theory.json` | Markdown ganado por legibilidad |
| Soporte iOS (KMP) | `commonMain/resources` ya compatible |
| Tests de integración UI | Post-piloto |
| Migración Química/Física | Post-Biología completa |