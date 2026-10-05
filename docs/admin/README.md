# Ingresos diarios desde Admin

Ámbito exclusivo: registro real de apertura/foreground y la pestaña existente de actividad en Admin. No cambios de gamificación, contenido académico, otras pantallas o servicios externos.

## Datos reutilizados

`usuarios/{uid}`: testerDailyApp, testerDailySeconds, testerDailyWeb, lastTesterActiveDate y lastTesterActiveTimestamp. Se leen mapas normales y campos literales `testerDailyApp.YYYY-MM-DD` / equivalentes: la escritura anterior con set(merge) produjo estos campos con puntos y el lector buscaba mapas. Se preservan los datos originales; no migración remota destructiva.

Total por fecha = máximo(total registrado, app + web), evitando sumar dos veces el total y sus fuentes. Valores anteriores literales y nuevos anidados se acumulan por fuente. Una clave diaria, incluso de 0 segundos, demuestra apertura; último acceso explícito del tracker también sirve como evidencia para esa fecha. Auth lastSignInTime, XP e historial de gamificación no determinan asistencia. Si faltan registros antiguos no es posible reconstruir aperturas no medidas; “No entró” significa sin evidencia disponible.

## Registro permanente

Los callbacks de foreground ya conectados en RastroApplication siguen llamando a TesterActivityRepository, sin modificar esa clase. Inicio registra apertura inmediata para cuentas Firebase no anónimas; usuarios autenticados persistentemente se registran cada vez que vuelven. Listener Auth de duración Application controla ingreso/cambio de cuenta durante foreground. Solo se acumula tiempo mientras una Activity está resumed; background no cuenta.

Tiempo mediante elapsedRealtime (monotónico), checkpoint de 30 s y acumulación en milisegundos para no perder fracciones entre sesiones. Se divide cada intervalo por medianoche con ZoneId.systemDefault, equivalente a la fecha local existente de RASTRO. No usar UTC para la clave diaria. Apertura y cierre sincronizan; durante uso continuo se agrupan aproximadamente 60 s.

Se conservan pendientes locales por UID/fecha en SharedPreferences existentes. Un lote durable lleva UUID; la transacción en el mismo documento del usuario actualiza mapas anidados y guarda testerSyncReceipts por instalación. Un reintento del mismo lote no vuelve a incrementar segundos, incluso si el proceso murió después del commit remoto y antes de limpiar el pendiente. Solo un lote simultáneo. Se reintentan días anteriores y datos de la cuenta cuando vuelve a estar autenticada. No subir tiempo de una cuenta con credenciales de otra. No hay segunda colección ni duplicación en gamificacion/tester_activity.

Sin red, los pendientes permanecen locales hasta otro checkpoint/apertura/cierre con conexión. Un cierre forzado puede perder hasta unos 30 s del último intervalo aún no checkpointado; Android no garantiza callback final. La apertura ya está en el buffer durable. Requiere APK nueva para mejorar registros futuros; no hace aparecer historia inexistente.

## Tres estados

- Sin evidencia → No entró.
- Evidencia y total conocido <180 s → Menos de 3 min.
- Total >=180 s → 3 min o más.

Cada fecha solo aparece una vez. Por ejemplo 60+120 s = un día de 3 min o más. Los días futuros se excluyen de totales y detalle; no se inventan ausencias futuras. El último acceso mostrado es global al usuario; las estadísticas usan exclusivamente el rango.

## Selector Admin

Pestaña existente renombrada Ingresos diarios. Presets y Personalizado → Desde/Hasta conservan DatePicker nativo. Rango inclusivo, validación de fechas/orden, año visible; sin fechas fijas. Configuración anterior de período guardado sigue disponible. Fecha actual se refresca si Admin permanece abierto durante medianoche.

Mismo agregador puro para resumen y detalle: días que entró / observados, >=3 min, <3 min y sin ingreso. Listado paginado en lotes de 100 hasta recorrer los usuarios; ya no corta silenciosamente a 200. Lecturas Admin desde servidor para no tratar una caché obsoleta como ausencia. Fallos visibles y botón Recargar. Tokens de consulta ignoran respuestas de rangos anteriores; detalles cerrados no reaparecen por callbacks tardíos. Sin dashboard ni gráficos nuevos.

## Validación y APK

DailyActivityMathTest: 11 pruebas, cero fallos. Cubre los siete casos del pedido, apertura cero segundos, 179/180 s, literal/anidado, app/web sin doble conteo, medianoche Lima y fechas futuras/inválidas. compilar_app.bat / assembleDebug correcto. Logs build/admin-daily-tests.log y build/admin-daily-apk-final.log. Diff check correcto.

No app/emulador/dispositivo ejecutado (AGENTS.md). Estas pruebas no verifican commits reales de Firestore ni eventos Android. Probar físicamente: abrir <1 min; 4 min; 1+2 min separado por background; repetir aperturas; varios días sin reautenticar; background no cuenta; medianoche; cambiar rango; perder/recuperar red; misma cuenta en dos dispositivos y cambio de cuenta. Admin → Recargar para ver sincronización.


## Actualización 04/10/2026 — duración y compatibilidad Web
Admin muestra tiempo aproximado medido por día y en el período (`37 min`, `1 h 25 min`), con desglose App/Web. La clasificación ahora distingue visitas menores de 5 minutos y de 5 minutos o más. No es el umbral de racha: este es 15 minutos o una lección completada.
Se reutilizan `testerDailySeconds`, `testerDailyApp`, `testerDailyWeb`, incluyendo campos legacy con puntos literales, sin migrar ni borrar los originales. React escribía segundos Web en `usuarios/{uid}`: esos valores se conservan y se leen en KMP. Son aproximaciones históricas, no una duración exacta certificada. Si solo existe fecha/actividad, mostrar duración desconocida y excluirla de la clasificación de minutos; falta de registro no demuestra ausencia.
Las métricas agregadas de Firebase Analytics Web no permiten reconstruir minutos individuales: no se convierten en sesiones ficticias. El tracker KMP existente conserva sesiones en primer plano, cortes de fecha/cuenta, checkpoint persistente y reintentos idempotentes. La integración histórica utiliza Firestore, no una importación de los informes agregados de Analytics.

## 05/10/2026 — Errores y sugerencias privados

Home añade un contenedor compacto justo antes de MainPageEnd. Abre un formulario de Error/Sugerencia con texto de 5–2000 caracteres; requiere sesión Firebase (también admite una sesión anónima existente). No es un foro ni una publicación. La confirmación se muestra únicamente tras aceptación del envío por Firebase; los fallos conservan el texto. El botón bloquea envíos simultáneos.

La pestaña nueva Errores y sugerencias de Admin consulta únicamente documentos targetType=app_feedback en la colección privada existente reportes. Se muestra tipo, nombre, texto, fecha del servidor y estado atendido. Paginación de 20 mensajes, Recargar, Anterior/Siguiente y errores visibles. Solo carga cuando la pestaña está abierta; no añade listeners en Home ni consulta permanente de la bandeja.

IDs con prefijo app_feedback, instante de creación local y UUID permiten orden descendente y cursor por documento sin índices nuevos. El orden entre dispositivos depende de sus relojes; la fecha visible procede de createdAt del servidor. Resolver actualiza resolved=true sin borrar el mensaje. No hay respuestas públicas ni notificaciones masivas.

Las reglas existentes de reportes validan reporterUid contra la sesión al crear y restringen lectura/actualización a author() (identidades verificadas autorizadas). El 05/10/2026 se leyó la versión publicada y se comprobó que conserva estas restricciones; la consulta real de bandeja fue aceptada sin crear documentos. No hubo despliegue.
