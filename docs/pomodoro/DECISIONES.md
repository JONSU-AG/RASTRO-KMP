# Decisiones

## 02/11/2026

Se sustituye el temporizador dependiente de la composición por una fecha límite persistente y una alarma del sistema. Se reutiliza PomodoroState, sin otro sistema de estudio, navegación o gamificación.

Se usa SCHEDULE_EXACT_ALARM, concedido por el usuario, para el temporizador explícito. Si falta, se conserva una alternativa aproximada y se explica su posible retraso. No se cambia la configuración global de batería.

Una pausa cancela el aviso; reanudar crea un nuevo plazo con el tiempo restante. Cambiar el sonido o minimizar no reinicia el bloque; +5 minutos modifica la alarma pendiente. Las preferencias previas mantienen sus claves.

Referencia de Android: https://developer.android.com/develop/background-work/services/alarms (alarmas exactas, acceso especial y setAlarmClock).
