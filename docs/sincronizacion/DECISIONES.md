# Decisiones

- Reutilizar UserManager, repositorios, SharedPreferences y ProAccess. Sin segundo sistema de cuentas, gamificación o Pro.
- Invitado = datos del dispositivo, no FirebaseAuth anónimo.
- Separar respaldo personal opcional de acciones sociales inmediatas.
- Priorizar rechazo de conflicto y recuperación confirmada sobre sumar monedas entre snapshots.
- Preservar preferencias de errores existentes; pausado por defecto solo cuando no había una elección/historial.
- No migrar catálogos académicos ni modificar sus contenidos.
- No activar Blaze ni sistemas de cobro sin configuración real y aprobación de datos fiscales.

## 08/10/2026 — Retención de Mis errores

Pausa por defecto true aunque exista historial local antiguo sin preferencia explícita; respeta decisión explícita local/nube. Se excluye Authentication anónima del enlace a datos remotos.

Retención de 15 días desde dateAdded (actualizado al resolver/repetir): elimina localmente al entrar/restaurar/usar/sincronizar el repositorio. Proyecciones públicas se filtran también al leer. Las referencias conocidas que caducan se guardan como pendientes y se eliminan de nube en el respaldo manual/semanal existente: transacción revalida tipo/fecha, preservando un error actualizado por otro dispositivo. No nuevo listener, consulta por timer, Cloud Function, TTL de pago ni tarea remota. Si nadie sincroniza, el documento remoto físico puede permanecer más de 15 días, aunque no sea visible en clientes actualizados; no prometer borrado global puntual con Spark.

149 pruebas Android correctas, incluyendo límite exacto de 15 días y limpieza previa. Sin medición de cuotas ni despliegue remoto.


## 08/10/2026 — Refinamiento solicitado

Intervalo del respaldo opcional existente pasa a tres días desde el último éxito. Se mantiene la clave de preferencia heredada para no perder ajustes. Se intenta al abrir la app, no en segundo plano permanente. El respaldo manual usa el mismo marcador temporal. Datos de portada viajan en el perfil existente al guardar.

## 08/10/2026 — Recuperación con evidencia

La reparación es por cuenta al abrir la versión actualizada, sin listener ni proceso masivo. Conserva monedas, completados, recompensas y revisiones del respaldo. No revivir una racha antigua por bestStreak; solo días consecutivos recientes demostrables. Datos antiguos de presencia usan el umbral que correspondía hasta 07/10/2026, fechas nuevas no usan 5 minutos. Invitados solo evidencia local, sin cuenta Firebase.

## 09/10/2026
Solo Admin Firebase verificado califica por acceso. Dos lecturas de historial como máximo por día exitoso y dispositivo; sin conexión reintenta en otra apertura. No se incrementa automáticamente XP o monedas.
