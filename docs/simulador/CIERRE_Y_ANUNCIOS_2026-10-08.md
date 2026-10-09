# Cierres del Simulador y secuencia de anuncios — 08/10/2026

## Evidencia y causa

Se leyó el registro de errores del dispositivo conectado, sin iniciar ni instalar la aplicación. Tres cierres de RASTRO a las 17:23:32, 17:24:19 y 17:24:43 muestran `SerializationException: Serializer for class SavedExamSession is not found`, en `ExamSessionStore.save`, hilo de guardado local. Evidencia filtrada: `build/simulador-crash-confirmado.log`.

`SavedExamSession` estaba anotada Serializable, pero androidApp no aplicaba el plugin de serialización Kotlin ya disponible en el proyecto. Compilaba porque el código resolvía el serializador en ejecución. Simulacro (0), rápido (1) y ranking (4) pasan por el mismo guardado al empezar y al responder. El error explica los tres cierres informados; el registro no señala a AdMob.

## Corrección

Se aplica el plugin existente en androidApp y se utiliza el serializador generado explícitamente en ExamSessionCodec. Si falla un checkpoint por otro motivo, el hilo registra el error y conserva la última copia válida, sin terminar la app. Se mantiene formato, clave por cuenta, preguntas, respuestas, intento y configuración Ranking. No se cambia coste ni reserva de intentos, banco académico o calificación.

## Auditoría de anuncios

- Lección: naturalEnd se llama desde Continuar de resultados, después de registrar el premio. No se llama desde respuestas.
- Simulacro, rápido y ranking: no muestran anuncios al comenzar ni al responder. Comparten la sesión que causaba el cierre. La pantalla de resultados no tiene una llamada adicional a publicidad actualmente; no se añadieron ubicaciones nuevas.
- Flashcards: naturalEnd está en Terminar. No usa SavedExamSession.
- Calculadora: no tiene llamada a anuncios ni guarda SavedExamSession.
- Conseguir monedas: rewarded voluntario. Solo el callback del proveedor acredita videos; no se cambia recompensa.
- AdMobProvider ya verifica Activity vigente/en primer plano y maneja fallo de presentación. Se conserva consentimiento, ausencia de automáticos para Pro y reglas de frecuencia.

Se elimina por completo el aviso de introducción y su estado pendiente. La secuencia es Continuar → anuncio si cumple reglas y está disponible → un solo agradecimiento con tarjeta visible de apoyo y promoción Pro. Sin anuncio mostrado/cerrado no se muestra agradecimiento. El botón Ver Pro abre el modal existente; no aparecen promociones entre videos de un pack.

## Validación

Pruebas añadidas: sesión de 80 preguntas en los tres modos; respuestas vacías de inicio; restauración de Ranking/UID/intento/Unicode; campos futuros ignorados; copia corrupta rechazada. Compilación, resultados de tests y lint se consignan al terminar. No se ejecutó app, emulador ni dispositivo. Confirmación física posterior pendiente.

Verificación final: 159 tests, cero fallos/errores/omitidos; lintVitalRelease y assembleDebug correctos. Serializador generado comprobado en debug y release. Primer intento de compilación agotó memoria; validación repetida correctamente con un worker y 4 GB para el compilador Kotlin, sin modificar gradle.properties. Log final: build/simulador-ads-validation.log. No se publicó, instaló ni ejecutó la app.


## Actualización posterior — revisión de respuestas y anuncios de resultados

Un nuevo OOM al medir texto motivó revisión en popup virtualizado. Ahora Volver al Simulador/Back desde resultados invoca naturalEnd; la ausencia de esa llamada descrita arriba corresponde a la intervención anterior. Detalle y límites: ../ui-principal/AJUSTES_2026-10-08_ICONOS_FORMULAS_Y_SIMULADOR.md.
