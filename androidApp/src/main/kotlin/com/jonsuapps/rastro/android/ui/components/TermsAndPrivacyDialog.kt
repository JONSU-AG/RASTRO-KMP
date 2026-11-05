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
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "1. Contacto", description = "RASTRO es una herramienta independiente de preparación preuniversitaria. Contacto: aguilar.jonsu@gmail.com.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "2. Cuenta e información", description = "El estudio como invitado guarda el avance en el dispositivo sin crear un perfil en Firebase. Para las funciones con cuenta tratamos correo, identificador, nombre y datos de autenticación mediante correo o Google. La foto, portada y enlaces de redes son opcionales. Según las funciones utilizadas se tratan progreso, actividad aproximada, solicitudes de amistad, mensajes, contenido publicado y reportes. El nombre, foto, portada y publicaciones pueden ser visibles para otros usuarios.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "3. Respaldo y actividad", description = "El respaldo de estudio en la nube es opcional: puede solicitarse manualmente y, si se habilita el respaldo automático, se intenta al abrir la app cuando han pasado tres días desde el último respaldo correcto. Las funciones sociales, de perfil y de publicación utilizan Firebase independientemente de ese respaldo. Administradores autorizados pueden consultar actividad aproximada para gestionar el servicio. No convertimos registros históricos insuficientes en minutos inventados.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "4. Mis errores", description = "Mis errores empieza pausado en instalaciones nuevas y conserva la preferencia existente. Al habilitarlo, los errores caducan localmente a los quince días; esto no garantiza la eliminación inmediata de todas sus copias remotas. Puedes limpiar tus errores desde la app.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "5. Proveedores y contenido", description = "RASTRO no vende tus datos personales. Utiliza Firebase y servicios de Google para autenticación, almacenamiento, analítica y funciones comunitarias. Los videos utilizan YouTube y están sujetos a las políticas de Google; RASTRO no recibe tu contraseña de YouTube. Drive utiliza permisos limitados a archivos que compartes o gestionas con la app. Los originales de tu Drive personal permanecen bajo tu control.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "6. Publicidad", description = "Google AdMob puede tratar dirección IP, identificadores del dispositivo o publicitarios, interacciones y diagnósticos para entregar y medir publicidad y prevenir fraude. La configuración solicita anuncios no personalizados; esto no elimina toda recopilación. Cuando corresponda se solicitará consentimiento y estarán disponibles opciones para revisarlo. Consulta https://policies.google.com/privacy.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "7. Compras y RevenueCat", description = "RevenueCat trata el identificador de usuario y datos de productos, transacciones y vigencia para validar compras y conceder RASTRO Pro. Los pagos se procesan mediante Google Play: RASTRO no recibe los datos completos de tu tarjeta. Consulta https://www.revenuecat.com/privacy.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "8. Eliminar cuenta", description = "Puedes iniciar la eliminación desde la app, con conexión y autenticación reciente, o solicitarla en https://rumbo-jonsu.web.app/eliminar-cuenta y aguilar.jonsu@gmail.com. El flujo actual limpia perfil, progreso y contenido asociado bajo control de RASTRO antes de eliminar el acceso; si se interrumpe puede requerir reautenticación y reintento. Las imágenes generadas por RASTRO en Drive que el flujo identifica como propias se envían a la papelera. Los originales personales y archivos antiguos no identificados permanecen bajo tu control; solicita ayuda si necesitas su revisión.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "9. Conservación y soporte", description = "Para impedir que escrituras pendientes recrean una cuenta eliminada, se conserva un marcador privado con el identificador de cuenta y fecha de solicitud, sin nombre, correo ni imagen. Las compras, recibos y registros de proveedores pueden conservarse conforme a sus obligaciones y políticas; eliminar RASTRO no cancela una suscripción de Google Play. Para acceso, corrección, conservación o eliminación escribe al contacto indicado. No envíes contraseñas.", colors = colors)
}

@Composable
private fun TermsUgcTabContent(colors: RastroPalette) {
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "1. Uso de RASTRO", description = "RASTRO está orientado a personas de diecisiete años en adelante. Los menores requieren la autorización que corresponda según su legislación. Es una herramienta de apoyo: no garantiza ingreso, notas ni resultados oficiales y no representa a universidades ni a sus centros de preparación.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "2. Comunidad y materiales", description = "Comparte solo material propio, autorizado o con licencia compatible. No se permite acoso, suplantación, spam, contenido sexual prohibido ni vulneración de derechos. Puedes reportar contenido y bloquear usuarios; la administración puede retirar publicaciones o restringir cuentas según la infracción, sin prometer un plazo automático de revisión.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "3. Contenido académico", description = "Parte del material puede prepararse con apoyo de inteligencia artificial y contener errores. Debe contrastarse con fuentes académicas y no constituye una respuesta oficial. Los videos enlazados pertenecen a sus creadores; su disponibilidad depende de YouTube y de sus titulares.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "4. Monedas y anuncios", description = "Las monedas son unidades virtuales: no son dinero ni pueden canjearse por efectivo. Los anuncios recompensados son voluntarios; la recompensa requiere completar el anuncio y recibir la confirmación del proveedor. Su duración y disponibilidad dependen de este. Los anuncios automáticos aparecen en pausas naturales, nunca durante las preguntas.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "5. RASTRO Pro", description = "RASTRO Pro puede obtenerse por concesión gratuita de administración o mediante Google Play. Sus planes mensual, seis meses, anual y permanente comparten beneficios: vidas ilimitadas, doble XP y monedas obtenidas estudiando, ausencia de anuncios automáticos y tres intentos Pro de simulacro. Pro no modifica estrellas, notas ni protege artificialmente la racha. Los anuncios recompensados siguen siendo voluntarios y, después de gastar los intentos disponibles, pueden adquirirse intentos con monedas según las condiciones mostradas en la app.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "6. Compras, cancelación y reembolsos", description = "Google Play muestra el precio localizado, impuestos, duración y condiciones antes de confirmar. Las suscripciones pueden renovarse automáticamente según lo indicado en la compra; permanente es una compra única sin renovación. Administra o cancela suscripciones desde Google Play. Cancelar detiene futuras renovaciones y no equivale a pedir un reembolso. Los reembolsos se gestionan conforme a las políticas de Google Play y la legislación aplicable: https://support.google.com/googleplay/answer/2479637. La revocación retira el acceso de esa compra; una concesión gratuita independiente puede seguir vigente.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "7. Racha y eliminación", description = "La racha se obtiene al completar una lección o acumular quince minutos de uso en primer plano. La recuperación de días anteriores depende de registros suficientes. Las funciones de comunidad y respaldo requieren cuenta. Eliminarla no cancela por sí mismo una suscripción ni elimina originales de tu Drive personal.", colors = colors)
    LegalCardSection(icon = Icons.Rounded.VerifiedUser, title = "8. Contacto", description = "Contacto para soporte, privacidad y reclamaciones: aguilar.jonsu@gmail.com.", colors = colors)
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
                text = "Con conexión y autenticación reciente, RASTRO limpia tu perfil, progreso y contenido asociado antes de eliminar el acceso. Si se interrumpe, vuelve a autenticarte y reintenta. Se conserva un marcador privado con identificador y fecha para impedir recrear la cuenta por escrituras pendientes. Los originales de Drive siguen bajo tu control. Eliminar la cuenta no cancela una suscripción de Google Play. No envíes contraseñas por correo.",
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
