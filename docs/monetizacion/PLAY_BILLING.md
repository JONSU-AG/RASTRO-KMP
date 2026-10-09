# RASTRO Pro — Billing y prueba interna (07/10/2026)

## Arquitectura y alcance

Se reutilizan ProAccess, MonetizationRepository, rastro_pro/{uid}, beneficios y gamificación existentes. No hay un segundo sistema Pro. `androidApp` genera la AAB; Billing 9.1.0 y com.android.vending.BILLING están en el manifest. El cliente recibe Pro únicamente del documento privado existente, nunca de un callback local de compra.

## Implementado en esta continuación

- Un BillingClient por MonetizationRepository; cola de conexión, reconexión oficial y cierre al terminar la actividad. Recuperación al volver al primer plano cuando se habilite checkout.
- Catálogo INAPP/SUBS, ProductDetails consultados nuevamente al comprar; selección explícita del base plan sin escoger una oferta arbitraria. Precios provienen exclusivamente de Google Play. Se retiraron precios de referencia de las tarjetas de venta.
- launchBillingFlow con cuenta ofuscada SHA-256 del UID; cancelación, errores, carga, pago PENDING sin Pro y restauración mediante queryPurchasesAsync.
- Restaurar compras disponible desde el diálogo Pro. Sin productos ni backend habilitado informa que falta configurar, sin simular éxito.
- verifyRastroProPurchase preparado en el codebase Functions existente: autenticación no anónima + App Check, Developer API, catálogo autorizado del servidor, asociación token/usuario, vigencia real, transacción idempotente y acknowledgement tras guardar la entrega. Preserva concesiones manuales vigentes del Admin (incluido Pro permanente de testers).
- El mismo purchaseToken conserva grantId; restaurar/renovar ese recibo no regala tres intentos nuevos.
- `checkoutEnabled = false` hasta completar despliegue, productos, permisos y pruebas reales. La función no está desplegada; IDs null tanto en Android como en catálogo servidor, en ubicaciones explícitas.

## Play Console — hechos

La cerrada Alpha usa 2.0.1 (201), comprobado en vivo antes de esta intervención. Se lanzó 2.0.2 (202) exclusivamente en prueba interna para desbloquear Billing; no se seleccionaron verificadores. Play indica que ningún usuario recibe esa interna sin verificadores. Productos únicos quedaron habilitados después del lanzamiento.

El formulario de compra única exige categoría fiscal y advierte que el ID no puede modificarse/reutilizarse. Se dejó sin crear ni confirmar, conforme a la orden del usuario sobre datos fiscales y decisiones irreversibles. No se seleccionó cuenta de pagos, dirección ni datos bancarios. No se cambió la prueba cerrada, sus verificadores ni producción. La ampliación de código mantiene versionName 2.0.2 y usa 203, ya que 202 quedó consumido en Play.

## Configuración pendiente

- Usuario: confirmar categoría fiscal del producto y decisiones legales que Play solicite; aprobar los IDs inmutables antes de crearlos. Completar personalmente pagos/dirección/identidad si Google los solicita; nunca inferirlos.
- Crear productos reales y base plans, disponibilidad y precios iniciales autorizados; registrar sus IDs en PlayBillingConfig.kt y functions/play-billing.js. No hay IDs ficticios en producción.
- Elegir cuentas exclusivamente para prueba interna y licencias de prueba; no copiar verificadores de cerrada. No se enviaron enlaces ni notificaciones.
- Configurar Developer API y permisos mínimos del servicio de verificación (requiere autorización para otorgar acceso), App Check, despliegue de función y reglas Pro. No se despliega con IDs null ni se habilita checkout antes de validarlo.
- Completar RTDN/reconciliación para renovación, reembolso, revocación, suspensión, vencimiento y compras fuera de la app. La verificación bajo demanda ya está preparada; no cubre por sí sola todo el ciclo en producción.
- Probar en entorno Play: compra/cancelación/pago pendiente/permanente/restaurar después de reinstalar y cambio de cuenta. Las pruebas de código no sustituyen una compra real. No se ejecutó la app (prohibición vigente).
- Backend económico/AdMob SSV y concurrencia entre dispositivos continúan pendientes según docs de monetización. No se afirma que la monetización esté lista para producción.

## Fuentes oficiales consultadas

- https://developer.android.com/google/play/billing/integrate
- https://developer.android.com/google/play/billing/security
- https://developers.google.com/android-publisher/api-ref/rest/v3/purchases.subscriptionsv2/get
- https://developers.google.com/android-publisher/api-ref/rest/v3/purchases.productsv2/getproductpurchasev2

## Evidencia

Compilación y validación final: CHECKLIST.md/CAMBIOS.md. Evidencia visual en build/play-internal-202.jpg y build/play-product-tax-pending.jpg. No se aceptaron términos legales ni declaraciones fiscales.

## Bloqueos comprobados en las consolas

- Firebase muestra plan Spark (sin costo). No se cambió a Blaze ni se seleccionó cuenta de facturación. Cloud Functions de verificación requiere habilitar facturación y permisos de Developer API; el usuario debe resolver ese paso sensible.
- Play permite crear productos tras lanzamiento interno 202, pero el formulario pide categoría fiscal (por defecto «Ventas de apps digitales») y avisa que el ID no puede cambiarse/reutilizarse. No se confirmó ese valor fiscal ni se crearon IDs inmutables.
- Evidencia adicional: build/firebase-spark-pending.jpg.

### Estado final Play Console

203 (2.0.2) lanzada exclusivamente en prueba interna, comprobado el 07/10/2026 a las 15:31 (hora mostrada por Play). No hay verificadores internos; no se distribuye a nadie hasta configurarlos. 202 se usó primero para desbloquear Billing. Prueba cerrada sin intervención. Evidencia final: build/play-internal-203.jpg. Checkout sigue deshabilitado y no se publicaron productos, Firebase ni producción.

Comprobación final del listado de Play: interna 203 activa y cerrada Alpha 201 conserva fecha y versión anteriores. Evidencia conjunta: build/play-internal-203-alpha-201.jpg. No cambios en lista de verificadores ni promoción de tracks.
