# CHECKLIST — Biología (Estado Real Comprobado)

> **Regla**: Marca `[x]` **solo cuando realmente lo comprobaste**. No copies ejemplos automáticamente.

---

## Semanas 1–7 (Legacy - BiologiaPart1.kt) — VALIDADAS ✅

### Semana 1: La Biología y el Método Científico
| Lección | ID | Identidad verificada | Fuente académica | Teoría | Preguntas | Validación estructural | Validación académica |
|---------|----|----------------------|------------------|--------|-----------|------------------------|----------------------|
| 1.1 | `bio_t01_s01` | ✅ | TEMARIO §1.1 + Part1 | ✅ Completa | 14 | ✅ CatalogValidator | ✅ AcademicSanitizer |
| 1.2 | `bio_t01_s02` | ✅ | TEMARIO §1.2 + Part1 | ✅ Completa | 13 | ✅ | ✅ |
| 1.3 | `bio_t01_s03` | ✅ | TEMARIO §1.3 + Part1 | ✅ Completa | 7 | ✅ | ✅ |
| 1.4 | `bio_t01_s04` | ✅ | TEMARIO §1.4 + Part1 | ✅ Completa | 19 | ✅ | ✅ |

### Semana 2: Seres Vivos, Características
| Lección | ID | Identidad | Fuente | Teoría | Preguntas | Validación |
|---------|----|-----------|--------|--------|-----------|------------|
| 2.1 | `bio_t02_s01` | ✅ | Part1 | ✅ | 13 | ✅ Bloque 1 |
| 2.2 | `bio_t02_s02` | ✅ | Part1 | ✅ | 8 | ✅ |
| 2.3 | `bio_t02_s03` | ✅ | Part1 | ✅ | 12 | ✅ |
| 2.4 | `bio_t02_s04` | ✅ | Part1 | ✅ | 14 | ✅ |

### Semana 3: Base Química (Bioelementos)
| Lección | ID | Identidad | Fuente | Teoría | Preguntas | Validación |
|---------|----|-----------|--------|--------|-----------|------------|
| 3.1 | `bio_t03_s01` | ✅ | Part1 | ✅ | 13 | ✅ Bloque 1 |
| 3.2 | `bio_t03_s02` | ✅ | Part1 | ✅ | 8 | ✅ |
| 3.3 | `bio_t03_s03` | ✅ | Part1 | ✅ | 13 | ✅ |
| 3.4 | `bio_t03_s04` | ✅ | Part1 | ✅ | 12 | ✅ |

### Semana 4: Biomoléculas Orgánicas
| Lección | ID | Identidad | Fuente | Teoría | Preguntas | Validación |
|---------|----|-----------|--------|--------|-----------|------------|
| 4.1 | `bio_t04_s01` | ✅ | Part1 | ✅ | 14 | ✅ Bloque 1 |
| 4.2 | `bio_t04_s02` | ✅ | Part1 | ✅ | 13 | ✅ |
| 4.4 | `bio_t04_s04` | ✅ | Part1 | ✅ | 19 | ✅ |

### Semanas 5–7 (Validación pendiente detallada)
| Semana | Tema | Lecciones | Validación global |
|--------|------|-----------|-------------------|
| 5 | Citología | `bio_t05_s01`–`bio_t05_s04` | ⏳ Pendiente validar con CatalogValidator |
| 6 | Fisiología Celular | `bio_t06_s01`–`bio_t06_s04` | ⏳ Pendiente |
| 7 | Histología | `bio_t07_s01`–`bio_t07_s04` | ⏳ Pendiente |

> **Nota**: Tests `CatalogPilotValidationTest` validan explícitamente Bloque 1 (Semanas 1–4 = 12 lecciones, 158 preguntas). Semanas 5–7 requieren ejecución de validación completa.

---

## Semana 8: Fisiología Humana I (PILOTO 8.1)

### 8.1 — Sistema Digestivo Humano ← **EN CURSO**
| Ítem | Estado | Evidencia / Nota |
|------|--------|------------------|
| **Identidad verificada** | ✅ | `subjectId=biologia`, `week=8`, `subtopic=8.1`, `lessonId=bio_t08_s01` |
| **Fuente académica localizada** | ✅ | `BiologiaPart2.kt` líneas 28–74 + `TEMARIO_OFICIAL_UNSA.md` §3.4.2 |
| **Teoría completa** | ✅ | Digestión mecánica/química, estómago, intestino delgado/grueso, bioseguridad |
| **Preguntas** | ⚠️ **1/15** | Solo 1 challenge (`bio_t08_s01_c1`). Objetivo NORMAL ~15. **Faltan ~14** |
| **Identidad en preguntas** | ⚠️ | Subtema actual "Semana 8" → debe ser "8.1" en lesson.subtema y challenge.semana=8 |
| **IDs deterministas** | ✅ | `bio_t08_s01_c1` (prefijo correcto) |
| **Validación estructural** | ⏳ | Pendiente ejecutar CatalogValidator sobre 8.1 aislada |
| **Validación académica** | ⚠️ | AcademicSanitizer OK (biología no contaminada), pero faltan preguntas |
| **LessonDepth** | ⚠️ | Depth no explícito en código actual → debe ser `NORMAL` (objetivo 15) |
| **Subtema correcto** | ❌ | Código actual tiene `subtema = "Semana 8"` → debe ser `"8.1"` |

#### Acciones requeridas para 8.1
- [ ] Crear estructura de archivos nuevo loader (`aprender/biologia/semana08/8.1/`)
- [ ] Corregir `subtema` a `"8.1"` en lesson.json
- [ ] Generar ~14 preguntas adicionales basadas en teoría existente
- [ ] Asignar `depth: NORMAL` explícito
- [ ] Ejecutar `CatalogValidator` + `AcademicSanitizer` sobre 8.1 aislada
- [ ] Marcar `[x]` aquí cuando todo pase

### 8.2 — Sistema Respiratorio
| Ítem | Estado |
|------|--------|
| Identidad | ⏳ Pendiente (`bio_t08_s02`, `subtopic=8.2`) |
| Teoría | ✅ Existe en Part2 (líneas 76–126) |
| Preguntas | ⚠️ Solo 1 challenge (`bio_t08_s02_c1`) |
| Validación | ⏳ Post-8.1 |

### 8.3 — Sistema Cardiovascular
| Ítem | Estado |
|------|--------|
| Identidad | ⏳ Pendiente (`bio_t08_s03`, `subtopic=8.3`) |
| Teoría | ✅ Existe en Part2 |
| Preguntas | ⚠️ Solo 1 challenge |
| Validación | ⏳ Post-8.1 |

### 8.4 — Sangre e Inmunidad
| Ítem | Estado |
|------|--------|
| Identidad | ⏳ Pendiente (`bio_t08_s04`, `subtopic=8.4`) |
| Teoría | ✅ Existe en Part2 |
| Preguntas | ⚠️ Solo 1 challenge |
| Validación | ⏳ Post-8.1 |

---

## Semanas 9–13 (Pendientes de Validación)

| Semana | Tema | Lecciones | Validación |
|--------|------|-----------|------------|
| 9 | Fisiología II (Excretor, Nervioso, Endocrino) | 9.1–9.4 | ⏳ Post-piloto |
| 10 | Reproducción Celular y Gametogénesis | 10.1–10.4 | ⏳ |
| 11 | Genética Mendeliana | 11.1–11.4 | ⏳ |
| 12 | Evolución y Taxonomía | 12.1–12.4 | ⏳ |
| 13 | Ecología | 13.1–13.4 | ⏳ |

> **Total Biología**: 40 lecciones (28 Part1 + 12 Part2) | ~800+ preguntas

---

## Resumen de Validación Global

| Métrica | Valor | Estado |
|---------|-------|--------|
| Total lecciones Biología | 40 | 28 validadas / 12 pendientes |
| Preguntas totales estimadas | ~800+ | ~500 validadas / ~300 pendientes |
| CatalogValidator (Semanas 1-4) | 0 errores, 0 warnings | ✅ |
| AcademicSanitizer (Biología) | Sin contaminación | ✅ |
| IDs deterministas | Convención respetada | ✅ |
| Semanas 5-7 validadas | No | ⏳ |
| Semanas 8-13 validadas | No | ⏳ |
| **Piloto 8.1 completo** | **En progreso** | 🔄 |

---

## Próximas Acciones (Prioridad)

1. [ ] **Corregir subtema 8.1** → `"8.1"` (no "Semana 8")
2. [ ] **Crear estructura archivos** `aprender/biologia/semana08/8.1/`
3. [ ] **Generar 14 preguntas** para completar 8.1 (~15 total)
4. [ ] **Asignar `depth: NORMAL`** explícito
5. [ ] **Ejecutar validación** aislada 8.1 (CatalogValidator + AcademicSanitizer)
6. [ ] **Marcar `[x]`** en esta checklist cuando 8.1 pase todo
7. [ ] Replicar para 8.2, 8.3, 8.4
8. [ ] Validar semanas 5–7 (legacy)
9. [ ] Validar semanas 9–13