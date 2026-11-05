# Comprobaciones

- [x] Confirmado ámbito y localizada conversión destructiva de TeX/átomo genérico.
- [x] Fuentes y motor locales; integridad SHA-512 verificada contra metadatos npm.
- [x] Fórmulas principales, despejes y mnemotecnias matemáticas integrados.
- [x] Siete dibujos, diez lecciones y cinco fórmulas sin fallback entre materias.
- [x] assembleDebug y 184 pruebas Android correctas, cero fallos/errores; scientific-math-final-validation.log.
- [x] 238 expresiones reales aceptadas por KaTeX, sin errores de sintaxis.
- [x] Motor aislado en navegador a 360 px: claro/oscuro/letra grande, fuentes locales disponibles, MathML, scroll horizontal, cero peticiones externas y cero errores JS. Entrada inválida conserva original y texto HTML no ejecuta scripts. Reporte: build/scientific-math-browser-report.json.
- [ ] Revisión física en teléfono, TalkBack, fuentes grandes y scroll. Android no ejecutado.

Validación final 01/11/2026: assembleDebug y 190 pruebas Android correctas, cero fallos/errores (build/academic-review-complete.log). Física 1.1 cargada desde los archivos de producción con JsonContentLoader: CatalogValidator cero errores/cero advertencias y AcademicSanitizer sin contaminación. Motor aislado en navegador a 360 px: prosa y ocho expresiones inline, énfasis, claro/oscuro/letra grande y sin recursos externos; screenshot academic-theory-inline.png. No se ejecutó Android ni se publicó una versión.

Validación 01/11/2026: assembleDebug y 195 pruebas Android correctos (build/presentation-tables-final.log); reserva finita, no duplicación al restaurar, gasto de monedas/vidas, rama normal y tablas comprobados. Física 1.1 mantiene 17 filas mediante su loader real y pasa CatalogValidator sin errores/advertencias. Motor tabular aislado a 360 px: encabezados, nueve celdas, seis expresiones y scroll horizontal correctos; cero errores JS o peticiones externas. No equivale a ejecutar Android.

- [x] 01/11/2026: assembleDebug y 198 pruebas Android correctas, cero fallos/errores (build/academic-presentation-final.log). Probada conservación de símbolos científicos y explicaciones, normalización de rótulos y rechazo de tablas incompletas. La suite incluye validación local de Física 1.1 con CatalogValidator/AcademicSanitizer.
- [ ] Inspección visual en teléfono de estas nuevas tarjetas y tablas: pendiente; no se ejecutó Android. Esto no certifica todo el banco académico.

- [x] Formato enriquecido de teoría: énfasis explícito y definiciones con paletas claro/oscuro, fórmulas preservadas, colores de preguntas sin cambios. assembleDebug y 200 tests correctos; motor aislado inspeccionado a 360 px.
- [ ] Revisión física de las nuevas paletas en teléfono y temas personalizados; Android no ejecutado.

- [x] 01/11/2026: assembleDebug y 205 pruebas Android correctas, cero fallos/errores (build/learning-playback-final.log). Integridad de explicaciones comprobada en una muestra de cada materia con recursos; geometría comprobada contra secciones reales de 3.1 y 7.1; sin fallback a otras materias ni a polígonos genéricos. Suite mantiene CatalogValidator sin errores/advertencias y sanitizador sin contaminación en el piloto de Física 1.1.
- [ ] Comprobar dibujos Canvas, controles, reproducción, pausa en segundo plano, scroll y accesibilidad en teléfono. No se ejecutó Android.

- [x] 01/11/2026: assembleDebug y 209 pruebas Android correctas, cero fallos/errores (build/academic-block01-final.log). Los tres niveles revisados pasan CatalogValidator con cero errores/cero advertencias y sanitizador sin contaminación. 64 fragmentos matemáticos aceptados por KaTeX; tres fixtures idénticos a producción. Giro opcional cargado desde preguntas, compatible con recursos antiguos. Regresión para numeración de pasos corregida.
- [ ] Validación física de las 33 preguntas y siete giros; Android no ejecutado. El resto de la revisión académica sigue pendiente.

- [x] Bloque 02: assembleDebug y 214 pruebas Android sin fallos/errores (build/academic-block02-final.log). Álgebra 1.1/1.2 pasa CatalogValidator con cero errores/advertencias y sanitizador sin contaminación. Revisión estructural de todas las preguntas MC: sin alternativas textualmente duplicadas, IDs repetidos por nivel ni índices fuera de rango. 124 fragmentos matemáticos del bloque aceptados por KaTeX. Catorce fixtures coinciden con producción.
- [ ] Verificar el Venn, los controles y las preguntas en teléfono; Android no ejecutado.
- [ ] Cerrar las 1.453 alertas ampliadas y revisar académicamente los demás ejercicios; no se marca el banco como terminado.

- [x] Bloque 03: assembleDebug y 219 pruebas Android correctas (build/academic-block03-validation.log), cero fallos/errores. Seis niveles pasan CatalogValidator sin errores/advertencias y sanitizador sin contaminación. Motor local: 96 fragmentos y bloque completo de casos de Aritmética aceptados; nueve fuentes/fixtures equivalentes. Regresión global de índices, IDs y alternativas sin fallos.
- [ ] Revisión física de preguntas, controles y gráfico de densidad. Android no ejecutado ni publicado.
- [ ] Revisar las 1.419 preguntas con alertas ampliadas restantes y el contenido aún no validado académicamente.

- [x] Claridad: assembleDebug y 227 pruebas Android correctas, cero fallos/errores (build/theory-clarity-final.log). Pruebas sobre todos los recursos: 112 esquemas gráficos, incluidos los 111 Mermaid, cero Mermaid sin soporte actual; 202 bloques ASCII/código conservados, no todos vectorizados. Paréntesis y matrices preservados; metadata administrativa filtrada sin borrar problemas legítimos. Teoría/fixtures de Física 1.1/1.2 equivalentes; preguntas sin cambios y piloto 1.1 conserva validador/sanitizador correctos.
- [x] Notación de vectores inspeccionada en motor aislado a 360 px: cinco expresiones, cero fallbacks/errores JS/peticiones externas; prosa «en +x» legible. Muestra build/vector-clarity-preview.png.
- [ ] Inspección física de mapas, tipos de letra, TalkBack, temas y notación. Android no ejecutado ni publicado. Física 1.2 no se declara completamente validada: sus preguntas siguen pendientes.

- [x] Corrección de subíndices en ScientificMathSource y motor JavaScript: fórmulas explícitas preservadas, factores contiguos separados. Regresión con 238 expresiones exportadas y 4.554 preguntas sin errores de representación. assembleDebug y 465 pruebas correctas.
- [ ] Revisión física en teléfono, incluida la representación de las fórmulas de hidrocarburos.

- [x] 03/11/2026: acompañantes de teoría corregidos globalmente. Eliminado el fallback de ADN para categorías sin dibujo. Selección por materia y contexto; 22 claves con representación explícita, máximo una por sección y tres distintas por lección, separadas por al menos una sección. Autor y Fundamento no generan imagen por sí solos. Comprobación de las 20 materias y recorrido de las 418 teorías. assembleDebug y 499 pruebas repetidas correctas (302 Android y 197 shared), cero fallos, errores u omitidas. Log: build/academic-companions-validation.log. Informe: docs/formulas/ACOMPANANTES_POR_TEMA_2026-11-03.md. Inspección visual física pendiente; Android no ejecutado ni publicado. Bancos, recursos académicos y progreso sin cambios en este lote.
