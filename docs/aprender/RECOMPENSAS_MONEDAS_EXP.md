# Recompensas de lecciones — 04/10/2026

`shared/.../gamification/LessonRewardPolicy.kt` calcula el mismo premio para la vista previa y para `GamificationManager.recordLessonCompletion`.

- Primera finalización: EXP completa (`25 + aciertos * 5`) y 10 monedas por estrella.
- Repetición: 20% de la EXP (división entera) y 2 monedas por estrella del intento.
- Mejorar estrellas acredita también la diferencia pendiente del premio base. Ejemplo: 2 → 3 estrellas = 10 de diferencia + 6 de repetición. Se conserva la mejor calificación y fecha original; actividad/racha se actualizan normalmente.
- Un único saldo de EXP y un único saldo de monedas.

`LessonCompletion.earnedCoins` registra solo el premio base de estrellas reconocido, no ingresos de repeticiones. `lastRewardAttemptId` evita pagar dos veces la misma finalización. Lesson Engine usa un UUID en rememberSaveable. Repetir no vuelve a abrir cofres ni cambia el nivel activo.

## Progreso anterior

`LessonRewardPolicy.reconcileLegacy` calcula por lección real: `max(0, estrellas * 10 - earnedCoins)`. Se ejecuta en `GamificationManager.restore` antes de exponer el estado. Tres estrellas antiguas sin premio reciben 30 monedas; dos, 20; una, 10. No concede EXP histórica ni premia accesos saltados. Respeta lo pagado aunque las monedas se hayan gastado.

Actualiza earnedCoins y lo conserva en el serializer local y en `usuarios/{uid}/gamificacion/rastro_progress`. RastroApp guarda el estado local restaurado y sincroniza por el flujo autenticado existente. Migración al cargar cada cuenta; no escritura masiva ni reglas nuevas.

## Animación

`LearningProgressHud.kt / XpDeliveryOverlay`: destellos vectoriales y recibo `+N XP` viajan al indicador de nivel medido. Ya no dibuja monedas enviadas al nivel. Resultado de LessonEngine muestra `+N monedas` aparte de los contadores EXP. Ayuda del HUD explica primera vez/repetición. Personajes Classic intactos.

## Validación

Compilación Kotlin Android correcta. LessonCoinsTest: 4 casos (primer premio/repetición/mejora, intento duplicado/restore, migración parcial/pagada/saltada/saldo gastado, vista previa vs entrega). LearningRewardsTest 9, CompetitionTest 5, UnsaMatrix2027Test 3 y CatalogPilotValidationTest 4: 25 pruebas sin fallos; `build/rewards-matrix-final.log`. Diff check correcto.

No se ejecutó app/dispositivo conforme AGENTS.md: recorrido visual y sincronización real pendientes. Sin commit/push. Estas reglas sustituyen la política anterior de cero recompensa al repetir y de no reconocer monedas históricas.
