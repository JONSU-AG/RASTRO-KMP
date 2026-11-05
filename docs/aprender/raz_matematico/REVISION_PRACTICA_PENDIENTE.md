# Práctica de Razonamiento Matemático

02/11/2026. Los 14 bancos suman 154 preguntas. Se conservan 140 IDs y se añaden 14 c11. Las c03/c04 de los niveles .2, semanas 01–07, mantienen exactamente sus catorce objetos JSON del bloque 02.

Se redactan los otros 140 ejercicios con datos completos: sucesiones con regla explícita, sumas, proporcionalidad y sus hipótesis, ecuaciones/edades, áreas y fronteras, conteo, probabilidad y estadística. Las resoluciones muestran regla, sustitución y conclusión, sin depender del ejercicio previo.

## Correcciones

- No se deduce una continuación infinita única de unos pocos términos sin especificar la regla.
- En edades se suma o resta el mismo tiempo a ambas personas; se comprueba la admisibilidad del resultado. No se conserva artificialmente la razón entre edades.
- Se diferencia perímetro de área, altura perpendicular de lado inclinado, frontera con hueco y escala lineal frente a escala de área/volumen.
- Se distingue equipo sin cargos de asignación de cargos, códigos de números con primera cifra no nula y giros de reflejos.
- Probabilidades con equiprobabilidad indicada, con/sin reemplazo, evento condicionante de probabilidad positiva, independencia y Bayes. Alternativas entre cero y uno.
- Varianza poblacional N frente a muestral n−1; marcas de clase como estimación y convención de cuartil explícita.

`scripts/academic/review_mathematical_reasoning.py` contrasta 119 resultados numéricos con cálculo racional, ecuaciones, recurrencia, sumas y enumeración de resultados o permutaciones. Los conceptos se justifican por sus argumentos; el cálculo no reemplaza esa revisión. No se añade un generador a la app.

Evidencia: `build/raz_matematico-pending-proofs.json` con hashes preservados, preview y render; respaldo previo en `build/academic-backup-raz_matematico/`. Fixtures equivalentes. El motor aislado acepta 757 fragmentos en 42 vistas de 360 px en claro, oscuro y letra grande, sin fallbacks ni desbordamiento del documento; las fórmulas largas conservan scroll interno.

Los 14 niveles pasan loader real, CatalogValidator 0/0 y sanitizador sin contaminación. Pruebas de regresión sobre recurrencia, edades, cero inicial, reemplazo, Bayes y denominadores de varianza. Validación integrada: `build/reasoning-practice-final.log` y `build/academic-final-validation.log`.

## Fuentes de contraste

- [OpenStax: principio del producto](https://openstax.org/books/contemporary-mathematics/pages/7-1-the-multiplication-rule-for-counting).
- [OpenStax: probabilidad condicionada](https://openstax.org/books/contemporary-mathematics/pages/7-9-conditional-probability-and-the-multiplication-rule).
- [OpenStax: dispersión y varianza](https://openstax.org/books/introductory-statistics-2e/pages/2-7-measures-of-the-spread-of-the-data).
- [Wolfram MathWorld: coeficientes binomiales](https://mathworld.wolfram.com/BinomialCoefficient.html) y [Bayes](https://mathworld.wolfram.com/BayesTheorem.html).

Ejercicios originales de práctica, sin atribuirlos a exámenes oficiales. Teoría completa, dificultad avanzada, gráficos propios por pregunta y prueba física siguen pendientes. Android no ejecutado ni publicado.
