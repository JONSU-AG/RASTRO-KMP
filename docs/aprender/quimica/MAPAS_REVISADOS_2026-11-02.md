# Mapas de Química revisados

Se convierten exclusivamente los esquemas de 1.1, 2.1, 3.1, 4.1 y 5.1: materia y mezclas, estados y energía, estructura atómica, estructura electrónica y periodicidad, enlaces e interacciones. Son cinco mapas, 86 nodos y 81 conexiones; todos los conceptos quedan enlazados explícitamente desde la raíz mediante el visor existente.

Se conservan las preguntas y sus identificadores. Los cinco fixtures de teoría se mantienen equivalentes. El resto del texto no se declara revisado íntegramente.

Se aclaran las fases de los coloides, energía de reposo frente a energía total relativista, comparación electrónica frente a nuclear, spin intrínseco, 18 grupos actuales y límites de las tendencias periódicas. London se muestra en moléculas polares y apolares; la polaridad molecular exige considerar geometría.

Fuentes de contraste:

- [OpenStax, estructura y notación atómica](https://openstax.org/books/chemistry-atoms-first-2e/pages/2-3-atomic-structure-and-symbolism).
- [OpenStax, cambios de fase](https://openstax.org/books/chemistry-atoms-first-2e/pages/10-3-phase-transitions).
- [OpenStax, configuración electrónica](https://openstax.org/books/chemistry-2e/pages/6-4-electronic-structure-of-atoms-electron-configurations).
- [OpenStax, tendencias periódicas](https://openstax.org/books/chemistry-2e/pages/6-5-periodic-variations-in-element-properties).
- [OpenStax, fuerzas intermoleculares](https://openstax.org/books/chemistry-2e/pages/10-1-intermolecular-forces).
- [OpenStax, energía relativista](https://openstax.org/books/college-physics-2e/pages/28-6-relativistic-energy).

Respaldo anterior en build/academic-backup-chemistry-maps. Manifest de conservación de preguntas en build/chemistry-maps-review.json. ChemistryTheoryMapsReviewTest comprueba alcance, etiquetas, conexiones y fixtures. Las 86 etiquetas pasan el renderizado matemático aislado: 13 fragmentos y 15 vistas en claro, oscuro y letra grande a 360 px, sin errores. Esto no sustituye una revisión de sus controles en teléfono.

Validación final del lote: assembleDebug y 462 pruebas correctas (265 Android, 197 shared), sin fallos, errores ni omitidas. Dos pruebas nuevas verifican los cinco mapas y sus 86 nodos; se actualiza la comprobación previa del título de Materia y se mantienen sus ramas comprobadas. Log: build/pomodoro-chemistry-final-validation.log.
