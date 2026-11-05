package com.jonsuapps.rastro.android.ui.screens

import android.content.ClipData
import android.content.Intent
import android.graphics.Bitmap
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Download
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.FileProvider
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

/** Same PNG / document picker / FileProvider flow as PizarraScreen; captures the visible page. */
@Composable
internal fun QuestionNotebookExportActions(model:QuestionNotebookModel,capture:suspend ()->Bitmap?) {
    val context=LocalContext.current
    val theme=ThemeManager.currentTheme
    val scope=rememberCoroutineScope()
    var menu by remember {mutableStateOf(false)}
    var exporting by remember {mutableStateOf(false)}
    fun message(text:String){Toast.makeText(context,text,Toast.LENGTH_SHORT).show()}
    val save=rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("image/png")) {uri->
        val bitmap=model.takeExport()
        if(uri==null || bitmap==null){bitmap?.recycle();exporting=false}
        else scope.launch {
            try {
                withContext(Dispatchers.IO){
                    context.contentResolver.openOutputStream(uri)?.use {check(bitmap.compress(Bitmap.CompressFormat.PNG,100,it))}
                        ?: error("No se pudo abrir el archivo")
                }
                message("Imagen guardada")
            }catch(e:CancellationException){throw e}
            catch(_:Exception){message("No se pudo guardar la imagen. Intenta de nuevo.")}
            finally {bitmap.recycle();exporting=false}
        }
    }
    fun export(share:Boolean) {
        menu=false
        if(exporting)return
        exporting=true
        scope.launch {
            var bitmap:Bitmap?=null
            var handedToPicker=false
            try {
                val image=capture() ?: error("La imagen todavía no está disponible")
                bitmap=image
                if(!share) {
                    model.holdExport(image);handedToPicker=true
                    try {save.launch("RASTRO-pizarra-${System.currentTimeMillis()}.png")}
                    catch(e:Exception){model.takeExport()?.recycle();handedToPicker=false;bitmap=null;throw e}
                } else {
                    val file=withContext(Dispatchers.IO) {
                        val directory=File(context.cacheDir,"pizarra_exports").apply {check(mkdirs() || isDirectory)}
                        File.createTempFile("RASTRO-pizarra-",".png",directory).also {output->
                            output.outputStream().use {check(image.compress(Bitmap.CompressFormat.PNG,100,it))}
                        }
                    }
                    val uri=FileProvider.getUriForFile(context,"${context.packageName}.pizarra.files",file)
                    val intent=Intent(Intent.ACTION_SEND).apply {
                        type="image/png";putExtra(Intent.EXTRA_STREAM,uri)
                        clipData=ClipData.newUri(context.contentResolver,"Pizarra RASTRO",uri)
                        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                    }
                    context.startActivity(Intent.createChooser(intent,"Compartir imagen"))
                }
            }catch(e:CancellationException){throw e}
            catch(_:OutOfMemoryError){message("No hay memoria suficiente para exportar esta vista.")}
            catch(_:Exception){message("No se pudo exportar la imagen. Intenta de nuevo.")}
            finally {if(!handedToPicker){bitmap?.recycle();exporting=false}}
        }
    }
    Box {
        IconButton(onClick={menu=true},enabled=!exporting) {Icon(Icons.Rounded.MoreVert,"Guardar o compartir imagen",tint=theme.textPrimary)}
        DropdownMenu(expanded=menu,onDismissRequest={menu=false}) {
            DropdownMenuItem(text={Text("Guardar imagen")},leadingIcon={Icon(Icons.Rounded.Download,null)},onClick={export(false)},enabled=!exporting)
            DropdownMenuItem(text={Text("Compartir imagen")},leadingIcon={Icon(Icons.Rounded.Share,null)},onClick={export(true)},enabled=!exporting)
        }
    }
}
