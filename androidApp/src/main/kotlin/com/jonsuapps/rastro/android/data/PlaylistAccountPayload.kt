package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.data.CoursePlaylist

/** One account-owned document doubles as a private list and an optional public projection. */
internal fun playlistAccountPayload(uid: String, pl: CoursePlaylist, custom: Boolean,
    videos: List<CustomVideoItem>): Map<String, Any> = mapOf(
    "ownerUid" to uid, "localId" to pl.id, "isShared" to false,
    "isCurated" to false, "isHidden" to false, "isDeleted" to false,
    "title" to pl.title, "channelTitle" to pl.channelTitle, "subject" to pl.subject,
    "playlistId" to pl.playlistId, "videoCount" to pl.videoCount,
    "description" to pl.description, "isCustomList" to custom,
    // API/iframe queue caches are not a user-created collection. Do not upload them.
    "videos" to (if (custom) videos else emptyList()).map {
        mapOf("id" to it.id, "title" to it.title, "urlOrId" to it.urlOrId)
    })

internal fun playlistEditFields(payload: Map<String, Any>): List<String> = payload.keys.filter { it != "isShared" }
