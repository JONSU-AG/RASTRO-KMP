# 07/10/2026

01/11/2026, seguimiento autorizado: robots.txt corregido en Hosting conservando contenido publicado; dominio Play comprobado, AdSense abierta y sección Verificación sin solicitud actual de documentos/SMS. No se enviaron consultas ni se cambiaron datos personales.

01/11/2026: revisión actual de cuenta y app-ads.txt; intersticiales automáticos bloqueados en controlador y SDK mediante AdServingMode. Rewarded existente conservado. Evidencia y límites en REVISION_CUENTA_Y_ANUNCIOS_2026-11-01.md. Sin cambios en cuenta ni publicación.

## Complemento Billing

Biblioteca oficial 9.1.0 y permiso de facturación en Android. Configuración de cuatro planes con IDs null, adaptador único accesible desde MonetizationRepository para consultas reales futuras y checkout deshabilitado. ProAccess/Firestore conservados. Código 201 comprobado en Play Console; nueva AAB local 2.0.2 (202), no subida. 132 pruebas Android sin fallos, lintVitalRelease y bundleRelease correctos. bundletool valida el archivo y su manifest incluye BILLING/9.1.0/202; jarsigner verifica su firma. Sin ejecutar la app ni desplegar Firebase. Ver PLAY_BILLING.md para límites y pasos pendientes.

AAB: `androidApp/build/outputs/bundle/release/androidApp-release.aab`.
SHA-256: `7FFA35FC3562E8CA2965FB170570EE3E1B15B530C5C8B1A39CF606D377968881`.

AdMob: creadas dos unidades reales en la cuenta, bloqueadas Citas/Referencias al sexo/Salud sexual y reproductiva y restringido contenido a G. SDK 24.9 + UMP 4 integrados, anuncios de prueba en debug y reales en release, consentimiento/privacidad, precarga con caducidad y protección contra callback duplicado. Automáticos bloqueados si Pro no se verifica en servidor. Consentimiento europeo guardado en borrador; el editor falló al reabrir. Cuenta pendiente de verificación y vinculación a tienda. No publicación legal, Firebase, APK/AAB ni nueva versión. Detalle: ADMOB_CONFIGURACION.md.

Preparados Pro, vidas/economía, ofertas de anuncios voluntarios, política de cierres, introducción/agradecimiento y Admin. Primer Simulacro gratis, tres Pro y recuperación local de intentos. Avisos vigentes por cuenta, bienvenida separada, foto actual de autor y protección transaccional del historial de rachas. Ajuste mínimo al desplegable de filtros de Flashcards. Sin alterar contenido académico, Loki, pagos reales o versión publicada.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

## Continuación — compra y restauración

Se completaron conexión/cola, compra oficial, cancelación, PENDING, restauración, cuenta ofuscada y llamada a verificador. Servidor preparado con Developer API, token privado ligado al UID, transacción y acknowledgement. Sin despliegue: Firebase Spark comprobado en consola; no se seleccionó facturación. Productos desbloqueados por lanzamiento interno 202, pero no creados por categoría fiscal/ID inmutable pendientes del usuario. 134 pruebas Android y 7 Node sin fallos (4 Billing, 3 cleanup); lintVitalRelease y bundleRelease correctos, bundletool/jarsigner verifican AAB 2.0.2 (203). No ejecución de la app. Compras deshabilitadas; RTDN/reconciliación y prueba real pendientes. SHA-256 AAB 203: F953B8A9C48C1A5B4893D6F5202B186E3DA6225B822076F3522D175CB67F4623.

Lanzamiento comprobado en Play: 2.0.2 (203), exclusivamente prueba interna, 07/10/2026 15:31. Segmento sin verificadores, sin distribución a usuarios. 202 interno anterior desbloqueó productos. Cerrada no modificada; sin promociones ni producción. Evidencia build/play-internal-203.jpg.

## 08/10/2026 — operación local y consumo reducido

Ver ../sincronizacion/README.md para el ámbito y límites. Progreso personal local, respaldo explícito/semanal, actividad agrupada, playlists por consulta y foto compartida por autor. UI de vidas/packs/Pro conserva componentes Sticker3d. Sin publicación ni ejecución de app.

## Release interno 204 — 08/10/2026

Código incrementado de 203 a 204 tras verificar el máximo real en Play; nombre 2.0.2 conservado. 325 pruebas sin fallos, lintVitalRelease, bundleRelease, bundletool y firma correctos. Play aceptó y lanzó exclusivamente en interna, disponible para verificadores internos, 8 oct 2:00 p.m.; solo recomendación de símbolos nativos. Compras desactivadas y bloqueos reales documentados en ESTADO_PRODUCCION_204.md. Sin ejecución de APK, promoción a producción, nueva clave, facturación ni aceptación de condiciones legales pendientes.

## 08/10/2026 — Anuncios de prueba en vista usuario Admin

Reutiliza AdminConfig.userViewMode y AdsPlacementController: solo una cuenta Admin en vista usuario recibe unidades demo oficiales de Google, incluso en release. Al cambiar modo/cuenta invalida anuncios cargados y callbacks antiguos. Terminar una actividad permite intersticial de prueba desde el primer día, sin filtros de plan/frecuencia; jamás durante preguntas ni en superficie Admin. Los rewarded siguen siendo voluntarios. No se modifica Pro, política publicitaria normal, UMP, campañas remotas ni cuentas de pago. Sin disponibilidad/consentimiento de SDK no se fuerza un anuncio inexistente. Fuente: https://developers.google.com/admob/android/test-ads

149 pruebas Android, lint y assemble correctos; interacción real de anuncios pendiente, no APK ejecutada.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

Conseguir monedas: promoción Pro visible también con compras deshabilitadas o Pro activo, antes de las misiones. Packs compactos con icono vectorial de video, recompensa, barra y progreso real; botones reducidos. Modal Pro con corona propia, beneficios con distintivos opacos y estado/vencimiento existentes.

Validación: 153 pruebas Android sin fallos/errores/omitidas y lintVitalRelease correcto (build/sections-final-validation.log). Compilación/paquete debug verificados por separado. No se ejecutó app, dispositivo o emulador, ni se publicó una versión. Pendiente revisión física de tamaños, orientación, fuente ampliada y temas.


## 08/10/2026 — Refinamiento solicitado

Modal con X fija; área desplazable recortada para no cubrir el título. Texto e iconos de acciones deshabilitadas usan contraste del tema. Sin cambios de precios, anuncios, recompensas ni cobros.


## 08/10/2026 — Cierre al iniciar examen y anuncios

Se retira introducción previa a intersticial. Agradecimiento y Pro permanecen juntos únicamente tras anuncio mostrado y cerrado. Se conservan consentimiento, elegibilidad, frecuencia y rewarded. Ver `docs/simulador/CIERRE_Y_ANUNCIOS_2026-10-08.md` para evidencia y límites.


## 08/10/2026 — Iconos, revisión y regalos

Aviso tras anuncio una vez por cuenta/día de Lima, transacción entry_notices más caché local. Fin de resultados Simulador conectado; Admin modo usuario conserva demo sin espera. Regalos y códigos gratuitos en saldo existente; códigos editables, un destinatario global o un recibo por usuario. Lectura explícita, paginada, sin funciones de pago. Reglas Pro/regalos publicadas y verificadas; Spark y pagos deshabilitados conservados.

## 08/10/2026 — API RevenueCat habilitada
API Android Publisher habilitada con autorización; credenciales validadas en RevenueCat. Producto permanente preparado sin guardar: confirmación fiscal pendiente. Sin Blaze, compras habilitadas, SDK nuevo ni publicación. Detalle y evidencia en REVENUECAT_ESTADO_CONFIGURACION.md.

## 08/10/2026 — Productos y precios .99
Confirmación fiscal recibida. Borradores reales rastro_pro (mensual, seis-meses, anual) y rastro_pro_permanente (permanente) guardados en Play: S/4.99, S/19.99, S/29.99 y S/49.99 para Perú. Checkout sigue deshabilitado hasta completar RevenueCat y validar compras. Sin publicación ni ejecución de APK.

## 08/10/2026 — Candidata 205: integración de compras

Ámbito: adapter/configuración Billing, ProAccess existente, consulta al iniciar/reanudar sesión, elegibilidad publicitaria dependiente de Pro y modal existente, documentación de monetización/versionado. Productos reales activos y entitlement vinculados; SDK RevenueCat integrado sin Functions de pago. Pro manual y cuentas preservados, precios Google Play, restauración explícita. 354 pruebas cero errores, lintVitalRelease, bundleRelease, assembleDebug, firma y bundletool correctos. Versión 2.0.3/205 preparada localmente; no subida, app no ejecutada. Prueba de compra/restauración/renovación/reembolso en Play pendiente. RTDN conectado en RevenueCat; comprobación final de entrega pendiente al registrar este apartado.

Cierre RTDN: permiso Publicador limitado al tema autorizado por el propietario para la cuenta oficial Google Play; guardado sin cambiar facturación. RevenueCat recibió el mensaje de prueba 09/10/2026 02:10 UTC. Evidencia build/payments-rtdn-connected.png. Este test verifica mensajería, no sustituye pruebas reales de compra, restauración o reembolso en teléfono.

## 09/10/2026
Recibo animado de monedas y botón Probar compras para Admin, preservando regalos. Debug y preview Admin siguen usando AdMob demo; release normal usa IDs reales.

Play Console: habilitada la lista exclusiva RASTRO compras de prueba (1 cuenta), conservando listas de distribución existentes y RESPOND_NORMALLY. No se efectuaron compras, publicación, ni cambios de cuenta bancaria/fiscal.

## 09/10/2026 — Planes unificados y rechazo de instalación local
Ámbito: MonetizationDialogs y mensaje de diagnóstico PlayBillingRepository. Cada plan usa un único Sticker3dButton con nombre/duración y precio localizado debajo. Se elimina la tarjeta duplicada; sin precio real, el botón queda deshabilitado, sin importar referencias estáticas.
Lectura del teléfono conectado, sin abrir/instalar aplicación: com.jonsuapps.rastro 205 / 2.0.3, installerPackageName=null, instalación com.android.shell y BILLING concedido. Registro de compra existente: respuesta 5 DEVELOPER_ERROR, Please ensure the specific App version has been published. No confundir con rechazo bancario; tester habilitado no prueba que Play haya reconocido la cuenta efectiva/versión de esa instalación. Se requiere validar distribución/compra con Google Play. No se publica nada durante este diagnóstico.

Comprobación final: assembleDebug correcto. Play interno sigue en 204 / 2.0.2; dispositivo tiene 205 / 2.0.3 local. Próximo paso de distribución: generar AAB actual firmada y distribuir por canal interno; requiere autorización de subida. La excepción oficial de testers admite debug, por lo que no afirmar que todo debug necesariamente falla; el rechazo específico registrado exige reconocer/publicar esta instalación. No se verificó compra ni se lanzó app desde el agente.

## 09/10/2026 — Publicación exclusivamente interna
Por autorización explícita del propietario, regenerada, validada y subida AAB 205 / 2.0.3. Play confirma disponible para verificadores internos. 359 pruebas sin fallos, firma y BILLING verificados. Una recomendación no bloqueante de símbolos nativos; ReTrace incluido. Producción y cerrada sin cambios. Registro y SHA256 en VERSIONES DE LA APP SUBIDAS A PLAY CONSOLE.md. Compra física aún pendiente.

## 09/10/2026 — Preparación web AdMob
Ámbito anunciado: documentación, app-ads.txt y script de incorporación al build web existente. Línea copiada de consola oficial; sin editar copia rastro react ni desplegar su dist antiguo. Propuesta legal actualizada con compras/reembolsos RevenueCat. Pendientes separados entre pasos previos y dependientes de ficha pública en ADMOB_LISTO_Y_PENDIENTES.md. No cambios de APK, facturación, consentimiento publicado o producción.

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

Pendientes externos: revisión de cuenta/app, rastreo app-ads.txt sin solicitudes, editor europeo cargando (mensaje sin publicar). No se activó monetización automática ni se cambió código Android.

12/10/2026: propietario autorizó terminar/publicar consentimiento europeo existente. Ámbito: AdMob y documentación, sin código/app nueva. Se abrió editor en pestaña del propietario, se esperó y se recargó/reabrió una vez. En ambos intentos diálogo permaneció cargando sin vista previa/configuración; no fue posible revisar ni publicar. Mensaje aún Borrador, sin duplicación. Evidencia build/admob-editor-consentimiento-2026-10-12.png. UMP canRequestAds y loadAndShowConsentFormIfRequired existentes comprobados en código; no ejecución de Android.

12/10 continuación: editor finalmente visible, selección de apps cargó después de espera. Se seleccionó RASTRO com.jonsuapps.rastro y verificó privacidad https://rumbo-jonsu.web.app/privacidad. Editor muestra nombre RASTRO - Consentimiento europeo, español predeterminado, rechazo activado. Sigue cargando datos/vista previa %%APP_NAME%%; Guardar borrador y Publicar desactivados. Cambios SOLO en editor, no guardado/publicación confirmados. Pantalla conservada para continuar; no recargar sin valorar cambios. Evidencia build/admob-consentimiento-rastro-seleccionada-2026-10-12.png.

12/10 preparación sin publicar, por petición del propietario: configuración global observada incluye 198 socios frecuentes, cobertura mensajes activada, identificación especial/sincronización extra desactivadas. Sin cambios globales necesarios. Borrador actual RASTRO seleccionado, español/rechazo activados y segmentación EEE/Reino Unido/Suiza. Se intentó renombrar RASTRO - Consentimiento europeo 2026 y Guardar borrador; editor cerró pero tabla mantiene sin título. Persistencia del nuevo nombre NO confirmada. Reapertura quedó cargando. No se publicó ni se eliminaron otros borradores. Evidencia build/admob-borrador-revision-2026-10-12.png. El propietario realizará publicación final.

18/10/2026: auditoría de solo lectura completada. Cuenta rechazada con aviso genérico; consola apps/políticas bloqueada. app-ads.txt/HTTP/HTTPS/dominio/manifest/IDs revisados; robots.txt sirve HTML SPA y SDK descarta errores (hallazgos menores, NO causas de rechazo demostradas). Existencia de QR no publicado no acredita infracción. Pendiente correo exacto/revisión manual de datos si Google los señala. Informe AUDITORIA_ADMOB_2026-10-18.md. Sin código ni publicaciones.

## ACTUALIZACIÓN POSTERIOR — 18/10/2026, acceso recuperado

Esta observación sustituye el bloqueo descrito arriba: el propietario dejó AdMob en /v2/home?sac=true y el panel ahora permite navegar. NO se reenvió ninguna solicitud en esta comprobación.
- AdSense aguilar.jonsu@gmail.com tiene el MISMO pub-4563495447517759. Account information: Account status Open; Active products AdMob. No se mostró un rechazo/suspensión de AdSense. Open NO equivale a aprobación publicitaria AdMob ni a sitio AdSense aprobado.
- AdMob Home: perfil de pagos completo; cuenta en verificación/no aprobada todavía.
- Policy center > Issues: No current issues. Disapproved apps: No disapproved apps.
- RASTRO: Getting ready, Review in progress, Limited ad serving; Google Play com.jonsuapps.rastro, 2 unidades activas. QR: Requires review, sin tienda, 0 unidades; no aparece como app rechazada.
- Notificaciones AdMob observadas son avisos generales de eCPM, Ucrania y privacidad; no señalan duplicación de cuenta.
- No se pueden descartar otras cuentas con otros correos a partir de esta sesión. El propietario debe indicar si abrió AdSense/AdMob con otro correo; NO enviar contraseña ni códigos.
- Evidencia local: build/adsense-cuenta-abierta-2026-10-18.png y build/admob-rastro-en-revision-2026-10-18.png. Sin cambios en cuenta, datos, permisos o versiones.

01/11/2026: países producción guardados y verificados (20 LATAM). Doble revisión estática de anuncios/consentimiento y lectura de filtros AdMob. Sin cambios en código ni publicación de APK/AAB; evidencia e informe actualizados.

01/11/2026: exposición temporal configurada. Aclaración vigente: reserva finita 750 monedas/75 vidas, no acceso ilimitado. Pro oculto y anuncios pausados; costes y monedero existentes conservados. No cambios remotos. Detalle en ../exposicion/README.md.
