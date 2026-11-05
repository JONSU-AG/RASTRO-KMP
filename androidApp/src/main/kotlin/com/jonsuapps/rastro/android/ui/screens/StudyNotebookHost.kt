package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Redo
import androidx.compose.material.icons.automirrored.rounded.Undo
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.rememberGraphicsLayer
import androidx.compose.ui.graphics.layer.GraphicsLayer
import androidx.compose.ui.graphics.layer.drawLayer
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.input.nestedscroll.*
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.ui.components.StudyChoiceField
import com.jonsuapps.rastro.android.ui.components.StudyOptionsDialog
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.accentText
import kotlin.math.roundToInt

/** One native ink engine, question-scoped geometry and activity-scoped bounded retention. */
@Composable
internal fun StudyNotebookHost(contentKey:String,questionMode:Boolean=false,onOpenChanged:(Boolean)->Unit={},drawingContent:(@Composable ()->Unit)?=null,content:@Composable ()->Unit) {
    val context=LocalContext.current
    var host:android.content.Context=context
    while(host is android.content.ContextWrapper && host !is androidx.activity.ComponentActivity)host=host.baseContext
    val owner=host as? androidx.activity.ComponentActivity ?: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.current!!
    val model=androidx.lifecycle.viewmodel.compose.viewModel<QuestionNotebookModel>(viewModelStoreOwner=owner,key="rastro_question_notebooks")
    val uid=com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.uid ?: "guest"
    val key="$uid:$contentKey"
    val doc=remember(key){model.documents.document(key)}
    if(questionMode) SideEffect {doc.annotate=false}
    var open by remember {mutableStateOf(false)}
    androidx.activity.compose.BackHandler(enabled=open) {open=false}
    var settings by remember {mutableStateOf(false)}
    var rgb by remember {mutableStateOf(false)}
    var scrollY by remember(key){mutableFloatStateOf(0f)}
    val theme=ThemeManager.currentTheme
    val exportLayer=rememberGraphicsLayer()
    LaunchedEffect(open){onOpenChanged(open)}
    DisposableEffect(key,open){
        if(open)model.documents.activate(key)
        onDispose {doc.releaseRaster();model.documents.deactivate(key)}
    }
    val connection=remember(key){object:NestedScrollConnection {
        override fun onPostScroll(consumed:Offset,available:Offset,source:NestedScrollSource):Offset {scrollY+=consumed.y;return Offset.Zero}
    }}
    val controller=StudyNotebookController(open){open=!open}
    @Composable fun ContentArea(modifier:Modifier) {
        Box(modifier.nestedScroll(connection)) {
            content()
            if(open && doc.annotate) NotebookCanvas(doc,true,Modifier.matchParentSize(),scrollY)
        }
    }
    @Composable fun Paper(modifier:Modifier) {
        Surface(modifier,color=theme.surface) {
            Column((if(doc.annotate) Modifier.fillMaxWidth() else Modifier.fillMaxSize()).navigationBarsPadding()) {
                NotebookToolbar(doc,{settings=true},{open=false})
                if(!doc.annotate) NotebookCanvas(doc,false,Modifier.weight(1f).fillMaxWidth().background(Color.White))
            }
        }
    }
    CompositionLocalProvider(LocalStudyNotebook provides controller,LocalQuestionDrawing provides (open && questionMode)) {
        if(questionMode && drawingContent!=null) {
            content()
            if(open) androidx.compose.ui.window.Dialog(onDismissRequest={open=false},properties=androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth=false,decorFitsSystemWindows=false)) {
                Surface(Modifier.fillMaxSize(),color=theme.background) {
                    // Use raw window insets: inherited consumed insets from the app Scaffold
                    // must not make this separate dialog place its controls under Android navigation.
                    Column(Modifier.fillMaxSize().padding(WindowInsets.safeDrawing.asPaddingValues())) {
                        Row(Modifier.fillMaxWidth().padding(horizontal=8.dp),verticalAlignment=Alignment.CenterVertically) {
                            IconButton(onClick={open=false}) {Icon(Icons.Rounded.Close,"Volver a la pregunta",tint=theme.textPrimary)}
                            Text("Pizarra",Modifier.weight(1f),style=MaterialTheme.typography.titleMedium,color=theme.textPrimary,fontWeight=androidx.compose.ui.text.font.FontWeight.Bold)
                            QuestionNotebookExportActions(model) {
                                if(exportLayer.size.width<=0 || exportLayer.size.height<=0) null
                                else exportLayer.toImageBitmap().asAndroidBitmap().copy(android.graphics.Bitmap.Config.ARGB_8888,false)
                            }
                        }
                        BoxWithConstraints(Modifier.weight(1f).fillMaxWidth()) {
                            if(maxWidth>maxHeight && maxWidth>=480.dp) Row(Modifier.fillMaxSize()) {
                                QuestionNotebookPage(doc,drawingContent,exportLayer,Modifier.weight(1f).fillMaxHeight())
                                Column(Modifier.width(184.dp).fillMaxHeight().verticalScroll(rememberScrollState())) {NotebookControls(doc,{settings=true},{rgb=true})}
                            } else Column(Modifier.fillMaxSize()) {
                                QuestionNotebookPage(doc,drawingContent,exportLayer,Modifier.weight(1f).fillMaxWidth())
                                NotebookControls(doc,{settings=true},{rgb=true})
                            }
                        }
                    }
                }
            }
        } else {
        BoxWithConstraints(Modifier.fillMaxSize()) {
            val wide=maxWidth>maxHeight && maxWidth>=480.dp
            if(open && !doc.annotate && wide) Row(Modifier.fillMaxSize()) {
                ContentArea(Modifier.weight(.46f).fillMaxHeight())
                Paper(Modifier.weight(.54f).fillMaxHeight())
            } else Column(Modifier.fillMaxSize()) {
                ContentArea(Modifier.weight(if(open && !doc.annotate).47f else 1f).fillMaxWidth())
                if(open) Paper(if(doc.annotate)Modifier.fillMaxWidth().heightIn(min=48.dp) else Modifier.weight(.53f).fillMaxWidth())
            }
        }
        }
    }
    if(settings) StudyOptionsDialog("Pizarra",{settings=false}) {
        TextButton(onClick={rgb=true}){Text("Color RGB")}
        Text("Grosor: ${doc.thickness.roundToInt()}",color=theme.textPrimary)
        Slider(doc.thickness,{doc.thickness=it.roundToInt().toFloat()},valueRange=1f..100f,steps=98)
        StudyChoiceField("Borrador",listOf(false,true),doc.precise,{if(it)"Precisión" else "Por trazo"}){doc.precise=it;doc.eraser=true;doc.hand=false}
        if(!questionMode) Row(verticalAlignment=Alignment.CenterVertically){Text("Resaltar enunciado",Modifier.weight(1f),color=theme.textPrimary);Switch(doc.annotate,{doc.annotate=it;doc.hand=false})}
        TextButton(onClick={if(doc.annotate)doc.marksViewport=InkViewport() else doc.viewport=InkViewport()}){Text("Restablecer vista")}
        TextButton(onClick={if(doc.annotate)doc.marks.clear() else doc.paper.clear()}){Text("Limpiar dibujo")}
    }
    if(rgb) PizarraRgbDialog(doc.argb,{rgb=false}){doc.argb=it;doc.eraser=false;doc.hand=false;rgb=false}
}

/** Text and ink share an origin and transform; neither is captured into a large bitmap. */
@Composable
private fun QuestionNotebookPage(doc:QuestionInkDocument,statement:@Composable ()->Unit,exportLayer:GraphicsLayer,modifier:Modifier) {
    val theme=ThemeManager.currentTheme
    BoxWithConstraints(modifier.clipToBounds().drawWithContent {
        exportLayer.record {this@drawWithContent.drawContent()}
        drawLayer(exportLayer)
    }.background(theme.surface)) {
        // Keep wrapping stable when rotating so annotations stay attached to their words.
        val paperWidth=if(doc.pageWidthDp>0f)doc.pageWidthDp.dp else maxWidth
        SideEffect {if(doc.pageWidthDp==0f)doc.pageWidthDp=maxWidth.value}
        val view=doc.viewport
        Column(Modifier.wrapContentSize(Alignment.TopStart,unbounded=true).width(paperWidth).wrapContentHeight(align=Alignment.Top,unbounded=true).graphicsLayer {
            transformOrigin=androidx.compose.ui.graphics.TransformOrigin(0f,0f)
            scaleX=view.zoom;scaleY=view.zoom;translationX=view.panX;translationY=view.panY
        }.padding(20.dp)) {statement()}
        NotebookCanvas(doc,false,Modifier.matchParentSize())
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun NotebookControls(doc:QuestionInkDocument,onSettings:()->Unit,onRgb:()->Unit) {
    val theme=ThemeManager.currentTheme
    Column(Modifier.fillMaxWidth().background(theme.background).padding(horizontal=8.dp,vertical=4.dp)) {
        NotebookToolbar(doc,onSettings,onClose=null)
        Row(Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically) {
            Text("Grosor",color=theme.textPrimary,style=MaterialTheme.typography.labelMedium)
            Slider(doc.thickness,{doc.thickness=it.roundToInt().toFloat()},Modifier.weight(1f).padding(horizontal=8.dp),valueRange=1f..100f,steps=98)
            Text(doc.thickness.roundToInt().toString(),color=theme.textPrimary,style=MaterialTheme.typography.labelLarge)
        }
        FlowRow(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.spacedBy(8.dp),verticalArrangement=Arrangement.spacedBy(4.dp)) {
            listOf(0xFF172033,0xFFDC3737,0xFFEB9B08,0xFF16844F,0xFF2563EB,0xFF8438D9).forEach {value->
                val color=value.toInt()
                Box(Modifier.size(36.dp).semantics {contentDescription=when(color){0xFF172033.toInt()->"Negro";0xFFDC3737.toInt()->"Rojo";0xFFEB9B08.toInt()->"Naranja";0xFF16844F.toInt()->"Verde";0xFF2563EB.toInt()->"Azul";else->"Morado"};selected=doc.argb==color && !doc.eraser}
                    .background(Color(color),RoundedCornerShape(18.dp)).border(if(doc.argb==color && !doc.eraser)3.dp else 1.dp,theme.strokeBorder,RoundedCornerShape(18.dp))
                    .clickable {doc.argb=color;doc.eraser=false;doc.hand=false},contentAlignment=Alignment.Center) {
                    if(doc.argb==color && !doc.eraser) Icon(Icons.Rounded.Check,null,tint=Color.White,modifier=Modifier.size(20.dp))
                }
            }
            IconButton(onClick=onRgb,modifier=Modifier.size(36.dp)) {Icon(Icons.Rounded.Palette,"Más colores RGB",tint=theme.textPrimary)}
        }

        FlowRow(Modifier.fillMaxWidth().heightIn(min=48.dp),horizontalArrangement=Arrangement.spacedBy(8.dp)) {
            FilterChip(doc.eraser && !doc.precise,{doc.precise=false;doc.eraser=true;doc.hand=false},label={Text("Borrar por trazo")})
            FilterChip(doc.eraser && doc.precise,{doc.precise=true;doc.eraser=true;doc.hand=false},label={Text("Precisión")})
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun NotebookToolbar(doc:QuestionInkDocument,onSettings:()->Unit,onClose:(()->Unit)?) {
    val theme=ThemeManager.currentTheme
    val engine=if(doc.annotate)doc.marks else doc.paper
    FlowRow(Modifier.fillMaxWidth().padding(horizontal=4.dp),horizontalArrangement=Arrangement.SpaceEvenly) {
        @Composable fun Tool(label:String,icon:androidx.compose.ui.graphics.vector.ImageVector,active:Boolean=false,enabled:Boolean=true,click:()->Unit) {
            IconButton(onClick=click,enabled=enabled,modifier=Modifier.size(44.dp).semantics {selected=active}.background(if(active)theme.surfaceAccent else Color.Transparent,RoundedCornerShape(12.dp)).border(if(active)2.dp else 0.dp,if(active)theme.accentText else Color.Transparent,RoundedCornerShape(12.dp))) {
                Icon(icon,label,tint=if(active)theme.accentText else theme.textPrimary.copy(alpha=if(enabled)1f else .35f))
            }
        }
        Tool("Lápiz",Icons.Rounded.Draw,!doc.hand && !doc.eraser){doc.hand=false;doc.eraser=false}
        Tool("Mano: desplazar y ampliar",Icons.Rounded.PanTool,doc.hand){doc.hand=true;doc.eraser=false}
        IconButton(onClick={doc.eraser=true;doc.hand=false},modifier=Modifier.size(44.dp).semantics {selected=doc.eraser}.background(if(doc.eraser)theme.surfaceAccent else Color.Transparent,RoundedCornerShape(12.dp))) {Icon(painterResource(R.drawable.ic_pizarra_eraser),"Borrador",tint=if(doc.eraser)theme.accentText else theme.textPrimary)}
        Tool("Deshacer",Icons.AutoMirrored.Rounded.Undo,enabled=engine.canUndo){engine.undo()}
        Tool("Rehacer",Icons.AutoMirrored.Rounded.Redo,enabled=engine.canRedo){engine.redo()}
        Tool("Ajustes",Icons.Rounded.Tune,click=onSettings)
        if(onClose!=null) Tool("Cerrar pizarra",Icons.Rounded.Close,click=onClose)
    }
}

@Composable
private fun NotebookCanvas(doc:QuestionInkDocument,annotate:Boolean,modifier:Modifier,scrollY:Float=0f) {
    val density=LocalDensity.current
    val engine=if(annotate)doc.marks else doc.paper
    fun base()=if(annotate)doc.marksViewport else doc.viewport
    fun effective()=base().let {if(annotate)it.copy(panY=it.panY+scrollY) else it}
    fun update(v:InkViewport){if(annotate)doc.marksViewport=v.copy(panY=v.panY-scrollY) else doc.viewport=v;engine.setViewport(effective())}
    SideEffect {engine.setViewport(effective())}
    Canvas(modifier.clipToBounds().onSizeChanged(engine::resize).then(if(annotate && doc.hand)Modifier else Modifier.pointerInput(engine,doc.hand,doc.eraser,doc.precise,doc.argb,doc.thickness) {
        awaitEachGesture {
            val down=awaitFirstDown(requireUnconsumed=false);down.consume()
            var inking=!doc.hand
            var transformed=false
            val width=with(density){doc.thickness.dp.toPx()}/effective().zoom
            if(inking)engine.begin(effective().world(down.position),if(annotate)doc.argb and 0x00FFFFFF or 0x66000000 else doc.argb,width,doc.eraser,doc.precise)
            try {
                do {
                    val event=awaitPointerEvent();val pressed=event.changes.filter {it.pressed}
                    if(pressed.size>=2){
                        if(inking){engine.finish(cancelled=true);inking=false}
                        transformed=true
                        if(!annotate)update(effective().gesture(event.calculateCentroid(useCurrent=false),event.calculatePan(),event.calculateZoom()))
                    }else if(pressed.size==1){
                        val change=pressed.first()
                        if(doc.hand || transformed){if(!annotate)update(effective().gesture(change.previousPosition,change.position-change.previousPosition,1f))}
                        else if(inking)engine.move(effective().world(change.position))
                    }
                    event.changes.forEach {it.consume()}
                }while(event.changes.any {it.pressed})
                if(inking)engine.finish()
            }finally {if(engine.pointer!=null)engine.finish(cancelled=true)}
        }
    })) {
        @Suppress("UNUSED_VARIABLE")val revision=engine.revision
        drawIntoCanvas {canvas->
            engine.bitmap?.let {canvas.nativeCanvas.drawBitmap(it,null,android.graphics.RectF(0f,0f,engine.size.width.toFloat(),engine.size.height.toFloat()),null)}
            engine.drawActive(canvas.nativeCanvas)
        }
        if(doc.eraser)engine.pointer?.let {p->val center=effective().screen(p);val radius=with(density){doc.thickness.dp.toPx()}/2;drawCircle(Color.White,radius,center,style=Stroke(4.dp.toPx()));drawCircle(Color(0xFF172033),radius,center,style=Stroke(1.5.dp.toPx()))}
    }
}
