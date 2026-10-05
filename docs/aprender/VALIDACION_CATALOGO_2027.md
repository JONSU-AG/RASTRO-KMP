# Validación de los complementos — 04/10/2026

Se comprobaron los **50 niveles afectados**, cargándolos con el mismo JsonContentLoader y preparador de actividades que usa Lesson Engine. Los fixtures coinciden con los recursos reales.

| Materia | Niveles revisados | Errores heredados | Advertencias heredadas |
|---|---:|---:|---:|
| algebra | 2 | 12 | 2 |
| geometria | 4 | 32 | 4 |
| trigonometria | 2 | 14 | 2 |
| historia_universal | 1 | 0 | 0 |
| historia_peru | 1 | 0 | 0 |
| geografia | 4 | 0 | 0 |
| quimica | 5 | 46 | 2 |
| biologia | 4 | 0 | 0 |
| fisica | 9 | 68 | 4 |
| psicologia | 1 | 0 | 0 |
| filosofia | 3 | 0 | 0 |
| civica | 2 | 0 | 0 |
| lenguaje | 5 | 0 | 0 |
| literatura | 4 | 0 | 0 |
| ingles | 2 | 10 | 0 |
| comprension_lectora | 1 | 0 | 0 |

**182 errores DUPLICATE_QUESTION_STATEMENT y 14 advertencias DEPTH_CHALLENGE_SHORTFALL.** Ya aparecen en los bancos previos al complemento. La prueba compara las incidencias con y sin la nueva sección de teoría y exige identidad de códigos, severidad e IDs; no reduce la exigencia de CatalogValidator ni excluye sus errores.

Ejemplo confirmado: `algebra/semana16/16.2/questions.json` repite «En relación con el marco conceptual desarrollado en esta lección…» cambiando solo el orden de opciones genéricas. Eso no es un ejercicio preuniversitario válido. No se sustituyó por títulos nuevos ni preguntas improvisadas para hacer pasar el validador.

El piloto de Biología y los niveles complementados de Historia, Geografía, Biología, Psicología, Filosofía, Cívica, Lenguaje, Literatura y Comprensión Lectora tienen 0 errores/0 advertencias. Las demás incidencias requieren una intervención académica específica sobre sus preguntas, con fuentes o banco aprobado. Se detuvo esa ampliación de ámbito conforme a AGENTS.md (fallos previos fuera de la corrección de teoría); el informe no declara el catálogo completo válido.

El sanitizador no detecta contaminación ajena en los textos añadidos. La pregunta `bio_t11_s03_c06` sí se corrigió: no se atribuye hipertricosis al gen SRY; conserva ID, opciones y posición correcta. Fuentes en COMPLEMENTOS_TEMARIO_2027.md.

Evidencia detallada: `build/complement-catalog-validation.txt`; regresión: Temario2027ComplementsTest. App no ejecutada.
