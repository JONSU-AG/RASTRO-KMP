# RASTRO local y respaldo opcional — 08/10/2026

El estudio guarda el avance en el dispositivo. Invitado no crea una cuenta de Firebase. Correo/Google siguen siendo las identidades para publicar, crear playlists, usar amigos y respaldar.

## Qué cambió

- `GamificationRepository.save` guarda localmente; `saveCloud` solo se invoca desde el respaldo explícito/cada tres días. El checkpoint de 30 segundos ya no sube todo el progreso.
- Ajustes → Respaldo en la nube: sincronizar, recuperar con confirmación, activar respaldo cada tres días (desactivado inicialmente), fecha de último respaldo. El automático se intenta al abrir con una cuenta real; no es una tarea permanente.
- Se recupera el progreso remoto al usar una cuenta sin copia local. Un avance invitado se transfiere una vez a una cuenta sin respaldo; no se suman balances ni se copia automáticamente a otra cuenta.
- `syncRevision` protege respaldos simultáneos de versiones compatibles. Si la nube cambió, se rechaza el guardado. Recuperar conserva una copia local anterior antes de reemplazar. Los clientes antiguos que no incrementan syncRevision requieren validación de convivencia; no afirmar resolución universal de conflictos.
- Mis errores comienza pausado para cuentas/dispositivos nuevos. Se conserva la preferencia existente. Capturar y resolver es local; el botón de respaldo envía filas modificadas. Compartir o limpiar deliberadamente sigue actualizando la proyección pública/copia remota.
- Actividad Admin: checkpoint local de 30 s, bloques de 15 min y primer ingreso diario; los restos se envían en el siguiente día. Si un usuario deja de abrir antes de 15 min, el total remoto puede estar incompleto hasta su siguiente ingreso. No inventar minutos.
- Día de racha compartida: sigue comunicándose independientemente del respaldo personal al cumplir la actividad, con límite por sesión/día y reintento en fallo. Aceptar una nueva racha vuelve a comprobar el día.
- Playlists privadas y públicas: consultas al entrar/actualizar, sin listeners permanentes. Páginas de 20 con cursor. Crear requiere cuenta; invitado se dirige al login. Editar, eliminar y compartir siguen siendo operaciones inmediatas. Compartir cambia solo isShared.
- Fotos: caché compartida por autor, agrupación de solicitudes durante 1 s, vigencia 15 min. Foto propia se refleja mediante UserManager; otras fotos se refrescan al consultar de nuevo después de vencer caché. No hay reescrituras masivas de publicaciones ni listener por tarjeta.
- Destacados: petición puntual y caché de 5 min, disponible para cuentas reales. La consulta filtra destacados, conserva el orden por fecha en cliente; aún no está paginada en servidor.
- Perfil propio reutiliza observación global. Publicaciones de un perfil consultan autores por OR de campos heredados, sin descargar toda la colección para filtrarla en cliente.

## Límites y pendientes

El respaldo cubre progreso y errores. Preferencias visuales/herramientas permanecen locales; no se afirma respaldo completo del dispositivo. Mensajes, solicitudes, compras y exámenes competitivos mantienen sus repositorios y reglas; no se convierten en datos locales autorizados para competir. El monedero actual sigue sin backend antifraude, como ya estaba documentado.

Spark no se cambió. No se desplegaron reglas ni se publicaron versiones. No se ejecutó APK/emulador/dispositivo. Prueba física pendiente de cambio de cuentas, modo avión, dos dispositivos, fotos, anuncios y layouts pequeños.
