# Cambios — UI global de Aprender

01/11/2026: presentación matemática y siete gráficos en diez lecciones de Física. Alcance, arquitectura y pruebas en ../formulas/. Catálogos, preguntas, progreso y rutas conservados. Suite Android y assembleDebug correctos; revisión física pendiente.

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

01/11/2026: muestreo de 60 niveles/20 materias y búsqueda estructural de rellenos. Ver AUDITORIA_MUESTRA_2026-11-01.md. Física 1.1 corregida con fuentes, mismos diez IDs más c11, y fixtures equivalentes. Validador: cero errores/cero advertencias; sanitizador sin contaminación. Presentación matemática extendida a prosa y otras superficies académicas. Los problemas del resto del banco no se declaran resueltos.

01/11/2026: mejorada presentación de tablas y reserva finita de exposición. Solo dos listas de teoría Física 1.1 cambiaron a Markdown tabular; datos, claves y demás catálogos conservados. Ver ../exposicion/.

01/11/2026 — Presentación académica compartida: limpieza visual de emojis decorativos conservando símbolos científicos; rótulos promocionales de examen sustituidos por «Importante», con tarjeta ámbar adaptada a claro/oscuro. Listas homogéneas de 3–8 conceptos con definiciones completas pueden mostrarse en tabla; entradas incompletas o ambiguas conservan su formato. Integrado en teoría, fórmulas y tarjetas de repaso. No se editó contenido fuente ni respuestas en esta intervención. Diagramas existentes conservados; no se inventaron gráficos para materias sin una correspondencia comprobada.

01/11/2026 — Formato enriquecido de teoría: negritas azules para conceptos explícitos, cursivas violetas y subrayado verde azulado mediante <u>texto</u>; paletas propias claro/oscuro. Etiquetas al comienzo de definiciones se destacan sin inferir palabras clave dentro de párrafos. Primera columna de tablas con énfasis; listas existentes conservadas. AcademicText activa theoryStyle solo desde el lector de teoría; las preguntas no reciben estos colores. Motor local usa nodos DOM seguros y conserva fórmulas dentro del énfasis; no interpreta HTML arbitrario. Las seis tablas propuestas por Antigravity siguen como propuestas sin aplicar a las fuentes.

Validación: assembleDebug y 200 pruebas Android correctas, cero fallos/errores (build/theory-rich-style.log). Motor aislado a 360 px claro/oscuro/letra grande: negrita, cursiva, subrayado, fórmulas y tablas correctos, sin errores JS ni peticiones externas (build/scientific-math-browser-report.json); muestras theory-style-light/dark.png. Android no ejecutado: revisión física pendiente.

01/11/2026 — Resoluciones reproducibles y esquemas: ResolutionPlayback en ejemplos, explicación de Aprender y visor compartido de Mis errores/revisión. Controles manuales/automáticos, pausa en segundo plano, texto original conservado. Dos construcciones geométricas por encabezados comprobados (triángulo y radio–tangente), separadas de los ejercicios. Esquemas opcionales solo a partir de listas explícitas. Cobertura y pendientes en ../formulas/REPRODUCCION_Y_COBERTURA.md. No se generaron deducciones ni se tocaron fuentes académicas.

01/11/2026 — Ajuste de prácticas y racha según capturas. RastroApp oculta únicamente la barra inferior en la ruta LessonEngine; cabecera superior y demás destinos conservados. ChallengeQuestionView reserva el alto real del pie de comprobación/feedback mediante Column y área desplazable con weight, en lugar de superponerlo con un margen fijo de 140 dp. Días de racha elimina insets duplicados (Scaffold ya los aplica), aumenta fuego de 52 a 88 dp, compacta calendario/espacios y conserva datos, meses y compartir. Sin scroll con altura disponible >=680 dp y fontScale <=1.25; respaldo desplazable con menos espacio o letra ampliada. Esto requiere validación física de ajuste; app no ejecutada.

01/11/2026 — Bloque académico 01: Trigonometría 1.1 y Geometría 3.1/7.1; 30 IDs conservados, 24 rellenos sustituidos, seis preguntas completadas/corregidas y c11 añadido por nivel (33 en total). Resoluciones completas, fuentes documentadas y siete giros con valor angular explícito. No se reconstruye por suposición la relación perdida de Trigonometría c02: se reemplaza expresamente el ejercicio. Ver REVISION_ACADEMICA_BLOQUE_01.md. Conteo de patrones genéricos restantes: 1.330; revisión completa pendiente.

01/11/2026 — Bloque 02: 22 preguntas de Álgebra 1.1/1.2, con datos completos y resoluciones, y 24 preguntas de razonamiento con alternativas duplicadas corregidas. Diagrama de Venn reproducible para cuatro operaciones. Auditoría estructural del árbol completo: 20 materias, 418 niveles, 4.342 preguntas; 1.453 preguntas con alertas ampliadas, frente a 1.321 coincidencias del patrón histórico. No se consideran conteos equivalentes ni validación académica exhaustiva. Estado y fuentes en REVISION_ACADEMICA_BLOQUE_02.md y estado/AUDITORIA_ESTRUCTURAL_TOTAL.md. Casillas de cierre real en CIERRE_POR_NIVEL.md.

01/11/2026 — Bloque 03: 66 preguntas de Química 1.1/1.2, Física 2.1/2.2 y Aritmética 1.1/1.2. Sesenta IDs anteriores conservados y c11 por nivel. Teoría: cierre local de casos, precisión de Carroll, conversiones de temperatura y cambios físicos/nucleares. Nuevo gráfico de densidad; Venn y proyectil reutilizados solo en secciones pertinentes. Fuentes y cálculos documentados en REVISION_ACADEMICA_BLOQUE_03.md. Auditoría: 4.348 preguntas, 1.419 alertas ampliadas; revisión total pendiente.

01/11/2026 — Claridad de teoría y mapas. Vista de aprendizaje sin fichas administrativas/ponderaciones oficiales; preserva puntajes dentro de ejercicios y medias ponderadas. Nuevo lector gráfico de nodos/conexiones para los 111 Mermaid actuales y un esquema de materia, con fuentes no compatibles conservadas. Títulos y ramas usan notación científica; ya no se separan coordenadas por comas. Corrección del detector que trataba «en +x» como fórmula, y agrupación de matrices con fallo local si falta cierre. Teoría de vectores 1.1/1.2 aclarada con símbolos y ejemplo antes de generalizar; preguntas intactas. Ver ../formulas/CLARIDAD_TEORIA_Y_MAPAS.md.

02/11/2026 — Práctica Álgebra 02–16: 330 ejercicios en 30 niveles, datos completos, cuatro alternativas distintas y tres pasos explícitos. Se conservan 300 IDs y se añaden 30 c11. Cinco modelos por nivel con variantes comprobadas, sin atribución a exámenes oficiales. Teoría y catálogo Kotlin legacy no modificados. Ver algebra/REVISION_PRACTICA_02_A_16.md. Auditoría total: 4.378 preguntas, 1.141 con alertas; no se declara revisión completa.

02/11/2026: práctica de los 21 niveles pendientes, 231 ejercicios distintos (189 cálculos exactos contrastados y 42 conceptuales). Se conservan 210 IDs y se añade c11 por nivel. Sin cambios en los bancos de 1.1 y 2.1/2.2; hashes en build/physics-pending-proofs.json. Fuente y fixtures equivalentes. Corregidas en teoría 7.2 la atribución del balance de calor a la ley cero, las condiciones de mezclas con hielo, la dilatación de agujeros y la conversión exacta de 20 °C a 293.15 K. Sin ejecutar ni publicar Android.

02/11/2026: revisada la práctica pendiente de Física y Trigonometría: 484 ejercicios en 44 niveles, con resoluciones en tres pasos compatibles con el reproductor existente. No se agregan dibujos particulares para cada ejercicio. Detalle y límites en docs/aprender/fisica/REVISION_PRACTICA_PENDIENTE.md y docs/aprender/trigonometria/REVISION_PRACTICA_PENDIENTE.md. Conteo vigente global: 4.422 preguntas, 770 con alertas automáticas; no tener alertas tampoco equivale a certificación académica.

02/11/2026: práctica pendiente de Geometría revisada: 220 ejercicios en 20 niveles, sin alterar los pilotos 3.1/7.1. Resoluciones por pasos compatibles con el reproductor, sin gráficos individuales nuevos. Informe en docs/aprender/geometria/REVISION_PRACTICA_PENDIENTE.md. Auditoría global vigente: 4.442 preguntas, 570 con alertas. Sin alertas no equivale a validación académica de todo el contenido.

02/11/2026: práctica pendiente de Aritmética revisada: 264 ejercicios en 24 niveles; 1.1/1.2 conservados. Informe: docs/aprender/aritmetica/REVISION_PRACTICA_PENDIENTE.md. Resoluciones reproducibles en tres partes, sin nuevos gráficos individuales. Auditoría global: 4.466 preguntas, 458 con alertas. La teoría y los demás bancos no se declaran certificados por ausencia de alertas.

03/11/2026: acompañantes de teoría corregidos globalmente. Eliminado el fallback de ADN para categorías sin dibujo. Selección por materia y contexto; 22 claves con representación explícita, máximo una por sección y tres distintas por lección, separadas por al menos una sección. Autor y Fundamento no generan imagen por sí solos. Comprobación de las 20 materias y recorrido de las 418 teorías. assembleDebug y 499 pruebas repetidas correctas (302 Android y 197 shared), cero fallos, errores u omitidas. Log: build/academic-companions-validation.log. Informe: docs/formulas/ACOMPANANTES_POR_TEMA_2026-11-03.md. Inspección visual física pendiente; Android no ejecutado ni publicado. Bancos, recursos académicos y progreso sin cambios en este lote.

## 03/11/2026 — Material y revisión local

Material sustituye Guía; consulta las lecciones y preguntas existentes con filtros, índice y lectura continua. Incorpora cuatro SVG y un corazón 3D opcional con licencias por archivo. No modifica contenido académico, respuestas ni gamificación. Ver `docs/material/INFORME_2026-11-03.md`; cambios locales, sin publicación ni modificación de Firebase remoto.


## 03/11/2026 — Corrección de las capturas de Material y pizarra

Se corrigió el documento inicial del visor mediante HTTPS local interceptado. Material conserva su curso, usa desplegables y oculta créditos/revisión hasta solicitarlos. La teoría de los niveles incorpora la misma biblioteca; los avisos se reúnen en Importante. La pizarra nativa se integra junto a preguntas/material con resaltado y desplazamiento; herramientas de Pizarra libre visibles encima del lienzo. Se preservan fuentes, bancos, respuestas, recompensas y Firebase. Ver docs/material/CORRECCIONES_CAPTURAS_2026-11-03.md para pruebas y límites físicos.


## 03/11/2026 — Preguntas y pizarra de pantalla completa

Cabecera y progreso únicamente durante las preguntas. Pizarra compartida de preguntas con enunciado integrado en el papel, colores/grosor visibles y conservación acotada por pregunta. No se modifican los bancos, reglas, Firebase ni recompensas. Compilación debug y 543 pruebas unitarias correctas; revisión visual/táctil pendiente, sin ejecutar la app. Detalles y límites en `../preguntas/INFORME_2026-11-03.md`. Esta descripción sustituye la distribución partida inicial en preguntas; Material mantiene su rama de consulta.


## 03/11/2026 — Ajustes de margen inferior, flecha y teoría

La pizarra calcula el margen seguro del diálogo a partir de los insets completos de su ventana, sin descontar los ya consumidos por el Scaffold de la app. Evita que el control de grosor termine bajo la navegación de Android.

La flecha de lectura se integra en el margen lateral de QuestionScrollArea y deja de ser una fila que resta altura al área desplazable. Solo aparece si quedan más de dos píxeles por recorrer; no ocupa altura adicional ni modifica el criterio al aparecer. Se retiraron los dos avisos externos en Aprender y examen activo.

La cabecera general se oculta durante toda la ruta del nivel, incluida la teoría inicial. No cambian preguntas, respuestas, recompensas ni dibujos.

Validación: assembleDebug y 545 pruebas unitarias (348 Android + 197 shared), sin fallos, errores ni omitidas. Dos pruebas nuevas cubren la indicación al caber todo el contenido, el margen de redondeo y el final del recorrido. Log: build/question-insets-scroll-validation.log. No se ejecutó Android; queda pendiente confirmar los márgenes y el resultado visual en el celular del usuario.


## 03/11/2026 — Historia: ilustraciones relacionadas y fotografías ligeras

Cuatro SVG originales, CC0, para cerámica, tejido, templo andino y quipu. Android usa sus equivalentes VectorDrawable, con relleno opaco y contorno. La selección depende del tema, respeta el presupuesto anterior (máximo tres acompañantes distintos por lección, separados entre secciones) y no asigna arquitectura andina a Roma o Egipto. Son símbolos, no reproducciones de piezas arqueológicas.

Se integraron dos fotografías Open Access del Met: botella geométrica Moche (objeto 309442) y vasija de maíz Nasca (316270), cada una de unos 12 KB en WebP. Se verificó el dominio público individual y la política CC0 del museo; las fichas de procedencia están en assets/educational-visuals/licenses. El inventario completo está en ../material/INVENTARIO_HISTORIA_2026-11-03.md. Fotos, SVG y XML nativos suman 31 657 bytes; esa cifra excluye documentación y metadatos.

Las imágenes se colocan después de su sección en Historia del Perú, semana 2, nivel 2.1, usando los títulos reales de Cultura Moche y Cultura Nasca. La misma asociación se utiliza en Material. El campo opcional sectionKeywords conserva el comportamiento de los recursos anteriores. Si un recurso exige una sección inexistente, no se muestra en otra como sustituto. Los identificadores de revisión de imágenes antiguas conservan su huella anterior: el nuevo metadato de ubicación no invalida una revisión sin cambiar la imagen.

Validación: assembleDebug y 551 pruebas (354 Android + 197 shared), sin fallos, errores ni omitidas. Seis pruebas nuevas cubren relevancia, SVG/XML sin recursos externos, licencias individuales, peso, asociación exacta al contenido real, ausencia en modo solo preguntas y estabilidad de la huella. Log build/history-visual-validation.log. Fotografías locales inspeccionadas; SVG/XML validados estructuralmente. No se ejecutó Android; revisión visual/táctil y rendimiento físico pendientes. No se publicaron cambios ni se modificaron bancos, Firebase o recompensas. Esto no constituye cobertura gráfica completa de todas las materias.


## 04/11/2026 — Mapas, desplazamiento y resoluciones de texto

Se retiraron los controles que solo revelaban frases con un temporizador: la resolución textual se muestra completa, conservando sus pasos y fórmulas. Las construcciones visuales reales mantienen sus controles propios. No se usa la cantidad de frases para decidir si existe una animación.

El bloque matemático/tabular cancela su gesto interno al detectar intención vertical, desactiva el desplazamiento anidado y mantiene su posición vertical en cero; conserva el recorrido horizontal. La altura medida ya no se descarta al superar 12 000 píxeles, lo que podía dejar un bloque largo con altura insuficiente.

El mapa confirma su dibujo después de recibir dimensiones y notifica errores de ejecución. Se permite cargar el origen HTTPS local interceptado; las direcciones ajenas siguen bloqueadas por el interceptor y la política CSP. Si no confirma el dibujo en ocho segundos o falla, se usa una vista nativa con los nodos y conexiones originales, zoom y desplazamiento en la vista ampliada. Esa alternativa básica conserva el texto de las fórmulas, sin el acabado de KaTeX; no se presenta como equivalente tipográfico. No se pudo identificar en un dispositivo la causa única del recuadro vacío: las capturas prueban el síntoma, no su origen.

Comprobado: assembleDebug y 664 pruebas (467 Android + 197 shared), sin fallos, errores u omisiones; build/theory-scroll-map-resolution-final-validation.log. Visor local: 246 mapas, 386 tablas en tres configuraciones, sin errores; incluye confirmación de dibujo, medición retrasada y aviso de fallo. Vista previa del mapa de Oscilaciones y ondas inspeccionada. No se ejecutó Android: pendiente comprobar mapa, gestos y márgenes en el teléfono. No se publicaron cambios ni se tocaron Firebase o recompensas.
