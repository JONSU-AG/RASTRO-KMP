# Cambios — 08/10/2026

Aplicado ámbito local-first, respaldo, playlists, foto de autores y UI de monetización. Conservados cambios previos del árbol de trabajo. No se generó AAB ni se publicó en Play/Firebase. Validación y limitaciones en README/CHECKLIST; integración de pagos sigue pendiente de cuenta RevenueCat y productos reales.
# Validación final

Gradle completó testDebugUnitTest de Android y shared, y lintVitalRelease. Los XML registran 140 + 185 pruebas, sin fallos, errores u omitidas. Log: build/local-first-final.log. No se ejecutó la aplicación; quedan pendientes la revisión visual, el cambio entre dispositivos y la medición de consumo real.

## 08/10/2026 — Retención de Mis errores

Pausa por defecto true aunque exista historial local antiguo sin preferencia explícita; respeta decisión explícita local/nube. Se excluye Authentication anónima del enlace a datos remotos.

Retención de 15 días desde dateAdded (actualizado al resolver/repetir): elimina localmente al entrar/restaurar/usar/sincronizar el repositorio. Proyecciones públicas se filtran también al leer. Las referencias conocidas que caducan se guardan como pendientes y se eliminan de nube en el respaldo manual/semanal existente: transacción revalida tipo/fecha, preservando un error actualizado por otro dispositivo. No nuevo listener, consulta por timer, Cloud Function, TTL de pago ni tarea remota. Si nadie sincroniza, el documento remoto físico puede permanecer más de 15 días, aunque no sea visible en clientes actualizados; no prometer borrado global puntual con Spark.

149 pruebas Android correctas, incluyendo límite exacto de 15 días y limpieza previa. Sin medición de cuotas ni despliegue remoto.


## 08/10/2026 — Refinamiento solicitado

Intervalo del respaldo opcional existente pasa a tres días desde el último éxito. Se mantiene la clave de preferencia heredada para no perder ajustes. Se intenta al abrir la app, no en segundo plano permanente. El respaldo manual usa el mismo marcador temporal. Datos de portada viajan en el perfil existente al guardar.

## 08/10/2026 — Reparación de rachas reiniciadas

Migración 2 reutiliza actividad local, fechas/lecciones completadas y resumen guardado con su fecha final; nunca el máximo aislado para conceder días actuales. Reconstruye solo una cadena reciente sin huecos. Cuentas con guardado local anterior consultan dos documentos una vez por migración exitosa, sin reemplazar saldo ni lecciones ni escribir todos los perfiles. Fallo de red no marca migración completada. Lecturas futuras conservan reparación local; respaldo personal existente la lleva a la nube cuando se sincroniza. Regla antigua de 5 minutos solo para fechas anteriores al 08/10/2026; desde esa fecha exige 15 minutos o una lección completada. No se han restaurado arbitrariamente rachas globales en Firebase. Evidencia faltante no puede reconstruirse con seguridad.

## 09/10/2026
Recuperación de accesos Admin integrada en restauración existente, sin cambiar regla normal ni formato remoto.
