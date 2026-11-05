# Comprobaciones

- [x] Configuración temporal instalada y confirmada en BuildConfig.PRESENTATION_MODE = true.
- [x] Pro oculto y checkout desactivado sin borrar IDs/grants/entitlements.
- [x] Anuncios automáticos y voluntarios bloqueados antes de solicitar consentimiento/cargar SDK en este modo.
- [x] Reserva finita con recibo existente, sin repetición al restaurar el progreso; costes, compra de vidas y consumo conservados.
- [x] Racha compactada, sin cambios a sus cálculos o días registrados.
- [x] Tablas Markdown preservadas y desplazables, con encabezados HTML y fórmulas dentro de celdas.
- [x] Dos tablas de Física 1.1: 17 filas de datos conservadas; fixture equivalente.
- [x] Validación final de 195 tests y diff sin errores de espacios.
- [ ] Revisión física del teléfono; no se ejecutó Android ni se publicó una versión.

Validación 01/11/2026: assembleDebug y 195 pruebas Android correctos (build/presentation-tables-final.log); reserva finita, no duplicación al restaurar, gasto de monedas/vidas, rama normal y tablas comprobados. Física 1.1 mantiene 17 filas mediante su loader real y pasa CatalogValidator sin errores/advertencias. Motor tabular aislado a 360 px: encabezados, nueve celdas, seis expresiones y scroll horizontal correctos; cero errores JS o peticiones externas. No equivale a ejecutar Android.
