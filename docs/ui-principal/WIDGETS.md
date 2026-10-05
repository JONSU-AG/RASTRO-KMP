# Widgets ilustrados y atajos del launcher

Se reutilizan las copias exactas existentes de `LOGO/WITGET` en `androidApp/src/main/res/drawable-nodpi/`. No modificar los originales:

| Original | Recurso | Tamaño |
|---|---|---|
| CONTADOR2X1.png | widget_bg_contador.png | 2 × 1 |
| R-DIARIA2X1.png | widget_bg_racha_diaria.png | 2 × 1 |
| R-SEMANAL4X1.png | widget_bg_racha_semanal.png | 4 × 1 |
| FRASE4X1.png | widget_bg_frase.png | 4 × 1 |

## Presentación compartida

`widgets/RastroWidgetViews.kt`: RastroWidgetKind identifica layout, provider, raíz, tamaño y nombre. `create(context, kind)` construye los RemoteViews con los datos existentes; los cuatro providers delegan aquí. Fallback protegido para que un fallo no cierre el provider.

Los layouts `res/layout/widget_*` conservan ilustraciones y datos superpuestos; fitCenter evita recortar/deformar imágenes. Sin layout_weight, preservando la corrección anterior del launcher. Widgets con dibujos/vectoriales, sin emojis añadidos. Contador sin fecha válida muestra Configura la fecha, sin días inventados. WidgetDates cuenta días de calendario en Lima.

`RealWidgetPreview` aplica esos mismos RemoteViews mediante AndroidView, sin imitación Compose ni clics a los PendingIntents. `WidgetsAndShortcutsDialog` muestra los cuatro tamaños, anclado y editor de examen; refresca por preferencias y al volver al primer plano. Accesos: Más → Widgets y Perfil → Ajustes → Widgets de inicio → Ver vistas previas y agregar.

El anclado envía EXTRA_APPWIDGET_PREVIEW con los mismos datos. No afirmar instalación hasta confirmación del launcher.

## Compatibilidad del selector Android

- API 35+: setWidgetPreview publica datos actuales al abrir la app/actualizar el provider. Fingerprint por tipo evita republicar contenido sin cambios y solo guarda aceptación si devuelve true; errores/límites no cierran la app.
- API 31+: previewLayout referencia el layout real. Cuando no usa la vista generada, el launcher muestra datos de ejemplo del XML.
- Anteriores: previewImage conserva la ilustración como fallback; ese selector no recibe datos personales en vivo por esta API. Las vistas dentro de la app y el anclado compatible sí contienen datos actuales.
- El launcher determina cuadrícula, márgenes, tamaño final, soporte de anclado y longitud de etiquetas.

Referencias: [previews](https://developer.android.com/develop/ui/views/appwidgets/previews), [AppWidgetManager](https://developer.android.com/reference/android/appwidget/AppWidgetManager).

## Mantener pulsado el icono

`res/xml/rastro_shortcuts.xml`, enlazado en todos los aliases actuales:

- 🥺 ¿Nos dejas? Una última lección → acción com.jonsuapps.rastro.action.LEARN → aprender.
- 💪 Aún no te rindas · Mira los aportes → acción com.jonsuapps.rastro.action.CONTRIBUTE → biblioteca/aportes (pestaña Aportes).

Solo estos nuevos mensajes llevan emojis. Son atajos junto a Mover/Desinstalar, no reemplazan el menú ni interceptan desinstalaciones. MainActivity los recibe al iniciar/onNewIntent. RastroAppLinks.acceptShortcut acepta únicamente esas dos acciones usando la navegación existente; no amplía enlaces públicos ni permite destinos arbitrarios. [Referencia oficial](https://developer.android.com/develop/ui/compose/system/shortcuts/creating-shortcuts).

## Validación

Compilación Android + WidgetIntegrationTest (4), RastroAppLinksTest (2), CatalogPilotValidationTest (4). Contratos XML/tamaños/aliases, hashes exactos de PNG, rutas y fechas Lima. Log build/widgets-final.log.

Pendiente verificación física: agregar/redimensionar, fuentes grandes, picker por versión/launcher y atajos con app cerrada/abierta. No ejecutar app según AGENTS.md; sin commit/push ni dependencias nuevas.

## Contador personal con calendario — 03/10
ExamCountdownSettingsDialog reemplaza el campo de fecha manual del hub. Al agregar Contador primero abre Elige la fecha de tu examen; guardar solicita el anclado con los nuevos datos, cancelar no instala ni cambia preferencias. Configurar examen permite editar un contador existente sin solicitar otro anclado. Fecha personalizada usa DatePicker Compose dentro de Sticker3dCard y adapta su ancho; interpreta las selecciones UTC como fechas civiles para evitar cambiar el día al convertir a Lima. Nombre y carrera opcional siguen editables.

UnsaExamDates.kt contiene exactamente las fechas proporcionadas por el usuario: principales 01/11/2026, 24/01/2027, 21/02/2027 (Aptitudes), 14/03/2027 y 20/03/2027 (Filiales). Previa: 18/10/2026, 10/01/2027, 14/02/2027, 07/03/2027; opción separada para Arquitectura, Artes en Plásticas o Música. No usar inscripciones, inicio de clases o asignación de vacantes como fecha de admisión. Para actualizar el cronograma editar options conservando IDs estables, título, fecha ISO y preliminary. Estas fechas fueron dadas por el usuario; no existe sincronización automática con UNSA.

WidgetDates.display es la fuente compartida de textos: más de un día → días; día anterior → horas redondeadas hacia arriba hasta medianoche de Lima; día del examen → HOY / ES TU EXAMEN; fechas anteriores → EXAMEN FINALIZADO; fecha inválida/no configurada → CONFIGURA LA FECHA. No se inventa una hora de inicio: las horas cuentan hasta comenzar el día del examen, no hasta rendir la evaluación.

ExamCountdownWidgetProvider programa una única alarma no exacta al próximo cambio de hora (último día) o medianoche (otros días). Reprograma al actualizar/configurar, ajusta al cambiar reloj/zona y cancela al retirar el último contador. No añade permisos de alarmas exactas, notificaciones, servicios ni polling; el sistema puede demorar entrega cuando duerme el dispositivo. Se mantienen además las actualizaciones normales del widget. Hub refresca por hora mientras esté visible y detiene ese trabajo al ir al background; vuelve a leer al retomar. Vistas generadas incorporan el texto actual a su fingerprint.

LiquidNavbar reduce separación SVG/etiqueta de 4 a 1 dp y quita padding tipográfico extra con lineHeight explícito. Así el icono baja ligeramente y el texto se acerca; ambos siguen centrados como grupo. No cambia altura del dock, SVG, destinos ni áreas táctiles.

Validación: compileDebugKotlin + ExamCountdownTest 4 (días/horas/medianoche/Hoy/pasado, próximas actualizaciones, cronograma exacto, personal/inválida), WidgetIntegrationTest 4, enlaces 2, piloto 4. Log build/countdown-final.log. Pendiente comprobación física de popup, calendario reducido, navbar y entregas del launcher; app no ejecutada según AGENTS.md. Referencia DatePicker: https://developer.android.com/develop/ui/compose/components/datepickers.

## 04/10 — Acabado de referencia y logo instalado

RastroWidgetIllustration compone los PNG existentes de LOGO/WITGET y datos reales sobre un único Canvas: contador en el papel original, panel cálido de racha diaria, panel semanal con 7 círculos/checks y frase centrada. No cambia los personajes ni los PNG. Bitmap de 640 px de ancho para conservar memoria/Binder; todo escala junto con fitCenter, sin recortar la ilustración. Textos largos se ajustan al espacio reservado. RastroWidgetViews muestra widget_artwork y oculta el antiguo overlay; mantiene clic, accesibilidad, fecha Lima y actualizaciones. RealWidgetPreview usa esos mismos RemoteViews y la proporción real del recurso. El picker usa preview generado en versiones compatibles; en versiones anteriores mantiene su previewLayout estático, no promete datos vivos en ese picker.

RastroLogoManager conserva los 4 aliases existentes y cambia el icono realmente instalado. Racha en riesgo: después de las 18:00 Lima, última actividad ayer y racha positiva → ENOJO (no existe asset exclusivo de riesgo). Inactividad: umbrales existentes LogoMoodConfig (24/48 horas); pérdida real sin congelador → TRISTE con prioridad. LimaStudyReminderWorker refresca también el launcher antes de sus retornos de notificación, reutilizando WorkManager periódico de 3 horas; no abre app ni marca actividad. Android/launcher puede retrasar la actualización. initialize es idempotente. Solo LOGOBASE, LOGO-ENOJO, LOGO-FURIA, LOGOTRISTE; sin nuevos assets. Fórmulas: únicamente el icono del botón superior cambia a Lightbulb, callback intacto.

No se ejecutó la app. Validación física pendiente: launcher/picker, redimensionado y fuentes grandes. No commit/push.
