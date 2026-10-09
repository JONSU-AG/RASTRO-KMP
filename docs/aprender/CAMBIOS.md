# Cambios — UI global de Aprender

## 04/10/2026 — Comparación documental UNSA 2027

Revisadas 45 páginas escaneadas de RCU-0028-Aprobacion-de-TEMARIO-y-MATRIZ-ADMISION-2027 (1).pdf mediante OCR y lectura visual. Nuevo documento raíz `TEMARIO 2027 UNSA ADMISION.md`: siete ejes, veinte componentes, temas/subtemas y comparación por componente. Confirmadas omisiones de Literatura y subtemas, ampliaciones no literales y errores de pesos en el MD anterior (Biología y Geometría de Sociales); registrada diferencia mínima de Física Ingenierías en código, sin editarlo. Los MD anteriores mantienen sus hashes. Cambios exclusivamente documentales; no requiere compilación ni pruebas del motor, que no se modificó.

## 02/10/2026

Implementada integración de Classic nativo, emociones, salida tierna, Ayuda sin
personaje en el panel incorrecto y con una sola acción en el modal; resultados
del laboratorio con datos reales; secuencia de explosión de 5,1 s y audio sincronizado;
cofre animado con partículas/XP y trofeo solo para tema completado.

Ruta con nodos/trazo ampliados y pulso suave; Home y pantalla de Racha reutilizan
R-MINI/R-MEDIO y Classic Racha. Flashcards adaptan cada cara sin chip decorativo.
Corregidos tokens de teoría/popup y contraste de respuestas/botones.

Archivos: `androidApp/build.gradle.kts`; componentes `LearningArtwork.kt`,
`LearningColors.kt`, `ChestXpParticles.kt`, `LessonContentRenderer.kt`,
`LessonPresentationPopup.kt`; pantallas `AprenderScreen.kt`, `LearningTrail.kt`,
`LessonEngineScreen.kt`, `CourseFlashcardsDialog.kt`, `HomeScreen.kt`,
`DiasDeRachaScreen.kt`; opción de tema en `loki/LokiRewardCanvas.kt`; prueba
`LearningArtworkPolicyTest.kt`. No cambios propios en shared, catálogos ni Firebase.

Compilación Kotlin Android y pruebas de políticas: BUILD SUCCESSFUL.
Pruebas: 62 del Laboratorio Loki, 3 de políticas de integración, 8 de recompensas
y 4 de validación del piloto pasaron (77 en total, sin fallos ni errores).
No se ejecutó la app, no se generó APK, no se hizo commit/push/reset.
La revisión visual interactiva queda indicada en CHECKLIST, sin darla por comprobada.

## 03/10/2026 — Correcciones finales verificadas

- Crash real: IOException de MediaPlayer.prepare al reproducir OPCIONES; efecto corto ahora en SoundPool asíncrono, otros sonidos con prepareAsync y errores confinados al audio.
- Idea nueva usa Artyon Classic dentro de la teoría existente, sin rutas nuevas.
- Semanal: R-MEDIO principal, siete bolitas sin R-MINI por instrucción posterior del usuario. Mensual: número seguido de R-MINI animado y cabecera con wrap.
- Obras: textos completos, roles debajo del nombre, ancho restante explícito, acciones con wrap e interlineado proporcional; Seguir centrado.
- Prueba real en teléfono: inicio de lección hasta primera pregunta sin cierre; Obras Cálido/Oscuro y fuente 17 sp; Seguir; toque en bolitas abre mensual. Build final y tres pruebas de políticas pasaron.
- Detalles, evidencias y límites en CORRECCIONES_OBRAS_RACHA_LECCIONES.md. Los cambios existentes fuera de este ámbito se conservaron.

## 03/10 — HUD y recompensas compartidas

HUD fijo, XP visible viajando al nivel, ligas iniciales, saldo compartido con Simulacro, celebraciones uniformes, Fénix noqueado y estrellas grandes. Explicación morada separada de reportes; reportes de preguntas reutilizan la bandeja real de Admin. CodeGraph aplicado para revisar dependencias. No se ejecutó la app; comprobación visual/Firestore pendiente. Ver [detalle](../ui-principal/CAMBIOS.md).

## 03/10 — Relacionar, Completar teoría y clasificación de emociones

Añadidos `ChallengeInteraction`, `MatchAnswerState`, `ChallengeBlank` y componentes `InteractiveChallenges`; conexión en `LessonEngineScreen`, mapper JSON existente y `CatalogValidator`. Parejas correctas bloqueadas y coloreadas; varios huecos con opciones dentro del texto. Respuestas se reinician por reto/Fénix. No se creó otro sistema de XP/progreso ni se insertaron preguntas académicas.

`LearningArtworkResolver` aplica la clasificación por estrellas y variedad local (máximo dos consecutivas), con excepción de explosión confirmada. Retirados personajes fijos de estudio/idea nueva; misma geometría y animaciones Classic existentes.

Guía de datos y rutas: `APRENDER_EJERCICIOS_PARA_IA.md` junto a `SKILLS_GUIA.md`. CodeGraph sincronizado y análisis de impacto de interacción guardado en `build/`.

Validación final: `:androidApp:compileDebugKotlin`, pruebas Android de políticas/Classic (28) y shared de interacción/recompensas/piloto (19): 47 pruebas, cero fallos/errores. CatalogPilotValidationTest pasa con cero errores/advertencias y prueba de AcademicSanitizer negativa. `git diff --check` sin errores; cambios previos ajenos conservados. No se ejecutó app ni se generó APK. Revisión visual pendiente.

## 03/10 — Acabado cartoon y SVG por tema
Tokens CartoonFinish, paletas clara/cálida marfil, contornos y capas físicas comunes; HUD compacto con información real de vidas; cabeceras con jerarquía y 114 SVG locales para el camino. CodeGraph revisó LearningTrail y sus dependencias. No se cambió navegación, contenido académico ni personajes. Compilación Kotlin y pruebas resolver/vidas/piloto pasan; recursos XML/SVG parseados y claves verificadas. Revisión visual pendiente, sin lanzar app ni APK. Guía en APRENDER_ACABADO_SVG_PARA_IA.md.

## 03/10 — Corrección puntual responsive y semántica

Ámbito: LearningProgressHud, TopicHeading en LearningTrail y TrailIllustrations; pruebas y documentación relacionadas. Sin cambios de temas/paletas, navegación, catálogo, progreso ni personajes. Sin nuevos recursos.

Causa HUD: pesos fijos 1/1.8/.9/1.2 dejaban poco ancho para Truquitos después de descontar icono y padding. Ahora se mide texto real con TextMeasurer y LocalDensity (incluye escala de fuente), se reserva el ancho necesario y se da a XP más espacio sobrante. Si no cabe la composición horizontal, los iconos pasan encima y XP separa nivel/dato en líneas completas; si tampoco cabe con fuente de accesibilidad grande, se usan dos filas en el mismo orden. Etiquetas de una línea sin partir palabras; tablet conserva fila horizontal, máximo 720 dp. No se redujo la fuente del HUD. Verificación visual física pendiente.

Cabecera Tema: icono 40→28 dp, padding vertical 12→6 dp, espacios 5→2 dp; chip y resumen juntos, título máximo dos líneas, progreso debajo; retirado contador duplicado lateral. Sin altura rígida; conserva datos y títulos existentes.

Causa SVG: fallback Biología incluía pez/ave/hueso y otros conceptos no equivalentes; faltaban reproducción/endocrino/excreción y reglas específicas tenían menor prioridad que conceptos generales. Biología ahora tiene familias por concepto y resuelve primero título, después subtema; fallback neutro de microscopio/célula. Prioridad semántica sobre variedad. Estado y hash estable conservados. Invertebrados antes coincidía con vertebrados; corregida precedencia.

Semana 10 comprobada con catálogo real: bio_t10_s01→microscope, s02→bubbles, s03→network, s04→circle-dot (célula/gameto, no pez). Otras familias corregidas: tejidos, sistema endocrino, excretor y objeto de estudio. No se editó contenido académico.

Validación: compileDebugKotlin correcto; TrailIllustrationsTest (7) y CatalogPilotValidationTest (4) sin fallos; piloto valida cero errores/advertencias y contaminación negativa. Sin ejecutar app, generar APK, commit ni push. Evidencias en build/responsive-fix-final.log y XML de tests.

## 03/10 — HUD compacto con altura uniforme
LearningProgressHud usa la misma altura para Racha/Nivel-XP/Vidas/Truquitos: base 48 dp, ajustada solo por la altura de línea medida con la escala de fuente. Icono junto al dato, segunda línea para etiqueta/XP; barra XP anclada abajo sin aumentar esa tarjeta. LineHeight explícito 14/12 sp evita heredar espacios de tipografía grande. Mantiene ancho medido, prioridad XP y adaptación excepcional a dos filas para fuentes grandes. Colores, acciones, recuperación de vidas y entrega XP intactos.

CodeGraph y skill compose-playful-cartoon-ui aplicados. Kotlin Android compila y cuatro pruebas CatalogPilotValidationTest pasan (cero errores/advertencias y contaminación negativa). App no ejecutada, sin APK/commit/push. Verificación visual física pendiente. Log: build/compact-mobile-final.log.

## 03/10 — Fuente única de banners de materias
Ámbito local: androidApp/build.gradle.kts, AprenderScreen.kt y ui/components/CourseBannerBackground.kt. Se registra LOGO/BANNER-CURSOS directamente como sourceSet assets de Android. No copia manual en drawable ni edición de PNG. El merge de Gradle incorpora contenido actualizado automáticamente al recompilar con el mismo nombre. CourseBanners relaciona 20 IDs estables con nombres reales, incluyendo BIOLOGIA.png y COMPRENSION-LECTORA.png.

CourseBannerSurface decodifica el asset en IO con estado por filename; usa Crop/CenterEnd, mínimo panorámico derivado de dimensiones reales para no recortar verticalmente las caras en pantalla ancha y overlay negro 18% solo a la izquierda. Carga ausente/corrupta conserva el degradado anterior sin crashear. Mantiene contenido Compose dinámico, progreso y callbacks Fichas/Temas/Guía. Información principal ocupa 65% izquierdo; botones siguen abajo.

Se retiraron exclusivamente dos llamadas ClassicArtwork del banner grande en AprenderScreen. Ningún archivo/rig de personajes fue modificado. No se tocaron catálogo, nodos, filtros, navbar, Firebase ni otras pantallas.

Validación: mergeDebugAssets + compileDebugKotlin BUILD SUCCESSFUL. 20 materias comprobadas contra IDs del catálogo y 20 hashes SHA-256 de PNG empaquetados coinciden exactamente con los originales. PNG no editados; sin dependencia nueva. App no ejecutada ni APK/commit/push. Revisión visual física pendiente. Evidencia: build/course-banners-build.log.

## 03/10 — Legibilidad del banner, intervención puntual
Ámbito: CourseBannerBackground.kt, únicamente la llamada de progreso del banner y colores de ActionPill en AprenderScreen, test de contraste y documentación. Sin modificaciones en LearningTrail, temas globales, PNG, layout, dimensiones, Loki, datos ni navegación. Trabajo paralelo conservado.
Protección localizada dependiente de zonas visibles del PNG y tema activo, suave hacia personajes/parte inferior. Track/progreso independientes del fondo; controles mantienen translucidez con texto/icono/borde legibles.
Validación cuantitativa: CourseBannerContrastTest (2 pruebas), 20 banners muestreados en claro/oscuro, incluidos claros/oscuros/coloridos, controles y progreso en 11 temas. CatalogPilotValidationTest (4 pruebas) correcto y compileDebugKotlin correcto; build/banner-contrast-final.log. No se afirma validación visual física: app no ejecutada; pendiente confirmar en dispositivo. Sin commit/push.

## 03/10 — Responsive compartido
AprenderScreen usa viewport común de 640 dp; CourseBannerSurface acota altura mínima por proporción a 180 dp. Sin cambios en LearningTrail, lógica, datos, acciones ni imágenes. Documentación global en docs/ui-principal. Pruebas adaptativas/contraste y piloto pasan; validación física pendiente.

## 03/10 — Ocultar HUD en la actividad
Retirada LessonEngine de hasLearningHud en RastroApp para evitar distracciones al responder. Indicadores conservados en las pantallas de Aprender; sin cambios de saldo, racha, XP, preguntas o progresión. Compilación Kotlin correcta y CatalogPilotValidationTest correcto. Sin ejecutar app, APK, commit ni push; validación física pendiente.

## 03/10 — Flechas de materias y tacto delicado
Causa encontrada: Sticker3dCircleButton conserva callback inicial en pointerInput(enabled); tras pasar Biología/Física, enabled puede no cambiar y el índice capturado queda obsoleto. Ahora usa el mismo rememberLiveClick comprobado en el Simulacro. Sin parches por materia ni cambios de orden/catálogo/ruta/scroll. Matching y FillTheory añaden tick suave por opción; correct/error compartidos reducen duración/amplitud. Compilación y regresión del callback correctas; recorrido físico pendiente.

## 03/10 — Registro de fallo MC real
Única modificación LessonEngine: al comprobar una alternativa incorrecta, añadir FailedQuestion real con ID de lección/reto, alternativa seleccionada y datos del reto. Sin modificar respuestas, validación, vidas, EXP o contenido. No serializar Relacionar/Completar teoría como alternativas inventadas. El diseño/persistencia del banco está documentado en docs/ui-principal.

## 03/10 — Combo de lecciones
Ámbito: LessonEngineScreen, nuevos LessonCombo.kt/LessonComboUi.kt, dos tests y documentación Aprender. Indicador pequeño 2..5 en cabecera; estado guardable con deduplicación; 4 → 5 activa el placeholder Loki Classic Enamorado durante 1.6 s, sin repetir mientras continúa en 5. Avanzar/fallar cancela y el plazo restaura la apariencia previa. No modifica validación académica ni vidas/recompensas. CodeGraph usado para localizar integración. CompileDebugKotlin y 10 pruebas correctas; log build/lesson-combo-validation.log. Corregidos import de mutableLongStateOf e inferencia de assertEquals en el test durante la validación. Trabajo previo conservado, sin app/dispositivo, commit o push. Validación física pendiente; ver COMBO.md.

## 04/10
HUD Monedas sustituye Truquitos y muestra saldo real + explicación. GamificationManager/Repository serializan coins y earnedCoins; 3 tests de primer premio, repetición/mejora, skipped y snapshots antiguos. Resultado final sin scroll, personaje/estrellas prioritarios y score compacto; no personaje rediseñado. Tests: build/seven-shared-tests.log (25), compile/Android build/seven-android-tests.log. Visual real pendiente por prohibición de ejecutar app.

## 04/10 — Recompensas y matriz UNSA
EXP y monedas independientes; replay 20% EXP y 2 monedas/estrella; earnedCoins registra el premio base para migración incremental idempotente. Compilación y 25 pruebas correctas; sin app ejecutada ni commit/push.
Detalle vigente: [RECOMPENSAS_MONEDAS_EXP.md](RECOMPENSAS_MONEDAS_EXP.md). Sustituye políticas anteriores incompatibles.

## 04/10 — Niveles más exigentes y actividades especiales
Curva 200 EXP inicial +50 por nivel, umbrales de ligas 0/1100/3600/12350/26100 y HUD coherente. Preparación determinista de Completar/Relacionar en Lesson Engine usando preguntas/teoría locales; sin editar catálogos. Banner conserva estructura con menor overlay y contorno ligero. Validación: build/home-progression-special-final.log y ACTIVIDADES_ESPECIALES_Y_PROGRESION.md. Sin app, commit ni push.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.

### Bloqueante académico heredado confirmado
CatalogValidator registró 182 enunciados duplicados y 14 advertencias de cantidad en los 50 niveles complementados, con las mismas incidencias antes y después de ampliar teoría. Fuente/evidencia: VALIDACION_CATALOGO_2027.md y build/complement-catalog-validation.txt. No se corrigió el banco entero ni se debilitó el validador: la corrección de teoría se terminó, y la ampliación a preguntas ajenas se detuvo conforme a AGENTS.md:114. Requiere fuente académica verificable/nueva intervención sobre esos bancos. El piloto de Biología y los complementos de letras indicados en el reporte sí están limpios.

## 04/10 — Confirmación física posterior

Propietario confirma: «ya no se cierra la app en los niveles». GP-01 cerrado en checklist raíz. No se extiende la confirmación a todos los recorridos ni a aceptación académica global. Solo actualización documental, sin cambios de código.


## 04/10/2026 — ámbito solicitado por usuario
Resultado compacto: tarjetas XP/monedas con conteo; relaciones locales 4–6 y feedback de error; Play en nivel actual. Se conservan personaje, estrellas y altura. Todos los catálogos reales pasan la comprobación 4..6 y contaminación local; compilación/tests correctos. Sin cambios de contenido académico ni archivos de Loki en esta intervención. No APK/AAB ni ejecución física.


## 04/10/2026 — petición de respuesta táctil
Ámbito exclusivo del resultado final de Aprender y funciones específicas agregadas a DuolingoHaptics. Contadores antes solapados 0,23 s: ahora completan en serie con cinco pulsos suaves cada uno; estrella ganada tiene pulso corto más marcado en su impacto. Sin cambios de dimensiones, contenido, progresión, otras pantallas ni Loki. Tres pruebas nuevas más la suite Android (110) y compilación pasan. No APK/AAB, ejecución de app, commit o push; sensación física pendiente del propietario.


## 04/10/2026 — ajuste puntual de score final
Solo LearningArtwork.kt y documentación: resultado compacto a1,3×, etiquetas/números con Lilita One gruesa existente y tarjetas más marcadas según tema. Sin modificar tamaños de fuente, padding, orden, datos reales, recompensas, personaje, archivos Loki u otras pantallas. Compilación y112 pruebas Android pasan. App no ejecutada; sin APK/AAB, commit ni push.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Pro duplica XP/monedas de estudio y evita consumir vidas, sin alterar estrellas o racha. Máximo inicial 15 y regeneración 30 min; comprar vidas desde Monedas. Eliminada recarga al terminar lección; entrada bloqueada solo a cero y sin Pro, no interrupción del nivel en curso.
Detalle y estado real: docs/monetizacion/README.md.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

## 08/10/2026 — operación local y consumo reducido

Ver ../sincronizacion/README.md para el ámbito y límites. Progreso personal local, respaldo explícito/semanal, actividad agrupada, playlists por consulta y foto compartida por autor. UI de vidas/packs/Pro conserva componentes Sticker3d. Sin publicación ni ejecución de app.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

Selector y encabezados usan mapeo vectorial propio para las veinte materias. Añadidos Comprensión Lectora, Álgebra, Geometría, Trigonometría e Historia del Perú; los IDs reales de Aritmética e Historia Universal ya no caen en el icono de Inglés. Recursos opacos y contorneados, sin tintado por tema.

Validación: 153 pruebas Android sin fallos/errores/omitidas y lintVitalRelease correcto (build/sections-final-validation.log). Compilación/paquete debug verificados por separado. No se ejecutó app, dispositivo o emulador, ni se publicó una versión. Pendiente revisión física de tamaños, orientación, fuente ampliada y temas.


## 08/10/2026 — Refinamiento solicitado

Solo Historia Universal, Biología y Física cambian su icono de banner/selector por vectores rellenos opacos. Catálogos, preguntas y SVG del camino no se modificaron.
