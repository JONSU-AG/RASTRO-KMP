package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.vocational.RiasecDimension
import com.jonsuapps.rastro.vocational.VocationalItemBank
import com.jonsuapps.rastro.vocational.VocationalRepository
import com.jonsuapps.rastro.vocational.VocationalResult
import com.jonsuapps.rastro.vocational.VocationalScoringEngine

private enum class VocationalStep {
    INTRO,
    QUESTIONS,
    RESULTS
}

@Composable
fun VocationalTestScreen(
    onDismiss: () -> Unit,
    colors: RastroPalette = ThemeManager.currentTheme,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var currentStep by remember { mutableStateOf(VocationalStep.INTRO) }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    val answers = remember { mutableStateMapOf<Int, Int>() } // questionId -> value (1..5)
    var testResult by remember { mutableStateOf<VocationalResult?>(VocationalRepository.currentResult.value) }

    var showExitConfirmDialog by remember { mutableStateOf(false) }
    var showRestartConfirmDialog by remember { mutableStateOf(false) }

    val questions = remember { VocationalItemBank.getQuestions() }
    val isBankAvailable = remember { VocationalItemBank.isBankLoaded }

    // Diálogo de confirmación para salir durante el test si ya ha respondido
    if (showExitConfirmDialog) {
        Dialog(onDismissRequest = { showExitConfirmDialog = false }) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .widthIn(max = 400.dp),
                containerColor = colors.surface,
                bottomBevelColor = colors.cardBevel,
                strokeColor = colors.strokeBorder,
                bevelHeight = 4.dp,
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFF59E0B).copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Warning,
                            contentDescription = null,
                            tint = Color(0xFFF59E0B),
                            modifier = Modifier.size(26.dp)
                        )
                    }

                    Text(
                        text = "¿Quieres salir del test?",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textPrimary,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Tu progreso actual podría perderse si sales antes de completar todas las actividades.",
                        fontSize = 12.sp,
                        color = colors.textSecondary,
                        textAlign = TextAlign.Center,
                        lineHeight = 17.sp
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = { showExitConfirmDialog = false },
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text("Continuar test", fontWeight = FontWeight.Bold, color = colors.textPrimary)
                        }

                        Button(
                            onClick = {
                                showExitConfirmDialog = false
                                onDismiss()
                            },
                            modifier = Modifier.weight(1f).height(44.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444)),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text("Salir", fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }
                }
            }
        }
    }

    // Diálogo de confirmación para reiniciar el test
    if (showRestartConfirmDialog) {
        Dialog(onDismissRequest = { showRestartConfirmDialog = false }) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .widthIn(max = 400.dp),
                containerColor = colors.surface,
                bottomBevelColor = colors.cardBevel,
                strokeColor = colors.strokeBorder,
                bevelHeight = 4.dp,
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    Text(
                        text = "¿Quieres realizar nuevamente la evaluación?",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textPrimary,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Se iniciará una nueva sesión del test vocacional para responder las actividades desde el inicio.",
                        fontSize = 12.sp,
                        color = colors.textSecondary,
                        textAlign = TextAlign.Center,
                        lineHeight = 17.sp
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = { showRestartConfirmDialog = false },
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text("Cancelar", fontWeight = FontWeight.Bold, color = colors.textPrimary)
                        }

                        Button(
                            onClick = {
                                showRestartConfirmDialog = false
                                answers.clear()
                                currentQuestionIndex = 0
                                currentStep = if (isBankAvailable) VocationalStep.QUESTIONS else VocationalStep.INTRO
                            },
                            modifier = Modifier.weight(1f).height(44.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = colors.accent),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text("Reiniciar", fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }
                }
            }
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.background)
    ) {
        // Barra superior
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = colors.surface,
            shadowElevation = 1.dp
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = {
                            if (currentStep == VocationalStep.QUESTIONS && answers.isNotEmpty()) {
                                showExitConfirmDialog = true
                            } else {
                                onDismiss()
                            }
                        },
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surfaceAccent)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = colors.textPrimary,
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "Orientación Vocacional",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary
                    )
                }

                if (currentStep == VocationalStep.RESULTS) {
                    TextButton(onClick = { showRestartConfirmDialog = true }) {
                        Icon(
                            imageVector = Icons.Rounded.Refresh,
                            contentDescription = null,
                            tint = colors.accent,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Repetir",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.accent
                        )
                    }
                }
            }
        }

        // Cuerpo dinámico según el paso
        AnimatedContent(
            targetState = currentStep,
            label = "VocationalStepTransition",
            modifier = Modifier.fillMaxSize()
        ) { step ->
            when (step) {
                VocationalStep.INTRO -> {
                    VocationalIntroContent(
                        colors = colors,
                        isBankAvailable = isBankAvailable,
                        onStartTest = {
                            if (isBankAvailable) {
                                currentStep = VocationalStep.QUESTIONS
                            }
                        },
                        onClose = onDismiss
                    )
                }
                VocationalStep.QUESTIONS -> {
                    if (!isBankAvailable || questions.isEmpty()) {
                        VocationalBankPendingContent(colors = colors, onDismiss = onDismiss)
                    } else {
                        val currentQuestion = questions.getOrNull(currentQuestionIndex)
                        if (currentQuestion != null) {
                            VocationalQuestionContent(
                                question = currentQuestion,
                                currentIndex = currentQuestionIndex,
                                totalQuestions = questions.size,
                                selectedValue = answers[currentQuestion.id],
                                colors = colors,
                                onSelectValue = { value ->
                                    DuolingoHaptics.playOptionSelected(context)
                                    answers[currentQuestion.id] = value
                                },
                                onPrev = {
                                    if (currentQuestionIndex > 0) {
                                        currentQuestionIndex--
                                    }
                                },
                                onNext = {
                                    if (currentQuestionIndex < questions.size - 1) {
                                        currentQuestionIndex++
                                    } else {
                                        // Finalizar y calcular
                                        if (answers.size == questions.size) {
                                            val calculated = VocationalScoringEngine.calculateResult(
                                                questions = questions,
                                                answers = answers,
                                                timestamp = System.currentTimeMillis()
                                            )
                                            testResult = calculated
                                            VocationalRepository.saveResult(calculated)
                                            currentStep = VocationalStep.RESULTS
                                        }
                                    }
                                }
                            )
                        }
                    }
                }
                VocationalStep.RESULTS -> {
                    testResult?.let { res ->
                        VocationalResultsContent(
                            result = res,
                            colors = colors,
                            onRestart = { showRestartConfirmDialog = true },
                            onFinish = onDismiss
                        )
                    } ?: run {
                        VocationalIntroContent(
                            colors = colors,
                            isBankAvailable = isBankAvailable,
                            onStartTest = { currentStep = VocationalStep.QUESTIONS },
                            onClose = onDismiss
                        )
                    }
                }
            }
        }
    }
}

/**
 * Pantalla Inicial (Sección 3): Introducción psicométrica y ética rigurosa.
 */
@Composable
private fun VocationalIntroContent(
    colors: RastroPalette,
    isBankAvailable: Boolean,
    onStartTest: () -> Unit,
    onClose: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 620.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                // Título Principal
                Text(
                    text = "Conoce mejor tus intereses",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textPrimary,
                    lineHeight = 26.sp
                )

                // Texto metodológico principal
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(
                            text = "Esta herramienta de orientación vocacional de RASTRO explora tus preferencias e intereses mediante diferentes situaciones y actividades.\n\nNo existen respuestas correctas o incorrectas.\n\nResponde pensando en lo que realmente te interesa, no en lo que otras personas esperan de ti.",
                            fontSize = 13.sp,
                            color = colors.textPrimary,
                            lineHeight = 19.sp
                        )
                    }
                }

                // Resumen de la prueba (Métricas objetivas)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    MetricChip(label = "60 actividades", colors = colors, modifier = Modifier.weight(1f))
                    MetricChip(label = "6 áreas de interés", colors = colors, modifier = Modifier.weight(1f))
                    MetricChip(label = "10–20 minutos", colors = colors, modifier = Modifier.weight(1.1f))
                }

                // Instrucciones de respuesta
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Rounded.Info,
                                contentDescription = null,
                                tint = colors.accent,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Pautas para responder",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = colors.textPrimary
                            )
                        }

                        Text(
                            text = "No existen respuestas correctas o incorrectas.\n\nResponde pensando en cuánto te gustaría realizar cada actividad, independientemente de si actualmente sabes hacerla bien, si has tenido la oportunidad de practicarla o si consideras que eres bueno en ella.\n\nPara obtener un perfil útil, responde según lo que realmente te interesa y no según lo que otras personas esperan de ti.",
                            fontSize = 12.sp,
                            color = colors.textSecondary,
                            lineHeight = 17.sp
                        )
                    }
                }

                // Aviso ético regulatorio
                Surface(
                    shape = RoundedCornerShape(14.dp),
                    color = Color(0xFFF59E0B).copy(alpha = 0.10f),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFF59E0B).copy(alpha = 0.25f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.VerifiedUser,
                            contentDescription = null,
                            tint = Color(0xFFD97706),
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "AVISO: Los resultados son orientativos y no constituyen un diagnóstico psicológico ni determinan por sí solos qué carrera debes estudiar.",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colors.textPrimary,
                            lineHeight = 17.sp
                        )
                    }
                }

                if (!isBankAvailable) {
                    // Aviso de banco pendiente de incorporación
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = colors.surfaceAccent,
                        border = androidx.compose.foundation.BorderStroke(1.dp, colors.strokeBorder),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "BANCO VOCACIONAL DEFINITIVO PENDIENTE",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Black,
                                color = colors.accent,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "La arquitectura de orientación vocacional de RASTRO está validada y lista. El banco definitivo adaptado para postulantes preuniversitarios se encuentra pendiente de validación académica.",
                                fontSize = 11.sp,
                                color = colors.textSecondary,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Botón comenzar
                Sticker3dButton(
                    onClick = onStartTest,
                    enabled = isBankAvailable,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    containerColor = colors.accent,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = if (isBankAvailable) "COMENZAR TEST" else "BANCO PENDIENTE DE CARGA",
                        fontWeight = FontWeight.Black,
                        fontSize = 14.sp,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

/**
 * Pantalla que se muestra cuando el banco aún está pendiente.
 */
@Composable
private fun VocationalBankPendingContent(
    colors: RastroPalette,
    onDismiss: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.HourglassEmpty,
            contentDescription = null,
            tint = colors.accent,
            modifier = Modifier.size(54.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "BANCO VOCACIONAL DEFINITIVO PENDIENTE",
            fontSize = 15.sp,
            fontWeight = FontWeight.Black,
            color = colors.textPrimary,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "La arquitectura de orientación vocacional de RASTRO está validada y lista. El banco definitivo adaptado para postulantes preuniversitarios se encuentra en proceso de validación académica.",
            fontSize = 12.sp,
            color = colors.textSecondary,
            textAlign = TextAlign.Center,
            lineHeight = 17.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        OutlinedButton(
            onClick = onDismiss,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text("Regresar", fontWeight = FontWeight.Bold, color = colors.textPrimary)
        }
    }
}

/**
 * Pantalla de resolución de actividad individual (Sección 6, 11, 12).
 */
@Composable
private fun VocationalQuestionContent(
    question: com.jonsuapps.rastro.vocational.VocationalQuestion,
    currentIndex: Int,
    totalQuestions: Int,
    selectedValue: Int?,
    colors: RastroPalette,
    onSelectValue: (Int) -> Unit,
    onPrev: () -> Unit,
    onNext: () -> Unit
) {
    val progressPercent = ((currentIndex + 1).toFloat() / totalQuestions.toFloat())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 620.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                // Progreso
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Pregunta ${currentIndex + 1} de $totalQuestions",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textPrimary
                    )

                    Text(
                        text = "${(progressPercent * 100).toInt()}%",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colors.textSecondary
                    )
                }

                // Barra de progreso limpia
                LinearProgressIndicator(
                    progress = { progressPercent },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = colors.accent,
                    trackColor = colors.surfaceAccent
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Enunciado de la actividad
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = "¿Qué tanto te gustaría realizar esta actividad?",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colors.accent
                        )

                        Text(
                            text = question.text,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textPrimary,
                            lineHeight = 23.sp
                        )
                    }
                }

                // Escala de 5 opciones (Sección 6): Diferenciadas por TEXTO
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    LikertOptionRow(
                        value = 5,
                        text = "Me gusta mucho",
                        isSelected = selectedValue == 5,
                        colors = colors,
                        onClick = { onSelectValue(5) }
                    )
                    LikertOptionRow(
                        value = 4,
                        text = "Me gusta",
                        isSelected = selectedValue == 4,
                        colors = colors,
                        onClick = { onSelectValue(4) }
                    )
                    LikertOptionRow(
                        value = 3,
                        text = "No estoy seguro/a",
                        isSelected = selectedValue == 3,
                        colors = colors,
                        onClick = { onSelectValue(3) }
                    )
                    LikertOptionRow(
                        value = 2,
                        text = "Me disgusta",
                        isSelected = selectedValue == 2,
                        colors = colors,
                        onClick = { onSelectValue(2) }
                    )
                    LikertOptionRow(
                        value = 1,
                        text = "Me disgusta mucho",
                        isSelected = selectedValue == 1,
                        colors = colors,
                        onClick = { onSelectValue(1) }
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Botones de Navegación
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = onPrev,
                        enabled = currentIndex > 0,
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.height(46.dp)
                    ) {
                        Icon(Icons.Rounded.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Anterior", fontWeight = FontWeight.Bold)
                    }

                    Button(
                        onClick = onNext,
                        enabled = selectedValue != null,
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colors.accent),
                        modifier = Modifier.height(46.dp)
                    ) {
                        Text(
                            text = if (currentIndex == totalQuestions - 1) "Finalizar y Ver Perfil" else "Siguiente",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(
                            imageVector = if (currentIndex == totalQuestions - 1) Icons.Rounded.Check else Icons.Rounded.ArrowForward,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp),
                            tint = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

/**
 * Fila para cada una de las 5 opciones Likert.
 */
@Composable
private fun LikertOptionRow(
    value: Int,
    text: String,
    isSelected: Boolean,
    colors: RastroPalette,
    onClick: () -> Unit
) {
    val borderColor = if (isSelected) colors.accent else colors.borderSubtle
    val bgColor = if (isSelected) colors.accent.copy(alpha = 0.10f) else colors.surface

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(bgColor)
            .border(if (isSelected) 1.8.dp else 1.dp, borderColor, RoundedCornerShape(14.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            fontSize = 13.5.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            color = if (isSelected) colors.accent else colors.textPrimary
        )

        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .border(1.5.dp, if (isSelected) colors.accent else colors.textSecondary.copy(alpha = 0.5f), CircleShape)
                .background(if (isSelected) colors.accent else Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            if (isSelected) {
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                )
            }
        }
    }
}

/**
 * Pantalla de Resultados (Sección 13, 14, 15, 18).
 */
@Composable
private fun VocationalResultsContent(
    result: VocationalResult,
    colors: RastroPalette,
    onRestart: () -> Unit,
    onFinish: () -> Unit
) {
    val ordered = remember(result) { result.orderedScores() }
    val hollandFormatted = remember(result) {
        result.hollandCode.map { it.toString() }.joinToString(" · ")
    }
    val synthesis = remember(result) {
        VocationalScoringEngine.generateProfileSynthesis(result)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 620.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                // Encabezado de Resultados
                Text(
                    text = "TU PERFIL DE INTERESES",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.accent,
                    letterSpacing = 1.sp
                )

                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    bevelHeight = 4.dp,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(
                            text = "Código Predominante:",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colors.textSecondary
                        )

                        Text(
                            text = hollandFormatted,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.textPrimary,
                            letterSpacing = 2.sp
                        )

                        Text(
                            text = ordered.take(3).joinToString(" · ") { it.dimension.title },
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.accent
                        )
                    }
                }

                // Desglose de las 6 Dimensiones (Sección 13: ninguna oculta)
                Text(
                    text = "Puntuación en las 6 Dimensiones (10 a 50)",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = colors.textPrimary
                )

                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    ordered.forEach { dimScore ->
                        DimensionScoreCard(dimScore = dimScore, colors = colors)
                    }
                }

                // Interpretación del Perfil (Sección 15)
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "Interpretación de tu Perfil",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textPrimary
                        )

                        Text(
                            text = synthesis,
                            fontSize = 12.sp,
                            color = colors.textSecondary,
                            lineHeight = 17.sp
                        )

                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Esto puede servirte como punto de partida para explorar áreas de estudio y ocupaciones relacionadas con estos intereses.",
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Medium,
                            color = colors.textPrimary,
                            lineHeight = 16.sp
                        )
                    }
                }

                // Sección: "¿Qué significa mi resultado?" (Sección 18)
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    bottomBevelColor = colors.cardBevel,
                    strokeColor = colors.strokeBorder,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "¿Qué significa mi resultado?",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textPrimary
                        )

                        Text(
                            text = "Los intereses vocacionales describen los tipos de actividades y entornos que una persona puede encontrar más atractivos.\n\nSon una parte de la decisión vocacional.\n\nAl elegir una carrera también conviene considerar tus habilidades, valores, objetivos, oportunidades educativas y circunstancias personales.",
                            fontSize = 12.sp,
                            color = colors.textSecondary,
                            lineHeight = 17.sp
                        )
                    }
                }

                // Atribución Oficial O*NET (Sección 4)
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = colors.surfaceAccent,
                    border = androidx.compose.foundation.BorderStroke(1.dp, colors.borderSubtle),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(
                            text = "Atribución Metodológica:",
                            fontSize = 10.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textPrimary
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Metodología basada en el O*NET® Interest Profiler™ y el modelo RIASEC de Holland. O*NET® es una marca registrada del Departamento de Trabajo de Estados Unidos. RASTRO utiliza esta metodología exclusivamente con propósitos formativos y de orientación, sin que el Departamento de Trabajo de EE.UU. o el National Center for O*NET Development hayan aprobado, certificado o respaldado este producto.",
                            fontSize = 10.sp,
                            color = colors.textSecondary,
                            lineHeight = 14.sp
                        )
                    }
                }

                // Botones inferiores
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = onRestart,
                        modifier = Modifier.weight(1f).height(48.dp),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text("Repetir Test", fontWeight = FontWeight.Bold, color = colors.textPrimary)
                    }

                    Button(
                        onClick = onFinish,
                        modifier = Modifier.weight(1f).height(48.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colors.accent),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text("Cerrar", fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
private fun DimensionScoreCard(
    dimScore: com.jonsuapps.rastro.vocational.VocationalDimensionScore,
    colors: RastroPalette
) {
    val progress = ((dimScore.score - 10).coerceAtLeast(0).toFloat() / 40f).coerceIn(0f, 1f)

    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        containerColor = colors.surface,
        bottomBevelColor = colors.cardBevel,
        strokeColor = colors.strokeBorder,
        bevelHeight = 2.5.dp,
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(colors.accent.copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = dimScore.dimension.code.toString(),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.accent
                        )
                    }

                    Text(
                        text = dimScore.dimension.title,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textPrimary
                    )
                }

                Text(
                    text = "${dimScore.score} / 50",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textPrimary
                )
            }

            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = colors.accent,
                trackColor = colors.surfaceAccent
            )

            Text(
                text = dimScore.dimension.description,
                fontSize = 10.5.sp,
                color = colors.textSecondary,
                lineHeight = 14.sp
            )
        }
    }
}

@Composable
private fun MetricChip(
    label: String,
    colors: RastroPalette,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = colors.surfaceAccent,
        border = androidx.compose.foundation.BorderStroke(1.dp, colors.borderSubtle),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 6.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = label,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = colors.textPrimary,
                textAlign = TextAlign.Center
            )
        }
    }
}
