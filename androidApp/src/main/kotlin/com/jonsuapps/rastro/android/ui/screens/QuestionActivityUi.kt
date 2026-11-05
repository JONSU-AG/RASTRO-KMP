package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import kotlinx.coroutines.launch
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager

/** Registration follows actual question composition, including simulator routes and disposal. */
internal object QuestionFocusRegistry {
    private val active=mutableStateMapOf<Any,Boolean>()
    val focused get()=active.isNotEmpty()
    fun enter(token:Any){active[token]=true}
    fun leave(token:Any){active.remove(token)}
}
@Composable internal fun FocusedQuestionMode(enabled:Boolean=true) {
    val token=remember {Any()}
    DisposableEffect(enabled){if(enabled)QuestionFocusRegistry.enter(token);onDispose {QuestionFocusRegistry.leave(token)}}
}
internal data class QuestionProgress(val current:Int,val total:Int,val answered:Int) {
    val safeTotal get()=total.coerceAtLeast(0)
    val safeCurrent get()=current.coerceIn(0,safeTotal)
    val fraction get()=if(safeTotal==0)0f else answered.coerceIn(0,safeTotal).toFloat()/safeTotal
    val label get()="$safeCurrent/$safeTotal"
}

@Composable internal fun QuestionActivityHeader(title:String,progress:QuestionProgress,onBack:()->Unit,
    hearts:String?=null,extras:@Composable RowScope.()->Unit={}) {
    val theme=ThemeManager.currentTheme
    val fill by animateFloatAsState(progress.fraction,label="question_progress")
    Column(Modifier.fillMaxWidth().padding(horizontal=12.dp,vertical=4.dp)) {
        Row(Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically) {
            IconButton(onClick=onBack,modifier=Modifier.size(48.dp)){Icon(Icons.AutoMirrored.Rounded.ArrowBack,"Volver",tint=theme.textPrimary)}
            Text(title,Modifier.weight(1f),style=MaterialTheme.typography.titleSmall,fontWeight=FontWeight.Bold,color=theme.textPrimary,maxLines=2,overflow=TextOverflow.Ellipsis)
            PizarraAccessButton()
            if(hearts!=null) Row(verticalAlignment=Alignment.CenterVertically) {
                Icon(Icons.Rounded.Favorite,"Vidas",tint=Color(0xFFEF4444),modifier=Modifier.size(21.dp))
                Text(hearts,style=MaterialTheme.typography.labelLarge,color=theme.textPrimary)
            }
        }
        Row(Modifier.fillMaxWidth().padding(horizontal=8.dp),verticalAlignment=Alignment.CenterVertically,horizontalArrangement=Arrangement.spacedBy(10.dp)) {
            Box(Modifier.weight(1f).height(14.dp).clip(RoundedCornerShape(9.dp)).background(theme.surfaceAccent).border(1.5.dp,theme.strokeBorder,RoundedCornerShape(9.dp))) {
                Box(Modifier.fillMaxWidth(fill).fillMaxHeight().background(Color(0xFF139667),RoundedCornerShape(9.dp)))
            }
            extras()
            Text(progress.label,style=MaterialTheme.typography.labelMedium,color=theme.textPrimary,fontWeight=FontWeight.Bold)
        }
    }
}

/** The scrollbar occupies its own gutter; the small cue never covers an alternative. */
@Composable internal fun QuestionScrollArea(state:ScrollState,modifier:Modifier=Modifier,content:@Composable ColumnScope.()->Unit) {
    val theme=ThemeManager.currentTheme
    val scope=rememberCoroutineScope()
    Box(modifier) {
        Column(Modifier.fillMaxSize().padding(end=20.dp).verticalScroll(state).padding(horizontal=16.dp,vertical=10.dp),verticalArrangement=Arrangement.spacedBy(12.dp),content=content)
        if(hasQuestionContentBelow(state.value,state.maxValue)) Surface(
            modifier=Modifier.align(Alignment.BottomEnd).padding(end=4.dp,bottom=4.dp).size(28.dp),
            shape=RoundedCornerShape(14.dp),color=theme.surface,
            border=androidx.compose.foundation.BorderStroke(1.dp,theme.strokeBorder)
        ) {
            IconButton(onClick={scope.launch {
                state.animateScrollTo((state.value+(state.viewportSize/2).coerceAtLeast(1)).coerceAtMost(state.maxValue))
            }},modifier=Modifier.size(28.dp)) {
                Icon(Icons.Rounded.KeyboardArrowDown,"Ver más contenido",tint=theme.textPrimary,modifier=Modifier.size(20.dp))
            }
        }
        if(state.maxValue>0) Canvas(Modifier.align(Alignment.CenterEnd).width(3.dp).fillMaxHeight().padding(vertical=4.dp)) {
            val viewport=state.viewportSize.toFloat().coerceAtLeast(1f)
            val thumb=(size.height*viewport/(viewport+state.maxValue)).coerceIn(12.dp.toPx().coerceAtMost(size.height),size.height)
            val top=(size.height-thumb)*state.value/state.maxValue.toFloat()
            drawRoundRect(theme.textSecondary.copy(alpha=.45f),Offset(0f,top),Size(size.width,thumb),CornerRadius(size.width))
        }
    }
}

/** Ignore sub-pixel/rounding overflow; the cue has no influence on viewport height. */
internal fun hasQuestionContentBelow(position:Int,maximum:Int):Boolean = maximum.toLong()-position.toLong()>2L
