# Checklist

- [x] CodeGraph 1.6.2 instalado, indexado y usado con explore/impact/sync; skill local validada (`Skill is valid!`).
- [x] Guía de skills actualizada con aplicaciones concretas al pedido.
- [x] HUD fuera del scroll, ligas, mensual al toque y fichas desde Truquitos: integración compilada.
- [x] Cofre muestra XP concedida y cambio de saldo; entrega al nivel después de cerrar el popup.
- [x] Simulacro y lecciones comparten saldo; test de idempotencia y restauración aprobado.
- [x] Sorteo sin preferencia por Loki y dos celebraciones verificadas con semilla reproducible.
- [x] Fénix/noqueado, estrellas grandes, racha/footer x2 integrados sin rediseñar personajes.
- [x] Explicación morada de ancho completo, separada del reporte.
- [x] Reportes conectados a bandeja Admin; confirmación solo después del guardado.
- [x] Columnas adaptativas y selector de portadas compilados.
- [x] Portadas ajustadas a 120 dp mínimos; Perfil → Ligas/calendario existente y navbar cápsula con icono de examen integrados. Detalle en docs/simulador.
- [x] Previews sin altura fija; conserva proporción horizontal/vertical y imagen completa al ampliar.
- [x] Parser de enlaces nuevos/antiguos, rechazo de enlaces inválidos y recepción de nuevos intents implementados.
- [x] Asociación HTTPS publicada comprobada mediante lectura de assetlinks.json.
- [ ] Matriz visual teléfono/tablet vertical, horizontal, ventana dividida y fuentes grandes.
- [ ] Prueba real de entrega/guardado de XP y recepción del reporte en Admin con cuenta autenticada.
- [ ] Apertura automática del enlace en Android con firma instalada autorizada.

La compilación y resultados de tests quedan en `build/mejoras-principales-build.log` y los XML de test de Android/shared. No marcar pendientes como comprobados basándose solo en el build.

## 03/10 — Acabado reutilizable
- [x] Tokens de contorno/capa sólidos integrados en Sticker; temas claro/cálido marfil; otros temas preservados.
- [x] HUD con ancho máximo 720 dp, jerarquía compacta, XP dorada y vidas coral; consulta configuración real al pulsar Vidas.
- [ ] Verificación visual en todos los temas, orientaciones y tamaños de fuente.

## 03/10 — Responsive global
- [x] Política común Compact/Medium/Expanded integrada en Home, Cursos, Aprender, Perfil y Biblioteca/aportes.
- [x] Límites antes de fillMaxSize; cabeceras/paneles completos acotados y centrados.
- [x] Grids de feed con mínimo 360 dp/celda y máximo tres columnas; portadas 120 dp conservadas.
- [x] Camino Aprender único hasta 640 dp, hero Home hasta 520 dp, portada Perfil de altura existente y banner de curso con mínimo automático limitado a 180 dp.
- [x] Previews verticales proporcionales hasta 360 dp de alto en Medium/Expanded; visor completo y móvil conservados.
- [x] Matriz de geometría comprobada entre 320 y 2560 dp, incluyendo límites 600/840, foldable 720, tablet vertical 800 y horizontal 1280/1920.
- [x] Kotlin compila; cuatro pruebas adaptativas, dos de contraste sobre banners y cuatro de piloto correctas.
- [ ] Matriz visual renderizada/física y fuentes grandes: no ejecutada la app, pendiente. Tests de política no prueban recortes de cada texto ni interacción en dispositivo.

## 03/10 — Ajustes puntuales
- [x] Dos bloques Home full-span centrados sin aumentar sus límites existentes.
- [x] Etiquetas navbar móviles/tablet, constraints reales e icono hoja de examen local.
- [x] Retratos reducidos 20%; horizontales intactos; visor proporcional con zoom/pan y aumento 12% acotado.
- [x] Admin edita/agrega/desactiva avisos por actividad; worker consume la configuración y datos locales reales sin modificar progreso.
- [x] Kotlin Android y 14 pruebas pasan.
- [ ] Recorrido físico: retratos/horizontales; zoom/pan/cerrar; Home Expanded; etiquetas con fuente grande; tacto suave; guardar y recibir avisos con usuario real. App no ejecutada, config remota no publicada ni verificada.

## 03/10 — Mis errores
- [x] Fuera los seis ejemplos del estado inicial; lista vacía hasta fallos reales.
- [x] Captura real Normal/Rápido/Ranking + origen/elección/en blanco; repetir reabre sin duplicar.
- [x] Revisión completa desplegable solo Normal/Ranking al finalizar.
- [x] Modal flexible/scroll único/metadatos legibles; detalles con respuestas y explicación del banco.
- [x] Persistencia local por UID y privada remota; listener retirado al cambiar sesión.
- [x] Entrada visitante, modal privado o proyección pública readonly; opt-in/revocación sin tocar reglas remotas.
- [x] Compilación Kotlin y 12 tests pasan; consentimiento ausente/false no expone datos desde publicQuestions.
- [ ] Prueba física: móvil/tablet/fuente grande, terminar tres modalidades, cambiar entre dos cuentas, publicación/revocación y permisos remotos. No ejecutada app ni desplegadas reglas.

## 03/10 — Widgets y atajos
- [x] Cuatro PNG originales conservados y hashes comprobados; tamaños 2×1 / 4×1.
- [x] RemoteViews compartidos por providers, app y anclado; picker con previewLayout y API 35 generada.
- [x] Ajustes de Perfil abre el mismo hub de vistas previas y configuración.
- [x] Dos atajos en aliases, destinos existentes Aprender/Aportes; recepción al iniciar/onNewIntent.
- [x] Compilación Kotlin + 10 pruebas correctas; widgets-final.log.
- [ ] Comprobación física por versión/launcher, redimensionado, fuente grande y vistas; no ejecutada app.

## 03/10 — Navbar y fecha personal
- [x] SVG/etiqueta más próximos, centrado de grupo conservado, sin modificar destinos/dock.
- [x] Popup cartoon antes de anclar contador, calendario personal y selección UNSA/Previa separadas.
- [x] Nueve fechas proporcionadas, sin usar inscripciones como admisión.
- [x] Días → horas → Hoy por Lima; fecha pasada/no configurada diferenciadas; 4 pruebas nuevas.
- [x] Refresco por hora/día con una alarma no exacta y cancelación del último widget; preview visible se actualiza.
- [x] Compilación Kotlin y 14 pruebas correctas; countdown-final.log.
- [ ] Popup/calendar/navbar/actualizaciones verificadas físicamente; app no ejecutada.

## 04/10
- [x] Widgets con datos/arte en un único espacio de coordenadas; previews internos reutilizan RemoteViews real.
- [x] Fondo PNG conservado (hash verificado por WidgetIntegrationTest).
- [x] Riesgo/actividad real conectados a aliases existentes y worker, sin nuevo servicio.
- [x] Solo botón superior Fórmulas utiliza foquito.
- [ ] Comprobación física del acabado, fuentes y launcher (prohibido ejecutar app).

## 04/10 — Fondo académico experimental
- [x] Switch dentro del selector existente, solo sesión Admin autenticada/no anónima; apagado inicial y estado por UID en memoria.
- [x] Usuarios normales sin opción ni textura; fondos previos conservados en la rama desactivada.
- [x] Un Path cacheado, 14 símbolos propios, tamaño dp constante y más cantidad con más espacio.
- [x] Colores derivados de paleta, trazo suave, sin animación/blur/imágenes ni personajes.
- [x] Compilación + AcademicBackgroundTest 5 correctos; academic-background-tests.log.
- [ ] Capturas, FPS/GPU/memoria y recomposición física: pendientes por prohibición de ejecutar app. Ver FONDO_ACADEMICO_PILOTO.md.

## 04/10 — Tema adaptable e intensidad
- [x] Selector Suave/Medio/Fuerte en el tema existente; preferencia guardada/restaurada, Suave por defecto.
- [x] Intensidad limitada a Material You, fondos contenidos y roles de lectura con contraste medido.
- [x] Componentes y botones de acento corregidos; colores fijos de lectura en Academy adaptados.
- [x] Compilación y 14 pruebas correctas; theme-intensity-final.log.
- [ ] Revisión física de todas las pantallas/wallpapers/temas y tamaños; app no ejecutada por AGENTS.md.

## 04/10 — Inicio y EXP
- [x] Destacados ordena antes de seleccionar los 20 recientes.
- [x] Explora RASTRO usa altura uniforme adaptada a escala de fuente.
- [x] HUD deriva el progreso y EXP restante de la misma curva que niveles/ligas.
- [ ] Verificación física pendiente; no app ejecutada.
Detalle: ../aprender/ACTIVIDADES_ESPECIALES_Y_PROGRESION.md.

Validación final: Kotlin Android y 25 pruebas aprobadas (home-progression-special-final.log). Piloto preparado: CatalogValidator 0 errores/0 advertencias. Cobertura: 315 niveles con cuatro actividades; sanitizador sin contaminación en actividades derivadas. Revisión visual/táctil pendiente sin ejecutar app.


## 04/10 — Simulador y Amigos/Rachas
- [x] Implementación y compilación Kotlin; 11 pruebas JVM sin fallos.
- [x] Diff check sin errores; contenido académico intacto.
- [ ] Verificación física móvil/tablet/horizontal (app no ejecutada).
- [ ] Validar/publicar regla racha_dual y recorrido real con dos cuentas.
Detalle: [AMIGOS_Y_RACHAS.md](AMIGOS_Y_RACHAS.md).


## 04/10 — Bienvenida
- [x] Fuente local gordita aplicada solo al saludo/nombre; colores conservados y subrayado sutil.
- [x] Licencia incluida; compilación Kotlin y diff check correctos.
- [ ] Comprobación física de truncado con nombres largos/fuente ampliada (app no ejecutada).

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.


## 04/10/2026 — Google, amistades y racha
- [x] Google usa GetSignInWithGoogleOption; separa carga Google/correo, sin validar el formulario por pulsar Google.
- [x] Solicitudes: aceptar/rechazar y volver a solicitar, sin permitir respuesta del remitente ni terceros.
- [x] Grupos de 2–10 integrantes sobre racha_dual, invitando amistades aceptadas; aceptación individual y días compartidos solo si todos cumplen.
- [x] Compatibilidad de documentos de amistad antiguos sin participants; historial streakDays conservado y presentado por separado.
- [x] Racha personal: lección o 900 segundos en primer plano; abrir/restaurar ya no concede día.
- [x] Recuperación de continuidad antigua solo con días anteriores comprobados bajo regla antigua de 300 segundos; sin inventar huecos ni premiar 5 minutos hoy.
- [x] Restauración desde servidor antes de permitir escritura de progreso remoto; saldo de monedas remoto conservado.
- [x] 6 pruebas Firestore correctas; reglas de amigos/rachas desplegadas y contenido servidor idéntico al validado. Respaldo antes/después en build/request-friends-rules-*.rules.
- [ ] Login Google de primer toque y recorrido dos cuentas/dispositivos; no se ejecutó la app.
- [ ] Escudos de racha compartida: no hay cálculo de protección implementado; conservar campo no equivale a funcionalidad validada.


## 04/10/2026 — Mis errores y fondo por defecto
- [x] Limpiar todos los errores propios, todas las modalidades; mantiene progreso y otros documentos.
- [x] Pausar guardado por cuenta, preferencia local/remota, sin afectar práctica ni recompensas.
- [x] Cortes de limpieza impiden reaparecer cachés/proyecciones antiguas; nuevos errores se conservan.
- [x] Fondo académico inicial y fallback de preferencias activados; conserva false explícito guardado por el usuario.
- [x] Compilación y 112 tests Android correctos. Detalle MIS_ERRORES.md.
- [ ] Validación física y sincronización con dos dispositivos; no se ejecutó la app.
