# Revisión académica — bloque 01

Fecha: 01/11/2026. Alcance: Trigonometría 1.1, Geometría 3.1 y Geometría 7.1 de los recursos JSON/Markdown. No modifica catálogos Kotlin legacy, otras lecciones, temario, progreso ni Firebase.

## Qué se corrigió

Se conservaron los 30 identificadores y sus niveles, con cuatro alternativas por pregunta. Se añadió c11 en cada nivel (33 preguntas en total) para cumplir el mínimo pedagógico NORMAL del validador: giro negativo, mediana de triángulo y radio perpendicular a cuerda. Se sustituyeron 24 rellenos por ejercicios originales de RASTRO sobre los conceptos de la teoría existente, con datos explícitos y explicación completa. No se atribuyen estos ejercicios a exámenes oficiales. Las seis preguntas restantes se completaron o corrigieron individualmente. No es una revisión de toda la materia.

- Trigonometría 1.1: conversiones entre grados, centesimales y radianes; signo de giro; minutos; sistema de suma/diferencia de ángulos. c01 conserva la conversión de 72°; c03 conserva suma de 80 g y diferencia de 18°. c02 tenía una relación ausente, imposible de reconstruir con certeza: se sustituyó expresamente por una conversión completa de 36° a 40 g.
- Geometría 3.1: ángulos interiores y exteriores, desigualdad triangular, isósceles, equilátero, rectángulo, comparación lado–ángulo y clasificación por lados. Antes eran diez rellenos.
- Geometría 7.1: ángulo central/inscrito, inradio y tangencia; conserva los problemas de 110°, catetos 8–15 y trapecio de bases 4–16. c02 marcaba 2 cm: corregido a 3 cm, porque la hipotenusa es 17 y el área 60; con semiperímetro 20, r=A/s=3. El trapecio conserva r=4 m, con lados iguales de 10 m y altura de 8 m.

Las explicaciones contienen datos, propiedad utilizada, sustitución y resultado cuando corresponde. Las preguntas conceptuales explican la distinción relevante sin inventar cálculos.

## Gráfico vinculado al ejercicio

Se añadió un campo opcional `angleDegrees` a Challenge/QuestionJson y a su loader. Ausente en los demás ejercicios, no cambia su funcionamiento ni exige migración de datos remotos. Siete preguntas revisadas de Trigonometría 1.1 declaran un ángulo comprobado (72°, 36°, −90°, 30°, 135°, 36°, 135°).

`AngularConversionCard` dibuja ese giro y muestra las tres lecturas del mismo ángulo, aproximadas a dos decimales. Controles: reproducir, pausar, reiniciar y deslizador; pausa en segundo plano. Aparece en el ejemplo resuelto y al abrir la explicación, no durante la elección de respuesta. No infiere el dibujo por ID ni por datos incompletos del enunciado. No representa automáticamente problemas de otras materias.

## Fuentes y comprobación matemática

Fuente de alineación: `theory.md` de los tres niveles indicados. Contrastadas las conversiones y propiedades básicas con:

- OpenStax, Precalculus 2e, [5.1 Angles](https://openstax.org/books/precalculus-2e/pages/5-1-angles): grados, radianes y signo de rotación.
- OpenStax, Prealgebra 2e, [9.3 Properties of Angles, Triangles and the Pythagorean Theorem](https://openstax.org/books/prealgebra-2e/pages/9-3-use-properties-of-angles-triangles-and-the-pythagorean-theorem): suma de ángulos y Pitágoras.
- OpenStax, Prealgebra 2e, [C Geometric Formulas](https://openstax.org/books/prealgebra-2e/pages/c-geometric-formulas): fórmulas geométricas elementales.

La equivalencia centesimal de 400 g por vuelta y los teoremas de circunferencia ya aparecen en el material local. Los desarrollos numéricos son propios y se verifican mediante cálculo independiente. La identidad A=rs se obtiene dividiendo el triángulo en tres triángulos de altura r; las igualdades de lados tangentes del trapecio dan 2l=4+16. No se copiaron ejercicios de esas publicaciones.

## Validación y límites

- `AcademicBlock01Test`: carga los tres niveles desde recursos de producción, exige once preguntas, IDs únicos, ausencia de relleno, resolución segmentada, CatalogValidator sin errores/advertencias y AcademicSanitizer sin contaminación. Comprueba por separado las conversiones, el inradio 3 y el trapecio r=4, y la compatibilidad del campo gráfico opcional.
- Motor KaTeX local: 64 fragmentos matemáticos de enunciados, opciones y resoluciones aceptados, sin errores (`build/academic-block01-math-report.json`).
- Fuentes de producción y sus fixtures Android actualizados juntos. Copia previa de estos tres archivos guardada en `build/academic-backup-20261101/`.
- Búsqueda de los dos patrones de relleno auditados: de 1.354 a 1.330; quedan pendientes. Este conteo no detecta todos los posibles defectos académicos.
- No se ejecutó Android ni se publicó una versión. No se certifica todo el banco; la comprobación física de los giros y la lectura de soluciones sigue pendiente.
