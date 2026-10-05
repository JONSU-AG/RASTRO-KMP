# Actividades especiales y progresión — 04/10/2026

## Ámbito
Curva EXP/nivel/liga y HUD; Inicio (Destacados y tarjetas Explora); banner de Aprender; preparación de actividades en el Lesson Engine y detección de duplicados interactivos en CatalogValidator. No se reescribieron archivos de materias, teoría, preguntas originales, personajes, navegación ni saldos. La ampliación a materias y UI está autorizada expresamente por este pedido; las restricciones del piloto de Biología no se usaron para modificar sus fuentes.

## Una curva de EXP
`shared/.../gamification/XpProgression.kt` es la única curva. El primer nivel requiere 200 EXP; cada siguiente cuesta 50 más. EXP mínima para nivel L: `200*(L-1) + 25*(L-1)*(L-2)`.

| Liga | Nivel | EXP mínima |
| --- | --- | --- |
| Wawita | 1 | 0 |
| Kinder | 5 | 1100 |
| Prefósil | 10 | 3600 |
| Fósil | 20 | 12350 |
| Futuro Cachimbo | 30 | 26100 |

GamificationState, LeagueCatalog y LearningProgressHud comparten la curva. No se resta EXP ni monedas ni se modifican premios: cambia el nivel/liga correspondiente al saldo. La proyección Firebase de liga se recalcula con el guardado existente, incluyendo al abrir Ligas; no se realizó una migración remota de cuentas inactivas.

## Ejercicios especiales reales
`shared/.../model/LessonSpecialActivities.kt`, llamado una vez al cargar la lección en `LessonEngineScreen`, reutiliza `ChallengeType.FILL_BLANK` y `MATCH_PAIRS`, `ChallengeInteraction` y la evaluación/EXP/Fénix existentes. No crear otro motor.

- Aplica a letras/humanidades, Biología, Inglés y niveles conceptuales de Química/Física. Materias matemáticas conservan sus ejercicios; niveles Química/Física con cálculos detectados o fórmulas también.
- Objetivo: dos Completar + dos Relacionar, también en lecciones cortas. Se conservan las actividades especiales explícitas; las faltantes se derivan solo de respuestas correctas de preguntas de la misma lección.
- Completar sustituye una aparición exacta de la respuesta en su explicación existente. Si no aparece, presenta el enunciado original y un espacio para completar su respuesta. No inventa afirmaciones académicas.
- Cuando hay pocas preguntas aprovechables, se usan relaciones explícitas concepto:descripción de la teoría y conceptos enfatizados en oraciones ya existentes; las frases se conservan y se oculta solo el concepto correcto. Las opciones proceden de esa misma teoría.
- Relacionar usa enunciados y sus respuestas correctas existentes, distintos y de longitud moderada. Dos parejas por actividad, sin repetir la misma pareja en las dos actividades nuevas.
- Si no hay suficientes relaciones adecuadas, completa el cupo con Completar cuando hay fuentes suficientes. No fuerza cuatro actividades mediante contenido inventado, negativo, inválido o incompatible con AcademicSanitizer.
- Distribución determinista entre las preguntas originales; IDs originales y orden relativo permanecen. IDs derivados `_practice_fill`/`_practice_match_N`; preparar otra vez no duplica ni cambia la secuencia.
- Para aportar relaciones más específicas Autor ↔ Obra, crear datos explícitos `pairs/rightOptions` en el archivo de esa lección siguiendo el modelo existente. Para un texto de varias lagunas: `textTemplate` con `{{id}}` y `blanks` con opciones y correctText. Datos explícitos tienen prioridad sobre derivación.
- CatalogValidator distingue el contenido real de actividades que comparten instrucciones: usa plantilla para Completar y conjunto ordenado de relaciones para Emparejar. Sigue rechazando contenido interactivo verdaderamente duplicado; opción múltiple conserva la regla anterior.

## Inicio y banner
Destacados selecciona los 20 más recientes **después** de ordenar las publicaciones destacadas, con desempate por ID. Se retiró el límite previo que elegía un subconjunto arbitrario. Conserva el listener por destacado existente y no exige un nuevo índice/despliegue; lee las publicaciones destacadas para ordenar (no toda la colección).

HomeToolCard usa altura común de 64 dp adaptada a escala de fuente, mismo ancho por columna y textos limitados. Banner conserva imagen/layout/controles; protección superior baja 6 puntos de opacidad, inferior 4. `BannerOutlinedText` aplica contorno negro de 0.8 dp a título/datos/etiquetas, conservando una sola descripción accesible. Track, progreso y superficies de botones permanecen.

## Validación
Registro `build/home-progression-special-final.log`. XpProgressionTest, CompetitionTest, LessonSpecialActivitiesTest, InteractiveChallengeTest, LessonSpecialCatalogTest y CatalogPilotValidationTest. La prueba de cobertura usa los catálogos reales y sus fixtures existentes, sin instalar preguntas de prueba. Cobertura por materia aparece como SPECIAL_COVERAGE en el XML del test. Sin ejecutar app, commit ni push. Contraste físico, responsividad y revisión pedagógica de los ejercicios derivados pendientes de revisión en dispositivo/contenido.

Cobertura comprobada: 315 niveles compatibles tienen cuatro actividades especiales distribuidas; Completar está en los 315 y Emparejar en 240. Las 6 lecciones de Química y 9 de Física que requieren cálculo conservan sus ejercicios. Las materias matemáticas/Raz. Lógico no se convierten automáticamente. El piloto preparado de Biología se valida con cero errores/cero advertencias, y los ejercicios de los catálogos reales pasan validación interactiva y sanitizador.
