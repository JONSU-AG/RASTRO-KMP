# Preparación de producción — 08/10/2026

## Versión preparada

RASTRO 2.0.2, versionCode 204, paquete com.jonsuapps.rastro. Se comprobó directamente en Play que el máximo anterior era 203. El destino autorizado es exclusivamente prueba interna.

Validación local: 325 pruebas sin fallos (140 Android y 185 shared), lintVitalRelease y bundleRelease correctos. bundletool valida la AAB; su manifest contiene BILLING, código 204, nombre 2.0.2, mínimo API 24 y target 36. Firma verificada con la clave de carga existente. No se ejecutó la aplicación, conforme a las instrucciones del propietario.

AAB: androidApp/build/outputs/bundle/release/androidApp-release.aab. Tamaño: 80 511 418 bytes. SHA-256: 40A1357AB83EB5B8C376E93A923AF6A128DEE540F3F28F0447CA53655DBD9052.

La verificación JAR informa las advertencias del certificado Android autofirmado, ausencia de timestamp y orden ZIP/manifest de bundle. No se sustituyó la firma; bundletool acepta el formato. La aceptación de Play se registra después de procesar la carga.

Play aceptó y lanzó 204 en prueba interna: «Disponible para verificadores internos», 08/10/2026, 2:00 p.m. Cero errores bloqueantes; una recomendación de símbolos de depuración nativos, ReTrace incluido. No se promovió a producción ni cerrada. Evidencia: build/play-internal-204.jpg.

La lista existente «pruebas internas» está seleccionada con 2 usuarios; no se añadieron cuentas. Adhesión: https://play.google.com/apps/internaltest/4701199787677789376. Comprobación final de canales: interna 204 activa, cerrada Alpha 201 conserva su lanzamiento anterior.

## Qué contiene

Cambios existentes de operación local y consumo reducido: progreso local, respaldo opcional, consultas de playlists por páginas, caché de fotos por autor, actividad agrupada y actualización explícita en Admin. UI de vidas y misiones de monedas conserva el estilo RASTRO. No se modificó contenido académico durante la preparación del release.

## Bloqueos para producción con monetización

- Compras desactivadas (PlayBillingConfig.checkoutEnabled=false). No existen IDs reales de productos/base plans configurados. No se muestran compras ficticias ni se cobran precios de referencia.
- RevenueCat tiene la app Google Play y el JSON guardados, pero informa que Android Developer API está deshabilitada. Habilitarla requiere aceptar condiciones legales de Google en ese paso. La aprobación genérica de preparar producción no se tomó como aceptación de un contrato.
- SDK RevenueCat, entitlement, oferta, productos, restauración y ciclo de suscripciones todavía requieren integración y comprobación real. La conexión del panel no equivale a integración en la APK.
- La categoría fiscal y los IDs inmutables de productos requieren decisión del propietario. No se seleccionó cuenta de facturación, dirección, método de pago ni identidad.
- Reglas/backend de monetización preparados localmente no equivalen a despliegue. Firebase conserva Spark. El verificador propio de Cloud Functions no se ha desplegado; la alternativa RevenueCat debe finalizarse antes de activar ventas.
- Consentimiento UMP permanece en borrador y la habilitación comercial de AdMob requiere completar sus verificaciones. No activar anuncios automáticos como parte de esta preparación.
- La revisión legal final y la coherencia de Privacidad/Seguridad de los datos deben cubrir los SDK y flujos efectivamente activados.
- No se realizaron pruebas físicas ni compras reales. Validar autenticación, progreso, sincronización, restauración, Pro manual, consentimiento y anuncios antes de promover a producción.

Por estos motivos, esta entrega es una candidata para prueba interna; no una certificación de que la monetización esté lista para producción.

## Datos protegidos

El JSON de RevenueCat está fuera del repositorio en Documents/json de revenue cat. No incluirlo en Git, APK/AAB, capturas ni documentación. Se conserva la cuenta de servicio ya autorizada; no se generaron credenciales adicionales.
