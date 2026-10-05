# Cambios — 03/10/2026

Pedido de mejoras globales de UI y posterior incorporación de CodeGraph. Se instaló la CLI oficial local y se escribió una adaptación de skill porque upstream distribuye CLI/MCP, no una skill de uso independiente. Consulta de impacto de `claimExamReward`: manager compartido, Simulador, raíz de UI y LearningRewardsTest.

Cambios propios: HUD/recibo de XP, preparación de ligas y XP compartida de exámenes; feedback de cofre, Fénix y victoria; footer x2; cuadrículas principales y portadas; proporciones de previews; reportes a Admin y enlaces de perfiles/publicaciones. Documentación de uso en README y DECISIONES.

Se conservaron los cambios preexistentes en catálogos, libros y otros módulos. No se modificaron datos académicos, geometría canónica ni copias de LOGO. No se ejecutó la app, no se generó APK, no se hizo commit/push/reset.

Verificación: compilación Kotlin Android y pruebas de LearningRewards, CatalogPilotValidation, LearningArtworkPolicy, LokiAnimation, LokiRewards y RastroAppLinks. Las comprobaciones visuales y Firestore real permanecen pendientes en CHECKLIST.

Resultado: BUILD SUCCESSFUL; 30 pruebas (13 Android + 17 shared), cero fallos/errores, incluyendo cálculo ponderado de Simulador. Validator del piloto: cero errores y advertencias.

## 03/10 — Acabado cartoon
Contornos compartidos de 2 dp, capas sólidas y tarjetas HUD compactas; superficie cálida por tokens, jerarquía de datos/etiquetas y diálogo informativo de vidas. Conservados navegación, saldos y overlay XP. Validación Kotlin correcta; app no ejecutada. Véase APRENDER_ACABADO_SVG_PARA_IA.md.

## 03/10 — Adaptación global, sin rediseño
Ámbito: HomeScreen, CursosScreen, AprenderScreen, UserProfileScreen, BibliotecaScreen, UserUploadPreview, límite de altura en CourseBannerBackground y nuevo RastroAdaptiveLayout; documentación y test de política. Preservados callbacks, datos, Firebase, temas, rigs, barras, claves/índices de items y orden funcional. Sin resets/reverts ni cambios ajenos.
Corregido el orden de medición que hacía ineficaz widthIn después de fillMaxSize. Viewport/política única, cabeceras completas acotadas, feeds en columnas solo Expanded y camino Aprender centrado. Previews grandes con proporción real y altura limitada; banner de curso deja de crecer proporcionalmente sin límite.
Validación: compileDebugKotlin y 10 pruebas JVM (4 adaptativas, 2 de contraste y 4 de CatalogPilotValidationTest), sin fallos. build/global-responsive-final.log. Matriz geométrica para todos los roles de pantalla; no equivalente a prueba visual/funcional física. App no ejecutada, sin APK, commit ni push. No detección de bisagra física; sí adaptación al ancho de ventana.

## 03/10 — Correcciones puntuales de previews, Home, navbar y avisos
Ámbito exclusivo: simetría de previews de Obras; tamaño de retratos y visor de publicaciones Perfil/Aportes; callback de flechas; dos bloques de Home; nombres/icono del Simulador en navbar; háptica de preguntas; editor de avisos automáticos solicitado adicionalmente. Sin catálogos, progreso, personajes, rutas, autenticación, reglas remotas ni despliegues. Trabajo previo conservado.
Causas: títulos sin límite de líneas; retratos ocupando demasiado ancho; visor con altura forzada 280–560 dp ajena a la proporción; flechas conservando callback con índice antiguo; los dos items Home no tenían span completo; etiquetas navbar solo visibles en pantallas grandes; Simulador sin tick al seleccionar y resultados hápticos fuertes; avisos predeterminados hardcodeados por horario/inactividad sin editor.
Cambios: tres líneas reservadas en portada y dos en listado; autor/categoría/ficha una línea con ellipsis; ratio <0.9 recibe 0.8 del ancho previo; visor común proporcional con aumento objetivo 12% limitado a ventana, zoom 1–5x y pan acotado; callback actualizado con rememberLiveClick; Home span completo más RastroBoundedBlock; etiquetas en todo ancho y hoja de examen reutilizando los recursos existentes; tick breve y pulsos correct/error reducidos; avisos editables por actividad conectados al worker existente.
Validación: Kotlin Android compila; 14 tests sin fallos: geometría adaptable (4), visor (1), callback (1), banco real (1), avisos (3), catálogo piloto (4). Logs build/ui-targeted-build.log y build/ui-targeted-tests.log. Diff revisado, sin app/APK/commit/push. Pruebas táctiles, visuales, hápticas y guardado remoto no realizadas.

Archivos de esta intervención (rutas relativas al proyecto):
- androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/: BibliotecaScreen.kt, HomeScreen.kt, UserUploadPreview.kt, UserProfileScreen.kt, ResourcePreviewDialog.kt (nuevo), SimuladorScreen.kt, VocationalTestScreen.kt, AdminScreen.kt, StudyReminderEditor.kt (nuevo).
- androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/components/: AnimationModifiers.kt, RastroAdaptiveLayout.kt, LiquidNavbar.kt, DuolingoHaptics.kt, InteractiveChallenges.kt.
- androidApp/src/main/kotlin/com/jonsuapps/rastro/android/notifications/: LimaStudyReminderWorker.kt, StudyReminderTemplates.kt (nuevo).
- androidApp/src/main/res/drawable/: ic_nav_exam_outline.xml, ic_nav_exam_filled.xml. Las variantes mantienen interior legible bajo el tint monocromo de Icon.
- androidApp/src/test/kotlin/com/jonsuapps/rastro/android/: ui/components/RastroAdaptiveLayoutTest.kt, ui/screens/ResourcePreviewSizingTest.kt (nuevo), notifications/StudyReminderTemplatesTest.kt (nuevo).
- CHECKLIST.md, DECISIONES.md y CAMBIOS.md de docs/ui-principal, docs/aprender, docs/simulador, docs/biblioteca/obras.
Comprobar físicamente: portadas con títulos largos/cortos; imágenes A4/retrato y horizontales en feed/visor, zoom 1–5x/arrastre/reset/cerrar; flechas por todas las materias ida/vuelta; Home teléfono/Expanded; nombres navbar con fuente grande; tick en todos los ejercicios y preferencia desactivada; Admin guardar nuevos avisos y usuario recibirlos según fecha/horario/permisos. El worker periódico no garantiza hora exacta (restricciones de Android/WorkManager).

## 03/10 — Banco de errores real, responsive y privado
Ámbito: ErrorBankRepository, una inicialización en RastroApplication, modal/entrada de Perfil, resultado final de Simulador y captura de fallo MC en LessonEngine. Sin catálogos, respuestas académicas, puntuación, XP, vidas, rutas, personajes ni reglas remotas. Cambios previos conservados.
Causa real: repositorio con seis ejemplos precargados, singleton global sin persistencia por usuario ni llamadas desde exámenes; modal rígido de tres columnas, encabezado sin weight y badge Pendiente comprimido por metadata extensa. Se retiraron ejemplos del repositorio (no del banco académico) y se conectó la captura real al finalizar Normal/Rápido/Ranking, con origen independiente y opción elegida; preguntas en blanco también se registran. Aprender registra fallos de opción múltiple reales al comprobar.
UI: ErrorBankDialog separado de UserProfileScreen, widthIn antes de fillMaxWidth, encabezado flexible, cuatro filtros desplazables, un solo scroll para privacidad/lista, metadata y estado en líneas separadas. QuestionReviewCard reutiliza el mismo contenido en Mis errores y revisión final; colores de lectura/answerText del tema, etiqueta explícita de tu respuesta/correcta, explicación y gráfica existentes. Resolver solo marca repasado, sin XP.
Simulacro y Ranking incorporan revisión desplegable al finalizar: todas las preguntas, correcta/incorrecta/sin responder, opción propia y correcta. Rápido guarda sus errores pero no incorpora ese panel extra (pedido explícito).
Privacidad: caché y consulta privada separadas por UID; limpiar listener/estado al cambiar cuenta. Visitante siempre tiene acceso a entrada Mis errores; si privado ve modal explicativo, si compartido solo proyección pública y sin controles de dueño. Compartir es opt-in, hasta 30 errores recientes, revocable eliminando el campo público. No se consultan errores privados ajenos.
Validación: Kotlin Android correcto; ErrorBankTest (6), RankingBankTest (1), LiveClickRegressionTest (1), CatalogPilotValidationTest (4): 12 pruebas sin errores/fallos. build/errorbank-build.log y build/errorbank-tests.log. Sin ejecución de app, APK, commit/push ni despliegue. Guardado real/permisos Firebase, cambio de cuentas y revisión física pendientes.

Cierre: errorbank-final.log confirma recompilación y las mismas 12 pruebas después de reforzar bindAccount antes de cada mutación; evita depender del orden de entrega del listener Auth para guardar en la cuenta correcta. Ajuste final de indentación sin cambio de comportamiento.

## 03/10 — Widgets con vistas reales y atajos
Ámbito: cuatro providers y gestor/layouts/metadata de widgets, factory RastroWidgetViews y preview AndroidView, hub existente y acceso desde ProfileSettingsDialog; MainActivity/RastroAppLinks reciben dos acciones y aliases declaran shortcuts. Se conservan PNG originales y tamaños; fitCenter evita recorte. Contador elimina días aproximados y cuenta fecha real por calendario Lima; sin fecha muestra Configura la fecha. Atajos a Aprender/Aportes con emojis solo en mensajes. CodeGraph y Cartoon UI usados, sin dependencias nuevas, app, commit/push. Kotlin y 10 pruebas correctas: WidgetIntegrationTest 4, enlaces 2, piloto 4; build/widgets-final.log. Corregidos atributo no público de metadata y dos errores del test (comentario XML y ruta relativa) durante validación. Recorrido físico pendiente; limitaciones del picker documentadas en WIDGETS.md. Trabajo anterior preservado.

## 03/10 — Navbar y contador programable
Ámbito: espaciado interno LiquidNavbar; WidgetsAndShortcutsDialog y nuevo ExamCountdownSettingsDialog; WidgetDates, RastroWidgetViews, gestor, provider del contador y sus dos broadcasts de reloj; UnsaExamDates y test/documentación. No tocar otros widgets, PNG, destinos de navegación, contenido académico ni personajes. Gap 1 dp/lineHeight sin fontPadding centra icono+etiqueta. Antes de anclar contador se abre popup cartoon con presets suministrados o calendario personal; guardar actualiza vistas reales. Días/horas/Hoy/pasado calculados en Lima, refresco de alarma no exacta y visible en app sin permisos adicionales. CodeGraph y Cartoon UI usados. Kotlin + 14 pruebas correctas, build/countdown-final.log; sin app, commit/push. Validación física pendiente, límites de alarmas y fuente de fechas en WIDGETS.md.

## 04/10 — Widgets y logo
Acabado ilustrado con datos reales y escalado conjunto, paneles físicos cálidos/checks semanales. Actualización del icono instalado también en background; foquito solo en botón superior Fórmulas. APK/app no lanzada. Evidencia: build/widgets-reference.log, build/seven-android-tests.log y build/seven-shared-tests.log.

## 04/10 — Fondo académico solo Admin
Selector existente ofrece opción de sesión. Fondo estático de 14 símbolos lineales propios en Inicio/Aprender/Cursos/Biblioteca/Simulador/Perfil; usuarios normales conservan sus fondos. Un Path cacheado y tamaño constante en dp, tema activo. CodeGraph y Cartoon UI usados. Kotlin +5 pruebas correctas; piloto catálogo4 en academic-background-catalog.log. Sin app/emulador/dispositivo, commit/push ni cambio académico. Perfilado real pendiente, instrucciones/remoción en FONDO_ACADEMICO_PILOTO.md.

## 04/10 — Intensidad y legibilidad de temas
Agregado selector y persistencia Suave/Medio/Fuerte del tema adaptable; contraste por luminancia en paletas normales/personalizadas y roles Material. Corregidos botones/Pills/navbar y textos de acento en pantallas principales; Academy usa tokens y Destacados deja de forzar superficie blanca. Sin cambiar estructura, navegación, contenido académico ni personajes. Compilación + 14 pruebas correctas; diff check limpio. Ver TEMAS_INTENSIDAD_Y_CONTRASTE.md. Revisión visual física pendiente por prohibición de ejecutar app.

## 04/10 — Inicio y HUD
Destacados recientes primero; tarjetas de herramientas con dimensiones parejas; progreso EXP coherente con curva creciente. Compilación/pruebas en build/home-progression-special-final.log. Sin ejecutar app, commit ni push. Detalle: ../aprender/ACTIVIDADES_ESPECIALES_Y_PROGRESION.md.


## 04/10 — Simulador y Amigos/Rachas
Escudos adaptados al tema; solicitudes reales en lugar de ejemplo fijo, aceptación y avisos a ambos con nombres de usuario. Regla racha_dual preparada localmente, publicación y prueba remota pendientes. Kotlin y 11 tests JVM correctos; app no ejecutada.

## 04/10 — Tipografía exclusiva de bienvenida
HomeHeroBanner usa Lilita One local (28 KB) únicamente en saludo y nombre: formas gruesas/redondeadas, tamaños y colores actuales conservados. Subrayado corto de 1.5 dp con el mismo textSecondary al 28%; sin cambiar imagen ni fuente global.
Fuente: https://github.com/google/fonts/tree/main/ofl/lilitaone — SIL OFL 1.1, copyright Juan Montoreano. TTF en androidApp/src/main/res/font/welcome_lilita_one.ttf y licencia íntegra distribuida en res/raw/welcome_lilita_one_license.txt.
Kotlin Android compila; referencias exclusivas en HomeHeroBanner y diff check correcto. App no ejecutada; revisión visual física pendiente.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.


## 04/10/2026 — intervención solicitada
Google: opción específica y carga separada. Amigos: rechazo, reenvío, grupos sobre colección existente, avisos con nombres y días comprobados. Racha personal: 15 minutos, arranque sin premio, continuidad histórica verificable y restauración remota protegida. Se conserva historial antiguo, monedas y documentos. Compilación y 292 pruebas JVM correctas; 6 reglas Firestore correctas. Despliegue limitado a firestore:rules, con diferencia exclusiva de racha_dual frente a las reglas activas y verificación posterior idéntica. Sin app/dispositivos/APK/AAB.


## 04/10/2026 — petición adicional
Mis errores: botón general y pausa de captura. Fondo académico: default true en ThemeManager y lectura de MainActivity, sin cambiar geometría, colores ni preferencia explícita existente. ErrorBankTest añade dos comprobaciones contra caché antigua y publicación; compilación/112 tests correctos. Sin reglas nuevas, modificaciones de datos remotos ni ejecución de app. Sin APK/AAB/commit/push.
