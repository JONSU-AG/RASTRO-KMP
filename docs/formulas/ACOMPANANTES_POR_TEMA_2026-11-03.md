# Acompañantes académicos: selección y repetición

## Error comprobado

AcademicIllustrationsCatalog reconocía Geografía, Matemática e Historia, pero AcademicIllustration no tenía casos para dibujarlas. El caso final dibujaba BiologyDnaDoodle. Así aparecía ADN junto a autores y fundamentos de Geografía. Además, el parser concatenaba materia, título y rótulo y buscaba subcadenas: palabras genéricas podían activar categorías equivocadas. Cada tarjeta solicitaba ilustración, sin presupuesto de frecuencia.

## Ámbito y solución

Componente común de teoría y dibujo de la presentación de lección, política de selección, vectores de acompañamiento, pruebas y documentación. No se modifican los recursos académicos, bancos de preguntas, progreso, calificaciones, Firebase o navegación. Las semanas 11 y 12 de Geografía se inspeccionaron antes de la nueva petición, pero no se editaron en esta intervención.

AcademicArtwork enumera 22 claves. Cada una tiene un caso explícito en el dibujante. Se reutilizan los ocho dibujos dedicados existentes y se añaden 14 vectores de contexto: célula, huella, globo, ubicación, tiempo meteorológico, montaña, agua, población, pergamino, balanza, operaciones, triángulo, diálogo e idea. Se mantienen colores sólidos y contornos. No se descarga ningún recurso ni se añade una animación continua.

La materia se resuelve separadamente y admite IDs y nombres con tildes. El tema solo concreta un dibujo dentro de esa materia. ADN se reserva a genética, cromosomas, ADN o herencia dentro de Biología. Una materia desconocida conserva el acompañante neutral de libros en la presentación; las tarjetas no reciben una imagen inventada para suplir la falta de correspondencia.

La selección de tarjetas se realiza una vez al analizar la teoría: máximo una ilustración por sección, tres por lección, sin claves repetidas y con al menos una sección de separación. No usa azar ni cambia al recomponer. Rótulos genéricos como Autor, Fundamento o Definición no activan una ilustración por sí solos. El texto se conserva. Las tarjetas sin acompañante recuperan el ancho del texto; no se cambia el tamaño de letra ni el estilo de las tarjetas.

Ese presupuesto solo limita acompañantes decorativos. No elimina mapas, tablas, fórmulas, construcciones geométricas, gráficos científicos ni reproducciones didácticas. Física conserva su criterio anterior de no añadir átomos genéricos en las ramas cuando ya dispone de ilustraciones científicas.

## Comprobación y límites

AcademicCompanionPolicyTest prueba las 20 materias, la resolución de cada clave, tildes, falsas coincidencias, reserva del ADN, tarjetas genéricas, estabilidad y presupuesto de frecuencia. Recorre los recursos de todas las teorías (al menos 418), comprobando que no reaparezca ADN fuera de Biología y que se respeten los límites de acompañantes.

Se usó CodeGraph para localizar los dos consumidores del componente, se sincronizó el índice y se contrastó con búsqueda y lectura del código actual. La política se aplica al renderizador común, no a una lista de lecciones escogidas.

La compilación y las pruebas no equivalen a haber inspeccionado los nuevos vectores en teléfono. No se ejecuta Android en emulador ni dispositivo. La inspección visual, TalkBack y recortes en pantalla real permanecen pendientes. No se publica ninguna versión.

Validación final: assembleDebug correcto y 499 pruebas repetidas (302 Android y 197 shared), sin fallos, errores u omitidas. Las cuatro pruebas nuevas pasan, incluido el recorrido de las 418 teorías. Log: build/academic-companions-validation.log. CodeGraph sincronizado: build/academic-companions-codegraph.log.
