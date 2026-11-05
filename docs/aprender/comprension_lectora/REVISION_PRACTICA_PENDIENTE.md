# Práctica revisada de Comprensión Lectora

02/11/2026. Ámbito: 16 bancos de los niveles existentes y sus fixtures. Se conservan los 160 IDs y se añade un c11 por nivel: 176 preguntas. Los títulos, teoría, navegación, Firebase y catálogo Kotlin legacy quedan fuera de este lote.

## Cambio didáctico

El banco anterior se concentraba en definiciones, con alternativas a menudo ajenas a la tarea. Algunos ejemplos usaban explicaciones científicas simplificadas que no hacían falta para evaluar lectura. Se sustituye por práctica con textos originales incluidos íntegramente en cada pregunta; no hay que recuperar un pasaje de la pregunta anterior.

La explicación localiza una cita del pasaje, justifica la interpretación y concluye. Las citas se contrastan automáticamente con la cadena original; esa comprobación demuestra fidelidad textual, no valida por sí sola la interpretación. Las claves se revisan por su relación con el contenido.

| Semanas | Práctica |
|---|---|
| 01 | Datos, paráfrasis, negación, cantidades, límites y ausencia de registro distinta de resultado cero |
| 02 | Inferencia sustentada, requisitos frente a acciones realizadas, causas frente a observaciones y límites de generalización |
| 03 | Tema, idea principal, título, síntesis y papel de los detalles |
| 04 | Propósito comunicativo y tono, sin atribuir intenciones no respaldadas |
| 05 | Compatibilidad distinta de implicación, contradicción distinta de información ausente, dato verificable distinto de dato ya verificado u opinión |
| 06 | Sentidos contextuales, usos literales/figurados y matices sin depender de una definición aislada |
| 07 | Referentes, conectores, elipsis, ambigüedad, pertinencia y redundancia con criterio de supresión explícito |
| 08 | Predominio narrativo/descriptivo/expositivo/argumentativo, textos mixtos, contraste entre fragmentos y alcance de cuantificadores |

No se sostiene que toda idea secundaria deba eliminarse ni que toda lectura permita una conclusión única sobre datos omitidos. En las preguntas de supresión, si dos versiones repiten información, se indica cuándo conservar la primera; así no hay dos respuestas igualmente defendibles por una consigna imprecisa.

Las lecturas son ficticias y originales. No se atribuyen a escritores, exámenes o instituciones reales. Las cifras y actividades pertenecen a esos escenarios; no son estadísticas del uso de RASTRO.

## Contraste didáctico

- [Instituto Cervantes: comprensión lectora](https://cvc.cervantes.es/ensenanza/biblioteca_ele/diccio_ele/diccionario/comprensionlectora.htm).
- [Instituto Cervantes: cohesión](https://cvc.cervantes.es/ensenanza/biblioteca_ELE/diccio_ele/diccionario/cohesion.htm).
- [Ministerio de Educación de Ecuador: ideas principales e inferencias](https://recursos.educacion.gob.ec/red/las-ideas-principales/).

Se contrastan estrategias y distinciones, sin copiar textos ni ejercicios de las fuentes.

## Evidencia y límites

`scripts/academic/review_reading_practice.py` mantiene las preguntas estáticas y comprueba que sus citas existan en el pasaje. La app no ejecuta ese script. Preview, conservación de IDs y fixtures equivalentes; respaldo anterior en `build/academic-backup-comprension_lectora/`. Render aislado: 48 vistas en claro/oscuro/letra grande a 360 px sin fallbacks o desbordamiento del documento. Este lote no utiliza fórmulas matemáticas.

ReadingPracticeReviewTest comprueba todos los enunciados con pasaje, cuatro opciones distintas, tres partes de explicación, claves seleccionadas sobre ambigüedad, datos desconocidos, hechos/opiniones y cuantificadores. Resultado de compilación y pruebas en `build/reading-practice-final-validation.log`; cierre comprobado en CHECKLIST.md.

No se ejecuta Android. Teoría completa, dificultad avanzada, mapas propios de cada pasaje y revisión física siguen pendientes. Tener citas y no tener alertas no certifica por sí solo todas las interpretaciones ni el resto de la app.
