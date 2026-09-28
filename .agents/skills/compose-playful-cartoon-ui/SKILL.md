---
name: compose-playful-cartoon-ui
description: Estilo visual Cartoon, Sticker 3D y Neubrutalismo lúdico para Jetpack Compose y Compose Multiplatform. Contornos gruesos, botones físicos con bisel 3D (no planos), sombras duras sólidas y estética de dibujo/calcomanía táctil.
---

# Cartoon & Sticker 3D UI Architecture (Playful Neubrutalism)

Esta habilidad rige la construcción de interfaces lúdicas con estética de dibujo animado, pegatinas (stickers) y componentes físicos 3D con respuesta táctil.

## 1. Principios Fundamentales del Estilo

1. **Cero Superficies Planas ("No Plano")**:
   - Los botones e interactivos nunca son rectángulos o círculos planos con colores lisos.
   - Llevan un **bisel inferior sólido 3D (bevel)** de 3dp a 5dp más oscuro que el color principal.
   - Al presionarse, la cara del botón se traslada en `Y` hacia abajo exactamente la altura del bisel, simulando un botón mecánico real.

2. **Trazo Contorneado Definido (Sticker Outline)**:
   - Cada botón, tarjeta o badge lleva un borde/trazo continuo visible de `1.5.dp` a `2.dp`.
   - El color del trazo suele ser oscuro o de alto contraste (`#2A0824`, `#1E293B` o el color base oscurecido).

3. **Sombras Duras / Sólidas (Sin Blur Difuminado)**:
   - Se evitan las sombras difusas y borrosas tradicionales de Material (`elevation`).
   - Se utilizan sombras sólidas con offset nítido (`offset(x = 0.dp, y = 4.dp)` con color pleno), generando el efecto de viñeta de cómic o calcomanía recortada.

4. **Esquinas Suaves y Formas Amigables**:
   - Esquinas redondeadas orgánicas (`RoundedCornerShape(16.dp)` a `26.dp`) o cápsulas (`PillShape`).

## 2. Componentes Clave

- `Sticker3dButton`: Botón físico 3D con bisel inferior, trazo contorneado y animación de resorte.
- `Sticker3dCard`: Tarjeta con borde grueso y sombra de bloque sólida.
- `StickerBadge`: Chips y etiquetas con borde de viñeta y tipografía gruesa (`FontWeight.Black`).
