package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import androidx.credentials.CustomCredential
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import kotlinx.coroutines.launch
import com.jonsuapps.rastro.android.ui.components.TermsAndPrivacyDialog
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun AuthScreen(
    onAuthSuccess: () -> Unit,
    onContinueAsGuest: () -> Unit,
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var selectedAuthTab by remember { mutableIntStateOf(0) } // 0: Iniciar Sesión, 1: Registrarse
    val tabs = listOf("Iniciar Sesión", "Crear Cuenta")
    var showTermsDialog by remember { mutableStateOf(false) }

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }

    var isLoading by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var successMessage by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logotipo / Símbolo Académico
        Box(
            modifier = Modifier
                .size(68.dp)
                .clip(RastroShapes.Pill)
                .background(Color(0xFFF97316)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.School,
                contentDescription = "RASTRO",
                tint = Color.White,
                modifier = Modifier.size(38.dp)
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "RASTRO",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Black,
            color = theme.textPrimary
        )

        Text(
            text = "Preparación Universitaria Integral • UNSA",
            style = MaterialTheme.typography.bodySmall,
            color = theme.textSecondary
        )

        Spacer(modifier = Modifier.height(28.dp))

        // Pestañas Iniciar Sesión / Registro
        TabRow(
            selectedTabIndex = selectedAuthTab,
            containerColor = theme.surface,
            contentColor = Color(0xFFF97316),
            indicator = { tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedAuthTab]),
                    color = Color(0xFFF97316)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RastroShapes.Squircle)
                .border(1.dp, theme.borderSubtle, RastroShapes.Squircle)
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedAuthTab == index,
                    onClick = {
                        selectedAuthTab = index
                        errorMessage = null
                        successMessage = null
                    },
                    text = {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = if (selectedAuthTab == index) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Alerta de Error
        if (errorMessage != null) {
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = Color(0xFFEF4444).copy(alpha = 0.12f),
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFEF4444).copy(alpha = 0.3f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Rounded.ErrorOutline,
                        contentDescription = null,
                        tint = Color(0xFFEF4444),
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = errorMessage ?: "",
                        color = Color(0xFFEF4444),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Spacer(modifier = Modifier.height(14.dp))
        }

        // Alerta de Éxito
        if (successMessage != null) {
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = Color(0xFF10B981).copy(alpha = 0.12f),
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF10B981).copy(alpha = 0.3f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Rounded.CheckCircle,
                        contentDescription = null,
                        tint = Color(0xFF10B981),
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = successMessage ?: "",
                        color = Color(0xFF10B981),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Spacer(modifier = Modifier.height(14.dp))
        }

        // Campos de Formulario
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
                errorMessage = null
            },
            label = { Text("Correo Electrónico") },
            leadingIcon = {
                Icon(imageVector = Icons.Rounded.Email, contentDescription = null, tint = theme.textSecondary)
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = RastroShapes.Squircle,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFF97316),
                unfocusedBorderColor = theme.borderSubtle
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
                errorMessage = null
            },
            label = { Text("Contraseña") },
            leadingIcon = {
                Icon(imageVector = Icons.Rounded.Lock, contentDescription = null, tint = theme.textSecondary)
            },
            trailingIcon = {
                IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                    Icon(
                        imageVector = if (isPasswordVisible) Icons.Rounded.VisibilityOff else Icons.Rounded.Visibility,
                        contentDescription = null,
                        tint = theme.textSecondary
                    )
                }
            },
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = RastroShapes.Squircle,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFF97316),
                unfocusedBorderColor = theme.borderSubtle
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Botón Principal (Firebase Auth)
        Button(
            onClick = {
                if (email.isBlank() || !email.contains("@")) {
                    errorMessage = "Por favor ingresa un correo electrónico válido."
                    return@Button
                }
                if (password.length < 6) {
                    errorMessage = "La contraseña debe tener al menos 6 caracteres."
                    return@Button
                }

                isLoading = true
                errorMessage = null

                try {
                    val auth = FirebaseAuth.getInstance()
                    if (selectedAuthTab == 0) {
                        // Iniciar Sesión con Firebase
                        auth.signInWithEmailAndPassword(email.trim(), password.trim())
                            .addOnCompleteListener { task ->
                                isLoading = false
                                if (task.isSuccessful) {
                                    val user = auth.currentUser
                                    UserManager.updateUserFromFirebase(
                                        uid = user?.uid ?: "local_${System.currentTimeMillis()}",
                                        displayName = user?.displayName,
                                        email = user?.email ?: email.trim(),
                                        photoUrl = user?.photoUrl?.toString()
                                    )
                                    onAuthSuccess()
                                } else {
                                    val exceptionMessage = task.exception?.localizedMessage ?: "Credenciales incorrectas"
                                    errorMessage = if (exceptionMessage.contains("password", ignoreCase = true) || exceptionMessage.contains("credential", ignoreCase = true)) {
                                        "Contraseña incorrecta o usuario no registrado."
                                    } else {
                                        exceptionMessage
                                    }
                                }
                            }
                    } else {
                        // Registrarse con Firebase
                        auth.createUserWithEmailAndPassword(email.trim(), password.trim())
                            .addOnCompleteListener { task ->
                                isLoading = false
                                if (task.isSuccessful) {
                                    val user = auth.currentUser
                                    UserManager.updateUserFromFirebase(
                                        uid = user?.uid ?: "local_${System.currentTimeMillis()}",
                                        displayName = user?.displayName,
                                        email = user?.email ?: email.trim(),
                                        photoUrl = user?.photoUrl?.toString()
                                    )
                                    successMessage = "¡Cuenta creada exitosamente!"
                                    onAuthSuccess()
                                } else {
                                    val exceptionMessage = task.exception?.localizedMessage ?: "Error al registrar"
                                    errorMessage = if (exceptionMessage.contains("email-already-in-use", ignoreCase = true)) {
                                        "Este correo ya está registrado. Prueba iniciando sesión."
                                    } else {
                                        exceptionMessage
                                    }
                                }
                            }
                    }
                } catch (e: Exception) {
                    isLoading = false
                    errorMessage = e.localizedMessage ?: "No se pudo conectar con Firebase. Inténtalo de nuevo."
                }
            },
            enabled = !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF97316)),
            shape = RastroShapes.Pill
        ) {
            if (isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(22.dp),
                    color = Color.White,
                    strokeWidth = 2.dp
                )
            } else {
                Text(
                    text = if (selectedAuthTab == 0) "Iniciar Sesión" else "Crear Cuenta",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        if (selectedAuthTab == 0) {
            TextButton(
                onClick = {
                    if (email.isBlank() || !email.contains("@")) {
                        errorMessage = "Escribe tu correo para enviarte el enlace de recuperación."
                    } else {
                        isLoading = true
                        FirebaseAuth.getInstance().sendPasswordResetEmail(email.trim())
                            .addOnCompleteListener { task ->
                                isLoading = false
                                if (task.isSuccessful) {
                                    successMessage = "Enviamos el enlace de recuperación a ${email.trim()}."
                                } else {
                                    errorMessage = task.exception?.localizedMessage ?: "No se pudo enviar el enlace."
                                }
                            }
                    }
                },
                enabled = !isLoading,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("¿Olvidaste tu contraseña?", color = Color(0xFFF97316))
            }
        }

        // Google Sign-In real mediante Credential Manager y Firebase Auth.
        OutlinedButton(
            onClick = {
                isLoading = true
                scope.launch {
                    try {
                        val googleOption = GetGoogleIdOption.Builder()
                            .setFilterByAuthorizedAccounts(false)
                            .setAutoSelectEnabled(false)
                            .setServerClientId(context.getString(com.jonsuapps.rastro.R.string.default_web_client_id))
                            .build()
                        val request = GetCredentialRequest.Builder()
                            .addCredentialOption(googleOption)
                            .build()
                        val credential = CredentialManager.create(context)
                            .getCredential(context, request).credential
                        if (credential !is CustomCredential || credential.type != GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL) {
                            errorMessage = "No se pudo obtener la cuenta de Google. Inténtalo de nuevo."
                            isLoading = false
                            return@launch
                        }
                        val googleToken = GoogleIdTokenCredential.createFrom(credential.data)
                        val firebaseCredential = GoogleAuthProvider.getCredential(googleToken.idToken, null)
                        FirebaseAuth.getInstance().signInWithCredential(firebaseCredential)
                            .addOnCompleteListener { task ->
                                isLoading = false
                                if (task.isSuccessful) {
                                    FirebaseAuth.getInstance().currentUser?.let { user ->
                                        val profilePhoto = user.photoUrl?.toString()
                                            ?: user.providerData.firstOrNull { it.providerId == "google.com" }?.photoUrl?.toString()
                                        UserManager.updateUserFromFirebase(user.uid, user.displayName, user.email, profilePhoto)
                                    }
                                    onAuthSuccess()
                                } else {
                                    errorMessage = task.exception?.localizedMessage ?: "No se pudo iniciar sesión con Google."
                                }
                            }
                    } catch (e: Exception) {
                        isLoading = false
                        errorMessage = e.localizedMessage ?: "No se pudo iniciar sesión con Google."
                    }
                }
            },
            enabled = !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RastroShapes.Pill,
            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
        ) {
            Icon(
                Icons.Rounded.AccountCircle,
                contentDescription = null,
                tint = Color(0xFF4285F4),
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Continuar con Google",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold,
                color = theme.textPrimary
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Modo Invitado con sesión anónima de Firebase.
        TextButton(onClick = {
            isLoading = true
            FirebaseAuth.getInstance().signInAnonymously().addOnCompleteListener { task ->
                isLoading = false
                if (task.isSuccessful) {
                    FirebaseAuth.getInstance().currentUser?.let { user ->
                        UserManager.updateUserFromFirebase(user.uid, "Estudiante Invitado", null, null, user.isAnonymous)
                    }
                    onContinueAsGuest()
                } else {
                    errorMessage = task.exception?.localizedMessage ?: "No se pudo iniciar el modo invitado."
                }
            }
        }, enabled = !isLoading) {
            Text(
                text = "Explorar como Invitado",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFF97316)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Términos y privacidad interactivos (Cumplimiento de Google Play Store)
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .clickable {
                    DuolingoHaptics.playOptionSelected(context)
                    showTermsDialog = true
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Policy,
                contentDescription = null,
                tint = Color(0xFFF97316),
                modifier = Modifier.size(15.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "Ver Políticas de Privacidad y Términos de Servicio",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFFF97316),
                fontWeight = FontWeight.Bold,
                fontSize = 11.5.sp,
                textDecoration = androidx.compose.ui.text.style.TextDecoration.Underline
            )
        }
    }

    if (showTermsDialog) {
        TermsAndPrivacyDialog(
            colors = theme,
            initialTab = 0,
            onDismiss = { showTermsDialog = false }
        )
    }
}
