# Concordancia y construcción: revisión del 3 de noviembre de 2026

## Alcance

Nivel 7.2 de Razonamiento Verbal: diez preguntas, teoría, fixtures y cuatro pruebas de regresión. IDs, claves, número de retos y bloque Mermaid original conservados. Sin cambios en pantallas, Firebase, navegación ni recompensas.

## Problemas encontrados

La teoría repetía gran parte de la corrección léxica del nivel 7.1, mientras las preguntas evaluaban concordancia, haber, construcciones con se y preposiciones. Faltaba enseñar varios contenidos que se exigían después. Además, conservaba deducciones incorrectas sobre unanimidad y escepticismo, y reglas de sustitución que alteraban el sentido.

La explicación de colectivos afirmaba una preferencia general por el singular sin justificarla para todos los casos. La pregunta de coordinación confundía la posición de los sustantivos y del verbo. Otra explicación llamaba vulgar a una construcción regional y afirmaba que todos los adverbios rechazan posesivos. Se retiraron esas generalizaciones.

## Cambios realizados

Se reorganizó la teoría alrededor de los contenidos realmente evaluados, con tablas, contrastes y ejemplos resueltos. Se enseña a distinguir el haber impersonal de existencia del auxiliar con sujeto plural; se contrasta la pasiva refleja con una impersonal con se y complemento de persona.

La pregunta de concordancia cuantificadora utiliza la mayoría de los participantes y reconoce las dos formas admisibles, sin extenderlas a todo colectivo. La pregunta de coordinación delimita dos objetos distintos y un sujeto antepuesto. El ejercicio de adjetivos utiliza una relación inequívoca entre argumentos y convincentes, sin depender del alcance de un adjetivo compartido.

Las preguntas de preposiciones ahora incluyen el uso concreto que se evalúa y explican la corrección mediante la construcción completa. La de ubicación exige detrás de y un pronombre personal: no necesita presentar todas las otras expresiones como errores absolutos. Se conservan las aclaraciones previas sobre quejarse de que y hacer un plan.

Los ejemplos son redacción propia para práctica. Se mantiene el mapa previo como referencia general de revisión del sentido; no se presenta como una clasificación detallada de todas las construcciones nuevas. Se retiraron la tabla LaTeX sin contexto, las atribuciones no documentadas a exámenes oficiales y el caso de dosificación médica. Este último no era necesario para enseñar las relaciones gramaticales.

## Fuentes de contraste

- [RAE/ASALE: concordancia](https://www.rae.es/dpd/concordancia), para las relaciones nominales y verbales y los límites de las reglas generales.
- [FundéuRAE: nombres colectivos](https://www.fundeu.es/recomendacion/concordancia-colectivos/), para distinguir estructuras y reconocer la doble concordancia de expresiones cuantificadoras.
- [RAE/ASALE: haber](https://www.rae.es/dpd/haber), para separar uso auxiliar e impersonal.
- [RAE/ASALE: se](https://www.rae.es/dpd/se), para el contraste entre pasiva refleja e impersonal.
- [RAE/ASALE: detrás](https://www.rae.es/dpd/detrás), para la recomendación formal y la variación regional.
- [RAE/ASALE: dequeísmo](https://www.rae.es/dpd/dequeísmo) y [queísmo](https://www.rae.es/dpd/queísmo), para comprobar la construcción y las preposiciones requeridas.

No se reprodujeron pasajes ni ilustraciones de las fuentes.

## Comprobaciones y límites

assembleDebug correcto. Pasaron 580 pruebas: 383 Android y 197 shared, sin fallos, errores ni omitidas. Registro: build/concordance-validation.log. Las cuatro nuevas cubren identidad y claves, distinciones gramaticales, cobertura de teoría y equivalencia de fixtures.

CatalogValidator devuelve cero errores críticos y una advertencia preexistente DEPTH_CHALLENGE_SHORTFALL por diez retos frente a los quince sugeridos. Se conserva la cantidad sin ocultar el aviso. AcademicSanitizer no detecta contaminación de los enunciados del lote. Mapa original idéntico y diff revisado.

La auditoría estructural general mantiene 418 niveles y 4554 preguntas sin alertas automáticas. No constituye una certificación académica de todo el catálogo. No se ejecutó la app: la revisión visual en teléfono y la revisión de otros niveles siguen pendientes.
