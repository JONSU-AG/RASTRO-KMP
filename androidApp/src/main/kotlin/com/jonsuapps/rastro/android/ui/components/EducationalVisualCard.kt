package com.jonsuapps.rastro.android.ui.components

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExpandMore
import androidx.compose.material.icons.rounded.ExpandLess
import androidx.compose.material.icons.rounded.ViewInAr
import androidx.compose.material.icons.rounded.ZoomIn
import com.jonsuapps.rastro.theme.accentText
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.serialization.json.Json
import java.io.ByteArrayInputStream

internal object EducationalVisualRegistry {
    fun load(context: Context): List<EducationalVisual> {
        val catalog=Json.decodeFromString<EducationalVisualCatalog>(context.assets.open("educational-visuals/catalog.json").bufferedReader().use {it.readText()})
        require(catalog.schemaVersion==1)
        require(catalog.resources.map {it.id}.distinct().size==catalog.resources.size)
        require(catalog.resources.all(::validEducationalVisual))
        return catalog.resources
    }
}

private const val VISUAL_ROOT="https://appassets.androidplatform.net/assets/educational-visuals/"
internal fun educationalDocumentUrl(resource:EducationalVisual,threeD:Boolean)=VISUAL_ROOT+resource.id+if(threeD) "-3d.html" else "-2d.html"
internal fun educationalAssetPath(url: String): String? {
    if (!url.startsWith(VISUAL_ROOT)) return null
    val name=url.removePrefix(VISUAL_ROOT)
    return name.takeIf { it.matches(Regex("(?:runtime/)?[a-zA-Z0-9_.-]+")) && !it.contains("..") }
}

/** One catalog and the same lesson identity in Material and playable levels. */
@Composable
internal fun rememberLessonEducationalVisuals(lesson: LessonNode):List<EducationalVisual> {
    val context=LocalContext.current
    val resources by produceState<List<EducationalVisual>>(emptyList(),lesson.id) {
        value=kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching { educationalVisualsForLesson(EducationalVisualRegistry.load(context),lesson.subjectId,lesson.id) }.getOrDefault(emptyList())
        }
    }
    return resources
}
private fun visualHtml(text: String) = text.replace("&","&amp;").replace("<","&lt;").replace(">","&gt;").replace("\"","&quot;").replace("'","&#39;")

/** The model is instantiated only when the student requests 3D. */
@Composable
internal fun EducationalVisualCard(resource: EducationalVisual) {
    if(isPlantCellPilot(resource)) {PlantCellPilotCard(resource);return}
    if(isCardiovascularPilot(resource)) {CardiovascularPilotCard(resource);return}
    val theme=ThemeManager.currentTheme
    var expanded by remember(resource.id) { mutableStateOf(false) }
    var threeD by remember(resource.id) { mutableStateOf(false) }
    Column(verticalArrangement=Arrangement.spacedBy(8.dp)) {
        if(resource.subjectId.startsWith("historia")) Text(resource.title,color=theme.textPrimary,fontWeight=FontWeight.Bold)
        EducationalVisualWeb(resource,false,Modifier.fillMaxWidth().height(235.dp))
        if(resource.subjectId.startsWith("historia")) Text(resource.description,color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
        Row(horizontalArrangement=Arrangement.spacedBy(8.dp)) {
            Sticker3dButton(onClick={threeD=false;expanded=true},modifier=Modifier.weight(1f),containerColor=theme.surface,contentPadding=PaddingValues(10.dp)) {
                Icon(Icons.Rounded.ZoomIn,null,Modifier.size(18.dp),tint=theme.accentText)
                Text("Ampliar",color=theme.textPrimary)
            }
            if(resource.model!=null) Sticker3dButton(onClick={threeD=true;expanded=true},modifier=Modifier.weight(1f),containerColor=theme.accent,contentPadding=PaddingValues(10.dp)) {
                Icon(Icons.Rounded.ViewInAr,null,Modifier.size(18.dp))
                Text("Ver en 3D",fontWeight=FontWeight.Bold)
            }
        }
        EducationalSourceDetails(resource,false)
        if(expanded) Dialog(onDismissRequest={expanded=false},properties=DialogProperties(usePlatformDefaultWidth=false)) {
            Surface(Modifier.fillMaxSize().safeDrawingPadding().padding(8.dp),color=theme.background,shape=RoundedCornerShape(20.dp)) {
                Column(Modifier.padding(12.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
                    Row {Text(resource.title,Modifier.weight(1f),color=theme.textPrimary);TextButton(onClick={expanded=false}){Text("Cerrar")}}
                    if(threeD) {
                        Text("Arrastra para girar · Pellizca para acercar",color=theme.textSecondary)
                    }
                    key(resource.id,threeD) { EducationalVisualWeb(resource,threeD,Modifier.weight(1f).fillMaxWidth()) }
                    EducationalSourceDetails(resource,threeD)
                    if(threeD) TextButton(onClick={threeD=false}){Text("Volver a la imagen 2D")}
                }
            }
        }
    }
}

@Composable
internal fun EducationalSourceDetails(resource: EducationalVisual,threeD: Boolean) {
    var open by remember(resource.id,threeD) { mutableStateOf(false) }
    val theme=ThemeManager.currentTheme
    val links=LocalUriHandler.current
    TextButton(onClick={open=!open}) {
        Text("Fuente",color=theme.textSecondary)
        Icon(if(open) Icons.Rounded.ExpandLess else Icons.Rounded.ExpandMore,null,tint=theme.textSecondary)
    }
    if(open) Column {
        Text(if(threeD) resource.modelAttribution.orEmpty() else resource.attribution,color=theme.textSecondary,style=MaterialTheme.typography.labelSmall)
        Text(if(threeD) resource.modelDescription.orEmpty() else resource.description,color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
        Row {
            TextButton(onClick={links.openUri(if(threeD) resource.modelSource!! else resource.source)}){Text("Consultar origen")}
            TextButton(onClick={links.openUri(if(threeD) resource.modelLicenseUrl!! else resource.licenseUrl)}){Text(if(threeD) resource.modelLicense.orEmpty() else resource.license)}
        }
    }
}

internal fun educationalVisualDocument(resource: EducationalVisual,threeD: Boolean): String {
    val model=resource.model?.takeIf {safeEducationalAsset(it)}
        val title=visualHtml(resource.title)
        val content=if(threeD && model!=null) """
            <script type="module" src="runtime/model-viewer.min.js"></script>
            <div id="status" role="status">Cargando modelo…</div>
            <model-viewer id="viewer" src="$model" alt="$title" camera-controls interaction-prompt="none" shadow-intensity="0" style="width:100%;height:90vh"></model-viewer>
            <script>
            const viewer=document.getElementById('viewer'),status=document.getElementById('status');
            viewer.addEventListener('load',()=>{status.textContent='';document.body.dataset.loaded='true'});
            viewer.addEventListener('error',()=>{status.textContent='No se pudo abrir el modelo. Puedes volver a la imagen 2D.';document.body.dataset.failed='true'});
            setTimeout(()=>{if(document.body.dataset.loaded!=='true'){status.textContent='El modelo no está disponible en este dispositivo. Vuelve a la imagen 2D.';document.body.dataset.failed='true'}},20000);
            </script>
        """.trimIndent() else "<img src='${resource.poster}' alt='$title' style='width:100%;height:95vh;object-fit:contain'>"
        return """<!doctype html><html lang="es"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Security-Policy" content="default-src 'none'; script-src 'self' 'unsafe-inline' 'wasm-unsafe-eval'; style-src 'self' 'unsafe-inline'; img-src 'self' data:; connect-src 'self'; worker-src blob:;">
        <style>html,body{margin:0;background:#fff;color:#172033;font:15px sans-serif}model-viewer{background:#fff}#status{text-align:center}</style></head><body>$content</body></html>""".trimIndent()
}

@SuppressLint("SetJavaScriptEnabled")
@Composable
private fun EducationalVisualWeb(resource: EducationalVisual,threeD: Boolean,modifier: Modifier) {
    val context=LocalContext.current
    val html=remember(resource.id,threeD) { educationalVisualDocument(resource,threeD) }
    val documentUrl=remember(resource.id,threeD) { educationalDocumentUrl(resource,threeD) }
    var failed by remember(resource.id,threeD) {mutableStateOf(false)}
    if(failed) {
        Column(modifier,verticalArrangement=Arrangement.Center) {
            Text("No se pudo abrir la imagen.",color=ThemeManager.currentTheme.textPrimary)
            TextButton(onClick={failed=false}){Text("Reintentar")}
        }
        return
    }
    AndroidView(modifier=modifier,factory={
        WebView(it).apply {
            settings.javaScriptEnabled=threeD
            settings.allowFileAccess=false;settings.allowContentAccess=false
            settings.mixedContentMode=WebSettings.MIXED_CONTENT_NEVER_ALLOW
            settings.builtInZoomControls=!threeD;settings.displayZoomControls=false
            settings.domStorageEnabled=false
            CookieManager.getInstance().setAcceptThirdPartyCookies(this,false)
            webViewClient=object: WebViewClient() {
                override fun onReceivedError(view:WebView?,request:WebResourceRequest?,error:WebResourceError?) {if(request?.isForMainFrame==true) failed=true}
                override fun onReceivedHttpError(view:WebView?,request:WebResourceRequest?,errorResponse:WebResourceResponse?) {if(request?.isForMainFrame==true) failed=true}
                override fun shouldOverrideUrlLoading(view: WebView?,request: WebResourceRequest?)=request?.url.toString()!=documentUrl
                override fun shouldInterceptRequest(view: WebView?,request: WebResourceRequest?): WebResourceResponse {
                    val url=request?.url.toString()
                    if(url==documentUrl) return WebResourceResponse("text/html","UTF-8",ByteArrayInputStream(html.toByteArray(Charsets.UTF_8)))
                    val path=educationalAssetPath(url) ?: return blocked()
                    return try {
                        val mime=when {path.endsWith(".svg")->"image/svg+xml";path.endsWith(".jpg")->"image/jpeg";path.endsWith(".png")->"image/png";path.endsWith(".webp")->"image/webp";path.endsWith(".glb")->"model/gltf-binary";path.endsWith(".js")->"text/javascript";else->return blocked()}
                        WebResourceResponse(mime,if(path.endsWith(".glb")) null else "UTF-8",context.assets.open("educational-visuals/$path"))
                    } catch (_: Exception) {blocked()}
                }
                private fun blocked() = WebResourceResponse("text/plain","UTF-8",403,"Blocked",emptyMap(),ByteArrayInputStream(byteArrayOf()))
            }
            loadUrl(documentUrl)
        }
    },onRelease={view ->
        view.stopLoading()
        if(threeD) view.evaluateJavascript("document.querySelector('model-viewer')?.remove()",null)
        view.loadUrl("about:blank");view.removeAllViews();view.destroy()
    })
}
