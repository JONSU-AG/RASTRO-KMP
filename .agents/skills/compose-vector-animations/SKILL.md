---
name: compose-vector-animations
description: Vector and SVG micro-animations in Jetpack Compose and Compose Multiplatform. Covers continuous subtle pulsing, breathing, wiggling, rotation, stroke dash-array transitions, and interactive SVG icon transformations without relying on external Lottie binaries. Use when animating SVG icons, mascot badges, streaks, or gamified tokens.
---

# Vector & SVG Micro-Animations in Compose

This skill provides methods for breathing life into SVGs and vector drawables in Compose without bulky dependencies.

## 1. Zero-Emoji SVG Rule
- Emojis render inconsistently across Android OEM skins (Samsung, Xiaomi, Google).
- All icons and symbols must use crisp Vector Drawables (`.xml`) or Compose `ImageVector`.

## 2. Dynamic Micro-Animations for Vectors
- `rememberBreathingPulse(minScale, maxScale, durationMillis)`
- Mascot Wiggle and rotation on press / hover
