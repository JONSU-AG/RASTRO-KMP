package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.EditCalendar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.widgets.RastroWidgetManager
import com.jonsuapps.rastro.android.widgets.WidgetDates
import com.jonsuapps.rastro.theme.RastroColors
import com.jonsuapps.rastro.theme.accentText
import kotlinx.coroutines.delay

@Composable
fun HomeExamCountdown(colors: RastroColors, embedded: Boolean = false) {
    val context = LocalContext.current
    var editing by remember { mutableStateOf(false) }
    var revision by remember { mutableIntStateOf(0) }
    var now by remember { mutableLongStateOf(System.currentTimeMillis()) }
    LaunchedEffect(Unit) { while (true) { delay(60_000); now = System.currentTimeMillis() } }
    val date = remember(revision, now) { RastroWidgetManager.getExamDateYmd(context) }
    val details = remember(revision, now) { RastroWidgetManager.getExamDetails(context) }
    val display = remember(date, now) { WidgetDates.display(date, now) }
    if (embedded) {
        Row(Modifier.fillMaxWidth().clickable { editing = true }.padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(Icons.Rounded.EditCalendar, null, Modifier.size(21.dp), tint = colors.accentText)
            Column(Modifier.weight(1f)) {
                Text(details.first, color = colors.textPrimary, fontSize = 11.sp, fontWeight = FontWeight.Bold,
                    maxLines = 1, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis)
                Text("${display.value} ${display.label} · ${date.split('-').reversed().joinToString("/")}",
                    color = colors.textSecondary, fontSize = 11.sp)
            }
            androidx.compose.material3.IconButton(onClick = { editing = true }) {
                Icon(Icons.Rounded.EditCalendar, "Editar examen", tint = colors.accentText, modifier = Modifier.size(18.dp))
            }
        }
    } else Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = colors.surfaceAccent,
        bevelColor = colors.cardBevel, strokeColor = colors.strokeBorder, bevelHeight = 5.dp,
        shape = RoundedCornerShape(24.dp), onClick = { editing = true }) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                Column(Modifier.width(90.dp).clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFFFFF6DF)).border(2.dp, Color(0xFF30243C), RoundedCornerShape(16.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("EXAMEN", Modifier.fillMaxWidth().background(Color(0xFFFFCE52)).padding(vertical = 3.dp),
                        color = Color(0xFF30243C), fontWeight = FontWeight.Black, fontSize = 11.sp, textAlign = TextAlign.Center)
                    Row(Modifier.padding(horizontal = 5.dp, vertical = 5.dp), verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                        Text(display.value, color = Color(0xFF30243C), fontSize = 27.sp, fontWeight = FontWeight.Black)
                        if (display.value.toLongOrNull() != null) Text(display.label.substringBefore(' ').lowercase(),
                            color = Color(0xFF30243C), fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(3.dp)) {
                    Text("TU PRÓXIMA META", color = colors.accentText, fontSize = 10.sp, fontWeight = FontWeight.Black)
                    Text(details.first, color = colors.textPrimary, fontSize = 14.sp, fontWeight = FontWeight.Black)
                    Text(date.split('-').reversed().joinToString("/"), color = colors.textSecondary, fontSize = 11.sp)
                }
                androidx.compose.material3.IconButton(onClick = { editing = true }) {
                    Icon(Icons.Rounded.EditCalendar, "Elegir mi examen", Modifier.size(22.dp), tint = colors.accentText)
                }
            }
        }
    }
    if (editing) ExamCountdownSettingsDialog(colors, onDismiss = { editing = false },
        onSaved = { revision++; now = System.currentTimeMillis(); editing = false })
}
