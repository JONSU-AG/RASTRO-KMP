# Versión de exposición — noviembre de 2026

Decisión vigente del propietario: Pro oculto temporalmente, anuncios desactivados y reserva de 750 monedas y 75 vidas. NO hay acceso ilimitado ni se eliminan los costes por monedas. Las pruebas gastan normalmente y se pueden comprar vidas con el saldo interno. No se abre checkout de Google Play.

Vigencia: esta configuración permanece en esta compilación durante todo el mes y hasta que el propietario prepare una actualización normal. No se desactiva al cambiar de día o mes. No hay tarea programada, fecha de caducidad ni recarga diaria/mensual automática.

La reserva utiliza el monedero y el recibo de regalo existentes: rastro-presentation-2026-11-v1. Se añade una sola vez por progreso de cuenta/invitado, sin multiplicación Pro; restaurar el progreso que ya contiene ese recibo no vuelve a abonarla. El saldo es una concesión autorizada de moneda interna, no un cobro ni una compra fingida. Sigue las reglas existentes de guardado local y respaldo voluntario. No se modifica Firebase remoto para activarla.

El límite temporal de vidas es al menos 75; errores consumen vidas, exámenes consumen monedas y no se consumen intentos gratis de Pro oculto. La regeneración existente continúa. No se cambian XP, notas, estrellas, reglas de racha, progresión o permisos de cuenta/admin. Ranking conserva requisitos y registro oficial: no se implementó un ranking ficticio/local ni se enviaron resultados durante esta sesión.

Para volver a la versión normal, compilar la actualización con -Prastro.presentation=false. Ejemplo: .\gradlew.bat assembleDebug -Prastro.presentation=false. La configuración por defecto está en androidApp/build.gradle.kts, BuildConfig.PRESENTATION_MODE. El límite vuelve al configurado por la economía existente; no se confiscan monedas restantes ni se conceden nuevos regalos. Pro/pagos se vuelven a presentar según sus datos reales, que no se borraron. Los anuncios vuelven a obedecer la configuración AdMob y AdServingMode existente; no se fuerzan si siguen desactivados o pendientes de aprobación.

Esta compilación no fue publicada. La ejecución física de Android está prohibida en este repositorio: pendiente comprobar el recorrido en el teléfono con el propietario.
