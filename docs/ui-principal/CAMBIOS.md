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

## 08/10/2026 — Inicio, invitados y herramientas

Ámbito: acceso invitado a Perfil, Home, logo general/notificación, contador existente, tabla periódica, vista usuario Admin para probar anuncios y caducidad de Mis errores. No catálogos de lecciones, temario, firmas/versionado, publicaciones ni despliegues.

- Perfil propio: la ruta completa deriva a Auth para invitado/anónimo sin componer UserProfileScreen; el botón superior ya lo hacía. No se crea cuenta/perfil de invitado.
- Logo general de aplicación (incluidos diálogos Android que leen application.icon) y recordatorios grandes usan rastro_logo_base. Estado inicial/fallback del gestor de logo usa el mismo recurso. Iconos launcher emocionales conservados. Cachés de Android/branding remoto Google no son comprobación visual automática.
- Inicio: pista discreta y pulsable para personalizar colores, contador amplio antes de ruta de preparación; accesos parejos Tabla periódica y Ligas (liga real de progress.level). Reutiliza modal global de tabla, Ligas y preferencias del widget.
- Contador sin fecha elegida: próximo examen de Conocimientos, incluyendo hoy; excluye Previa y Aptitudes. Una fecha personalizada nunca se reemplaza. Refresco local cada minuto mientras Home está compuesto; sin red. Si se agota el cronograma, pide configurar.
- Tabla: 118 números únicos, nombres en español, propiedades de snapshot PubChem; se conservan tips existentes. Vista tradicional por grupos/períodos con dos ejes de desplazamiento y filas f separadas; lista buscable alternativa. Campos no disponibles quedan vacíos/indicados, sin inventar valencias. Detalle acotado con scroll interno para conservar espacio de tabla.

Fuentes: https://admision.unsa.edu.pe/cronograma-de-admision-2027/ y https://pubchem.ncbi.nlm.nih.gov/rest/pug/periodictable/CSV (consultadas 08/10/2026). PubChem AtomicMass no equivale necesariamente a peso atómico estándar: para elementos sin isótopos estables puede representar masa de referencia. Valores transuránicos pueden ser estimados; no presentarlos como mediciones experimentales garantizadas.

Validación: 149 pruebas Android, cero fallos/errores/omitidas; lintVitalRelease correcto. compilar_app.bat/assembleDebug correcto. Sin ejecutar APK ni cambiar versión/crear AAB/publicar. Matriz visual física pendiente.

## 08/10/2026 — Acabado de Home, tabla y temas

- Retirada la pista textual sobre la paleta. Herramientas Home usan vectores opacos de colores y contorno, sin cuadros de fondo: recursos académicos y de ligas existentes. Simulador utiliza una variante de color del vector de examen existente; no cambia el icono en otros lugares.
- Contador: tarjeta con bisel, calendario crema/dorado con contraste oscuro, número dominante y botón Elegir mi examen. Fecha y lógica existentes intactas.
- Tabla: selector explícito Tabla/Lista con estado seleccionado, zoom por botones/pellizco 60–225%, reset 100%. El zoom cambia las dimensiones de las celdas y sus límites de scroll; desplazamiento con un dedo, gesto de dos dedos consumido solo para zoom. Datos de 118 elementos conservados.
- Causa de apertura del editor: CustomThemeEditorDialog estaba dentro de un item de LazyVerticalGrid; composición dependía de visibilidad de ese item. Ahora es diálogo independiente del listado, activación inmediata del estado. Tres colores reales: Fondo/ Tarjetas/ Acento; campo heredado custom_highlight se conserva como compatibilidad al guardar. Vista previa usa onColor para contraste, sin segunda arquitectura ni cambios a preferencias existentes hasta Guardar.
- Ligas: filas con cantidad de columnas según ancho, tarjetas iguales y última fila centrada; podio con tres columnas de igual ancho y nombres acotados/centrados. EXP, participantes y consultas intactos.

Validación: 150 pruebas Android, 0 fallos/errores/omitidas; lintVitalRelease correcto (home-polish-validation.log). compilar_app.bat/assembleDebug correcto (home-polish-assemble.log). Vector XML válido y git diff --check correcto. No ejecución APK, emulador, publicación ni cambio de versión. Pendiente prueba física de pinch/scroll/selector/editor, modo claro/oscuro y fuentes grandes. No afirmar latencia medida ni segundo toque comprobado físicamente.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

Contador de examen compacto (calendario de 78 dp, edición en la misma tarjeta); ruta ondulada dibujada en Canvas con tres estrellas sobre sus coordenadas. Redes del Perfil solo con enlace no vacío, botones físicos y distribución que admite varias filas. Fórmulas con subíndices tipográficos y fracciones dimensionadas al contenido. Guardados del Perfil integra fórmulas y mnemotecnias mediante los almacenes existentes, filtro Estudio; los nuevos guardados no se muestran al consultar otro perfil.

Validación: 153 pruebas Android sin fallos/errores/omitidas y lintVitalRelease correcto (build/sections-final-validation.log). Compilación/paquete debug verificados por separado. No se ejecutó app, dispositivo o emulador, ni se publicó una versión. Pendiente revisión física de tamaños, orientación, fuente ampliada y temas.

La franja de WhatsApp de Inicio también exige enlace configurado; eliminado el canal de relleno. Empaquetado final correcto: build/sections-home-final.log. Validación anterior: build/sections-complete.log (153 pruebas y assembleDebug), build/sections-final-validation.log (incluye lintVitalRelease).


## 08/10/2026 — Refinamiento solicitado

Iconos sólidos y nueva carpeta de Biblioteca; insignias del perfil mantienen el fuego existente. Días pasados sin actividad: guion y borde continuo; futuros: borde discontinuo. Contador compacto con número y unidad en línea. Portada opcional en Inicio con switch; editor arrastrable, zoom y controles de posición. Modelo de cuenta existente extendido, sin nueva colección ni observadores. Misma proporción de Inicio en la vista previa. Guardar confirma imagen/encuadre; cancelar no publica el borrador.


## 08/10/2026 — Iconos, revisión y regalos

Aportar/Aportes separados; Fórmulas con Σ, Ligas con copa y fuego original en Racha. Aprender/Cursos distintos; carpeta Biblioteca opaca. Formulario ampliado a 32 fórmulas/37 mnemotecnias con enlaces explícitos y notación serif/fracciones. Ver AJUSTES_2026-10-08_ICONOS_FORMULAS_Y_SIMULADOR.md.


## 08/10/2026 — Aviso opcional de actualización

Aviso temático con bisel RASTRO situado encima de LiquidNavbar; entra desde abajo y sale al cerrar. X y Cerrar descartan el aviso; Actualizar abre directamente market://details de este paquete en Google Play, con enlace HTTPS de respaldo si no está instalada la tienda. No fuerza instalación, descarga ni reinicio.

Disponibilidad consultada con Google Play AppUpdateManager, biblioteca oficial app-update 2.1.0. Solo muestra UPDATE_AVAILABLE con versionCode superior al instalado; nunca compara textos de versión ni usa un número supuesto de Play. Error/sin conexión/instalación no reconocida: aviso omitido. Consultas al crear RastroApp, caché de seis horas en proceso; sin Firebase, listeners ni tareas periódicas. Cerrar recuerda la versión por 24 horas; una versión posterior no hereda el cierre.

Se muestra en Inicio, Aprender (selector), Cursos, Biblioteca y Perfil. No se muestra en lecciones, examen, login ni Admin. No añade rutas ni altera autenticación, pagos, gamificación o catálogos.

Referencia oficial: https://developer.android.com/guide/playcore/in-app-updates/kotlin-java
Prueba de disponibilidad real requiere una instalación y cuenta elegibles en Google Play, con una versión superior publicada en su canal. Una compilación local no demuestra que exista tal actualización.
Validación final: 163 pruebas Android y lintVitalRelease correctos; compilar_app.bat terminó BUILD SUCCESSFUL. No se lanzó ni instaló la app y no se publicó en Play. Registro: build/optional-update-final.log y build/optional-update-assemble.log.

## 08/10/2026 — Accesos y comunidad

Más → RASTRO Pro reutiliza el diálogo de compras existente y corona sticker actual. Inicio muestra Comunidad RASTRO con canal oficial indicado por el propietario, fijo para todas las cuentas/invitados; no utiliza canal personal ni dice Tu canal. Gestión extensa Pro y códigos se mueve a popup Admin sin nueva navegación.
