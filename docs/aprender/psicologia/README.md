# Psicología — Integración Google AI Studio → RASTRO (3.ª materia, orden oficial #9)

> Estado: 15 semanas, 29 LessonNodes, 290 challenges. Tests 4/4 + suite shared verde.
> Orden: AUDITORIA_PEDAGOGICA.md #9 (tras Literatura #8). NOTA: el título del
> prompt pedía Historia del Perú, pero en el orden oficial es #5 (anterior a
> Lenguaje #7); se siguió el orden documentado. Historia del Perú NO iniciada.

## Cadena de producción

```
CONTENIDO_PEDAGOGICO/05_PERSONA_Y_FAMILIA/PSICOLOGIA (15 TEMAs)
        ↓
Google AI Studio → curso-prueba/SALIDA_KOTLIN/psicologia (staging READ-ONLY:
PsicologiaSemana01..15.kt + Catalog + CONTROL.md)
        ↓
Adaptación/validación (piloto semana01 → gate 4/4 → expansión 02-15)
        ↓
RASTRO → shared/.../composeResources/files/aprender/psicologia/
         manifest.json (weeks:15) + semanaXX/manifest.json + X.Y/{lesson.json, theory.md, questions.json}
```

- Staging con identidad poblada (`subjectId/semana/subtema`); S05 asimétrica
  (1 nodo) explica 29 en vez de 30. Legacy `psi_tXX_sYY` (30 lecciones, 2 ch c/u,
  5 opciones) comparte prefijo: el nuevo gana por loader con fallback legacy
  (igual que bio 8.1/lit_); el mapa excluye legacy de semanas cubiertas.
- Legacy restante direccionable: `psi_t05_s02` (sin 5.2 nuevo) cae a legacy (test).

## Estándar aplicado (patrón Lenguaje/Literatura)

- MATERIAL DE ESTUDIO (teorías ~15k–29k chars; sin resumir).
- Renderer-compatible: mermaid/``` → flujo con viñetas y `→`, tablas → viñetas,
  `>` → negrita, LaTeX → Unicode. Sin fences/links/HTML/metadata.
- `Q(L) ⊆ T(L)` 290/290. Auditoría mecánica verbatim staging↔producción:
  **290/290 codepoint-exactos** (id/statement/options/correctIndex/explanation).
  0 placeholders, 0 keys reescritas.
- Completions de teoría con respaldo (staging-explanation + TEMA, sin invención):
  11.1 pensamiento/deductivo/inductivo/Guilford/algoritmo/heurísticos (nueva 11.1.6);
  12.1 Walsh/Ainsworth/disfunción (nueva 12.1.5); 12.2 doble vínculo Bateson
  (nueva 12.2.4); 14.1 Sternberg/enamoramiento/consentimiento (nueva 14.1.6).
  0 `FUENTE_INSUFICIENTE` final.

## Tests

- `MapaPsicologiaRegressionTest` (4): mapa 29 nuevas sin legacy, 290 challenges,
  teoría ≥8000, subject/semana/options/explanations, título piloto verbatim,
  fallback legacy 5.2, sin contaminación (bio/leng/len/lit).
- Acumulativo: Bio 5/5 + Len 4/4 + Lit 4/4 + Psi 4/4.
- Suite `:shared:testDebugUnitTest`: 72 tests, 66 OK; 6 fallos preexistentes ajenos
  (`GamificationLivesAdminTest`, fichero untracked de otro agente, matemática de
  vidas, sin relación con Aprender).
- `:shared:assemble` BUILD SUCCESSFUL; 29/29/29 fichas psico en
  `copyDebugComposeResourcesToAndroidAssets` (flujo APK verificado hasta el
  límite del módulo app).
- BLOQUEO AJENO: `:androidApp:compileDebugKotlin` falla en
  `UserProfileScreen.kt:934` (@Composable fuera de contexto), fichero modificado
  por otro agente concurrente; sin APK fresco imputable a esta integración.
