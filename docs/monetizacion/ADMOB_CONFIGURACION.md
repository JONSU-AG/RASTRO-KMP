# AdMob RASTRO — 07/10/2026

## Hechos verificados en la cuenta

App: RASTRO Preuniversitario, Android, cuenta aguilar.jonsu@gmail.com.

| Uso | ID |
|---|---|
| Aplicación | ca-app-pub-4563495447517759~3422086209 |
| RASTRO - Final de estudio / Intersticial | ca-app-pub-4563495447517759/3633839193 |
| RASTRO - Packs de monedas / Recompensado | ca-app-pub-4563495447517759/2646217272 |

Unidades creadas y confirmadas por AdMob. Recompensa técnica: 1 «Video del pack»; las monedas dependen del pack completo, no del número configurado en AdMob.

Bloqueos aplicados exclusivamente a RASTRO: Citas, Referencias al sexo y Salud sexual y reproductiva. Alcohol y apuestas para mayores de 18 ya estaban bloqueados y se conservaron. Clasificación máxima de la app cambiada de MA a **G / Público general**: PG, T y MA bloqueados. La pantalla no ofrece un bloqueo sensible independiente llamado «exposición de piel»; G es una restricción adicional, no garantía individual sobre cada creatividad. Revisar y bloquear anuncios concretos desde AdMob si alguno resulta inapropiado.

Pruebas visuales: ../../build/admob-bloqueos.png y ../../build/admob-clasificacion.png.

## Código integrado

Google Mobile Ads 24.9.0 y UMP 4.0.0. Se intentó 25.5.0: requiere metadatos Kotlin 2.3 incompatibles con el compilador 2.1 existente. Se conserva la arquitectura y compilador del proyecto; 24.9 corrige traducciones faltantes de 24.6/24.7.

Release utiliza los IDs de arriba; debug usa App ID y dos unidades oficiales de prueba. No hacer pruebas con anuncios reales del propio publicador. No se instalaron ni ejecutaron APKs.

UMP actualiza consentimiento al abrir, muestra formulario cuando corresponde y solo permite inicialización/carga si canRequestAds(). Ajustes → Legal y privacidad muestra el acceso de revisión cuando Google lo requiere. Solicitudes no personalizadas para todos, clasificación G también en SDK; no se etiqueta a usuarios de 17+ como niños. Sin permisos de ubicación ni segmentación por contenido académico, correo o perfil.

Un anuncio precargado por formato, caducidad de una hora, sin ciclos automáticos de reintento. Activity débil y comprobación de primer plano antes de mostrar; fallos y cierres liberan el estado sin monedas. Cambiar consentimiento descarta cargas anteriores. Botón «Buscar anuncio disponible» permite reintentar.

Rewarded solo incrementa progreso desde onUserEarnedReward, una vez por respuesta del SDK; cerrar no premia. Claim de packs sigue idempotente. SSV no configurado: esta confirmación local no es un recibo verificado por servidor. El monedero todavía es escribible por el usuario; no usarlo como dinero ni crédito transferible y conservar pendiente el backend autoritativo antes de pagos.

Se conservan puntos, frecuencia, primer día sin automáticos y exclusiones Pro/Admin/preguntas de la implementación anterior. Automáticos desactivados por defecto hasta finalizar la preparación. Además, requieren que la concesión Pro de la cuenta actual haya sido comprobada en servidor: un fallo de reglas/red no hace aparecer anuncios a testers Pro.

## Pendientes reales para publicar/activar

1. AdMob indica **cuenta en verificación**, sin aprobar aún. La app requiere vinculación a tienda y revisión de disponibilidad. No se cambió facturación.
2. Mensaje «RASTRO - Consentimiento europeo» guardado como **Borrador**, español predeterminado e inglés adicional, RASTRO seleccionada, URL de privacidad vigente, rechazo habilitado para todas sus regiones. No se publicó: el usuario pidió aprobar previamente cambios legales. Al reabrir el editor AdMob mostró «No se puede cargar la página»; el listado confirma que el borrador existe. Falta revisar configuración de proveedores y vista final antes de publicarlo.
3. Actualizar privacidad y Seguridad de los datos de Play para reflejar SDK publicitario; conservar la revisión legal previa solicitada. No se publicó ningún texto legal ni declaración nueva.
4. Publicar reglas rastro_pro verificadas previamente, asignar Pro a testers y comprobar permisos; luego activar automáticos en Admin cuando proceda. No se desplegaron reglas en esta intervención.
5. Validación en dispositivo de consentimiento, giro/cierre/fallo de anuncios y recompensa. No ejecutada por instrucción del usuario. Los tests de política no sustituyen esa prueba del SDK.
6. Nueva compilación y versionCode superior a 201 para subir estos cambios; el bundle 2.0.1 ya subido no cambia por editar código. No se generó ni subió otro bundle.

## Fuentes oficiales consultadas

- https://developers.google.com/admob/android/quick-start
- https://developers.google.com/admob/android/rel-notes
- https://developers.google.com/admob/android/privacy
- https://developers.google.com/admob/android/targeting
- https://developers.google.com/admob/android/rewarded

## Validación

129 pruebas Android, 0 fallos y 0 errores comprobados en XML; lintVitalRelease correcto en build/admob-validation.log. Verificados también App ID e IDs de unidades en manifests/BuildConfig generados: prueba en debug y propios en release. git diff --check correcto. No se afirma prueba de entrega real, aprobación de AdMob ni aprobación de Play.
