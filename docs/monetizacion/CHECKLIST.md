# Validación

## 01/11/2026 — Publicidad mínima

- [x] robots.txt publicado y verificado HTTP 200/text/plain; sitio vigente conservado.
- [x] Dominio de soporte de Play coincide con app-ads.txt.
- [x] AdSense abierta; sección Verificación sin requerimiento actual de documentos/SMS.

- [x] Intersticiales bloqueados localmente en precarga, presentación y naturalEnd; incluye Admin preview.
- [x] Rewarded voluntario y consentimiento conservados.
- [x] Cuenta en verificación, perfil de pagos completo; Centro de políticas sin problemas ni apps rechazadas, comprobados en sesión.
- [x] app-ads.txt público responde con el publisher correcto.
- [x] assembleDebug completó sus tareas y compilación Kotlin; sin ejecutar la app.
- [ ] Prueba física y distribución: no realizadas. Ver REVISION_CUENTA_Y_ANUNCIOS_2026-11-01.md.

## Ajuste Admin / sesión — 08/10/2026

- [x] Pro manual busca en el directorio completo por correo/nombre/UID y permite seleccionar el propio Admin, sin aceptación del beneficiario.
- [x] Cambio de cuenta descarta callbacks Pro antiguos; grant exige sesión Admin y rechaza identificadores inválidos.
- [x] 146 pruebas Android sin fallos y lintVitalRelease correctos.
- [ ] Concesión real contra reglas publicadas: no se probó ni desplegó durante esta corrección.

Ver ../admin/SESION_Y_DIRECTORIO.md. Sin activar compras ni generar otra AAB.

- [x] Pro temporal/permanente, revocación, ventana exacta y cambio de cuenta implementados.
- [x] Monedas y XP x2; vidas sin consumo en Pro; estrellas/puntajes intactos.
- [x] Primer intento y tres adicionales Pro, precio e identificador único probados.
- [x] Packs sin pago parcial, recibo único y reclamo idempotente probados.
- [x] Política sin anuncios en preguntas, primer día, Pro/Admin ni inmediatamente tras Rewarded probada.
- [x] Reglas probadas en emulador: autor verificado, no autootorgamiento, privacidad y configuración protegida.
- [ ] Despliegue Firebase: no realizado.
- [x] Unidades reales AdMob, bloqueos sensibles y clasificación G guardados en la cuenta.
- [x] SDK AdMob/UMP conectado; debug con anuncios de prueba; carga, cierre y recompensa oficial implementados.
- [x] 129 pruebas Android sin fallos; lintVitalRelease correcto; IDs debug/release comprobados en manifest y BuildConfig generados.
- [ ] Mensaje UMP publicado y configuración de proveedores revisada: borrador guardado.
- [x] Biblioteca oficial Billing 9.1.0, permiso y adaptador Android incorporados; configuración sin IDs inventados. Ver PLAY_BILLING.md.
- [ ] Productos reales, precios en UI y compras verificadas por backend: pendientes; checkout no habilitado.
- [ ] Backend económico autoritativo/SSV/recibos y concurrencia de dos dispositivos antes de monetización real.
- [ ] Validación física móvil/tablet/rotación: no se ejecutó la APK.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

### Validación posterior — Billing

- [x] Compilación debug/release, 132 pruebas Android sin errores y lintVitalRelease correctos.
- [x] AAB release 2.0.2 (202) generada y validada con bundletool 1.18.3.
- [x] Manifest extraído de la AAB: permiso com.android.vending.BILLING y metadata Billing 9.1.0.
- [x] Firma del bundle verificada con jarsigner (certificado Android autofirmado).
- [x] Código 201 confirmado en Play Console antes de preparar 202.
- [ ] Subida/publicación: expresamente no realizada.

### Continuación de Pro — validación final

- [x] AAB 2.0.2 (203) compilada, firmada y validada; BILLING y 9.1.0 confirmados en su manifest.
- [x] 134 pruebas Android sin fallos; 4 pruebas de verificador y 3 de limpieza Node sin fallos; lintVitalRelease correcto.
- [x] Código de compra/consulta/restauración, pago pendiente y errores incorporado al mismo adaptador. No equivale a compra real validada.
- [x] Verificación/acknowledgement server preparada, con catálogo vacío y autenticación/App Check, sin desplegar ni conceder Pro localmente.
- [x] Firebase Spark comprobado; no se alteró facturación. Formulario fiscal de producto sin confirmar.
- [ ] Compra/restauración real, App Check/Publisher/Blaze, despliegue y RTDN/reconciliación completos: pendientes.

- [x] 203 (2.0.2) lanzada exclusivamente a prueba interna; no se añadieron verificadores ni se promovió ningún track.

## 08/10/2026 — local y consumo

Estado y validación específica en ../sincronizacion/CHECKLIST.md. Prueba física y ahorro real pendientes; no confundir compilación con validación entre dispositivos.

## Candidata 204 — 08/10/2026

- [x] 325 pruebas sin fallos (140 Android, 185 shared), lintVitalRelease y bundleRelease correctos.
- [x] AAB firmada 2.0.2/204: bundletool y jarsigner terminan correctamente; manifest final con BILLING y target 36.
- [x] Máximo anterior 203 comprobado directamente en Play antes de preparar 204.
- [x] Play aceptó el bundle 204; cero errores bloqueantes y una recomendación de símbolos nativos.
- [x] 204 lanzada exclusivamente en prueba interna; Play muestra «Disponible para verificadores internos».
- [ ] Producción con monetización real: ver ESTADO_PRODUCCION_204.md; faltan aprobación legal de API, productos, integración RevenueCat y pruebas reales.

- [x] Admin en vista usuario usa unidades demo y prueba intersticial al terminar actividades; ninguna durante preguntas.
- [ ] Verificar visualmente anuncio/consentimiento y vuelta al modo normal en dispositivo.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

- [x] Implementación existente reutilizada; cambios limitados al ámbito visual y accesos solicitados.
- [x] Pruebas Android (153, cero fallos) y lintVitalRelease.
- [ ] Revisión visual en teléfono/tablet, modo claro/oscuro y fuentes grandes: app no ejecutada.


## 08/10/2026 — Refinamiento solicitado

- [x] Cambios implementados y compilación de Kotlin incluida en tests.
- [x] 155 tests Android; cero fallos/errores. Vectores XML válidos.
- [ ] Revisión física en temas claro/oscuro, pantallas pequeñas y gestos: no se ejecutó la app.
- [x] lintVitalRelease y compilar_app.bat (assembleDebug) correctos. App no instalada ni ejecutada.


## 08/10/2026 — Sesiones y publicidad

- [x] Causa del cierre comprobada en logs: falta serializador SavedExamSession.
- [x] Plugin existente activado y serializador explícito generado en debug/release.
- [x] 159 tests, cero fallos; cuatro pruebas nuevas de sesiones de los tres exámenes.
- [x] lintVitalRelease y assembleDebug correctos.
- [x] Introducción previa eliminada; agradecimiento/Pro solo tras anuncio mostrado y cerrado.
- [x] Revisados puntos de anuncios: preguntas/inicio de examen sin publicidad; Flashcards y rewarded conservados.
- [ ] Prueba física posterior de iniciar/responder/restaurar los tres modos y cierre de anuncio. No se ejecutó app.


## 08/10/2026 — Iconos, revisión y regalos

Aviso tras anuncio una vez por cuenta/día de Lima, transacción entry_notices más caché local. Fin de resultados Simulador conectado; Admin modo usuario conserva demo sin espera. Regalos y códigos gratuitos en saldo existente; códigos editables, un destinatario global o un recibo por usuario. Lectura explícita, paginada, sin funciones de pago. Reglas Pro/regalos publicadas y verificadas; Spark y pagos deshabilitados conservados.

- [x] Compilación, 348 pruebas Android/shared y lintVitalRelease sin errores.
- [x] Ocho pruebas de reglas Firestore sin fallos; reglas remotas coinciden.
- [ ] Recorrido físico y verificación visual en teléfono: app no ejecutada.
- [x] compilar_app.bat / assembleDebug final correcto; no se lanzó ni instaló la app.

## 08/10/2026 — Continuación de pagos reales
- [x] Android Publisher habilitada; consola y credenciales válidas RevenueCat comprobadas.
- [x] Propietario confirma Ventas de apps digitales; productos creados como borradores en Play.
- [x] Precios Perú guardados: mensual S/4.99, seis meses S/19.99, anual S/29.99 y permanente S/49.99.
- [x] Productos reales activos, entitlement existente, SDK y verificación RevenueCat integrados.
- [ ] Compra/restauración reales desde Google Play comprobadas en dispositivo. Checkout habilitado en candidata 205; prueba real pendiente.



## Candidata 205 — 08/10/2026
- [x] Play consultado: 204/2.0.2 última interna real; candidata 205/2.0.3 superior, NO subida.
- [x] 354 pruebas Android/shared sin fallos; lintVitalRelease, bundleRelease y assembleDebug correctos.
- [x] bundletool valida AAB; firma y manifest dentro del bundle con BILLING/205/2.0.3 comprobados.
- [x] Productos reales activos, precios Play, entitlement existente y Pro manual preservados.
- [x] Restauración conserva cuenta original; callbacks de otra cuenta y entitlements no verificados no conceden Pro.
- [x] RevenueCat conectado al canal Pub/Sub; permiso publicador Google Play autorizado y guardado.
- [x] Entrega RTDN de prueba confirmada en RevenueCat: 09/10/2026 02:10 UTC, 08/10/2026 21:10 Lima.
- [ ] Compra, restauración, renovación y reembolso desde Play probados físicamente. App no ejecutada.


## 09/10/2026
- [x] Admin con Pro regalado puede abrir el catálogo de compras para probar sin eliminar su regalo; compila y lintVitalRelease correcto.
- [ ] Primera compra y restauración en dispositivo usando tarjeta de prueba Google Play.

- [x] Play Console: lista RASTRO compras de prueba creada con un único correo autorizado y habilitada como verificadora de licencia; guardado confirmado. Evidencia local build/play-license-testing-ready.png.

- [x] Cada plan une título y precio en un único botón; precio tomado de Google Play y botón deshabilitado si no está disponible.
- [x] Diagnóstico de error del teléfono mediante registros existentes: respuesta 5, versión específica no publicada. Permiso BILLING presente y lista de tester habilitada.
- [ ] Compra desde versión distribuida por Google Play con tarjeta de prueba; aún no validada.

- [x] Botones unificados y mensaje de diagnóstico compilados: assembleDebug correcto (build/pro-unified-plans-final.log).
- [x] Play Console leído el 09/10/2026: canal interno activo con 204 / 2.0.2, mientras el teléfono tiene 205 / 2.0.3 local. No se creó ni subió una versión durante esta revisión.

## 09/10/2026 — Distribución interna 205 confirmada
- [x] AAB regenerada con cambios actuales: 359 pruebas sin fallos, lintVitalRelease, bundleRelease, firma y bundletool correctos; BILLING presente.
- [x] Play Console confirma 205 / 2.0.3 disponible para verificadores internos; evidencia build/play-internal-205.png.
- [x] Novedades públicas sin referencias al Admin; listas internas guardadas con cuenta de pruebas autorizada.
- [ ] Compra/restauración física usando tarjeta de prueba de Google Play. No se ejecutó la app desde el agente.

## 09/10/2026 — Preparación AdMob antes de ficha pública
- [x] Línea app-ads.txt obtenida directamente de cuenta; archivo y script de incorporación preparados.
- [x] Estado leído: cuenta en verificación, RASTRO debe revisarse/no vinculada, UMP borrador.
- [x] Propuesta legal actualizada para compras RevenueCat y publicidad: ADMOB_TEXTO_LEGAL_PARA_APROBAR.md.
- [ ] Aprobación legal del propietario, publicación web app-ads.txt y privacidad, declaración de web/datos en Play.
- [ ] Ficha localizable, vinculación, rastreo y revisión AdMob; entrega real verificada.

## Actualización comprobada — 10/10/2026

- [x] Texto legal aprobado por el propietario, integrado en Android 206 y publicado en web.
- [x] app-ads.txt público con línea oficial y Asset Links conservados.
- [x] 2.0.4 / 206 aceptada y enviada a producción. Console: «Cambios en la etapa de revisión»; verificaciones rápidas pendientes. Seguridad de datos y disponibilidad enviadas juntas. Evidencia build/play-production-206-enviada.png.
- [x] 361 pruebas sin fallos; bundle, manifest BILLING y firma verificados. No se ejecutó Android.
- [ ] Aprobación de Google y ficha pública. No confundir envío con publicación.
- [ ] AdMob: cuenta en verificación; editor del mensaje europeo falla «No se puede cargar la página». Mensaje sigue en borrador. Vincular ficha pública cuando exista y comprobar anuncios reales.
- [ ] Seis candidatos de perfiles sin UID en Auth: inventario privado, no borrados. Auditados 218 cuentas Auth y 214 perfiles. Revisión individual pendiente.
- [ ] Validación académica heredada pendiente.

Firebase continúa Spark. No se eligieron cuentas de pago ni datos bancarios/fiscales. Las listas de tareas anteriores son históricas; este apartado sustituye su estado. Detalle actual: docs/publicacion/RELEASE_2.0.4_206.md. Próximo código mínimo 207, verificar Console antes de cargar.

## 12/10/2026 — Verificación actual sin nueva subida

Play Console, Actividad de envío: envío 3 de producción del 10/10/2026 figura Publicado. No se cargó otro bundle ni se enviaron nuevos cambios.
AdMob con aguilar.jonsu@gmail.com redirige a signup?sac=true: «No se aprobó su cuenta», «Debe corregir algunos problemas para poder usar AdMob». Muestra confirmación de lectura/cumplimiento de Políticas del Programa y botón Reenviar. No se marcó ni reenvió esa declaración. La pantalla no detalla una infracción específica. El propietario debe revisar la declaración antes de autorizar el reenvío. No se pudo acceder a la configuración de la app para vincularla en esta sesión. Evidencia: build/admob-cuenta-no-aprobada-2026-10-12.png.
El estado anterior «en verificación» queda sustituido por esta observación. No afirmar vinculación completada, consentimiento publicado ni anuncios reales habilitados.

## 12/10/2026 — Cuenta reenviada y vinculación completada

Por autorización explícita del propietario, se leyeron las políticas oficiales AdMob/AdSense, se marcó la declaración existente de lectura/cumplimiento y se pulsó Reenviar. Resultado: «Estamos revisando su información»; acceso al panel recuperado. No se aceptaron nuevos contratos ni se cambiaron datos bancarios.
Se vinculó la aplicación AdMob EXISTENTE 3422086209 con Google Play com.jonsuapps.rastro, JONSUAPPS, usando la URL pública exacta. AdMob confirmó «Verificaste RASTRO Preuniversitario (Android) correctamente». Tabla: En preparación / Publicación limitada / Revisión en curso. Dos unidades existentes conservadas; sin nueva aplicación ni bundle. Google indica revisión de app normalmente 2–3 días, no garantizados. Evidencia build/admob-rastro-vinculada-2026-10-12.png.

12/10/2026: propietario autorizó terminar/publicar consentimiento europeo existente. Ámbito: AdMob y documentación, sin código/app nueva. Se abrió editor en pestaña del propietario, se esperó y se recargó/reabrió una vez. En ambos intentos diálogo permaneció cargando sin vista previa/configuración; no fue posible revisar ni publicar. Mensaje aún Borrador, sin duplicación. Evidencia build/admob-editor-consentimiento-2026-10-12.png. UMP canRequestAds y loadAndShowConsentFormIfRequired existentes comprobados en código; no ejecución de Android.

18/10/2026: auditoría de solo lectura completada. Cuenta rechazada con aviso genérico; consola apps/políticas bloqueada. app-ads.txt/HTTP/HTTPS/dominio/manifest/IDs revisados; robots.txt sirve HTML SPA y SDK descarta errores (hallazgos menores, NO causas de rechazo demostradas). Existencia de QR no publicado no acredita infracción. Pendiente correo exacto/revisión manual de datos si Google los señala. Informe AUDITORIA_ADMOB_2026-10-18.md. Sin código ni publicaciones.

01/11/2026: [x] Play confirma 20 países LATAM; [x] filtros sensibles de RASTRO revisados y preservados; [x] revisión estática UMP/IDs/manifests existentes. Sin prueba física ni nueva compilación. Detalle en REVISION_CUENTA_Y_ANUNCIOS_2026-11-01.md.

01/11/2026: preparado modo exposición finito, con pruebas de no duplicación y conservación de costes. Estado real en ../exposicion/CHECKLIST.md.

Validación 01/11/2026: assembleDebug y 195 pruebas Android correctos (build/presentation-tables-final.log); reserva finita, no duplicación al restaurar, gasto de monedas/vidas, rama normal y tablas comprobados. Física 1.1 mantiene 17 filas mediante su loader real y pasa CatalogValidator sin errores/advertencias. Motor tabular aislado a 360 px: encabezados, nueve celdas, seis expresiones y scroll horizontal correctos; cero errores JS o peticiones externas. No equivale a ejecutar Android.
