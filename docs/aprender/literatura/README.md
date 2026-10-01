# Literatura — Integración Google AI Studio → RASTRO (2.ª materia)

> Estado: 6 semanas, 12 LessonNodes, 120 challenges. Validado + empaquetado en APK.
> Patrón: idéntico sistema genérico que Biología y Lenguaje (contrato de regresión).

## Cadena de producción

```
CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA (6 TEMAs 1:1 + OBRAS/ 40 fichas)
        ↓
Google AI Studio → curso-prueba/SALIDA_KOTLIN/literatura (staging READ-ONLY:
LiteraturaSemana01..06.kt + Catalog + CONTROL.md)
        ↓
Adaptación/validación (piloto semana01 → gate 4/4 → expansión 02-06)
        ↓
RASTRO → shared/.../composeResources/files/aprender/literatura/
         manifest.json (weeks:6) + semanaXX/manifest.json + X.Y/{lesson.json, theory.md, questions.json}
```

- Staging trae identidad poblada (`subjectId="literatura"`, `semana`, `subtema`);
  aun así la identidad productiva se deriva de archivo+semana+nodo (staging no define arquitectura).
- Menciones de obras en prosa (Ilíada, Quijote, Vallejo...): ejemplos, sin
  dependencia de código con `data/obras/` ni `LiteraturaRepository` (verificado: 0 imports).
- Legacy `lit_tXX_sYY` (24 lecciones, 2 challenges c/u) comparte prefijo con el
  nuevo: el nuevo gana por loader con fallback legacy (igual que bio 8.1);
  el mapa excluye legacy de semanas cubiertas (1-6 → legacy fuera, sin duplicar).

## Estándar aplicado (igual que Lenguaje)

- MATERIAL DE ESTUDIO (teorías 16k–25k chars; sin resumir).
- Renderer-compatible: mermaid/``` → flujo con viñetas y `→`, tablas `|` → viñetas,
  `>` → negrita, LaTeX → Unicode, mojibake corregido. Sin fences/links/HTML/metadata.
- `Q(L) ⊆ T(L)` 120/120; `explanation` = feedback. Auditoría mecánica verbatim
  staging↔producción: 107/120 codepoint-exactos; 13 micro-diffs benignos
  (puntuación, glosas parentéticas, precisión yaraví/harawi) con opciones y
  correctIndex intactos en los 120.

## Completions de teoría con respaldo (no invención)

- 6.1 Marcha Patriótica (c09): staging-explanation + contexto Pumacahua/Arequipa-1814
  (TEMA_06/OBRA_29) → subsección en desarrollo + DATOS + EJEMPLOS + CLAVE.
- 6.2 Vargas Llosa (c04-c07, c09): OBRA_28 (arequipeño 1936, Nobel, Leoncio Prado,
  Biblioteca Breve 1962, Jaguar/Poeta/Esclavo/Cava/Boa, Gamboa, vasos comunicantes)
  → nueva subsección 6.2.5 + refuerzos.
- 6.2 Ande de Alejandro Peralta (c08): staging-explanation + TEMA_06 (hermano de
  Churata, Orkopata) → párrafo en 6.2.5 + refuerzos.
- Resultado: 0 `FUENTE_INSUFICIENTE`, 0 `CHALLENGE_NO_RESPALDADO` final.

## Incidencia de conversión (resuelta, registrada)

- El agente de semana06 reemplazó 7 challenges reales por placeholders
  (`CHALLENGE_NO_RESPALDADO`: 6.1 c09; 6.2 c04–c09) y alteró correctIndex.
  Acción: restaurados verbatim desde staging (correctIndex originales 2,0,2,3,3,1
  y fuente `temario`), teorías completadas con respaldo (arriba), re-auditado
  mecánico 120/120 (107 exactos + 13 benignos). Prohibido repetir: nunca reescribir
  answers/keys; el gate existe para esto (§15).

## Tests

- `MapaLiteraturaRegressionTest` (4): mapa 12 nuevas sin legacy, 120 challenges,
  teoría ≥8000, correctIndex/options/explanations, subject/semana, título piloto
  verbatim, sin contaminación (bio/leng/len).
- Acumulativo verde: Bio 5/5 + Len 4/4 + Lit 4/4; suites `:shared`/`:androidApp`
  `testDebugUnitTest` + ambos `assemble` BUILD SUCCESSFUL; APK con 43 entries literatura
  (66 lenguaje y 79 biología intactos).
