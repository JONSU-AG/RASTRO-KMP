package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.data.*
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.theme.ThemeManager

/** One league, two sorting criteria. No local/demo accounts and no competing XP system. */
@OptIn(ExperimentalLayoutApi::class)
@Composable fun LeaguesScreen(onProfile: (String) -> Unit, onExams: () -> Unit) {
    val theme = ThemeManager.currentTheme
    val progress by GamificationManager.state.collectAsState()
    val league = LeagueCatalog.current(progress.xp)
    val uid = FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid.orEmpty()
    var metric by remember { mutableStateOf(LeagueMetric.XP) }
    var rows by remember { mutableStateOf(emptyList<LeagueMember>()) }
    var cursor by remember { mutableStateOf<DocumentSnapshot?>(null) }
    var more by remember { mutableStateOf(false) }
    var loading by remember { mutableStateOf(true) }
    var error by remember { mutableStateOf<String?>(null) }
    var personal by remember { mutableStateOf<PersonalLeaguePosition?>(null) }
    var generation by remember { mutableIntStateOf(0) }
    fun load(reset: Boolean) {
        val token = generation
        loading = true; error = null
        LeagueRepository.page(league.id, metric, if (reset) null else cursor) { result ->
            if (token == generation) {
                loading = false
                result.onSuccess { page -> rows = if (reset) page.members else (rows + page.members).distinctBy { it.uid }; cursor = page.cursor; more = page.hasMore }
                    .onFailure { error = "No se pudo cargar la clasificación. ${it.localizedMessage.orEmpty()}" }
            }
        }
        if (reset) LeagueRepository.personal(league.id, metric, uid) { result ->
            if (token == generation) result.onSuccess { personal = it }.onFailure { error = "No se pudo consultar tu posición. ${it.localizedMessage.orEmpty()}" }
        }
    }
    LaunchedEffect(league.id, metric, uid) {
        generation++; rows = emptyList(); personal = null; cursor = null; more = false
        val token = generation
        if (uid.isNotBlank()) {
            GamificationRepository.save(uid, progress) { result ->
                if (token == generation) result.onSuccess { load(true) }.onFailure { loading = false; error = "No se pudo sincronizar tu liga. ${it.localizedMessage.orEmpty()}" }
            }
        } else load(true)
    }
    DisposableEffect(Unit) { onDispose { generation++ } }
    LazyColumn(Modifier.fillMaxSize(), contentPadding = PaddingValues(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        item {
            Sticker3dCard(containerColor = theme.surfaceAccent, bevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                Column(Modifier.fillMaxWidth().padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        LeagueBadge(league, Modifier.size(74.dp))
                        Column(Modifier.weight(1f).padding(start = 12.dp)) {
                            Text("TU LIGA ACTUAL", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                            Text(league.title, color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 25.sp)
                            Text("${progress.xp} EXP · Nivel ${progress.level}", color = theme.textPrimary)
                        }
                    }
                    LinearProgressIndicator(progress = { LeagueCatalog.progress(progress.xp) }, modifier = Modifier.fillMaxWidth(), color = theme.accent, trackColor = theme.surface)
                    val next = LeagueCatalog.next(progress.xp)
                    Text(next?.let { "${it.minXp - progress.xp} EXP para ascender a ${it.title}" } ?: "¡Alcanzaste la liga más alta!", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                    Text(LeagueCatalog.previous(progress.xp)?.let { "Permanencia: ${league.minXp} EXP. Si el saldo baja de ese umbral, corresponde ${it.title}." }
                        ?: "Primera liga: no hay descenso.", color = theme.textSecondary, fontSize = 12.sp)
                    Text("Aprender y Simulacro comparten tu EXP. Cambiar EXP/RACHA solo ordena esta misma liga.", color = theme.textSecondary, fontSize = 12.sp)
                }
            }
        }
        item {
            Text("Camino de ligas", fontSize = 20.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
            BoxWithConstraints(Modifier.fillMaxWidth()) {
                val columns = if (maxWidth >= 700.dp) 5 else if (maxWidth >= 360.dp) 3 else 2
                val width = (maxWidth - 8.dp * (columns - 1)) / columns
                val fontScale = androidx.compose.ui.platform.LocalDensity.current.fontScale.coerceAtLeast(1f)
                Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    LeagueCatalog.all.chunked(columns).forEach { row ->
                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)) {
                            row.forEach { item ->
                                Sticker3dCard(modifier = Modifier.width(width).height(126.dp * fontScale),
                                    containerColor = if (item.id == league.id) theme.surfaceAccent else theme.surface,
                                    strokeColor = if (item.id == league.id) theme.accent else theme.strokeBorder, bevelColor = theme.cardBevel) {
                                    Column(Modifier.fillMaxSize().padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.SpaceEvenly) {
                                        LeagueBadge(item, Modifier.size(40.dp))
                                        Text(item.title, color = theme.textPrimary, fontWeight = FontWeight.Bold, fontSize = 12.sp,
                                            textAlign = androidx.compose.ui.text.style.TextAlign.Center, maxLines = 2)
                                        Text(if (item.id == league.id) "Actual" else "${item.minXp}+ EXP", color = theme.textSecondary, fontSize = 11.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        item {
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                LeagueMetric.entries.forEach { item ->
                    Sticker3dButton(onClick = { metric = item }, modifier = Modifier.weight(1f),
                        containerColor = if (metric == item) theme.accent else theme.surface, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                        Text(item.label, color = if (metric == item) contrastingText(theme.accent) else theme.textPrimary, fontWeight = FontWeight.Black)
                    }
                }
            }
        }
        item {
            personal?.let { me ->
                Sticker3dCard(containerColor = theme.surfaceAccent, strokeColor = theme.accent, bevelColor = theme.cardBevel) {
                    Column(Modifier.fillMaxWidth().padding(16.dp)) {
                        Text("TU POSICIÓN · ${me.position}.º", color = theme.textPrimary, fontSize = 20.sp, fontWeight = FontWeight.Black)
                        Text(if (metric == LeagueMetric.XP) "${me.member.xp} EXP" else "${me.member.streak} días de racha", color = theme.textPrimary)
                        me.member.examScore?.let { Text("Último Examen Ranking: $it / 100", color = theme.textSecondary) }
                    }
                }
            } ?: Text(if (uid.isBlank()) "Inicia sesión para competir y ver tu posición." else if (loading) "Consultando tu posición…" else "Tu posición estará disponible al sincronizar tu perfil.", color = theme.textSecondary)
        }
        item {
            Text("Podio · ${league.title}", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 22.sp)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                rows.take(3).forEachIndexed { index, member ->
                    Sticker3dCard(modifier = Modifier.weight(1f).height(220.dp * androidx.compose.ui.platform.LocalDensity.current.fontScale.coerceAtLeast(1f)), containerColor = theme.surfaceAccent,
                        strokeColor = theme.accent, bevelColor = theme.cardBevel, onClick = { onProfile(member.uid) }) {
                        Column(Modifier.fillMaxSize().padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(6.dp)) {
                            Icon(painterResource(R.drawable.ic_nav_ranking_filled), null, tint = theme.accent, modifier = Modifier.size(if (index == 0) 42.dp else 32.dp))
                            Text("${index + 1}.º", color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 24.sp)
                            CartoonAvatar(photoUrl = member.photo, size = 40.dp)
                            Text(member.name + if (member.uid == uid) " · Tú" else "", color = theme.textPrimary, fontWeight = FontWeight.Bold, fontSize = 13.sp, maxLines = 2, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis, textAlign = androidx.compose.ui.text.style.TextAlign.Center)
                            Text(if (metric == LeagueMetric.XP) "${member.xp} EXP" else "${member.streak} días", color = theme.textSecondary, fontSize = 12.sp)
                            member.examScore?.let { Text("Examen: $it / 100", color = theme.textSecondary, fontSize = 11.sp) }
                        }
                    }
                }
            }
            if (!loading && rows.isEmpty() && error == null) Text("Esta liga aún no tiene participantes sincronizados. No se añaden puestos ficticios.", color = theme.textSecondary)
        }
        itemsIndexed(rows.drop(3), key = { _, member -> member.uid }) { index, member ->
            Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = if (member.uid == uid) theme.surfaceAccent else theme.surface,
                strokeColor = if (member.uid == uid) theme.accent else theme.strokeBorder, bevelColor = theme.cardBevel, onClick = { onProfile(member.uid) }) {
                Row(Modifier.fillMaxWidth().padding(14.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("${index + 4}", color = theme.textPrimary, fontWeight = FontWeight.Black)
                    CartoonAvatar(photoUrl = member.photo, size = 36.dp)
                    Text(member.name + if (member.uid == uid) " · Tú" else "", modifier = Modifier.weight(1f), color = theme.textPrimary, fontWeight = FontWeight.Bold)
                    Text(if (metric == LeagueMetric.XP) "${member.xp} EXP" else "${member.streak} días", color = theme.textPrimary)
                }
            }
        }
        item {
            error?.let { Text(it, color = theme.textPrimary); TextButton(onClick = { load(rows.isEmpty()) }) { Text("Reintentar") } }
            if (loading) CircularProgressIndicator(color = theme.accent)
            else if (more) Sticker3dButton(onClick = { load(false) }, containerColor = theme.surfaceAccent, bottomBevelColor = theme.cardBevel) { Text("Ver más participantes", color = theme.textPrimary) }
            Sticker3dButton(onClick = onExams, modifier = Modifier.fillMaxWidth(), containerColor = theme.accent, bottomBevelColor = theme.accentBevel) { Text("IR A EXAMEN RANKING", color = contrastingText(theme.accent), fontWeight = FontWeight.Black) }
        }
    }
}

@Composable private fun LeagueBadge(league: League, modifier: Modifier) {
    val resource = when (league.id) {
        "wawita" -> R.drawable.league_wawita; "kinder" -> R.drawable.league_kinder
        "prefosil" -> R.drawable.league_prefosil; "fosil" -> R.drawable.league_fosil
        else -> R.drawable.league_cachimbo
    }
    Icon(painterResource(resource), contentDescription = league.title, tint = androidx.compose.ui.graphics.Color.Unspecified, modifier = modifier)
}
