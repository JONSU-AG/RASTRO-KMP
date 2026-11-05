# Checklist

- [x] Cambios académicos de este bloque documentados y alternativas distintas.
- [ ] Revisión física de preguntas y diagramas.
- [ ] Validación de toda la materia.

- [x] Bloque 02: assembleDebug y 214 pruebas Android sin fallos/errores (build/academic-block02-final.log). Álgebra 1.1/1.2 pasa CatalogValidator con cero errores/advertencias y sanitizador sin contaminación. Revisión estructural de todas las preguntas MC: sin alternativas textualmente duplicadas, IDs repetidos por nivel ni índices fuera de rango. 124 fragmentos matemáticos del bloque aceptados por KaTeX. Catorce fixtures coinciden con producción.
- [ ] Verificar el Venn, los controles y las preguntas en teléfono; Android no ejecutado.
- [ ] Cerrar las 1.453 alertas ampliadas y revisar académicamente los demás ejercicios; no se marca el banco como terminado.

## Práctica 02–16, 02/11/2026

- [x] 30 bancos integrados y fixtures equivalentes: 330 preguntas, sin modificar la semana 01 ni catálogos Kotlin legacy.
- [x] Los 300 IDs previos se conservan; se añade c11 por nivel.
- [x] 150 modelos explícitos con variantes, resultados contrastados y alternativas no equivalentes entre sí.
- [x] 2.206 fragmentos aceptados por KaTeX; 30 muestras de cinco modelos renderizadas a 360 px sin errores ni desbordamiento.
- [ ] Revisión completa de teoría, títulos genéricos y profundidad avanzada.
- [ ] Gráficos individuales y prueba física de todas las preguntas.

La auditoría actual está en ../estado/AUDITORIA_ESTRUCTURAL_TOTAL.md: 1.141 preguntas con alertas en todo el banco. El número anterior de 1.453 se conserva arriba como registro del bloque previo, no como estado actual.

- [x] Validación final 02/11/2026: assembleDebug correcto (build/algebra-practice-final.log) y 229 pruebas Android, cero fallos/errores/omitidas. Suite repetida expresamente tras los últimos cambios de recursos (build/algebra-practice-tests-rerun.log). Los 30 niveles pasan CatalogValidator con cero errores/advertencias y AcademicSanitizer sin contaminación. No se ejecutó Android ni se publicó una versión.


## 05/11/2026 — Teoría real, intervalos y radicales: 2.1–3.2

- [x] Cuatro teorías revisadas, con dieciséis tablas y cuatro mapas compactos. Se eliminan de la lectura las fichas de ponderación y las atribuciones industriales sin evidencia. Se mantienen las ideas matemáticas relevantes, con condiciones y ejemplos comprobables.
- [x] Corregidos casos cero/negativos de valor absoluto, diferencia entre cota y máximo, dominio de raíces y potencias racionales, factor racionalizante no nulo y la falsa unicidad por analogía en x^x. La suma telescópica del ejemplo tiene 99 términos.
- [x] Recta nativa de distancia en 2.1.4 y 2.2.1, con centro/radio, comparación y extremos; figura de raíz principal en 3.1.3. Las mismas asociaciones exactas se usan en Aprender y Material; ningún gráfico se activa en otra materia o por un título genérico.
- [x] Las 44 preguntas se conservan byte a byte. Títulos, IDs, profundidad y referencias del catálogo estables; doce fixtures equivalentes y doce archivos finales verificados dentro del APK.
- [x] CatalogValidator: cero errores y cero advertencias; AcademicSanitizer sin contaminación en los cuatro niveles. Siete pruebas nuevas cubren conjuntos, fronteras, anclajes reales de ambos lectores, ejemplos, integridad y presentación.
- [x] assembleDebug y 681 pruebas correctas (484 Android + 197 shared), sin fallos, errores u omisiones. Reejecución explícita de las tareas de pruebas tras los últimos recursos: build/algebra-21-32-tests-rerun.log. Las pruebas que leen archivos externos requieren --rerun para no reutilizar informes anteriores.
- [x] Doce vistas móviles de teoría y doce de preguntas sin errores ni desbordes: 335 y 322 fragmentos matemáticos respectivamente. Visor global: 253 mapas y 419 tablas en tres configuraciones, sin fallos; vista previa final de 3.2 inspeccionada.
- [x] Comparación de módulos, descarte de candidatos, identidad de radicales dobles, contraejemplo de potencias y suma telescópica contrastados con SymPy local; build/algebra-21-32-symbolic-check.json. No se añade esta herramienta a la app.
- [ ] Comprobación física de sliders, recta, tipografía, gestos y accesibilidad. No se ejecutó Android ni se publicó una versión.
- [ ] Teorías posteriores de Álgebra pendientes; no se considera terminada toda la materia.
