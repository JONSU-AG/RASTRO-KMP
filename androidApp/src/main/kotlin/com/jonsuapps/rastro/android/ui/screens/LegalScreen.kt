package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Gavel
import androidx.compose.material.icons.rounded.Policy
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun LegalScreen(
    title: String,
    colors: RastroPalette = ThemeManager.currentTheme,
    modifier: Modifier = Modifier
) {
    val theme = colors

    val contentText = when {
        title.contains("Políticas", ignoreCase = true) -> """
            1. Objeto y Alcance:
            RASTRO es una aplicación orientada a la preparación integral preuniversitaria de estudiantes para exámenes de admisión, con especial énfasis en la Universidad Nacional de San Agustín (UNSA), CEPREUNSA y el sistema universitario peruano.

            2. Propiedad Intelectual:
            El temario pedagógico, mnemotecnias, diseño de interfaz y desarrollos de software son propiedad de RASTRO y del Autor de la aplicación. Los ejercicios académicos corresponden a recopilaciones de bancos públicos oficiales con fines estrictamente educativos.

            3. Costo y Gratuidad:
            RASTRO se ofrece con acceso libre a sus herramientas medulares, simuladores y banco de preguntas, priorizando el impacto social en la juventud preuniversitaria.

            4. Recursos de YouTube:
            Los videos enlazados son contenido público alojado por YouTube y pertenecen a sus respectivos creadores. RASTRO solo organiza enlaces como referencias académicas; no aloja, modifica ni controla dichos videos. Su disponibilidad está sujeta a YouTube y a las decisiones de cada creador.
        """.trimIndent()

        title.contains("Privacidad", ignoreCase = true) -> """
            1. Datos Recopilados:
            Recopilamos únicamente información básica de perfil (nombre, correo electrónico proporcionado a través de Google Sign-In) para sincronizar tu progreso de estudio, racha, vidas y puntajes de simulacro.

            2. Seguridad y Almacenamiento:
            Toda la autenticación y datos de usuario se gestionan mediante Firebase Authentication y Cloud Firestore con reglas de seguridad estrictas que impiden el acceso de terceros no autorizados a tus datos privados.

            3. Mensajería Directa:
            Las conversaciones en la sección de Chats son privadas entre los participantes y están sujetas a normas de respeto y convivencia académica.

            4. Videos y servicios de terceros:
            Al abrir una clase de YouTube, el contenido se carga directamente en YouTube o en su aplicación. El tratamiento de datos, cookies o inicio de sesión que realice YouTube se rige por las políticas de Google y YouTube; RASTRO no recibe las credenciales de YouTube del usuario.
        """.trimIndent()

        title.contains("Términos", ignoreCase = true) -> """
            1. Uso Aceptable:
            El usuario se compromete a hacer un uso exclusivamente formativo y personal de la aplicación, absteniéndose de conductas hostiles, spam o suplantación en los foros y chats comunitarios.

            2. Exclusión de Garantías de Ingreso:
            RASTRO es una herramienta de entrenamiento y simulación académica. El puntaje obtenido en los simulacros no garantiza vacante en la universidad, la cual depende del examen oficial presencial administrado por las autoridades universitarias.

            3. Recursos externos:
            Los enlaces de YouTube se ofrecen como referencias educativas a contenido público. Los derechos, disponibilidad y normas de uso de cada video corresponden a su creador y a YouTube.
        """.trimIndent()

        title.contains("Eliminar", ignoreCase = true) -> """
            1. Derecho de Supresión:
            De acuerdo con las políticas de Google Play y la legislación de protección de datos personales, cualquier usuario puede solicitar la eliminación completa e irreversible de su cuenta y datos asociados.

            2. Procedimiento:
            Puedes iniciar la eliminación desde tu perfil en la sección de Configuración o enviando un correo con el asunto "Eliminación de Cuenta RASTRO" al contacto del autor. Se borrarán tus datos de perfil, historial de simulacros, racha y mensajes privados.
        """.trimIndent()

        else -> "Información legal y términos regulatorios de RASTRO Preuniversitaria."
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
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 120.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(RastroShapes.Pill)
                            .background(theme.accent.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Policy,
                            contentDescription = null,
                            tint = theme.accent,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Column {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Marco Regulatorio y Transparencia RASTRO",
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.textSecondary
                        )
                    }
                }
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = contentText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = theme.textPrimary,
                        lineHeight = 22.sp
                    )
                }
            }
        }
    }
}
}
