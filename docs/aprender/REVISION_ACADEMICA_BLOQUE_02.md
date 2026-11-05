# Revisión académica — bloque 02 y auditoría estructural total

01/11/2026. Intervención sobre recursos nuevos, no catálogos Kotlin legacy. Se mantienen rutas, IDs existentes, temario, progreso, Firebase y recompensas.

## Alcance corregido

- Álgebra 1.1 y 1.2: 22 preguntas completas. Conserva los veinte IDs existentes y añade c11 a cada nivel para cumplir el mínimo NORMAL. Sustituye preguntas incompletas, ejercicios de relleno y explicaciones sin desarrollo por ejercicios originales sobre conjuntos y cuantificadores. No se presentan como problemas oficiales de admisión.
- Razonamiento lógico, semanas 1–5, subnivel .2: c03 y c04 de cada nivel (10 preguntas).
- Razonamiento matemático, semanas 1–7, subnivel .2: c03 y c04 de cada nivel (14 preguntas).

Las 24 de razonamiento tenían alternativas literalmente repetidas, algunas sin relación con el concepto. Ahora cada pregunta contiene cuatro alternativas distintas del mismo ámbito y explicación específica. No se declaran revisadas las restantes preguntas de esos doce niveles.

Cambios que requieren distinguir reconstrucción de sustitución: la pregunta de regla de tres sobre «qué va en el denominador» se sustituye por una situación completa de trabajadores y días; la interpretación ambigua de una coma se cambia por evaluación explícita de 4x−10 y 4(x−10) con x=5. El pétalo se define mediante dos cuartos de círculo en un cuadrado, sin depender de una imagen ausente; el perímetro perforado se concreta como un anillo. El ejercicio estadístico usa cinco datos explícitos, evitando asumir que toda distribución simétrica tenga media finita o que su moda esté definida de manera única.

## Fuentes y verificación

Se contrastó con la teoría de cada nivel. Para conjuntos: OpenStax [1.4 Set Operations with Two Sets](https://openstax.org/books/contemporary-mathematics/pages/1-4-set-operations-with-two-sets) y [1.5 Set Operations with Three Sets](https://openstax.org/books/contemporary-mathematics/pages/1-5-set-operations-with-three-sets). Para inclusión–exclusión: [Mathematics for Computer Science, MIT, capítulo Cardinality Rules](https://ocw.mit.edu/courses/6-042j-mathematics-for-computer-science-spring-2015/mit6_042js15_textbook.pdf). Ejercicios y números propios, sin copiar los de las publicaciones.

Comprobaciones independientes: enumeración de conjuntos finitos, identidades booleanas para todas las parejas de subconjuntos de un universo de cuatro elementos, inclusión–exclusión de dos y tres conjuntos y enumeración de los ocho resultados de tres lanzamientos. Cada alternativa y resolución de las 46 preguntas se revisó; no se extendió una misma explicación genérica a todo el nivel.

Los originales locales no se consideran una autoridad infalible: Álgebra TEMA_01 cambia de 75 a 74 durante una solución; Trigonometría TEMA_01 prueba valores que no cumplen una ecuación antes de seleccionar respuesta. Esos textos no se restauraron automáticamente a la app.

## Gráfico nuevo

`SetOperationsCard`: ejemplo A={1,2,3}, B={3,4}. Permite seleccionar unión, intersección, A−B y diferencia simétrica, reproducir/pausar, reiniciar y recorrer el sombreado. Los resultados se calculan mediante operaciones de conjuntos, no cadenas intercambiadas. Se muestra solo bajo el encabezado de operaciones entre conjuntos de Álgebra, separado de los retos. Pausa en segundo plano y usa notación local.

## Auditoría completa de estructura

`python scripts/academic/audit_readiness.py` recorre todos los questions.json de los recursos: 20 materias, 418 niveles, 4.342 preguntas después de añadir los dos c11 de Álgebra. Genera el informe en `estado/AUDITORIA_ESTRUCTURAL_TOTAL.md` y las incidencias por pregunta en su JSON contiguo.

Cuenta por separado enunciados genéricos, alternativas genéricas, explicaciones genéricas, IDs repetidos, índices fuera de rango y alternativas textualmente repetidas. La comparación distingue mayúsculas, necesarias en ejercicios de genética y ortografía. No determina si una respuesta es verdadera ni si falta una figura o lectura; ausencia de alertas no equivale a validación académica.

El conteo ampliado tras esta intervención es 1.453 preguntas con alguna alerta automática. El conteo histórico limitado a dos patrones de relleno queda en 1.321. Son medidas distintas, no avances intercambiables. La revisión completa del banco y los gráficos específicos de los temas restantes **no están terminados**.

## Validación

- `AcademicBlock02Test`: dos niveles de Álgebra desde loader de producción, validador sin errores/advertencias y sanitizador; 24 preguntas de razonamiento con alternativas distintas y resolución segmentada; cálculos independientes.
- `AcademicAllResourcesStructureTest`: recorre los recursos completos y comprueba IDs por nivel, alternativas distintas e índices válidos. No certifica las claves.
- 124 fragmentos matemáticos de las 46 preguntas aceptados por KaTeX local, sin errores (`build/academic-block02-math-report.json`).
- Fuentes y fixtures de los archivos afectados conservados equivalentes. Copia previa en `build/academic-backup-block02/`.
- Android no ejecutado ni publicado. Inspección física del diagrama de Venn y de las preguntas pendiente.
