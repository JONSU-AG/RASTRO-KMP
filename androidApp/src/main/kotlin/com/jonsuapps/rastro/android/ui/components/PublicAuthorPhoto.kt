package com.jonsuapps.rastro.android.ui.components

import androidx.compose.runtime.*
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.android.data.PublicProfileCache

@Composable
fun publicAuthorPhoto(uid: String, fallback: String?): String? {
    val user by UserManager.currentUser.collectAsState()
    val authors by PublicProfileCache.authors.collectAsState()
    LaunchedEffect(uid, user.isAuthenticated) {
        if (user.isAuthenticated && !user.isAnonymous) PublicProfileCache.request(uid)
    }
    return if (uid == user.uid) user.photoURL else if (authors.containsKey(uid)) authors[uid]?.photo else fallback
}
