# Lenguaje — Piloto de integración Google AI Studio → RASTRO

> Primera materia de Letras integrada al sistema genérico Aprender.
> Estado: 8 semanas, 19 LessonNodes, 194 challenges. Validado + empaquetado en APK.

## Cadena de producción

```
CONTENIDO_PEDAGOGICO/06_COMUNICACION/LENGUAJE   (fuente académica original/autorizada)
        ↓
Google AI Studio → curso-prueba/SALIDA_KOTLIN/lenguaje   (staging académico, READ-ONLY)
        ↓
OpenCode → adaptación/validación (este piloto)
        ↓
RASTRO → shared/.../composeResources/files/aprender/lenguaje/
         manifest.json + semanaXX/manifest.json + X.Y/{lesson.json, theory.md, questions.json}
```

- `curso-prueba` es INPUT: jamás se modifica; las correcciones (mojibake,
  metadata staging incompleta, LaTeX) ocurren durante la adaptación.
- El staging NO define arquitectura: se adapta Google → RASTRO, nunca al revés.
- RASTRO + Biología son la fuente de verdad técnica (mismo loader, modelos,
  renderer, validadores). No existe `LenguajeLoader` ni renderer propio.

## Convenciones (heredadas de Biología)

- IDs nuevos: `leng_tWW_sNN` (teoría `th_leng_tWW_sNN`, pregunta `leng_tWW_sNN_cMM).
  No colisionan con legacy `len_tWW_sSS`.
- Rutas: `lenguaje/semanaWW/manifest.json` + `W.N/{lesson.json,theory.md,questions.json}`,
  subtema `W.N`. `ContentIdentityValidator` genérico (sin cambios).
- `lesson.json` = metadata; la teoría canónica vive en `theory.md` y viaja en
  `theory.resumen` (inyectado por `JsonContentLoader`, sin cambios).
- Convivencia legacy+nuevo en `AprenderRepository` (mínimo y genérico):
  legacy solo en semanas NO cubiertas por el nuevo; como el nuevo cubre 1-8,
  el legacy `len_*` queda excluido del mapa sin duplicar. `getLessonById`
  resuelve `leng_tWW_sNN` vía loader con fallback legacy (fail-local).

## Estándar pedagógico aplicado

- MATERIAL DE ESTUDIO, no ficha de repaso (teorías 16k–25k chars, preservando la
  profundidad Google; sin resumir, sin convertir explicación en keywords).
- Conversión renderer-compatible: diagramas ASCII → flujo con viñetas y `→`,
  tablas `|` → viñetas `- **X:**`, `>` → negrita, LaTeX → Unicode
  (H₂SO₄, θ, →), corrección de mojibake. Sin fences/links/HTML/metadata.
- `Q(L) ⊆ T(L)`: todo lo evaluado se enseña en la teoría del MISMO LessonNode;
  `explanation` = feedback, nunca primera enseñanza. 194/194 verificados,
  0 `FUENTE_INSUFICIENTE`, 0 `CHALLENGE_NO_RESPALDADO`.
- Repetición pedagógica permitida (enseñar → ejemplo → concepto → clave → resumen).

## Tests

- `shared/.../androidUnitTest/.../MapaLenguajeRegressionTest` (4 tests):
  mapa 19 nuevas sin legacy, 194 challenges, teoría ≥8000 chars, correctIndex,
  explanations, subject/semana, títulos piloto verbatim, sin contaminación Biología.
- Biología sigue verde (`MapaBiologiaRegressionTest` 5/5): sin regresión.

## Procedimiento para futuras materias (repetir con otra)

1. Inspeccionar `curso-prueba/SALIDA_KOTLIN/<materia>/` (solo lectura) + legacy en
   `data/catalog/` + `CONTENIDO_PEDAGOGICO` correspondiente.
2. Piloto = primera semana → `manifest.json` materia (todas las semanas
   declaradas) + `semanaXX/manifest.json` + `X.Y/{lesson.json,theory.md,questions.json}`.
3. Extender `AprenderRepository` con la rama de convivencia (patrón lenguaje).
4. Fixtures espejo en `androidUnitTest/resources/.../files/aprender/<materia>/`.
5. Test de regresión espejo de este. Validar piloto extremo a extremo ANTES de expandir.
6. Expandir semana por semana, misma materia. NO pasar a otra materia en la misma fase.
