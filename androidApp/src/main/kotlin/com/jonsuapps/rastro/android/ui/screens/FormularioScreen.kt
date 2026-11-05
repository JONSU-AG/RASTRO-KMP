package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.BookmarkBorder
import androidx.compose.material.icons.rounded.Calculate
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Functions
import androidx.compose.material.icons.rounded.Lightbulb
import androidx.compose.material.icons.rounded.Psychology
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material.icons.rounded.Bolt
import androidx.compose.material.icons.rounded.Shuffle
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.graphicsLayer
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.runtime.collectAsState
import com.jonsuapps.rastro.auth.UserManager
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.data.FormulasRepository
import com.jonsuapps.rastro.android.data.CanonicalFormula
import com.jonsuapps.rastro.android.ui.components.CanonicalFormulaCard
import com.jonsuapps.rastro.data.MnemotecniasRepository
import com.jonsuapps.rastro.model.MnemotecniaItem
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun FormularioScreen(
    modifier: Modifier = Modifier,
    initialFaceIndex: Int = 0
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    var selectedFaceIndex by remember { mutableIntStateOf(initialFaceIndex.coerceIn(0, 1)) } // 0: Fórmulas, 1: Mnemotecnias

    var selectedSubjectFilter by remember { mutableStateOf("Todas") }

    val baseSubjects = listOf(
        "Todas", "Biología", "Química", "Física", "Psicología", "Historia",
        "Lenguaje", "Literatura", "Filosofía", "Geografía", "Ed. Cívica",
        "Álgebra", "Aritmética", "Geometría", "Trigonometría", "Raz. Verbal", "Raz. Lógico"
    )
    val subjects = baseSubjects

    var searchQuery by remember { mutableStateOf("") }
    val savedMnemotecniaIds by UserManager.savedMnemotecniaIds.collectAsState()

    val filteredFormulas = remember(selectedSubjectFilter, searchQuery) {
        val bySub = FormulasRepository.getBySubject(selectedSubjectFilter)
        if (searchQuery.isBlank()) bySub
        else bySub.filter {
            it.name.contains(searchQuery, ignoreCase = true) ||
            it.topic.contains(searchQuery, ignoreCase = true) ||
            it.mainExpression.contains(searchQuery, ignoreCase = true) ||
            it.description.contains(searchQuery, ignoreCase = true) ||
            it.datoClave.contains(searchQuery, ignoreCase = true)
        }
    }

    val filteredMnemotecnias = remember(selectedSubjectFilter, searchQuery) {
        val bySub = MnemotecniasRepository.getBySubject(selectedSubjectFilter)
        if (searchQuery.isBlank()) {
            bySub
        } else {
            bySub.filter {
                it.phrase.contains(searchQuery, ignoreCase = true) ||
                it.topic.contains(searchQuery, ignoreCase = true) ||
                it.summary.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 1100.dp),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        // Un único acceso a cada herramienta; las Flashcards viven en Simulador.
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                val faceItems = listOf(
                    Triple("Cara A", "Fórmulas", Icons.Rounded.Calculate),
                    Triple("Cara B", "Mnemotecnias", Icons.Rounded.Lightbulb)
                )
                faceItems.forEachIndexed { index, (faceLabel, title, _) ->
                    val isSelected = selectedFaceIndex == index
                    Sticker3dButton(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            selectedFaceIndex = index
                        },
                        modifier = Modifier.weight(1f).height(52.dp),
                        containerColor = if (isSelected) theme.accent else theme.surface,
                        bottomBevelColor = if (isSelected) theme.accentBevel else theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.5.dp,
                        bevelHeight = 3.5.dp,
                        shape = RoundedCornerShape(16.dp),
                        contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = faceLabel,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isSelected) Color.White.copy(alpha = 0.85f) else theme.accent
                            )
                            Text(
                                text = title,
                                fontSize = 11.5.sp,
                                fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                color = if (isSelected) Color.White else theme.textPrimary,
                                maxLines = 1
                            )
                        }
                    }
                }
            }
        }

        // Filtro por materias con Chips 3D
        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(subjects) { subj ->
                    val isSelected = subj == selectedSubjectFilter
                    Sticker3dButton(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            selectedSubjectFilter = subj
                        },
                        containerColor = if (isSelected) theme.accent else theme.surface,
                        bottomBevelColor = if (isSelected) theme.accentBevel else theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.3.dp,
                        bevelHeight = 2.5.dp,
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 7.dp)
                    ) {
                        Text(
                            text = subj,
                            fontSize = 12.sp,
                            fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                            color = if (isSelected) Color.White else theme.textSecondary
                        )
                    }
                }
            }
        }

        // Barra de Búsqueda
        item {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = {
                    Text(
                        text = if (selectedFaceIndex == 0) "Buscar fórmula o variable..." else "Buscar mnemotecnia o tema...",
                        style = MaterialTheme.typography.bodySmall,
                        color = theme.textSecondary
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Rounded.Search,
                        contentDescription = null,
                        tint = theme.textSecondary
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RastroShapes.Squircle),
                singleLine = true,
                shape = RastroShapes.Squircle,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = theme.accent,
                    unfocusedBorderColor = theme.borderSubtle,
                    focusedContainerColor = theme.surface,
                    unfocusedContainerColor = theme.surface
                )
            )
        }

        when (selectedFaceIndex) {
            0 -> {
                // Cara A: Calculadora Viva & Fórmulas Científicas con Formato Especial
                item {
                    CalculadoraVivaCard(theme = theme)
                }
                items(filteredFormulas, key = { it.id }) { formula ->
                    CanonicalFormulaCard(formula = formula, theme = theme)
                }
            }
            1 -> {
                // Cara B: Bóveda de Mnemotecnias
                items(filteredMnemotecnias, key = { it.id }) { item ->
                    val isSaved = savedMnemotecniaIds.contains(item.id)
                    MnemotecniaItemCard(
                        item = item,
                        isSaved = isSaved,
                        onToggleSave = { UserManager.toggleSaveMnemotecnia(item.id) },
                        theme = theme
                    )
                }
            }

        }

            item { com.jonsuapps.rastro.android.ui.components.MainPageEnd() }
}
}
}

@Composable
fun CalculadoraVivaCard(theme: com.jonsuapps.rastro.theme.RastroPalette) {
    var vInput by remember { mutableStateOf("20") }
    var tInput by remember { mutableStateOf("6") }
    val calculatedDistance = remember(vInput, tInput) {
        val v = vInput.toDoubleOrNull() ?: 0.0
        val t = tInput.toDoubleOrNull() ?: 0.0
        v * t
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RastroShapes.Squircle,
        colors = CardDefaults.cardColors(containerColor = theme.surface),
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RastroShapes.Pill)
                        .background(theme.accent.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Calculate,
                        contentDescription = null,
                        tint = theme.accent,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = "Calculadora Viva: Cinemática MRU",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Text(
                        text = "d = v · t (Sistema Internacional S.I.)",
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.accent,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Inputs interactivos
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                OutlinedTextField(
                    value = vInput,
                    onValueChange = { vInput = it },
                    label = { Text("Rapidez (v) [m/s]") },
                    modifier = Modifier.weight(1f),
                    shape = RastroShapes.Squircle,
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.borderSubtle
                    )
                )

                OutlinedTextField(
                    value = tInput,
                    onValueChange = { tInput = it },
                    label = { Text("Tiempo (t) [s]") },
                    modifier = Modifier.weight(1f),
                    shape = RastroShapes.Squircle,
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.borderSubtle
                    )
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Resultado en Vivo
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RastroShapes.Squircle)
                    .background(theme.surfaceAccent)
                    .padding(14.dp)
            ) {
                Column {
                    Text(
                        text = "Distancia Calculada (d):",
                        style = MaterialTheme.typography.labelMedium,
                        color = theme.textSecondary
                    )
                    Text(
                        text = "$calculatedDistance metros [m]",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = theme.accent
                    )
                }
            }
        }
    }
}

@Composable
fun MnemotecniaItemCard(
    item: MnemotecniaItem,
    isSaved: Boolean,
    onToggleSave: () -> Unit,
    theme: com.jonsuapps.rastro.theme.RastroPalette
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RastroShapes.Squircle,
        colors = CardDefaults.cardColors(containerColor = theme.surface),
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(theme.accent.copy(alpha = 0.12f))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = item.subject,
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.accent,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(Color(0xFFFEF3C7))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = com.jonsuapps.rastro.android.ui.components.AcademicPresentationText.clean(item.importance),
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFB45309),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                IconButton(
                    onClick = onToggleSave,
                    modifier = Modifier.size(28.dp)
                ) {
                    Icon(
                        imageVector = if (isSaved) Icons.Rounded.Bookmark else Icons.Rounded.BookmarkBorder,
                        contentDescription = "Guardar Mnemotecnia",
                        tint = if (isSaved) theme.accent else theme.textSecondary,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = item.phrase,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary
            )

            if (com.jonsuapps.rastro.android.ui.components.ScientificMathSource.isMathSubject(item.subject))
            com.jonsuapps.rastro.android.ui.components.ScientificMath(
                listOf(com.jonsuapps.rastro.android.ui.components.ScientificMathSource.normalize(item.shortFormula)),
                theme.textPrimary, fontSize = 17f
            )
            else Text(item.shortFormula, color = theme.textPrimary, style = MaterialTheme.typography.bodySmall)

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = item.summary,
                style = MaterialTheme.typography.bodySmall,
                color = theme.textSecondary,
                lineHeight = 16.sp
            )

            // Desglose de Letras
            if (item.breakdown.isNotEmpty()) {
                Spacer(modifier = Modifier.height(12.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RastroShapes.Squircle)
                        .background(theme.surfaceAccent.copy(alpha = 0.5f))
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    item.breakdown.forEach { b ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "${b.letter} = ${b.word}: ",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = theme.accent
                            )
                            Text(
                                text = "${b.concept} (${b.unit})",
                                style = MaterialTheme.typography.bodySmall,
                                color = theme.textPrimary
                            )
                        }
                    }
                }
            }

            // Triángulo Nemotécnico si aplica
            item.triangulo?.let { tri ->
                Spacer(modifier = Modifier.height(12.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RastroShapes.Squircle)
                        .background(Color(0xFFEFF6FF))
                        .padding(10.dp)
                ) {
                    Column {
                        Text(
                            text = "Regla de Oro del Triángulo:",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1D4ED8)
                        )
                        Text(
                            text = tri.regla,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF1E3A8A),
                            lineHeight = 16.sp
                        )
                    }
                }
            }

            // Fija de Examen
            if (item.fijaExamen.isNotBlank()) {
                Spacer(modifier = Modifier.height(10.dp))
                com.jonsuapps.rastro.android.ui.components.AcademicImportantCard(item.fijaExamen)
            }
        }
    }
}
