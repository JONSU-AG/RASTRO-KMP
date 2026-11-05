package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.selected
import com.jonsuapps.rastro.R
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.ThemeManager

/** One existing native canvas, opened over the exercise without touching its state or timer. */
@Composable
fun PizarraAccessButton() {
    var open by rememberSaveable { mutableStateOf(false) }
    val integrated=LocalStudyNotebook.current
    val active=integrated?.open==true
    IconButton(onClick={if(integrated!=null) integrated.toggle() else open=true}, modifier=Modifier.size(48.dp).semantics {selected=active}.background(if(active) ThemeManager.currentTheme.surfaceAccent else androidx.compose.ui.graphics.Color.Transparent,RoundedCornerShape(12.dp))) {Icon(painterResource(R.drawable.ic_question_board),if(active) "Cerrar pizarra" else "Abrir pizarra",tint=androidx.compose.ui.graphics.Color.Unspecified,modifier=Modifier.size(32.dp))}
    if(open) PizarraOverlay {open=false}
}

@Composable
fun PizarraOverlay(onDismiss: ()->Unit) {
    Dialog(onDismissRequest=onDismiss,properties=DialogProperties(usePlatformDefaultWidth=false,decorFitsSystemWindows=false)) {
        PizarraScreen(onBack=onDismiss)
    }
}
