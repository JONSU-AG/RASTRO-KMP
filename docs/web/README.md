# RASTRO Web — Compose Multiplatform

Proyecto aislado en `web-compose/`, seleccionado por el propietario el 09/10/2026.

Android y su configuración Gradle permanecen intactos. No se añade este proyecto al settings.gradle.kts principal. Se usa el wrapper existente con `-p web-compose`.

## Ejecutar y compilar

Desde la raíz, con Java configurado:

```powershell
.\gradlew.bat -p web-compose wasmJsBrowserDevelopmentRun
.\gradlew.bat -p web-compose wasmJsBrowserDistribution
```

La distribución web queda bajo `web-compose/build/dist/wasmJs/productionExecutable/`. Servir por HTTP en desarrollo o HTTPS para PWA; abrir index.html como archivo no es equivalente.

## Piloto delimitado

Inicio preliminar, cambio de tema, teoría de la primera lección de Filosofía, retos de selección existentes y resultado de aciertos animado. Sin recompensas simuladas ni escrituras remotas. Las relaciones y otros tipos de preguntas todavía no están implementados en web.

Esto NO es toda la APK portada ni una versión lista para publicar. Su fin es validar compilación, reutilización y compatibilidad antes de migrar las pantallas completas.

## Fuente de verdad

Gradle web lee directamente y únicamente los archivos Kotlin compatibles seleccionados del proyecto original: temas, modelos Aprender, FilosofiaCatalog y LearningRewards.kt (animación EarnedStars original). No los modifica ni mantiene otra copia del catálogo o de las estrellas. Un cambio compatible en ellos se incluye al recompilar la web; no se publica por sí solo.

Pantallas Android, dependencias nativas, autenticación, pagos y anuncios necesitan adaptaciones explícitas. No hay conversión automática de cualquier pantalla Android.

La imagen de instalación es una copia del logo actual. Actualizarla desde la app cuando cambie; no trasladar secretos ni configuraciones de firma.

## PWA y plataformas

Manifest, icono, service worker y aviso Android con cierre recordado siete días. iPhone y PC pueden instalar según soporte del navegador. Validar físicamente iPhone/Safari y PC antes de prometer compatibilidad. El service worker conserva recursos públicos del piloto una vez descargados; no almacena llamadas Firebase/API. No garantizar uso sin conexión antes de descargar completamente los módulos Wasm.

Este primer build es Wasm: Safari necesita soporte WasmGC (Safari 18.2 en adelante según documentación de Kotlin). Para dispositivos antiguos falta preparar y verificar el modo de compatibilidad Kotlin/JS. No afirmar que ya funciona en todos los iPhone. Fuente: https://kotlinlang.org/docs/wasm-configuration.html.

No desplegar sobre el sitio legal existente sin revisar rutas y alcance del service worker. No importar la carpeta privada del Escritorio.

Fuentes: https://kotlinlang.org/docs/multiplatform/compose-css-styles.html y https://github.com/JetBrains/compose-multiplatform/releases/tag/v1.9.3.
