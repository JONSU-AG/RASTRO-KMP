# Estado comprobado — 03/11/2026

- [x] Botón Material conectado al catálogo existente de Aprender.
- [x] Selección teoría/preguntas/ambas, tema/subtema/curso con curso de origen fijo y desplegables adaptables.
- [x] Lectura vertical y horizontal, anterior/siguiente, referencias estables y restauración local por usuario.
- [x] Consulta de las 4554 preguntas de los 418 subtemas basados en recursos: sin duplicados ni sustitución por otro banco, comprobado en pruebas.
- [x] Respuestas y explicaciones originales; ausencia de explicación indicada sin inventar soluciones.
- [x] Revisión administrativa local con notas, filtro, huella y verificación de identidad en código.
- [x] Pizarra integrada junto al contenido en Material, niveles y exámenes; preparación conserva el acceso a Pizarra libre.
- [x] Modalidad UNSA opcional; otras universidades rechazan una modalidad UNSA; la clasificación por carrera se conserva en pruebas.
- [x] Inventario previo, cuatro SVG reales y un GLB derivado de 83 componentes oficiales del corazón.
- [x] Licencias, créditos, fuentes, cambios y hashes conservados. Sin recursos NC incorporados.
- [x] Los 16 archivos de la biblioteca y licencias están presentes en el APK debug y coinciden byte a byte con sus fuentes locales; 2,15 MB comprimidos.
- [x] Cuatro SVG renderizados en navegador a 360 × 640. GLB cargado, giro y zoom comprobados por cambios en cámara.
- [x] Ninguna petición externa; vistas planas sin descarga de GLB ni del motor 3D; retirada del modelo del DOM comprobada.
- [x] Compilación Android y 512 pruebas (315 Android, 197 shared), cero fallos, errores u omisiones: `build/material-delivery-validation.log`.
- [ ] Prueba física Android de tacto, gestos, rotación, lector, pizarra superpuesta y accesibilidad. No hay dispositivo conectado.
- [ ] Medición de memoria, batería y fluidez en teléfono de gama baja. Los tiempos de navegador de escritorio no la sustituyen.
- [ ] Pesos/prioridades académicas por modalidad UNSA: requieren información oficial suficiente; no se inventaron.
- [ ] Recursos propios para todos los temas, modelos moleculares y mapas peruanos de departamentos/relieve/cuencas: todavía no incorporados.
- [ ] Sincronización de marcas administrativas entre dispositivos: no implementada ni requerida para la revisión local.

## Correcciones solicitadas tras las capturas

- [x] Página HTTPS local explícita para evitar el rechazo del documento data:; manejo nativo de fallos.
- [x] Recursos científicos disponibles también en la teoría de los niveles, con coincidencia exacta de curso y lección.
- [x] Fuente y revisión fuera de la lectura principal; controles de Material simplificados.
- [x] Notas reunidas en Importante, sin emoji en Auto ni etiquetas pedagógicas internas.
- [x] Borrador y grosor de Pizarra libre encima del lienzo; pizarra integrada y aviso de desplazamiento en preguntas.
- [ ] Verificación física Android: las capturas detectaron un fallo que la prueba anterior de Chrome no cubría. No se afirma aceptación visual ni funcionamiento táctil en teléfono.

- [x] Corrección final: assembleDebug y 518 pruebas (321 Android y 197 shared), sin fallos/errores/omitidas: build/material-screen-corrections-verified.log.


## 03/11/2026 — Historia: ilustraciones relacionadas y fotografías ligeras

Cuatro SVG originales, CC0, para cerámica, tejido, templo andino y quipu. Android usa sus equivalentes VectorDrawable, con relleno opaco y contorno. La selección depende del tema, respeta el presupuesto anterior (máximo tres acompañantes distintos por lección, separados entre secciones) y no asigna arquitectura andina a Roma o Egipto. Son símbolos, no reproducciones de piezas arqueológicas.

Se integraron dos fotografías Open Access del Met: botella geométrica Moche (objeto 309442) y vasija de maíz Nasca (316270), cada una de unos 12 KB en WebP. Se verificó el dominio público individual y la política CC0 del museo; las fichas de procedencia están en assets/educational-visuals/licenses. El inventario completo está en ../material/INVENTARIO_HISTORIA_2026-11-03.md. Fotos, SVG y XML nativos suman 31 657 bytes; esa cifra excluye documentación y metadatos.

Las imágenes se colocan después de su sección en Historia del Perú, semana 2, nivel 2.1, usando los títulos reales de Cultura Moche y Cultura Nasca. La misma asociación se utiliza en Material. El campo opcional sectionKeywords conserva el comportamiento de los recursos anteriores. Si un recurso exige una sección inexistente, no se muestra en otra como sustituto. Los identificadores de revisión de imágenes antiguas conservan su huella anterior: el nuevo metadato de ubicación no invalida una revisión sin cambiar la imagen.

Validación: assembleDebug y 551 pruebas (354 Android + 197 shared), sin fallos, errores ni omitidas. Seis pruebas nuevas cubren relevancia, SVG/XML sin recursos externos, licencias individuales, peso, asociación exacta al contenido real, ausencia en modo solo preguntas y estabilidad de la huella. Log build/history-visual-validation.log. Fotografías locales inspeccionadas; SVG/XML validados estructuralmente. No se ejecutó Android; revisión visual/táctil y rendimiento físico pendientes. No se publicaron cambios ni se modificaron bancos, Firebase o recompensas. Esto no constituye cobertura gráfica completa de todas las materias.


## 04/11/2026 — Mapas completos y tablas

- [x] Vista previa real con todas las ramas en columnas compactas; un único botón Ampliar mapa. Zoom, desplazamiento y ajuste al mapa completo en la vista ampliada.
- [x] Comprobados en el visor local 239 mapas: 3691 nodos y 3451 conexiones, sin recortes de nodos, fórmulas rechazadas ni solicitudes externas.
- [x] Comprobadas 357 tablas a 360 px, con texto normal, grande y tema oscuro: 1071 vistas, todas las filas/celdas presentes y desplazamiento horizontal disponible cuando corresponde.
- [x] Corregidas las celdas partidas de división y los delimitadores matemáticos escapados. Las 4554 preguntas actuales pasan la comprobación de sus 10476 fragmentos matemáticos; esto no certifica sus respuestas.
- [x] assembleDebug correcto; 642 pruebas sin fallos, errores ni omisiones (445 Android + 197 shared). Los archivos del visor dentro del APK coinciden con los finales.
- [ ] Comprobar en teléfono el arbitraje de gestos entre tablas y lector vertical/horizontal. Android no se ejecutó; la prueba de navegador no lo sustituye.


04/11/2026: la cabecera «Portada y ficha técnica» se excluye de la presentación, igual que las fichas técnicas previas. Caso real de Física 11.1 cubierto por TheoryClarityTest: se conserva su teoría y mapa de ondas, sin convertir sistema de evaluación/duración en un esquema. Seis fuentes afectadas por esa etiqueta; no se editaron sus contenidos. Pruebas globales: 651 correctas; sin lanzamiento de Android.


## 04/11/2026 — Pilotos integrados
- [x] Identidad y contenido real de 5.4/8.3 comprobados en Aprender y Material; no aparecen en modo solo preguntas.
- [x] Títulos, accesos y estados por recurso; panel de controles acotado y vuelta a Modelo completo.
- [x] Catálogo y partes sin caracteres dañados; modelos, imágenes, créditos y licencias empaquetados y verificados.
- [x] Compilación, 667 pruebas y nueve vistas del visor local correctas. Dos modelos y ocho estados de la célula dibujados con los buffers/shaders nativos.
- [ ] Comprobación física Android de gestos, legibilidad y rendimiento. No se ejecutó la aplicación.


## 05/11/2026 — Lectura y mapas
- [x] assembleDebug y 684 pruebas repetidas correctas (487 Android, 197 shared), sin fallos, errores ni omitidas: build/reader-performance-verified.log.
- [x] Distribución de los 253 mapas reales: nodos conservados, sin recuadros superpuestos; ciclos y nodos desconectados incluidos.
- [x] 144 etiquetas matemáticas locales compuestas sin errores ni recortes; presentes en el APK. Licencias de KaTeX conservadas.
- [x] Filtros sobre las 487 unidades del curso de Física equivalentes a reconstruir cada selección. Pizarra habilitada únicamente para unidades de pregunta. Huellas SHA-256 equivalentes al algoritmo anterior.
- [x] Subtítulos con ecuaciones permanecen juntos y en orden, sin tarjetas vacías. Caché invalida una teoría cuando cambia su contenido.
- [ ] Confirmar desplazamiento sobre el texto, inercia, tablas, mapas y tiempo de carga en teléfono. No se ejecutó Android; los tiempos JVM no equivalen al rendimiento físico.
