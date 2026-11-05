# Revisión de la práctica pendiente de Aritmética

02/11/2026. Ámbito: ambos niveles de las semanas 02–13, 24 bancos y fixtures equivalentes. Se sustituyen 240 preguntas por 264 ejercicios explícitos, once diferentes por nivel. Se conservan los 240 IDs y se añade c11 por nivel. Los bancos 1.1/1.2 de conjuntos quedan sin cambios y sus hashes se comprueban antes y después. La materia suma 286 preguntas en 26 niveles.

No se modifica la teoría, los títulos, el temario, el catálogo Kotlin legacy, la navegación ni Firebase. La revisión de práctica no certifica la teoría completa ni la cobertura avanzada o gráfica.

## Conceptos revisados

| Semanas | Revisión |
|---|---|
| 02 | División euclidiana, complemento respecto de una potencia indicada, bases válidas, conversión y conteo de cifras sin ceros iniciales |
| 03 | Divisibilidad, primos, factorización, número/suma de divisores, MCD/MCM y ciclos inicialmente sincronizados |
| 04 | Signos, orden, potencias con paréntesis, valor absoluto y soluciones enteras/no negativas de ecuaciones diofánticas |
| 05 | Fracciones, recíproco no nulo, densidad racional, decimales finitos/periódicos y fracciones exactas |
| 06 | Razones, proporciones, media geométrica positiva y series de razones con denominadores admisibles |
| 07 | Proporcionalidad bajo hipótesis constantes, reparto directo/inverso, capital×tiempo por acuerdo explícito y regla compuesta |
| 08 | Base de porcentajes, cambios sucesivos, costo frente a venta y escala de longitudes/áreas/volúmenes |
| 09 | Sucesiones con regla explícita, progresiones aritméticas/geométricas y conteo por grupos de cifras |
| 10 | Sumatorias, modelos de interés/descuento definidos y conservación de masa/soluto en mezclas |
| 11 | Media, mediana, moda, estimación con datos agrupados, varianza poblacional/muestral y convenciones explícitas de cuartiles/percentiles |
| 12 | Producto/suma, factorial, combinación frente a cargos ordenados, repetición, bloques, ceros iniciales y simetrías circulares |
| 13 | Equiprobabilidad, complemento/unión, reemplazo, independencia/exclusión, condicionamiento positivo, probabilidad total y Bayes |

Los enunciados no dependen de la pregunta anterior. Los repartos y modelos de interés son ejercicios con reglas y supuestos declarados, no afirmaciones de rendimientos comerciales reales. Las mezclas conservan masas y componentes bajo condiciones explícitas; no se supone que los volúmenes de líquidos siempre sean aditivos.

Las sucesiones indican una fórmula o su tipo: no se pretende demostrar un siguiente término único a partir de unos pocos valores. Las estadísticas agrupadas mediante marcas se denominan estimaciones. La varianza indica si se divide por N o n−1. Los cuartiles y percentiles declaran su convención cuando esta puede cambiar el resultado.

## Comprobación

`scripts/academic/review_arithmetic_practice.py` contiene 216 ejercicios numéricos y 48 conceptuales. Los numéricos se contrastan con aritmética racional exacta, factorización, divisores, enumeración finita, combinaciones, sumas y fórmulas explícitas. Los conceptuales contienen su argumento en tres partes; el verificador no reemplaza esa revisión conceptual.

Se reutilizan las utilidades locales de autoría de los lotes anteriores. No se añade una dependencia ni un generador al runtime de la app. Los recursos finales son JSON estáticos.

Las alternativas son matemáticamente distintas. Los conteos combinatorios y resultados enteros sin unidad de estos ejercicios usan enteros. Las probabilidades se mantienen entre cero y uno, sin alternativas imposibles por una escala incorrecta. Cuando se pide una fracción, se conserva la fracción exacta en las alternativas y en la conclusión, en vez de convertirla otra vez a decimal.

Evidencia local: `build/arithmetic-pending-proofs.json`, `build/arithmetic-pending-preview.json`, `build/arithmetic-pending-render.json` y copia anterior en `build/academic-backup-arithmetic-pending/`. No son un respaldo remoto.

## Fuentes de contraste

- [OpenStax, porcentaje](https://openstax.org/books/prealgebra-2e/pages/6-1-understand-percent) e [interés simple](https://openstax.org/books/prealgebra-2e/pages/6-4-solve-simple-interest-applications).
- [OpenStax, medidas de dispersión](https://openstax.org/books/introductory-statistics-2e/pages/2-7-measures-of-the-spread-of-the-data).
- [OpenStax, reglas de probabilidad](https://openstax.org/books/introductory-statistics-2e/pages/3-3-two-basic-rules-of-probability).
- [Wolfram MathWorld, coeficiente binomial](https://mathworld.wolfram.com/BinomialCoefficient.html), [ecuación diofántica](https://mathworld.wolfram.com/DiophantineEquation.html) y [teorema de Bayes](https://mathworld.wolfram.com/BayesTheorem.html).

Se contrastan las definiciones y las condiciones, sin copiar ejercicios de las fuentes. Los problemas son originales de RASTRO; no se atribuyen a exámenes oficiales.

## Evidencia y límites

El renderizador aislado acepta 1.410 fragmentos y muestra todos los enunciados, alternativas y resoluciones en 72 vistas: 24 niveles en claro, oscuro y letra grande a 360 px. Cero errores, fallbacks, peticiones externas o desbordamiento horizontal del documento. Se inspeccionan capturas de decimales periódicos, varianza y probabilidad con/sin reemplazo. Las expresiones largas conservan scroll horizontal interno.

No se agregan gráficos por ejercicio ni se ejecuta Android. Quedan pendientes teoría completa, profundidad avanzada, dibujos individuales y revisión física en teléfono. El resultado final de pruebas se registra en el checklist y en `build/arithmetic-practice-final.log`.

Al cerrar este lote, la auditoría global cuenta 4.466 preguntas y 458 con alertas. El informe vigente se regenera en `../estado/AUDITORIA_ESTRUCTURAL_TOTAL.md`. No tener alertas no certifica todo el contenido ni los bancos ajenos a Aprender.

Validación final: assembleDebug y 242 pruebas Android repetidas, cero fallos, errores u omitidas. ArithmeticPracticeReviewTest carga los 26 niveles y comprueba casos de fracciones periódicas, varianza N frente a n−1, percentil con convención, código con cero inicial, reemplazo y Bayes. CatalogValidator: cero errores y cero advertencias. Log: build/arithmetic-practice-final.log.
