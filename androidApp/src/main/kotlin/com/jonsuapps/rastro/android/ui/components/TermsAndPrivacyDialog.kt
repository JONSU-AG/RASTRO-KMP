package com.jonsuapps.rastro.android.ui.components
import com.jonsuapps.rastro.android.util.openExternalIntent

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
                                text = "Propuesta legal · 8 de octubre de 2026",
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
                            context.openExternalIntent(intent)
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
                        text = "¿Eliminar tu cuenta y datos de RASTRO?",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    Text(
                        text = "Se eliminarán tu perfil, progreso y contenido publicado en RASTRO antes de borrar el acceso. Esta acción no se puede deshacer. Los archivos de tu Drive personal permanecen bajo tu control. Eliminar la cuenta no cancela una suscripción de Google Play.",
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
                                if (isDeletingAccount) return@Sticker3dButton
                                isDeletingAccount = true
                                deleteError = null
                                com.jonsuapps.rastro.android.data.AccountDeletionRepository.deleteCurrentAccount(context) { result ->
                                    isDeletingAccount = false
                                    result.onSuccess {
                                        UserManager.clearUser()
                                        showDeleteConfirmDialog = false
                                        onAccountDeleted()
                                        onDismiss()
                                    }.onFailure { deleteError = it.localizedMessage }
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
        description = "Para las funciones con cuenta, RASTRO trata correo, identificador, nombre y datos de inicio de sesión mediante correo o Google. La foto, portada y enlaces de redes son opcionales. Puede registrar progreso, actividad aproximada, contenido compartido y reportes según las funciones utilizadas. El estudio como invitado guarda el avance localmente sin crear un perfil en Firebase.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.CloudSync,
        title = "2. Almacenamiento Seguro (Firebase & Google Cloud)",
        description = "El estudio se guarda en el dispositivo. Con una cuenta puedes respaldar y recuperar progreso y errores; el respaldo automático es opcional y se intenta al abrir la app cuando han pasado tres días desde el último respaldo correcto. Las funciones sociales, perfiles y operaciones de publicación utilizan Firebase independientemente de ese respaldo. Tu nombre, foto, portada y contenido publicado pueden ser visibles para otros usuarios.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.Block,
        title = "3. Cero Venta de Información Personal",
        description = "RASTRO no vende tus datos personales. Firebase y servicios de Google tratan la información necesaria para sus funciones. Firebase Analytics y AdMob pueden tratar datos técnicos, de interacción e identificadores según su configuración y los consentimientos aplicables. La actividad aproximada de las cuentas puede consultarse por administradores autorizados; el historial sin duración suficiente no se convierte en minutos inventados.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.PlayCircle,
        title = "4. Videos de YouTube y servicios de terceros",
        description = "Los videos pueden reproducirse mediante el reproductor de YouTube o abrirse en su aplicación o navegador. Sus datos, cookies e inicio de sesión se rigen por las políticas de Google y YouTube. RASTRO no recibe tu contraseña de YouTube. Las imágenes de perfil pueden almacenarse en Firebase Storage; las funciones de Drive utilizan los permisos y archivos de tu cuenta cuando corresponda.",
        colors = colors
    )
    LegalCardSection(icon = Icons.Rounded.CloudSync, title = "5. Errores, portadas y conservación", description = "Mis errores comienza pausado para instalaciones nuevas y conserva tu preferencia existente. Al habilitarlo, los errores caducan en la copia local a los quince días; esto no equivale a una eliminación inmediata de cualquier copia remota. La portada y su encuadre se guardan al confirmar cambios; usarla en Inicio es opcional. Para consultas de conservación o eliminación, escribe a aguilar.jonsu@gmail.com.", colors = colors)

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
        description = "No se permite acoso, suplantación, spam, contenido sexual prohibido ni infracciones de derechos de terceros. Usa las opciones de reportar y bloquear disponibles. Los administradores revisan reportes y pueden retirar contenido o restringir cuentas según la infracción; no se promete un plazo automático de revisión.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.School,
        title = "3. Exclusión de Garantía de Ingreso",
        description = "RASTRO es una herramienta independiente de apoyo preuniversitario. No garantiza ingreso, notas ni resultados oficiales. Los ejercicios y simulacros no sustituyen las evaluaciones ni instrucciones de cada universidad.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.CloudUpload,
        title = "4. Almacenamiento Descentralizado en Google Drive",
        description = "RASTRO utiliza almacenamiento local, Firebase y enlaces o archivos de Google Drive según la función. Los archivos en tu Drive personal permanecen bajo tu control y pueden seguir existiendo después de eliminar una cuenta de RASTRO. Comparte únicamente materiales propios, autorizados o con licencia compatible.",
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
        description = "Parte del material puede prepararse con apoyo de inteligencia artificial. Puede contener errores y debe contrastarse con fuentes académicas; no constituye una respuesta oficial. Esto no implica que exista un tutor de IA activo ni generación de respuestas en tiempo real en todas las funciones.",
        colors = colors
    )

    LegalCardSection(
        icon = Icons.Rounded.PlayCircle,
        title = "7. Referencias de YouTube",
        description = "RASTRO organiza enlaces a videos públicos como apoyo académico. No aloja, modifica ni controla esos videos: pertenecen a sus creadores y su disponibilidad depende de YouTube y de cada titular.",
        colors = colors
    )
    LegalCardSection(icon = Icons.Rounded.Paid, title = "8. Monedas, publicidad y RASTRO Pro", description = "Las monedas no son dinero ni se canjean por efectivo. Los anuncios recompensados son voluntarios; su duración y disponibilidad dependen del proveedor y la recompensa exige completarlos. Los anuncios automáticos se reservan a pausas naturales, nunca durante preguntas. Pro puede otorgarse por administración; las compras no están habilitadas actualmente. Cuando se habiliten, Google Play mostrará el precio y condiciones reales antes de confirmar. Pro ofrece vidas ilimitadas, XP y monedas de estudio multiplicados por dos, ausencia de anuncios automáticos y tres intentos Pro de simulacro; no modifica estrellas, notas, ranking académico ni protege la racha. Los anuncios recompensados siguen siendo voluntarios para Pro.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.School, title = "9. Rachas y acceso", description = "El día de racha se obtiene al completar una lección o acumular quince minutos de uso en primer plano. La migración conserva días anteriores cuando existen registros suficientes, sin inventarlos. Las funciones de comunidad y respaldo requieren una cuenta. RASTRO está orientado a personas de diecisiete años en adelante; los menores requieren la autorización que corresponda según su legislación.", colors = colors)

}

@Composable
private fun AccountDeletionTabContent(
    colors: RastroPalette,
    onRequestDelete: () -> Unit
) {
    LegalCardSection(
        icon = Icons.Rounded.DeleteForever,
        title = "Directriz de Eliminación de Cuenta (Google Play)",
        description = "Puedes eliminar el acceso de tu cuenta desde esta sección; puede requerirse volver a iniciar sesión. También puedes solicitar la eliminación de los datos asociados en https://rumbo-jonsu.web.app/eliminar-cuenta o escribiendo a aguilar.jonsu@gmail.com. La eliminación de acceso no acredita por sí sola que todos los datos asociados hayan sido depurados.",
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
                    text = "Cuenta y datos asociados",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFEF4444)
                )
            }
            Text(
                text = "El acceso se elimina mediante Firebase Authentication. La solicitud de limpieza abarca el perfil, progreso y datos personales asociados bajo control de RASTRO. No envíes contraseñas por correo. Los archivos en tu Drive se administran desde Google.",
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
                    text = "Eliminar mi cuenta",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )
            }
        }
    }

    Text(
        text = "Si tienes inconvenientes para eliminar tu cuenta en la app, también puedes remitir un correo electrónico a aguilar.jonsu@gmail.com con el asunto 'Solicitud de Eliminación de Datos RASTRO' para solicitar la limpieza de los datos asociados. No se establece un plazo automático sin comprobar la tramitación.",
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
        description = "El software y el diseño de RASTRO son una creación independiente. El material académico puede incluir contenido propio y referencias de terceros, con sus derechos correspondientes. Solo se considera oficial un material cuya procedencia esté identificada y comprobada; no todos los ejercicios pertenecen a bancos oficiales.",
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
