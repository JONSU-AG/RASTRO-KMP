# Tema adaptable: intensidad y contraste

## Uso
En el selector actual, tocar **Tema adaptable** abre Suave / Medio / Fuerte. Elegir aplica el tema y guarda la intensidad; cancelar conserva la selección anterior. Suave conserva la paleta fuente actual. La corrección de contraste se aplica a todos los temas, incluidos los personalizados.

La preferencia `material_you_intensity` vive en `rastro_preferences`, junto a `selected_theme`. `MainActivity` restaura la intensidad al iniciar. Un valor ausente/desconocido equivale a Suave. Los otros temas no utilizan esta intensidad. Se conserva la generación dinámica nativa existente (Android API 31+), sin otro sistema de temas.

## Implementación
- Shared: `theme/ThemeContrast.kt`: `MaterialYouIntensity`, `materialYouPalette`, `accessiblePalette`, helpers de contraste.
- Shared: `theme/RastroTheme.kt`: `ThemeManager.chooseMaterialYouIntensity`, paleta resuelta con `derivedStateOf`; roles de acento calculados una vez por paleta.
- Android: `MainActivity.kt`: persistencia/restauración y roles Material ColorScheme coherentes.
- Android: `ui/components/BannersAndModals.kt`: selector y diálogo de intensidad existentes.

Medio/Fuerte concentran el cambio en acentos, contornos, biseles y superficies secundarias. Refuerzo cromático 1.18/1.42; tinte del fondo 3.5%/8%, tarjetas 5.5%/12%, superficie secundaria 13%/26%. No se tiñe toda la interfaz al mismo color ni se cambia su estructura.

## Roles para continuar
- `theme.accent`: relleno/acento visual, no usar indiscriminadamente para letras.
- `theme.accentText`: letras de acento sobre fondo/superficies neutrales.
- `theme.onAccent`: letras/iconos sobre el relleno accent.
- `readableText(preferred, actualBackground)`: sobre una superficie propia o compuesta.
- `onColor(actualBackground)`: negro/blanco con mayor contraste.

El contraste considera luminancia y composición alfa. Texto principal, secundario, discreto y de acento alcanzan al menos 4.5:1 en las tres superficies neutrales. Si una personalización combina superficies incompatibles con un solo color de texto, se ajusta mínimamente la superficie hacia el fondo. No se añaden contornos a las letras.

Se corrigieron componentes Sticker3dButton/Pill, etiquetas seleccionadas de navbar, botones de acento y textos en Inicio, Cursos, Biblioteca, Simulador, Perfil, test vocacional, HUD y lecciones. AcademyDetailScreen usa tokens para lectura/tarjetas/selección; el contador de Destacados dejó de forzar blanco. Se conservan colores semánticos, marcas de video e imágenes/banners protegidos por sus overlays existentes. El piloto de fondo académico Admin permanece independiente.

## Validación comprobada, 04/10/2026
- `:androidApp:compileDebugKotlin`: correcto.
- `ThemeContrastTest`: 5 pruebas; paletas existentes, tres intensidades y 125 combinaciones personalizadas difíciles, composición alfa, aislamiento y persistencia por IDs.
- `AcademicBackgroundTest`: 5 pruebas de regresión correctas.
- `CatalogPilotValidationTest`: 4 pruebas correctas (incluye validación/sanitización del catálogo piloto).
- Evidencia: `build/theme-intensity-final.log`, resultados XML en ambos módulos.
- `git diff --check`: sin errores de whitespace.

No se ejecutó la app, conforme a AGENTS.md. Quedan pendientes la inspección física claro/oscuro/AMOLED, cada wallpaper y sección, móvil/tablet, fuente grande y medición visual del efecto. Los tests validan las paletas/roles y no demuestran por sí solos la legibilidad de cada recurso de contenido o imagen en pantalla. No commit ni push.
