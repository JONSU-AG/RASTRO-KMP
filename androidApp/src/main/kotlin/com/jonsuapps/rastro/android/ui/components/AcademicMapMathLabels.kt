package com.jonsuapps.rastro.android.ui.components

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.security.MessageDigest

internal fun academicMapMathAsset(label:String):String? {
    if('\\' !in label && '$' !in label && '_' !in label && '^' !in label)return null
    val hash=MessageDigest.getInstance("SHA-256").digest(label.toByteArray()).joinToString("") {
        val value=it.toInt() and 255
        "0123456789abcdef"[value ushr 4].toString()+"0123456789abcdef"[value and 15]
    }
    return "scientific-math/map-labels/$hash.png"
}
/** Small shared LRU, not a bitmap for the entire course or a second scientific catalog. */
internal object AcademicMapMathLabels {
    private val cache=object:LinkedHashMap<String,Bitmap?>(24,.75f,true) {
        override fun removeEldestEntry(eldest:MutableMap.MutableEntry<String,Bitmap?>?)=size>24
    }
    @Synchronized fun load(context:Context,label:String):Bitmap? {
        val path=academicMapMathAsset(label)?:return null
        if(cache.containsKey(path))return cache[path]
        val image=try {context.assets.open(path).use {BitmapFactory.decodeStream(it)}}catch(_:java.io.IOException){null}
        cache[path]=image
        return image
    }
}
