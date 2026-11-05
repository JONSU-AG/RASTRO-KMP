# Comprobaciones de Pomodoro

- [x] Causa encontrada: cuenta atrás y sonido dependían de LaunchedEffect en RastroApp, sin alarma del sistema.
- [x] Un controlador compartido por la interfaz y el receiver; el bloque se consume antes del aviso.
- [x] Tiempo monotónico, persistencia local y cancelación/reprogramación al editar.
- [x] Se conservan los tres sonidos, silencio, modos y auto-ciclo.
- [x] Enlace al acceso especial; alternativa aproximada si se deniega.
- [x] Manifest combinado incluye receiver no exportado, SCHEDULE_EXACT_ALARM y WAKE_LOCK.
- [x] assembleDebug y 462 pruebas repetidas correctas: 265 Android y 197 shared, sin fallos, errores ni omitidas. Cinco pruebas de Pomodoro cubren tiempo suspendido, pausa/reanudación, extensión, silencio y ciclos. Log: build/pomodoro-chemistry-final-validation.log.
- [ ] Prueba física con pantalla bloqueada y ahorro de batería; no se ha ejecutado Android.
- [ ] Probar en teléfono: estudio de 1 minuto, descanso de 1 minuto, pausa, +5 minutos y silencio; confirmar un solo aviso por bloque.
- [ ] Probar permisos denegados, No molestar, volumen de alarmas y recuperación tras cierre de proceso.
