package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.ExpandMore
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.accentText

@Composable
internal fun StudyOptionsDialog(title:String,onDismiss:()->Unit,content:@Composable ColumnScope.()->Unit) {
    val theme=ThemeManager.currentTheme
    val maxHeight=LocalConfiguration.current.screenHeightDp.dp*.8f
    Dialog(onDismissRequest=onDismiss,properties=DialogProperties(usePlatformDefaultWidth=false)) {
        Sticker3dCard(Modifier.padding(16.dp).widthIn(max=520.dp).fillMaxWidth(),containerColor=theme.surface,strokeColor=theme.strokeBorder,shape=RoundedCornerShape(24.dp)) {
            Column(Modifier.heightIn(max=maxHeight).padding(16.dp),verticalArrangement=Arrangement.spacedBy(12.dp)) {
                Row(verticalAlignment=Alignment.CenterVertically){Text(title,Modifier.weight(1f),fontWeight=FontWeight.Black,color=theme.textPrimary);IconButton(onClick=onDismiss){Icon(Icons.Rounded.Close,"Cerrar",tint=theme.textPrimary)}}
                Column(Modifier.weight(1f,false).verticalScroll(rememberScrollState()),verticalArrangement=Arrangement.spacedBy(12.dp),content=content)
            }
        }
    }
}

@Composable
internal fun <T> StudyChoiceField(label:String,options:List<T>,selected:T,itemLabel:(T)->String?,onSelect:(T)->Unit) {
    val theme=ThemeManager.currentTheme
    var open by remember {mutableStateOf(false)}
    Column(verticalArrangement=Arrangement.spacedBy(4.dp)) {
        Text(label,color=theme.textSecondary,style=MaterialTheme.typography.labelMedium)
        BoxWithConstraints {
            val width=maxWidth
            Sticker3dButton(onClick={open=true},modifier=Modifier.fillMaxWidth(),containerColor=theme.surface,contentPadding=PaddingValues(12.dp)) {
                Text(itemLabel(selected).orEmpty(),Modifier.weight(1f),color=theme.textPrimary,maxLines=2,overflow=TextOverflow.Ellipsis)
                Icon(Icons.Rounded.ExpandMore,null,tint=theme.accentText)
            }
            MaterialTheme(colorScheme=MaterialTheme.colorScheme.copy(surface=theme.surface,onSurface=theme.textPrimary)) {
                DropdownMenu(expanded=open,onDismissRequest={open=false},modifier=Modifier.width(width).heightIn(max=280.dp)) {
                    options.forEach { option-> DropdownMenuItem(text={Text(itemLabel(option).orEmpty(),color=theme.textPrimary)},onClick={onSelect(option);open=false}) }
                }
            }
        }
    }
}

@Composable
internal fun StudyScrollCue(visible:Boolean,modifier:Modifier=Modifier,onClick:()->Unit) {
    if(visible) Surface(modifier=modifier,shape=RoundedCornerShape(20.dp),border=androidx.compose.foundation.BorderStroke(1.dp,ThemeManager.currentTheme.strokeBorder),color=ThemeManager.currentTheme.surfaceAccent) {
        IconButton(onClick=onClick,modifier=Modifier.size(40.dp)) {Icon(Icons.Rounded.KeyboardArrowDown,"Ver más contenido",tint=ThemeManager.currentTheme.accentText)}
    }
}
