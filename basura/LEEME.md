# BASURA — movido SIN borrar (2026-09-28)
Todo aquí estaba verificado SIN referencias en el código (detalle en `MAPA_PROYECTO_KMP.md` §8).
Restaurar con: `git mv basura/<ruta> <ruta>` (o copiar de vuelta si no estaba en git).

- `androidApp/.../assets/course-icons/*.svg` (15): duplican a `ic_course_*` XML en uso.
- `res/drawable/banner_coraje.xml`, `artyon_banner.png`, `orstty_artyon.png`, `orstty_artyon2.png`:
  sin uso en UI; los 3 PNG se regeneran solos con `copy_mascots` / `build.gradle.kts`.
- `res/drawable/artyon_asustado(2).png`, `artyon_confundido.png`, `artyon_contento.png`,
  `orstty_asustado(2).png`: emociones que `Mascots.kt` nunca mapea.
- `res/drawable/ic_launcher_round.xml` (Manifest usa `app_logo`), `ic_reaction_star.xml`
  (reacciones usan fire+heart).
- `audio/SineWaveSynthesizer.kt`: sin llamadas (audio real = LokiRewardAudio).
- `LOKI` (raíz, 1MB): inalcanzable en runtime. `tools/test.js`, `test.ps1`: triviales sin refs.
NO mover aquí sin verificar con `git grep` primero.
