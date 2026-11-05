# Arquitectura

`AprenderScreen` abre `MaterialReaderDialog` sobre la pantalla actual. `AprenderRepository` sigue siendo la fuente del catálogo. `MaterialReaderModel` organiza referencias a las lecciones y preguntas originales, conserva su identidad, ordena los códigos de subtema y separa introducción, secciones, tablas, mapas y fórmulas. Se reutilizan los renderizadores académicos actuales.

`MaterialReaderStore` usa preferencias privadas con un archivo distinto por UID o invitado. Guarda selección, referencia y posición; nunca usa el progreso de juego como marcador de lectura. Las marcas incluyen huella del contenido: al cambiar su fuente, vuelven a pendiente. Al eliminar la cuenta se limpia este archivo local. Cambiar de usuario reconstruye la sesión del lector. El desplazamiento vertical se restaura; en modo horizontal se restaura la unidad, no su desplazamiento interior después de cerrar.

La revisión requiere token Firebase con correo verificado, correo incluido en `AdminConfig`, UID actual coincidente y modo administrativo efectivo. La interfaz no permite mutaciones remotas. Esto no añade reglas ni privilegios a Firebase.

## Recursos gráficos

El contrato serializable `EducationalVisualCatalog` vive en `shared`. El catálogo Android está en `androidApp/src/main/assets/educational-visuals/catalog.json`; cada entrada vincula `subjectId` y `lessonIds` con archivos, tamaños, SHA-256, versiones, fuentes y atribuciones. Añadir otro recurso aprobado consiste en incorporar archivos y metadatos, sin condicionales nuevos por tema en las pantallas.

`EducationalVisualRegistry` valida versión, identidad, rutas locales, tamaños y licencias admitidas. Los archivos se validan por hash en las pruebas. `MaterialReaderModel` inserta solamente recursos del curso y de las lecciones asociadas.

`EducationalVisualCard` muestra primero el SVG local, con JavaScript deshabilitado. El GLB y Google model-viewer 4.4.0 solo se abren al solicitar 3D. El visor usa WebView con un origen local interceptado, sin acceso a archivos generales, sin cookies de terceros ni solicitudes externas. No necesita CDN, servidor propio, conexión a Firebase ni cuenta de pago. En un fallo de carga o tiempo de espera aparece un aviso y permanece disponible la imagen plana. Al cerrar se retira el modelo y se destruye el WebView.

El contrato de datos se puede reutilizar en una futura web; este cambio no implementa el visor de otras plataformas KMP. No se añadió SceneView ni se actualizaron Compose/Filament.

## Pizarra y modalidades

`StudyNotebookHost` se integra en Material, niveles y exámenes activos con la misma clase `PizarraCanvasEngine`: lienzo inferior para resolver y capa transparente para resaltar. La compensación de scroll permite dibujar en coordenadas del documento; el buffer crece en bloques. Los dibujos son temporales por contenido. Pizarra libre conserva su ViewModel de actividad, exportación y compartición. No se pausan los temporizadores de examen.

La meta existente incorpora una modalidad UNSA opcional. Las demás universidades conservan su configuración y la clasificación de área sigue derivándose de la carrera. No existen ponderaciones ni prioridades académicas nuevas sin datos oficiales verificados.


## Corrección de WebView y controles

El documento inicial se sirve mediante loadUrl HTTPS local y una respuesta HTML explícita en shouldInterceptRequest; no se usa loadDataWithBaseURL. Ver CORRECCIONES_CAPTURAS_2026-11-03.md. Fuente es un desplegable cerrado. El curso de Material queda fijo; Temas contiene los campos de tema/subtema/contenido y Más opciones aloja navegación/revisión. La misma función educationalVisualsForLesson asocia recursos en Material y LessonContentRenderer.


## Mapas y desplazamiento de tablas

AcademicSourceMap utiliza Canvas nativo con layoutAcademicMap: se construye un bosque de disposición sin eliminar ninguna relación del grafo original. La vista previa y la ampliación comparten ese cálculo; el mapa permite pellizcar/arrastrar y reajustar la vista completa. Las etiquetas matemáticas preparadas localmente se cargan por hash del texto, con una caché acotada, sin iniciar JavaScript en cada mapa. Los assets map.html/map.js/map.css se conservan para verificaciones aisladas previas, pero ya no son el visor de producción. AcademicTouchAxis distingue el gesto horizontal de una tabla del vertical del lector; ScientificMath entrega distancia y velocidad verticales al sistema de desplazamiento anidado de Compose.


04/11/2026: los pilotos 5.4 y 8.3 usan visor nativo. Integracion comprobada con las lecciones reales; controles limitados al 45 % del alto del visor y 240 dp. Fuente: maximo 140 dp. No se modifican los bancos.
