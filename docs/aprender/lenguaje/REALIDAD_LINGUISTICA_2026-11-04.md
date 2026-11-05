# Revisión de Lenguaje 2.2 — 04/11/2026

## Ámbito

Doce preguntas, teoría y notas pedagógicas de lesson.json; tres fixtures, cuatro pruebas y documentación. IDs, títulos, cantidad, orden y claves numéricas conservados. Se corrigen los textos de alternativas y explicaciones sin conservar respuestas académicamente incorrectas. No se modifica UI, navegación, Firebase, progreso ni otra lección.

Respaldo anterior: build/academic-backup-peru-languages. Log de validación: build/peru-languages-validation.log.

## Errores encontrados

- La teoría imponía el orden demográfico ASH-SHI-AWA sin fuente o variable. Las fichas consultadas no respaldan ese orden: los datos mostrados de lengua materna para awajún superan los de shipibo-konibo. Se retira el ranking; la pregunta del ashaninka evalúa ahora su familia documentada, Arawak.
- Mezclaba cantidades de lenguas con familias, ofrecía un intervalo de familias sin criterio y usaba cifras de hablantes sin fecha o población de referencia. La práctica del inventario ahora compara lenguas dentro de una lista identificada, sin convertirlo en censo de hablantes.
- La localización de jaqaru se reducía a Tupe. La ficha incluye localidades de Tupe y Catahuasi, Yauyos, Lima. Se precisa que es referencia territorial, no exclusividad residencial.
- Quechua I se calificaba de arcaico y su clasificación se presentaba como demostración definitiva del origen del protoquechua. Se distingue clasificación, agrupaciones geográficas e investigación histórica.
- La pronunciación de bilingües se predecía de manera uniforme por una causa única. Se acota el ejercicio a una comparación de sistemas y se evitan diagnósticos personales. No se presenta el término motoseo como prueba de capacidad o identidad.
- San Juan y san juan aparecían como demostración de una diferencia articulatoria. Son grafías con distinta capitalización, insuficientes para probar un cambio sonoro. La pregunta compara ahora realizaciones efectivamente sonoras en un caso descrito.
- Se equiparaba bilingüismo con ausencia de desigualdad y EIB con una garantía ya cumplida de lengua materna en todo caso. Se separan repertorio, distribución social, diseño del servicio y acceso efectivo. Se incorporan fortalecimiento, revitalización y ámbitos urbanos.

## Presentación

Un árbol clasificatorio de dieciséis nodos relaciona la selección de familias, ramas y lenguas. No es un mapa territorial ni atribuye distancias o rutas. Tres tablas comparan clasificaciones quechuas, conceptos sociales/educativos y lectura de datos. Sin emojis, estadísticas de examen, claves fijas o dibujos genéricos.

Los casos son redacción propia. No se incorporan modelos 3D, imágenes remotas ni bibliotecas nuevas. Los archivos siguen entrando mediante JsonContentLoader y el renderer académico existente.

## Fuentes y alcance de consulta

Fichas del Ministerio de Cultura abiertas y leídas:

- [Quechua](https://bdpi.cultura.gob.pe/lenguas/quechua): dos grandes ramas y agrupaciones de variedades. Se consultó también el extracto detallado de [Quechuas](https://bdpi.cultura.gob.pe/pueblos/quechuas), con la tabla Minedu 2018 de Chanka y Collao. No se extrapola a una cronología definitiva del origen.
- [Jaqaru](https://bdpi.cultura.gob.pe/lenguas/jaqaru): Aru y localidades de Tupe/Catahuasi, Yauyos.
- [Ashaninka](https://bdpi.cultura.gob.pe/lenguas/ashaninka): Arawak; no se incorpora una cifra sin fecha a las preguntas.
- [Shipibo-konibo](https://bdpi.cultura.gob.pe/lenguas/shipibo-konibo) y [Matsés](https://bdpi.cultura.gob.pe/lenguas/matses): Pano; distribución no idéntica.
- [Awajún](https://bdpi.cultura.gob.pe/lenguas/awajun) y [Wampis](https://bdpi.cultura.gob.pe/lenguas/wampis): etiqueta familiar Jíbaro y denominaciones de las lenguas.
- [Lista de lenguas](https://bdpi.cultura.gob.pe/lenguas): inventario consultado de 48, con cuatro referencias andinas y 44 amazónicas. Se registra como dato del inventario, no cifra inmutable.

Otros recursos consultados con límites explícitos:

- [Instituto Cervantes, diglosia](https://cvc.cervantes.es/ensenanza/biblioteca_Ele/diccio_ele/diccionario/diglosia.htm): extracto del buscador sobre sentidos estricto/amplio y relación con bilingüismo, sin declarar lectura completa.
- [Minedu, caracterización de instituciones EIB](https://www.gob.pe/41377-educacion-intercultural-bilingue-proceso-de-caracterizacion-de-instituciones-educativas-interculturales) y [Modelo de Servicio EIB](https://repositorio.minedu.gob.pe/handle/20.500.12799/5971): extractos consultados de las tres formas de atención. La apertura de la primera devolvió error y la segunda mostró una verificación de seguridad; no se presenta como lectura íntegra ni se intenta sortearla.

No se copian imágenes o textos. Las fichas y extractos sirven para las relaciones indicadas; no se usan para certificar todas las afirmaciones posibles sobre pueblos, censos o historia lingüística.

## Verificación y pendientes

assembleDebug y testDebugUnitTest de Android y shared terminaron con BUILD SUCCESSFUL. 628 pruebas: 431 Android y 197 shared, cero fallos, errores u omitidas. Log: build/peru-languages-validation.log.

CatalogValidator: cero errores y cero advertencias en este nivel. AcademicSanitizer: sin contaminación ajena en enunciados. PeruLanguagesRepairTest añade cuatro pruebas de identidad y carga mediante JsonContentLoader, alcance de preguntas, árbol/tablas y equivalencia de fixtures. El parser reconoce dieciséis nodos únicos, quince relaciones válidas y todos los nodos alcanzables desde ROOT; procesa tres tablas con filas consistentes.

Comparados con el respaldo: mismos IDs, orden, claves numéricas y metadatos de identidad. Tres archivos de producción equivalentes a sus fixtures. Diff del lote revisado sin errores de formato. Inventario global regenerado: 209 niveles con mapa declarado y 214 con tabla detectada en fuente; no cuenta todos los gráficos nativos ni certifica renderizado. Auditoría estructural: 418 niveles, 4554 preguntas y cero alertas; no equivale a exactitud académica global.

No se ejecuta la aplicación ni se publican cambios. Revisión visual pendiente; no se certifican otros niveles por el resultado técnico de este lote.
