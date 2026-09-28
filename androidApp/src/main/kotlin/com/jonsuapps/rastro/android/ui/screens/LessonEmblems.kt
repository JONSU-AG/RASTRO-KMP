package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.jonsuapps.rastro.model.LessonNode
import java.text.Normalizer

/** Content-based pictograms; lesson position never determines the subject of an icon. */
internal fun lessonEmblem(lesson: LessonNode): ImageVector? {
    val title = Normalizer.normalize(lesson.title.lowercase(), Normalizer.Form.NFD).replace(Regex("\\p{M}"), "")
    fun has(vararg words: String) = words.any { it in title }
    return when {
        has("cofre") -> Icons.Rounded.Inventory2
        has("trofeo") -> Icons.Rounded.EmojiEvents
        has("fotosint", "cloroplast") -> Icons.Rounded.WbSunny
        has("plantae", "vegetal", "botan") -> Icons.Rounded.LocalFlorist
        has("tejido", "epitel", "conectivo") -> Icons.Rounded.GridView
        has("reino", "dominio", "clasifica") -> Icons.Rounded.AccountTree
        has("ecosistema", "ecorregion", "ecologia") -> Icons.Rounded.Forest
        has("sostenib", "ambiente") -> Icons.Rounded.Eco
        has("trofica", "aliment") -> Icons.Rounded.Restaurant
        has("evoluc", "origen") -> Icons.Rounded.Public
        has("agua", "fluido", "hidro") -> Icons.Rounded.WaterDrop
        has("azucar", "sacarido", "gluc") -> Icons.Rounded.Hexagon
        has("lipido", "grasa") -> Icons.Rounded.Opacity
        has("proteina", "enzima") -> Icons.Rounded.Extension
        has("adn", "arn", "cromos", "genet", "mendel", "herencia") -> Icons.Rounded.Hub
        has("mitosis", "meiosis", "gameto", "ciclo e") -> Icons.Rounded.BubbleChart
        has("membrana", "nucleo", "organelo", "celula", "procariot") -> Icons.Rounded.Biotech
        has("virus", "inmun", "patologia") -> Icons.Rounded.HealthAndSafety
        has("nerv", "sinapsis", "memoria", "pensamiento", "cognit") -> Icons.Rounded.Psychology
        has("digest") -> Icons.Rounded.Restaurant
        has("cardio", "circul") -> Icons.Rounded.MonitorHeart
        has("respira", "atmosfera", "viento") -> Icons.Rounded.Air
        has("excret", "nefron") -> Icons.Rounded.FilterAlt
        has("muscul", "fuerza", "newton") -> Icons.Rounded.FitnessCenter
        has("endocr", "hormona") -> Icons.Rounded.ScatterPlot
        has("bioelement", "atomo", "quimic", "molecul", "enlace") -> Icons.Rounded.Science
        has("nivel", "organizac") -> Icons.Rounded.Layers
        has("dimension", "unidad", "medida") -> Icons.Rounded.Straighten
        has("vector", "componente") -> Icons.Rounded.OpenWith
        has("mruv", "acelera", "veloci", "mru") -> Icons.Rounded.Speed
        has("caida", "gravedad") -> Icons.Rounded.South
        has("parabol", "alcance", "altura") -> Icons.Rounded.TrendingUp
        has("mcu", "centrip", "rotac", "momento") -> Icons.Rounded.RotateRight
        has("equilibr", "balanza") -> Icons.Rounded.Balance
        has("electr", "corriente", "carga") -> Icons.Rounded.Bolt
        has("onda", "sonido", "fourier") -> Icons.Rounded.Waves
        has("calor", "temper", "termo") -> Icons.Rounded.Thermostat
        has("luz", "optica") -> Icons.Rounded.LightMode
        has("polinom", "ecuaci", "factor", "algebra") -> Icons.Rounded.Functions
        has("triang", "geometr", "angulo") -> Icons.Rounded.ChangeHistory
        has("fraccion", "porcent", "probab") -> Icons.Rounded.PieChart
        has("suces", "serie", "logica", "inferen") -> Icons.Rounded.Schema
        has("lengua", "comunic", "fon", "verbal", "sinon", "anton") -> Icons.Rounded.Forum
        has("texto", "liter", "poes", "genero", "narrat") -> Icons.AutoMirrored.Rounded.MenuBook
        has("historia", "cultura", "inca", "republic", "indepen") -> Icons.Rounded.AccountBalance
        has("derecho", "constit", "estado", "etica") -> Icons.Rounded.Gavel
        has("relieve", "region", "mapa", "cartograf") -> Icons.Rounded.Terrain
        has("tiempo", "crono", "edad") -> Icons.Rounded.Schedule
        else -> null
    }
}
