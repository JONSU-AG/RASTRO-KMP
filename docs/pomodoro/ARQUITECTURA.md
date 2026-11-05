# Arquitectura

- `shared/.../pomodoro/PomodoroState.kt`: modelo y ajustes existentes.
- `PomodoroClock.kt`: cálculo puro del tiempo pendiente, edición del plazo y transición de ciclos.
- `androidApp/.../pomodoro/PomodoroTimer.kt`: único propietario del estado observable, preferencias locales, alarma y aviso. Persiste al actuar o cambiar de bloque; no escribe cada segundo.
- `PomodoroAlarmReceiver`: recibe el vencimiento, recalcula el plazo y consume el bloque antes del aviso. Una entrega atrasada no inventa varios ciclos completados. También reprograma al conceder el acceso a alarmas o cambiar la hora del sistema.
- `RastroApp.kt`: conserva callbacks; consulta el controlador y refresca la presentación solo durante STARTED. Ya no decrementa segundos ni reproduce otro tono.
- `PomodoroModal.kt`: enlace al acceso especial de alarmas, sin forzar su concesión.

El plazo usa elapsedRealtime para evitar que cambiar la hora del teléfono altere la duración. setAlarmClock requiere una fecha de calendario, por lo que al cambiar la hora se vuelve a programar usando el tiempo monotónico restante. El receiver termina tras liberar el tono; el bloqueo de CPU está acotado a 2,5 segundos y no enciende la pantalla.
