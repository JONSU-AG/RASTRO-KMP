# Lenguaje 3.1 — Fonología y sílaba

## Ámbito

04/11/2026. Diez preguntas, teoría y metadatos pedagógicos, tres fixtures, cuatro pruebas y documentación. Mismos IDs, títulos, claves numéricas, cantidad y orden. Complemento «Propiedades del lenguaje y silabeo» conservado íntegro. No se modifican otras materias, pantallas, navegación, Firebase o gamificación. Respaldo: build/academic-backup-phonology.

## Errores y corrección

El original declaraba un total universal de veinticuatro fonemas y lo llamaba número oficial. Se retira esa afirmación y la pregunta evalúa las cinco vocales del modelo básico. La teoría explica que los contrastes consonánticos dependen de la variedad y del análisis, con seseo y yeísmo como casos pertinentes. No se sustituye la cifra por otro total universal.

Se afirmaba que h siempre es muda y se denominaba letra a qu. Se acotan hoja y humo; se distingue h aislada de ch y de pronunciaciones en préstamos. Qu se presenta como dígrafo en queso. Se corrige la explicación de que la u endurece una c que no existe en esa palabra, y se diferencia guerra de pingüino.

La metadata describía pa como si solo contuviera una vocal. Se explica ataque p, núcleo a y ausencia de coda. Pan añade coda y a puede ser una sílaba sin márgenes. Se separa fonema, realización, alófono y escritura; no se utiliza una supuesta localización literal del inventario en el cerebro como demostración.

Se retiran estadísticas inventadas de examen, etiquetas de claves y ejemplos de retos no presentes en el banco. El panorama vocálico deja de explicar tildes como fuerzas físicas o de abreviar reglas generales con formulaciones que omiten sus condiciones.

## Recursos

Tres tablas: unidades, clasificación vocálica y relaciones gráficas. Un árbol de doce nodos representa únicamente las posiciones de pan, pa y a. No es un aparato fonador ni una animación. Se reutiliza el parser y renderer existente.

## Fuentes

- [RAE/ASALE, seseo](https://www.rae.es/dpd/seseo) y [yeísmo](https://www.rae.es/dpd/yeísmo): páginas abiertas y leídas; documentan diferencias de contrastes y aceptación normativa.
- [RAE, apéndice de ortografía del Diccionario del estudiante](https://www.rae.es/diccionario-estudiante/docs/ortografia.pdf): PDF abierto y texto consultado; páginas iniciales sobre abecedario, dígrafos, correspondencias e h en préstamos. No se copian imágenes ni tablas.
- [Academia Mexicana de la Lengua, dígrafo qu](https://academia.org.mx/consultas/consultas-frecuentes/item/digrafo-qu): extracto del buscador consultado; apertura directa con 403, sin declarar lectura completa.

Explicaciones y ejemplos propios. La notación se mantiene sencilla y no se afirma haber validado toda realización dialectal posible.

## Validación

Primer assembleDebug y suites correctos en build/phonology-validation.log. Cuatro pruebas comprueban identidad y carga, correcciones de preguntas, estructura del árbol y tablas, y equivalencia de los tres fixtures. El resultado conjunto final con 3.2 se registra en CHECKLIST.md.

La validación conjunta posterior con 3.2 terminó con 636 pruebas correctas (439 Android y 197 shared), sin fallos, errores u omitidas. CatalogValidator: cero errores críticos y una advertencia previa de cantidad en 3.1; sanitizador sin contaminación ajena. Parser: doce nodos únicos y conectados, once aristas válidas y tres tablas consistentes. Complemento previo comparado e idéntico; identidad y claves conservadas, fixtures equivalentes. Diff sin errores de formato.

No se ejecuta Android ni se publican cambios. Revisión visual pendiente.
