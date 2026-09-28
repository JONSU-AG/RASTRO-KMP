# 🎨 MANUAL DE ARQUITECTURA VISUAL: "EL ESTILO QUE AMA EL PROGRAMADOR"
### Guía Maestra de Diseño Cartoon 3D, Neubrutalismo Lúdico y Microanimaciones Táctiles de RASTRO
> **Propósito de este documento:** Si cambias de cuenta, de sesión o de modelo de IA, entrega este archivo como prompt/referencia inicial para que la nueva IA replique **exactamente** la misma calidad, física de botones y estética sin perder nada del trabajo realizado.

---

## 1. 🌟 Filosofía Visual y Reglas de Oro

El estilo de esta aplicación **NO es diseño plano (Flat Design)** ni tampoco el clásico Material Design genérico y aburrido. Es una fusión artesanal de **Cartoon 3D**, **Neubrutalismo Lúdico** y **Micro-física táctil inspirada en Duolingo y consolas portátiles (Nintendo Switch/Game Boy)**.

### 🚫 Prohibiciones Estrictas (Lo que NUNCA debe hacer la IA):
1. **PROHIBIDO el Flat Design:** Ningún botón o tarjeta interactiva puede ser un rectángulo plano sin volumen físico.
2. **PROHIBIDO sombras grises borrosas estándar:** No uses `elevation = 4.dp` de Material Design que genera manchas grises difusas. Todo volumen se construye con **biseles duros y sólidos de color**.
3. **PROHIBIDO bordes invisibles o delgados (0.5dp):** Todos los elementos deben tener contornos nítidos y definidos (`1.5.dp` a `2.dp`) usando `theme.strokeBorder`.
4. **PROHIBIDO la falta de feedback táctil:** Si algo se puede tocar, **debe reaccionar físicamente** (hundirse en el eje Y y emitir vibración háptica).
5. **PROHIBIDO fotos circulares crudas:** Cualquier foto de perfil o avatar de usuario **SIEMPRE debe tener su contorno grueso (`1.8.dp` a `2.5.dp`) y bisel 3D**, integrándose al universo sticker de la app.

---

## 2. 🕹️ La Física del "Botón Real" (Mecánica de Hundimiento y Bisel 3D)

La razón por la cual los botones se sienten como "botones de verdad" es porque simulan mecánicamente una tecla física (keycap) con una base y un resorte.

### Anatomía del Botón en Jetpack Compose:
```
┌───────────────────────────────────────┐  ▲
│        CARA SUPERIOR (Color)          │  │ 44dp - 52dp
│  Borde sólido 1.8dp (strokeBorder)    │  │
└───────────────────────────────────────┘  ▼
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▲ Bisel 3D inferior
 ░░░░░░░ BISEL SÓLIDO (3.5dp) ░░░░░░░░░░  │ (cardBevel o versión más oscura)
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▼
```

### El Efecto "Sink-on-Press" (Hundimiento Físico):
1. **Estado Reposo (`isPressed == false`):**
   - La cara superior está elevada: `offset(y = 0.dp)`.
   - El bisel inferior es visible con altura de `3.5.dp` a `4.dp`.
   - Escala: `1.0f`.
2. **Estado Pulsado (`isPressed == true`):**
   - La cara superior **se hunde mecánicamente**: `offset(y = 3.2.dp)`.
   - El bisel visible **colapsa**: parece que el botón fue empujado hacia adentro del chasis del dispositivo.
   - Escala: Se comprime ligeramente a `0.97f`.
3. **Al Soltar (Liberación):**
   - El botón sale disparado hacia arriba mediante una física de resorte:
     ```kotlin
     spring(
         dampingRatio = Spring.DampingRatioMediumBouncy, // 0.65f rebote lúdico
         stiffness = Spring.StiffnessMediumLow           // 400f - 600f
     )
     ```

### Componentes Oficiales Implementados:
- `Sticker3dButton`: Botón de acción principal con bisel colapsable y borde visible.
- `Sticker3dCard`: Tarjeta contenedora con bisel 3D inferior para lecciones, módulos y opciones.
- `Sticker3dPill`: Chip/píldora para filtros, categorías y áreas académicas.
- `Sticker3dCircleButton`: Botón circular 3D para flechas de carrusel, audio y navegación.
- `Sticker3dActionPill`: Píldora interactiva para reacciones, comentarios y compartir.
- `Sticker3dCounterButton`: Botón mecánico (`-` y `+`) para el calculador de puntaje del simulador.

---

## 3. 📳 Sistema de Vibración Háptica Duolingo (`DuolingoHaptics`)

Para complementar la física visual, cada pulsación activa una vibración calibrada que imita la precisión de Duolingo y el Taptic Engine de Apple:

```kotlin
// com.jonsuapps.rastro.android.ui.components.DuolingoHaptics

// 1. Click Mecánico Ligero (Navegación en barra inferior, tocar opciones):
DuolingoHaptics.playOptionSelected(context) 
// -> Pulso de 12ms a baja amplitud (50/255). Se siente como un "tick" analógico.

// 2. Acierto Triunfal (Pregunta correcta, meta diaria cumplida):
DuolingoHaptics.playAnswerCorrect(context) 
// -> Doble pulso elástico festivo (30ms fuerte -> 45ms pausa -> 55ms alegre).

// 3. Error / Advertencia (Pregunta incorrecta, límite de tiempo):
DuolingoHaptics.playAnswerIncorrect(context) 
// -> Vibración pesada de 70ms con feedback de advertencia firme.
```

---

## 4. 🧭 Barra Inferior (`LiquidNavbar`) Sin Deformaciones y Ágil

Para mantener la barra inferior suave y sin tartamudeos:
1. **SVG e Iconos Pegados al Texto:** Espaciador vertical mínimo de `1.dp` (`Spacer(height = 1.dp)`) y texto de `9.5.sp` con `FontWeight.Bold`/`Black` para evitar que las 7 pestañas se desborden.
2. **Cero Deformación en el Contenedor:** No animar bordes gruesos alrededor del ítem seleccionado que encojan el ancho disponible. Usar un fondo de píldora tintada suave (`activeColor.copy(alpha = 0.12f)`).
3. **Escala del Icono Controlada:** Escala sutil de `1.07f` con resorte rápido (`stiffness = 650f`), sin oscilaciones lentas que distraigan.
4. **Desacoplar Recomposiciones Continuas:** Badges o puntos pulsantes deben aislarse en sub-composables (`CartoonNavBadge`) para no forzar la recomposición de los 7 destinos en cada fotograma.
5. **Navegación Confiable a Inicio:** Al tocar "Inicio", desapilar (`popBackStack`) inmediatamente cualquier sub-pantalla empujada (como obras literarias, fórmulas o chats) para volver a la raíz sin quedar atrapado.

---

## 5. 🖼️ Caché Inmediato y Contorno Obligatorio de Fotos (`CartoonAvatar`)

Para eliminar parpadeos de recarga al cambiar entre "Inicio" y "Perfil":
1. **`ImageCacheManager` (Doble Nivel):**
   - **Nivel 1 (RAM LRU):** Guarda las imágenes decodificadas en memoria. Al volver a Perfil, se dibujan en el **fotograma 0 (0ms)** de forma inmediata y síncrona.
   - **Nivel 2 (Disco Local):** Guarda el archivo en `cacheDir/rastro_image_cache` con hash SHA-256 para no re-descargar de internet en cada apertura de la app.
2. **`CartoonAvatar`:**
   - Todo avatar de usuario, comentarios y perfiles utiliza este componente.
   - Posee un contorno de `1.8.dp` a `2.5.dp` (`theme.strokeBorder`) y un bisel 3D inferior (`offset(y = 2.dp)`).

---

## 6. 🛠️ Skills del Sistema Utilizadas

Cuando trabajes con otra cuenta o IA en Antigravity IDE, asegúrate de activar y aplicar los principios de estas tres skills:

1. **`compose-playful-cartoon-ui`**
   - *Ubicación:* `.agents/skills/compose-playful-cartoon-ui/SKILL.md`
   - *Responsabilidad:* Define las formas geométricas gruesas, paletas de colores saturadas y amigables, bordes tipo calcomanía/sticker y la arquitectura de componentes físicos 3D (no planos).
2. **`compose-bouncy-microinteractions`**
   - *Ubicación:* `.agents/skills/compose-bouncy-microinteractions/SKILL.md`
   - *Responsabilidad:* Modificadores de resorte (`bouncyClick`), física de hundimiento mecánico de botones, balanceo elástico al cambiar de estado y retroalimentación táctil de Duolingo.
3. **`compose-material3-google`**
   - *Ubicación:* `.agents/skills/compose-material3-google/SKILL.md`
   - *Responsabilidad:* Jerarquía de temas, accesibilidad, contraste de color WCAG AAA y soporte impecable para cambio dinámico de paletas (Modo Oscuro, Rastro Neon, etc.).

---

## 7. 📋 Prompt Maestro para Copiar y Pegar en una Nueva Cuenta o IA

Copia y pega el siguiente bloque a la nueva IA al iniciar cualquier sesión de desarrollo sobre este proyecto:

```markdown
Hola. Estamos desarrollando la app oficial RASTRO (Kotlin Multiplatform / Android Compose).
El estilo de este proyecto es SAGRADO y está definido en `ESTILO_QUE_AMA_EL_PROGRAMADOR.md`.

Reglas inquebrantables de desarrollo:
1. NADA DE DISEÑO PLANO (Flat design prohibido). Cada botón, tarjeta o píldora interactiva DEBE tener volumen físico con bisel 3D (`bottomBevelColor` / `cardBevel`) y borde sólido grueso (`1.8dp`, `theme.strokeBorder`).
2. MÁXIMA RESPUESTA TÁCTIL: Los botones deben colapsar su bisel al presionarse (`offset(y = bevelHeight)`), tener rebote de resorte (`bouncyClick` con `Spring.DampingRatioMediumBouncy`) y emitir feedback háptico con `DuolingoHaptics`.
3. FOTOS DE USUARIO CON CONTORNO: Usa siempre `CartoonAvatar` con contorno sticker grueso y caché instantáneo de dos niveles (`ImageCacheManager`).
4. BARRA INFERIOR (LiquidNavbar): SVG y texto pegados (`1.dp` de espacio), tamaño estricto fijo sin deformaciones de layout ni animaciones pesadas.
5. NO SUBAS NADA A GITHUB a menos que el usuario lo pida explícitamente ("no subas nada a github hasta que te lo diga directamente").

Usa como referencia los componentes en `com.jonsuapps.rastro.android.ui.components` (`Sticker3dButton`, `Sticker3dCard`, `CartoonAvatar`, `DuolingoHaptics`, `LiquidNavbar`).
```
