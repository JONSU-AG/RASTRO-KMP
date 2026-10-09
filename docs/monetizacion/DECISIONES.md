# Decisiones — 07/10/2026

- Todos los planes tienen los mismos beneficios. Precios solo referencia hasta Billing.
- Tester = concesión Pro permanente revocable; no otro sistema de privilegios.
- Tres intentos asociados al identificador de concesión, sin renovación diaria; una nueva concesión reinicia sus tres intentos. Confirmar periodo futuro de renovación al integrar suscripciones recurrentes.
- Mantener vidas gratuitas debajo de Pro para recuperar su saldo al vencer; no rellenarlas por terminar niveles.
- AdMob conectado por pedido posterior del usuario, con IDs verificados y consentimiento UMP. Solo el callback de recompensa confirma videos. SSV y monedero autoritativo siguen pendientes.
- Billing oficial añadido posteriormente por solicitud explícita. IDs pendientes centralizados, precios reales mediante ProductDetails en la fase de venta. Firestore sigue siendo la única fuente del entitlement Pro; el adaptador no otorga beneficios.
- Avisos antiguos sin ventana explícita no se presentan como popup; siguen disponibles en notificaciones.
- No publicar Firebase, legales, GitHub ni Play desde este pedido de implementación local.

## Continuación autorizada

- El usuario autorizó únicamente lanzamientos internos; la prueba cerrada permanece sin cambios. No copiar testers ni promover tracks.
- Ante la categoría fiscal y el ID inmutable del formulario se detuvo la creación del producto, por instrucción expresa del usuario; no se usaron IDs inventados.
- Firebase Spark es un bloqueo real para desplegar la verificación. No elegir cuenta de pagos ni cambiar a Blaze automáticamente.
- Mantener checkout deshabilitado hasta completar productos, servidor, lifecycle de suscripciones/reembolsos y pruebas Play reales.

## 08/10/2026

Separar respaldo personal de operaciones sociales; no depender de Blaze para estudiar. Cuenta RevenueCat y conexión de compras pendientes, sin doble sistema Pro. Detalles en ../sincronizacion/DECISIONES.md.

### Preparación interna 204

El propietario autorizó subir la candidata exclusivamente a prueba interna. Se conserva checkout deshabilitado; no se acepta implícitamente el contrato de las API de Google ni se eligen datos fiscales/bancarios. La subida no certifica producción con monetización. La cuenta de servicio y JSON de RevenueCat ya creados se reutilizan, sin nuevas claves. Listas de testers existentes conservadas sin cambios.

## 08/10/2026 — Anuncios de prueba en vista usuario Admin

Reutiliza AdminConfig.userViewMode y AdsPlacementController: solo una cuenta Admin en vista usuario recibe unidades demo oficiales de Google, incluso en release. Al cambiar modo/cuenta invalida anuncios cargados y callbacks antiguos. Terminar una actividad permite intersticial de prueba desde el primer día, sin filtros de plan/frecuencia; jamás durante preguntas ni en superficie Admin. Los rewarded siguen siendo voluntarios. No se modifica Pro, política publicitaria normal, UMP, campañas remotas ni cuentas de pago. Sin disponibilidad/consentimiento de SDK no se fuerza un anuncio inexistente. Fuente: https://developers.google.com/admob/android/test-ads

149 pruebas Android, lint y assemble correctos; interacción real de anuncios pendiente, no APK ejecutada.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

Visibilidad de información Pro es independiente de checkoutEnabled. No habilitar ventas por cambios de diseño, simular precios/productos ni alterar vidas, saldo, anuncios o entitlement. Mantener precios reales de Google Play cuando las compras estén disponibles.


## 08/10/2026 — Refinamiento solicitado

Modal con X fija; área desplazable recortada para no cubrir el título. Texto e iconos de acciones deshabilitadas usan contraste del tema. Sin cambios de precios, anuncios, recompensas ni cobros.


## 08/10/2026 — Cierre al iniciar examen y anuncios

Se retira introducción previa a intersticial. Agradecimiento y Pro permanecen juntos únicamente tras anuncio mostrado y cerrado. Se conservan consentimiento, elegibilidad, frecuencia y rewarded. Ver `docs/simulador/CIERRE_Y_ANUNCIOS_2026-10-08.md` para evidencia y límites.


## 08/10/2026 — Iconos, revisión y regalos

Aviso tras anuncio una vez por cuenta/día de Lima, transacción entry_notices más caché local. Fin de resultados Simulador conectado; Admin modo usuario conserva demo sin espera. Regalos y códigos gratuitos en saldo existente; códigos editables, un destinatario global o un recibo por usuario. Lectura explícita, paginada, sin funciones de pago. Reglas Pro/regalos publicadas y verificadas; Spark y pagos deshabilitados conservados.

Reutilizar saldo, repositorios, Pro y avisos existentes. No crear una economía paralela ni activar cobros. Catálogos de lecciones y recurso original de fuego conservados.

## 08/10/2026 — Condición de costo y categoría fiscal
Conservar Spark. No elegir facturación ni asumir la clasificación fiscal. RevenueCat gratuito tiene límite MTR; no prometer gratuidad ilimitada. Usar el adaptador y Pro existentes cuando se integren productos reales; no copiar IDs propuestos a configuración como si estuviesen creados.

## 08/10/2026 — Precios de referencia terminados en .99
Por instrucción del propietario: mensual S/4.99, seis meses S/19.99, anual S/29.99, permanente S/49.99. Guardados como borradores reales en Play. El precio localizado devuelto por Google Play es la fuente de verdad; no convertir estos importes en cobros estáticos en la APK. Categoría Ventas de apps digitales confirmada por el propietario.

## 08/10/2026 — Activación autorizada de pagos reales

Después de confirmar fiscalidad y creación real de productos, habilitar checkout con IDs comprobados en Play. Reutilizar entitlement rastro_preuniversitario_pro y adaptador existentes. Verificar entitlements firmados; preservar separación de regalos y compras. Conservar compras con cuenta original para evitar transferencias involuntarias. Precios de la tienda, no referencias estáticas. Usar RevenueCat sin desplegar verificador Firebase en Blaze; mantener Spark y no elegir facturación. El permiso Admin de Pub/Sub para RevenueCat fue autorizado por el propietario tras explicar su alcance.

## 09/10/2026
El acceso de prueba al catálogo es exclusivo de Admin Firebase verificado. Usa el mismo checkout real RevenueCat/Google Play; el SDK no simula compras y la ausencia de cobros requiere tarjeta de prueba de Play.

## 09/10/2026 — Botón de plan
Nombre/duración y precio localizado comparten un único botón físico del tema. No mantener tarjetas decorativas duplicadas ni inventar precios cuando la tienda no responde.

## 09/10/2026 — Distribución de pruebas
La autorización actual cubre únicamente prueba interna. Las novedades visibles deben describir correcciones y mejoras para estudiantes sin mencionar funciones Admin. Diferenciar disponibilidad del bundle en Play de verificación de compra real; esta última requiere prueba física con la cuenta de licencia y tarjeta de prueba.

## 09/10/2026 — Archivo de autorización web
Usar línea oficial de la cuenta existente, sin nueva app AdMob. Añadir a web vigente conservando contenido y líneas de otros vendedores; no desplegar un dist histórico para publicar un solo archivo. UMP/legal requieren aprobación previa del propietario. La ficha pública solo bloquea vinculación/rastreo ligados a tienda, no toda la preparación.
