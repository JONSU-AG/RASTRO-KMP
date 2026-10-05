package com.jonsuapps.rastro.android.ui.components

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.jonsuapps.rastro.android.data.CustomVideoItem
import kotlinx.coroutines.delay
import org.json.JSONArray
import org.json.JSONObject

/** Official IFrame API fallback, visible player, no scraping or privileged JavaScript bridge. */
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun YouTubePlaylistPlayer(playlistId: String, selectedVideoId: String?, onVideos: (List<CustomVideoItem>) -> Unit, onError: () -> Unit,
    onFullscreenChanged: (Boolean) -> Unit = {}) {
    var webView by remember(playlistId) { mutableStateOf<WebView?>(null) }
    val currentVideos by rememberUpdatedState(onVideos)
    val currentError by rememberUpdatedState(onError)
    val currentSelection by rememberUpdatedState(selectedVideoId)
    val currentFullscreenChanged by rememberUpdatedState(onFullscreenChanged)
    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(lifecycleOwner, webView) {
        val view = webView
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_STOP -> {
                    view?.evaluateJavascript("if(window.playerReady) player.pauseVideo();", null)
                    view?.onPause()
                }
                Lifecycle.Event.ON_START -> view?.onResume()
                else -> Unit
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }
    LaunchedEffect(selectedVideoId, webView) {
        if (selectedVideoId?.matches(Regex("[A-Za-z0-9_-]{11}")) == true) {
            webView?.evaluateJavascript("window.rastroSelected = " + JSONObject.quote(selectedVideoId) + "; if(window.playerReady) selectVideo();", null)
        }
    }
    LaunchedEffect(webView, playlistId) {
        val view = webView ?: return@LaunchedEffect
        if (playlistId.isBlank()) return@LaunchedEffect
        var delivered = false
        repeat(40) {
            delay(500)
            if (!delivered) view.evaluateJavascript("JSON.stringify(window.rastroPlaylist || [])") { result ->
                val videos = runCatching {
                    // evaluateJavascript returns a JSON-encoded string containing the queue JSON.
                    val decoded = JSONArray("[" + result + "]").optString(0)
                    PlaylistQueueParser.parse(decoded)
                }.getOrDefault(emptyList())
                if (videos.isNotEmpty() && !delivered) { delivered = true; currentVideos(videos) }
            }
        }
        if (!delivered) currentError()
    }
    AndroidView(factory = { context ->
        WebView(context).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = false
            settings.allowContentAccess = false
            settings.mediaPlaybackRequiresUserGesture = true
            settings.setSupportMultipleWindows(true)
            webViewClient = YouTubeExternalLinkClient()
            webChromeClient = RastroYouTubeChromeClient(context.findActivity()) { currentFullscreenChanged(it) }
            val origin = "https://${context.packageName.lowercase()}"
            val idJson = JSONObject.quote(playlistId)
            val selectionJson = JSONObject.quote(currentSelection.orEmpty())
            val originJson = JSONObject.quote(origin)
            loadDataWithBaseURL(origin, """
                <!doctype html><html><head><meta name="referrer" content="strict-origin-when-cross-origin"><meta name="viewport" content="width=device-width, initial-scale=1"></head>
                <body style="margin:0;background:#111;height:100vh;overflow:hidden"><div id="player"></div>
                <script src="https://www.youtube.com/iframe_api"></script><script>
                window.rastroPlaylist=[];window.rastroSelected=$selectionJson;window.playerReady=false;
                function onYouTubeIframeAPIReady(){
                  window.player=new YT.Player('player',{width:'100%',height:window.innerHeight,
                    videoId:$selectionJson,
                    playerVars:{origin:$originJson,playsinline:1,controls:1,fs:1,autoplay:0},
                    events:{onReady:function(e){window.playerReady=true;
                      if($idJson){e.target.cuePlaylist({listType:'playlist',list:$idJson});}
                      else{selectVideo();}},onStateChange:function(){captureQueue();}}});
                }
                function selectVideo(){if(!window.playerReady || !window.rastroSelected)return;
                  var index=window.rastroPlaylist.indexOf(window.rastroSelected);
                  if(index>=0 && $idJson){player.cuePlaylist({listType:'playlist',list:$idJson,index:index});}
                  else{player.cueVideoById(window.rastroSelected);}}
                function captureQueue(){if(window.player && player.getPlaylist){
                  var ids=player.getPlaylist();if(ids && ids.length && !window.rastroPlaylist.length){window.rastroPlaylist=ids;}}}
                setInterval(captureQueue,400);
                window.addEventListener('resize',function(){if(window.playerReady)player.setSize(window.innerWidth,window.innerHeight);});
                </script></body></html>
            """.trimIndent(), "text/html", "UTF-8", null)
            webView = this
        }
    }, onRelease = { (it.webChromeClient as? RastroYouTubeChromeClient)?.exitFullscreen(); it.stopLoading(); it.destroy(); webView = null },
        modifier = Modifier.fillMaxWidth().height(200.dp))
}

internal object PlaylistQueueParser {
    fun parse(json: String): List<CustomVideoItem> {
        val array = JSONArray(json)
        return fromIds((0 until array.length()).map { array.optString(it) })
    }
    fun fromIds(ids: List<String>): List<CustomVideoItem> = ids.mapNotNull { id ->
        if (!id.matches(Regex("[A-Za-z0-9_-]{11}"))) null
        else CustomVideoItem(id = id, title = "", urlOrId = id)
    }
}
