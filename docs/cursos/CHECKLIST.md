# Checklist
- [x] Mapa, Git y código revisados; CodeGraph utilizado; skills Cartoon UI/Firebase aplicadas.
- [x] Comunidad inicial sin catálogo precargado; Compartidas filtra publicaciones propias.
- [x] Botones de publicación/retirada y feedback, aislados por propietario y sesión.
- [x] API sigue páginas y evita resultados parciales; IFrame oficial sin feed limitado a 15.
- [x] Compilación Android y 4 pruebas de paginación/cola + 4 de catálogo piloto correctas (playlists-final.log y playlists-catalog.log).
- [ ] Firebase real/reglas desplegadas y seguridad en servidor verificadas.
- [ ] Playlist pública 50+ videos comprobada en dispositivo; no se ejecutó la app.
- [ ] Temas, tablet, cambio de cuenta y retiradas comprobados físicamente.

## 04/10
- [x] Selección, Anterior/Siguiente y reproductor IFrame conectados.
- [x] Pausa al salir de foreground/destrucción al cerrar; controles oficiales y enlace externo conservados.
- [x] Dos paneles en ancho >=620 dp, SafeDrawing y miniaturas 120×72.
- [ ] Reproducción/fullscreen/50+ videos verificados físicamente (app no ejecutada).

## 04/10 — Títulos y controles
- [x] Switch Compartir independiente del acceso al reproductor.
- [x] Botón YouTube bajo el video; títulos reales y búsqueda; lista lazy.
- [ ] Verificación visual/táctil en móvil y tablet (app no ejecutada).
- Detalle: TITULOS_Y_CONTROLES_PLAYLIST.md.

## 04/10 — Pantalla completa y switch compacto
- [x] Switch visual al 72%, área pulsable/semántica de 48 dp y guardado existente.
- [x] Pantalla completa vertical y horizontal reutilizan el WebView; Girar/Cerrar, restauración de orientación y barras transitorias.
- [x] Contenido movable y layout congelado durante fullscreen para conservar reproductor al girar.
- [x] Enlaces del IFrame y ventanas nuevas por gesto intentan abrir app YouTube; navegador como alternativa.
- [ ] Verificación física de reproducción, giro, Atrás y apertura de YouTube: app no ejecutada por AGENTS.md.

Validación final: Kotlin Android correcto; 9 pruebas de YouTube y 4 del catálogo piloto aprobadas. Registros build/youtube-fullscreen-final.log y build/youtube-fullscreen-catalog.log. Apertura real de app/fullscreen/rotación pendientes de prueba física.
- [x] Mías conecta con documentos de la cuenta en Firestore; caché por UID y migración sin sobrescribir documentos existentes.
- [x] Retirar de Comunidad conserva la lista privada; eliminar deja tombstone.
- [x] Controles vectoriales de fullscreen/giro/cierre con zonas de toque de 48 dp.
- [ ] Confirmar sincronización en dos dispositivos y reglas desplegadas. No se ejecutó la app.


## 04/10/2026 — retirar controles duplicados y recorte inferior
- [x] Eliminadas filas y SVG extra de pantalla completa/giro/cierre del reproductor; recursos existentes no borrados.
- [x] IFrame controls=1 y fs=1: pantalla completa mediante el control oficial de YouTube.
- [x] WebChromeClient conserva la sesión/vista nativa; ventana sin barra superpuesta, Atrás y onHideCustomView cierran; restaura orientación previa.
- [x] FULL_USER respeta rotación habilitada/bloqueada por usuario; no fuerza landscape/portrait.
- [x] Popup al 94% del espacio seguro, padding menor y panel del reproductor desplazable con altura acotada; lista conserva scroll propio.
- [x] compileDebugKotlin y 112 tests Android correctos, build/errors-background-playlist-validation.log.
- [ ] Video completo sin recorte, salida fullscreen y auto-rotación ON/OFF en teléfono/tablet: app no ejecutada.
