# Cambios 04/10/2026

OOM de asignación/snapshot contenido; presupuesto de buffers y undo; dibujo retenido al rotar. Etiquetas neutras propias de RASTRO. Pruebas locales pasan, prueba física pendiente.

## Herramientas de dibujo — 04/10/2026

Selector RGB, grosor entero 1–100, borrador vectorial por trazos con puntero, deshacer/rehacer y limpieza reversible. Eliminada cuadrícula. Guardar PNG en destino elegido y compartir imagen con el menú de Android. Conservados ViewModel y raster con límite de memoria; se sustituyó el historial de bitmaps por geometría compartida acotada.

Validación: compileDebugKotlin + testDebugUnitTest, 117 pruebas sin fallos. Cinco pruebas nuevas cubren geometría de borrado y transiciones del historial. Prueba física/exportación real pendiente; no se ejecutó la app ni se generó APK/AAB. Ámbito: archivos Pizarra*, vector de borrador, XML de rutas de exportación, una entrada de proveedor en el manifest y esta documentación.

## 05/10/2026 — Dos opciones de borrador
Añadidos Por trazo y Precisión con puntero y grosor compartidos; borrado local incremental, historial reversible y exportación sobre papel blanco. 121 pruebas Android, lint release y bundle firmado correctos. Sin ejecución de app, commit ni push.

## 03/11/2026 — Pizarra superpuesta reutilizada

PizarraOverlay reutiliza PizarraScreen y un ViewModel de actividad con clave única desde Material, Aprender y Simulador. El borrador es temporal; el temporizador del examen sigue corriendo. No se añadió otro motor. Ver `docs/material/INFORME_2026-11-03.md`; cambios locales, sin publicación ni modificación de Firebase remoto.


## 03/11/2026 — Corrección de las capturas de Material y pizarra

Se corrigió el documento inicial del visor mediante HTTPS local interceptado. Material conserva su curso, usa desplegables y oculta créditos/revisión hasta solicitarlos. La teoría de los niveles incorpora la misma biblioteca; los avisos se reúnen en Importante. La pizarra nativa se integra junto a preguntas/material con resaltado y desplazamiento; herramientas de Pizarra libre visibles encima del lienzo. Se preservan fuentes, bancos, respuestas, recompensas y Firebase. Ver docs/material/CORRECCIONES_CAPTURAS_2026-11-03.md para pruebas y límites físicos.


## 03/11/2026 — Preguntas y pizarra de pantalla completa

Cabecera y progreso únicamente durante las preguntas. Pizarra compartida de preguntas con enunciado integrado en el papel, colores/grosor visibles y conservación acotada por pregunta. No se modifican los bancos, reglas, Firebase ni recompensas. Compilación debug y 543 pruebas unitarias correctas; revisión visual/táctil pendiente, sin ejecutar la app. Detalles y límites en `../preguntas/INFORME_2026-11-03.md`. Esta descripción sustituye la distribución partida inicial en preguntas; Material mantiene su rama de consulta.


## 03/11/2026 — Ajustes de margen inferior, flecha y teoría

La pizarra calcula el margen seguro del diálogo a partir de los insets completos de su ventana, sin descontar los ya consumidos por el Scaffold de la app. Evita que el control de grosor termine bajo la navegación de Android.

La flecha de lectura se integra en el margen lateral de QuestionScrollArea y deja de ser una fila que resta altura al área desplazable. Solo aparece si quedan más de dos píxeles por recorrer; no ocupa altura adicional ni modifica el criterio al aparecer. Se retiraron los dos avisos externos en Aprender y examen activo.

La cabecera general se oculta durante toda la ruta del nivel, incluida la teoría inicial. No cambian preguntas, respuestas, recompensas ni dibujos.

Validación: assembleDebug y 545 pruebas unitarias (348 Android + 197 shared), sin fallos, errores ni omitidas. Dos pruebas nuevas cubren la indicación al caber todo el contenido, el margen de redondeo y el final del recorrido. Log: build/question-insets-scroll-validation.log. No se ejecutó Android; queda pendiente confirmar los márgenes y el resultado visual en el celular del usuario.


## 03/11/2026 — Grosor estable y exportación en preguntas

Ámbito: StudyNotebookHost, QuestionNotebookState y el nuevo QuestionNotebookExport; no se modifica Pizarra libre ni la evaluación de preguntas.

El grosor se coloca antes de la paleta. La fila de modos de borrado permanece en la misma posición con lápiz, mano y borrador; sus botones también permiten activar directamente el borrador. Se elimina el cambio de altura causado por mostrar esa fila solo con borrador. Esto complementa el margen seguro del diálogo: la captura del usuario mostró que el margen por sí solo no resolvía el recorte.

El botón superior de ajustes se sustituye por un menú Guardar imagen / Compartir imagen. Los ajustes siguen en la barra inferior. La captura incluye el área visible del papel, texto y tinta según la posición/zoom actuales, y excluye cabecera/herramientas. No exporta todo el plano virtual fuera de pantalla.

La captura usa GraphicsLayer de Compose; PNG, selector de destino y FileProvider reutilizan los mecanismos y la carpeta pizarra_exports existentes. No se agregan permisos, proveedores ni dependencias. La copia pendiente de guardar pertenece al ViewModel de la actividad y se libera al cancelar, completar o destruirlo. Los errores de memoria/exportación se muestran sin simular una descarga exitosa.

Validación: assembleDebug y 545 pruebas (348 Android + 197 shared), sin fallos/errores/omitidas. Log build/question-export-validation.log. No se ejecutó Android: quedan pendientes la disposición física y probar guardar/compartir, especialmente contenido matemático alojado en vistas Android.

Referencia técnica de captura: https://developer.android.com/develop/ui/compose/graphics/draw/modifiers#write-contents-of-composable-to-bitmap
