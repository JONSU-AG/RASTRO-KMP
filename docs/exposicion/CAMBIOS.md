# Cambios

01/11/2026: añadida configuración de exposición por flag local. Tras aclaración, revertidos atajos de acceso ilimitado: reserva finita reutilizando CoinRewardPolicy, costes e intentos existentes conservados. Límite temporal 75; una reserva de 750, no cada inicio. Pro/grants/precios/SDK intactos. Publicidad omitida antes de inicializar proveedores; no se hicieron operaciones remotas de publicación o pago.

Racha: compactación del contador, estado de hoy y mejor registro; eliminada repetición de racha actual. Calendario y navegación conservados, controles ampliados y mes legible.

Teoría: AcademicTable/extractAcademicTables preservan tablas y fórmulas mediante el motor local existente. Se deja de aplicar la conversión anterior a viñetas. Tablas originales mal formadas conservan texto. Convertidas las magnitudes fundamentales/derivadas de Física 1.1 conservando valores y referencias.

Validación 01/11/2026: assembleDebug y 195 pruebas Android correctos (build/presentation-tables-final.log); reserva finita, no duplicación al restaurar, gasto de monedas/vidas, rama normal y tablas comprobados. Física 1.1 mantiene 17 filas mediante su loader real y pasa CatalogValidator sin errores/advertencias. Motor tabular aislado a 360 px: encabezados, nueve celdas, seis expresiones y scroll horizontal correctos; cero errores JS o peticiones externas. No equivale a ejecutar Android.
