# Cambios

## 04/10/2026 — Ingresos diarios
Corregida escritura literal con puntos, aperturas breves omitidas, pérdida de pendientes antiguos, distribución de intervalos al cruzar medianoche y riesgo de repetir un flush tras reinicio. Se conserva Analytics de identidad; no se usa como evidencia.
Admin muestra asistencia diaria en tres estados, resumen sencillo y rango coherente en detalle. Se eliminan promedios/tiempos precisos de esta vista, histórico de gamificación y límite silencioso de 200 usuarios. Errores de red no se convierten en listas vacías. 11 pruebas JVM y APK debug correctas, app no ejecutada. Límites y recorrido físico en README.md.


## 04/10/2026
Se añade presentación de duración, desglose App/Web y desconocida cuando corresponde. Se pasa clasificación de 3 a 5 minutos. Se mantienen campos históricos y sincronización existente. Pruebas Android correctas; sin inspeccionar datos personales de estudiantes ni modificar documentos históricos en Firebase.

## 05/10/2026 — errores y sugerencias

AppFeedbackCard en Home antes de la animación final; AppFeedbackRepository reutiliza reportes privado. Admin añade la pestaña Errores y sugerencias y AppFeedbackAdminPanel con páginas de 20 y marcar como atendido.

119 pruebas Android y compilación correctas. Una prueba local de reglas comprueba múltiples autorizaciones (emisor/otra cuenta/sin sesión/admin no verificado/admin verificado). Consulta real y restricciones publicadas comprobadas sin escribir mensajes ni modificar Firebase. Sin ejecución de la app, APK/AAB, commit ni push. Ningún cambio a los sistemas UGC, gamificación, navegación o contenido académico.
