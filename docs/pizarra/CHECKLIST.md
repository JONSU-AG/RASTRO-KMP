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
