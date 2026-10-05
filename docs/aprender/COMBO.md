# Combo de lecciones

Ámbito exclusivo: respuestas de LessonEngineScreen. No añade recompensas ni modifica vidas, XP, monedas, cofres, rachas, anuncios o evaluación académica.

## Estado y eventos

`shared/.../model/LessonCombo.kt`: `LessonComboState.answer(attemptKey, correct)` recibe el veredicto existente. Correcta suma hasta 5; incorrecta reinicia a 0. Emite `ComboEvent.Reached(2..5)` únicamente al subir y `Broken(previousValue)` al romper una cadena. Las claves procesadas impiden duplicar callbacks, incluso después de restaurar el estado.

LessonEngineScreen mantiene una única instancia mediante `rememberSaveable(lessonId, stateSaver = LessonComboSaver)`. Cada aparición de la pantalla inicia su propia sesión; no se guarda en Firebase/gamificación. La clave de intento contiene fase, paso e ID del reto: la revancha es un nuevo intento válido de la pregunta. Cambiar de pregunta conserva el combo.

## UI y efecto reemplazable

`androidApp/.../ui/components/LessonComboUi.kt`: indicador compacto en la cabecera existente, oculto en 0/1; vector Bolt en 2/3/4 y fuego en 5. Usa colores del tema y un pop de 230 ms únicamente al recibir un hito.

El evento real `Reached(5)` representa exclusivamente 4 → 5. Activa `ComboMilestoneEffect.MAX_COMBO`; nunca se activa por comprobar `combo == 5` durante composición. `resolveComboEffect` es el único punto donde el placeholder se asigna a Loki Classic Enamorado, velocidad 2.5, duración 1600 ms. Para sustituirlo, cambiar este resolver y conectar la futura apariencia Classic; no cambiar el contador ni su evaluación.

Se reutiliza `ClassicArtwork` y su controlador de reproducción existente, en el mismo espacio del personaje. La apariencia/personaje habituales permanecen recordados y se restauran automáticamente tras el plazo; avanzar a la siguiente pregunta cancela el efecto. Un fallo también lo cancela.

El efecto y el token de pop son transitorios, no se guardan con el combo. Recomposición, popup y resize conservan las claves del controlador; recrear la pantalla restaura contador/claves sin volver a emitir el hito. El plazo usa elapsedRealtime y no se reinicia por recomposición o retorno del background. No se cambió el guardado del resto de estados de la lección.

## Validación

- `:androidApp:compileDebugKotlin`: correcto.
- `LessonComboTest`: 4 pruebas (tope, hitos, fallo/rearme, callbacks repetidos y sesión/restauración).
- `LessonComboUiTest`: 2 pruebas (Saver con deduplicación y mapping/duración del placeholder).
- `CatalogPilotValidationTest`: 4 pruebas existentes, sin errores/advertencias del piloto ni contaminación académica.
- Log: `build/lesson-combo-validation.log`.
- Integración revisada: un único punto de comprobación para opción múltiple, Relacionar y Completar teoría; vidas/recompensas siguen sus ramas existentes.
- Pendiente: recorrido visual en móvil/tablet, rotación/background y vuelta física del personaje. No se ejecutó la app conforme a AGENTS.md. Sin commit/push.
