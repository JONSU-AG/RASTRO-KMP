package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.theme.ThemeManager

val LocalMainPage = compositionLocalOf { false }

@Composable fun MainPageEnd() {
    if (!LocalMainPage.current) return
    val theme = ThemeManager.currentTheme
    Column(Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ClassicArtwork(ClassicAppearance.WELCOME, Modifier.size(150.dp), speed = 2f)
        Text("¡Llegaste al final!", fontWeight = FontWeight.Black, fontSize = 20.sp, color = theme.textPrimary)
        Text("Siempre hay algo nuevo por aprender.", color = theme.textSecondary)
    }
}
