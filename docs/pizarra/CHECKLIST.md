# Comprobaciones

- [x] Límites del buffer y dimensiones extremas: CanvasMemoryPolicyTest.
- [x] Borrado de trazos completos por cruce rápido y por contacto con puntos: PizarraStrokeHistoryTest.
- [x] Deshacer/rehacer, limpiar reversible, cancelación de borrado y límite de historial: pruebas locales.
- [x] Selector RGB, rango de grosor 1–100 y eliminación de cuadrícula: revisión del código.
- [x] Guardar/compartir PNG sin controles; FileProvider limitado a la carpeta de exportación: revisión del código y compilación.
- [x] compileDebugKotlin y testDebugUnitTest: 117 pruebas, cero fallos (04/10/2026).
- [x] Sin referencias a otras aplicaciones ni promesas 0 ms en la UI.
- [ ] Prueba física de guardar, compartir, tacto/lápiz y rotación en móvil/tablet; no se ejecutó la app.
- [ ] Persistencia tras terminar el proceso: no implementada; guardar PNG es explícito.

No se generó APK/AAB ni se hizo commit/push.

## Validación 05/10/2026
- [x] Modos Por trazo y Precisión revisados en código.
- [x] Nuevas pruebas de historial de precisión y coexistencia con borrado por trazo.
- [x] 121 pruebas Android, lintVitalRelease y bundleRelease correctos.
- [ ] Validación táctil física pendiente; no se ejecutó la aplicación.
La autorización posterior del usuario permite generar y cargar el AAB 2.0.1; la restricción anterior de generación queda superada para esta entrega.

## 03/11/2026 — Pizarra superpuesta reutilizada

- [x] PizarraOverlay reutiliza PizarraScreen y un ViewModel de actividad con clave única desde Material, Aprender y Simulador. El borrador es temporal; el temporizador del examen sigue corriendo. No se añadió otro motor.
- [x] assembleDebug y 512 pruebas correctas (315 Android + 197 shared), sin fallos/errores/omitidas: `build/material-delivery-validation.log`.
- [ ] Prueba física Android pendiente; no hay dispositivo conectado.

Ver `docs/material/INFORME_2026-11-03.md` para alcance y límites.


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
