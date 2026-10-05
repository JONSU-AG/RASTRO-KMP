# Cambios 04/10/2026

OOM de asignación/snapshot contenido; presupuesto de buffers y undo; dibujo retenido al rotar. Etiquetas neutras propias de RASTRO. Pruebas locales pasan, prueba física pendiente.

## Herramientas de dibujo — 04/10/2026

Selector RGB, grosor entero 1–100, borrador vectorial por trazos con puntero, deshacer/rehacer y limpieza reversible. Eliminada cuadrícula. Guardar PNG en destino elegido y compartir imagen con el menú de Android. Conservados ViewModel y raster con límite de memoria; se sustituyó el historial de bitmaps por geometría compartida acotada.

Validación: compileDebugKotlin + testDebugUnitTest, 117 pruebas sin fallos. Cinco pruebas nuevas cubren geometría de borrado y transiciones del historial. Prueba física/exportación real pendiente; no se ejecutó la app ni se generó APK/AAB. Ámbito: archivos Pizarra*, vector de borrador, XML de rutas de exportación, una entrada de proveedor en el manifest y esta documentación.

## 05/10/2026 — Dos opciones de borrador
Añadidos Por trazo y Precisión con puntero y grosor compartidos; borrado local incremental, historial reversible y exportación sobre papel blanco. 121 pruebas Android, lint release y bundle firmado correctos. Sin ejecución de app, commit ni push.
