# Pomodoro

Temporizador local de estudio y descanso. Conserva los modos, ajustes, sonidos y controles existentes. No usa Firebase ni registra actividad académica por dejar el reloj encendido.

La cuenta atrás usa el tiempo transcurrido desde el arranque del teléfono. Android programa el aviso mediante AlarmManager; Compose solo actualiza la vista cuando la actividad está visible.

En Android 12 o posterior, el usuario puede activar «Alarmas y recordatorios» desde el enlace del modal. Con ese acceso se usa una alarma de reloj visible para Android, incluida su indicación de próxima alarma. Sin acceso se programa una alarma aproximada, que puede retrasarse con el ahorro de batería. No se solicita USE_EXACT_ALARM ni acceso para saltar No molestar.

El sonido usa el volumen de alarmas del dispositivo. «Sin sonido», el interruptor de sonido y No molestar se respetan. Las notificaciones dependen del permiso del usuario. El aviso es el tono corto ya existente, no una alarma continua.

Si Android termina el proceso normalmente, los ajustes y la fecha límite se recuperan del almacenamiento local. Después de reiniciar el teléfono se conserva el bloque pausado; no se promete reactivar alarmas después de reinicios o de «Forzar detención».
