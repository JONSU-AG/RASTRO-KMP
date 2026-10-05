# Aprender — Relacionar y Completar teoría (para la siguiente IA)

**No generar otro motor ni modificar XP/progreso.** No se agregaron preguntas a catálogos. Añade únicamente contenido académico revisado al `challenges` de la lección, con IDs únicos; admite una o dos actividades de cada tipo y cualquier materia.

## Archivos

- Modelo común: `shared/src/commonMain/kotlin/com/jonsuapps/rastro/model/AprenderModels.kt` (`Challenge`, `ChallengePair`, `ChallengeMatchOption`, `ChallengeBlank`).
- Interacción/validación: `model/ChallengeInteraction.kt` (`MatchAnswerState`). No otorga XP.
- JSON: `shared/.../data/content/LessonContent.kt` (`QuestionJson`, `LessonContentMapper`). Se usa el loader existente; no crear otro.
- UI: `androidApp/.../ui/components/InteractiveChallenges.kt` (`MatchingChallengeView`, `FillTheoryChallengeView`).
- Integración: `androidApp/.../ui/screens/LessonEngineScreen.kt` (`ChallengeQuestionView`). Reinicia respuestas por reto/Fénix y utiliza la misma comprobación, vidas y recompensa final.
- Validación de catálogo: `shared/.../data/validation/CatalogValidator.kt`; errores estructurales producen `INVALID_INTERACTIVE_CHALLENGE` y el mapper rechaza datos corruptos localmente.

## Relacionar: `ChallengeType.MATCH_PAIRS`

Ejemplo de **estructura con marcadores**, no contenido listo para publicar:

```json
{
  "id": "MATERIA_TEMA_RETO_ID",
  "type": "MATCH_PAIRS",
  "subject": "ID_MATERIA", "semana": 1,
  "statement": "Relaciona cada autor con su obra.",
  "explanation": "EXPLICACIÓN ACADÉMICA VERIFICADA",
  "pairs": [
    {"id": "p1", "left": "AUTOR_A", "right": "OBRA_A"},
    {"id": "p2", "left": "AUTOR_B", "right": "OBRA_B"}
  ]
}
```

Mínimo dos parejas. IDs únicos y textos distintos en cada columna. El mismo esquema sirve para Concepto ↔ Definición, Personaje ↔ Obra y Acontecimiento ↔ Fecha. `rightOptions` es opcional: se deriva de `pairs`; si se proporciona, necesita exactamente los mismos IDs con sus textos correspondientes (`[{"id":"p1","text":"OBRA_A"}, ...]`). El Engine mezcla la derecha una vez por intento.

El alumno puede elegir izquierda/derecha en cualquier orden. Una pareja correcta queda bloqueada de inmediato, con color distinto y número compartido. Una incorrecta no bloquea ni consume opciones. Los errores se recuerdan: al comprobar, el reto cuenta como fallado y se repasa en Fénix; no pierde una vida por cada toque ni recibe XP por pareja. Cada actividad cuenta como **un reto** del sistema actual.

## Completar teoría: `ChallengeType.FILL_BLANK`

```json
{
  "id": "MATERIA_TEMA_OTRO_RETO_ID",
  "type": "FILL_BLANK",
  "subject": "ID_MATERIA", "semana": 1,
  "statement": "Completa la teoría.",
  "explanation": "EXPLICACIÓN ACADÉMICA VERIFICADA",
  "textTemplate": "El autor fue {{autor}}, quien recibió el premio en {{fecha}}.",
  "blanks": [
    {"id":"autor","options":["AUTOR_CORRECTO","AUTOR_DISTRACTOR"],"correctText":"AUTOR_CORRECTO"},
    {"id":"fecha","options":["AÑO_CORRECTO","AÑO_DISTRACTOR"],"correctText":"AÑO_CORRECTO"}
  ]
}
```

Cada `{{id}}` debe aparecer exactamente una vez y corresponder a un `ChallengeBlank`. Mínimo dos opciones distintas por espacio; `correctText` debe estar entre ellas. El alumno toca un espacio, elige una opción y esta aparece dentro del texto; puede cambiarla antes de comprobar. Se evalúan **todos** los espacios juntos. Se conserva el formato anterior de un solo hueco (`sentenceBefore`, `sentenceAfter`, `chips`, `correctText`). No se requieren `options` ni `correctIndex` de opción múltiple para estos dos tipos.

## Personajes y pruebas

Solo rig/secuencias Classic (`LearningArtwork.kt`). Personaje aleatorio, estable por aparición y máximo dos repeticiones. Tres estrellas → Feliz/Enamorado; dos → leer/lanzar/explosión; cero/una → Triste/Enojado. Máximo dos emociones iguales cuando hay alternativas válidas; explosión es excepción explícitamente aprobada. Contador de variedad local a la sesión, sin añadir datos de gamificación. Dormir está disponible al esperar en actividades; Noqueado aparece al fallar/Fénix.

Pruebas: `InteractiveChallengeTest`, `LearningArtworkPolicyTest`, `LearningRewardsTest`, `CatalogPilotValidationTest`. No insertar estos fixtures sintéticos en catálogos. Compilar/testear sin lanzar app ni generar APK, conforme al AGENTS.md actual. La matriz visual en claro/oscuro/AMOLED y tamaños de pantalla sigue pendiente.
