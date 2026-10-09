package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.firestore.DocumentSnapshot
import com.jonsuapps.rastro.android.data.AppFeedback
import com.jonsuapps.rastro.android.data.AppFeedbackRepository
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.accentText
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Locale

/** Only composed inside the existing authorized Admin screen; twenty documents per page. */
@Composable
internal fun AppFeedbackAdminPanel() {
    val theme=ThemeManager.currentTheme
    val scope=rememberCoroutineScope()
    var cursor by remember { mutableStateOf<DocumentSnapshot?>(null) }
    var previous by remember { mutableStateOf(emptyList<DocumentSnapshot?>()) }
    var nextCursor by remember { mutableStateOf<DocumentSnapshot?>(null) }
    var messages by remember { mutableStateOf(emptyList<AppFeedback>()) }
    var more by remember { mutableStateOf(false) }
    var loading by remember { mutableStateOf(true) }
    var error by remember { mutableStateOf<String?>(null) }
    var refresh by remember { mutableIntStateOf(0) }
    var resolving by remember { mutableStateOf<String?>(null) }
    var deleting by remember { mutableStateOf<AppFeedback?>(null) }
    deleting?.let { selected -> AlertDialog(onDismissRequest={deleting=null},
        title={Text("¿Eliminar este mensaje?")},text={Text("Se borrará definitivamente de la bandeja. Esta acción no se puede deshacer.")},
        dismissButton={TextButton(onClick={deleting=null}) {Text("Cancelar")}},
        confirmButton={TextButton(onClick={
            deleting=null; resolving=selected.id
            scope.launch {
                try { AppFeedbackRepository.delete(selected.id); messages=messages.filterNot {it.id==selected.id} }
                catch(e: CancellationException) {throw e}
                catch(_: Exception) {error="No se pudo eliminar el mensaje. Intenta de nuevo."}
                finally {resolving=null}
            }
        }) {Text("Eliminar")}}) }
    LaunchedEffect(cursor,refresh) {
        loading=true; error=null; messages=emptyList()
        try {
            val page=AppFeedbackRepository.page(cursor)
            messages=page.messages; nextCursor=page.cursor; more=page.hasMore
        } catch(e: CancellationException) { throw e }
        catch(_: Exception) { error="No se pudieron cargar los mensajes. Revisa tu conexión y permisos e intenta de nuevo." }
        finally { loading=false }
    }
    Column(verticalArrangement=Arrangement.spacedBy(12.dp)) {
        Text("Errores y sugerencias",fontSize=20.sp,fontWeight=FontWeight.ExtraBold,color=theme.textPrimary)
        Text("Mensajes privados enviados desde Inicio. Solo Admin tiene acceso.",fontSize=13.sp,color=theme.textSecondary)
        TextButton(enabled=!loading && resolving==null,onClick={ previous=emptyList(); cursor=null; refresh++ }) { Text("Recargar") }
        if(loading) LinearProgressIndicator(Modifier.fillMaxWidth())
        error?.let { Text(it,color=MaterialTheme.colorScheme.error) }
        if(!loading && error==null && messages.isEmpty()) Text("Todavía no hay mensajes.",color=theme.textSecondary)
        messages.forEach { message -> key(message.id) {
            Sticker3dCard(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(14.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
                    Text(if(message.kind=="error") "Error de la app" else "Sugerencia",color=theme.accentText,fontWeight=FontWeight.Bold)
                    Text(message.sender,color=theme.textPrimary,fontWeight=FontWeight.Bold)
                    if(message.sentAt>0) Text(remember(message.sentAt) {
                        SimpleDateFormat("dd/MM/yyyy HH:mm",Locale.getDefault()).format(java.util.Date(message.sentAt))
                    },fontSize=12.sp,color=theme.textSecondary)
                    Text(message.message,color=theme.textPrimary,fontSize=14.sp)
                    if(message.resolved) Text("Atendido",color=theme.accentText,fontWeight=FontWeight.Bold)
                    else TextButton(enabled=resolving==null && !loading,onClick={
                        resolving=message.id; error=null
                        scope.launch {
                            try {
                                AppFeedbackRepository.resolve(message.id)
                                messages=messages.map { if(it.id==message.id) it.copy(resolved=true) else it }
                            } catch(e: CancellationException) { throw e }
                            catch(_: Exception) { error="No se pudo marcar como atendido. Intenta de nuevo." }
                            finally { resolving=null }
                        }
                    }) { Text(if(resolving==message.id) "Guardando…" else "Marcar como atendido") }
                    TextButton(enabled=resolving==null && !loading,onClick={deleting=message}) {Text("Eliminar mensaje")}
                }
            }
        } }
        Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
            TextButton(enabled=previous.isNotEmpty() && !loading && resolving==null,onClick={
                loading=true; cursor=previous.last(); previous=previous.dropLast(1)
            }) { Text("Anterior") }
            TextButton(enabled=more && !loading && error==null && resolving==null,onClick={
                loading=true; previous=previous+listOf(cursor); cursor=nextCursor
            }) { Text("Siguiente") }
        }
    }
}
