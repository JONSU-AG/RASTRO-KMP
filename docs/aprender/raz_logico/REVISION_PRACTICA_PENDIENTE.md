# Práctica de Razonamiento Lógico

02/11/2026. Los 18 bancos suman 198 preguntas. Se conservan los 180 IDs y se añaden 18 c11. Las diez c03/c04 de los niveles .2, semanas 01–05, conservan exactamente sus objetos JSON revisados en el bloque 02; no se vuelven a generar.

Los otros 188 ejercicios se redactan con datos explícitos y tres segmentos de explicación. Se cubren proposiciones, tablas, equivalencia, inferencias, clases/silogismos, consistencia, condicionales, orden y falacias. Se distingue verdad de validez, condicional de causalidad, suficiencia de necesidad, y ausencia de prueba de prueba de ausencia.

## Verificación

`scripts/academic/review_logical_practice.py` comprueba asignaciones booleanas completas, equivalencias, conclusiones verdaderas en todos los modelos compatibles, contraejemplos de cada distractor y permutaciones para los problemas de orden. Las preguntas de clases enumeran los patrones de ocupación de las ocho regiones de tres clases: la multiplicidad no cambia estas afirmaciones universales/existenciales. No se supone existencia a partir de una universal. Los casos de falacias se revisan mediante el argumento específico, no se presentan como demostrados por un contador.

Se guardan 135 comprobaciones numéricas o finitas y los hashes de las diez preguntas preservadas en `build/raz_logico-pending-proofs.json`. La herramienta es de desarrollo; la app recibe JSON estáticos. Fuentes y fixtures equivalentes, respaldo anterior en `build/academic-backup-raz_logico/`. Los enunciados no necesitan leer la pregunta anterior.

La comparación no se limita a buscar palabras: las alternativas formales se contrastan por sus valores. Esto detectó durante la autoría una segunda respuesta correcta que después se sustituyó por un distractor falso. No se modifican conectores del motor ni reglas de navegación.

El motor local acepta 670 fragmentos en 54 vistas (claro/oscuro/letra grande, 360 px), sin fallbacks ni desbordamiento del documento. Se comprueban los 18 niveles por el loader real, CatalogValidator 0 errores/0 advertencias y sanitizador sin contaminación. Compilación y pruebas del lote en `build/logical-practice-final.log` y validación integrada en `build/academic-final-validation.log`.

## Fuentes

- [OpenStax: tablas de verdad](https://openstax.org/books/contemporary-mathematics/pages/2-3-constructing-truth-tables).
- [OpenStax: argumentos lógicos](https://openstax.org/books/contemporary-mathematics/pages/2-7-logical-arguments).
- [OpenStax: enunciados y cuantificadores](https://openstax.org/books/contemporary-mathematics/pages/2-1-statements-and-quantifiers).
- [OpenStax: conjuntos](https://openstax.org/books/contemporary-mathematics/pages/1-1-basic-set-concepts).
- [OpenStax: falacias informales](https://openstax.org/books/introduction-philosophy/pages/5-5-informal-fallacies).

Los ejemplos son originales. No se copian ejercicios ni se atribuyen a exámenes oficiales. La revisión no certifica toda la teoría, gráficos individuales ni funcionamiento físico en teléfono. Android no ejecutado ni publicado.
