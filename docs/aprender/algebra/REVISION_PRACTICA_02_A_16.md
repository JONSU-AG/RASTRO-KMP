# Práctica de Álgebra: semanas 02 a 16

02/11/2026. Ámbito: los 30 archivos `questions.json` del catálogo nuevo y sus fixtures Android. No se migraron los catálogos Kotlin legacy. La semana 01 conserva el trabajo del bloque 02. No cambian títulos, teoría, navegación, progreso, recompensas ni servicios remotos.

## Problema y sustitución

Había enunciados incompletos, claves desplazadas y preguntas que pedían escoger un «principio formal» sin plantear ningún ejercicio. El lote anterior tenía 300 preguntas; este contiene 330, once por nivel. Se conservan los diez IDs previos y se añade `c11`. Los problemas sustitutos son originales de RASTRO, no preguntas atribuidas a una universidad ni reconstrucciones de exámenes oficiales.

Cada nivel tiene cinco modelos distintos, dos variantes numéricas de cada modelo y una tercera variante del primero: 150 modelos y 330 ejercicios. Son prácticas de aplicación de los conceptos existentes. Esto no cubre todos los artificios ni la dificultad avanzada que anuncian algunos títulos heredados. No se presenta como recuperación literal de los ejercicios antiguos ni como certificación del temario de admisión.

| Semana | Conceptos ejercitados |
|---|---|
| 02 | Operaciones reales, distancia, inverso, valor absoluto, conteo de enteros |
| 03 | Leyes de exponentes, raíces reales, racionalización y radical doble explícito |
| 04 | Monomios, grados, términos semejantes, homogeneidad e identidades |
| 05 | Productos notables, evaluación, división y teorema del resto |
| 06 | Factorización, raíces reales y multiplicidad |
| 07 | Fracciones algebraicas, exclusiones de dominio, MCD/MCM y fracciones parciales |
| 08 | Ecuaciones lineales, cuadráticas y bicuadradas; Viète y discriminante |
| 09 | Desigualdades, dominio de radicales y extremos enteros |
| 10 | Sistemas, eliminación, determinantes y compatibilidad |
| 11 | Componentes complejas, conjugado, módulo, argumento y potencias de i |
| 12 | Dominio, rango, evaluación, composición, inversa y biyección finita |
| 13 | Funciones afines, cuadráticas, valor absoluto, raíz, recíproca, piso y signo |
| 14 | Exponenciales, logaritmos, dominio, antilogaritmo y cologaritmo definidos |
| 15 | Progresiones aritméticas, geométricas y armónicas; suma convergente |
| 16 | Costos, utilidad, perímetro, descuento, optimización y modelos discretos |

## Comprobación matemática

El archivo de autoría `scripts/academic/rebuild_algebra_practice.py` formula los problemas y contrasta los resultados mediante operaciones exactas, sustitución, expansión, división polinómica, resolución de sistemas, límites, conteo finito y sumas. SymPy 1.14.0 está instalado únicamente en `build/academic-python-libs`: no forma parte de la aplicación.

Los casos de definición y propiedades generales también requieren el argumento matemático escrito; evaluar un ejemplo no demuestra por sí mismo un teorema. En particular: el grado de un producto supone polinomios no nulos; una inversa requiere aquí pendiente no nula; el logaritmo exige argumento positivo; el máximo cuadrático usa concavidad y un vértice dentro del dominio; la suma geométrica infinita requiere razón de módulo menor que uno.

Cada ejercicio tiene cuatro alternativas escalares distintas y una única respuesta exacta. Se comprueba equivalencia simbólica para impedir alternativas distintas en apariencia pero iguales. Las rotaciones de respuesta no cambian la clave. La resolución muestra la regla aplicable, la sustitución y el resultado. Ya puede reproducirse con el mecanismo existente, sin añadir pasos ficticios.

Casos revisados expresamente: raíz principal de un cuadrado negativo, extremo estricto que excluye enteros, cambio de sentido al dividir por negativo, cero raíces reales de una suma positiva, eliminación de denominadores antes de evaluar una identidad, multiplicidad frente a número de raíces, función piso negativa y reducción de masa durante tres vidas medias. En este último modelo se pregunta la masa radiactiva restante en gramos.

## Fuentes de contraste

Ejercicios propios; las fuentes sirven para contrastar reglas y condiciones, sin copiar sus ejemplos:

- [OpenStax, Algebra and Trigonometry 2e, índice](https://openstax.org/books/algebra-and-trigonometry-2e/pages/index): operaciones, polinomios, funciones, sistemas y sucesiones.
- [Factorización de polinomios, sección 1.5](https://openstax.org/books/algebra-and-trigonometry-2e/pages/1-5-factoring-polynomials): factor común, trinomios, cuadrados y cubos.
- [Inecuaciones y valor absoluto, sección 2.7](https://openstax.org/books/algebra-and-trigonometry-2e/pages/2-7-linear-inequalities-and-absolute-value-inequalities): extremos, intervalos y condiciones.
- [Funciones exponenciales, sección 6.1](https://openstax.org/books/algebra-and-trigonometry-2e/pages/6-1-exponential-functions): crecimiento y disminución por factor constante.

## Evidencia y límites

`build/algebra-02-16-math-proofs.json` guarda modelo, variante, resultado y contraste por ID. `build/algebra-02-16-preview.json` contiene el lote completo. La copia previa está en `build/academic-backup-algebra-02-16/`; estos archivos de build son evidencia local, no un respaldo remoto.

`node scripts/academic/validate_algebra_math.cjs --browser` comprueba los 2.206 fragmentos matemáticos con el KaTeX distribuido en la app. En navegador aislado a 360 px se renderizan los cinco modelos de cada uno de los 30 niveles: cero errores, cero fórmulas de respaldo y cero desbordamientos horizontales del documento. Se inspeccionaron capturas de radicales y complejos; esto no sustituye una prueba visual de Android.

La auditoría global cuenta ahora 4.378 preguntas en 418 niveles y 1.141 preguntas con alertas, frente a 1.419 antes de este lote. Álgebra tiene 352 preguntas sin alertas de los patrones automáticos actuales. Ausencia de alertas no certifica toda la teoría ni todos los métodos avanzados.

Pendiente: revisión de la teoría completa, correspondencia con títulos heredados genéricos, más variedad y dificultad avanzada, diagramas individuales de cada problema y comprobación física en teléfono. No se ejecutó ni publicó Android.

Compilación final: `assembleDebug` correcto. Las 229 pruebas Android se repitieron con `:androidApp:testDebugUnitTest --rerun`: cero fallos, errores u omitidas. `AlgebraPracticeReviewTest` carga los 30 niveles desde producción, exige once preguntas, comprueba IDs, claves, pasos, fixtures y ausencia de contaminación. CatalogValidator: cero errores y cero advertencias en esos niveles. Logs: `build/algebra-practice-final.log` y `build/algebra-practice-tests-rerun.log`.
