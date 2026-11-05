# Relaciones semánticas — 4 de noviembre de 2026

## Alcance

RV 1.2: diez preguntas, teoría, fixtures y cuatro pruebas nuevas. Se conservan identificadores, claves, metadatos, cantidades y el mapa Mermaid anterior. Sin cambios en UI, navegación, Firebase, recompensas ni otros niveles.

## Errores y correcciones

El ejemplo de gato animal y gato herramienta atribuía orígenes distintos y entradas independientes sin que la consulta lo sostuviera para ese par. Ambos sentidos están en la entrada correspondiente del DLE; se retira ese ejemplo como prueba de homonimia de distinto origen. Para comparar homografía se emplean las dos unidades hoz documentadas por el diccionario.

La pregunta de baya y valla afirmaba una pronunciación estándar única. Ahora especifica pronunciación yeísta y explica el límite para variedades que distinguen ll e y. La teoría no descalifica variantes regionales.

La pregunta de copa conserva la polisemia y aporta el dato lexicográfico; se elimina una supuesta concavidad común obligatoria del recipiente y la parte superior del árbol. La definición de homonimia deja de reducir todos los análisis a un origen diferente necesario.

Paronimia se practica mediante actitud y aptitud sin exigir exactamente un fonema de diferencia ni significados radicalmente ajenos. Las preguntas de inclusión distinguen clase general y clase incluida, sin equiparar cualquier hipónimo con una especie científica única. Cobre, plata y oro se comparan en el sentido metálico especificado.

La oposición complementaria se delimita mediante un sistema ficticio con dos únicos estados excluyentes y exhaustivos. La meronimia se contrasta con inclusión de clases usando rueda/bicicleta y paloma/ave. Se retiran sustituciones automáticas, transcripciones inventadas y ejemplos de otras materias no necesarios para el objetivo.

Los casos y explicaciones son redacción propia. El mapa conserva sus relaciones; no se incorpora nueva cobertura gráfica.

## Fuentes consultadas

Entradas inspeccionadas directamente: RAE/ASALE [gato](https://dle.rae.es/gato), [copa](https://dle.rae.es/copa), [homónimo](https://dle.rae.es/homónimo), [hoz](https://dle.rae.es/hoz), [parónimo](https://dle.rae.es/parónimo), [hiperónimo](https://dle.rae.es/hiperónimo) y [yeísmo](https://www.rae.es/dpd/yeísmo).

Se verificaron las acepciones concretas de animal y herramienta, copa de árbol y recipiente, y los dos orígenes de hoz. No se copiaron pasajes ni ilustraciones. La organización lexicográfica sirve como dato del caso, no como sustituto universal de un análisis histórico o semántico.

## Validación realizada

- assembleDebug, testDebugUnitTest de Android y de shared: BUILD SUCCESSFUL. Log: build/semantic-relations-validation.log.
- 608 pruebas: 411 Android y 197 shared; cero fallos, errores u omitidas. Incluyen cuatro pruebas de SemanticRelationsRepairTest.
- CatalogValidator: cero errores críticos y una advertencia previa DEPTH_CHALLENGE_SHORTFALL por diez retos frente a los quince sugeridos. No se añadieron preguntas para ocultarla.
- AcademicSanitizer: sin contaminación de enunciados de otra materia.
- Comparación con respaldo: mismos IDs y claves, y bloque de mapa idéntico. Fixtures equivalentes a producción.
- Auditoría estructural: veinte materias, 418 niveles, 4554 preguntas y cero alertas. Es una comprobación estructural, no una certificación académica global.

## Revisión pendiente

No se ejecutó Android; sigue pendiente la revisión visual en teléfono. El lote no certifica toda la precisión académica de RASTRO. No se publicaron cambios.
