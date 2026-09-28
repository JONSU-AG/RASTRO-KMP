---
name: compose-glassmorphism-ios
description: Apple iOS-style Glassmorphism, frosted glass, backdrop blur, translucent gradients, and specular highlights in Jetpack Compose and Compose Multiplatform. Use when designing floating pills, bottom navigation bars, modal dialogs, and translucent overlays that mimic iOS premium materials.
---

# Apple iOS Glassmorphism in Jetpack Compose

This skill provides patterns for implementing realistic, high-performance frosted glass, blur effects, and translucent materials in Compose Multiplatform.

## 1. Core Anatomy of iOS Frosted Glass
Realistic glassmorphism requires four layered visual elements:
1. **Translucent Tint**: Background color with alpha (`Color.White.copy(alpha = 0.65f)` for light mode, `Color.Black.copy(alpha = 0.55f)` for dark mode).
2. **Backdrop Blur**: Real-time or simulated gaussian blur behind the surface.
3. **Specular Border**: A 1.dp hairline border with a linear gradient (top-left lighter to simulate light reflection, bottom-right darker).
4. **Subtle Depth Glow**: Soft shadow with low opacity and high blur radius.

## 2. Implementation in Compose

### Hairline Specular Border
```kotlin
fun Modifier.glassBorder(
    cornerRadius: Dp = 24.dp,
    strokeWidth: Dp = 1.dp,
    isDark: Boolean = false
): Modifier = this.border(
    width = strokeWidth,
    brush = Brush.linearGradient(
        colors = if (isDark) {
            listOf(
                Color.White.copy(alpha = 0.20f),
                Color.White.copy(alpha = 0.05f),
                Color.Black.copy(alpha = 0.40f)
            )
        } else {
            listOf(
                Color.White.copy(alpha = 0.85f),
                Color.White.copy(alpha = 0.30f),
                Color.White.copy(alpha = 0.10f)
            )
        },
        start = Offset(0f, 0f),
        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
    ),
    shape = RoundedCornerShape(cornerRadius)
)
```

### Glass Surface Modifier
```kotlin
fun Modifier.appleGlass(
    cornerRadius: Dp = 24.dp,
    shape: Shape = RoundedCornerShape(cornerRadius),
    isDark: Boolean = false,
    alpha: Float = if (isDark) 0.65f else 0.75f,
    tintColor: Color? = null
): Modifier = this
    .clip(shape)
    .background(...)
```
