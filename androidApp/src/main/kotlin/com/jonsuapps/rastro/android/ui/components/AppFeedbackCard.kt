package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Feedback
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.data.AppFeedbackInput
import com.jonsuapps.rastro.android.data.AppFeedbackRepository
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.theme.accentText
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.launch
import java.util.UUID

@Composable
fun AppFeedbackCard() {
    val theme = ThemeManager.currentTheme
    val user by UserManager.currentUser.collectAsState()
    val scope = rememberCoroutineScope()
    var opened by rememberSaveable { mutableStateOf(false) }
    var text by rememberSaveable { mutableStateOf("") }
    var kind by rememberSaveable { mutableStateOf("error") }
    var id by rememberSaveable { mutableStateOf("") }
    var sending by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    var sent by rememberSaveable { mutableStateOf(false) }
    Sticker3dCard(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(14.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
            Row(verticalAlignment=Alignment.CenterVertically,horizontalArrangement=Arrangement.spacedBy(8.dp)) {
                Icon(Icons.Rounded.Feedback,null,tint=theme.accentText)
                Text("Errores y sugerencias",fontWeight=FontWeight.ExtraBold,fontSize=16.sp,color=theme.textPrimary)
            }
            Text(if(sent) "Gracias. Tu mensaje llegó a Admin." else "¿Algo falla o tienes una idea? Tu mensaje es privado y solo lo recibe Admin.",
                fontSize=13.sp,color=theme.textSecondary)
            Sticker3dButton(onClick={ opened=true; error=null },containerColor=theme.accent,contentPadding=PaddingValues(horizontal=14.dp,vertical=8.dp)) {
                Text("Enviar mensaje",color=theme.onAccent,fontWeight=FontWeight.Bold,fontSize=13.sp)
            }
        }
    }
    if(opened) AlertDialog(
        onDismissRequest={ if(!sending) opened=false },
        containerColor=theme.surface,
        title={ Text("Errores y sugerencias",color=theme.textPrimary,fontWeight=FontWeight.ExtraBold) },
        text={ Column(Modifier.verticalScroll(rememberScrollState()),verticalArrangement=Arrangement.spacedBy(8.dp)) {
            Text("Solo Admin puede leerlo. No se publica en la comunidad.",color=theme.textSecondary,fontSize=13.sp)
            Row(horizontalArrangement=Arrangement.spacedBy(8.dp)) {
                FilterChip(selected=kind=="error",onClick={ if(!sending) kind="error" },label={ Text("Error") },enabled=!sending)
                FilterChip(selected=kind=="suggestion",onClick={ if(!sending) kind="suggestion" },label={ Text("Sugerencia") },enabled=!sending)
            }
            OutlinedTextField(value=text,onValueChange={ if(it.length<=AppFeedbackInput.MAX_LENGTH) text=it },
                label={ Text("Cuéntanos qué ocurrió o qué mejorarías") },minLines=3,maxLines=5,enabled=!sending,
                modifier=Modifier.fillMaxWidth(),supportingText={ Text("${text.length} / ${AppFeedbackInput.MAX_LENGTH}") })
            error?.let { Text(it,color=MaterialTheme.colorScheme.error,fontSize=13.sp) }
            if(sending) Text("Enviando… Necesitas conexión para confirmar la entrega.",color=theme.textSecondary,fontSize=12.sp)
        } },
        confirmButton={ TextButton(enabled=!sending && AppFeedbackInput.valid(kind,text),onClick={
            if(!sending) {
                sending=true; error=null
                if(id.isEmpty()) id="app_feedback_${System.currentTimeMillis()}_${UUID.randomUUID()}"
                scope.launch {
                    try {
                        AppFeedbackRepository.send(id,kind,text,user?.displayName.orEmpty())
                        sent=true; text=""; id=""; opened=false
                    } catch(e: CancellationException) { throw e }
                    catch(e: Exception) { error=if(e is IllegalStateException) e.message else "No se pudo enviar. Revisa tu conexión e intenta de nuevo." }
                    finally { sending=false }
                }
            }
        }) { Text(if(sending) "Enviando…" else "Enviar") } },
        dismissButton={ TextButton(enabled=!sending,onClick={ opened=false }) { Text("Cancelar") } }
    )
}
