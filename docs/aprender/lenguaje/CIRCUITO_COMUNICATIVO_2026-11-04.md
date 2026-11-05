# Revisión de Lenguaje 1.1 — 04/11/2026

## Ámbito y errores encontrados

Se revisan las diez preguntas y la teoría de El Circuito Comunicativo: Fases, Elementos y Fenómenos Interferentes. Los objetivos y conceptos de lesson.json se ajustan porque repetían los mismos errores. La reparación no cambia títulos, IDs, claves, orden, cantidad ni las rutas de acceso al nivel.

El contenido anterior presentaba compartir idioma como garantía de comprensión y desconocerlo como imposibilidad absoluta de comunicación. No delimitaba recursos como traducción o gestos. Describía el contexto como determinante de un sentido siempre exacto y la retroalimentación como confirmación de comprensión. Presentaba ruido siempre involuntario, redundancia siempre deliberada y eficaz, y las fases como una secuencia rígida universal.

Se mezclaba el aire, medio de propagación, con las ondas sonoras, señal. La pregunta del libro no precisaba soporte escrito frente a vía de recepción. Los objetivos contaban fenómenos interferentes como un elemento de una lista universal. La teoría añadía afirmaciones de frecuencia de examen sin datos y un relato sobre intenciones religiosas y destinatarios de un monolito Chavín sin fuente que lo sustentara.

## Corrección

Las consignas explicitan el objeto de comparación. Se distingue referente de situación según el modelo de la lección, reconociendo que la terminología varía. Los casos de soporte impreso y medio de propagación se separan de código y señal. El ejemplo de las lenguas excluye expresamente traducción y apoyos para que la conclusión no se extienda a cualquier comunicación entre esas personas.

La teoría enseña los límites de contexto, redundancia y reacciones observables, con preguntas y respuestas que usan esas distinciones. El ruido se define por su efecto en el mensaje. Se conserva la distinción escolar de fases, aclarando su carácter analítico y el posible solapamiento. Se retira el relato histórico sin reemplazarlo por otro inventado.

Un mapa agrupa trece conceptos y tres tablas comparan fases, transmisión y fenómenos del intercambio. Las flechas del mapa expresan clasificación, no el recorrido físico de una señal. No se añaden imágenes o modelos 3D. No se usa contenido generado como si fuera una fuente histórica.

## Fuentes y límites de consulta

- [INTEF: elementos de la comunicación](https://descargas.intef.es/recursos_educativos/It_didac/Leng_Pri/5/02/04_elementos_comunicacion/elementos_de_la_comunicacin.html): página abierta y leída; distingue participantes, mensaje, código, canal y contexto. Consulta conceptual, sin copiar texto ni ilustraciones.
- [Instituto Cervantes: comunicación](https://cvc.cervantes.es/ensenanza/biblioteca_ele/diccio_ele/diccionario/comunicacion.htm) y [retroalimentación](https://cvc.cervantes.es/ensenanza/biblioteca_ele/diccio_ele/diccionario/retroalimentacion.htm): extractos del buscador consultados. La apertura directa devolvió error; no se presenta como lectura íntegra. Los extractos permiten identificar variantes del uso de contexto/referente y la función de ajustar el comportamiento comunicativo.
- [CATEDU: perturbaciones en la comunicación](https://e-ducativa.catedu.es/44700165/aula/archivos/repositorio/1750/1851/html/15_perturbaciones_en_la_comunicacin.html): extracto consultado sobre interferencias y refuerzos; la apertura directa agotó el tiempo. No se cita como prueba de todos los matices de esta reparación.

Los ejemplos y explicaciones son redacción propia. Las fuentes no se usan para atribuir estadísticas de admisión ni conclusiones arqueológicas.

## Validación

assembleDebug, testDebugUnitTest de Android y shared terminaron con BUILD SUCCESSFUL. Tras el último ajuste de la prueba, se repitieron ambas suites: 612 pruebas (415 Android y 197 shared), cero fallos, errores u omitidas. Logs: build/communication-validation.log y build/communication-validation-final.log.

CommunicationRepairTest incorpora cuatro pruebas: carga mediante el loader real e identidad; distinciones de las preguntas; mapa y contenido sin afirmaciones retiradas; equivalencia de los tres archivos con fixtures. CatalogValidator registra cero errores críticos y una advertencia previa DEPTH_CHALLENGE_SHORTFALL por diez retos frente a quince sugeridos. AcademicSanitizer no detecta contaminación ajena en los enunciados.

La comparación con el respaldo confirma IDs, orden y claves, además de los metadatos de identidad del nivel. Auditoría estructural: veinte materias, 418 niveles y 4554 preguntas, cero alertas; no es una validación semántica global. Diff del lote revisado sin errores de formato.

No se ejecutó la app, por instrucción del usuario. La revisión visual sigue pendiente. Este lote no certifica todos los temas de Lenguaje ni toda la aplicación.
