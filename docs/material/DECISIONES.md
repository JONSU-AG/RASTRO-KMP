# Decisiones — 03/11/2026

- Consultar el contenido original mediante referencias, sin copiar bancos ni generar preguntas nuevas. Lectura y gamificación tienen estados independientes.
- Dividir por contenido y componer de forma diferida con LazyColumn/HorizontalPager. El índice completo se prepara al abrirlo; no se construye un único texto gigante de todo el curso.
- Mantener la revisión en el dispositivo hasta disponer de un flujo autorizado de edición y publicación. Un cambio en la huella invalida el estado de revisión anterior.
- Mantener SVG primero y 3D opcional. El visor local evita una dependencia nueva de Android y conserva un contrato común para KMP. No se afirma paridad web de este visor.
- Incorporar cuatro recursos gráficos y un único modelo anatómico real. No importar bibliotecas completas ni presentar un contorno nacional como mapa de relieve o de departamentos.
- Conservar las licencias por archivo. Z-Anatomy no se incorpora como paquete por sus atribuciones mixtas, incluidas piezas NC. El corazón de BodyParts3D conserva CC BY-SA 2.1 Japón de sus OBJ, aunque la web actual muestre CC BY 4.0.
- El material del corazón es ilustrativo; el color no representa características clínicas. Se conserva la topología reducida oficial y se documentan conversión, orientación y escala.
- La modalidad UNSA es una preferencia de preparación, no una matrícula ni una certificación de elegibilidad. Se preservan metas anteriores sin modalidad.


## 03/11/2026 — Corrección de las capturas de Material y pizarra

Se corrigió el documento inicial del visor mediante HTTPS local interceptado. Material conserva su curso, usa desplegables y oculta créditos/revisión hasta solicitarlos. La teoría de los niveles incorpora la misma biblioteca; los avisos se reúnen en Importante. La pizarra nativa se integra junto a preguntas/material con resaltado y desplazamiento; herramientas de Pizarra libre visibles encima del lienzo. Se preservan fuentes, bancos, respuestas, recompensas y Firebase. Ver docs/material/CORRECCIONES_CAPTURAS_2026-11-03.md para pruebas y límites físicos.


## 03/11/2026 — Historia: ilustraciones relacionadas y fotografías ligeras

Cuatro SVG originales, CC0, para cerámica, tejido, templo andino y quipu. Android usa sus equivalentes VectorDrawable, con relleno opaco y contorno. La selección depende del tema, respeta el presupuesto anterior (máximo tres acompañantes distintos por lección, separados entre secciones) y no asigna arquitectura andina a Roma o Egipto. Son símbolos, no reproducciones de piezas arqueológicas.

Se integraron dos fotografías Open Access del Met: botella geométrica Moche (objeto 309442) y vasija de maíz Nasca (316270), cada una de unos 12 KB en WebP. Se verificó el dominio público individual y la política CC0 del museo; las fichas de procedencia están en assets/educational-visuals/licenses. El inventario completo está en ../material/INVENTARIO_HISTORIA_2026-11-03.md. Fotos, SVG y XML nativos suman 31 657 bytes; esa cifra excluye documentación y metadatos.

Las imágenes se colocan después de su sección en Historia del Perú, semana 2, nivel 2.1, usando los títulos reales de Cultura Moche y Cultura Nasca. La misma asociación se utiliza en Material. El campo opcional sectionKeywords conserva el comportamiento de los recursos anteriores. Si un recurso exige una sección inexistente, no se muestra en otra como sustituto. Los identificadores de revisión de imágenes antiguas conservan su huella anterior: el nuevo metadato de ubicación no invalida una revisión sin cambiar la imagen.

Validación: assembleDebug y 551 pruebas (354 Android + 197 shared), sin fallos, errores ni omitidas. Seis pruebas nuevas cubren relevancia, SVG/XML sin recursos externos, licencias individuales, peso, asociación exacta al contenido real, ausencia en modo solo preguntas y estabilidad de la huella. Log build/history-visual-validation.log. Fotografías locales inspeccionadas; SVG/XML validados estructuralmente. No se ejecutó Android; revisión visual/táctil y rendimiento físico pendientes. No se publicaron cambios ni se modificaron bancos, Firebase o recompensas. Esto no constituye cobertura gráfica completa de todas las materias.


## 04/11/2026

El mapa muestra todos los conceptos desde la vista previa; no se navega por ramas mediante botones de texto. La misma distribución compacta se amplía con zoom y arrastre. Se conserva cada arista del grafo original, incluidos ciclos y conceptos compartidos. El visor usa los archivos locales de notación existentes, sin servicios remotos nuevos. Las tablas retienen el gesto horizontal después de superar el umbral táctil; los gestos verticales se ceden al lector.


04/11/2026: la cabecera «Portada y ficha técnica» se excluye de la presentación, igual que las fichas técnicas previas. Caso real de Física 11.1 cubierto por TheoryClarityTest: se conserva su teoría y mapa de ondas, sin convertir sistema de evaluación/duración en un esquema. Seis fuentes afectadas por esa etiqueta; no se editaron sus contenidos. Pruebas globales: 651 correctas; sin lanzamiento de Android.


## 04/11/2026 — Integración y cierre técnico de los pilotos 3D

Se comprueba con las lecciones reales del repositorio que Biología 5.4 (célula vegetal) y 8.3 (corazón) muestran el mismo recurso en Aprender y Material, una vez y dentro de su curso. En modo solo preguntas no se inserta la tarjeta. Los dos modelos siguen siendo opcionales y locales; no se añadieron modelos a temas ajenos.

La tarjeta incorpora título, indicador vectorial de 3D y accesos Ampliar/Ver en 3D con contraste del tema. La imagen y el modelo reinician su estado por archivo/recurso; la imagen muestra carga mientras se decodifica. Los controles del modelo ocupan como máximo el 45 % de su área y 240 dp, con desplazamiento propio del panel; Fuente tiene un máximo de 140 dp. Esto evita que una descripción o atribución larga expulse el área del modelo. Modelo completo restablece selección, aislamiento, separación y cámara de la célula. Se repararon 19 cadenas con codificación dañada del catálogo y metadatos de partes, conservando identidad, archivos, licencias y hashes de imágenes/modelos.

Comprobado: assembleDebug y 667 pruebas correctas (470 Android + 197 shared), sin fallos, errores ni omitidas; build/study-visual-integration-final-validation.log. Tres pruebas nuevas cubren asociación con niveles reales/Material, español legible y restauración de las ocho partes. Los buffers/shaders reales del corazón y la célula producen imágenes no vacías y distintas al girar/ampliar; ocho estados de selección/separación/aislamiento pasan la comprobación gráfica y se inspeccionaron las vistas de conjunto y separación.

Los 28 archivos de recursos/licencias coinciden byte a byte con el APK: 6 703 985 bytes sin comprimir y 4 286 623 comprimidos. Los siete recursos de catálogo mantienen hashes/tamaños correctos. Nueve vistas del visor local también pasan sin errores ni solicitudes externas. Las pruebas gráficas se hicieron en Chrome/WebGL: no ejecutan GLSurfaceView ni Compose del teléfono. Faltan la comprobación física de controles, gestos, rotación y rendimiento; no se afirma aprobación visual del usuario ni cobertura 3D de todas las materias. No se publicó nada ni se modificaron teoría, preguntas, Firebase, pagos o recompensas.


## 05/11/2026 — Lectura y mapas sin espera
El mapa se dibuja con Canvas nativo y un bosque jerárquico calculado desde sus nodos y relaciones originales; no espera un WebView. Las etiquetas con TeX, subíndices o potencias se precomponen con el KaTeX local existente mediante scripts/academic/build_map_math_labels.cjs y se identifican por SHA-256 de su texto. Al cambiar el texto, la prueba exige regenerar su imagen; no se reutiliza una etiqueta de otro contenido. Se conservan las licencias de KaTeX. Caché de imágenes limitada a 24 entradas.
Material prepara una vez el curso por sesión y filtra referencias al cambiar de modalidad. La caché compartida de presentación conserva hasta 64 teorías, identificadas por su contenido completo. Las secciones matemáticas mantienen el orden del texto en un bloque de composición, sin crear un navegador por viñeta. La pizarra se monta únicamente cuando la unidad actual es una pregunta.
