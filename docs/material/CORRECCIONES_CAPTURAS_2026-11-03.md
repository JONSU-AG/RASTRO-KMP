# Correcciones tras las capturas del teléfono

## Fallo confirmado del visor

La captura muestra `data:text/html;charset=utf-8;base64,...` con `ERR_HTTP_RESPONSE_CODE_FAILURE`. El componente usaba `loadDataWithBaseURL` y un filtro que rechazaba cualquier solicitud fuera del origen local HTTPS. La página generada podía entrar como `data:` y el propio filtro la bloqueaba. La prueba previa de HTML en Chrome no cubría este comportamiento de Android.

Ahora se llama a `loadUrl` con una dirección HTTPS local específica del recurso. `shouldInterceptRequest` sirve el documento HTML principal explícitamente y permite solo los assets locales previstos; no se abre acceso general a red, archivos o contenido. Un fallo de documento muestra un aviso nativo y Reintentar, en lugar de dejar la página de error del navegador. Se probaron las rutas HTTPS, el rechazo de `data:`, dominios externos y recorridos de directorio.

## Material y niveles

Material conserva únicamente el curso del que se abrió. Se quitaron el selector entre cursos, las filas horizontales de chips y la apertura obligatoria de la configuración. El botón Temas abre campos desplegables acotados al ancho disponible para tema, subtema y contenido. Las opciones de navegación y revisión administrativa quedan en Más opciones. Las marcas de revisión no aparecen hasta activar ese modo.

Las tarjetas usan Sticker3dCard y el diálogo usa los componentes de RASTRO. Las secciones dejan de repetir su título en el contenedor exterior. Los datos descriptivos, atribuciones, origen y licencia permanecen accesibles dentro de Fuente, cerrado inicialmente.

`LessonContentRenderer` incorpora los mismos recursos científicos que Material. Ambos usan `educationalVisualsForLesson`: coincidencia exacta de curso y lección, sin fallback a otra materia. El corazón está en la teoría del nivel Biología 8.3; la mitocondria en 5.3 y la célula procariota en 5.1. El contorno del Perú está asociado a Geografía 13.1 y 13.2. El modelo 3D sigue siendo solo el corazón; no se añadieron otros modelos en esta corrección.

## Lenguaje e ilustraciones

Se conservan los datos académicos y se normaliza su presentación. Las secciones Importante y las notas de conceptos/admisión se reúnen en una sola sección por lección, preservando párrafos, definiciones, ramas y tablas. La etiqueta Clave fija también se presenta como Importante. Se quitó el emoji del control Auto y la etiqueta interna de categoría pedagógica de las preguntas. La instrucción genérica se sustituye por una indicación breve; las instrucciones académicas específicas se conservan.

Los acompañantes ya no se aceptan solo por pertenecer a una materia: por ejemplo, una célula requiere un tema celular y un matraz un contexto de laboratorio, mezcla o solución. No se muestra una célula en el corazón o intestino por ser Biología. Esto evita ilustraciones ajenas; no significa que todos esos temas ya tengan una ilustración científica propia.

## Pizarra y desplazamiento

En Material, los niveles y los exámenes activos del Simulador, el botón abre `StudyNotebookHost` en el mismo espacio de estudio. Permite resolver en un lienzo inferior sin ocultar la pregunta, o resaltar encima del contenido. El control Mano permite desplazar el documento; las marcas aplican la compensación de desplazamiento. Los dibujos son temporales y están asociados al contenido actual; no se guardan como apuntes ni se sincronizan con Firebase.

Se reutiliza `PizarraCanvasEngine` y su historial/borrado, con fondo transparente para los resaltados. El lienzo crece en bloques, con el presupuesto de memoria existente, para evitar asignaciones por cada píxel de scroll. La barra permite borrar, deshacer, rehacer y abrir color RGB, grosor 1–100 y modos de borrado. Puede repartirse en varias filas cuando el ancho es pequeño. No altera respuestas ni pausa el reloj del examen.

En Pizarra libre, el color, borrador y grosor se colocaron encima del lienzo. El borrador deja de quedar al final de una fila horizontal oculta. Guardar y compartir imágenes conservan su implementación anterior. Las preguntas muestran Desliza para ver más mientras queda contenido por debajo del área visible; el aviso permite avanzar sin ocultar la retroalimentación.

## Validación y límites

Compilación y suites Android/shared: `build/material-screen-corrections-verified.log`. Son 518 pruebas: 321 Android y 197 shared, con cero fallos, errores u omisiones. Las pruebas nuevas cubren rutas del visor, asociaciones exactas, consolidación de notas, selección contextual de acompañantes y coordenadas/bloques de memoria para anotaciones.

El motor de gráficos se verificó en Chrome con los cuatro SVG y el corazón, giro/zoom y sin solicitudes externas: `build/educational-visuals-browser-report.json`. Esa prueba sigue sin ejecutar la envoltura WebView Android.

Falta comprobación física del visor, ventanas, listas, tamaños de letra, gestos y anotaciones en el teléfono. La compilación no certifica esos puntos. No se ejecutó la aplicación, no se publicaron versiones ni se modificaron preguntas, Firebase, compras, anuncios o recompensas.
