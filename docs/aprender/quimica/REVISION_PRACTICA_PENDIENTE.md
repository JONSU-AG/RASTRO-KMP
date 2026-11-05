# Revisión de la práctica pendiente de Química

02/11/2026. Ámbito: los dos niveles de las semanas 02–16, 30 bancos y sus fixtures. Se conservan los 308 IDs existentes y se añaden 26 c11. Los cuatro bancos que ya tenían doce preguntas mantienen doce: 7.2, 10.1, 16.1 y 16.2. El lote contiene 334 preguntas y la materia suma 356. Los bancos 1.1/1.2 quedan intactos, con hashes comprobados antes y después.

Los ejercicios son originales y explícitos: 165 numéricos y 169 conceptuales. Cada resolución desarrolla una regla, su aplicación y una conclusión. Las alternativas conceptuales se rotan conservando la clave. No se atribuyen estos problemas a exámenes oficiales.

## Correcciones y condiciones

- Calor, masa–energía, estructura atómica/electrónica, enlace, nomenclatura, balanceo, estequiometría, gases, soluciones, equilibrio, pH, electroquímica, funciones orgánicas y química ambiental.
- Estados de oxidación y carga iónica diferenciados de los subíndices de la fórmula. Conteo de átomos con grupos entre paréntesis y balanceo por conservación de elementos.
- Temperatura absoluta en gases; volumen final indicado en diluciones, sin suponer aditividad universal. Reactivo limitante, rendimiento y pureza declarados.
- pH/pOH con modelo ideal y temperatura indicada; las aproximaciones de ácido débil se identifican como aproximaciones. El potencial estándar no se extrapola a cualquier mezcla ni se multiplica al escalar una semirreacción.
- Las fórmulas generales de hidrocarburos incluyen sus condiciones. La aromaticidad no se identifica con olor o inocuidad.
- Se corrigen claves ambientales ajenas a las alertas automáticas: la deposición ácida no es exclusiva de zonas mineras; «solo clorar el río» no garantiza agua potable. Transparencia, pH o desinfección aislados tampoco demuestran seguridad química y microbiológica.

No se dan dosis de tratamiento ni límites sanitarios locales. No se modifica la teoría completa, el catálogo Kotlin legacy, la navegación, Firebase ni monetización.

## Comprobaciones

`scripts/academic/review_chemistry_practice.py` comprueba resultados racionales/simbólicos, conteo de elementos y coeficientes mínimos positivos de reacciones mediante el espacio nulo de la matriz de composición. El autor y los cálculos permanecen en herramientas de desarrollo; la app lee JSON estáticos. Los conceptos se revisan por sus argumentos y fuentes, no se consideran demostrados por un cálculo automático.

Evidencia local: `build/chemistry-pending-proofs.json`, preview y render; respaldo anterior en `build/academic-backup-chemistry-pending/`. El renderizador acepta 1.164 fragmentos en 90 vistas (30 niveles, claro/oscuro/letra grande, 360 px), sin fallbacks, peticiones externas ni desbordamiento del documento. Se revisan capturas de oxidación, balanceo, pH y agua. Las fórmulas largas mantienen scroll interno.

assembleDebug y 245 pruebas Android repetidas pasan sin fallos, errores u omitidas. ChemistryPracticeReviewTest carga los 32 niveles mediante el loader real: CatalogValidator sin errores/advertencias y sanitizador sin contaminación. Comprueba fixtures, IDs, oxidación, conteos orgánicos y las claves ambientales corregidas. Log: `build/chemistry-practice-final.log`. No se ejecuta Android ni se publica una versión.

La auditoría global queda en 4.492 preguntas y 220 con alertas, en los dos razonamientos. Cero alertas no certifica todo el contenido. Teoría completa, dificultad avanzada, gráficos individuales y revisión física siguen pendientes.

## Fuentes de contraste

- [OpenStax: estructura atómica](https://openstax.org/books/chemistry-2e/pages/2-3-atomic-structure-and-symbolism), [balanceo](https://openstax.org/books/chemistry-2e/pages/4-1-writing-and-balancing-chemical-equations), [geometría y polaridad](https://openstax.org/books/chemistry-2e/pages/7-6-molecular-structure-and-polarity).
- [OpenStax: equilibrio](https://openstax.org/books/chemistry-2e/pages/13-3-shifting-equilibria-le-chateliers-principle), [pH y pOH](https://openstax.org/books/chemistry-2e/pages/14-2-ph-and-poh), [celdas galvánicas](https://openstax.org/books/chemistry-2e/pages/17-2-galvanic-cells).
- [OpenStax: hidrocarburos](https://openstax.org/books/chemistry-2e/pages/20-1-hydrocarbons), [aminas y amidas](https://openstax.org/books/chemistry-2e/pages/20-4-amines-and-amides).
- [EPA: ozono a nivel del suelo](https://www.epa.gov/ground-level-ozone-pollution/ground-level-ozone-basics), [deposición ácida](https://www.epa.gov/acidrain/what-acid-rain), [OMS: agua para consumo](https://www.who.int/news-room/fact-sheets/detail/drinking-water).

Fuentes usadas para contrastar definiciones y condiciones; los enunciados y desarrollos no son transcripciones.
