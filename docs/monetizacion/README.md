# RASTRO Pro y espacios publicitarios

Implementación local 07/10/2026. Reutiliza GamificationManager, saldo de monedas, vidas y site_settings/global. AdMob y UMP están integrados con IDs reales verificados en la cuenta. Debug utiliza IDs oficiales de prueba. No incluye cobros ni compra simulada. Billing oficial está incorporado para la AAB 2.0.2 (203), lanzada exclusivamente a prueba interna, sin checkout activo. Continuación posterior: Billing subido exclusivamente a prueba interna; la cerrada permanece intacta. Ver PLAY_BILLING.md.

## Pro

Perfil → Ajustes → RASTRO Pro; muestra beneficios, cuatro planes y estado/vencimiento. Las tarjetas ya no muestran precios locales; los precios de compra deben venir de Google Play. La compra permanece deshabilitada hasta productos y servidor verificados.

Admin → Pro y economía → seleccionar cuenta/UID → plan → fecha inicial y final (hora Lima), o Permanente → Asignar. Retirar desactiva el beneficio. Los testers se asignan por esta vía, sin rol o modo tester. Concesiones privadas en rastro_pro/{uid}: lectura propia/Admin, escritura exclusiva del Admin verificado. Requiere publicar las reglas preparadas antes de usarlo en Firebase real.

Pro otorga vidas ilimitadas solo en Aprender, x2 XP de estudio y x2 monedas de lecciones. No aumenta estrellas, calificaciones, ranking ni racha. Vence en el instante final; Permanente no vence. La duplicación no multiplica las recompensas voluntarias de anuncios ni se paga retroactivamente a lecciones anteriores al beneficio.

Todos tienen un primer Simulacro gratuito, seguido de tres intentos gratuitos por concesión Pro; después 75 monedas. Ranking 75, rápido 30. El cobro y el primer intento se guardan en el estado existente por identificador; reabrir la sesión guardada no vuelve a cobrar. La recuperación de preguntas y respuestas es local por cuenta/dispositivo, no una sesión compartida entre dispositivos. Antes de activar pagos reales debe pasarse la autorización económica a un backend transaccional: el saldo actual de gamificación todavía es escribible por su dueño y no es un monedero antifraude. El servidor debe también arbitrar simultaneidad entre dispositivos y verificar recibos de Play y AdMob.

## Vidas y anuncios

Valores iniciales: 15 vidas, una cada 30 minutos. Una respuesta incorrecta consume una, sin interrumpir el nivel a cero. El bloqueo aparece al abrir otro nivel. Se elimina la recarga automática al completar niveles; compras suman hasta el máximo: 5 por 15 monedas, 10 por 25 y recarga completa por 35.

Los valores y ofertas pueden editarse desde Admin. La configuración se guarda en el documento global existente, con economyJson y los campos de vidas existentes. Sin economyJson se adoptan los nuevos valores iniciales; no se modifica remotamente ninguna configuración durante esta intervención.

Rápido 1/10, Doble 2/25, Bonus 3/40, Super 5/65. Se fijan las condiciones al iniciar un pack; progreso/recibos se conservan en el estado por cuenta, sin pagos parciales ni duplicar el mismo recibo. Solo al completar aparece Reclamar. Sin proveedor los botones de video están deshabilitados; no existen anuncios falsos ni recompensa por un toque. No se promociona Pro entre videos.

AdsPlacementController conecta el proveedor AdMob con consentimiento UMP previo. Primer día sin automáticos, progresión de frecuencia, separación mínima, límite diario y separación tras Rewarded. Excluye Pro, superficie Admin y preguntas activas. Puntos preparados: cierre de lección después de resultados y cierre de resultados de exámenes; botón Terminar en la última Flashcard del Simulador. No muestra publicidad en pregunta, carga, navegación ni falta de vidas/monedas. Sin introducción previa: agradecimiento con acceso a Pro tras anuncio realmente mostrado y cerrado. El interruptor de automáticos permanece desactivado por defecto; antes de activarlo deben resolverse los pendientes de ADMOB_CONFIGURACION.md. Si no se puede verificar Pro en el servidor, se omiten automáticos para proteger también a los testers.

## Pendientes deliberados del proveedor real

- SDK e IDs conectados; consentimiento UMP integrado. Mensaje europeo guardado como borrador, pendiente de revisión/publicación. Cuenta en verificación y app sin vinculación a tienda.
- Confirmación de recompensa desde callback oficial y verificación SSV en servidor, eventos únicos y crédito transaccional.
- Google Play Billing: productos/base plans, precios localizados obtenidos de ProductDetails; validación, reconocimiento, restauración, cancelaciones y RTDN en backend. No sustituir por enlaces de pago externos.
- Desplegar reglas verificadas con emulador; prueba física (prohibido ejecutar la APK en esta sesión), conexión real de Admin y dos dispositivos.

Referencias: https://developers.google.com/admob/android/rewarded y https://developer.android.com/google/play/billing/subscriptions.



