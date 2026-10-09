# Crear la cuenta gratuita de RevenueCat para RASTRO

## Situación actual

RASTRO conserva Billing y Pro manual. Las compras reales siguen desactivadas. No se creó una cuenta RevenueCat ni se conectó su SDK; esta guía deja preparada la configuración siguiente, sin claves ni productos ficticios. No activar las Firebase Functions de verificación ni Blaze para esta alternativa.

## Pasos que puede hacer el propietario

1. Abre https://app.revenuecat.com/signup y crea una cuenta con tu correo. Introduce credenciales y verificación tú mismo; no envíes contraseñas en el chat.
2. Crea un proyecto llamado RASTRO y agrega la aplicación Google Play/Android con paquete `com.jonsuapps.rastro`.
3. Conserva el plan de inicio gratuito. No contrates complementos ni selecciones métodos de pago para esta preparación. Si aparece una solicitud fiscal, dirección o cuenta bancaria, detente y revísala personalmente.
4. Copia la clave **pública Android SDK** de la aplicación. La clave secreta y el JSON del servicio de Google nunca deben ponerse en el código Android ni publicarse en GitHub.
5. La conexión con Google Play requiere configurar una cuenta de servicio y permisos específicos, subir su credencial directamente al panel de RevenueCat y completar los productos reales de Play. Estos accesos no se otorgaron en esta intervención.
6. Antes de crear productos, confirma sus IDs inmutables y categoría fiscal. Después vincularemos los cuatro planes a un único entitlement Pro y a una oferta. Los precios de la app deben venir de la tienda.

## Qué falta implementar después de configurar la cuenta

- Incorporar el SDK compatible con el Kotlin actual, reutilizando el adaptador de tienda y ProAccess; evitar dos BillingClient compitiendo por reconocer compras.
- Identificar al comprador por su UID de Firebase solo después de login real; no crear compradores anónimos para visitantes locales.
- Combinar acceso verificado de RevenueCat y concesión manual Admin en el sistema Pro existente, sin escribir un entitlement comprado desde datos que el cliente pueda inventar.
- Restauración/cambio de cuenta, pendiente/cancelación, vencimiento/reembolso y compra permanente, pruebas reales de Play.
- Actualizar privacidad/Data Safety y pedir revisión del contenido legal antes de publicarlo.

## Costes reales

RevenueCat publica gratuidad hasta US$2.500 de ingresos mensuales registrados; al superar el umbral, la tarifa actual es 1% de ingresos registrados. No es gratis para siempre. Google Play conserva sus comisiones sobre compras. RevenueCat no es una cuenta bancaria: administra verificación y suscripciones; Google Play procesa el cobro y liquida al perfil de pagos configurado por el propietario.

Fuentes consultadas 08/10/2026:
- https://www.revenuecat.com/pricing
- https://www.revenuecat.com/docs/welcome/set-up-revenuecat
- https://www.revenuecat.com/docs/getting-started/installation/android
- https://www.revenuecat.com/docs/getting-started/quickstart
- https://support.google.com/googleplay/android-developer/answer/112622
