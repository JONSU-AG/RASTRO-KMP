# Amigos y Rachas — solicitudes reales

## Implementación del 04/10/2026

`UserProfileRepository`: reutiliza `racha_dual`, documento con ID formado por los dos UID ordenados. No crea otro sistema de amigos. Campos: user1Uid (remitente), user2Uid (destinatario), participants, senderName, recipientName, status (pending/active), streakDays, updatedAt.

Invitar lee los nombres actuales de `usuarios`, guarda solicitud y aviso personal en una transacción. Aceptar está restringido al destinatario y cambia pending → active; guarda avisos para ambos en la misma transacción. IDs deterministas de notificación impiden duplicados al reintentar. Una amistad activa no vuelve a pending; una solicitud recibida debe aceptarse, no reenviarse. La creación comienza en 0 días: aceptar no inventa un día de estudio.

`FriendNotification.kt` produce mensajes con nombres de usuario y campos del repositorio de notificaciones existente. Tipos friend_request / friend_active. Pulsar el aviso en `RastroApp` abre el diálogo existente de Amigos y Rachas para revisar/aceptar.

`FriendsAndStreaksDialog` sustituye el ejemplo fijo por solicitudes entrantes/salientes y amistades activas, con botón Aceptar, confirmación y errores visibles. Dos listeners limitados a 100 documentos por rol incluyen documentos antiguos sin participants; se eliminan al cerrar o cambiar UID. Nombres antiguos ausentes muestran etiqueta neutral, nunca usuarios ficticios. Este límite debe paginarse antes de soportar más de 100 relaciones por rol.

Escudos: superficies, bordes, iconos y textos derivan de la paleta activa. Se elimina el contador fijo 1/3; el total mostrado procede del campo shields de relaciones activas (0 si no existe). No se implementó ni cambió el cálculo diario de racha/escudos.

## Permisos y límites comprobados

`firestore.rules` incorpora únicamente un bloque nuevo de racha_dual: consulta para participantes, creación por remitente y aceptación por destinatario sin cambiar identidades/días/escudos. Mantiene los permisos existentes de notificaciones; senderUid siempre es el actor autenticado, incluso en el aviso dirigido a sí mismo tras aceptar.

**Regla preparada localmente, no desplegada ni probada en el emulador de Firestore.** El archivo global contiene modificaciones anteriores de otras funciones; no se publicó completo. Si el servidor conserva la denegación por defecto para racha_dual, usuarios normales no podrán enviar/aceptar hasta validar y publicar este bloque sobre las reglas reales. No afirmar que el flujo remoto fue comprobado.

Compilación Android y 11 pruebas JVM correctas (incluidas 2 de payload de notificación). Log `build/simulator-friends-final.log`. App/dispositivos no ejecutados por AGENTS.md. Pendiente recorrido con dos cuentas: solicitud, aviso, aceptación, avisos para ambos y lista sincronizada; pruebas de seguridad (tercero/no autenticado/reintento).


## Revisión posterior — 04/10/2026
Esta sección actualiza las limitaciones anteriores: ahora hay rechazo/reenvío de solicitudes, grupos de 2–10 sobre racha_dual y tres listeners (dos roles más participants). Se invita a amistades ya aceptadas y todos deben aceptar. Notificaciones conservan nombres y sistema existente. Los días nuevos provienen de dailyActivity por integrante; todos deben calificar con lección o 15 minutos. Solo el actor escribe su actividad. Se conserva streakDays histórico con etiqueta separada si no hay fechas fiables. Documentos legacy sin participants usan user1Uid/user2Uid.
6 pruebas de reglas Firestore pasan, incluyendo permisos de aceptación, rechazo, reenvío y prohibición de actividad ajena. El bloque racha_dual se desplegó, conservando todo el resto de reglas activas, y se leyó del servidor para confirmar igualdad. Respaldos build/request-friends-rules-before.rules y after.rules; log request-friends-rules-deploy.log. 107 tests Android y 185 shared pasan. Pendiente recorrido con dos cuentas en dispositivos; no se ejecutó app.
Los escudos se presentan usando datos existentes, pero no se ha implementado protección diaria de grupos/amistades: no afirmar que guardar el campo shields valida su funcionamiento. El límite actual es 100 documentos por consulta; requiere paginación para cuentas que lo superen. Escritura de día compartido se comprueba como máximo cada 5 minutos; al aceptar se refresca el día propio si ya calificó.
