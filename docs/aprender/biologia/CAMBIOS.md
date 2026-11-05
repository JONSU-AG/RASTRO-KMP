# CAMBIOS.md ‚Äî Historial de Intervenciones (Biolog√≠a)

> Registro breve de intervenciones. Formato: **Fecha | Agente/Modelo | Objetivo | Archivos creados/modificados | Validaci√≥n | Estado | Siguiente paso**.

---

## 2026-09-28 | OpenCode (Primera Intervenci√≥n)

### Objetivo
Establecer arquitectura modular para contenido acad√©mico reparable por piezas, comenzando con piloto **Biolog√≠a 8.1**.

### Archivos Creados
| Archivo | Tipo | Descripci√≥n |
|---------|------|-------------|
| `AGENTS.md` | Ra√≠z | Reglas generales para agentes IA (√°mbito, prohibiciones, validaci√≥n) |
| `docs/aprender/README.md` | Doc | Qu√© es Aprender, arquitectura, modelos, cat√°logos, validaci√≥n |
| `docs/aprender/ARQUITECTURA.md` | Doc | Dise√±o loader, granularidad, identidad, convivencia legacy/nuevo, validaci√≥n |
| `docs/aprender/biologia/README.md` | Doc | Estado Biolog√≠a (semanas 1‚Äì13), piloto 8.1, fuente can√≥nica |
| `docs/aprender/biologia/CHECKLIST.md` | Doc | Estado granular por lecci√≥n (semanas 1‚Äì13, detalle 8.1) |
| `docs/aprender/biologia/DECISIONES.md` | Doc | Decisiones: formato, ubicaci√≥n, granularidad, IDs, legacy/nuevo, aislamiento, source lock 8.1 |
| `docs/aprender/biologia/CAMBIOS.md` | Doc | **Este archivo** |

### Archivos Modificados (Existentes)
| Archivo | Cambio |
|---------|--------|
| `MAPA_PROYECTO_KMP.md` | Actualizado ¬ß0 (commit 1d01b6b), ¬ß2 (nuevo paquete validation + 25 components), ¬ß3 (validation package) |

### Validaci√≥n
| Check | Resultado |
|-------|-----------|
| `git status` limpio (solo docs nuevos + MAPA) | ‚úÖ |
| Sin cambios en c√≥digo funcional | ‚úÖ (solo docs + MAPA) |
| Sin tocar c√≥digo de otras IAs (AprenderScreen, etc.) | ‚úÖ |
| Sin tocar UI, Firebase, Gamificaci√≥n, otras materias | ‚úÖ |
| Compilaci√≥n te√≥rica (`compilar_app.bat`) | ‚è≥ Pendiente (no ejecutado por instrucci√≥n) |

### Estado
**Documentaci√≥n base creada** ‚Äî Listo para Fase 4 (Infraestructura m√≠nima) y Fase 5 (Piloto 8.1).

### Siguiente Paso
**Fase 4**: Crear infraestructura m√≠nima (`ContentLoader`, `JsonContentLoader`, `ContentIdentityValidator`, modelos) en `shared/.../data/content/`.

---

## Pr√≥ximas Entradas (Plantilla)

```markdown
## YYYY-MM-DD | Agente/Modelo

### Objetivo
...

### Archivos Creados
| Archivo | Tipo | Descripci√≥n |
|---------|------|-------------|
| ... | ... | ... |

### Archivos Modificados
| Archivo | Cambio |
|---------|--------|
| ... | ... |

### Validaci√≥n
| Check | Resultado |
|-------|-----------|
| ... | ... |

### Estado
...

### Siguiente Paso
...
```
---

## 2026-09-29 | OpenCode (auditorÌa final piloto 8.1)

### Objetivo
AuditorÌa corta pre-8.2: tests, BiologiaPart1, MAPA, radio de cambios, conexiÛn 8.1, fail-local, identidad.

### Hallazgos
- Tests solo en `commonTest` (menciÛn en informe anterior era error de redacciÛn).
- `BiologiaPart1.kt` intacta (sin diff). Semanas 1-7 sin tocar.
- MAPA ya registrado como MODIFICADO en entrada anterior. Correcto.
- `AprenderRepository.kt` traÌa llave extra (ediciÛn a medias del agente anterior) + `getLessonById` opacaba lo nuevo con legacy y parseaba mal la semana (`take(1)`).
- 8.1 existÌa en resources pero sin conexiÛn real (repositorio solo leÌa legacy).

### Correcciones
- Quitada llave extra en `AprenderRepository.kt`.
- `getLessonById`: contenido nuevo primero en BiologÌa semana>=8 (parse `bio_tWW_sNN` -> subtopic `W.N`), fallback a legacy misma lecciÛn.
- `GamificationManager.restore`: restaurada forma original con llamadas Sync (se removiÛ andamiaje verboso que no compilaba).

### ValidaciÛn
- `compileDebugKotlinAndroid`: cero errores fuera de `data/obras/` (trabajo en curso de otro agente, no tocado).
- Identidad 8.1 verificada en `lesson.json`; 15 preguntas contadas en `questions.json`.

### Estado
8.1 contenido listo y conectado. Falta: validaciÛn ejecutada + revisiÛn visual.

### Siguiente paso
Cerrar `data/obras/` ajeno, ejecutar CatalogValidator/tests, revisiÛn visual, luego autorizar 8.2.

---

## 2026-09-29 | OpenCode (mapa 8.1 no visible)

### Causa raÌz
La colecciÛn del mapa (`getLessonsForSubject`/`learningPath`) solo podÌa dar legacy: `loadSubjectLessons` lanzaba al faltar `semana01/manifest.json` (manifest declara 12 semanas, existe 1). Adem·s `getLessonById` opacaba lo nuevo con legacy y parseaba mal (`take(1)`).

### SoluciÛn
- `loadSubjectLessons`: omite solo recurso ausente (`Recurso no encontrado`); error de validaciÛn relanza (fail-local).
- `getLessonById`: nuevo primero en BiologÌa semana>=8 (`bio_tWW_sNN`?`W.N`), fallback legacy misma lecciÛn.
- `GamificationManager.restore`: forma original + Sync (quitado andamiaje que no compilaba); quitada llave extra en `AprenderRepository`.
- Semanas 1-7 intactas (legacy<=7, cat·logos sin diff); 8.1 una vez (legacy 8.x excluido); sin 8.2-8.4 falsos.

### ValidaciÛn
- `compileDebugKotlinAndroid`: cero errores fuera de `data/obras/` (otro agente).
- Identidad 8.1 + 15 preguntas + correspondencia teorÌa/preguntas verificadas.
- Tests/build global pendientes por `data/obras/` ajeno.

### Estado
Fuente de datos corregida. Falta: validaciÛn ejecutada + revisiÛn visual, luego 8.2.

---

## 2026-09-30 | OpenCode (bug real: mapa terminaba en Semana 7)

### Causa raÌz real
Doble: (1) `loadSubjectLessons` iteraba semanas declaradas sin archivos y lanzaba -> lista nueva vacÌa + legacy 8+ filtrado = mapa hasta 7. (2) En runtime Android, `commonMain/resources` + ClassLoader casero no resuelve; el mecanismo empaquetado es `composeResources` + `Res`.

### SoluciÛn
- Contenido movido a `commonMain/composeResources/files/aprender/` (rename detectado por git).
- Loader usa `Res.readBytes("files/...")` (generado `rastro.shared.generated.resources.Res`); se conserva fail-local (ausente se omite, corrupto relanza).
- Seam mÌnimo testeable: `JsonContentLoader(readBytesOverride)` + `AprenderRepository.testLoaderOverride` (solo tests).
- Test regresiÛn `MapaBiologiaRegressionTest` en `androidUnitTest` (en unit tests no hay Context y `Res` no resuelve): fixtures espejo en `src/androidUnitTest/resources` + lector por classloader. Cubre la colecciÛn del mapa (legacy 1-7 + 8.1 una vez, sin 8.2-8.4, orden 7->8, 15 preguntas).
- APK verificado: 5 archivos en `assets/composeResources/rastro.shared.generated.resources/files/`.

### ValidaciÛn
- `:shared:testDebugUnitTest` 25/25, `:androidApp:testDebugUnitTest` OK, `:shared:assemble` OK, `:androidApp:assembleDebug` OK.

### Estado
Listado corregido y validado en cÛdigo + APK. Falta: verificaciÛn visual del usuario.

---

## 2026-09-30 | OpenCode (Semana 8 completa)

### Fuentes
`BiologiaPart2.kt` s02ñs04, `TEMA_07` ßß2.2B/2.3B (+ problemas y DECO), `SOLUCIONARIOS.md` S5/S6/S8, `TEMARIO_OFICIAL_UNSA.md`.

### CorrecciÛn 8.1 (causa real, genÈrica)
El renderer (`LessonContentRenderer`) parsea `theory.resumen`, pero el loader conservaba el `resumen` del JSON (vacÌo) y guardaba `theory.md` aparte sin transportarlo: la teorÌa completa existÌa pero no llegaba a UI. Fix en `JsonContentLoader`: `resumen = theoryMarkdown` (con fallback al JSON). Sirve a 8.x y futuras.

### Creados (solo sistema nuevo, `semana08/8.x/`)
- 8.2: lesson.json + theory.md + questions.json (13 preguntas).
- 8.3: lesson.json + theory.md + questions.json (14 preguntas).
- 8.4: lesson.json + theory.md + questions.json (12 preguntas).
- Espejos en `src/androidUnitTest/resources` + `MapaBiologiaRegressionTest` ampliado (32 = 28+4, orden, identidad, sin cruce).

### Incidencias
- Ning˙n invento: todo respaldado; 1 pregunta 8.2 reemplazada por salirse de la teorÌa (buceo/descompresiÛn).
- `commonTest/composeResources` desapareciÛ del ·rbol (actor desconocido, otro agente activo); fixtures viven en `androidUnitTest/resources`.

### ValidaciÛn
- `:shared:testDebugUnitTest` 26/26, `:androidApp:testDebugUnitTest` 0 fallos, ambos assembles OK.
- APK verificado: 13 archivos semana08 + manifest biologÌa en `assets/composeResources/`.

### Estado
Semana 8 completa (8.1ñ8.4). Falta: verificaciÛn visual del usuario. NO iniciar Semana 9.

---

## 2026-09-30 | OpenCode (BiologÌa completa 9-13 + renderer general)

### Renderer general (`LessonContentRenderer`, genÈrico)
- `expandMarkdownTables`: bloques `\|...\ ???` ? viÒetas `- **nombre:** resto` (tarjetas existentes); ejerce la tabla ABO legacy.
- Filtrado de separadores `---`/`***`/`___`; negritas, listas y jerarquÌa (`#`/`##`/pÌldoras `8.x.y`) ya existÌan.
- Fix previo integrado: `resumen = theory.md` en el loader (teorÌa completa llega a UI).

### Semanas 9-13 (20 lecciones, sistema nuevo)
- Fuentes: `BiologiaPart2.kt`, `TEMA_07/08/09/10/11/12/13`, `SOLUCIONARIOS.md` S5-S10, `TEMARIO_OFICIAL_UNSA.md`.
- 9: excretor(12) nervioso-central(12) autÛnomo(12) endocrino(12).
- 10: ciclo(12) mitosis(12) meiosis(12) gametogÈnesis(12).
- 11: Mendel(12) no-mendeliana/ABO(12) ligada-sexo(12) mutaciones(12).
- 12: origen(12) evoluciÛn(12) pruebas(12) taxonomÌa(12).
- 13: ecosistema(12) ciclos(12) relaciones(12) contaminaciÛn-ANP(12).
- Manifest biologÌa corregido a 13 semanas + manifests 9-13; espejos fixtures + test ampliado (52 = 28+24).

### Incidencias
- Fail-local detectÛ hardcodeo `semana != 8` en `ContentAcademicValidator`: generalizado a `lesson.semana`.
- Ning˙n invento fuera de fuentes; sin gr·ficos requeridos en preguntas.

### ValidaciÛn
- `:shared:testDebugUnitTest` 26/26, `:androidApp:testDebugUnitTest` 0 fallos, ambos assembles OK.
- APK verificado: 79 archivos biologÌa en `assets/composeResources/`.

### Estado
BiologÌa completa (13 semanas, 52 lecciones). Falta: verificaciÛn visual del usuario. NO iniciar otra materia.

---

## 2026-09-30 | OpenCode (cierre: incidencia commonTest/composeResources)

### Causa real
`git log` prueba que `shared/src/commonTest/composeResources/` JAM¡S estuvo commiteado: eran fixtures no-trackeados creados durante el diagnÛstico. Su desapariciÛn no afecta nada (ning˙n cÛdigo los referencia; los tests usan `src/androidUnitTest/resources`, verificados en classpath). AtribuciÛn anterior a "otro agente": incorrecta, retirada.

### AcciÛn tomada
Ninguna restauraciÛn (restaurar duplicarÌa fixtures y arriesgarÌa conflicto de recursos). Se deja eliminado.

### ValidaciÛn final
- `:shared:testDebugUnitTest` 26/26, `:androidApp:testDebugUnitTest` 0 fallos.
- `:shared:assemble` OK, `:androidApp:assembleDebug` OK, APK con 79 archivos biologÌa.

### Estado
BIOLOGÕA CERRADA: 13 semanas, 52 lecciones, 285 preguntas nuevas. Solo falta verificaciÛn visual del usuario.

---

## 2026-09-30 | OpenCode (regla ESTUDIO-no-REPASO + renderer general)

### Regla aplicada
TeorÌas reescritas a material de estudio (quÈ/cÛmo/por quÈ/relaciones/diferencias/ejemplos/refuerzo) en las 24 lecciones nuevas; explicaciones solo corrigen, no enseÒan primero.

### Renderer (`LessonContentRenderer`, genÈrico)
- `expandMarkdownTables`: tablas ? tarjetas; separadores `---` filtrados; negritas/listas/jerarquÌa ya existÌan.

### ValidaciÛn
- `:shared:testDebugUnitTest` 26/26 (incluye guarda de profundidad resumen>=1500 en nuevas), `:androidApp:testDebugUnitTest` 0 fallos, ambos assembles OK.
- APK verificado: manifests 8-13 + 24 questions.json en `assets/composeResources/`.

### Estado
BiologÌa completa y con profundidad de estudio. Solo falta verificaciÛn visual del usuario.

## 02/11/2026 - Relaciones y fisiologÌa

Reparadas diez relaciones ambiguas y una pregunta de B12; once objetos y fixtures, sin pÈrdida de IDs ni creaciÛn de niveles. Ver REVISION_RELACIONES_2026-11-02.md. La comprobaciÛn puntual no equivale a certificar toda la materia, aunque notas antiguas del archivo usaran ese tÈrmino.


## 03/11/2026 ‚Äî Piloto visual exclusivamente 8.3

El usuario confirm√≥ pantalla blanca en imagen y 3D. Solo el recurso del coraz√≥n de bio_t08_s03 pasa a imagen nativa y visor nativo OpenGL ES 2 con el GLB cient√≠fico existente. No se modifican teor√≠a, bancos, otras materias, Pizarra ni Firebase. Ver PILOTO_8_3_VISOR_NATIVO.md. La ampliaci√≥n se detiene hasta la prueba del usuario.


## 03/11/2026 ‚Äî Segundo piloto: c√©lula vegetal 5.4

Recurso ilustrativo de 3DCellForge asociado solo a bio_t05_s04 (N√∫cleo y comparaci√≥n animal vs. vegetal), visible en teor√≠a del nivel y Material. GLB reducido de 60,7 MB a 1,93 MB, con textura y colores, conservando fuente/aviso MIT. Se reutiliza el visor nativo; no cambian bancos ni Firebase. Ver PILOTO_CELULA_VEGETAL_5_4.md. Prueba f√≠sica y aceptaci√≥n pendientes.


## 03/11/2026 ‚Äî Partes interactivas de la c√©lula 5.4

La superficie original se agrupa en ocho partes para identificar, resaltar, aislar y separar visualmente, preservando todos los tri√°ngulos y texturas. N√∫cleo incluye nucl√©olo al aislar; selecci√≥n por rayos sobre la geometr√≠a real. Se conservan l√≠mites del piloto y licencias. assembleDebug y 17 pruebas pertinentes correctas, con ocho estados gr√°ficos no vac√≠os; prueba f√≠sica pendiente. Ver PARTES_CELULA_5_4_2026-11-03.md.


04/11/2026: pilotos 3D 5.4 y 8.3 comprobados contra las lecciones reales y Material. Tarjetas identificadas, estados por recurso, controles acotados y vuelta al modelo completo. Se conserva el contenido y las ocho partes de la celula; 19 cadenas del catalogo/metadatos corregidas. assembleDebug y 667 pruebas correctas, sin fallos, errores u omisiones; dos modelos y ocho estados de partes dibujados en la prueba grafica. APK: 28 archivos graficos/licencias identicos a sus fuentes. No se ejecuto Android: gestos, rotacion y rendimiento fisicos pendientes. Detalle en docs/material/CAMBIOS.md; no se creo otro informe.
