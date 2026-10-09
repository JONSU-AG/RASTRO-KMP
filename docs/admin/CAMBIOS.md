# Cambios

## 04/10/2026 — Ingresos diarios
Corregida escritura literal con puntos, aperturas breves omitidas, pérdida de pendientes antiguos, distribución de intervalos al cruzar medianoche y riesgo de repetir un flush tras reinicio. Se conserva Analytics de identidad; no se usa como evidencia.
Admin muestra asistencia diaria en tres estados, resumen sencillo y rango coherente en detalle. Se eliminan promedios/tiempos precisos de esta vista, histórico de gamificación y límite silencioso de 200 usuarios. Errores de red no se convierten en listas vacías. 11 pruebas JVM y APK debug correctas, app no ejecutada. Límites y recorrido físico en README.md.


## 04/10/2026
Se añade presentación de duración, desglose App/Web y desconocida cuando corresponde. Se pasa clasificación de 3 a 5 minutos. Se mantienen campos históricos y sincronización existente. Pruebas Android correctas; sin inspeccionar datos personales de estudiantes ni modificar documentos históricos en Firebase.

## 05/10/2026 — errores y sugerencias

AppFeedbackCard en Home antes de la animación final; AppFeedbackRepository reutiliza reportes privado. Admin añade la pestaña Errores y sugerencias y AppFeedbackAdminPanel con páginas de 20 y marcar como atendido.

119 pruebas Android y compilación correctas. Una prueba local de reglas comprueba múltiples autorizaciones (emisor/otra cuenta/sin sesión/admin no verificado/admin verificado). Consulta real y restricciones publicadas comprobadas sin escribir mensajes ni modificar Firebase. Sin ejecución de la app, APK/AAB, commit ni push. Ningún cambio a los sistemas UGC, gamificación, navegación o contenido académico.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Pro y economía: otorgar/retirar concesiones temporales o permanentes por cuenta; configuración global existente para vidas, precios, packs y frecuencia. Bienvenida separada y avisos temporales con vigencia. Reglas locales preparadas; aún sin despliegue remoto.
Detalle y estado real: docs/monetizacion/README.md.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

## 08/10/2026 — operación local y consumo reducido

Ver ../sincronizacion/README.md para el ámbito y límites. Progreso personal local, respaldo explícito/semanal, actividad agrupada, playlists por consulta y foto compartida por autor. UI de vidas/packs/Pro conserva componentes Sticker3d. Sin publicación ni ejecución de app.
# 08/10/2026 — Actualizar actividad

Verificado el flujo existente: Ingresos diarios → Actualizar → loadAllTestersActivity, consulta paginada de usuarios con Source.SERVER, filtros del rango y protección contra respuestas obsoletas. El botón muestra texto y se desactiva durante carga para evitar solicitudes simultáneas. No se cambió el tracker ni se ejecutó la APK.
# Correcciones de sesión y directorio — 08/10/2026

Registro Android leído sin ejecución: dos fallos al crear el contenedor de MainActivity. ComposeView instalado explícitamente; cambios de alias aplazados hasta segundo plano. Logout limpia pila, modo Admin y descarta callbacks de otra cuenta. Usuarios deja de cortar a 100; Pro usa búsqueda por correo/nombre/UID y permite elegir la propia cuenta. Identidad ausente reparada al ingresar; sin datos académicos por defecto ni perfiles invitados. Ver SESION_Y_DIRECTORIO.md. Sin despliegues ni nueva AAB.

Validación final: 146 pruebas Android sin fallos, lintVitalRelease y compilar_app.bat/assembleDebug correctos. Diff check correcto. No app ejecutada ni concesión real probada.

Android Studio: captura posterior muestra build correcto pero lanzamiento a MainActivityBase fallido. Consulta de componentes instalados confirma Base deshabilitada y Triste habilitada. Añadida .run/RASTRO actividad real.run.xml para abrir MainActivity directamente. XML y correspondencia del componente con manifest comprobados; no se ejecutó la configuración. Sin cambios de APK, datos ni iconos.

Configuración actual androidApp: corregida también en .idea/workspace.xml (archivo local ignorado): specific_activity y MainActivity. XML válido; sin lanzamiento. Android Studio abierto puede conservar una copia en memoria y requiere reabrir el proyecto para leer el cambio.


## 08/10/2026 — Iconos, revisión y regalos

Regalos a cuenta elegida en directorio existente; cargar/editar/desactivar códigos, un único destinatario o varios con un canje por usuario. Estudiante recibe desde Conseguir monedas > Actualizar regalos/Canjear. Reglas publicadas; canjes anteriores no se borran al editar.

## 08/10/2026 — Popup Pro, códigos y bandeja privada

Ámbito ampliado por el propietario: gestión Pro/códigos en popup existente, montos, bandeja privada, recuperación de rachas y canal oficial de Inicio. Pro/economía abre popup amplio 96%/92%, ancho máximo 820dp, cabecera fija/cierre e interior desplazable. Directorio paginado de concesiones Admin, filtro Todos/Pro manual/Sin Pro manual; compras se consultan en RevenueCat, sin poner secretos en APK ni afirmar que la ausencia de regalo significa cuenta gratuita. Inicio/fin personalizado existente conservado. Listado de códigos paginado 20, filtros y activar/desactivar/editar; monto configurable 1–1000000, recibos únicos y protección contra overflow. Marcar atendido ya existía, se conservó; borrado definitivo solo tras confirmación, sin ejecutar borrados del agente. Guía PRO_PROMOS_RACHAS_PRUEBAS.md.

Validación final después de los últimos cambios: 358 pruebas Android/shared sin fallos, lintVitalRelease y compilar_app.bat/assembleDebug correctos. Logs build/admin-promos-checked.log y build/admin-promos-assemble-checked.log. No se instaló/ejecutó app ni se generó una nueva AAB ni se publicó en Play.

## 09/10/2026
Confirmación de monedas con conteo y rebote, aplicada solo al saldo realmente entregado. Excepción diaria de racha Admin con identidad Firebase verificada; sin aumento de monedas ni XP. 359 tests y lint correctos; no se ejecutó la app.
