# Segundo piloto: célula vegetal de 3DCellForge

## Dónde aparece

Aprender → Biología → Semana 5 → **5.4: Núcleo y comparación animal vs. vegetal** → teoría → **Célula vegetal** → **Ver en 3D**.

También en Biología → Material → Temas → Tema 5 → 5.4, seleccionando teoría o teoría y preguntas. No aparece en el nivel de célula procariota ni en el cardiovascular. El piloto del corazón permanece separado.

## Recurso utilizado

Se utiliza el modelo real compartido por [huangserva/3DCellForge](https://github.com/huangserva/3DCellForge), no un modelo reconstruido por RASTRO. Referencia fijada al commit `df569572b2eb88c31da89913dc269d816d226e5e`:

- Modelo: `public/generated-models/tripo-plant-cell-test.glb`.
- Imagen: `src/assets/cell-plant-render.png`.
- Licencia del repositorio: MIT, Copyright (c) 2026 huangserva; aviso conservado dentro del APK. El GLB identifica Tripo como generador y no incluye otro aviso de copyright/licencia.
- Fuente, hashes original/derivado, transformaciones y tamaños: `assets/educational-visuals/licenses/cellforge-plant-source.json`.

Es un recurso ilustrativo para estudiar, conforme a la preferencia del usuario. No se exige validación clínica ni se afirma precisión microscópica. El archivo de origen es una sola malla. El piloto ahora segmenta su superficie en partes identificables y permite resaltarlas, aislarlas y separarlas visualmente. No se reconstruyen volúmenes interiores cerrados ni se simula su funcionamiento. No se activan cuentas, generación remota ni APIs de pago.

## Adaptación Android

El GLB original pesa 60 656 016 bytes y contiene 1 962 326 triángulos. La copia para Android pesa **1 928 280 bytes**, con **58 868 triángulos**, conservando UV y textura de color de 1024 px. Se omiten los mapas de normales y rugosidad. La reducción modifica detalle geométrico fino, no genera otro modelo. La imagen JPEG pesa 153 401 bytes. El archivo fuente de 60,7 MB permanece solo en build, fuera del APK.

Se reutiliza el visor nativo del piloto anterior, extendido para textura de color, y su interfaz de imagen ampliable / modelo 3D / Fuente. El corazón sigue usando su shader sin textura y mantiene su aspecto. La cámara de la célula se inicia a −90° para mostrar la cara interior; Centrar modelo restaura esa posición. Ambos recursos se cargan solo cuando corresponden al curso y subtema.

Las nuevas dependencias de preparación (`gltf-transform`, meshoptimizer, sharp) están únicamente en `build/cellforge-tools`: no son dependencias Android ni se ejecutan al abrir la app.

## Validación

- Compilación: `build/plant-cell-pilot-final.log`.
- 19 pruebas Android pertinentes: tres de célula vegetal, cinco del piloto cardiovascular, seis del catálogo y cinco del lector. Verifican hashes, asociaciones, textura JPEG/UV, límites de geometría y fallo local ante corrupción. Suites shared incluidas en la validación final.
- `build/plant-cell-native-shader-report.json`: shaders y buffer reales del visor nativo dibujados mediante WebGL en Chrome, con textura real. Fotograma inicial visible y diferente tras giro y zoom; captura `build/plant-cell-native-3d.png`.
- El pipeline del corazón se repitió con la extensión del visor: conserva 83 componentes, 102 802 triángulos y el mismo fotograma de referencia.
- Pendiente: ejecución física en Android, gestos, ciclo de vida y aceptación del usuario. Chrome verifica geometría/shaders/textura, pero no ejecuta GLSurfaceView ni Compose del teléfono.

Se conservan la teoría y las preguntas de 5.4. No se cambian Firebase, navegación principal, recompensas, anuncios ni pagos. No se publicó una versión ni se extendió la célula a otras lecciones.


Actualización del mismo día: [partes identificables, aislamiento y separación visual](PARTES_CELULA_5_4_2026-11-03.md).
