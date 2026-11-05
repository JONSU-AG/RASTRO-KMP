# Comprensión Lectora: mapas y ayudas de lectura

## Ámbito

Dieciséis teorías de las semanas 01–08, sus fixtures y pruebas. Se conservan las 176 preguntas de los dieciséis bancos, sus IDs y el progreso. No se modifican el visor, Firebase, navegación, gamificación ni otras materias.

## Contenido y cambios

Se preparan 22 mapas con 256 nodos y 234 conexiones explícitas. Los mapas principales cubren lectura literal, inferencias, tema e idea central, propósito y tono, evaluación de información, vocabulario, coherencia y tipologías. Los complementarios trabajan indicios del tono, respaldo de afirmaciones y revisión antes de suprimir.

Se convierten 19 cuadros ASCII al visor y se añaden tres mapas que faltaban en 6.1, 7.2 y 8.2. Dos cuadros de estructura de párrafo pasan a tablas: comparar inicio, cierre y centro se entiende mejor con columnas. Dos cuadros de tonos mal ubicados en 7.1/7.2 se sustituyen por una nota sobre revisión del conjunto. El contenido de tonos se conserva en su propia semana.

Son seis tablas nuevas: organización de párrafos en ambos niveles de semana 03 y ayudas en 1.1, 2.1, 5.1 y 8.1. Los ejemplos añadidos son propios y se identifican como explicativos, sin presentarlos como preguntas de un examen real.

## Claridad académica

- No mencionado, no inferible y contradictorio no se tratan como equivalentes. Se conserva una categoría explícita de información no determinada.
- Local/global y prospectiva/retrospectiva no se colocan como subtipos obligatorios de deducción/inducción: son dimensiones diferentes.
- Una posición de la idea central no convierte un párrafo en una prueba lógica deductiva o inductiva.
- Se retira la supuesta regla universal de que un título no puede contener verbo conjugado.
- Se distingue el tono expresado de la emoción real de quien escribe, y se matizan etiquetas como crítico, asertivo e irónico.
- Se corrige que el infinitivo «empieza» en ar/er/ir: esas son terminaciones. Expresar un propósito con infinitivo se presenta como ayuda, no como obligación universal.
- La sustitución contextual no promete identidad matemática de todos los matices ni atribuye una intención universal a las comisiones de admisión.
- Suprimir requiere comprobar referencias y función del detalle; no se garantiza una respuesta por parecer más fluida.

Estos cambios no certifican la teoría heredada completa. Sus otros ejemplos, atribuciones y explicaciones todavía necesitan revisión; no se declaran corregidos por haber actualizado sus mapas.

## Fuentes de contraste

- [OCDE: marco de lectura PISA 2018](https://www.oecd.org/en/publications/pisa-2018-assessment-and-analytical-framework_b25efab8-en/full-report/component-3.html), integración, evaluación y distinción entre formato y finalidad.
- [Universidad Católica de Chile: coherencia y cohesión](https://www7.uc.cl/sw_educ/conectores/html/propiedad.html).
- [INTEF: la cohesión](https://descargas.intef.es/recursos_educativos/It_didac/Leng_ESO/1/06/La_comunicacion_oral_y_escrita/la_cohesin.html).
- [Ministerio de Educación de Ecuador: Lengua y Literatura](https://educacion.gob.ec/wp-content/uploads/downloads/2017/05/L7P1-128-marzo_low.pdf), relaciones entre ideas principales y secundarias.

Se consultaron recursos institucionales, sin atribuir a una universidad peruana reglas de examen que no fueron documentadas. Las clasificaciones por posición se mantienen como convenciones didácticas con condiciones, no como leyes universales.

## Evidencia y límites

- Dieciséis bancos conservados por SHA-256 y dieciséis fixtures equivalentes: build/reading-maps-review.json. Originales: build/academic-backup-reading-maps.
- 256 etiquetas y seis tablas, 48 vistas aisladas a 360 px en claro, oscuro y letra grande, sin errores. No se introducen fórmulas nuevas. Informe: build/reading-maps-render.json.
- ReadingTheoryMapsReviewTest comprueba accesibilidad de cada nodo, extremos de conexiones, tablas, contenido ajeno retirado, fixtures y regresiones de las distinciones anteriores.
- Cobertura global real: 192 mapas y 118 bloques conservados; ningún Mermaid sin soporte. Los bloques conservados no son todos mapas pendientes.

No se ejecuta Android ni se publica; la comprobación física de los controles permanece pendiente.

Validación final: assembleDebug y 471 pruebas repetidas correctas (274 Android y 197 shared), sin fallos, errores u omitidas. Log: build/reading-maps-validation.log.
