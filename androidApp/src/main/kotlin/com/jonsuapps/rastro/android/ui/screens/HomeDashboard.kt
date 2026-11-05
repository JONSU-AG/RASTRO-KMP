package com.jonsuapps.rastro.android.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.theme.RastroColors
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent
import java.util.Calendar

@Composable
internal fun HomeStudyAction(colors: RastroColors, subjectName: String?, onStudy: () -> Unit) {
    Sticker3dCard(Modifier.fillMaxWidth(), onClick = onStudy) {
        Column(Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp), verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text(if (subjectName != null) "Continúa aprendiendo" else "Empieza a aprender",
                color = colors.textPrimary, fontSize = 16.sp, lineHeight = 19.sp, fontWeight = FontWeight.Black)
            if (subjectName != null) Text(subjectName,
                color = colors.textSecondary, fontSize = 11.sp, lineHeight = 14.sp,
                maxLines = 1, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis)
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                DoodleTrailWithStars(Modifier.weight(1f).height(48.dp).padding(end = 10.dp),
                    colors.strokeBorder, starRadius = 11.dp)
                Sticker3dButton(onClick = onStudy, modifier = Modifier.heightIn(min = 48.dp), containerColor = colors.accent,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 7.dp)) {
                    Text("Estudiar ahora", color = colors.onAccent, fontSize = 12.sp, fontWeight = FontWeight.Black)
                    Spacer(Modifier.width(6.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, null, tint = colors.onAccent, modifier = Modifier.size(18.dp))
                }
            }
        }
    }
}

@Composable
internal fun HomeCompactStreak(colors: RastroColors, streak: Int, activityDates: Set<String>, onOpen: () -> Unit) {
    val today = GamificationManager.getLocalDayString()
    val days = remember(today) { homeWeekDates(System.currentTimeMillis()) }
    Sticker3dCard(Modifier.fillMaxWidth(), onClick = onOpen) {
        Column(Modifier.fillMaxWidth().padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                PreparedAnimation("R-MEDIO", Modifier.size(28.dp), loop = true)
                Text(if (streak == 1) "1 día de racha" else "$streak días de racha", Modifier.weight(1f),
                    color = colors.textPrimary, fontWeight = FontWeight.Black)
                Icon(Icons.AutoMirrored.Filled.ArrowForward, "Ver racha", tint = colors.accentText, modifier = Modifier.size(18.dp))
            }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                days.forEachIndexed { index, date ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(3.dp)) {
                        Text(listOf("L", "M", "M", "J", "V", "S", "D")[index], fontSize = 10.sp,
                            color = if (date == today) colors.accentText else colors.textSecondary, fontWeight = FontWeight.Bold)
                        Box(Modifier.size(24.dp)) {
                            DoodleDayCheckCircle(date in activityDates, colors.strokeBorder, isPast = date < today,
                                isToday = date == today, inactiveColor = colors.surface, labelColor = colors.textSecondary)
                        }
                    }
                }
            }
        }
    }
}

internal fun homeWeekDates(nowMillis: Long): List<String> {
    val zone = java.util.TimeZone.getTimeZone("America/Lima")
    val start = Calendar.getInstance(zone).apply { timeInMillis = nowMillis; add(Calendar.DAY_OF_YEAR, -((get(Calendar.DAY_OF_WEEK) + 5) % 7)) }
    val formatter = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.ROOT).apply { timeZone = zone }
    return List(7) { i -> (start.clone() as Calendar).apply { add(Calendar.DAY_OF_YEAR, i) }.let { formatter.format(it.time) } }
}

@Composable
internal fun HomeQuickTool(title: String, colors: RastroColors, modifier: Modifier, onClick: () -> Unit) {
    Sticker3dCard(modifier.heightIn(min = 84.dp), shape = RoundedCornerShape(14.dp), onClick = onClick) {
        Column(Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(5.dp)) {
            val artwork = when (title) {
                "Fórmulas" -> R.drawable.home_tool_formula
                "Pizarra" -> R.drawable.home_tool_board
                "Vocacional" -> R.drawable.home_tool_compass
                else -> R.drawable.home_tool_periodic
            }
            Image(painterResource(artwork), null, Modifier.size(36.dp))
            Text(title, color = colors.textPrimary, fontSize = 11.sp, fontWeight = FontWeight.Black,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center)
        }
    }
}

@Composable
internal fun HomeCommunityStrip(colors: RastroColors) {
    val context = LocalContext.current
    Sticker3dCard(Modifier.fillMaxWidth(), onClick = {
        runCatching { context.startActivity(Intent(Intent.ACTION_VIEW,
            Uri.parse("https://whatsapp.com/channel/0029VbDFAEu7YScyVZBNul0X"))) }
            .onFailure { android.widget.Toast.makeText(context, "No se pudo abrir el canal.", android.widget.Toast.LENGTH_SHORT).show() }
    }) {
        Row(Modifier.fillMaxWidth().padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(painterResource(R.drawable.ic_whatsapp), null, tint = Color(0xFF15803D), modifier = Modifier.size(26.dp))
            Text("Comunidad RASTRO", Modifier.weight(1f), color = colors.textPrimary, fontWeight = FontWeight.Bold)
            Icon(Icons.AutoMirrored.Filled.ArrowForward, "Abrir canal oficial", tint = colors.accentText, modifier = Modifier.size(20.dp))
        }
    }
}
