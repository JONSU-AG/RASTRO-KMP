package com.jonsuapps.rastro.android.ui.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.luminance
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class CourseBannerContrastTest {
    @Test fun protectionAdaptsAndControlsDoNotDependOnImageColors() {
        RastroThemeId.entries.forEach { id ->
            val colors = bannerContrast(RastroThemeTokens.getColors(id))
            assertTrue("$id progress/track", bannerRatio(colors.progress, colors.track) >= 3f)
            assertTrue("$id dark banner", bannerProtection(Color.Black, colors.ink) == 0f)
            assertTrue("$id bright banner", bannerProtection(Color.White, colors.ink) > .5f)
            listOf(Color.White, Color.Black, Color.Yellow, Color.Cyan, Color.Magenta).forEach { background ->
                val overlay = colors.ink.copy(alpha = bannerProtection(background, colors.ink)).compositeOver(background)
                assertTrue("$id text on $background", bannerRatio(colors.foreground, overlay) >= 4.5f)
                assertTrue("$id button on $background", bannerRatio(colors.foreground, colors.button.compositeOver(background)) >= 4.5f)
            }
        }
    }

    @Test fun realLocalBannersRemainReadableInLightAndDarkThemes() {
        val directory = listOf(File("LOGO/BANNER-CURSOS"), File("../LOGO/BANNER-CURSOS")).first { it.isDirectory }
        val brightness = mutableMapOf<String, Float>()
        CourseBanners.files.values.forEach { filename ->
            // Desktop JVM image decoder through reflection: java.desktop is not an Android compile API.
            val bitmap = Class.forName("javax.imageio.ImageIO").getMethod("read", File::class.java).invoke(null, File(directory, filename))
            val type = bitmap.javaClass
            val width = type.getMethod("getWidth").invoke(bitmap) as Int
            val height = type.getMethod("getHeight").invoke(bitmap) as Int
            val pixelAt = type.getMethod("getRGB", Int::class.javaPrimitiveType, Int::class.javaPrimitiveType)
            val samples = buildList<Color> {
                for(y in 0 until height step 8) for(x in 0 until (width * .7f).toInt() step 8) {
                    val pixel = pixelAt.invoke(bitmap, x, y) as Int
                    add(Color((pixel shr 16) and 255, (pixel shr 8) and 255, pixel and 255))
                }
            }
            brightness[filename] = samples.map { it.luminance() }.average().toFloat()
            // Independent worst-case RGB bound checks every sampled bright/colorful detail.
            val bound = Color(samples.maxOf { it.red }, samples.maxOf { it.green }, samples.maxOf { it.blue })
            listOf(RastroThemeId.LIGHT, RastroThemeId.DARK).forEach { id ->
                val colors = bannerContrast(RastroThemeTokens.getColors(id))
                val alpha = bannerProtection(bound, colors.ink)
                samples.forEach { pixel -> assertTrue("$filename/$id", bannerRatio(colors.foreground,
                    colors.ink.copy(alpha = alpha).compositeOver(pixel)) >= 4.5f) }
            }
        }
        assertEquals(20, brightness.size)
        println("Banner claro: ${brightness.maxBy { it.value }}; oscuro: ${brightness.minBy { it.value }}; Raz. Lógico incluido.")
    }
}
