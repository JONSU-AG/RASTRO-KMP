# Cambios

## 02/11/2026 — aviso con pantalla apagada

Ámbito: PomodoroState y su cálculo puro complementario, controlador Android, receiver, manifest, integración del temporizador en RastroApp y enlace de permiso en el modal. No se modifican Firebase, compras, rutas ni recompensas.

Se elimina el bucle que restaba un segundo por reanudación de la pantalla y su ToneGenerator local. Se utiliza AlarmManager fuera de la actividad, guardado del bloque y un aviso corto protegido por un bloqueo de CPU con tiempo máximo. Al reiniciar el dispositivo se recupera pausado.

Validación inicial: compilación Kotlin Android y pruebas iniciales de Pomodoro correctas en build/pomodoro-first-build.log. La prueba física permanece pendiente; no se abre la aplicación por instrucción del repositorio.

Validación final: assembleDebug y 462 pruebas correctas (265 Android, 197 shared), sin fallos, errores u omitidas. Manifest combinado y conservación de preguntas comprobados en build/pomodoro-manifest-and-scope.json. No se publica ninguna versión.
