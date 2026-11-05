# Revisión de la práctica pendiente de Física

02/11/2026. Se revisaron 1.2 y los dos niveles de cada semana de la 03 a la 12. Son 21 niveles y 231 ejercicios: 189 cálculos y 42 preguntas conceptuales. Cada nivel tiene once ejercicios diferentes, no variantes automáticas de un mismo enunciado. Se conservan los 210 IDs anteriores y se añade c11 por nivel. Los bancos previamente revisados de 1.1 y 2.1/2.2 se mantienen sin cambios. No se modifica el catálogo Kotlin legacy, los títulos, la navegación, Firebase ni las recompensas.

El banco nuevo de recursos de Física suma ahora 264 preguntas en 24 niveles. La revisión de práctica no equivale a una certificación completa de la teoría, la dificultad avanzada o los gráficos individuales.

## Contenido revisado

| Bloque | Comprobaciones |
|---|---|
| Vectores | Módulo, proyección, normalización no nula, producto escalar y vectorial, área triangular y perpendicularidad |
| Dinámica | Resultante, masa, aceleración, normal, rozamiento, planos lisos, ascensor, circular uniforme, peralte y Atwood ideal |
| Estática | Fuerzas y momentos simultáneamente, brazos perpendiculares, centro de masa, escalera, rozamiento estático real frente al máximo |
| Momento y gravitación | Signos de velocidades, impulso, choques unidos, ausencia de impulso externo, ley inversa cuadrática, órbitas y Kepler |
| Energía | Trabajo con signo, componente paralela, referencia de altura, resortes, potencia, rendimiento y pérdidas |
| Fenómenos térmicos | Escalas e intervalos, calor sensible, capacidad calorífica, calor latente, dilatación y mezcla con capacidades distintas |
| Fluidos | Densidad, presión manométrica/absoluta, continuidad, Bernoulli ideal, Pascal, Arquímedes, peso aparente y flotación |
| Electricidad | Coulomb, campo y potencial, carga, corriente, Ohm bajo su hipótesis, serie/paralelo, nodos, mallas, batería y condensador |
| Electromagnetismo | Producto vectorial, carga con signo, fuerza sin trabajo, radio magnético, campo de alambre/solenoide, flujo, Faraday, Lenz y transformador ideal |
| Oscilaciones y ondas | MAS, resorte, péndulo de pequeña amplitud, lente delgada, espejo, v=fλ, eco, cuerda, modos y refracción |
| Física moderna | Energía del fotón, umbral fotoeléctrico, ramas relativistas, intervalos propios, radiactividad probabilística, de Broglie e incertidumbre como cota |

Los problemas declaran unidades y constantes numéricas de cálculo. Enunciados independientes: ningún dato exige recordar la pregunta anterior. Los ejercicios son originales de RASTRO y no se presentan como preguntas oficiales de admisión.

## Método de comprobación

`scripts/academic/review_physics_practice.py` contiene cada problema explícitamente. Los 189 resultados numéricos se contrastan con operaciones exactas de SymPy, incluidas matrices, productos vectoriales, raíces, trigonometría y razones racionales. La selección de alternativas comprueba equivalencia matemática y conserva la unidad de la cantidad pedida. Las 42 preguntas conceptuales tienen su razonamiento escrito en tres pasos; el verificador algebraico no pretende demostrar esos conceptos por sí solo.

No se añade SymPy a Android. Se usa únicamente la instalación de desarrollo en `build/academic-python-libs`. Evidencia local: `build/physics-pending-proofs.json`, vista completa en `build/physics-pending-preview.json` y copia anterior en `build/academic-backup-physics-pending/`. Estos archivos no constituyen respaldo remoto.

Los valores extremos se muestran en notación científica, conservando exactitud. Se usan delimitadores explícitos para las fórmulas conocidas de los enunciados: la conjunción española «y» no debe entrar en un vector y los exponentes Unicode no deben quedar cortados. Las unidades de las alternativas se muestran en letra recta.

## Reparaciones relacionadas en teoría 7.2

El balance calorimétrico es conservación de energía bajo las hipótesis descritas, no la ley cero. Una mezcla con hielo inicialmente bajo cero no debe forzarse siempre a 0 °C: hay que determinar las fases finales por balance. La expansión de un agujero se acota a calentamiento uniforme, material isotrópico, dilatación libre y coeficiente positivo. La conversión de 20 °C se expresa como 293.15 K.

Estas reparaciones locales no significan que se haya reescrito ni certificado toda la teoría térmica.

## Fuentes de contraste

Fuentes usadas para revisar reglas y condiciones; no se copiaron sus ejercicios:

- [OpenStax, College Physics 2e, índice](https://openstax.org/books/college-physics-2e/pages/index), organización de los conceptos físicos.
- [Dinámica y leyes de Newton](https://openstax.org/books/college-physics-2e/pages/4-introduction-to-dynamics-newtons-laws-of-motion).
- [Presión](https://openstax.org/books/college-physics-2e/pages/11-3-pressure).
- [Cambio de temperatura y capacidad calorífica](https://openstax.org/books/college-physics-2e/pages/14-2-temperature-change-and-heat-capacity).
- [Cambios de fase y calor latente](https://openstax.org/books/college-physics-2e/pages/14-3-phase-change-and-latent-heat).
- [Ley de Ohm y sus límites](https://openstax.org/books/college-physics-2e/pages/20-2-ohms-law-resistance-and-simple-circuits).
- [Efecto fotoeléctrico](https://openstax.org/books/college-physics-2e/pages/29-2-the-photoelectric-effect).

## Validación y pendientes

`PhysicsPracticeReviewTest` carga los 24 niveles por el loader real: once preguntas por nivel, claves válidas y CatalogValidator con cero errores y cero advertencias. Los 21 niveles nuevos comprueban además las tres partes de las resoluciones y la igualdad entre recursos y fixtures. Hay casos específicos de producto vectorial, impulso con cambio de sentido, Atwood, radio orbital, temperatura de mezcla, presión absoluta y umbral fotoeléctrico.

`assembleDebug` y las 233 pruebas Android repetidas pasan sin fallos, errores ni omitidas. Log: `build/physics-practice-final.log`.

El motor matemático aislado acepta 1.240 fragmentos y renderiza todos los enunciados, alternativas y explicaciones de los 21 niveles en 63 vistas (claro, oscuro y letra grande) a 360 px. Sin errores, fallbacks, peticiones externas ni desbordamiento horizontal del documento. Reporte: `build/physics-pending-render.json`; capturas inspeccionadas de vectores y de Broglie. No es una ejecución de Android.

La auditoría global cuenta 4.399 preguntas en 418 niveles: quedan 998 preguntas con alertas automáticas. Ninguna alerta automática actual en Física; eso no certifica por sí solo todo el contenido. Pendientes: teoría completa, dificultad avanzada, dibujos específicos, revisión del banco sin alertas y comprobación física en teléfono. No se ejecutó ni publicó Android.
