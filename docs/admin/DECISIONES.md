# Decisiones

Reparar TesterActivityRepository y la vista existente de Admin, sin segundo sistema de Analytics. Usar los mismos campos; leer campos con puntos sin borrar ni renombrar originales. No modificar RastroApplication, gamificación ni reglas de Firestore. Maps nested + increment y transacción con último recibo por instalación resuelven escritura y duplicación por reintento en el mismo documento. Mantener configuración Analytics de identidad ya existente.

Separar únicamente cálculo puro en DailyActivityMath para probar las categorías/fechas y compartirlo entre listado y detalle. Zona del sistema consistente con RASTRO; duración monotónica. Lecturas Admin desde servidor con paginación y error explícito. Sin reconstruir actividad histórica inexistente ni contabilizar días futuros.


## 04/10/2026 — duración fiable y límites históricos
La duración procede de segundos registrados en Firestore. Analytics agregado, XP, estrellas y simple apertura no se traducen a minutos. Los datos antiguos con duración insuficiente conservan su categoría de actividad registrada. Clasificación 5 minutos separada de racha 15 minutos. Se mantiene un solo tracker Admin, sin segundo sistema de métricas.

## 05/10/2026 — contacto privado desde Inicio

Reutilizar reportes y sus reglas privadas en vez de crear un foro, colección o segundo panel. Separar app_feedback de los reportes académicos/UGC. Una pestaña propia en Admin distingue errores y sugerencias; carga explícita paginada cuando se abre. No publicar los mensajes en perfiles, comunidad o notificaciones públicas.
