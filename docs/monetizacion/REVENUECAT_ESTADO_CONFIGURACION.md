# RevenueCat — revisión 08/10/2026

Proyecto existente: RASTRO Preuniversitario, 173d075d. Sesión iniciada; revisión directa del panel. Sin paywalls configurados. Apps muestra una configuración Test Store; no una app Google Play real. No se copiaron claves, crearon productos ni guardaron configuraciones.

Paso pendiente dejado abierto: https://app.revenuecat.com/projects/173d075d/new-app/play_store

- App name: RASTRO Preuniversitario (Play Store).
- Google Play package name: com.jonsuapps.rastro.
- Service Account Credentials JSON: falta la credencial de una cuenta de servicio con los permisos necesarios de Google Play para verificar compras. No es google-services.json de Firebase ni la contraseña de Google.

El propietario pidió detenerse cuando faltara un dato. No se crearon credenciales ni ampliaron permisos. La clave secreta JSON debe subirse directamente a RevenueCat, no compartirse por chat ni guardarse en GitHub. La guía enlazada por el formulario es https://www.revenuecat.com/docs/service-credentials/creating-play-service-credentials.

Después de conectar la tienda: configurar/importar productos reales, entitlement y oferta, obtener clave pública Android e integrar el SDK en el adaptador existente. Compras continúan desactivadas; Pro manual se conserva. No publicar ni marcar tareas completadas sin verificación real.

## Conexión guardada — 08/10/2026

Tras confirmación explícita del propietario se creó revenuecat-rastro@rumbo-jonsu.iam.gserviceaccount.com, con Pub/Sub Editor y Monitoring Viewer. Se generó una única clave JSON y se guardó fuera del repositorio en C:\Users\Usuario\Documents\json de revenue cat\revenuecat-rastro.json. No copiar su contenido al código, documentación ni Git.

Play Console muestra la cuenta activa con permisos de la aplicación RASTRO: lectura, datos financieros, pedidos/suscripciones y presencia en Store. No se otorgaron permisos de administrador ni de lanzamiento de versiones. La configuración Google Play se guardó en RevenueCat como app35655571f1, paquete com.jonsuapps.rastro; el panel confirma File saved.

Validación pendiente: RevenueCat informa que Google Play Android Developer API está deshabilitada. Se dejó sin habilitar porque tanto esta API como Developer Reporting indican aceptación de condiciones Google APIs y Android Developer API. Se requiere confirmación legal en ese paso. Pub/Sub/notificaciones todavía no conectadas. No se activó facturación ni Blaze, no se crearon productos ni se integró el SDK ni se publicaron versiones.
## API validada y límite económico — 08/10/2026

El propietario autorizó aceptar las condiciones de Google APIs y Android Developer API únicamente sin activar cargos. Se habilitó androidpublisher.googleapis.com en rumbo-jonsu. La consola muestra Estado: Habilitada y RevenueCat muestra Valid credentials. No se eligió cuenta de facturación, no se activó Blaze ni se aceptó un plan de pago de RevenueCat.

Play Console: Productos únicos no contiene productos. Se prepararon, sin guardar, ID rastro_pro_permanente, nombre RASTRO Pro Permanente y descripción de beneficios. El ID es una propuesta en el formulario, NO un producto existente: no llevarlo a configuración productiva hasta que Play confirme su creación. La categoría fiscal predeterminada es Ventas de apps digitales; se dejó el diálogo abierto para confirmación expresa del propietario. Pregunta enviada; no asumir respuesta ni continuar la creación hasta recibirla.

RevenueCat confirma credenciales válidas, pero faltan productos reales, entitlement/oferta, SDK conectado y pruebas reales. Checkout sigue false; la verificación actual mediante callable Firebase no está desplegada en Spark. La siguiente integración debe reutilizar PlayBillingRepository y ProAccess, conservar Pro manual y usar verificación de RevenueCat sin exigir Blaze. No conceder acceso basándose solo en un callback de pago, ni restaurar compras automáticamente al cambiar cuenta. No incorporar secretos JSON al repositorio.

Costo: RevenueCat ofrece su nivel gratuito hasta US$2.500 de ingresos mensuales registrados (MTR), y cobra 1% al superar el límite; no es una garantía de gratuidad ilimitada. Referencia oficial: https://www.revenuecat.com/pricing/ . No aceptar upgrades o cuentas de facturación sin intervención del propietario.

Versión real comprobada en Play: interna 204 / 2.0.2; cerrada Alpha 201 / 2.0.1. Una futura subida requiere versionCode mayor a 204. No se generó ni subió otra AAB durante este paso.

Evidencia local: build/payments-api-enabled.png; build/payments-tax-category.png. No se cambió código de pagos ni se ejecutó la APK; no corresponde afirmar que las compras estén listas.

## Productos reales y precios .99 — 08/10/2026

El propietario confirmó la categoría mostrada por Play, Ventas de apps digitales, y pidió terminación .99. Se crearon y guardaron como borradores:

| Producto Play | Plan básico / opción | Duración | Precio Perú |
| --- | --- | --- | --- |
| rastro_pro | mensual | Mensual, renovación automática | S/4.99 |
| rastro_pro | seis-meses | Cada 6 meses, renovación automática | S/19.99 |
| rastro_pro | anual | Anual, renovación automática | S/29.99 |
| rastro_pro_permanente | permanente | Compra única | S/49.99 |

Se verificó el precio Perú de cada plan y la persistencia de S/49.99 del permanente después de recargar. Otros países utilizan conversión y ajustes de Play. La app debe obtener precios reales desde la tienda, sin cobrar a partir de esta tabla. No se activaron estos borradores ni se publicó otra versión. Todavía faltan la importación y entitlement en RevenueCat, integración del SDK y pruebas de compras/restauración; checkout permanece deshabilitado. Esta actualización sustituye el estado anterior de confirmación fiscal pendiente y producto solo propuesto.

Evidencia: build/payments-permanent-4999.png.

## Estado actual — 08/10/2026, candidata 205

Este apartado sustituye los pendientes de productos/SDK de las etapas anteriores, conservadas como historial.

- Play comprobado directamente: última interna subida 204 / 2.0.2. Candidata local 205 / 2.0.3, NO subida.
- Tres planes activos del producto rastro_pro: mensual, seis-meses y anual. Perú: S/4.99, S/19.99 y S/29.99. Producto único rastro_pro_permanente, opción permanente, activo a S/49.99. Suscripciones autorrenovables; permanente no consumible.
- Cuatro productos reales importados y vinculados al entitlement existente rastro_preuniversitario_pro, proyecto 173d075d, app app35655571f1. Productos Test Store previos conservados.
- SDK Android RevenueCat 10.26.0 integrado en PlayBillingRepository existente; Billing 8.3.0 transitivo. Checkout habilitado con IDs reales y precios localizados consultados a Google Play. Ningún cobro simulado.
- Verificación de firmas de entitlements, tienda/base plan y Firebase UID antes de conceder Pro. Pro manual conservado; revocar compras no borra regalos. Restauración explícita, política RevenueCat Keep with original App User ID.
- SDK utiliza clave Android pública; JSON secreto permanece fuera del repositorio. No Functions de pago desplegadas, Spark conservado, sin elección de cuenta bancaria/facturación.
- Pub/Sub Admin autorizado y guardado únicamente para la cuenta RevenueCat; conexión RevenueCat confirmada Connected to Google. Canal projects/rumbo-jonsu/topics/Play-Store-Notifications; suscripción RevenueCat-Subscriber-app35655571f1 creada. Play configurado para suscripciones, compras anuladas y todos los productos únicos. Permiso Publicador de Pub/Sub autorizado y guardado para google-play-developer-notifications@system.gserviceaccount.com únicamente en ese tema. Prueba RTDN recibida por RevenueCat: 2026-10-09 02:10 UTC (08/10/2026 21:10 Lima). Evidencia build/payments-rtdn-connected.png.
- 354 pruebas Android/shared, cero fallos/errores. lintVitalRelease, bundleRelease y compilar_app.bat/assembleDebug correctos. bundletool validate y firma correctos; manifest dentro de AAB: BILLING, 205, 2.0.3.
- AAB: androidApp/build/outputs/bundle/release/androidApp-release.aab, 81 927 559 bytes. SHA256 C3951529622E57A7AFE4E8D93E44C0052EF8CBC0AD6011F25285C2EDAF9DCDE0.
- Compra, restauración, renovación y reembolso de prueba en teléfono desde Google Play NO comprobados: no se ejecutó ni instaló la app. No considerar producción validada sin esas pruebas.

RevenueCat conserva su límite gratuito MTR descrito arriba; no se contrató un plan de pago ni se promete gratuidad ilimitada.

