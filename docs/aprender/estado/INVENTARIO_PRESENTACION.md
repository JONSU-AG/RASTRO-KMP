# Presencia de recursos por nivel — 04/11/2026

Inventario reproducible de los archivos actuales. No marca ningún tema como aprobado académicamente. Un mapa o tabla detectado en el texto no prueba que se vea bien en el teléfono.

| Materia | Niveles | Preguntas | Con mapa en fuente | Con tabla en fuente | Con recurso del catálogo | Con modelo del catálogo |
|---|---:|---:|---:|---:|---:|---:|
| algebra | 32 | 352 | 18 | 19 | 0 | 0 |
| aritmetica | 26 | 286 | 11 | 16 | 0 | 0 |
| biologia | 24 | 296 | 0 | 0 | 1 | 1 |
| civica | 22 | 220 | 6 | 21 | 0 | 0 |
| comprension_lectora | 16 | 176 | 16 | 16 | 0 | 0 |
| filosofia | 26 | 260 | 24 | 26 | 0 | 0 |
| fisica | 24 | 264 | 6 | 3 | 0 | 0 |
| geografia | 26 | 260 | 26 | 26 | 2 | 0 |
| geometria | 22 | 242 | 11 | 12 | 0 | 0 |
| historia_peru | 10 | 140 | 10 | 0 | 1 | 0 |
| historia_universal | 12 | 168 | 10 | 2 | 0 | 0 |
| ingles | 14 | 154 | 8 | 10 | 0 | 0 |
| lenguaje | 19 | 194 | 19 | 19 | 0 | 0 |
| literatura | 12 | 120 | 0 | 0 | 0 | 0 |
| psicologia | 29 | 290 | 0 | 0 | 0 | 0 |
| quimica | 32 | 356 | 15 | 11 | 0 | 0 |
| raz_logico | 18 | 198 | 9 | 10 | 0 | 0 |
| raz_matematico | 14 | 154 | 8 | 9 | 0 | 0 |
| raz_verbal | 16 | 160 | 16 | 16 | 0 | 0 |
| trigonometria | 24 | 264 | 12 | 13 | 0 | 0 |

Total: 418 niveles y 4554 preguntas.

[Detalle por nivel](INVENTARIO_PRESENTACION_POR_NIVEL.csv).

## Cómo interpretar los datos

- Mapas: bloques Mermaid declarados en la teoría. Su sintaxis y relaciones deben validarse con el parser de la aplicación y revisarse académicamente.
- Tablas: separadores Markdown detectados fuera de bloques de código. No se infiere legibilidad ni adaptación al ancho de pantalla.
- Recursos y modelos: vínculos explícitos por materia e ID en educational-visuals/catalog.json. Se comprueba existencia del archivo, no su licencia, contenido, anclaje visible o renderizado.
- Las gráficas programadas en componentes de Kotlin, ilustraciones automáticas y pilotos nativos no se cuentan como archivos del catálogo. Un cero no demuestra ausencia de cualquier gráfico.
- No se modifica una lección solo para llenar una columna: se incorpora un recurso cuando aporta una relación o representación pertinente.

## Incidencias mecánicas

Sin archivos de cartel/modelo faltantes entre los vínculos inventariados.

Recursos del catálogo sin coincidencia por materia e ID de nivel: mitochondria, prokaryote, cellforge-plant. Revisar antes de considerarlos disponibles.

Generación: python scripts/academic/inventory_presentation.py. La revisión académica y visual pendiente se mantiene separada de este inventario.
