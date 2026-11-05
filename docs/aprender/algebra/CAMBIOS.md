# Cambios

01/11/2026: bloque 02, 1.1 y 1.2 completos, once preguntas por nivel. Fuentes y fixtures equivalentes; Android no ejecutado ni publicado.

02/11/2026: sustituidos los bancos de práctica 02–16: 330 preguntas en 30 niveles, IDs previos conservados y c11 añadido. Datos completos, claves calculadas, alternativas distintas y tres pasos explícitos. Sin cambios de teoría, títulos ni catálogo Kotlin legacy. Evidencia y limitaciones en REVISION_PRACTICA_02_A_16.md. Auditoría global: 1.141 preguntas con alertas; sigue pendiente la revisión completa.


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
