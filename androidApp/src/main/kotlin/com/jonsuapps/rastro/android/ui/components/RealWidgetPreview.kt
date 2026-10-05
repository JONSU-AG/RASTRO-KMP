package com.jonsuapps.rastro.android.ui.components

import android.widget.FrameLayout
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.jonsuapps.rastro.android.widgets.RastroWidgetIllustration
import androidx.compose.ui.viewinterop.AndroidView
import com.jonsuapps.rastro.android.widgets.RastroWidgetKind
import com.jonsuapps.rastro.android.widgets.RastroWidgetViews

/** Inflates the actual RemoteViews, not a separate Compose imitation. */
@Composable
fun RealWidgetPreview(kind: RastroWidgetKind, revision: Int) {
    key(kind, revision) {
        AndroidView(modifier = Modifier.fillMaxWidth().aspectRatio(RastroWidgetIllustration.aspect(LocalContext.current, kind)),
            factory = { context -> FrameLayout(context).apply {
                // Preview cannot navigate or launch PendingIntents.
                descendantFocusability = android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS
                val preview = RastroWidgetViews.create(context, kind).apply(context, this)
                preview.setOnClickListener(null)
                addView(preview, FrameLayout.LayoutParams(-1, -1))
                setOnTouchListener { _, _ -> true }
            } })
    }
}
