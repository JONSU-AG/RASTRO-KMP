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
import com.jonsuapps.rastro.android.data.FavoritesRepository
import com.jonsuapps.rastro.android.data.FavoriteType
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
import com.jonsuapps.rastro.android.data.ExamQuestionRepository
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
    var selectedFaceIndex by remember { mutableIntStateOf(initialFaceIndex.coerceIn(0, 2)) } // 0: Fórmulas, 1: Mnemotecnias, 2: Flashcards
    val faces = listOf("Cara A: Fórmulas Vivas", "Cara B: Mnemotecnias", "Cara C: Flashcards")

    val allFavorites by FavoritesRepository.favoritesFlow.collectAsState()
    var selectedSubjectFilter by remember { mutableStateOf("Todas") }
    var showOnlyFavoritesInFlashcards by remember { mutableStateOf(false) }
    var selectedAreaFilter by remember { mutableStateOf("Todas") }
    var flashcardShuffleSeed by remember { mutableIntStateOf(0) }

    val officialBankCards = remember {
        val questions = ExamQuestionRepository.loadOfficialBank(context)
        ExamQuestionRepository.getQuestionsForFlashcards(questions)
    }

    val baseSubjects = listOf(
        "Todas", "Biología", "Química", "Física", "Psicología", "Historia",
        "Lenguaje", "Literatura", "Filosofía", "Geografía", "Ed. Cívica",
        "Álgebra", "Aritmética", "Geometría", "Trigonometría", "Raz. Verbal", "Raz. Lógico"
    )
    val favoriteFlashcardSubjects = remember(allFavorites) {
        val favCards = allFavorites.filter { it.type == FavoriteType.FLASHCARD }
        listOf("Todas") + favCards.map { it.subject }.filter(String::isNotBlank).distinct()
    }
    val subjects = if (selectedFaceIndex == 2 && showOnlyFavoritesInFlashcards && favoriteFlashcardSubjects.size > 1) {
        favoriteFlashcardSubjects
    } else {
        baseSubjects
    }


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

    val filteredFlashcards = remember(
        selectedSubjectFilter,
        searchQuery,
        showOnlyFavoritesInFlashcards,
        selectedAreaFilter,
        allFavorites,
        flashcardShuffleSeed
    ) {
        val baseList: List<com.jonsuapps.rastro.model.FlashcardItem> = if (showOnlyFavoritesInFlashcards) {
            val favs = allFavorites.filter { it.type == FavoriteType.FLASHCARD }
            val byArea = if (selectedAreaFilter == "Todas") favs else favs.filter { it.area.equals(selectedAreaFilter, ignoreCase = true) }
            val bySub = if (selectedSubjectFilter == "Todas") byArea else byArea.filter { it.subject.equals(selectedSubjectFilter, ignoreCase = true) }
            bySub.map { fav ->
                com.jonsuapps.rastro.model.FlashcardItem(
                    id = fav.itemId,
                    q = fav.title,
                    a = fav.subtitle,
                    subject = fav.subject,
                    imageUrl = fav.imageUrl ?: fav.extra.takeIf { it.isNotBlank() }
                )
            }
        } else {
            val allCards = if (officialBankCards.isNotEmpty()) {
                (officialBankCards + com.jonsuapps.rastro.data.SimuladorRepository.defaultFlashcards).distinctBy { it.id }
            } else {
                com.jonsuapps.rastro.data.SimuladorRepository.defaultFlashcards
            }
            if (selectedSubjectFilter == "Todas") allCards 
            else allCards.filter { it.subject.equals(selectedSubjectFilter, ignoreCase = true) }
        }

        val searched = if (searchQuery.isBlank()) {
            baseList
        } else {
            baseList.filter {
                it.q.contains(searchQuery, ignoreCase = true) ||
                it.a.contains(searchQuery, ignoreCase = true) ||
                it.subject.contains(searchQuery, ignoreCase = true) ||
                (it.subtemaTitle?.contains(searchQuery, ignoreCase = true) == true)
            }
        }

        if (flashcardShuffleSeed == 0) searched else searched.shuffled(kotlin.random.Random(flashcardShuffleSeed))
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
                .widthIn(max = 760.dp),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        // Selector 3D de Caras: Cara A, Cara B, Cara C
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                val faceItems = listOf(
                    Triple("Cara A", "Fórmulas", Icons.Rounded.Calculate),
                    Triple("Cara B", "Mnemotecnias", Icons.Rounded.Lightbulb),
                    Triple("Cara C", "Flashcards", Icons.Rounded.Psychology)
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
            else -> {
                // Cara C: Flashcards de Repaso Rápido
                val favCount = allFavorites.count { it.type == FavoriteType.FLASHCARD }
                item {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Switch de modo: Todas vs Favoritas
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(18.dp))
                                .background(theme.surface)
                                .border(1.2.dp, theme.strokeBorder, RoundedCornerShape(18.dp))
                                .padding(5.dp),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            com.jonsuapps.rastro.android.ui.components.Sticker3dPill(
                                selected = !showOnlyFavoritesInFlashcards,
                                onClick = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    showOnlyFavoritesInFlashcards = false
                                },
                                modifier = Modifier.weight(1f),
                                selectedColor = theme.accent,
                                unselectedColor = Color.Transparent,
                                selectedBevel = theme.accentBevel,
                                unselectedBevel = Color.Transparent,
                                strokeColor = if (!showOnlyFavoritesInFlashcards) theme.strokeBorder else Color.Transparent,
                                strokeWidth = if (!showOnlyFavoritesInFlashcards) 1.2.dp else 0.dp,
                                bevelHeight = if (!showOnlyFavoritesInFlashcards) 2.5.dp else 0.dp
                            ) {
                                Text(
                                    text = "📚 Todas",
                                    fontSize = 12.sp,
                                    fontWeight = if (!showOnlyFavoritesInFlashcards) FontWeight.Black else FontWeight.Bold,
                                    color = if (!showOnlyFavoritesInFlashcards) Color.White else theme.textSecondary
                                )
                            }

                            com.jonsuapps.rastro.android.ui.components.Sticker3dPill(
                                selected = showOnlyFavoritesInFlashcards,
                                onClick = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    showOnlyFavoritesInFlashcards = true
                                },
                                modifier = Modifier.weight(1.2f),
                                selectedColor = Color(0xFFF59E0B),
                                unselectedColor = Color.Transparent,
                                selectedBevel = Color(0xFFB45309),
                                unselectedBevel = Color.Transparent,
                                strokeColor = if (showOnlyFavoritesInFlashcards) theme.strokeBorder else Color.Transparent,
                                strokeWidth = if (showOnlyFavoritesInFlashcards) 1.2.dp else 0.dp,
                                bevelHeight = if (showOnlyFavoritesInFlashcards) 2.5.dp else 0.dp
                            ) {
                                Text(
                                    text = "⭐ Favoritas ($favCount)",
                                    fontSize = 12.sp,
                                    fontWeight = if (showOnlyFavoritesInFlashcards) FontWeight.Black else FontWeight.Bold,
                                    color = if (showOnlyFavoritesInFlashcards) Color.White else theme.textSecondary
                                )
                            }
                        }

                        // Filtros por Área y Botón Mix si Favoritas está activo
                        if (showOnlyFavoritesInFlashcards) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf("Todas", "Ingenierías", "Biomédicas", "Sociales").forEach { area ->
                                    val isSelected = selectedAreaFilter == area
                                    com.jonsuapps.rastro.android.ui.components.Sticker3dPill(
                                        selected = isSelected,
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            selectedAreaFilter = area
                                        },
                                        modifier = Modifier.weight(1f),
                                        selectedColor = theme.accent,
                                        unselectedColor = theme.surface,
                                        selectedBevel = theme.accentBevel,
                                        unselectedBevel = theme.cardBevel,
                                        strokeColor = theme.strokeBorder,
                                        strokeWidth = 1.dp,
                                        bevelHeight = 2.dp
                                    ) {
                                        Text(
                                            text = area,
                                            fontSize = 10.sp,
                                            fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                            color = if (isSelected) Color.White else theme.textSecondary,
                                            maxLines = 1
                                        )
                                    }
                                }
                            }

                            if (favCount > 0) {
                                Sticker3dButton(
                                    onClick = {
                                        DuolingoHaptics.playCelebration(context)
                                        flashcardShuffleSeed = kotlin.random.Random.nextInt(1, 999999)
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    containerColor = Color(0xFFF59E0B),
                                    bottomBevelColor = Color(0xFFB45309),
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(16.dp),
                                    bevelHeight = 4.dp
                                ) {
                                    Icon(Icons.Rounded.Shuffle, contentDescription = null, tint = Color.White)
                                    Spacer(Modifier.width(8.dp))
                                    Text("⚡ Mix de Favoritas (Aleatorio)", fontWeight = FontWeight.Black, color = Color.White, fontSize = 13.sp)
                                }
                            }
                        }
                    }
                }

                if (showOnlyFavoritesInFlashcards && filteredFlashcards.isEmpty()) {
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RastroShapes.Squircle,
                            colors = CardDefaults.cardColors(containerColor = theme.surface),
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
                        ) {
                            Column(
                                modifier = Modifier.padding(24.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.StarOutline,
                                    contentDescription = null,
                                    tint = Color(0xFFF59E0B),
                                    modifier = Modifier.size(36.dp)
                                )
                                Text(
                                    text = "Sin flashcards favoritas aquí",
                                    fontWeight = FontWeight.Black,
                                    fontSize = 15.sp,
                                    color = theme.textPrimary
                                )
                                Text(
                                    text = "Toca la estrella ⭐ en cualquier flashcard para guardarla por materia (ej. Biología) y repásalas todas con el Mix de Favoritas.",
                                    fontSize = 12.sp,
                                    color = theme.textSecondary,
                                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                    lineHeight = 17.sp
                                )
                            }
                        }
                    }
                } else {
                    items(filteredFlashcards, key = { it.id }) { card ->
                        FlashcardStudyCard(card = card, theme = theme)
                    }
                }
            }
        }
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
                            text = item.importance,
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

            Text(
                text = "Fórmula: ${item.shortFormula}",
                style = MaterialTheme.typography.bodySmall,
                color = theme.accent,
                fontWeight = FontWeight.SemiBold
            )

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
                Text(
                    text = "Consejo de Examen: ${item.fijaExamen}",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color(0xFFD97706),
                    fontWeight = FontWeight.Medium,
                    lineHeight = 16.sp
                )
            }
        }
    }
}

@Composable
fun FlashcardStudyCard(
    card: com.jonsuapps.rastro.model.FlashcardItem,
    theme: com.jonsuapps.rastro.theme.RastroPalette
) {
    var isFlipped by remember { mutableStateOf(false) }
    val density = androidx.compose.ui.platform.LocalDensity.current.density
    val rotation by androidx.compose.animation.core.animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = androidx.compose.animation.core.spring(
            dampingRatio = androidx.compose.animation.core.Spring.DampingRatioMediumBouncy,
            stiffness = androidx.compose.animation.core.Spring.StiffnessMediumLow
        ),
        label = "FormularioCardFlip"
    )
    val isBack = rotation > 90f

    com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                rotationY = rotation
                cameraDistance = 14f * density
            },
        onClick = { isFlipped = !isFlipped },
        shape = RoundedCornerShape(20.dp),
        containerColor = if (isBack) Color(0xFFF0FDF4) else theme.surface,
        bottomBevelColor = if (isBack) Color(0xFFBBF7D0) else theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 3.5.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .then(if (isBack) Modifier.graphicsLayer { rotationY = 180f } else Modifier)
                .padding(16.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(theme.accent.copy(alpha = 0.12f))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = card.subject,
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.accent,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    val favorites by FavoritesRepository.favoritesFlow.collectAsState()
                    val isFav = favorites.any { it.itemId == card.id && it.type == FavoriteType.FLASHCARD }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = {
                                FavoritesRepository.toggle(
                                    type = FavoriteType.FLASHCARD,
                                    itemId = card.id,
                                    title = card.q,
                                    subtitle = card.a,
                                    subject = card.subject,
                                    area = "General",
                                    imageUrl = card.imageUrl
                                )
                            },
                            modifier = Modifier.size(28.dp)
                        ) {
                            Icon(
                                imageVector = if (isFav) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                                contentDescription = "Favorito",
                                tint = if (isFav) Color(0xFFF59E0B) else theme.textSecondary,
                                modifier = Modifier.size(19.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = if (isBack) "Pregunta 🔄" else "Voltear 🔄",
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.textSecondary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                if (!isBack) {
                    Text(
                        text = card.q,
                        style = MaterialTheme.typography.titleMedium,
                        color = theme.textPrimary,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 22.sp
                    )
                    if (!card.imageUrl.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(8.dp))
                        CachedRemoteImage(
                            url = card.imageUrl,
                            contentDescription = "Imagen de la ficha",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "¿Sabes la respuesta fija? ¡Voltea para comprobar!",
                        style = MaterialTheme.typography.bodySmall,
                        color = theme.textSecondary
                    )
                } else {
                    Text(
                        text = "Respuesta Oficial:",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFF15803D),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = card.a,
                        style = MaterialTheme.typography.titleMedium,
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 22.sp
                    )
                    if (!card.imageUrl.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(8.dp))
                        CachedRemoteImage(
                            url = card.imageUrl,
                            contentDescription = "Imagen de la ficha",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Rounded.CheckCircle,
                            contentDescription = null,
                            tint = Color(0xFF10B981),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Clave de Admisión verificada",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFF10B981),
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
}
