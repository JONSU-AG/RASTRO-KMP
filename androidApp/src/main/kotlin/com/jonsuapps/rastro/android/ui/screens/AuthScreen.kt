package com.jonsuapps.rastro.android.ui.screens
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.theme.readableText
import androidx.compose.ui.graphics.lerp

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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.activity.compose.BackHandler
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import androidx.credentials.CustomCredential
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import kotlinx.coroutines.launch
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.withTimeout
import com.jonsuapps.rastro.android.util.awaitResult
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
    val errorSurface = lerp(theme.surface, Color(0xFFEF4444), .12f)
    val errorInk = readableText(Color(0xFFEF4444), errorSurface)
    val successSurface = lerp(theme.surface, theme.accent, .12f)
    val successInk = readableText(theme.accent, successSurface)
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var selectedAuthTab by remember { mutableIntStateOf(0) } // 0: Iniciar Sesión, 1: Registrarse
    val tabs = listOf("Iniciar Sesión", "Crear Cuenta")
    var legalTab by remember { mutableStateOf<Int?>(null) }

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }

    var isLoading by remember { mutableStateOf(false) }
    var googleLoading by remember { mutableStateOf(false) }
    var showEmailForm by rememberSaveable { mutableStateOf(false) }
    var passwordFocused by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var successMessage by remember { mutableStateOf<String?>(null) }
    BackHandler(enabled = showEmailForm && !isLoading) {
        showEmailForm = false
        passwordFocused = false
        password = ""
        errorMessage = null
        successMessage = null
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background)
            .wrapContentWidth(Alignment.CenterHorizontally)
            .widthIn(max = 460.dp)
            .imePadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        androidx.compose.foundation.Image(
            androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.rastro_navbar),
            contentDescription = "RASTRO", modifier = Modifier.width(160.dp).height(52.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.Fit)

        Spacer(modifier = Modifier.height(16.dp))
        com.jonsuapps.rastro.android.ui.components.WelcomeHero(
            passwordFocused = showEmailForm && passwordFocused && !isPasswordVisible)
        Spacer(modifier = Modifier.height(24.dp))

        // Google Sign-In real mediante Credential Manager y Firebase Auth.
        com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
            onClick = {
                if (isLoading) return@Sticker3dButton
                isLoading = true
                googleLoading = true
                errorMessage = null
                successMessage = null
                scope.launch {
                    try {
                        val googleOption = GetSignInWithGoogleOption.Builder(context.getString(com.jonsuapps.rastro.R.string.default_web_client_id))
                            .build()
                        val request = GetCredentialRequest.Builder()
                            .addCredentialOption(googleOption)
                            .build()
                        val credential = CredentialManager.create(context)
                            .getCredential(context, request).credential
                        if (credential !is CustomCredential || credential.type !in setOf(GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL, GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL)) {
                            errorMessage = "No se pudo obtener la cuenta de Google. Inténtalo de nuevo."
                            isLoading = false
                            return@launch
                        }
                        val googleToken = GoogleIdTokenCredential.createFrom(credential.data)
                        val firebaseCredential = GoogleAuthProvider.getCredential(googleToken.idToken, null)
                        val result = withTimeout(30_000) {
                            FirebaseAuth.getInstance().signInWithCredential(firebaseCredential).awaitResult()
                        }
                        result.user?.let { user ->
                            val profilePhoto = user.photoUrl?.toString()
                                ?: user.providerData.firstOrNull { it.providerId == "google.com" }?.photoUrl?.toString()
                            UserManager.updateUserFromFirebase(user.uid, user.displayName, user.email, profilePhoto)
                        }
                        onAuthSuccess()
                    } catch (e: TimeoutCancellationException) {
                        errorMessage = "La conexión tardó demasiado. Comprueba tu red e inténtalo de nuevo."
                    } catch (e: CancellationException) {
                        throw e
                    } catch (e: Exception) {
                        errorMessage = e.localizedMessage ?: "No se pudo iniciar sesión con Google."
                    } finally {
                        isLoading = false
                        googleLoading = false
                    }
                }
            },
            enabled = !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RastroShapes.Pill,
            containerColor = theme.surfaceAccent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder
        ) {
            androidx.compose.foundation.Image(
                androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.ic_google_signin),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = if (googleLoading) "Abriendo Google…" else "Continuar con Google",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold,
                color = theme.textPrimary
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        com.jonsuapps.rastro.android.ui.components.Sticker3dButton(onClick = {
            if (isLoading) return@Sticker3dButton
            FirebaseAuth.getInstance().signOut()
            UserManager.logout()
            onContinueAsGuest()
        }, enabled = !isLoading, modifier = Modifier.fillMaxWidth().heightIn(min = 52.dp),
            containerColor = theme.accent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
            Icon(Icons.Rounded.PersonOutline, null, tint = theme.onAccent)
            Spacer(Modifier.width(8.dp))
            Text("Entrar como invitado", color = theme.onAccent, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.height(8.dp))
        TextButton(onClick = {
            showEmailForm = !showEmailForm
            passwordFocused = false
            password = ""
            errorMessage = null
            successMessage = null
        }, enabled = !isLoading) {
            Text(if (showEmailForm) "Volver a las opciones de acceso" else "Usar correo y contraseña",
                color = theme.accentText, fontWeight = FontWeight.Bold)
        }
        // Failures from Google remain visible on the welcome page too.
        if (!showEmailForm && errorMessage != null) {
            Text(errorMessage.orEmpty(), color = errorInk, modifier = Modifier.padding(vertical = 8.dp))
        }
        if (showEmailForm) {
        Spacer(Modifier.height(12.dp))
        // Pestañas Iniciar Sesión / Registro
        TabRow(
            selectedTabIndex = selectedAuthTab,
            containerColor = theme.surface,
            contentColor = theme.accentText,
            indicator = { tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedAuthTab]),
                    color = theme.accentText
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
                color = errorSurface,
                border = androidx.compose.foundation.BorderStroke(1.dp, errorInk.copy(alpha = 0.3f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Rounded.ErrorOutline,
                        contentDescription = null,
                        tint = errorInk,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = errorMessage ?: "",
                        color = errorInk,
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
                color = successSurface,
                border = androidx.compose.foundation.BorderStroke(1.dp, successInk.copy(alpha = 0.3f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Rounded.CheckCircle,
                        contentDescription = null,
                        tint = successInk,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = successMessage ?: "",
                        color = successInk,
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
                focusedBorderColor = theme.accentText,
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
                        contentDescription = if (isPasswordVisible) "Ocultar contraseña" else "Mostrar contraseña",
                        tint = theme.textSecondary
                    )
                }
            },
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth().onFocusChanged { passwordFocused = it.isFocused },
            singleLine = true,
            shape = RastroShapes.Squircle,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = theme.accentText,
                unfocusedBorderColor = theme.borderSubtle
            )
        )

        Spacer(modifier = Modifier.height(14.dp))

        AuthLegalNotice { legalTab = it }
        Spacer(Modifier.height(12.dp))

        // Botón Principal (Firebase Auth)
        Button(
            onClick = {
                if (isLoading) return@Button
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

                scope.launch {
                  try {
                    val auth = FirebaseAuth.getInstance()
                    val result = withTimeout(30_000) {
                        val task = if (selectedAuthTab == 0) auth.signInWithEmailAndPassword(email.trim(), password)
                            else auth.createUserWithEmailAndPassword(email.trim(), password)
                        task.awaitResult()
                    }
                    val user = result.user ?: error("No se pudo recuperar la cuenta.")
                    UserManager.updateUserFromFirebase(user.uid, user.displayName, user.email, user.photoUrl?.toString())
                    onAuthSuccess()
                  } catch (_: TimeoutCancellationException) {
                    errorMessage = "La conexión tardó demasiado. Comprueba tu red e inténtalo de nuevo."
                  } catch (cancelled: CancellationException) { throw cancelled
                  } catch (error: Exception) {
                    errorMessage = when ((error as? com.google.firebase.auth.FirebaseAuthException)?.errorCode) {
                        "ERROR_EMAIL_ALREADY_IN_USE" -> "Este correo ya está registrado. Prueba iniciando sesión."
                        "ERROR_INVALID_CREDENTIAL", "ERROR_WRONG_PASSWORD", "ERROR_USER_NOT_FOUND" -> "Revisa tu correo y contraseña."
                        else -> "No se pudo completar el acceso. Comprueba tus datos y conexión e inténtalo de nuevo."
                    }
                  } finally { isLoading = false }
                }
            },
            enabled = !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = theme.surfaceAccent, contentColor = theme.textPrimary),
            shape = RastroShapes.Pill
        ) {
            if (isLoading && !googleLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(22.dp),
                    color = theme.textPrimary,
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
                        scope.launch {
                            try {
                                withTimeout(30_000) { FirebaseAuth.getInstance().sendPasswordResetEmail(email.trim()).awaitResult() }
                                successMessage = "Si existe una cuenta con ese correo, recibirás un enlace para recuperar tu contraseña."
                            } catch (cancelled: CancellationException) {
                                if (cancelled is TimeoutCancellationException) errorMessage = "La conexión tardó demasiado. Inténtalo de nuevo."
                                else throw cancelled
                            } catch (_: Exception) { errorMessage = "No se pudo solicitar la recuperación. Comprueba el correo y tu conexión."
                            } finally { isLoading = false }
                        }
                    }
                },
                enabled = !isLoading,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("¿Olvidaste tu contraseña?", color = theme.accentText)
            }
        }

        } // Existing email/password form; callbacks and validation retained.

        if (!showEmailForm) {
            Spacer(Modifier.height(12.dp))
            AuthLegalNotice { legalTab = it }
        }

        Spacer(modifier = Modifier.height(20.dp))


    }

    legalTab?.let { tab ->
        TermsAndPrivacyDialog(
            colors = theme,
            initialTab = tab,
            onDismiss = { legalTab = null }
        )
    }
}
