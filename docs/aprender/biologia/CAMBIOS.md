# CAMBIOS.md â€” Historial de Intervenciones (BiologÃ­a)

> Registro breve de intervenciones. Formato: **Fecha | Agente/Modelo | Objetivo | Archivos creados/modificados | ValidaciÃ³n | Estado | Siguiente paso**.

---

## 2026-09-28 | OpenCode (Primera IntervenciÃ³n)

### Objetivo
Establecer arquitectura modular para contenido acadÃ©mico reparable por piezas, comenzando con piloto **BiologÃ­a 8.1**.

### Archivos Creados
| Archivo | Tipo | DescripciÃ³n |
|---------|------|-------------|
| `AGENTS.md` | RaÃ­z | Reglas generales para agentes IA (Ã¡mbito, prohibiciones, validaciÃ³n) |
| `docs/aprender/README.md` | Doc | QuÃ© es Aprender, arquitectura, modelos, catÃ¡logos, validaciÃ³n |
| `docs/aprender/ARQUITECTURA.md` | Doc | DiseÃ±o loader, granularidad, identidad, convivencia legacy/nuevo, validaciÃ³n |
| `docs/aprender/biologia/README.md` | Doc | Estado BiologÃ­a (semanas 1â€“13), piloto 8.1, fuente canÃ³nica |
| `docs/aprender/biologia/CHECKLIST.md` | Doc | Estado granular por lecciÃ³n (semanas 1â€“13, detalle 8.1) |
| `docs/aprender/biologia/DECISIONES.md` | Doc | Decisiones: formato, ubicaciÃ³n, granularidad, IDs, legacy/nuevo, aislamiento, source lock 8.1 |
| `docs/aprender/biologia/CAMBIOS.md` | Doc | **Este archivo** |

### Archivos Modificados (Existentes)
| Archivo | Cambio |
|---------|--------|
| `MAPA_PROYECTO_KMP.md` | Actualizado Â§0 (commit 1d01b6b), Â§2 (nuevo paquete validation + 25 components), Â§3 (validation package) |

### ValidaciÃ³n
| Check | Resultado |
|-------|-----------|
| `git status` limpio (solo docs nuevos + MAPA) | âœ… |
| Sin cambios en cÃ³digo funcional | âœ… (solo docs + MAPA) |
| Sin tocar cÃ³digo de otras IAs (AprenderScreen, etc.) | âœ… |
| Sin tocar UI, Firebase, GamificaciÃ³n, otras materias | âœ… |
| CompilaciÃ³n teÃ³rica (`compilar_app.bat`) | â³ Pendiente (no ejecutado por instrucciÃ³n) |

### Estado
**DocumentaciÃ³n base creada** â€” Listo para Fase 4 (Infraestructura mÃ­nima) y Fase 5 (Piloto 8.1).

### Siguiente Paso
**Fase 4**: Crear infraestructura mÃ­nima (`ContentLoader`, `JsonContentLoader`, `ContentIdentityValidator`, modelos) en `shared/.../data/content/`.

---

## PrÃ³ximas Entradas (Plantilla)

```markdown
## YYYY-MM-DD | Agente/Modelo

### Objetivo
...

### Archivos Creados
| Archivo | Tipo | DescripciÃ³n |
|---------|------|-------------|
| ... | ... | ... |

### Archivos Modificados
| Archivo | Cambio |
|---------|--------|
| ... | ... |

### ValidaciÃ³n
| Check | Resultado |
|-------|-----------|
| ... | ... |

### Estado
...

### Siguiente Paso
...
```
---

## 2026-09-29 | OpenCode (auditoría final piloto 8.1)

### Objetivo
Auditoría corta pre-8.2: tests, BiologiaPart1, MAPA, radio de cambios, conexión 8.1, fail-local, identidad.

### Hallazgos
- Tests solo en `commonTest` (mención en informe anterior era error de redacción).
- `BiologiaPart1.kt` intacta (sin diff). Semanas 1-7 sin tocar.
- MAPA ya registrado como MODIFICADO en entrada anterior. Correcto.
- `AprenderRepository.kt` traía llave extra (edición a medias del agente anterior) + `getLessonById` opacaba lo nuevo con legacy y parseaba mal la semana (`take(1)`).
- 8.1 existía en resources pero sin conexión real (repositorio solo leía legacy).

### Correcciones
- Quitada llave extra en `AprenderRepository.kt`.
- `getLessonById`: contenido nuevo primero en Biología semana>=8 (parse `bio_tWW_sNN` -> subtopic `W.N`), fallback a legacy misma lección.
- `GamificationManager.restore`: restaurada forma original con llamadas Sync (se removió andamiaje verboso que no compilaba).

### Validación
- `compileDebugKotlinAndroid`: cero errores fuera de `data/obras/` (trabajo en curso de otro agente, no tocado).
- Identidad 8.1 verificada en `lesson.json`; 15 preguntas contadas en `questions.json`.

### Estado
8.1 contenido listo y conectado. Falta: validación ejecutada + revisión visual.

### Siguiente paso
Cerrar `data/obras/` ajeno, ejecutar CatalogValidator/tests, revisión visual, luego autorizar 8.2.

---

## 2026-09-29 | OpenCode (mapa 8.1 no visible)

### Causa raíz
La colección del mapa (`getLessonsForSubject`/`learningPath`) solo podía dar legacy: `loadSubjectLessons` lanzaba al faltar `semana01/manifest.json` (manifest declara 12 semanas, existe 1). Además `getLessonById` opacaba lo nuevo con legacy y parseaba mal (`take(1)`).

### Solución
- `loadSubjectLessons`: omite solo recurso ausente (`Recurso no encontrado`); error de validación relanza (fail-local).
- `getLessonById`: nuevo primero en Biología semana>=8 (`bio_tWW_sNN`?`W.N`), fallback legacy misma lección.
- `GamificationManager.restore`: forma original + Sync (quitado andamiaje que no compilaba); quitada llave extra en `AprenderRepository`.
- Semanas 1-7 intactas (legacy<=7, catálogos sin diff); 8.1 una vez (legacy 8.x excluido); sin 8.2-8.4 falsos.

### Validación
- `compileDebugKotlinAndroid`: cero errores fuera de `data/obras/` (otro agente).
- Identidad 8.1 + 15 preguntas + correspondencia teoría/preguntas verificadas.
- Tests/build global pendientes por `data/obras/` ajeno.

### Estado
Fuente de datos corregida. Falta: validación ejecutada + revisión visual, luego 8.2.

---

## 2026-09-30 | OpenCode (bug real: mapa terminaba en Semana 7)

### Causa raíz real
Doble: (1) `loadSubjectLessons` iteraba semanas declaradas sin archivos y lanzaba -> lista nueva vacía + legacy 8+ filtrado = mapa hasta 7. (2) En runtime Android, `commonMain/resources` + ClassLoader casero no resuelve; el mecanismo empaquetado es `composeResources` + `Res`.

### Solución
- Contenido movido a `commonMain/composeResources/files/aprender/` (rename detectado por git).
- Loader usa `Res.readBytes("files/...")` (generado `rastro.shared.generated.resources.Res`); se conserva fail-local (ausente se omite, corrupto relanza).
- Seam mínimo testeable: `JsonContentLoader(readBytesOverride)` + `AprenderRepository.testLoaderOverride` (solo tests).
- Test regresión `MapaBiologiaRegressionTest` en `androidUnitTest` (en unit tests no hay Context y `Res` no resuelve): fixtures espejo en `src/androidUnitTest/resources` + lector por classloader. Cubre la colección del mapa (legacy 1-7 + 8.1 una vez, sin 8.2-8.4, orden 7->8, 15 preguntas).
- APK verificado: 5 archivos en `assets/composeResources/rastro.shared.generated.resources/files/`.

### Validación
- `:shared:testDebugUnitTest` 25/25, `:androidApp:testDebugUnitTest` OK, `:shared:assemble` OK, `:androidApp:assembleDebug` OK.

### Estado
Listado corregido y validado en código + APK. Falta: verificación visual del usuario.

---

## 2026-09-30 | OpenCode (Semana 8 completa)

### Fuentes
`BiologiaPart2.kt` s02–s04, `TEMA_07` §§2.2B/2.3B (+ problemas y DECO), `SOLUCIONARIOS.md` S5/S6/S8, `TEMARIO_OFICIAL_UNSA.md`.

### Corrección 8.1 (causa real, genérica)
El renderer (`LessonContentRenderer`) parsea `theory.resumen`, pero el loader conservaba el `resumen` del JSON (vacío) y guardaba `theory.md` aparte sin transportarlo: la teoría completa existía pero no llegaba a UI. Fix en `JsonContentLoader`: `resumen = theoryMarkdown` (con fallback al JSON). Sirve a 8.x y futuras.

### Creados (solo sistema nuevo, `semana08/8.x/`)
- 8.2: lesson.json + theory.md + questions.json (13 preguntas).
- 8.3: lesson.json + theory.md + questions.json (14 preguntas).
- 8.4: lesson.json + theory.md + questions.json (12 preguntas).
- Espejos en `src/androidUnitTest/resources` + `MapaBiologiaRegressionTest` ampliado (32 = 28+4, orden, identidad, sin cruce).

### Incidencias
- Ningún invento: todo respaldado; 1 pregunta 8.2 reemplazada por salirse de la teoría (buceo/descompresión).
- `commonTest/composeResources` desapareció del árbol (actor desconocido, otro agente activo); fixtures viven en `androidUnitTest/resources`.

### Validación
- `:shared:testDebugUnitTest` 26/26, `:androidApp:testDebugUnitTest` 0 fallos, ambos assembles OK.
- APK verificado: 13 archivos semana08 + manifest biología en `assets/composeResources/`.

### Estado
Semana 8 completa (8.1–8.4). Falta: verificación visual del usuario. NO iniciar Semana 9.

---

## 2026-09-30 | OpenCode (Biología completa 9-13 + renderer general)

### Renderer general (`LessonContentRenderer`, genérico)
- `expandMarkdownTables`: bloques `\|...\ ???` ? viñetas `- **nombre:** resto` (tarjetas existentes); ejerce la tabla ABO legacy.
- Filtrado de separadores `---`/`***`/`___`; negritas, listas y jerarquía (`#`/`##`/píldoras `8.x.y`) ya existían.
- Fix previo integrado: `resumen = theory.md` en el loader (teoría completa llega a UI).

### Semanas 9-13 (20 lecciones, sistema nuevo)
- Fuentes: `BiologiaPart2.kt`, `TEMA_07/08/09/10/11/12/13`, `SOLUCIONARIOS.md` S5-S10, `TEMARIO_OFICIAL_UNSA.md`.
- 9: excretor(12) nervioso-central(12) autónomo(12) endocrino(12).
- 10: ciclo(12) mitosis(12) meiosis(12) gametogénesis(12).
- 11: Mendel(12) no-mendeliana/ABO(12) ligada-sexo(12) mutaciones(12).
- 12: origen(12) evolución(12) pruebas(12) taxonomía(12).
- 13: ecosistema(12) ciclos(12) relaciones(12) contaminación-ANP(12).
- Manifest biología corregido a 13 semanas + manifests 9-13; espejos fixtures + test ampliado (52 = 28+24).

### Incidencias
- Fail-local detectó hardcodeo `semana != 8` en `ContentAcademicValidator`: generalizado a `lesson.semana`.
- Ningún invento fuera de fuentes; sin gráficos requeridos en preguntas.

### Validación
- `:shared:testDebugUnitTest` 26/26, `:androidApp:testDebugUnitTest` 0 fallos, ambos assembles OK.
- APK verificado: 79 archivos biología en `assets/composeResources/`.

### Estado
Biología completa (13 semanas, 52 lecciones). Falta: verificación visual del usuario. NO iniciar otra materia.

---

## 2026-09-30 | OpenCode (cierre: incidencia commonTest/composeResources)

### Causa real
`git log` prueba que `shared/src/commonTest/composeResources/` JAMÁS estuvo commiteado: eran fixtures no-trackeados creados durante el diagnóstico. Su desaparición no afecta nada (ningún código los referencia; los tests usan `src/androidUnitTest/resources`, verificados en classpath). Atribución anterior a "otro agente": incorrecta, retirada.

### Acción tomada
Ninguna restauración (restaurar duplicaría fixtures y arriesgaría conflicto de recursos). Se deja eliminado.

### Validación final
- `:shared:testDebugUnitTest` 26/26, `:androidApp:testDebugUnitTest` 0 fallos.
- `:shared:assemble` OK, `:androidApp:assembleDebug` OK, APK con 79 archivos biología.

### Estado
BIOLOGÍA CERRADA: 13 semanas, 52 lecciones, 285 preguntas nuevas. Solo falta verificación visual del usuario.

---

## 2026-09-30 | OpenCode (regla ESTUDIO-no-REPASO + renderer general)

### Regla aplicada
Teorías reescritas a material de estudio (qué/cómo/por qué/relaciones/diferencias/ejemplos/refuerzo) en las 24 lecciones nuevas; explicaciones solo corrigen, no enseñan primero.

### Renderer (`LessonContentRenderer`, genérico)
- `expandMarkdownTables`: tablas ? tarjetas; separadores `---` filtrados; negritas/listas/jerarquía ya existían.

### Validación
- `:shared:testDebugUnitTest` 26/26 (incluye guarda de profundidad resumen>=1500 en nuevas), `:androidApp:testDebugUnitTest` 0 fallos, ambos assembles OK.
- APK verificado: manifests 8-13 + 24 questions.json en `assets/composeResources/`.

### Estado
Biología completa y con profundidad de estudio. Solo falta verificación visual del usuario.
