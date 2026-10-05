package com.jonsuapps.rastro.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.luminance

fun contrastRatio(foreground: Color, background: Color): Float {
    val bg = background.copy(alpha = 1f)
    val a = foreground.compositeOver(bg).luminance()
    val b = bg.luminance()
    return (maxOf(a,b)+.05f)/(minOf(a,b)+.05f)
}
fun onColor(background: Color): Color =
    if (contrastRatio(Color.Black, background) >= contrastRatio(Color.White, background)) Color.Black else Color.White

/** Preserve the intended hue where possible; adjust only as much as contrast requires. */
fun readableTextAcross(preferred: Color, backgrounds: List<Color>, minimum: Float = 4.5f): Color {
    fun score(c: Color) = backgrounds.minOf { contrastRatio(c,it) }
    val opaque = preferred.copy(alpha = 1f)
    if (score(opaque) >= minimum) return opaque
    val end = if(score(Color.Black)>=score(Color.White)) Color.Black else Color.White
    if(score(end)<minimum) return end
    var low=0f; var high=1f
    repeat(14) { val mid=(low+high)/2; if(score(lerp(opaque,end,mid))>=minimum) high=mid else low=mid }
    return lerp(opaque,end,high)
}
fun readableText(preferred: Color, background: Color, minimum: Float = 4.5f): Color =
    readableTextAcross(preferred,listOf(background),minimum)

/** One set of reading roles must work on all three neutral surfaces, including custom themes. */
fun accessiblePalette(raw: RastroPalette): RastroPalette {
    val bg=raw.background.copy(alpha=1f)
    val common=onColor(bg)
    fun surface(candidate: Color): Color {
        val opaque=candidate.compositeOver(bg)
        if(contrastRatio(common,opaque)>=4.5f) return opaque
        var low=0f; var high=1f
        repeat(14) { val mid=(low+high)/2; if(contrastRatio(common,lerp(opaque,bg,mid))>=4.5f) high=mid else low=mid }
        return lerp(opaque,bg,high)
    }
    val card=surface(raw.surface); val variant=surface(raw.surfaceAccent)
    val backgrounds=listOf(bg,card,variant)
    return raw.copy(background=bg,surface=card,surfaceAccent=variant,
        textPrimary=readableTextAcross(raw.textPrimary,backgrounds),
        textSecondary=readableTextAcross(raw.textSecondary,backgrounds),
        textMuted=readableTextAcross(raw.textMuted,backgrounds))
}

/** Text accent is separate from the fill accent: vivid buttons can still use light/dark ink. */
val RastroPalette.accentText: Color get() = readableAccent
val RastroPalette.onAccent: Color get() = accentForeground

enum class MaterialYouIntensity(val id: String, val title: String) {
    SOFT("soft","Suave"), MEDIUM("medium","Medio"), STRONG("strong","Fuerte");
    companion object { fun fromId(id: String?): MaterialYouIntensity = entries.firstOrNull { it.id==id } ?: MEDIUM }
}

/** Background tint remains <=8%; stronger colors are concentrated in accents and secondary surfaces. */
fun materialYouPalette(source: RastroPalette, intensity: MaterialYouIntensity): RastroPalette {
    if(intensity==MaterialYouIntensity.SOFT) return source
    val strong=intensity==MaterialYouIntensity.STRONG
    fun chroma(c: Color): Color {
        val mean=(c.red+c.green+c.blue)/3
        val factor=if(strong) 1.42f else 1.18f
        return Color((mean+(c.red-mean)*factor).coerceIn(0f,1f),
            (mean+(c.green-mean)*factor).coerceIn(0f,1f),
            (mean+(c.blue-mean)*factor).coerceIn(0f,1f),c.alpha)
    }
    val accent=chroma(source.accent)
    return source.copy(
        background=lerp(source.background,accent,if(strong) .08f else .035f),
        surface=lerp(source.surface,accent,if(strong) .12f else .055f),
        surfaceAccent=lerp(source.surfaceAccent,accent,if(strong) .26f else .13f),
        accent=accent,
        strokeBorder=lerp(source.strokeBorder,accent,if(strong) .32f else .18f),
        cardBevel=lerp(source.cardBevel,accent,if(strong) .26f else .13f),
        accentBevel=lerp(accent,Color.Black,if(strong) .32f else .22f)
    )
}
