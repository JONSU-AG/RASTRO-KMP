# Revisión académica — bloque 03

01/11/2026. Alcance: Química 1.1/1.2, Física 2.1/2.2 y Aritmética 1.1/1.2 en recursos nuevos. Conserva sesenta IDs anteriores y añade c11 a cada uno de los seis niveles. Son 66 preguntas revisadas. No toca catálogos Kotlin legacy, navegación, Firebase ni recompensas.

## Contenido

- Química 1.1: sustancias simples, compuestos, mezclas, fases, componentes y separación. Evita confundir dos fases de agua pura con dos componentes. La clasificación de aleaciones no promete que toda composición tenga una sola fase.
- Química 1.2: densidad, propiedades intensivas/extensivas, cambios físicos/químicos/nucleares, unidades y temperatura. Un cambio físico puede ser irreversible; una emisión nuclear gamma puede conservar el elemento.
- Física 2.1: posición, distancia/desplazamiento, rapidez/velocidad medias, MRU, MRUV, frenado, área velocidad–tiempo y caída libre. Cada problema numérico declara sus datos y las hipótesis relevantes; g=10 solo donde se indica.
- Física 2.2: componentes, tiempo de subida/vuelo, alcance y altura de proyectiles, MCU/MCUV, frecuencia y aceleración centrípeta. Se explicita regreso a la misma altura cuando se usa el tiempo de vuelo simétrico y se excluye resistencia del aire cuando corresponde.
- Aritmética 1.1: pertenencia/inclusión con conjuntos anidados, cardinalidad, potencia, subconjuntos, dos conjuntos, regiones exactas y complemento.
- Aritmética 1.2: potencia de la potencia, De Morgan, absorción, diferencia simétrica, tablas de doble entrada y cardinalidad de tres conjuntos.

Son ejercicios propios de RASTRO basados en los conceptos existentes, no reconstrucciones atribuidas a exámenes oficiales. Los originales estaban incompletos o contenían rellenos; no se conservan datos ausentes mediante suposiciones ocultas.

## Reparaciones de teoría

Aritmética: las ecuaciones de regiones particionadas de 1.1 tenían `\begin{cases}` sin cierre; el cierre quedó aislado en 1.2. Se devolvió el cierre a su bloque, conservando las tres ecuaciones. Se aclaró en 1.2 qué representa k. La tabla de Carroll organiza dos criterios binarios con celdas mutuamente excluyentes; eso no exige que los conjuntos correspondientes a criterios distintos sean disjuntos.

Química: fórmula de temperaturas coherente con offsets exactos 273.15 y 491.67. Rankine satisface R=F+459.67, de donde R=(9/5)C+491.67. Se precisó la definición de cambio físico y nuclear para evitar clasificar solo por reversibilidad o afirmar que toda transformación nuclear cambia el elemento.

## Representaciones

- Nuevo `DensityLearningCard`: ejemplo homogéneo de 60 g/20 cm³, a temperatura y presión constantes. Al reducir una porción positiva, masa y volumen disminuyen proporcionalmente y la densidad se conserva en 3 g/cm³. Gráfica con ejes/unidades, controles, deslizador, reinicio y pausa en segundo plano. No representa una sustancia específica ni simula un proceso termodinámico.
- Se añade el dibujo parabólico existente al encabezado explícito de proyectiles de Física 2.2, manteniendo sus propios parámetros ilustrativos rotulados. No se presenta como la solución dibujada de todos los ejercicios del nivel.
- El Venn existente se reutiliza únicamente bajo el encabezado de álgebra de conjuntos de Aritmética 1.2. No se aplica por palabras genéricas ni a otras materias.

## Fuentes

Teoría local de los seis niveles, contrastada con:

- OpenStax, [Chemistry 1.3 Physical and Chemical Properties](https://openstax.org/books/chemistry/pages/1-3-physical-and-chemical-properties).
- OpenStax, [Chemistry 2e 1.4 Measurements](https://openstax.org/books/chemistry-2e/pages/1-4-measurements) y [1.6 Mathematical Treatment of Measurement Results](https://openstax.org/books/chemistry-2e/pages/1-6-mathematical-treatment-of-measurement-results).
- OpenStax, [Chemistry 2e 21.2 Nuclear Equations](https://openstax.org/books/chemistry-2e/pages/21-2-nuclear-equations).
- OpenStax, [Motion with Constant Acceleration](https://openstax.org/books/university-physics-volume-1/pages/3-4-motion-with-constant-acceleration) y [Projectile Motion](https://openstax.org/books/university-physics-volume-1/pages/4-3-projectile-motion).
- Conjuntos: referencias del [bloque 02](REVISION_ACADEMICA_BLOQUE_02.md). Cálculos y alternativas propios.

## Verificación

`AcademicBlock03Test` carga los seis niveles de producción, exige once preguntas y resolución segmentada, CatalogValidator sin errores/advertencias y sanitizador sin contaminación. Comprueba de forma independiente rapidez frente a velocidad, cálculos de proyectiles y centrípeta, temperatura, conservación de densidad, conjuntos anidados y regiones de Venn. La muestra de densidad rechaza volumen o fracción cero.

El motor local acepta 96 fragmentos matemáticos de las 66 preguntas, sin errores, y el bloque completo de casos de Aritmética (`build/academic-block03-math-report.json`). Las preguntas se respaldaron antes de la intervención en `build/academic-backup-block03/` y los fixtures se actualizan con producción.

La auditoría estructural registra ahora 4.348 preguntas y 1.419 con alertas ampliadas. No es la validación de todo el banco. No se ejecutó Android ni se publicó ninguna versión; revisión física pendiente.
