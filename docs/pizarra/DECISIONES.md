# Decisiones

Preservar dibujo ante asignación fallida y entre recreaciones mediante ViewModel. Tope de undo dinámico sin segundo motor ni bitmaps ilimitados. Reducir resolución interna conservando escala de entrada/render; no reemplazar herramientas ni navegación.

## Herramientas y exportación — 04/10/2026

Reemplazar las copias de bitmap del historial por trazos inmutables permite borrado por trazos y rehacer conservando los límites de memoria. El borrador no pinta blanco; su grosor define el diámetro de detección. Los colores elegidos pertenecen al dibujo; los controles siguen el tema de RASTRO.

Exportar PNG por el selector de documentos y Android Sharesheet, sin permisos amplios ni envío automático. El proveedor añadido al manifest solo expone archivos de pizarra_exports mediante permisos temporales.

## Dos modos de borrado — 05/10/2026
Conservar la geometría original y registrar borrados precisos como operaciones evita fragmentar o inventar trazos. Una operación por gesto conserva el historial acotado. Los selectores ocupan la fila existente de herramientas sin añadir altura al panel.
