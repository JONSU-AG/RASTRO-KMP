# Inventario previo de recursos — 03/11/2026

| Recurso candidato | URL exacta / fuente | Licencia y atribución | Tamaño de origen | Decisión inicial |
|---|---|---|---|---|
| Mitocondria de jaiganesh | https://github.com/duerrsimon/bioicons/blob/main/static/icons/cc-0/Intracellular_components/jaiganesh/mitochondria.svg | CC0 por archivo/carpeta; crédito jaiganesh / Bioicons | 9.5 kB | Seleccionar, verificar SVG y atribución local |
| Corazón humano de Mariana Ruiz Villareal | https://github.com/duerrsimon/bioicons/blob/main/static/icons/cc-0/Tissues/Mariana_RuizVillareal/Human_heart.svg | CC0 por archivo/carpeta; Mariana Ruiz Villareal (LadyofHats), Bioicons | 85.2 kB | Seleccionar, revisar metadatos y no convertirlo en modelo 3D |
| Contorno de Perú, Natural Earth 1:50m | https://github.com/nvkelso/natural-earth-vector/blob/master/geojson/ne_50m_admin_0_countries.geojson | Dominio público; Made with Natural Earth | GeoJSON mundial 3.08 MB; solo se distribuirá Perú, tamaño final por medir | Seleccionar recorte vectorial, sin prometer límites departamentales ni relieve |
| Órgano individual BodyParts3D | https://dbarchive.biosciencedbc.jp/en/bodyparts3d/lic.html | Página actual: CC BY 4.0, pero las 83 piezas OBJ descargadas indican CC BY-SA 2.1 Japón; se aplica esta última al derivado. Atribución BodyParts3D / DBCLS | Archivo fuente PART-OF reducido: 62 MB; pieza seleccionada por medir | Seleccionar solo las 83 piezas de FMA7088 (corazón); no incorporar el cuerpo completo |
| Z-Anatomy completo | https://github.com/Z-Anatomy/Models-of-human-anatomy/blob/master/License.txt | CC BY-SA 4.0 general, con atribuciones que incluyen oído CC BY-NC-SA y riñón CC BY-NC | ZIP ~86.7 MB | Descartado como paquete; no asumir licencia homogénea |
| Servier Medical Art | https://smart.servier.com/ | Licencia específica debe acompañar a cada pieza; Bioicons conserva rutas CC BY 3.0 | Variable | Candidato futuro; no se mezclan versiones de licencia |
| Wikimedia Commons | https://commons.wikimedia.org/ | Por archivo, nunca por el portal entero | Variable | Sin archivo seleccionado en este lote |
| Mol* | https://github.com/molstar/molstar/blob/master/LICENSE | MIT para el visor; los datos de moléculas requieren procedencia propia | Sin añadir al APK | Evaluado: macromoléculas; no hace falta para el primer modelo anatómico |
| Three.js | https://github.com/mrdoob/three.js/blob/dev/LICENSE | MIT | Dependencia incluida en el paquete model-viewer; no añadir otro motor | Evaluado |
| Google model-viewer 4.4.0 | https://github.com/google/model-viewer | Apache-2.0; conservar avisos | Bundle 1,069,272 bytes | Seleccionar: WebView local, carga solo al solicitar 3D |
| SceneView | https://sceneview.github.io/ | Apache-2.0; compatibilidad de su versión con Compose/Filament requiere actualización controlada | No integrado | Alternativa nativa evaluada; evitar cambiar dependencias actuales para un recurso |
| OpenStreetMap | https://www.openstreetmap.org/copyright | ODbL, atribución; política de teselas independiente | No integrado | No usar servidores públicos como CDN de teselas offline |
| CesiumJS | https://github.com/CesiumGS/cesium/blob/main/LICENSE.md | Apache-2.0 para código; terreno/servicios tienen licencias y condiciones separadas | No integrado | Excesivo para el primer mapa estático de Perú |

Este inventario precede a la integración. Las filas en investigación no certifican que el recurso esté incorporado ni validado. Los tamaños finales, hashes, atribuciones y correspondencias se registrarán en el catálogo distribuido. No se usan recursos NC.

## Selección incorporada y verificada

| Archivo | Fuente y autor | Licencia por archivo | Tamaño distribuido | Asociación |
|---|---|---|---:|---|
| mitochondria.svg | [Bioicons / jaiganesh](https://github.com/duerrsimon/bioicons/blob/main/static/icons/cc-0/Intracellular_components/jaiganesh/mitochondria.svg) | CC0-1.0 | 9 519 bytes | Biología, 5.3, orgánulos |
| prokaryote.svg | [Bioicons / Mariana Ruiz Villareal, LadyofHats](https://github.com/duerrsimon/bioicons/blob/d29e766ea7580b8063c4f47b29e872db40a4d979/static/icons/cc-0/Intracellular_components/Mariana_RuizVillareal/Average_prokaryote_cell-_unlabled.svg) | CC0-1.0 | 84 800 bytes | Biología, 5.1, célula procariota |
| human-heart.svg | [Bioicons / Mariana Ruiz Villareal, LadyofHats](https://github.com/duerrsimon/bioicons/blob/main/static/icons/cc-0/Tissues/Mariana_RuizVillareal/Human_heart.svg) | CC0-1.0 | 85 200 bytes | Biología, 8.3, sistema cardiovascular |
| peru-outline.svg | [Natural Earth, países a escala 1:50m](https://github.com/nvkelso/natural-earth-vector/blob/master/geojson/ne_50m_admin_0_countries.geojson), Made with Natural Earth | Dominio público | 8 165 bytes | Geografía, 13.1 y 13.2; contorno general orientativo |
| heart-bodyparts.glb | [BodyParts3D / DBCLS, descarga oficial](https://dbarchive.biosciencedbc.jp/en/bodyparts3d/download.html), FMA7088, 83 componentes | CC-BY-SA-2.1-JP conservada de los OBJ | 2 730 764 bytes | Mismo recurso del corazón: vista 3D opcional |

Las URLs fijadas a versiones/commits, SHA-256 y notas de transformación están en `androidApp/src/main/assets/educational-visuals/catalog.json`. Las atribuciones aparecen junto al recurso en Material; los avisos completos se incluyen en `licenses/` dentro de los assets del APK.

El archivo fuente anatómico de 64 888 505 bytes se conserva solo en `build/`, no en el APK. Contiene 1258 OBJ; se convirtieron únicamente los 83 asociados oficialmente a FMA7088: 102 802 triángulos, sin texturas externas. No se simplificó de nuevo la topología reducida oficial. Conversión OBJ→GLB, orientación Z-up→Y-up, centrado, escala normalizada y material uniforme ilustrativo documentados en `licenses/bodyparts-heart-components.json`.

La [página actual de licencia de BodyParts3D](https://dbarchive.biosciencedbc.jp/en/bodyparts3d/lic.html) y las cabeceras de los archivos descargados difieren. El derivado conserva [CC BY-SA 2.1 Japón](https://creativecommons.org/licenses/by-sa/2.1/jp/), sus cabeceras y el texto legal; no se supone que todo el archivo oficial tenga la licencia de la página actual.

Total de esta carpeta, incluyendo visor, catálogos y licencias: aproximadamente 4,16 MB sin comprimir. No se añadieron datos moleculares, modelos de tejidos ni mapas de departamentos, relieve o cuencas en este lote.

Prueba real del HTML usado por Android: cuatro SVG decodificados, corazón cargado y cámara modificada mediante arrastre/zoom; cero errores y cero solicitudes externas. El motor/GLB no se descargan en las vistas 2D. Evidencia: `build/educational-visuals-browser-report.json`. Esto verifica el motor en Chrome de escritorio, no el rendimiento de un teléfono Android.


## Segundo piloto autorizado: célula vegetal de 3DCellForge

Modelo `public/generated-models/tripo-plant-cell-test.glb` y vista previa `src/assets/cell-plant-render.png`, de https://github.com/huangserva/3DCellForge, commit df569572b2eb88c31da89913dc269d816d226e5e. Licencia MIT del repositorio, autor huangserva; el GLB identifica Tripo como generador y no contiene otro aviso de licencia. Modelo original: 60 656 016 bytes. Derivado Android: 1 928 280 bytes, 58 868 triángulos, textura de color de 1024 px. JPEG: 153 401 bytes. Atribución, licencia y cambios incluidos en assets; asociaciones exactas en catalog.json. Ubicación: Biología 5.4, Núcleo y comparación animal vs. vegetal. Ver docs/aprender/biologia/PILOTO_CELULA_VEGETAL_5_4.md. No se añade el modelo original pesado al APK ni se usan APIs de generación.
