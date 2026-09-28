# 🧭 GUÍA DE SKILLS DEL PROYECTO RASTRO KMP

> **Ubicación local:** Todas estas habilidades residen directamente dentro de la carpeta del proyecto en `.agents/skills/`. Cualquier editor o entorno con soporte para agentes de IA (Antigravity, Cursor, Claude Code, etc.) las detectará y cargará automáticamente.

---

## 🛡️ 1. `security-audit` (Oficial de Cloudflare)
- **Repositorio:** [cloudflare/security-audit-skill](https://github.com/cloudflare/security-audit-skill)
- **Ubicación:** `.agents/skills/security-audit/`
- **¿Para qué sirve?**
  Realiza auditorías de seguridad defensivas y revisiones profundas de vulnerabilidades en el código fuente, APIs, bases de datos (Firebase/Firestore) y endpoints. 
- **Flujo de 6 Fases:**
  1. *Reconocimiento (Reconnaissance):* Mapeo de arquitectura y límites de confianza.
  2. *Caza guiada por cobertura (Coverage-led Hunting):* Búsqueda metódica con registro de cobertura.
  3. *Validación adversaria (Candidate Validation):* Un sub-agente independiente intenta refutar cada candidato a vulnerabilidad.
  4. *Salida estructurada (Structured Output):* Generación de hallazgos verificables (`findings.json`).
  5. *Verificación independiente (Record Verification):* Doble chequeo riguroso de evidencia.
  6. *Informe Neutral (Target-Neutral Reporting):* Reporte con severidad calibrada (Critical, High, Medium, Low) y la solución más pequeña y efectiva en el código.
- **¿Cómo usarla?**
  Pídele al agente: *"Ejecuta una auditoría de seguridad en la autenticación y las reglas de Firestore usando security-audit"*.

---

## 🎨 2. `compose-material3-google`
- **Ubicación:** `.agents/skills/compose-material3-google/`
- **¿Para qué sirve?**
  Implementa las directrices oficiales de **Material Design 3 (M3)** de Google en Jetpack Compose y Compose Multiplatform.
- **Puntos clave:**
  - Roles estrictos de color con contraste WCAG garantizado (evita textos claros sobre fondos amarillos o claros).
  - Elevación tonal (sombras modernas mediante tinte de color en vez de sombras oscuras pesadas).
  - Escalas tipográficas adaptativas.

---

## 🍎 3. `compose-glassmorphism-ios`
- **Ubicación:** `.agents/skills/compose-glassmorphism-ios/`
- **¿Para qué sirve?**
  Recrea el efecto **Glassmorphism / Frosted Glass** de Apple iOS en Compose.
- **Componentes que genera:**
  - Fondos translúcidos con gradiente vertical (`alpha = 0.70 - 0.85`).
  - Borde especular (línea de 1.dp con degradado luminoso para simular el reflejo de la luz en el cristal).
  - Esquinas suaves continuas (`RoundedCornerShape(24.dp)` a `32.dp`).

---

## 🐥 4. `compose-bouncy-microinteractions` (Estilo Duolingo & Apple)
- **Ubicación:** `.agents/skills/compose-bouncy-microinteractions/`
- **¿Para qué sirve?**
  Sustituye el clásico "ripple" plano de Android por físicas reales de resorte (`spring()`).
- **Comportamiento:**
  - El botón o tarjeta se **hunde físicamente** al ser presionado (`scale = 0.90f - 0.94f`).
  - Al soltarlo, rebota elásticamente a su posición original.
  - Se activa retroalimentación háptica instantánea (`LocalHapticFeedback`) al tocar.

---

## ⚡ 5. `compose-vector-animations`
- **Ubicación:** `.agents/skills/compose-vector-animations/`
- **¿Para qué sirve?**
  Agrega micro-animaciones continuas e interactivas a iconos vectoriales SVG (`.xml` / `ImageVector`) sin necesidad de librerías pesadas como Lottie.
- **Ejemplos:**
  - `rememberBreathingPulse`: Pulso suave y constante para badges, rachas o puntos de estado activo.
  - Sacudida o balanceo (*wiggle*) para mascotas y avatares al interactuar.

---

## 🎨 6. `compose-playful-cartoon-ui` (Estilo Sticker 3D & Neubrutalismo Lúdico)
- **Ubicación:** `.agents/skills/compose-playful-cartoon-ui/`
- **¿Para qué sirve?**
  Rige la estética de dibujo/sticker no-plano utilizada en apps educativas de alta interacción:
  - **Cero botones planos**: Botones con **bisel inferior sólido 3D de 4.dp** (`Sticker3dButton`) que se hunden físicamente al tocarlos.
  - **Trazo contorneado (Sticker Stroke)**: Bordes definidos de `1.5.dp` a `2.dp` en negro o colores oscuros de alto contraste.
  - **Sombras duras y limpias**: Sin sombras difuminadas borrosas, logrando un aspecto de calcomanía física o viñeta de cómic.
  - **Tarjetas y Diálogos con Squircle**: Superficies amigables con bordes nítidos y sin popups genéricos de sistema.
