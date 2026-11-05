package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.delay

/** A reading outline from explicit lists, never a generated causal or chronological relation. */
internal fun academicMapLabels(section: AcademicSection): List<String> {
    val branches = section.branchCards.map { AcademicPresentationText.clean(it.name).replace("**", "") }
    val terms = if (branches.size in 2..8) branches else
        academicDefinitionTable(section.definitions)?.rows?.map { it.first() }.orEmpty()
    return terms.takeIf { it.size in 2..8 && it.all { term -> term.isNotBlank() && term.length <= 90 } && it.distinct().size == it.size }.orEmpty()
}

@Composable
internal fun AcademicConceptMap(section: AcademicSection) {
    val labels = remember(section) { academicMapLabels(section) }
    if (labels.isEmpty()) return
    var open by remember(section) { mutableStateOf(false) }
    var visible by remember(section) { mutableIntStateOf(1) }
    var playing by remember(section) { mutableStateOf(false) }
    PauseLearningPlaybackWhenInactive { playing = false }
    val theme = ThemeManager.currentTheme
    val ink = academicInk(theme.isDark)
    LaunchedEffect(playing) {
        if(playing) {
            if(visible >= labels.size) visible=1
            while(visible < labels.size) { delay(1300); visible++ }
            playing=false
        }
    }
    Column(Modifier.fillMaxWidth()) {
        TextButton(onClick={open=!open;playing=false}) { Text(if(open)"Cerrar esquema" else "Ver esquema de conceptos") }
        if(open) Surface(color=theme.surfaceAccent,shape=RoundedCornerShape(16.dp),border=BorderStroke(1.dp,theme.borderSubtle)) {
            Column(Modifier.fillMaxWidth().padding(12.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
                AcademicText(section.title, theoryStyle=true,color=theme.textPrimary,fontWeight=FontWeight.Bold)
                Text("Conceptos de esta sección",color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
                labels.forEachIndexed { index, label ->
                    AnimatedVisibility(index < visible, enter=fadeIn()) {
                        Row(Modifier.fillMaxWidth()) {
                            Canvas(Modifier.width(20.dp).height(40.dp)) {
                                drawLine(ink.concept,Offset(size.width/2,0f),Offset(size.width/2,size.height),2.dp.toPx())
                                drawLine(ink.concept,Offset(size.width/2,size.height/2),Offset(size.width,size.height/2),2.dp.toPx())
                            }
                            Surface(color=theme.surface,shape=RoundedCornerShape(10.dp),border=BorderStroke(1.dp,theme.borderSubtle)) {
                                AcademicText(label,modifier=Modifier.fillMaxWidth().padding(10.dp),theoryStyle=true,color=ink.concept)
                            }
                        }
                    }
                }
                Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                    TextButton(onClick={playing=!playing}) { Text(if(playing)"Pausar" else "Reproducir") }
                    TextButton(enabled=visible<labels.size,onClick={playing=false;visible++}) { Text("Siguiente") }
                }
                Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                    TextButton(onClick={playing=false;visible=1}) { Text("Reiniciar") }
                    TextButton(onClick={playing=false;visible=labels.size}) { Text("Ver completo") }
                }
            }
        }
    }
}
