# Revisión de la práctica de Inglés

02/11/2026. Ámbito: los 14 bancos de las semanas 01–07, sus fixtures, pruebas y documentación. Se conservan 140 IDs y se añaden 14 c11: 154 preguntas con cuatro opciones y tres segmentos de explicación. No se modifica la teoría, navegación ni configuración remota.

## Problemas corregidos

La pregunta antigua ing_t01_s01_c01 pedía completar una oración ausente y su clave no coincidía con la explicación. En 4.2 una pregunta de finalidad también tenía una clave distinta de la defendida en el desarrollo. Había 49 preguntas sobre «the lesson theory» con una respuesta genérica que no evaluaba ninguna oración concreta. Dos consignas adicionales carecían de contexto. Estos problemas justifican revisar todo el banco y ampliar los patrones de la auditoría; el resultado anterior sin alertas no significaba que Inglés estuviera correcto.

Los nuevos ejercicios incluyen la oración completa, la regla pertinente y su aplicación al sujeto, auxiliar o complemento específicos. Las lecturas originales incluyen en cada pregunta el pasaje, la evidencia y el motivo de la respuesta. No se pide adivinar datos ausentes ni convertir un ejemplo en una afirmación universal.

| Semanas | Contenido de práctica |
|---|---|
| 01 | Rutinas frente a acción en curso, concordancia, preguntas y negación, verbos de estado y cambios de sentido |
| 02 | Pasado regular/irregular, did más base, be en pasado, formas de futuro con instrucción explícita |
| 03 | Modal más base, capacidad, recomendación, prohibición frente a falta de obligación, there is/are, comparativos/superlativos |
| 04 | Patrones verbales, preferencias, solicitudes, causa, concesión, contraste y finalidad |
| 05 | Sujeto/objeto, posesivos/reflexivos, preposiciones, movimiento y orden de palabras |
| 06–07 | Lecturas completas: idea general, búsqueda específica, datos, referencia pronominal, contraste, inferencia limitada y ausencia de información |

Will y going to no se tratan como formas mutuamente excluyentes en todo contexto. Un modal frecuente después de in order that no se convierte en una obligación universal. Se distingue must not de do not have to y posibilidad de inferencia de datos explícitos.

## Fuentes de contraste

- [British Council: presente simple](https://learnenglishteens.britishcouncil.org/grammar/a1-a2-grammar/present-simple), [presente continuo](https://learnenglish.britishcouncil.org/free-resources/grammar/english-grammar-reference/present-continuous) y [verbos de estado](https://learnenglish.britishcouncil.org/grammar/c1-grammar/advanced-present-simple-continuous).
- [British Council: formas de futuro](https://learnenglish.britishcouncil.org/free-resources/grammar/english-grammar-reference/talking-about-future) y [pronombres personales](https://learnenglish.britishcouncil.org/grammar/english-grammar-reference/personal-pronouns).
- [Cambridge: in order to](https://dictionary.cambridge.org/grammar/british-grammar/in-order-to) y [so that / in order that](https://dictionary.cambridge.org/us/grammar/british-grammar/so-that-or-in-order-that).

Las oraciones y lecturas no se copian de estas páginas. Las referencias contrastan los patrones gramaticales; las respuestas de comprensión se justifican en sus propios pasajes.

## Evidencia y límites

`scripts/academic/review_english_practice.py` es una herramienta de autoría, no un corrector gramatical automático ni una dependencia de la app. Las claves se revisan según el contexto y las reglas descritas. El script comprueba alternativas distintas y completa todos los huecos en la conclusión, incluso cuando se elige un par de preposiciones.

Los 14 niveles pasan el loader real, CatalogValidator 0/0 y sanitizador sin contaminación. EnglishPracticeReviewTest comprueba contexto, IDs, fixtures, tres segmentos, claves y ausencia de detalles inventados en casos seleccionados. Compilación y pruebas: `build/english-practice-final.log` y `build/academic-final-validation.log`.

El render aislado acepta los textos en 42 vistas de 360 px en claro, oscuro y letra grande, sin fallbacks ni desbordamiento horizontal del documento. No se ejecuta Android. Teoría completa, dificultad avanzada, pronunciación/audio y comprobación física quedan pendientes. No se afirma que toda la app esté académicamente certificada.
