# Tipología de la comunicación — Revisión del 1.2

## Ámbito

04/11/2026. Solo teoría, diez preguntas y objetivos/conceptos internos de Lenguaje 1.2; tres fixtures, prueba y documentación. Se conservan títulos, IDs, orden, cantidad, índices de respuesta y metadatos de identidad. En la pregunta del braille se corrige el contenido de la alternativa válida: conservar el índice no significa conservar la respuesta académicamente errónea.

No se modifican pantallas, navegación, Firebase, gamificación u otras lecciones. Respaldo previo en build/academic-backup-communication-types.

## Problemas encontrados y corrección

El nivel clasificaba una lectura braille como no lingüística por ser táctil. Se cambia por una oración en español transcrita a braille: contenido lingüístico escrito y lectura táctil. Se distingue lengua, sistema de escritura y percepción; no se generaliza la clasificación de una oración a cualquier signo que pueda representarse en braille. Se añade la distinción entre lenguas de señas y gestos aislados.

El debate televisado no delimitaba si se analizaba el intercambio entre candidatos o la transmisión al público. Ahora se especifica el intercambio presencial entre ellos. Se acotan también la emisión del cartel y el tramo de radio, sin inventar respuestas posteriores ni llamar mentalmente pasivo al receptor.

Se retiran afirmaciones de que toda comunicación animal es exclusivamente instintiva y sin aprendizaje. El caso de abejas se limita a identificar participantes y la función informativa descrita. No se extrapolan resultados de estudios con abejorros a todas las especies de abejas.

La clasificación escolar de directa/indirecta se explica como una convención terminológica; se separan copresencia, mediación, distancia y sincronía. Una carta respondida días después permite analizar un intercambio bidireccional diferido. Mensaje público y difusión de masas dejan de presentarse como equivalentes universales; privacidad por destinatario no se confunde con confidencialidad garantizada.

Se elimina el relato no sustentado sobre Chavín, las supuestas frecuencias de examen y las reglas rígidas de una etiqueta única por cada criterio. Un mapa de trece nodos y dos tablas organizan el contenido mediante el formato académico existente. No se añaden imágenes ni modelos 3D.

## Fuentes consultadas

- [ONCE, Braille](https://educacion.once.es/gestorz/servicios/braille): página abierta y leída. Fundamenta su carácter de lectoescritura táctil que representa letras y signos de lenguas. No se copian textos ni imágenes; no se incorporan las afirmaciones neurológicas de esa página.
- [Naciones Unidas, Día Internacional de las Lenguas de Señas](https://www.un.org/es/observances/sign-languages-day): extracto del buscador consultado; la apertura directa devolvió 403. No se declara lectura completa. Se usa para identificar las lenguas de señas nacionales, sin reproducir estadísticas ni atribuirle todos los detalles del tema.
- [Queen Mary University of London, Bees master complex tasks through social interaction](https://www.qmul.ac.uk/news/latest-news/2024/se/bees-master-complex-tasks-through-social-interaction.html), 06/03/2024: página abierta y leída. Informa de aprendizaje social en abejorros; basta para descartar la afirmación universal de ausencia de aprendizaje animal. No se utiliza para certificar los detalles de la danza de abejas melíferas.

Los ejemplos y explicaciones son redacción propia. Las fuentes y precisiones anteriores se consignan aquí para revisión; no se convierten en avisos técnicos en la pantalla de estudio.

## Validación y límites

assembleDebug y ambas suites testDebugUnitTest terminaron con BUILD SUCCESSFUL. Log: build/communication-types-validation.log. 616 pruebas: 419 Android y 197 shared, cero fallos, errores u omitidas. Cuatro pruebas nuevas verifican carga e identidad mediante JsonContentLoader, respuesta correcta del braille y alcance de casos, formato y conceptos de la teoría, y equivalencia de los tres archivos con sus fixtures.

CatalogValidator: cero errores críticos y una advertencia previa DEPTH_CHALLENGE_SHORTFALL por diez retos frente a quince sugeridos. AcademicSanitizer: sin contaminación ajena en los enunciados. Comparación con respaldo: mismos IDs, claves numéricas, orden y metadatos de identidad. Diff del lote sin errores de formato. Auditoría estructural: veinte materias, 418 niveles, 4554 preguntas y cero alertas; esto no certifica su precisión académica.

No se ejecuta la app por instrucción del usuario. La presentación visual queda pendiente y no se certifican los demás niveles de Lenguaje. No se publicaron cambios.
