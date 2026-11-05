# Cambios

## 03/11/2026 — Material, revisión y biblioteca científica inicial

Se sustituyó el cuadro breve de Guía por Material, con filtros, índice y consulta de las fuentes académicas existentes. Se separaron las preferencias de lectura del juego y se añadieron anotaciones administrativas locales con comprobación de identidad.

Se reutilizó la pizarra como superposición y se añadió una modalidad opcional en la meta UNSA. No se alteraron respuestas, recompensas, temporizadores, navegación principal ni datos remotos.

El inventario precedió a la importación. Se incorporaron tres SVG CC0 de Bioicons, un contorno de Perú de Natural Earth y un corazón BodyParts3D convertido a GLB conservando sus 83 componentes. Se distribuye el visor local y los avisos de licencia. La primera prueba de navegador detectó un bloqueo CSP de WebAssembly; se corrigió con `wasm-unsafe-eval` y se repitió sin errores ni conexiones externas.

Las pruebas exportan el mismo HTML del visor Android; no es una demostración alternativa. Se comprobó dibujo, carga, giro y zoom en Chrome de escritorio. Android compila y sus pruebas pasan; no se ejecutó en teléfono. Consultar `INFORME_2026-11-03.md` para límites y evidencias.


## 03/11/2026 — Corrección de las capturas de Material y pizarra

Se corrigió el documento inicial del visor mediante HTTPS local interceptado. Material conserva su curso, usa desplegables y oculta créditos/revisión hasta solicitarlos. La teoría de los niveles incorpora la misma biblioteca; los avisos se reúnen en Importante. La pizarra nativa se integra junto a preguntas/material con resaltado y desplazamiento; herramientas de Pizarra libre visibles encima del lienzo. Se preservan fuentes, bancos, respuestas, recompensas y Firebase. Ver docs/material/CORRECCIONES_CAPTURAS_2026-11-03.md para pruebas y límites físicos.


## 03/11/2026 — Historia: ilustraciones relacionadas y fotografías ligeras

Cuatro SVG originales, CC0, para cerámica, tejido, templo andino y quipu. Android usa sus equivalentes VectorDrawable, con relleno opaco y contorno. La selección depende del tema, respeta el presupuesto anterior (máximo tres acompañantes distintos por lección, separados entre secciones) y no asigna arquitectura andina a Roma o Egipto. Son símbolos, no reproducciones de piezas arqueológicas.

Se integraron dos fotografías Open Access del Met: botella geométrica Moche (objeto 309442) y vasija de maíz Nasca (316270), cada una de unos 12 KB en WebP. Se verificó el dominio público individual y la política CC0 del museo; las fichas de procedencia están en assets/educational-visuals/licenses. El inventario completo está en ../material/INVENTARIO_HISTORIA_2026-11-03.md. Fotos, SVG y XML nativos suman 31 657 bytes; esa cifra excluye documentación y metadatos.

Las imágenes se colocan después de su sección en Historia del Perú, semana 2, nivel 2.1, usando los títulos reales de Cultura Moche y Cultura Nasca. La misma asociación se utiliza en Material. El campo opcional sectionKeywords conserva el comportamiento de los recursos anteriores. Si un recurso exige una sección inexistente, no se muestra en otra como sustituto. Los identificadores de revisión de imágenes antiguas conservan su huella anterior: el nuevo metadato de ubicación no invalida una revisión sin cambiar la imagen.

Validación: assembleDebug y 551 pruebas (354 Android + 197 shared), sin fallos, errores ni omitidas. Seis pruebas nuevas cubren relevancia, SVG/XML sin recursos externos, licencias individuales, peso, asociación exacta al contenido real, ausencia en modo solo preguntas y estabilidad de la huella. Log build/history-visual-validation.log. Fotografías locales inspeccionadas; SVG/XML validados estructuralmente. No se ejecutó Android; revisión visual/táctil y rendimiento físico pendientes. No se publicaron cambios ni se modificaron bancos, Firebase o recompensas. Esto no constituye cobertura gráfica completa de todas las materias.


## 04/11/2026 — Mapas y tablas

Sustituida la exploración parcial por una vista previa completa y ampliable, con ramas verticales agrupadas. Ajustados los gestos de ScientificMath y corregido el reconocimiento de llaves escapadas. Corregida la tabla de división inexacta y documentado el caso exacto en su propia teoría. Validación: 642 pruebas correctas, assembleDebug, 239 mapas y 357 tablas en tres configuraciones; detalles reproducibles en scripts/academic/validate_maps_tables.cjs. Prueba táctil Android pendiente; no se lanzó ni publicó la app.


04/11/2026: la cabecera «Portada y ficha técnica» se excluye de la presentación, igual que las fichas técnicas previas. Caso real de Física 11.1 cubierto por TheoryClarityTest: se conserva su teoría y mapa de ondas, sin convertir sistema de evaluación/duración en un esquema. Seis fuentes afectadas por esa etiqueta; no se editaron sus contenidos. Pruebas globales: 651 correctas; sin lanzamiento de Android.


## 04/11/2026 — Integración y cierre técnico de los pilotos 3D

Se comprueba con las lecciones reales del repositorio que Biología 5.4 (célula vegetal) y 8.3 (corazón) muestran el mismo recurso en Aprender y Material, una vez y dentro de su curso. En modo solo preguntas no se inserta la tarjeta. Los dos modelos siguen siendo opcionales y locales; no se añadieron modelos a temas ajenos.

La tarjeta incorpora título, indicador vectorial de 3D y accesos Ampliar/Ver en 3D con contraste del tema. La imagen y el modelo reinician su estado por archivo/recurso; la imagen muestra carga mientras se decodifica. Los controles del modelo ocupan como máximo el 45 % de su área y 240 dp, con desplazamiento propio del panel; Fuente tiene un máximo de 140 dp. Esto evita que una descripción o atribución larga expulse el área del modelo. Modelo completo restablece selección, aislamiento, separación y cámara de la célula. Se repararon 19 cadenas con codificación dañada del catálogo y metadatos de partes, conservando identidad, archivos, licencias y hashes de imágenes/modelos.

Comprobado: assembleDebug y 667 pruebas correctas (470 Android + 197 shared), sin fallos, errores ni omitidas; build/study-visual-integration-final-validation.log. Tres pruebas nuevas cubren asociación con niveles reales/Material, español legible y restauración de las ocho partes. Los buffers/shaders reales del corazón y la célula producen imágenes no vacías y distintas al girar/ampliar; ocho estados de selección/separación/aislamiento pasan la comprobación gráfica y se inspeccionaron las vistas de conjunto y separación.

Los 28 archivos de recursos/licencias coinciden byte a byte con el APK: 6 703 985 bytes sin comprimir y 4 286 623 comprimidos. Los siete recursos de catálogo mantienen hashes/tamaños correctos. Nueve vistas del visor local también pasan sin errores ni solicitudes externas. Las pruebas gráficas se hicieron en Chrome/WebGL: no ejecutan GLSurfaceView ni Compose del teléfono. Faltan la comprobación física de controles, gestos, rotación y rendimiento; no se afirma aprobación visual del usuario ni cobertura 3D de todas las materias. No se publicó nada ni se modificaron teoría, preguntas, Firebase, pagos o recompensas.


## 05/11/2026 — Capturas de lentitud y desplazamiento
Ámbito: presentación de teoría, mapa y lector Material; sin editar bancos, Firebase, progreso ni anuncios. Eliminada la espera de ocho segundos del mapa y la cuadrícula alternativa que mezclaba ramas. Subtítulos y ecuaciones se muestran en su orden, sin tarjetas vacías; un mapa explícito evita ofrecer además el esquema automático de la misma sección. El gesto vertical de los bloques matemáticos se entrega al lector Compose con coordenadas de pantalla; las tablas conservan su gesto horizontal. Material prepara y calcula huellas una vez por curso; el cambio de selección solo filtra. La pizarra no se muestra ni conserva una capa abierta al pasar a teoría.
