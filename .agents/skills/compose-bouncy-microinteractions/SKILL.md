---
name: compose-bouncy-microinteractions
description: Duolingo and Apple-style physics-driven micro-interactions in Jetpack Compose and Compose Multiplatform. Replaces flat Android ripple with spring physics, button sinking/squishing, elastic bounces, and tactile haptic feedback. Use when adding interactive responsiveness and delightful motion to buttons, cards, and list items.
---

# Physics-Driven Micro-Interactions in Compose

This skill guides the creation of tactile, physical, gamified interactions inspired by Duolingo and Apple iOS.

## 1. The Core Philosophy
- Standard Material ripples feel digital and intangible.
- Physical buttons **sink** when pressed, carry mass, compress slightly, and snap back with elastic rebound.
- Every major user action should offer **visual feedback (scale/compression)** and **tactile feedback (haptics)** simultaneously.

## 2. Reusable Bouncy Click Modifier
```kotlin
enum class ButtonPressState { Idle, Pressed }

@Composable
fun Modifier.bouncyClick(
    scaleDown: Float = 0.94f,
    hapticType: HapticFeedbackType = HapticFeedbackType.LongPress,
    onClick: () -> Unit
): Modifier
```
