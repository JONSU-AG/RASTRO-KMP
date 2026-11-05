# Lenguaje 3.2 — Secuencias vocálicas

## Ámbito

04/11/2026. Diez preguntas, teoría y notas pedagógicas, tres fixtures, cuatro pruebas y documentación. Títulos, IDs, orden, cantidad y claves numéricas conservados. Se corrige el contenido de alternativas y explicaciones; no se preservan respuestas falsas por mantener un índice. Respaldo: build/academic-backup-vowel-sequences. Sin cambios en pantallas o servicios.

## Problemas corregidos

La pregunta de búho atribuía a la h la formación del hiato; ahora la respuesta explica cerrada tónica junto a abierta y niega esa causalidad. Se retira la afirmación de que ui e iu no se tildan: cuidado y cuídate permiten contrastar la regla aplicada sin equiparar diptongo con ausencia de tilde.

Se distingue análisis de pronunciación de convención ortográfica. La tilde deja de presentarse como fuerza física que destruye sílabas. Triptongo no se equipara obligatoriamente a sílaba tónica. Se retiran silabeos difíciles sin justificar y la cifra de veinticuatro fonemas repetida desde el nivel anterior.

Los hiatos de dos iguales se explican con leer sin restringirlos a dos cerradas. Los ejercicios de creciente, decreciente y ahijado indican el análisis que se utiliza. El conteo de Raúl, tenía y baúl queda limitado al interior de palabra y a la clase solicitada. Se conserva el ejemplo completo de antiguo/navío/petróleo/hacia/bahía con desglose; se elimina un resultado de ocho tildes para un párrafo ausente.

Un mapa de once nodos clasifica ejemplos. Tres tablas comparan diptongos, hiatos/tildación y el conteo palabra por palabra. Sin emojis, claves fijas o dibujos genéricos. No se añaden imágenes ni modelos 3D.

## Fuentes

- [RAE, apéndice ortográfico](https://www.rae.es/diccionario-estudiante/docs/ortografia.pdf): texto del PDF abierto, apartados de diptongos, triptongos y hiatos; se distinguen convenciones de acentuación gráfica. No se copian tablas o imágenes.
- [FundéuRAE, incluido, construido y huida sin tilde](https://www.fundeu.es/recomendacion/incluido-construido-y-huida-sin-tilde-1544/): extracto del buscador consultado sobre ui en llanas y su tildación en otras clases. No se declara lectura íntegra.
- [FundéuRAE, tilde en esdrújulas con diptongo](https://www.fundeu.es/recomendacion/tilde-en-esdrujulas-con-diptongo/): extracto consultado sobre colocación de tilde en cerradas distintas. Redacción y ejemplos propios.

No se convierte una convención ortográfica en una predicción sobre toda pronunciación ni se afirma validar usos poéticos no estudiados.

## Verificación

assembleDebug y ambas suites testDebugUnitTest terminaron con BUILD SUCCESSFUL en build/vowel-sequences-validation.log. Resultado conjunto: 636 pruebas, 439 Android y 197 shared, cero fallos, errores u omitidas.

CatalogValidator: cero errores críticos y una advertencia previa DEPTH_CHALLENGE_SHORTFALL por diez preguntas NORMAL frente al umbral tolerado de once. Sanitizador sin contaminación ajena en enunciados. Cuatro pruebas nuevas verifican carga e identidad, alcance de preguntas, diagrama/tablas y equivalencia de fixtures. Parser: once nodos únicos, diez aristas válidas y todos los nodos alcanzables; tres tablas con filas consistentes.

IDs, claves y metadatos de identidad comparados con respaldo; fixtures equivalentes. Diff sin errores de formato. Inventario global regenerado: 211 niveles con mapas declarados y 216 con tablas detectadas en fuente, sin contar por ello todos los gráficos nativos. Auditoría estructural: 418 niveles, 4554 preguntas, cero alertas; no certifica precisión académica global.

No se ejecuta la aplicación ni se publican cambios. La revisión visual queda pendiente.
