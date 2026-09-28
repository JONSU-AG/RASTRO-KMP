# 🎨 PLAN SUPERDETALLADO DE UI/UX PARA RASTRO KMP

> **Objetivo:** Refactorizar y profesionalizar la interfaz de usuario en Compose Multiplatform, logrando una estética "Apple Premium" (Glassmorphism, desenfoques, fluidez), con la limpieza educativa de "Knowunity" y las micro-animaciones gamificadas de "Duolingo".

## 🛠️ SKILLS Y HERRAMIENTAS SELECCIONADAS

Aunque algunas skills provienen del mundo Web (HTML/CSS), **adaptaremos su filosofía nativamente a Kotlin y Jetpack Compose**. Las skills seleccionadas de nuestro repositorio de agentes son:

1. **`emil-design-eng` / `animate`**:
   - *Origen:* Repositorios de micro-interacciones.
   - *Aplicación en KMP:* Creación de un `Modifier.bouncyClick()` en Compose. Uso de físicas de resorte (`spring()`) para que los botones y tarjetas "se hundan" (como Duolingo) en lugar del clásico ripple (onda) plano de Android.
2. **`apple-design`**:
   - *Origen:* Guías de Apple Human Interface.
   - *Aplicación en KMP:* Materiales translúcidos (Glassmorphism). Usaremos `Modifier.blur()` o `RenderEffect` en las barras de navegación (BottomNav) y componentes flotantes (como la pastilla Pomodoro) para que el fondo se desenfoque detrás de ellos.
3. **`ui-ux-pro-max`**:
   - *Origen:* Auditoría de contraste y accesibilidad.
   - *Aplicación en KMP:* Adaptabilidad total (Modo Claro/Oscuro) sin romper el contraste. **Regla de oro:** Nunca usar texto blanco sobre fondo amarillo o colores pastel sin legibilidad.
4. **Material Design 3 (Oficial de Google)**:
   - *Aplicación en KMP:* Será el motor base (temas, colores secundarios/terciarios). Material 3 nos dará la infraestructura de la UI, pero el "look and feel" (animaciones, bordes y desenfoques) lo dominaremos nosotros.

**❌ SKILLS DESCARTADAS:**
- `gpt-tasteskill`, `brutalist-skill`, `taste-skill`, `stitch-skill`: Descartadas por ser 100% enfocadas en librerías web (Tailwind/GSAP) que no aplican a Compose y chocarían con el rendimiento nativo.

---

## 🚫 REGLAS ESTRICTAS DE DISEÑO

1. **CERO EMOJIS EN LA UI ESTATICA**: Todo ícono debe ser vectorial (`.xml` / `ImageVector`) en formato SVG. Solo se permiten emojis dentro del texto de notificaciones o en reacciones emergentes (cuando el usuario presiona un botón de reacción).
2. **ESQUINAS SUAVES Y BORDES**: Uso estandarizado de `RoundedCornerShape(24.dp)` o superior para tarjetas, imitando las interfaces premium.
3. **COLORES SÓLIDOS Y DEGRADADOS SUTILES**: Uso de colores sólidos limpios y, a veces, degradados suaves (`Brush.linearGradient`) para fondos especiales.
4. **FLEXIBILIDAD Y ADAPTABILIDAD**: Ningún componente debe tener un ancho `width()` fijo en `dp` a menos que sea un icono. Usaremos `fillMaxWidth()`, `weight(1f)` y `BoxWithConstraints` para adaptarnos desde teléfonos estrechos hasta tablets.

---

## 🗓️ HOJA DE RUTA: EJECUCIÓN (FASE POR FASE)

### Fase 1: Motor de Temas y Contraste (Theme.kt) ✅ COMPLETADO
- **Acción:** Definir esquemas dinámicos para `LightColors` y `DarkColors`.
- **Ejecución:**
  - Garantizado que el color `Primary` tenga un texto `onPrimary` calculado por luminancia (oscuro para fondos claros y blanco para oscuros).
  - Soporte dinámico para los temas personalizados de la app en [MainActivity.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/MainActivity.kt).

### Fase 2: El Modificador Mágico (Animación Duolingo) ✅ COMPLETADO
- **Acción:** Creado [AnimationModifiers.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/components/AnimationModifiers.kt).
- **Ejecución:**
  - Implementado `Modifier.bouncyClick()` con físicas de resorte `spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessLow)`.
  - Integrado en botones, tarjetas interactivas y opciones de selección de retos en toda la aplicación.

### Fase 3: Glassmorphism (Efecto Apple) ✅ COMPLETADO
- **Acción:** Refactorizados componentes flotantes y barras superpuestas.
- **Ejecución:**
  - [PomodoroFloatingPill.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/components/PomodoroFloatingPill.kt): Efecto de vidrio esmerilado translúcido `appleGlass()`, borde especular y punto pulsante (`rememberBreathingPulse()`).
  - [LiquidNavbar.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/components/LiquidNavbar.kt): Dock flotante con vidrio líquido `appleGlass()`, pestañas con rebote físico y badge pulsante.

### Fase 4: Limpieza Estética de Pantallas Principales (Estilo Knowunity) ✅ COMPLETADO
- **Acción:** Refactorizados [HomeScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/HomeScreen.kt), [SimuladorScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/SimuladorScreen.kt), [BibliotecaScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/BibliotecaScreen.kt), [AprenderScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/AprenderScreen.kt), [LessonEngineScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/LessonEngineScreen.kt), [UserProfileScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/UserProfileScreen.kt) y [CursosScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/CursosScreen.kt).
- **Ejecución:**
  - Eliminados todos los emojis estáticos de cabeceras, botones y tarjetas (`📚`, `🎯`, `🧠`, `🧮`, `🔥`), sustituyéndolos por iconos vectoriales SVG oficiales de Google Material 3.
  - Añadidas esquinas suaves `RoundedCornerShape(24.dp)` y paddings respirables.

### Fase 5: Retroalimentación Táctil (Haptics) ✅ COMPLETADO
- **Acción:** Integrado Haptic Feedback nativo en `Modifier.bouncyClick`.
- **Ejecución:** `LocalHapticFeedback.current.performHapticFeedback(HapticFeedbackType.TextHandleMove)` activado en cada compresión de botón.

### Fase 6: Banco de Errores, Aportes Compactos y Social Follow ✅ COMPLETADO
- **Acción:** Reemplazar Reputación por el Banco de Errores y modernizar la interacción comunitaria.
- **Ejecución:**
  - **Eliminación de Reputación**: Se removió la tarjeta obsoleta de reputación.
  - **Sección de Errores**: Creado [ErrorBankRepository.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/data/ErrorBankRepository.kt) y el diálogo interactivo `ErrorBankDialog` en [UserProfileScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/UserProfileScreen.kt) para repasar preguntas falladas con explicaciones paso a paso y marcarlas como resueltas.
  - **Aportes y Errores Compactos**: Tarjetas KPI rediseñadas con formato horizontal estilizado y proporciones compactas.
  - **Vista Previa Fija en Aportes y Muro**: Portada estática fija y uniforme de 210.dp en [BibliotecaScreen.kt](file:///androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/BibliotecaScreen.kt), acompañada del botón prominente **"Abrir recurso"** hacia Google Drive / URL externa.
  - **Navegación al Perfil y Botón Seguir**: Foto y nombre de autor interactivos para navegar a su perfil público, y botón reactivo **"Seguir" / "Siguiendo"** en tiempo real.

---

### 🚀 ESTADO DEL PROYECTO
- **Compilación Kotlin Debug:** `BUILD SUCCESSFUL` (0 errores de compilación).
- **Skills instaladas en `.agents/skills`:** `security-audit`, `compose-material3-google`, `compose-glassmorphism-ios`, `compose-bouncy-microinteractions`, `compose-vector-animations`. Guía detallada en [SKILLS_GUIA.md](file:///SKILLS_GUIA.md).
