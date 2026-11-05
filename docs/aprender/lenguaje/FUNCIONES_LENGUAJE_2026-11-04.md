# Revisión de Lenguaje 1.3 — 04/11/2026

## Ámbito y errores

Doce preguntas, teoría y notas pedagógicas de lesson.json; tres fixtures, prueba y documentación. IDs, orden, cantidad, títulos y claves numéricas conservados. No se modifica UI, Firebase, navegación, progreso ni otra materia. Respaldo en build/academic-backup-language-functions.

El original atribuía a Jakobson solo tres funciones y presentaba las funciones como exclusivas. Reducía lo referencial a verdad objetiva, lo poético a belleza o metáfora y lo expresivo a emoción sin elaboración. Una pregunta enseñaba que los verbos transitivos requieren obligatoriamente objeto directo expreso, afirmación falsa. Otra utilizaba un verso aislado para imponer una función dominante sin contexto suficiente. Se presentaba una teoría innatista como hecho biológico universal, junto con lengua casi fija y facultad inmutable.

## Correcciones

Se distingue el modelo de tres funciones de Bühler del modelo de seis de Jakobson. Se explica coexistencia y predominio contextual; se separa orientación del mensaje de verdad, comprensión o éxito. Se reemplaza el ejemplo de ebullición por un horario ficticio para no introducir condiciones científicas innecesarias. La cita literaria se sustituye por una línea propia cuya consigna dirige la atención a sonidos y organización, sin adjudicarla a un autor.

El análisis metalingüístico usa una construcción concreta y la teoría explica que existen usos sin complemento directo expreso. Chomsky se relaciona con una propuesta innatista generativista, no con una lengua completa al nacer. Se conserva a Martinet y se distinguen unidades significativas y fonemas de letras y sílabas. Lengua social no se equipara a inmutabilidad. Se aclara que las lenguas de señas son lenguas.

Un mapa de trece nodos y tres tablas relacionan conceptos, funciones y autores. Sin emojis, estadísticas inventadas de examen, eslóganes de claves ni etiquetas de hacking. No se añaden imágenes o modelos 3D.

## Fuentes y alcance

- [ANEP, aportes teóricos sobre funciones del lenguaje](https://uruguayeduca.anep.edu.uy/sites/default/files/exelearning/06-2026/14301/aportes_tericos.html): página abierta y leída sobre factores, coexistencia y orientación de las funciones. No se copian texto ni imágenes.
- [UCM, verbos transitivos](https://www.ucm.es/plataformaele/verbos-transitivos): lectura directa de los usos sin complemento directo expreso. No se incorporan las demás clasificaciones o ejemplos de esa página de forma automática.
- [UBA, doble articulación del lenguaje](https://terminologias.filo.uba.ar/vocabs/1009/term/1493): lectura directa de las dos articulaciones y su asociación con Martinet.
- [Instituto Cervantes, Innatismo e interacción](https://cvc.cervantes.es/ensenanza/biblioteca_ele/asele/pdf/07/07_0121.pdf): extracto del buscador consultado, no lectura íntegra. Se usa solo para identificar la relación de Chomsky con la propuesta; no como certificación de consenso.

Los casos son propios. La clasificación de una función no sustituye verificar contenidos. No se presenta esta revisión como evaluación de toda la lingüística contemporánea.

## Verificación

Primer ensayo de la prueba nueva: una expectativa de advertencia era incorrecta; CatalogValidator admite doce retos NORMAL sin advertencias. Se corrigió la expectativa tras revisar el umbral real, sin modificar el validador ni añadir preguntas. La repetición de assembleDebug y ambas suites fue correcta en build/language-functions-validation-final.log. El resultado conjunto con el siguiente lote se registra en CHECKLIST.md.

El resultado conjunto posterior con 2.1 fue de 624 pruebas correctas (427 Android y 197 shared), cero fallos, errores u omitidas. 1.3 tiene cero errores y cero advertencias del validador. Sanitizador sin contaminación ajena. Mapa reconocido por el parser y fixtures equivalentes; las tres tablas están incorporadas en el formato existente. Identidad y claves comparadas con el respaldo; diff sin errores de formato.

Revisión visual pendiente: no se ejecutó Android ni se publicaron cambios. Este informe no certifica otros niveles.
