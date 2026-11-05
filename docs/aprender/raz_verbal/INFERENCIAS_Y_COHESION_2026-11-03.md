# Inferencias y cohesión: revisión del 3 de noviembre de 2026

## Alcance

RV 8.2: diez preguntas, teoría, fixtures y cuatro pruebas nuevas. Se conservan los identificadores, los índices correctos, las cantidades y ambos mapas Mermaid, con sus nodos y relaciones originales. Sin cambios en UI, navegación, Firebase ni recompensas.

## Problemas encontrados

La teoría desarrollaba situaciones comunicativas del nivel anterior, pero las preguntas evaluaban inferencias, organización textual, referencias y generalización. Se detectó una falta de correspondencia entre lo enseñado y lo exigido.

La pregunta sobre inferencias mezclaba consecuencia necesaria con conclusión muy probable. La de ordenamiento declaraba universal la secuencia de lo general a lo particular. La de idea principal la equiparaba a tesis y afirmaba que eliminarla necesariamente desmorona el texto. La discrepancia se describía como oposición frontal, sin admitir acuerdos parciales. Varias preguntas solo pedían repetir una definición con distractores ajenos al contenido.

La teoría conservaba reglas de prestigio léxico, supuestas inferencias de identidad por palabras regionales, instrucciones laborales con consecuencias legales no justificadas y un ejemplo forense sin fuente para su técnica ni su precisión. Se retiraron en lugar de convertirlos en guías técnicas o jurídicas.

## Correcciones

La nueva teoría explica los contenidos realmente evaluados con tablas y casos ficticios. Se aplica una regla condicional solo cuando el enunciado establece su antecedente y su cumplimiento. No se transforma esa suposición en una predicción sobre organizaciones reales.

Anáfora, catáfora y elipsis se practican sobre fragmentos donde se puede identificar el antecedente, la anticipación o el elemento omitido. Se distingue la referencia anafórica de la figura de repetición. La reconstrucción de una elipsis debe conservar la acción del texto.

El orden general-particular responde a una consigna delimitada. La eliminación de una oración depende de pertinencia y función, no de que repita una palabra. La síntesis informativa se separa de la tesis argumentativa.

El debate de Elena y Marco permite reconocer que comparten la ampliación de un horario y discrepan en la necesidad de personal. El ejemplo de generalización distingue opiniones de utilidad y mediciones de aprendizaje: con dos opiniones no se concluye que todos aprenderán mejor, pero tampoco se demuestra que el taller sea inútil.

Los dos mapas anteriores se conservan como guías generales de interpretación; no se anuncian como nuevos diagramas específicos de todos los conceptos. Los ejemplos y explicaciones son redacción propia. La intervención no añade recursos gráficos a otros temas.

## Fuentes de contraste

Se consultó directamente el material [MINEDU: Los referentes textuales](https://www.minedu.gob.pe/somospromo/pdf/preparacion/razonamiento-verbal/rv-los-referentes-textuales.pdf), para contrastar las direcciones de referencia y la recuperación por el contexto. No se copiaron sus ejercicios ni sus ilustraciones.

También se consultó [Purdue OWL: Logical Fallacies](https://owl.purdue.edu/owl/general_writing/academic_writing/logic_in_argumentative_writing/fallacies.html), para contrastar el problema de la evidencia insuficiente o sesgada en una generalización. No se reprodujeron sus ejemplos.

Los resultados indexados del Instituto Cervantes sobre [referencia anafórica](https://cvc.cervantes.es/ensenanza/biblioteca_ele/diccio_ele/diccionario/referenciaanaforica.htm), [coherencia](https://cvc.cervantes.es/ensenanza/biblioteca_ele/diccio_ele/diccionario/coherencia.htm) y [progresión temática](https://cvc.cervantes.es/ensenanza/biblioteca_ele/diccio_ele/diccionario/progresiontematica.htm) sirvieron como contraste terminológico. No se afirma una inspección íntegra de esas páginas.

## Límites

No se ejecutó Android. Queda pendiente revisar la presentación en teléfono. Esta corrección local y las comprobaciones automáticas no certifican la precisión académica de todo el catálogo.

## Validación final

assembleDebug correcto. Pasaron 588 pruebas: 391 Android y 197 shared, sin fallos, errores ni omitidas. Registro: build/textual-reasoning-validation.log. Las cuatro pruebas nuevas cubren identidad y claves, contexto de las preguntas, correspondencia de la teoría y equivalencia de fixtures.

CatalogValidator: cero errores críticos y una advertencia preexistente DEPTH_CHALLENGE_SHORTFALL por diez retos frente a los quince sugeridos. Se conserva sin ocultarla ni inflar el banco. AcademicSanitizer no detecta contaminación de los enunciados del lote. IDs y claves conservados y ambos bloques Mermaid idénticos a la copia anterior de esta intervención; diff sin errores de espacios.

La auditoría estructural mantiene 418 niveles y 4554 preguntas sin alertas automáticas; no equivale a certificación académica integral.
