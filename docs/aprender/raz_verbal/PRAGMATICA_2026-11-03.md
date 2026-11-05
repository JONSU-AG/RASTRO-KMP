# Pragmática: revisión del 3 de noviembre de 2026

## Alcance

Nivel 6.1 de Razonamiento Verbal: diez preguntas, su teoría y las copias equivalentes utilizadas por las pruebas. Se conserva el mapa Mermaid anterior, los diez IDs, los índices correctos, el número de retos y los metadatos. No se modificaron pantallas, Firebase, recompensas ni otras materias.

## Correcciones

Las preguntas anteriores trataban la presuposición como una verdad objetiva y la prueba de negación como una garantía universal. Ahora distinguen el supuesto que presenta el hablante de un hecho comprobado. Se incluye la posibilidad de cuestionar el supuesto sin aceptarlo.

Mencionar un examen o mirar un reloj no determina una intención única. Se añadieron aclaraciones y acciones que apoyan la interpretación solicitada, y se explicaron los límites de esos indicios. El ejemplo del conector «pero» utiliza una ruta corta y empinada, sin asociar pobreza con deshonestidad ni afirmar que todo significado convencional sea independiente del contexto.

La teoría confundía la ironía con invertir exactamente todo significado, trataba como obligatorias ciertas intenciones indirectas y presentaba una amenaza militar como interpretación necesaria de una preocupación diplomática. Se corrigieron esas reglas y se sustituyó la aplicación diplomática por una situación cotidiana que permite confirmar la interpretación.

El ejercicio forense deducía causa de muerte, ubicación del ataque y momento de traslado a partir de datos insuficientes. Se retiró por esa insuficiencia argumentativa; no se intentó convertirlo en una guía médica. Su sustituto, un aviso de cambio de aula, enseña a separar el dato comunicado de una causa imaginada sin requerir conocimiento clínico.

Los ejemplos nuevos son ficticios. Se simplificaron títulos como «hacking» y «combate preuniversitario», se retiraron atribuciones de modelo oficial sin referencia y se unificaron los avisos de precaución en un bloque «Importante». Las flechas textuales ya no muestran comandos LaTeX sueltos. Se mantuvo el desarrollo de estudio, las tablas y el mapa original.

## Contraste conceptual

Se consultó [Presupposition, Stanford Encyclopedia of Philosophy](https://plato.stanford.edu/entries/presupposition/), especialmente las secciones de proyección y cancelación, para contrastar los límites de la prueba de negación y la influencia del contexto. El contenido didáctico y los ejercicios están redactados para RASTRO; no se reprodujeron pasajes de esa fuente. El contraste no equivale a adoptar una sola teoría formal para todas las construcciones lingüísticas.

## Comprobaciones

- CatalogValidator: cero errores críticos; una advertencia preexistente DEPTH_CHALLENGE_SHORTFALL por diez retos frente a los quince sugeridos. No se ocultó ni se añadieron preguntas para satisfacerla.
- AcademicSanitizer: sin contaminación de enunciados detectada en el lote.
- Cuatro pruebas nuevas cubren identidad y claves, contexto suficiente, eliminación de deducciones forenses y equivalencia de recursos.
- assembleDebug correcto y 572 pruebas correctas: 375 Android y 197 shared; cero fallos, errores u omitidas. Registro: build/pragmatics-validation.log.
- Auditoría estructural: 418 niveles y 4554 preguntas, cero alertas automáticas. Esto no certifica la corrección académica integral.
- Revisión del diff limitada a los recursos, pruebas y documentación de este lote; se conservaron cambios previos del repositorio.

No se ejecutó la app. La revisión visual en teléfono y la revisión de otros niveles siguen pendientes.
