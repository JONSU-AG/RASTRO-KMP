# Mapas del contenido de Aprender — 02/11/2026

Se comprobaron 130 esquemas gráficos conectados al visor existente de las teorías de Aprender. Antes de este lote eran 112. Permanecen 184 bloques conservados como texto; algunos contienen avisos, cálculos o código y no son mapas mentales. No se afirma que todos deban convertirse en un grafo.

## Los 18 mapas añadidos

| Área | Niveles | Revisión |
|---|---|---|
| Razonamiento Lógico | 1.1–9.1, solo los nueve niveles .1 | Proposiciones, conectores, relaciones, inferencias, clases, consistencia, condicionales, orden y falacias |
| Razonamiento Matemático | 1.1–7.1, solo los siete .1, y 5.2 | Sucesiones, proporcionalidad, ecuaciones/edades, geometría, conteo, probabilidad y estadística |
| Inglés | 4.2 | Contraste, causa/resultado y finalidad |

Se sustituyen los dibujos anchos de caracteres por nodos y conexiones explícitos del formato gráfico que ya entiende la app. No se crea un segundo visor. Los mapas aparecen como «Mapa del tema»: se puede entrar en una rama, explorar conceptos y volver a sus padres o al inicio.

Los nuevos mapas contienen 304 nodos, con 286 conexiones explícitas. Las relaciones se redactan y revisan; no se adivinan a partir de una columna de texto. No se alteran preguntas, IDs, progreso, Firebase ni gamificación durante este lote de mapas. Fuentes y fixtures de teoría quedan equivalentes.

## Correcciones de contenido

- El condicional material no demuestra causalidad. Suficiencia y necesidad pueden leerse desde la misma flecha; no son automáticamente dos flechas opuestas.
- Bivalencia, tercero excluido y no contradicción se distinguen. Una contingencia tiene filas verdaderas y falsas; ser satisfacible no basta para llamarla contingencia.
- La deducción no se limita a «general a particular». En lógica de clases, una universal no demuestra por sí sola existencia.
- Orden circular: se precisa orientación y las condiciones para posiciones diametralmente opuestas.
- Sucesiones: la regla debe indicarse. Series geométricas infinitas: condición de convergencia. Conteo circular: giros frente a reflejos.
- Perímetro: se cuenta la frontera solicitada, incluidos bordes interiores cuando corresponda. Una proyección no conserva cualquier longitud.
- Probabilidad: equiprobabilidad para Laplace, probabilidad condicionante positiva e independencia distinta de incompatibilidad.
- Estadística: denominador poblacional/muestral, clases como estimación y convenciones de cuartiles.
- Inglés: se distingue conector más cláusula de conector más grupo nominal o infinitivo.

Las fuentes de contraste son las de los informes de práctica de [Lógico](raz_logico/REVISION_PRACTICA_PENDIENTE.md), [Matemático](raz_matematico/REVISION_PRACTICA_PENDIENTE.md) e [Inglés](ingles/REVISION_PRACTICA_PENDIENTE.md). El lote no certifica íntegramente todas las teorías; corrige los mapas y fragmentos concretos indicados.

## Evidencia

- LogicalTheoryMapsReviewTest carga las 18 teorías, comprueba sus 304 nodos, etiquetas, conexiones y accesibilidad desde la raíz; ningún nodo queda huérfano. Fixtures equivalentes y regresiones de las distinciones conceptuales anteriores.
- TheoryClarityTest recorre los recursos: 130 mapas con extremos válidos, ningún Mermaid sin soporte y 184 bloques de texto conservados. Detalle por archivo en `build/theory-map-coverage.txt`.
- Las 304 etiquetas pasan el motor matemático aislado: 75 fragmentos, 54 vistas en claro/oscuro/letra grande a 360 px, sin errores, fallbacks o desbordamiento del documento. Informe: `build/reviewed-maps-labels-render.json`.
- Compilación assembleDebug y 260 pruebas de androidApp más 192 de shared sin fallos, errores u omitidas. Log: `build/academic-maps-final-validation.log`.
- Respaldos anteriores en `build/academic-backup-logical-maps/` y `build/academic-backup-mathematical-maps/`; manifiestos de los cambios en `build/logical-maps-review.json` y `build/mathematical-maps-review.json`.

No se ejecutó Android ni se inspeccionó el mapa en un teléfono. La comprobación aislada de etiquetas y relaciones no certifica el tamaño final de sus controles en la app. Tampoco se añadió un gráfico de resolución particular para cada pregunta ni se dio por revisado el resto de bloques heredados.

## Continuación: cinco mapas de Química, 02/11/2026

Revisados los esquemas de 1.1–5.1: 86 nodos y 81 conexiones explícitas. Cuatro bloques antes conservados como texto pasan al visor; Materia ya tenía un mapa básico y ahora conserva también definiciones y condiciones. Cobertura actual: **134 mapas y 180 bloques de texto**, ningún Mermaid sin soporte. Las preguntas de estos cinco bancos no cambian, comprobado por huellas SHA-256.

El motor matemático aislado verifica las 86 etiquetas: 13 fragmentos y 15 vistas en claro, oscuro y letra grande a 360 px, sin errores. Detalle y fuentes en docs/aprender/quimica/MAPAS_REVISADOS_2026-11-02.md. AssembleDebug y 462 pruebas correctas (265 Android, 197 shared), sin fallos. Esto no certifica toda la teoría ni gráficos propios para cada pregunta. Revisión física de Android pendiente.
