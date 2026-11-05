# Revisión de contexto y teoría — 03/11/2026

## Qué se comprobó y corrigió

La búsqueda inicial recorrió los recursos de veinte materias. La auditoría estructural vuelve a leer 418 niveles y 4 554 preguntas: no detecta sus patrones automáticos de relleno o estructura inválida. Esto no certifica las claves ni la coherencia de la teoría. En particular, una pregunta puede pasar esa auditoría y seguir sin exponer claramente su grupo o criterio.

### Razonamiento Verbal, semana 3

Se revisaron las teorías 3.1 y 3.2 y las diez preguntas de término excluido de 3.2. Los enunciados anteriores presentaban a veces una sola palabra como si fuera un grupo; el criterio quedaba implícito en las alternativas o solo aparecía en la explicación. Ahora el estudiante ve el grupo completo y el criterio pertinente.

Los diez IDs y los diez correctIndex permanecen iguales. Se reescribieron las explicaciones con criterio, aplicación y respuesta; se mejoraron los distractores de las dos preguntas sobre el procedimiento. No se atribuyen los ejercicios originales a un examen real.

La teoría distingue campo semántico, campo asociativo y familia léxica; tipo–clase y parte–todo; pertenencia y orden. Se eliminaron afirmaciones de continuación obligatoria donde había varias posibilidades, la supuesta escala sonora exacta de palabras y la exclusión emocional/cultural sin contexto. Se retiró la comparación injustificada entre término excluido y detección de fraude informático. Se ampliaron ejemplos de series alternadas, relaciones funcionales, clasificación gramatical y ambigüedad.

Se mantienen los cuatro mapas existentes entre ambos niveles, con sus nodos y conexiones. Cada teoría conserva desarrollo de estudio, tablas, ejemplos resueltos y un solo bloque Importante. No se sustituyen por una ficha corta.

### Inglés, semana 1

Se matizaron las teorías 1.1 y 1.2: usually, often y sometimes no se enseñan como porcentajes fijos. El presente simple no implica que un estado sea eterno; los verbos de estado normalmente usan formas simples cuando expresan estados, pero algunos admiten sentidos de acción o usos temporales. Se retiraron encabezados ingleses vacíos o duplicados en esas páginas. Se conserva la práctica de Inglés y sus claves.

## Archivos y validación

Archivos de producción: theory.md de raz_verbal/semana03/3.1 y 3.2; questions.json de 3.2; theory.md de ingles/semana01/1.1 y 1.2, bajo shared/src/commonMain/composeResources/files/aprender. Sus cinco copias de androidUnitTest se sincronizan. Respaldos previos en build/academic-backup-verbal-context y build/academic-backup-english-theory-context.

AcademicContextRepairTest añade cinco pruebas de carga real, contexto, IDs/claves, clasificación, gramática y equivalencia de fixtures. Compilación assembleDebug y 556 pruebas correctas (359 Android + 197 shared), sin fallos, errores u omitidas. Log: build/academic-context-repair-validation.log. Se revisó el diff del ámbito. No se ejecutó la aplicación, no se publicó y no se modificaron Firebase, navegación, vidas ni recompensas.

CatalogValidator devuelve 0 errores críticos en los cuatro niveles. Inglés devuelve 0 advertencias. Cada uno de los dos niveles de Razonamiento Verbal conserva una advertencia preexistente DEPTH_CHALLENGE_SHORTFALL: profundidad NORMAL y diez retos frente al objetivo orientativo de quince. Se registra explícitamente; no se presenta como un catálogo sin advertencias ni se cambia la profundidad o cantidad para ocultarla. AcademicSanitizer no detecta contaminación en los enunciados revisados.

## Fuentes de contraste

Se contrastan conceptos y reglas; los ejercicios y las explicaciones revisadas son redacción propia, no preguntas copiadas.

- MINEDU, relaciones léxico-semánticas: https://www.minedu.gob.pe/somospromo/pdf/preparacion/razonamiento-verbal/rv-relaciones-lexico-semanticas.pdf
- INTEF, familia léxica, campo semántico y campo asociativo: https://descargas.intef.es/recursos_educativos/It_didac/Leng_ESO/3/05/relaciones_lexico-semanticas/3_familia_de_palabras_campo_semntico_y_campo_asociativo_la_metfora_y_la_metonimia.html
- British Council, verbos de estado: https://learnenglish.britishcouncil.org/free-resources/grammar/b1-b2/stative-verbs
- British Council, frecuencia: https://learnenglish.britishcouncil.org/free-resources/grammar/english-grammar-reference/how-often

## Pendiente

No se ha certificado toda la teoría ni todas las claves de la app. Continúa pendiente la revisión semántica de los demás niveles, la interpretación de preguntas ambiguas, el contraste de datos históricos/científicos específicos y la comprobación visual del contenido en Android. Los catálogos Kotlin legacy no se han reescrito en esta intervención. La ausencia de avisos automáticos no equivale a ausencia de errores académicos.
