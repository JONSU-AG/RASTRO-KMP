package com.jonsuapps.rastro.android.widgets

import com.jonsuapps.rastro.android.navigation.RastroAppLinks
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import java.security.MessageDigest
import java.time.Instant
import javax.xml.parsers.DocumentBuilderFactory

class WidgetIntegrationTest {
    private val main = listOf(File("src/main"), File("androidApp/src/main")).first { it.isDirectory }
    private val androidNs = "http://schemas.android.com/apk/res/android"
    private fun xml(path: String) = DocumentBuilderFactory.newInstance().apply { isNamespaceAware = true }
        .newDocumentBuilder().parse(File(main, path))

    @Test fun longPressActionsOpenExistingLearningAndContributionRoutesOnly() {
        val shortcuts = xml("res/xml/rastro_shortcuts.xml").getElementsByTagName("intent")
        assertEquals(2, shortcuts.length)
        val routes = (0 until shortcuts.length).map {
            val element = shortcuts.item(it) as org.w3c.dom.Element
            assertEquals("com.jonsuapps.rastro.android.MainActivity", element.getAttributeNS(androidNs, "targetClass"))
            RastroAppLinks.routeFromShortcut(element.getAttributeNS(androidNs, "action"))
        }
        assertEquals(listOf("aprender", "biblioteca/aportes"), routes)
        assertNull(RastroAppLinks.routeFromShortcut("android.intent.action.DELETE"))
        assertNull(RastroAppLinks.routeFromShortcut(null))
        val aliases = xml("AndroidManifest.xml").getElementsByTagName("activity-alias")
        for (i in 0 until aliases.length) {
            val alias = aliases.item(i) as org.w3c.dom.Element
            val metadata = alias.getElementsByTagName("meta-data")
            assertTrue((0 until metadata.length).any { index ->
                (metadata.item(index) as org.w3c.dom.Element).getAttributeNS(androidNs, "resource") == "@xml/rastro_shortcuts"
            })
        }
    }

    @Test fun pickerPreviewUsesActualLayoutsAndDeclaredArtworkSizes() {
        val widgets = mapOf("racha_widget_info" to ("widget_racha" to "2"),
            "racha_semanal_widget_info" to ("widget_racha_semanal" to "4"),
            "exam_countdown_widget_info" to ("widget_exam_countdown" to "2"),
            "motivacion_widget_info" to ("widget_motivacion" to "4"))
        widgets.forEach { (info, values) ->
            val root = xml("res/xml/$info.xml").documentElement
            assertEquals(root.getAttributeNS(androidNs, "initialLayout"), root.getAttributeNS(androidNs, "previewLayout"))
            assertEquals("@layout/${values.first}", root.getAttributeNS(androidNs, "previewLayout"))
            assertEquals(values.second, root.getAttributeNS(androidNs, "targetCellWidth"))
            assertEquals("1", root.getAttributeNS(androidNs, "targetCellHeight"))
            val layout = xml("res/layout/${values.first}.xml")
            val image = layout.getElementsByTagName("ImageView").item(0) as org.w3c.dom.Element
            assertEquals("fitCenter", image.getAttributeNS(androidNs, "scaleType"))
            val elements = layout.getElementsByTagName("*")
            for (i in 0 until elements.length) {
                assertFalse((elements.item(i) as org.w3c.dom.Element).hasAttributeNS(androidNs, "layout_weight"))
            }
        }
    }

    @Test fun packagedBackgroundsAreExactCopiesOfUserArtwork() {
        val root = main.absoluteFile.parentFile.parentFile.parentFile
        val files = mapOf("CONTADOR2X1.png" to "widget_bg_contador.png", "FRASE4X1.png" to "widget_bg_frase.png",
            "R-DIARIA2X1.png" to "widget_bg_racha_diaria.png", "R-SEMANAL4X1.png" to "widget_bg_racha_semanal.png")
        files.forEach { (source, resource) ->
            fun hash(file: File) = MessageDigest.getInstance("SHA-256").digest(file.readBytes())
            assertArrayEquals(hash(File(root, "LOGO/WITGET/$source")), hash(File(main, "res/drawable-nodpi/$resource")))
        }
    }

    @Test fun countdownUsesLimaCalendarDaysAndNeverInventsAnUnsetDate() {
        val lateToday = Instant.parse("2026-10-04T04:59:00Z").toEpochMilli()
        assertEquals(1, WidgetDates.daysUntil("2026-10-04", lateToday))
        assertEquals(0, WidgetDates.daysUntil("2026-10-03", lateToday))
        assertEquals(0, WidgetDates.daysUntil("2026-10-02", lateToday))
        assertNull(WidgetDates.daysUntil("", lateToday))
        assertNull(WidgetDates.daysUntil("2026-02-30", lateToday))
        assertNull(WidgetDates.daysUntil("2026-10-04junk", lateToday))
    }
}
