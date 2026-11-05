package com.jonsuapps.rastro.android.ui.components

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.jonsuapps.rastro.model.EducationalVisual
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.*
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ViewInAr
import androidx.compose.material.icons.rounded.ZoomIn
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.theme.accentText
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState

internal const val CARDIO_POSTER="educational-visuals/pilots/cardiovascular83/heart-poster.png"

@Composable
internal fun CardiovascularPilotCard(resource:EducationalVisual) {
    NativeStudyModelCard(resource,CARDIO_POSTER,"educational-visuals/heart-bodyparts.glb",::decodeCardiovascularMesh)
}

@Composable
internal fun PlantCellPilotCard(resource:EducationalVisual) {
    NativeStudyModelCard(resource,"educational-visuals/cellforge-plant-poster.jpg","educational-visuals/cellforge-plant.glb",::decodePlantCellMesh,CardiovascularCamera(yaw=-90f,pitch=0f))
}

@Composable
private fun NativeStudyModelCard(resource:EducationalVisual,posterAsset:String,modelAsset:String,decoder:(ByteArray)->CardiovascularMesh,initialCamera:CardiovascularCamera=CardiovascularCamera()) {
    val theme=ThemeManager.currentTheme
    val context=LocalContext.current
    var posterLoading by remember(posterAsset) {mutableStateOf(true)}
    val poster by produceState<ImageBitmap?>(null, posterAsset) {
        value=null
        value=withContext(Dispatchers.IO){runCatching {context.assets.open(posterAsset).use {BitmapFactory.decodeStream(it)?.asImageBitmap()}}.getOrNull()}
        posterLoading=false
    }
    var expanded by remember(resource.id) {mutableStateOf(false)}
    var threeD by remember(resource.id) {mutableStateOf(false)}
    Column(verticalArrangement=Arrangement.spacedBy(8.dp)) {
        Row(Modifier.fillMaxWidth(), verticalAlignment=Alignment.CenterVertically) {
            Text(resource.title,Modifier.weight(1f),fontWeight=FontWeight.Bold,color=theme.textPrimary)
            Icon(Icons.Rounded.ViewInAr,"Modelo 3D disponible",tint=theme.accentText,modifier=Modifier.size(22.dp))
        }
        Surface(shape=RoundedCornerShape(18.dp),border=androidx.compose.foundation.BorderStroke(1.dp,theme.strokeBorder)) {
            CardiovascularPoster(poster,Modifier.fillMaxWidth().height(220.dp),resource.title,posterLoading)
        }
        Row(horizontalArrangement=Arrangement.spacedBy(8.dp)) {
            Sticker3dButton(onClick={threeD=false;expanded=true},modifier=Modifier.weight(1f),containerColor=theme.surface,contentPadding=PaddingValues(10.dp)){
                Icon(Icons.Rounded.ZoomIn,null,Modifier.size(18.dp),tint=theme.textPrimary)
                Spacer(Modifier.width(6.dp));Text("Ampliar",color=theme.textPrimary)
            }
            Sticker3dButton(onClick={threeD=true;expanded=true},modifier=Modifier.weight(1f),containerColor=theme.accent,contentPadding=PaddingValues(10.dp)){
                Icon(Icons.Rounded.ViewInAr,null,Modifier.size(18.dp),tint=theme.onAccent)
                Spacer(Modifier.width(6.dp));Text("Ver en 3D",fontWeight=FontWeight.Bold,color=theme.onAccent)
            }
        }
        EducationalSourceDetails(resource,false)
    }
    if(expanded) Dialog(onDismissRequest={expanded=false},properties=DialogProperties(usePlatformDefaultWidth=false,decorFitsSystemWindows=false)) {
        Surface(Modifier.fillMaxSize(),color=theme.background) {
            Column(Modifier.fillMaxSize().safeDrawingPadding().padding(12.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
                Row(verticalAlignment=Alignment.CenterVertically){Text(resource.title,Modifier.weight(1f),color=theme.textPrimary,fontWeight=FontWeight.Bold);TextButton(onClick={expanded=false}){Text("Cerrar")}}
                if(threeD) {
                    Text(if(isPlantCellPilot(resource)) "Toca una parte · Arrastra para girar" else "Arrastra para girar · Pellizca para ampliar",color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
                    CardiovascularNativeModel(poster,Modifier.weight(1f).fillMaxWidth(),modelAsset,decoder,initialCamera,resource.title)
                    TextButton(onClick={threeD=false}){Text("Ver imagen")}
                }else {
                    var zoom by remember {mutableFloatStateOf(1f)}
                    var offset by remember {mutableStateOf(Offset.Zero)}
                    Box(Modifier.weight(1f).fillMaxWidth().clipToBounds().background(Color.White).transformable(rememberTransformableState {scale,pan,_->zoom=(zoom*scale).coerceIn(1f,5f);offset=if(zoom==1f) Offset.Zero else offset+pan})) {
                        CardiovascularPoster(poster,Modifier.fillMaxSize().graphicsLayer(scaleX=zoom,scaleY=zoom,translationX=offset.x,translationY=offset.y))
                    }
                }
                Column(Modifier.heightIn(max=140.dp).verticalScroll(rememberScrollState())) {
                    EducationalSourceDetails(resource,threeD)
                }
            }
        }
    }
}

@Composable
private fun CardiovascularPoster(image:ImageBitmap?,modifier:Modifier,description:String="Ilustración para estudiar",loading:Boolean=false) {
    Box(modifier.background(Color.White),contentAlignment=Alignment.Center) {
        if(image!=null) Image(image,description,Modifier.fillMaxSize(),contentScale=ContentScale.Fit)
        else if(loading) CircularProgressIndicator(Modifier.size(24.dp))
        else Text("Imagen no disponible",color=Color(0xFF172033))
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun CardiovascularNativeModel(poster:ImageBitmap?,modifier:Modifier,modelAsset:String,decoder:(ByteArray)->CardiovascularMesh,initialCamera:CardiovascularCamera,title:String) {
    val context=LocalContext.current
    val lifecycle=LocalLifecycleOwner.current.lifecycle
    var mesh by remember(modelAsset) {mutableStateOf<CardiovascularMesh?>(null)}
    var failed by remember(modelAsset) {mutableStateOf(false)}
    var ready by remember(modelAsset) {mutableStateOf(false)}
    var retry by remember(modelAsset) {mutableIntStateOf(0)}
    var surface by remember(modelAsset) {mutableStateOf<CardiovascularPilotSurface?>(null)}
    var selectedPart by remember(modelAsset) {mutableStateOf<String?>(null)}
    var isolated by remember(modelAsset) {mutableStateOf(false)}
    var separated by remember(modelAsset) {mutableStateOf(false)}
    val separation=remember(modelAsset){Animatable(0f)}
    LaunchedEffect(separated){separation.animateTo(if(separated)1f else 0f,tween(350))}
    LaunchedEffect(modelAsset,retry) {
        failed=false;ready=false;mesh=null
        try {
            val source=withContext(Dispatchers.IO){
                Triple(context.assets.open(modelAsset).use {it.readBytes()},
                    if(modelAsset.endsWith("cellforge-plant.glb")) context.assets.open("educational-visuals/cellforge-plant-parts.json").bufferedReader().use {it.readText()} else null,
                    if(modelAsset.endsWith("cellforge-plant.glb")) context.assets.open("educational-visuals/cellforge-plant-parts.bin").use {it.readBytes()} else null)
            }
            mesh=withContext(Dispatchers.Default){
                val decoded=decoder(source.first)
                if(source.second!=null) attachPlantCellParts(decoded,source.second!!,source.third!!,source.first) else decoded
            }
            delay(15_000)
            if(!ready) failed=true
        }catch(e:CancellationException){throw e}catch(_:Exception){failed=true}
    }
    DisposableEffect(surface,lifecycle) {
        val observer=LifecycleEventObserver {_,event->when(event){Lifecycle.Event.ON_PAUSE->surface?.onPause();Lifecycle.Event.ON_RESUME->surface?.onResume();else->Unit}}
        lifecycle.addObserver(observer)
        onDispose{lifecycle.removeObserver(observer)}
    }
    BoxWithConstraints(modifier) {
        val controlsMaxHeight=(maxHeight*.45f).coerceAtMost(240.dp)
        Column(Modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth(),contentAlignment=Alignment.Center) {
            CardiovascularPoster(poster,Modifier.fillMaxSize())
            val loaded=mesh
            if(loaded!=null && !failed) key(retry) {
                AndroidView(modifier=Modifier.fillMaxSize(),factory={CardiovascularPilotSurface(it,loaded,{ready=true},{failed=true},initialCamera,"$title. Toca una parte para identificarla; arrastra para girar.",
                    {part->selectedPart=part}).also {view->surface=view}},
                    update={it.setPartView(selectedPart,isolated,separation.value)},onRelease={it.releaseSource();it.onPause()})
            }
            if(!ready && !failed) Surface(color=Color.White.copy(alpha=.94f)) {Row(Modifier.padding(12.dp),verticalAlignment=Alignment.CenterVertically,horizontalArrangement=Arrangement.spacedBy(8.dp)){CircularProgressIndicator(Modifier.size(22.dp));Text("Abriendo modelo 3D…",color=Color(0xFF172033))}}
        }
        if(failed) {
            Text("No se pudo abrir el modelo 3D. La imagen sigue disponible.",color=ThemeManager.currentTheme.textPrimary)
            TextButton(onClick={retry++}){Text("Reintentar 3D")}
        }else if(ready) {
            Column(Modifier.fillMaxWidth().heightIn(max=controlsMaxHeight).verticalScroll(rememberScrollState()),
                verticalArrangement=Arrangement.spacedBy(6.dp)) {
            val parts=mesh?.parts.orEmpty()
            if(parts.isNotEmpty()) {
                StudyChoiceField("Parte",listOf<String?>(null)+parts.map {it.id},selectedPart,{id->parts.firstOrNull {it.id==id}?.name ?: "Célula completa"}){selectedPart=it;isolated=false}
                parts.firstOrNull {it.id==selectedPart}?.let {part->Text(part.description,color=ThemeManager.currentTheme.textPrimary,style=MaterialTheme.typography.bodySmall)}
                FlowRow(Modifier.fillMaxWidth()) {
                    TextButton(onClick={separated=!separated;isolated=false}){Text(if(separated) "Unir partes" else "Separar partes")}
                    TextButton(onClick={isolated=!isolated;separated=false},enabled=selectedPart!=null){Text(if(isolated) "Ver todas" else "Aislar parte")}
                    TextButton(onClick={surface?.resetCamera()}){Text("Centrar")}
                    if(selectedPart!=null) TextButton(onClick={selectedPart=null;isolated=false;separated=false;surface?.resetCamera()}){Text("Modelo completo")}
                }
            }else TextButton(onClick={surface?.resetCamera()}){Text("Centrar modelo")}
            }
        }
    }
}
}
