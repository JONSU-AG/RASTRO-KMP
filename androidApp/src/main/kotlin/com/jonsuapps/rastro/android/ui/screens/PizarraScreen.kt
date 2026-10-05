package com.jonsuapps.rastro.android.ui.screens

import android.content.ClipData
import android.content.Intent
import android.graphics.Bitmap
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.drag
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.Redo
import androidx.compose.material.icons.automirrored.rounded.Undo
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.FileProvider
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.onAccent
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import kotlin.math.roundToInt

class PizarraViewModel : androidx.lifecycle.ViewModel() {
    internal val engine = PizarraCanvasEngine()
    var pendingExport: Bitmap? = null
        private set
    fun prepareExport(): Boolean {
        pendingExport?.recycle()
        pendingExport = engine.snapshot()
        return pendingExport != null
    }
    fun takeExport(): Bitmap? = pendingExport.also { pendingExport = null }
    override fun onCleared() { pendingExport?.recycle(); engine.release() }
}

@Composable
fun PizarraScreen(onBack: () -> Unit) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val density = LocalDensity.current
    val model = androidx.lifecycle.viewmodel.compose.viewModel<PizarraViewModel>()
    val engine = model.engine
    val scope = rememberCoroutineScope()
    var argb by rememberSaveable { mutableIntStateOf(0xFF172033.toInt()) }
    var thickness by rememberSaveable { mutableFloatStateOf(9f) }
    var eraser by rememberSaveable { mutableStateOf(false) }
    var preciseEraser by rememberSaveable { mutableStateOf(false) }
    var rgbDialog by rememberSaveable { mutableStateOf(false) }
    var clearDialog by remember { mutableStateOf(false) }
    var exporting by remember { mutableStateOf(false) }
    fun message(text: String) { Toast.makeText(context,text,Toast.LENGTH_SHORT).show() }

    val saveImage = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("image/png")) { uri ->
        val snapshot = model.takeExport()
        if (uri == null || snapshot == null) {
            snapshot?.recycle(); exporting = false
        } else scope.launch {
            try {
                withContext(Dispatchers.IO) {
                    context.contentResolver.openOutputStream(uri)?.use { stream ->
                        check(snapshot.compress(Bitmap.CompressFormat.PNG,100,stream))
                    } ?: error("No se pudo abrir el archivo")
                }
                message("Imagen guardada")
            } catch (e: CancellationException) { throw e }
            catch (_: Exception) { message("No se pudo guardar la imagen. Intenta de nuevo.") }
            finally { snapshot.recycle(); exporting = false }
        }
    }
    LaunchedEffect(engine.notice) {
        engine.notice?.let { message(it); engine.notice = null }
    }

    Surface(Modifier.fillMaxSize(),color = theme.background) {
        Column(Modifier.fillMaxSize().statusBarsPadding().navigationBarsPadding().padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Rounded.ArrowBack,"Volver",tint=theme.textPrimary) }
                Text("Pizarra libre",fontSize=21.sp,fontWeight=FontWeight.ExtraBold,color=theme.textPrimary)
            }
            Row(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),horizontalArrangement=Arrangement.spacedBy(6.dp)) {
                PizarraIconTool("Deshacer",Icons.AutoMirrored.Rounded.Undo,engine.canUndo) { engine.undo() }
                // Tool icons keep every action distinct, including redo after an erase.
                PizarraIconTool("Rehacer",Icons.AutoMirrored.Rounded.Redo,engine.canRedo) { engine.redo() }
                PizarraIconTool("Guardar imagen",Icons.Rounded.Download,!exporting && engine.hasDrawing) {
                    if (model.prepareExport()) {
                        exporting = true
                        saveImage.launch("RASTRO-pizarra-${System.currentTimeMillis()}.png")
                    }
                }
                PizarraIconTool("Compartir imagen",Icons.Rounded.Share,!exporting && engine.hasDrawing) {
                    val snapshot = engine.snapshot()
                    if (snapshot != null) {
                        exporting = true
                        scope.launch {
                            try {
                                val file = withContext(Dispatchers.IO) {
                                    val directory = File(context.cacheDir,"pizarra_exports").apply { check(mkdirs() || isDirectory) }
                                    File.createTempFile("RASTRO-pizarra-",".png",directory).also { output ->
                                        output.outputStream().use { check(snapshot.compress(Bitmap.CompressFormat.PNG,100,it)) }
                                    }
                                }
                                val uri = FileProvider.getUriForFile(context,"${context.packageName}.pizarra.files",file)
                                val intent = Intent(Intent.ACTION_SEND).apply {
                                    type = "image/png"
                                    putExtra(Intent.EXTRA_STREAM,uri)
                                    clipData = ClipData.newUri(context.contentResolver,"Dibujo RASTRO",uri)
                                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                                }
                                context.startActivity(Intent.createChooser(intent,"Compartir dibujo"))
                            } catch (e: CancellationException) { throw e }
                            catch (_: Exception) { message("No se pudo compartir la imagen. Intenta de nuevo.") }
                            finally { snapshot.recycle(); exporting = false }
                        }
                    }
                }
                PizarraIconTool("Limpiar lienzo",Icons.Rounded.DeleteOutline,engine.hasDrawing) { clearDialog=true }
            }
            Sticker3dCard(modifier=Modifier.fillMaxWidth().weight(1f),containerColor=Color.White,
                shape=RoundedCornerShape(22.dp)) {
                Canvas(Modifier.fillMaxSize().clip(RoundedCornerShape(22.dp)).onSizeChanged(engine::resize)
                    .pointerInput(argb,thickness,eraser,preciseEraser,density) {
                        awaitEachGesture {
                            val down = awaitFirstDown(requireUnconsumed=false)
                            down.consume()
                            engine.begin(down.position,argb,with(density) { thickness.dp.toPx() },eraser,preciseEraser)
                            try {
                                val completed = drag(down.id) { change -> engine.move(change.position); change.consume() }
                                engine.finish(cancelled=!completed)
                            } finally {
                                if (engine.pointer != null) engine.finish(cancelled=true)
                            }
                        }
                    }) {
                    @Suppress("UNUSED_VARIABLE") val revision = engine.revision
                    drawIntoCanvas { canvas ->
                        engine.bitmap?.let { bitmap ->
                            canvas.nativeCanvas.drawBitmap(bitmap,null,android.graphics.RectF(0f,0f,engine.size.width.toFloat(),engine.size.height.toFloat()),null)
                        }
                        engine.drawActive(canvas.nativeCanvas)
                    }
                    if (eraser) engine.pointer?.let { position ->
                        val radius = with(density) { thickness.dp.toPx() } / 2
                        drawCircle(Color.White, radius,position,style=Stroke(4.dp.toPx()))
                        drawCircle(Color(0xFF172033),radius,position,style=Stroke(1.5.dp.toPx()))
                        drawCircle(Color(0xFF172033),2.dp.toPx(),position)
                    }
                }
                if (!engine.hasDrawing && engine.pointer == null) {
                    Text("Dibuja aquí",Modifier.align(Alignment.Center),color=Color(0xFF667085),fontSize=16.sp)
                }
            }
            Row(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),verticalAlignment=Alignment.CenterVertically,
                horizontalArrangement=Arrangement.spacedBy(8.dp)) {
                val palette = remember { listOf(0xFF172033,0xFFDC2626,0xFFF59E0B,0xFF15803D,0xFF2563EB,0xFF7C3AED).map { it.toInt() } }
                if (!eraser) palette.forEach { value ->
                    Box(Modifier.size(44.dp).clip(CircleShape).clickable { argb=value; eraser=false },contentAlignment=Alignment.Center) {
                        Box(Modifier.size(32.dp).background(Color(value),CircleShape)
                            .border(if (argb==value && !eraser) 3.dp else 1.dp,theme.strokeBorder,CircleShape))
                        if (argb==value && !eraser) Icon(Icons.Rounded.Check,null,tint=Color.White,modifier=Modifier.size(19.dp))
                    }
                }
                Sticker3dButton(onClick={ rgbDialog=true },containerColor=theme.surface,contentPadding=PaddingValues(10.dp)) {
                    Icon(Icons.Rounded.Palette,"Elegir color RGB",tint=theme.textPrimary,modifier=Modifier.size(22.dp))
                }
                Sticker3dButton(onClick={ eraser=!eraser },containerColor=if(eraser) theme.accent else theme.surface,
                    contentPadding=PaddingValues(10.dp)) {
                    Icon(painterResource(R.drawable.ic_pizarra_eraser),"Activar borrador",
                        tint=if(eraser) theme.onAccent else theme.textPrimary,modifier=Modifier.size(22.dp))
                }
                if (eraser) {
                    FilterChip(selected=!preciseEraser,onClick={ preciseEraser=false },label={ Text("Por trazo") })
                    FilterChip(selected=preciseEraser,onClick={ preciseEraser=true },label={ Text("Precisión") })
                }
            }
            Row(verticalAlignment=Alignment.CenterVertically,horizontalArrangement=Arrangement.spacedBy(10.dp)) {
                Text("${if(eraser) "Borrador" else "Grosor"}: ${thickness.roundToInt()}",color=theme.textPrimary,
                    fontSize=13.sp,fontWeight=FontWeight.Bold)
                Slider(value=thickness,onValueChange={ thickness=it.roundToInt().toFloat() },valueRange=1f..100f,steps=98,
                    modifier=Modifier.weight(1f))
            }
        }
    }
    if (rgbDialog) PizarraRgbDialog(argb,onDismiss={ rgbDialog=false }) { argb=it; eraser=false; rgbDialog=false }
    if (clearDialog) AlertDialog(onDismissRequest={ clearDialog=false },title={ Text("¿Limpiar el lienzo?") },
        text={ Text("Puedes recuperar el dibujo con Deshacer.") },
        confirmButton={ TextButton(onClick={ engine.clear(); clearDialog=false }) { Text("Limpiar") } },
        dismissButton={ TextButton(onClick={ clearDialog=false }) { Text("Cancelar") } })
}

@Composable
private fun PizarraIconTool(label: String,icon: androidx.compose.ui.graphics.vector.ImageVector,enabled: Boolean,onClick: () -> Unit) {
    val theme = ThemeManager.currentTheme
    Sticker3dButton(onClick=onClick,enabled=enabled,containerColor=theme.surface,modifier=Modifier.size(48.dp),
        contentPadding=PaddingValues(8.dp),shape=RoundedCornerShape(13.dp)) {
        Icon(icon,label,tint=theme.textPrimary.copy(alpha=if(enabled) 1f else .35f),modifier=Modifier.size(23.dp))
    }
}

@Composable
private fun PizarraRgbDialog(initial: Int,onDismiss: () -> Unit,onSelect: (Int) -> Unit) {
    var red by rememberSaveable { mutableFloatStateOf(android.graphics.Color.red(initial).toFloat()) }
    var green by rememberSaveable { mutableFloatStateOf(android.graphics.Color.green(initial).toFloat()) }
    var blue by rememberSaveable { mutableFloatStateOf(android.graphics.Color.blue(initial).toFloat()) }
    val value = android.graphics.Color.rgb(red.roundToInt(),green.roundToInt(),blue.roundToInt())
    AlertDialog(onDismissRequest=onDismiss,title={ Text("Tu color RGB",fontWeight=FontWeight.ExtraBold) },text={
        Column(Modifier.verticalScroll(rememberScrollState()),verticalArrangement=Arrangement.spacedBy(4.dp)) {
            Box(Modifier.fillMaxWidth().height(44.dp).background(Color(value),RoundedCornerShape(12.dp))
                .border(1.dp,ThemeManager.currentTheme.strokeBorder,RoundedCornerShape(12.dp)))
            Text("#%06X".format(value and 0xFFFFFF),fontWeight=FontWeight.Bold)
            listOf(Triple("Rojo",red,{ v: Float -> red=v }),Triple("Verde",green,{ v: Float -> green=v }),Triple("Azul",blue,{ v: Float -> blue=v })).forEach { (name,channel,update) ->
                Text("$name: ${channel.roundToInt()}")
                Slider(value=channel,onValueChange=update,valueRange=0f..255f,steps=254)
            }
        }
    },confirmButton={ TextButton(onClick={ onSelect(value) }) { Text("Usar color") } },
        dismissButton={ TextButton(onClick=onDismiss) { Text("Cancelar") } })
}
