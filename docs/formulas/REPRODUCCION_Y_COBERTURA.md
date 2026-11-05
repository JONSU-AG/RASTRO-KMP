# Reproducción académica y cobertura real

## Implementado el 01/11/2026

`ResolutionPlayback` reutiliza la explicación original en ejemplos de teoría, el diálogo de explicación de Aprender y el visor de preguntas de Mis errores/revisión del simulador. Permite reproducir, pausar, reiniciar, avanzar, retroceder y ver completa. Se detiene al salir de primer plano. No tiene audio ni genera razonamientos. No añade efectos de escritura que interrumpan una fórmula o dificulten la lectura.

Divide párrafos y oraciones respetando decimales, abreviaturas frecuentes y fórmulas delimitadas. Si el original es una sola oración, conserva esa explicación sin ofrecer una secuencia artificial. Una explicación genérica sigue siendo genérica: reproducirla no la valida ni la convierte en una solución.

`AcademicConceptMap` ofrece «Ver esquema de conceptos» cuando una sección contiene entre dos y ocho ramas explícitas o una lista tabulable de definiciones. Revela los términos del texto con controles manuales. Las líneas representan agrupación bajo el encabezado, no causalidad, cronología ni un procedimiento. La explicación completa sigue en su lugar.

`GeometryConstructionCard` dibuja progresivamente dos ejemplos ilustrativos con controles y deslizador:

- Geometría 3.1, sección «Definición y propiedades fundamentales del triángulo»: lados, ángulos interiores y suma de 180°.
- Geometría 7.1, sección «Propiedades fundamentales de la circunferencia»: circunferencia, radio, diámetro y perpendicularidad radio–tangente.

Se decide por materia y encabezado explícito, no por los títulos genéricos de curso ni por los números de semana. No aplica el resultado 180° a un polígono cualquiera. No superpone estos ejemplos a una pregunta ni inventa sus datos.

## Qué queda por área

| Área | Disponible ahora | Trabajo académico pendiente |
|---|---|---|
| Geometría | Dos construcciones nuevas; Pitágoras existente donde hay correspondencia explícita | Diagramas individuales de semejanza, congruencia, áreas y sólidos; soluciones con los datos de cada ejercicio |
| Física | Diagramas existentes de vectores, dimensiones, movimiento, fuerzas y Ohm; reproducción de explicaciones | Más problemas con derivaciones y dibujos vinculados a los datos reales |
| Álgebra y Trigonometría | Parábola y circunferencia trigonométrica existentes en temas reconocidos; fórmulas y reproducción | Transformaciones algebraicas paso a paso verificadas por ejercicio |
| Aritmética y razonamientos matemático/lógico | Fórmulas, tablas, reproducción y esquemas cuando la fuente los permite | Rectas numéricas, conjuntos y diagramas específicos para problemas reales |
| Química y Biología | Reproducción y esquemas de términos explícitos | Reacciones, estructuras y procesos con diagramas propios sustentados en el contenido |
| Historia y Geografía | Reproducción, tablas y esquemas de clasificación | Líneas de tiempo y mapas solo con fechas, lugares y relaciones verificadas |
| Lenguaje, comprensión, razonamiento verbal, Literatura e Inglés | Reproducción de explicaciones, notación y esquemas de términos | Análisis visual de oraciones y textos, sin inventar interpretaciones ni citas |
| Filosofía, Psicología y Cívica | Reproducción y esquemas según las listas existentes | Comparaciones y relaciones conceptuales revisadas por tema |

La infraestructura es compartida; no significa que cada tema tenga ya una ilustración específica. Los 1.354 rellenos pendientes registrados en `../aprender/AUDITORIA_MUESTRA_2026-11-01.md` requieren revisión académica y no se corrigieron en esta intervención.

## Comprobaciones

Las pruebas recorren las explicaciones del primer archivo de preguntas de cada materia con recursos, verificando que la segmentación conserve todos los caracteres no blancos. Hay pruebas de delimitadores matemáticos, decimales, abreviaturas, ausencia de pasos inventados, extracción de términos y correspondencia con los encabezados reales de Geometría. Eso comprueba integridad de presentación, no validez de todas las respuestas.

No se ejecutó Android, no se publicó ninguna versión y no se alteraron catálogos, preguntas, claves, Firebase, progreso ni recompensas. La revisión física de tamaño, scroll, controles y accesibilidad sigue pendiente.


## Avance académico del bloque 01

Trigonometría 1.1 y Geometría 3.1/7.1: 33 preguntas con resoluciones revisadas (30 IDs conservados y c11 añadido a cada nivel). Siete ejercicios cuentan además con giro angular vinculado a un valor explícito en sus propios datos, disponible al abrir la explicación. Ver ../aprender/REVISION_ACADEMICA_BLOQUE_01.md. El conteo histórico de 1.354 rellenos pasa a 1.330; no se considera terminado el banco ni la cobertura de gráficos por tema.


Bloque 02: Álgebra 1.1 y 1.2 y 24 preguntas puntuales de razonamiento, con diagrama de Venn reproducible. Detalle en ../aprender/REVISION_ACADEMICA_BLOQUE_02.md. La auditoría estructural cubre ahora todos los recursos, pero sigue pendiente la revisión académica total; consultar ../aprender/CIERRE_POR_NIVEL.md.


Bloque 03: seis niveles completos (Química 1.1/1.2, Física 2.1/2.2 y Aritmética 1.1/1.2), 66 preguntas, gráfico de densidad y reparaciones de teoría. Detalle y límites en ../aprender/REVISION_ACADEMICA_BLOQUE_03.md. La revisión total sigue pendiente.

## Práctica de Álgebra 02–16 (02/11/2026)

Se sustituyeron 30 bancos incompletos o genéricos por 330 ejercicios originales de aplicación, con cinco modelos por nivel y variantes numéricas comprobadas. Sus tres pasos ya sirven al reproductor de explicaciones existente. Esto no agrega un dibujo por ejercicio ni cierra la revisión de toda la teoría o la dificultad avanzada. Ver [detalle y límites](../aprender/algebra/REVISION_PRACTICA_02_A_16.md). El conteo vigente de preguntas con alertas es 1.141; los números de apartados anteriores son históricos.

02/11/2026: revisada la práctica pendiente de Física y Trigonometría: 484 ejercicios en 44 niveles, con resoluciones en tres pasos compatibles con el reproductor existente. No se agregan dibujos particulares para cada ejercicio. Detalle y límites en docs/aprender/fisica/REVISION_PRACTICA_PENDIENTE.md y docs/aprender/trigonometria/REVISION_PRACTICA_PENDIENTE.md. Conteo vigente global: 4.422 preguntas, 770 con alertas automáticas; no tener alertas tampoco equivale a certificación académica.

02/11/2026: práctica pendiente de Geometría revisada: 220 ejercicios en 20 niveles, sin alterar los pilotos 3.1/7.1. Resoluciones por pasos compatibles con el reproductor, sin gráficos individuales nuevos. Informe en docs/aprender/geometria/REVISION_PRACTICA_PENDIENTE.md. Auditoría global vigente: 4.442 preguntas, 570 con alertas. Sin alertas no equivale a validación académica de todo el contenido.

02/11/2026: práctica pendiente de Aritmética revisada: 264 ejercicios en 24 niveles; 1.1/1.2 conservados. Informe: docs/aprender/aritmetica/REVISION_PRACTICA_PENDIENTE.md. Resoluciones reproducibles en tres partes, sin nuevos gráficos individuales. Auditoría global: 4.466 preguntas, 458 con alertas. La teoría y los demás bancos no se declaran certificados por ausencia de alertas.

## Estado actual: 02/11/2026

Los conteos de apartados previos son históricos. El inventario actual tiene 4.538 preguntas de recursos nuevos, 418 niveles, cero coincidencias con los patrones de relleno vigentes y 164 advertencias por cantidad en materias pendientes. La revisión técnica no certifica todas sus respuestas. Ver ../aprender/REVISION_PRACTICA_TOTAL_2026-11-02.md.

Mapas: 130 esquemas gráficos, incluidos 18 adaptados en esta continuación; 184 bloques de texto conservados. Los 304 nodos nuevos y sus conexiones pasan pruebas y sus etiquetas se comprueban en el motor aislado. Detalle en ../aprender/MAPAS_REVISADOS_2026-11-02.md. No hay todavía un dibujo o animación gráfica individual para toda pregunta.

Actualización posterior de lectura: 4.554 preguntas de recursos y 148 advertencias por cantidad restantes; Comprensión Lectora tiene 176 ejercicios con pasaje y evidencia. La validación global aislada acepta 10.478 fragmentos en 1.254 vistas. AssembleDebug y 455 pruebas correctas en build/reading-practice-final-validation.log. Cobertura de mapas sin cambios: 130 gráficos, 184 bloques conservados.

## Continuación: cinco mapas de Química, 02/11/2026

Revisados los esquemas de 1.1–5.1: 86 nodos y 81 conexiones explícitas. Cuatro bloques antes conservados como texto pasan al visor; Materia ya tenía un mapa básico y ahora conserva también definiciones y condiciones. Cobertura actual: **134 mapas y 180 bloques de texto**, ningún Mermaid sin soporte. Las preguntas de estos cinco bancos no cambian, comprobado por huellas SHA-256.

El motor matemático aislado verifica las 86 etiquetas: 13 fragmentos y 15 vistas en claro, oscuro y letra grande a 360 px, sin errores. Detalle y fuentes en docs/aprender/quimica/MAPAS_REVISADOS_2026-11-02.md. AssembleDebug y 462 pruebas correctas (265 Android, 197 shared), sin fallos. Esto no certifica toda la teoría ni gráficos propios para cada pregunta. Revisión física de Android pendiente.

02/11/2026, continuación de Química 6.1–8.1: tres mapas, 61 conceptos y tres tablas; preguntas intactas. Cobertura actual: 137 mapas, 177 bloques conservados y ningún Mermaid sin soporte. assembleDebug y 463 pruebas repetidas correctas (266 Android y 197 shared), sin fallos, errores u omitidas. Log: build/chemistry-maps-continuation-validation.log. Ver docs/aprender/quimica/MAPAS_6_A_8_2026-11-02.md. La revisión completa de teoría y la comprobación en teléfono siguen pendientes.

02/11/2026, cierre de esquemas de Química 9.1–15.1: siete mapas con 130 nodos y cinco tablas. Cobertura global: 144 mapas y 170 bloques conservados; ningún Mermaid sin soporte. Corrección del motor de subíndices, 465 pruebas correctas y regresión aislada de 4.554 preguntas sin errores. El resto de teoría y la revisión física siguen pendientes; detalle en docs/aprender/quimica/MAPAS_9_A_15_2026-11-02.md.

02/11/2026: Razonamiento Verbal, 26 mapas con 274 conceptos, cuatro tablas y tres procedimientos duplicados sustituidos por referencias. Preguntas intactas y fixtures equivalentes; correcciones gramaticales puntuales documentadas en docs/aprender/raz_verbal/MAPAS_Y_CLARIDAD_2026-11-02.md. Cobertura actual: 170 mapas y 141 bloques conservados, ninguno Mermaid sin soporte. assembleDebug y 468 pruebas repetidas correctas (271 Android y 197 shared), sin fallos, errores u omitidas. Log: build/verbal-maps-validation.log. Revisión completa y teléfono pendientes.

02/11/2026: Comprensión Lectora, 22 mapas con 256 nodos y seis tablas; preguntas intactas. Cobertura global actual: 192 mapas y 118 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 471 pruebas repetidas correctas (274 Android y 197 shared), sin fallos, errores u omitidas. Log: build/reading-maps-validation.log. Detalle: docs/aprender/comprension_lectora/MAPAS_Y_CLARIDAD_2026-11-02.md. La teoría completa y el teléfono siguen pendientes.

03/11/2026: Filosofía, semanas 02–05, ocho mapas con 152 nodos y cuatro tablas; preguntas intactas. Cobertura global: 200 mapas y 110 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 474 pruebas repetidas correctas (277 Android y 197 shared), sin fallos, errores u omitidas. Log: build/philosophy-maps-02-05-validation.log. Ver docs/aprender/filosofia/MAPAS_02_A_05_2026-11-03.md. Resto de teoría y teléfono pendientes.

03/11/2026: Filosofía 06–08, cuatro mapas con 68 nodos y cuatro tablas; seis bancos intactos. Cobertura global: 204 mapas y 104 bloques conservados, ninguno Mermaid sin soporte. assembleDebug y 477 pruebas repetidas correctas (280 Android y 197 shared), sin fallos, errores u omitidas. Log: build/philosophy-maps-06-08-validation.log. Detalle: docs/aprender/filosofia/MAPAS_06_A_08_2026-11-03.md. Resto de teoría y teléfono pendientes.

03/11/2026: Filosofía 09–13, diez mapas y cinco tablas; 174 nodos y diez bancos intactos. Cobertura global actual: 214 mapas y 94 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 480 pruebas repetidas correctas (283 Android y 197 shared), sin fallos, errores u omitidas. Log: build/philosophy-maps-09-13-validation.log. Los 24 esquemas de Filosofía identificados en 02–13 ya se adaptaron, pero la teoría completa, preguntas de esta materia y el teléfono siguen pendientes. Ver docs/aprender/filosofia/MAPAS_09_A_13_2026-11-03.md.

03/11/2026: Cívica 01–03, seis mapas con 102 nodos y tres tablas; seis bancos intactos. Cobertura global actual: 220 mapas y 88 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 483 pruebas repetidas correctas (286 Android y 197 shared), sin fallos, errores u omitidas. Log: build/civics-maps-01-03-validation.log. Ver docs/aprender/civica/MAPAS_01_A_03_2026-11-03.md. Revisión normativa integral y teléfono pendientes.

03/11/2026: reparado Inglés 5.1, 5.2 y 6.2: pirámide y tablas partidas reconstruidas, mapa de 17 nodos compatible, aviso adaptable y correcciones de reglas absolutas. Tres bancos intactos por SHA-256. Cobertura global: 220 mapas y 85 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 486 pruebas repetidas correctas (289 Android y 197 shared), cero fallos, errores u omitidas. Log: build/english-theory-layout-validation.log. Detalle: docs/aprender/ingles/TEORIA_05_Y_06_2026-11-03.md. Resto de teoría y teléfono pendientes.

03/11/2026: Geografía 05–06, cuatro teorías revisadas en sus esquemas: dos mapas nuevos con 34 nodos y cuatro tablas. Preguntas intactas por SHA-256 y fixtures equivalentes. Cobertura global: 222 mapas y 81 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 489 pruebas repetidas correctas (292 Android y 197 shared), sin fallos, errores u omitidas. Log: build/geography-maps-05-06-validation.log. Detalle: docs/aprender/geografia/MAPAS_05_Y_06_2026-11-03.md. Resto académico y teléfono pendientes.

03/11/2026: Geografía 07, seis dibujos de ancho fijo sustituidos en dos teorías: cuatro mapas nuevos (68 nodos, 64 conexiones) y cuatro tablas. Bancos intactos por SHA-256 y fixtures equivalentes. Correcciones asociadas a zona fótica, relieve e inundabilidad; resto académico pendiente. Cobertura global: 226 mapas y 75 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 492 pruebas repetidas correctas (295 Android y 197 shared), cero fallos, errores u omitidas. Log: build/geography-maps-07-validation.log. Informe: docs/aprender/geografia/MAPAS_07_2026-11-03.md. Android no ejecutado ni publicado.

03/11/2026: Geografía 08, dos perfiles ASCII sustituidos por dos mapas (34 nodos y 32 conexiones) y dos tablas. Los ocho nodos regionales previos se conservan; Yunga marítima/fluvial diferenciadas y rangos contextualizados. Bancos intactos por SHA-256 y fixtures equivalentes. Cobertura global: 228 mapas y 73 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 495 pruebas repetidas correctas (298 Android y 197 shared), sin fallos, errores u omitidas. Log: build/geography-maps-08-validation.log. Informe: docs/aprender/geografia/MAPAS_08_2026-11-03.md. Resto académico y revisión física pendientes; sin publicación.

03/11/2026: Geografía 11–12, cuatro esquemas sustituidos por cuatro mapas (68 nodos, 64 conexiones) y cuatro tablas. Interpretación de pirámides sin diagnósticos automáticos, PET distinta del intervalo demográfico y agricultura comparada sin estereotipos regionales. Cuatro bancos intactos por SHA-256 y fixtures equivalentes. Cobertura global: 232 mapas y 69 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 502 pruebas repetidas correctas (305 Android y 197 shared), cero fallos, errores u omitidas. Log: build/geography-maps-11-12-validation.log. Informe: docs/aprender/geografia/MAPAS_11_Y_12_2026-11-03.md. Revisión integral y teléfono pendientes; sin publicación.


Estado vigente 04/11/2026: el reproductor de frases fue retirado. Las resoluciones textuales se muestran completas; los controles se conservan en demostraciones graficas reales. Pilotos 3D: Biologia 5.4, celula vegetal con partes; 8.3, corazon. Ambos en teoria de Aprender y Material. La cobertura de todas las materias sigue pendiente.
