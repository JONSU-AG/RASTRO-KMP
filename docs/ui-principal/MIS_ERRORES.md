

# Mis errores — controles del propietario, 04/10/2026

Ámbito: ErrorBankRepository, ErrorBankDialog y conexión desde UserProfileScreen. Se reutilizan la colección privada usuarios/{uid}/gamificacion, preferencias locales por UID y la proyección pública existente; no hay nuevo sistema de errores.

## Limpiar todo
El botón limpia todos los orígenes (Aprender, Examen Rápido, Simulacro y Ranking), incluidos repasados. Oculta inmediatamente la lista local, guarda errorsClearedAt en el perfil y vacía sharedErrorBank. La lectura local/remota y pública filtra registros anteriores o iguales al corte para que una caché antigua no los reintroduzca. La limpieza remota consulta únicamente recordType=failed_question y elimina documentos antiguos en transacciones por grupos de 100, comprobando de nuevo su fecha/tipo: una pregunta fallada de nuevo durante la limpieza se conserva. No toca XP, monedas, rachas, progreso, resultados ni otros documentos de gamificación. Nuevos fallos después del corte vuelven a guardarse normalmente.

Si falla la red, el historial permanece limpio localmente y se informa de sincronización/limpieza remota pendiente. El marcador del perfil usa las escrituras offline existentes; no afirmar eliminación remota completada antes de confirmación. Eliminar registros pendientes requiere conexión; no se borró ningún dato de usuarios durante esta intervención.

## Pausa
Switch Pausar guardado de errores. Se persiste en preferencias por cuenta y errorSavingPaused del perfil; listeners sincronizan dispositivos. Ambas entradas de captura (lección y exámenes) retornan antes de modificar/guardar errores si está pausado. Conservar errores existentes, práctica, respuestas, revisión de examen y recompensas. Al despausar solo se registran fallos nuevos. Controles exclusivos del propietario, ausentes de perfiles ajenos. No cambia compartir/privacidad.

## Validación
112 pruebas Android y compileDebugKotlin correctos, build/errors-background-playlist-validation.log. Dos pruebas nuevas cubren limpieza de todos los orígenes sin ocultar errores nuevos y proyección pública antigua filtrada. Pruebas físicas de pausa, limpieza offline/online y dos dispositivos pendientes: no se ejecutó app/APK/AAB.
