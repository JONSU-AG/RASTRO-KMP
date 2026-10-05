package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException

/** Auth first: a rejected deletion must never erase the profile. Server trigger cleans all owned data. */
object AccountDeletionRepository {
    fun deleteCurrentAccount(onResult: (Result<Unit>) -> Unit) {
        val user = FirebaseAuth.getInstance().currentUser
        if (user == null) { onResult(Result.success(Unit)); return }
        user.delete().addOnCompleteListener { task ->
            if (task.isSuccessful) onResult(Result.success(Unit))
            else {
                val message = if (task.exception is FirebaseAuthRecentLoginRequiredException)
                    "Vuelve a iniciar sesión para confirmar que la cuenta es tuya e inténtalo de nuevo."
                else "No se pudo eliminar la cuenta. Comprueba tu conexión e inténtalo de nuevo."
                onResult(Result.failure(IllegalStateException(message, task.exception)))
            }
        }
    }
}
