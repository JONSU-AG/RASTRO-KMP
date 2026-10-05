# Correcciones de Obras, Racha e inicio de lección — 02/10/2026

Ámbito: reproductor de feedback, teoría inicial de la lección, tarjetas del visor
de Obras, botón Seguir de Aporte, tarjeta semanal de Home y calendario mensual.
Sin cambios en contenido académico, navegación, geometría de personajes o catálogos.

## Crash: evidencia y corrección

Logcat real del teléfono conectado: `java.io.IOException: Prepare failed.: status=0x1`.
La cadena es `MediaPlayer.prepare` → `LearningAudio.play` (línea 78 anterior) →
`LessonPresentationPopup` (botón Comenzar lección, línea 318 anterior). También
aparecía al pulsar una opción de Aprender. Evidencia local: `build/device-crash.log`.
Esto interrumpía el callback antes de ejecutar `onStartLesson`.

OPCIONES es un efecto corto de 2507 bytes: ahora usa SoundPool con carga asíncrona.
Los demás sonidos usan MediaPlayer con `prepareAsync`, callback de preparación,
manejo de errores del decodificador y captura específica de IOException/estado
inválido dentro del reproductor. Un fallo de audio queda registrado y libera sus
recursos; no bloquea la navegación ni se oculta con un try/catch del flujo entero.
Se conserva un único dueño de audio y la prioridad de sonidos específicos.

## Cambios visuales locales

- Idea nueva: la secuencia existente `LokiSequence.STUDY` con Artyon Classic
  aparece dentro del paso de teoría ya existente, después de Comenzar lección.
  No se crea ruta ni pantalla adicional; el banner del curso no cambia.
- Obras: nombre y rol en líneas independientes, avatar estable, descripción
  completa; cabecera de acciones con wrap; tema principal sin corte a dos líneas;
  títulos, símbolos y preguntas con ancho restante explícito; interlineado responde
  al tamaño de lectura; acentos legibles sobre el tema oscuro.
- Aporte: el botón Seguir agrupa icono y texto en una Row centrada, con separación
  uniforme, sin wrap interno que divida el botón.
- Semanal: R-MEDIO animado en el fuego principal. **Última instrucción del usuario:
  no usar R-MINI en los días de la semana**. Los siete días conservan las bolitas
  y slots iguales; actividad según fechas reales. Toda la tarjeta ya navega hacia
  la Racha mensual por su onClick existente.
- Mensual: número seguido de R-MINI animado de 22 dp, centrados en la misma celda.
  Sin modificar dimensiones de la cuadrícula. La cabecera permite pasar el selector
  de mes debajo del título cuando ambos no caben en la misma línea.

## Validación

Compilación Kotlin y tres pruebas de políticas: BUILD SUCCESSFUL.
Se generó una compilación de depuración y se instaló con `adb install -r` en la
tablet conectada, para la validación solicitada, sin borrar datos.

Verificación real del 03/10/2026 en Samsung SM_S916U1:

- Lección 1.1 de Biología: popup previo → Comenzar lección → Idea nueva con Artyon
  → teoría → Entendido, ¡a practicar! → primera pregunta. PID 20921 conservado,
  sin errores AndroidRuntime/LearningAudio durante el recorrido. No se respondieron
  preguntas ni se completó la lección para probar recompensas.
- Obras: nombres y roles largos (Aquiles y Odiseo), textos cortos y descripción
  completa; Trama con títulos largos. Verificación en Cálido, Oscuro y fuente
  de lectura ampliada a 17 sp. Tema y fuente restaurados al terminar.
- Aportes: botón + Seguir observado como una unidad centrada; sin activar seguimiento.
- Home: siete bolitas alineadas y fuego principal animado. Pulsar el área de las
  bolitas abre la pantalla mensual, sin tocar la flecha.
- Calendario mensual: número seguido del fuego, celdas uniformes.
- Build final y tres pruebas LearningArtworkPolicyTest: BUILD SUCCESSFUL.

Evidencias locales: `build/lesson-start-ok.png`, `build/lesson-question-ok.png`,
`build/lesson-start-verification.log`, `build/obras-odiseo-ok.png`,
`build/obras-personajes-oscuro.png`, `build/obras-fuente-amplia-ok.png`,
`build/aporte-seguir-ok.png`, `build/racha-semanal-bolitas-ok.png` y
`build/racha-mensual-ok.png`. El Logcat histórico identifica la causa; el recorrido
posterior comprueba que el inicio corregido continúa hasta las preguntas.

Límite: no se ha comprobado cada obra ni una matriz completa de anchos y temas.
La tablet permitió una revisión inicial; las verificaciones finales detalladas
anteriores corresponden al teléfono. No se modificaron catálogos académicos.

Archivos de esta intervención: LearningArtwork.kt, LessonEngineScreen.kt,
HomeScreen.kt, DiasDeRachaScreen.kt, literatura/ObraDetailView.kt y BibliotecaScreen.kt.
