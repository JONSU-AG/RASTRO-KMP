# Comprobaciones

- [x] Validación final: 140 pruebas Android y 185 compartidas; 0 fallos, errores u omitidas.
- [x] Compilación y lintVitalRelease completados, sin ejecutar la app ni generar una AAB.

- [x] Código invitado sin signInAnonymously.
- [x] Progreso periódico usa almacenamiento local; respaldo manual/semanal separado.
- [x] Conflictos de revisión rechazan sobrescritura, recuperación con confirmación.
- [x] Playlists requieren cuenta para crear; consultas de 20 con cursor y actualización explícita.
- [x] Fotos por autor en caché compartida; no escrituras masivas a publicaciones.
- [x] Errores nuevos pausados, respaldo de filas modificadas.
- [x] UI de packs con progreso derivado de recibos reales y botones Sticker3d.
- [ ] Prueba real offline/cambio de cuentas/dos dispositivos: ejecución de app prohibida.
- [ ] Medición de ahorro en Firebase con usuarios reales: no extrapolar porcentajes.
- [ ] Integración RevenueCat activa: falta cuenta, clave pública, productos y permisos de Play.

- [x] Pausa por defecto explícita y retención local de 15 días; test de límite correcto.
- [x] Borrado remoto de referencias caducadas preparado en respaldo; revalida fecha.
- [ ] Borrado real entre dos dispositivos pendiente; no equivale a TTL remoto.


## 08/10/2026 — Refinamiento solicitado

- [x] Cambios implementados y compilación de Kotlin incluida en tests.
- [x] 155 tests Android; cero fallos/errores. Vectores XML válidos.
- [ ] Revisión física en temas claro/oscuro, pantallas pequeñas y gestos: no se ejecutó la app.
- [x] lintVitalRelease y compilar_app.bat (assembleDebug) correctos. App no instalada ni ejecutada.

## 08/10/2026 — Rachas
- [x] Reparación de cadena reciente con fechas, lecciones válidas y presencia histórica; bestStreak aislado no revive rachas.
- [x] Migración anterior a versión 2 para cuentas existentes; dos lecturas una vez por éxito, saldo/lecciones actuales preservados.
- [x] Pruebas de racha reiniciada 2→15, huecos, máximo sin evidencia y umbral nuevo; 358 pruebas totales sin fallos.
- [ ] Confirmación real de racha específica del propietario y demás cuentas tras actualización: no se ejecutó la app ni se concedieron días arbitrarios.

## 09/10/2026
- [x] Excepción de apertura Admin aislada de la regla de lección/15 minutos de estudiantes; prueba de autorización, huecos, fechas futuras e idempotencia.
- [ ] Verificar recuperación real en dispositivo con la cuenta Admin.
