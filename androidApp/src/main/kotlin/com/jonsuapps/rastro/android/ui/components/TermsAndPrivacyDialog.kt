package com.jonsuapps.rastro.android.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.theme.RastroPalette
import kotlinx.coroutines.launch

/**
 * Modal 3D Cartoon oficial de Políticas, Términos y Eliminación de Cuenta.
 * Adaptado estrictamente a los requerimientos de la Google Play Store:
 * 1. Acceso a Políticas de Privacidad y Términos de Servicio.
 * 2. Moderación de Contenido Generado por el Usuario (UGC Policy).
 * 3. Mecanismo de Eliminación de Cuenta y Datos dentro de la aplicación (Account Deletion Policy).
 */
@Composable
fun TermsAndPrivacyDialog(
    colors: RastroPalette,
    initialTab: Int = 0, // 0: Privacidad, 1: Términos & UGC, 2: Eliminar Cuenta, 3: Autoría & Deslinde
    onDismiss: () -> Unit,
    onAccountDeleted: () -> Unit = {}
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var selectedTab by remember { mutableIntStateOf(initialTab.coerceIn(0, 3)) }
    val tabs = listOf("Privacidad", "Términos & UGC", "Eliminar Cuenta", "Autoría & Deslinde")

    var showDeleteConfirmDialog by remember { mutableStateOf(false) }
    var isDeletingAccount by remember { mutableStateOf(false) }
    var deleteError by remember { mutableStateOf<String?>(null) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.88f)
                .widthIn(max = 560.dp),
            containerColor = colors.surface,
            bottomBevelColor = colors.cardBevel,
            strokeColor = colors.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(26.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Barra superior de cabecera
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.accent.copy(alpha = 0.14f))
                                .border(1.5.dp, colors.accent.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Shield,
                                contentDescription = null,
                                tint = colors.accent,
                                modifier = Modifier.size(22.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Transparencia & Legal",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Black,
                                color = colors.textPrimary
                            )
                            Text(
                                text = "Reglamentos y Normativas de Google Play",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF10B981)
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = colors.textSecondary,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                // Selector de pestañas táctil 3D
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val tabItems = listOf(
                        Triple("🛡️ Privacidad", Color(0xFF3B82F6), Color(0xFF1D4ED8)),
                        Triple("📜 Términos & UGC", Color(0xFF10B981), Color(0xFF047857)),
                        Triple("🗑️ Eliminar Cuenta", Color(0xFFEF4444), Color(0xFFB91C1C)),
                        Triple("⚖️ Autoría & Licencias", Color(0xFF8B5CF6), Color(0xFF6D28D9))
                    )
                    tabItems.forEachIndexed { index, (label, activeColor, activeBevel) ->
                        val isSelected = selectedTab == index
                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                selectedTab = index
                            },
                            containerColor = if (isSelected) activeColor else colors.surface,
                            bottomBevelColor = if (isSelected) activeBevel else colors.cardBevel,
                            strokeColor = colors.strokeBorder,
                            strokeWidth = 1.3.dp,
                            bevelHeight = 3.dp,
                            shape = RoundedCornerShape(12.dp),
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = label,
                                fontSize = 12.sp,
                                fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                color = if (isSelected) Color.White else colors.textPrimary,
                                maxLines = 1
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Contenido dinámico con scroll
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(18.dp))
                        .background(colors.background)
                        .border(1.2.dp, colors.strokeBorder.copy(alpha = 0.3f), RoundedCornerShape(18.dp))
                        .padding(14.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        when (selectedTab) {
                            0 -> PrivacyTabContent(colors)
                            1 -> TermsUgcTabContent(colors)
                            2 -> AccountDeletionTabContent(
                                colors = colors,
                                onRequestDelete = { showDeleteConfirmDialog = true }
                            )
                            3 -> AuthorshipTabContent(colors)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Pie de página de contacto
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "RASTRO v2.0 • Autor de la Aplicación",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textSecondary
                    )
                    TextButton(
                        onClick = {
                            val intent = Intent(Intent.ACTION_SENDTO).apply {
                                data = Uri.parse("mailto:aguilar.jonsu@gmail.com")
                                putExtra(Intent.EXTRA_SUBJECT, "Consulta Legal / Privacidad RASTRO")
                            }
                            context.startActivity(intent)
                        },
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Email,
                            contentDescription = null,
                            tint = colors.accent,
                            modifier = Modifier.size(15.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Contacto Legal",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.accent
                        )
                    }
                }
            }
        }
    }

    // Modal de confirmación irreversible de eliminación de cuenta
    if (showDeleteConfirmDialog) {
        Dialog(onDismissRequest = { if (!isDeletingAccount) showDeleteConfirmDialog = false }) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .widthIn(max = 400.dp),
                containerColor = colors.surface,
                bottomBevelColor = Color(0xFFB91C1C),
                strokeColor = Color(0xFFEF4444),
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(22.dp)
            ) {
                Column(
                    modifier = Modifier.padding(18.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFEF4444).copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Warning,
                            contentDescription = null,
                            tint = Color(0xFFEF4444),
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Text(
                        text = "¿Eliminar Cuenta y Todos tus Datos?",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    Text(
                        text = "Esta acción es permanente e irreversible. Se borrarán tus registros de estudio, tu racha de días, tus simulacros y tu perfil de la nube conforme a las normativas de Google Play.",
                        fontSize = 12.sp,
                        color = colors.textSecondary,
                        lineHeight = 17.sp,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    if (deleteError != null) {
                        Text(
                            text = deleteError.orEmpty(),
                            fontSize = 11.sp,
                            color = Color(0xFFEF4444),
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = { showDeleteConfirmDialog = false },
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(14.dp),
                            enabled = !isDeletingAccount
                        ) {
                            Text("Cancelar", fontWeight = FontWeight.Bold, color = colors.textPrimary)
                        }

                        Sticker3dButton(
                            onClick = {
                                isDeletingAccount = true
                                deleteError = null
                                scope.launch {
                                    val user = FirebaseAuth.getInstance().currentUser
                                    if (user == null) {
                                        UserManager.clearUser()
                                        showDeleteConfirmDialog = false
                                        onAccountDeleted()
                                        onDismiss()
                                    } else {
                                        user.delete().addOnCompleteListener { task ->
                                            isDeletingAccount = false
                                            if (task.isSuccessful) {
                                                UserManager.clearUser()
                                                showDeleteConfirmDialog = false
                                                onAccountDeleted()
                                                onDismiss()
                                            } else {
                                                deleteError = "Para seguridad, debes haber iniciado sesión recientemente antes de eliminar tu cuenta. Inicia sesión de nuevo e inténtalo."
                                            }
                                        }
                                    }
                                }
                            },
                            modifier = Modifier.weight(1.3f).height(44.dp),
                            containerColor = Color(0xFFEF4444),
                            bottomBevelColor = Color(0xFFB91C1C),
                            strokeColor = colors.strokeBorder,
                            enabled = !isDeletingAccount
                        ) {
                            Text(
                                text = if (isDeletingAccount) "Borrando..." else "Eliminar Definitivamente",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                maxLines = 1
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun PrivacyTabContent(colors: RastroPalette) {
    LegalCardSection(
        icon = Icons.Rounded.Lock,
        title = "1. Recopilación Mínima de Datos",
        description = "RASTRO solo recopila los datos estrictamente indispensables para la sincronización pedagógica: tu nombre de usuario, correo electrónico proporcionado por Google Sign-In y tu avatar. No recopilamos número de teléfono, ubicación en tiempo real ni información financiera.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.CloudSync,
        title = "2. Almacenamiento Seguro (Firebase & Google Cloud)",
        description = "Todos tus puntajes, racha de estudio, vidas y respuestas se resguardan en servidores de Google Firebase protegidos por reglas de seguridad de nivel de producción. Tus datos personales están aislados y no son accesibles por otros usuarios sin tu consentimiento.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.Block,
        title = "3. Cero Venta de Información Personal",
        description = "RASTRO NO vende, comercializa ni alquila tus datos a empresas publicitarias o terceros de mercadeo. El propósito de la plataforma es 100% formativo y de preparación para exámenes de admisión.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.PlayCircle,
        title = "4. Videos de YouTube y servicios de terceros",
        description = "Las clases en video se abren directamente en YouTube. Sus datos, cookies e inicio de sesión se rigen por las políticas de Google y YouTube; RASTRO no recibe sus credenciales de YouTube.",
        colors = colors
    )
}

@Composable
private fun TermsUgcTabContent(colors: RastroPalette) {
    LegalCardSection(
        icon = Icons.Rounded.VerifiedUser,
        title = "1. Uso Ético y Académico",
        description = "El usuario se compromete a utilizar la plataforma con fines formativos y de superación preuniversitaria. Queda terminantemente prohibido el uso de lenguaje soez, suplantación de identidad o ataques hacia otros postulantes en el muro y los chats comunitarios.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.Report,
        title = "2. Moderación de Contenido de la Comunidad (UGC)",
        description = "En cumplimiento estricto con las políticas de Contenido Generado por el Usuario de Google Play, RASTRO mantiene una política de TOLERANCIA CERO ante publicaciones con spam, material ofensivo o infracciones a derechos de autor. Cualquier aporte puede ser reportado y será retirado de forma expedita por el equipo moderador.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.School,
        title = "3. Exclusión de Garantía de Ingreso",
        description = "RASTRO es un simulador pedagógico de entrenamiento intensivo. El rendimiento obtenido en los simulacros virtuales es un indicador de progreso, pero el ingreso a la Universidad Nacional de San Agustín (UNSA) depende exclusivamente de la evaluación oficial presencial.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.CloudUpload,
        title = "4. Almacenamiento Descentralizado en Google Drive",
        description = "RASTRO no aloja archivos pesados ni documentos privados en servidores propios. Toda la compartición de materiales, PDFs y bancos de preguntas se gestiona directamente a través del Google Drive personal del propio usuario. RASTRO utiliza el almacenamiento del usuario para salvaguardar la privacidad y descentralizar los recursos.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.Copyright,
        title = "5. Declaración de Propiedad o Permiso de Material Compartido",
        description = "Al compartir cualquier enlace, guía o recurso didáctico en la biblioteca o foros, el usuario declara formalmente que dicho material es de su autoría o que cuenta con la debida autorización de su autor para su difusión académica comunitaria sin fines de lucro. Queda prohibido compartir material con derechos reservados sin autorización.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.Psychology,
        title = "6. Uso y Transparencia de Inteligencia Artificial (IA)",
        description = "RASTRO implementa modelos de Inteligencia Artificial avanzada para potenciar la experiencia de aprendizaje: tutoría interactiva con Orstty, generación adaptativa de mnemotecnias y retroalimentación analítica de errores. La IA actúa como asistente de estudio complementario y sus respuestas deben tomarse como apoyo formativo.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.PlayCircle,
        title = "7. Referencias de YouTube",
        description = "RASTRO organiza enlaces a videos públicos como apoyo académico. No aloja, modifica ni controla esos videos: pertenecen a sus creadores y su disponibilidad depende de YouTube y de cada titular.",
        colors = colors
    )
}

@Composable
private fun AccountDeletionTabContent(
    colors: RastroPalette,
    onRequestDelete: () -> Unit
) {
    LegalCardSection(
        icon = Icons.Rounded.DeleteForever,
        title = "Directriz de Eliminación de Cuenta (Google Play)",
        description = "Google Play exige que todo usuario pueda solicitar el borrado total de su cuenta y registros de datos asociados directamente desde la aplicación. Puedes ejecutar la eliminación inmediata con el botón a continuación.",
        colors = colors
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFEF4444).copy(alpha = 0.08f))
            .border(1.2.dp, Color(0xFFEF4444).copy(alpha = 0.35f), RoundedCornerShape(16.dp))
            .padding(14.dp)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Rounded.WarningAmber,
                    contentDescription = null,
                    tint = Color(0xFFEF4444),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "¿Qué datos se borran?",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFEF4444)
                )
            }
            Text(
                text = "• Identidad de usuario y correo registrado en Firebase.\n• Historial completo de simulacros y estadísticas.\n• Racha de días, gemas, vidas y logros.\n• Aportes compartidos en la biblioteca y comentarios en el muro.",
                fontSize = 11.5.sp,
                color = colors.textPrimary,
                lineHeight = 17.sp
            )

            Spacer(modifier = Modifier.height(4.dp))

            Sticker3dButton(
                onClick = onRequestDelete,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp),
                containerColor = Color(0xFFEF4444),
                bottomBevelColor = Color(0xFFB91C1C),
                strokeColor = colors.strokeBorder
            ) {
                Icon(Icons.Rounded.DeleteForever, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "Eliminar Mi Cuenta y Datos",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )
            }
        }
    }

    Text(
        text = "Si tienes inconvenientes para eliminar tu cuenta en la app, también puedes remitir un correo electrónico a aguilar.jonsu@gmail.com con el asunto 'Solicitud de Eliminación de Datos RASTRO' y procesaremos tu baja en menos de 24 horas.",
        fontSize = 11.sp,
        color = colors.textSecondary,
        lineHeight = 15.sp
    )
}

@Composable
private fun AuthorshipTabContent(colors: RastroPalette) {
    LegalCardSection(
        icon = Icons.Rounded.Code,
        title = "Autoría y Propiedad Intelectual",
        description = "El software, las mnemotecnias exclusivas, el diseño de interfaces táctiles y los algoritmos de simulación son propiedad intelectual del Autor de la aplicación RASTRO. Los ejercicios académicos corresponden a recopilaciones de bancos públicos oficiales con propósitos didácticos.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.Info,
        title = "Deslinde de Responsabilidad Institucional",
        description = "RASTRO es una iniciativa tecnológica independiente de apoyo al postulante. No existe relación contractual ni representación oficial con la Universidad Nacional de San Agustín (UNSA) ni con el CEPREUNSA.",
        colors = colors
    )
}

@Composable
private fun LegalCardSection(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    description: String,
    colors: RastroPalette
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(colors.surface)
            .border(1.2.dp, colors.strokeBorder.copy(alpha = 0.4f), RoundedCornerShape(14.dp))
            .padding(12.dp)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = colors.accent,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = title,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = colors.textPrimary
                )
            }
            Text(
                text = description,
                fontSize = 11.5.sp,
                color = colors.textSecondary,
                lineHeight = 16.5.sp
            )
        }
    }
}
