# Memoria, trazos y ciclo de vida

PizarraCanvasEngine mantiene un bitmap ARGB acotado por CanvasMemoryPolicy y geometría inmutable en PizarraStrokeHistory. Las coordenadas y el grosor son visuales; la resolución raster puede reducirse según memoria disponible. El lienzo conserva sus dimensiones máximas durante la sesión para preservar los bordes al rotar.

Agregar un trazo rasteriza solo ese trazo. Borrar, deshacer, rehacer o ampliar vuelve a rasterizar el estado vigente. El borrador comprueba el segmento recorrido, no solo puntos sueltos: elimina el trazo completo que intersecta. Un gesto de borrador genera una sola acción de historial. Cancelar el gesto restaura su estado inicial.

Historial de hasta 32 acciones con referencias compartidas, sin copias completas de imagen por trazo. Límites: 16 000 puntos por trazo, 120 000 puntos del dibujo actual y 240 000 puntos únicos retenidos por el historial; se descartan acciones antiguas para mantener el límite. El motor y la exportación pendiente viven en PizarraViewModel; onCleared libera sus recursos.

Guardar toma un snapshot antes del selector de documentos; codifica PNG en IO y libera la copia. Compartir usa el subdirectorio de caché pizarra_exports con URI de FileProvider no exportado y permiso temporal de lectura. No requiere nuevos permisos de almacenamiento. Las imágenes compartidas permanecen en caché y Android puede desalojarlas; guardar permite elegir un destino permanente.

El PNG representa todo el lienzo retenido, incluso la parte que no cabe después de rotar. La sesión no persiste tras terminar el proceso.

## Precisión — 05/10/2026
Las operaciones de borrado preciso se guardan en orden con los trazos y se rasterizan con PorterDuff CLEAR. Durante el movimiento se dibuja solo el segmento nuevo; no se recalcula todo el historial por evento. Cancelar, rotar y deshacer reconstruyen el estado. La exportación añade papel blanco detrás de las zonas transparentes.
