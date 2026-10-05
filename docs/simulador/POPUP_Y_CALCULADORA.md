# Simulador: estructura, flashcards y calculadora

## Cambio del 04/10/2026

Ámbito: `SimuladorScreen.kt`, callback compartido de `Sticker3dCounterButton` y pruebas. Sin cambios de banco, pesos, evaluaciones, XP, personajes o rutas del simulador.

- Estructura oficial: encabezado en dos líneas independientes, grupos con filas alternadas, cantidad secundaria y puntos a la derecha. Totales calculados desde las ponderaciones existentes. Sin modificar el botón de inicio.
- Flashcards: búsqueda, materia, autor y Crear tarjeta continúan en la página. Estudiar abre un Dialog limitado a 640 dp / 90% de alto. Reportar/editar/eliminar, giro, autor y Anterior/Siguiente siguen disponibles. Solo el cuerpo largo se desplaza; la página detrás del diálogo no recibe el gesto.
- Calculadora: resumen compacto y filas de asignatura con campo numérico de 44 dp y botones +/-; una, dos o tres columnas según ancho. Entrada vacía editable; valores limitados a 0..cantidad real. Se conserva saldo por área y asignatura, Limpiar, Todos correctos, matriz y referencias históricas.
- Causa del bloqueo en un acierto: `Sticker3dCounterButton.pointerInput(enabled)` retenía el callback inicial. Usa el `rememberLiveClick` ya existente para leer la acción vigente. La calculadora usa ahora IconButton estándar para controles compactos y accesibles; el componente compartido también queda corregido para sus demás consumidores.

## Validación

Compilación Kotlin Android correcta. 11 pruebas JVM, cero fallos: LiveClickRegressionTest (2), FriendNotificationTest (2), UnsaMatrix2027Test (3), CatalogPilotValidationTest (4). Contador probado con incrementos repetidos, límite, decrementos y cambio de área. Log: `build/simulator-friends-final.log`. Diff check sin errores.

No se ejecutó la app por AGENTS.md. Comparación física de móvil/tablet/horizontal/fuente grande pendiente; no presentar estos tests como comprobación visual o táctil.
