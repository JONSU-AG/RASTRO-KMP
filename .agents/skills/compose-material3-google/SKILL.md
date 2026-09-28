---
name: compose-material3-google
description: Official Google Material Design 3 (M3) architecture for Jetpack Compose and Compose Multiplatform. Covers dynamic color schemes, strict WCAG contrast compliance, typography scales, elevation with tonal surfaces, accessible shapes, and seamless custom theme overrides. Use when implementing or auditing Material 3 themes, buttons, cards, navigation, and color systems in Compose.
---

# Google Material Design 3 in Compose Multiplatform

This skill guides the implementation of Google's Material Design 3 (M3) design system in Kotlin Multiplatform and Jetpack Compose.

## 1. Principles of M3 in Compose
- **Strict Color Roles**: Do not hardcode colors in widgets. Always use `MaterialTheme.colorScheme.*`.
  - `primary` & `onPrimary`: The main brand highlight. Ensure `onPrimary` has high contrast (minimum 4.5:1 ratio).
  - `surface` & `onSurface`: Main background and content color.
  - `surfaceVariant` & `onSurfaceVariant`: Secondary backgrounds, input fields, subtle card backgrounds.
  - `outline` & `outlineVariant`: Borders and dividers.
  - `secondaryContainer` / `tertiaryContainer`: Soft highlighted pill containers.

## 2. Preventing Low Contrast Bugs (e.g. Yellow on White)
- Never place yellow text on a light background.
- If `primary` is Yellow/Gold (`#F59E0B` or `#EAB308`), `onPrimary` MUST be a dark shade (`#1F1600` or `#0F172A`), never white.
- Use explicit semantic containers:
  ```kotlin
  Surface(
      color = MaterialTheme.colorScheme.primaryContainer,
      contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
      shape = RoundedCornerShape(16.dp)
  ) { ... }
  ```

## 3. Elevation & Tonal Surface in M3
- In M3, elevation is indicated by **color tinting (tonal elevation)** rather than heavy drop shadows:
  - Higher elevation = subtle primary tint blended into the surface color.
  - Keeps interfaces flat, modern, and clean.

## 4. Typography Scale
- Use Google fonts (Outfit, Plus Jakarta Sans, Inter, Roboto Flex).
- Use `displayLarge`, `headlineMedium`, `titleMedium`, `bodyLarge`, `labelMedium` consistently.
