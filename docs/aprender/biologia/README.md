# Biología — Módulo Aprender

> Materia: **Biología** (`subjectId: "biologia"`)  
> Área: **Ciencia y Tecnología** (Biomédicas: 9 preguntas / 35%)  
> Color: `#10B981` (Esmeralda)  
> Semanas: 10 (4 lecciones/semana = 40 lecciones)  
> Fuente canónica: `TEMARIO_OFICIAL_UNSA.md` (Sección D. Ciencia y Tecnología → Biología)

---

## Estado General

| Semana | Lecciones | Estado | Validación |
|--------|-----------|--------|------------|
| 1 | 1.1–1.4 | ✅ Legacy (Part1) | ✅ Validado (tests piloto) |
| 2 | 2.1–2.4 | ✅ Legacy (Part1) | ✅ Validado (bloque 1) |
| 3 | 3.1–3.4 | ✅ Legacy (Part1) | ✅ Validado (bloque 1) |
| 4 | 4.1–4.4 | ✅ Legacy (Part1) | ✅ Validado (bloque 1) |
| 5 | 5.1–5.4 | ✅ Legacy (Part1) | ✅ Validado (bloque 1 implícito) |
| 6 | 6.1–6.4 | ✅ Legacy (Part1) | ⏳ Pendiente validar |
| 7 | 7.1–7.4 | ✅ Legacy (Part1) | ⏳ Pendiente validar |
| **8** | **8.1–8.4** | **🔄 Piloto 8.1 en curso** | **⏳ En validación** |
| 9 | 9.1–9.4 | ✅ Legacy (Part2) | ⏳ Pendiente validar |
| 10 | 10.1–10.4 | ✅ Legacy (Part2) | ⏳ Pendiente validar |
| 11 | 11.1–11.4 | ✅ Legacy (Part2) | ⏳ Pendiente validar |
| 12 | 12.1–12.4 | ✅ Legacy (Part2) | ⏳ Pendiente validar |
| 13 | 13.1–13.4 | ✅ Legacy (Part2) | ⏳ Pendiente validar |

> **Leyenda**: ✅ Completo/Validado | 🔄 En curso | ⏳ Pendiente | ❌ No iniciado

---

## Semanas 1–7 (Legacy - BiologiaPart1.kt)

Ya implementadas y validadas (tests `CatalogPilotValidationTest`):

| Semana | Tema | Lecciones (IDs) | Depths | Preguntas totales |
|--------|------|-----------------|--------|-------------------|
| 1 | Biología y Método Científico | `bio_t01_s01` a `bio_t01_s04` | NORMAL, NORMAL, SIMPLE, EXTENSIVE | 14+13+7+19 = 53 |
| 2 | Seres Vivos, Características | `bio_t02_s01` a `bio_t02_s04` | NORMAL, SIMPLE, NORMAL, NORMAL | 13+8+12+14 = 47 |
| 3 | Base Química: Bioelementos | `bio_t03_s01` a `bio_t03_s04` | NORMAL, SIMPLE, NORMAL, NORMAL | 13+8+13+12 = 46 |
| 4 | Biomoléculas Orgánicas | `bio_t04_s01` a `bio_t04_s04` | NORMAL, NORMAL, NORMAL, EXTENSIVE | 14+13+19+19 = 65 |
| 5 | Citología | `bio_t05_s01` a `bio_t05_s04` | (pendiente detallar) | — |
| 6 | Fisiología Celular | `bio_t06_s01` a `bio_t06_s04` | (pendiente detallar) | — |
| 7 | Histología | `bio_t07_s01` a `bio_t07_s04` | (pendiente detallar) | — |

> **Total Part1**: 28 lecciones, ~500+ preguntas, **validación 100% limpia** (0 errores, 0 warnings en tests).

---

## Semana 8: Fisiología Humana I (Piloto 8.1)

**Ubicación actual**: `BiologiaPart2.kt` líneas 22–229 (4 lecciones: `bio_t08_s01` a `bio_t08_s04`)

| Lección | ID | Título | Subtema actual | Depth | Preguntas | Estado |
|---------|----|--------|----------------|-------|-----------|--------|
| 8.1 | `bio_t08_s01` | Sistema Digestivo Humano | "Semana 8" | (implícito) | 1 | 🔄 **Piloto** |
| 8.2 | `bio_t08_s02` | Sistema Respiratorio | "Semana 8" | (implícito) | 1 | ⏳ |
| 8.3 | `bio_t08_s03` | Sistema Cardiovascular | "Semana 8" | (implícito) | 1 | ⏳ |
| 8.4 | `bio_t08_s04` | Sangre e Inmunidad | "Semana 8" | (implícito) | 1 | ⏳ |

> **Problema detectado**: Subtema genérico "Semana 8" en las 4 lecciones. Debe ser `8.1`, `8.2`, `8.3`, `8.4` respectivamente.

### 8.1 — Sistema Digestivo Humano (Piloto)

| Campo | Valor |
|---------|-------|
| **ID** | `bio_t08_s01` |
| **SubjectId** | `biologia` |
| **Week** | 8 |
| **Subtopic** | `8.1` (corregir desde "Semana 8") |
| **Title** | "Sistema Digestivo Humano" |
| **Depth** | `NORMAL` (objetivo ~15 preguntas) |
| **Fuente** | `TEMARIO_OFICIAL_UNSA.md` §3.4.2 (Biología: 5 preg en Ingenierías, 9 en Biomédicas, 3 en Sociales) |
| **Fuente académica real** | `BiologiaPart2.kt` líneas 28–74 (teoría completa + 1 challenge) |

#### Teoría (resumen actual)
- Digestión mecánica + química: ptialina, pepsina, tripsina, lipasa pancreática
- Estómago: células parietales (HCl + Factor Intrínseco Castle), células principales (pepsinógeno), células G (gastrina)
- Intestino delgado: bilis (emulsión), jugo pancreático (tripsina, quimotripsina, amilasa, lipasa), absorción vellosidades
- Intestino grueso: agua, electrolitos, vitaminas K/B12 por microbiota

#### Preguntas actuales (1 sola)
| ID | Enunciado | Concepto | Estado |
|----|-----------|----------|--------|
| `bio_t08_s01_c1` | Paciente gastrectomizado → anemia perniciosa → ¿qué secreción perdió? | Factor intrínseco Castle | ✅ Válida |

#### Preguntas FALTANTES (objetivo NORMAL ~15)
Necesarias para completar 8.1:
- Células gástricas (parietales, principales, G)
- Enzimas digestivas (ptialina, pepsina, tripsina, lipasa)
- Bilis: emulsión vs enzimas
- Absorción: vellosidades, vena porta vs vaso quilífero
- Intestino grueso: agua, vitaminas K/B12, microbiota
- Anemia perniciosa + factor intrínseco (ya existe)

---

## Semanas 9–13 (Legacy - BiologiaPart2.kt)

Ya implementadas en `BiologiaPart2.kt` (líneas 230+):

| Semana | Tema | Lecciones (IDs) |
|--------|------|-----------------|
| 9 | Fisiología II: Excretor, Nervioso, Endocrino | `bio_t09_s01` a `bio_t09_s04` |
| 10 | Reproducción Celular y Gametogénesis | `bio_t10_s01` a `bio_t10_s04` |
| 11 | Genética Mendeliana, Ligamiento, Mutaciones | `bio_t11_s01` a `bio_t11_s04` |
| 12 | Origen de la Vida, Evolución, Taxonomía | `bio_t12_s01` a `bio_t12_s04` |
| 13 | Ecología, Ecosistemas, Contaminación | `bio_t13_s01` a `bio_t13_s04` |

> **Nota**: Estas 20 lecciones (semanas 9–13) existen en `BiologiaPart2.kt` pero **no han sido validadas** con `CatalogValidator`. Pendientes para post-piloto.

---

## Fuente Académica Canónica

| Documento | Sección | Qué define |
|-----------|---------|------------|
| `TEMARIO_OFICIAL_UNSA.md` | Sección D (Ciencia y Tecnología) → Biología | Distribución de preguntas por área (Ingenierías 5, Biomédicas 9, Sociales 3) + temario detallado |
| `BiologiaPart1.kt` | Semanas 1–7 | 28 lecciones con teoría + preguntas (validado) |
| `BiologiaPart2.kt` | Semanas 8–13 | 24 lecciones (8.1–8.4 solo 1 pregunta cada una) |

> **Regla**: NO inventar contenido. TODO deriva de `TEMARIO_OFICIAL_UNSA.md` y los catálogos existentes. Si hay ambigüedad, **detenerse y consultar**.

---

## Validación Académica (Biología)

| Regla | Herramienta |
|-------|-------------|
| No fórmulas físicas/matemáticas en preguntas de biología | `AcademicSanitizer.hasUnrelatedStemContamination("biologia", ...)` |
| IDs deterministas: `bio_t{week}_s{subtopic}` / `bio_t{week}_s{subtopic}_c{num}` | Convención + `CatalogValidator` |
| `correctIndex` en rango, opciones 4–5, explicación obligatoria | `CatalogValidator` |
| Sin contaminación entre materias (ej. Química en Biología) | `AcademicSanitizer` + `ContentIdentityValidator` |
| `LessonDepth` coherente con `challenges.size` | `CatalogValidator` |

---

## Próximos Hitos (Checklist Global)

Ver `docs/aprender/biologia/CHECKLIST.md` para estado granular por lección.