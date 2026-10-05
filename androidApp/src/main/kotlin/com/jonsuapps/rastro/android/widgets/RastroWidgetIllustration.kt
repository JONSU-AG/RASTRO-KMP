package com.jonsuapps.rastro.android.widgets

import android.content.Context
import android.graphics.*
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import com.jonsuapps.rastro.R

/** Draw only live data/panels over the user's unmodified artwork. One coordinate system scales together. */
object RastroWidgetIllustration {
    private val ink = Color.rgb(22, 19, 48)
    private val purple = Color.rgb(111, 38, 218)
    fun background(kind: RastroWidgetKind) = when (kind) {
        RastroWidgetKind.COUNTDOWN -> R.drawable.widget_bg_contador
        RastroWidgetKind.DAILY -> R.drawable.widget_bg_racha_diaria
        RastroWidgetKind.WEEKLY -> R.drawable.widget_bg_racha_semanal
        RastroWidgetKind.QUOTE -> R.drawable.widget_bg_frase
    }
    fun aspect(context: Context, kind: RastroWidgetKind): Float {
        val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
        BitmapFactory.decodeResource(context.resources, background(kind), bounds)
        return bounds.outWidth.toFloat() / bounds.outHeight.coerceAtLeast(1)
    }
    fun draw(context: Context, kind: RastroWidgetKind): Bitmap {
        val source = BitmapFactory.decodeResource(context.resources, background(kind),
            BitmapFactory.Options().apply { inSampleSize = 2 })
        val w = 640f
        val h = w * source.height / source.width
        val bitmap = Bitmap.createBitmap(w.toInt(), h.toInt(), Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        val rect = RectF(2f, 2f, w - 2, h - 5)
        val radius = h * .10f
        canvas.save()
        canvas.clipPath(Path().apply { addRoundRect(rect, radius, radius, Path.Direction.CW) })
        canvas.drawBitmap(source, null, rect, Paint(Paint.ANTI_ALIAS_FLAG or Paint.FILTER_BITMAP_FLAG))
        source.recycle()
        fun panel(x: Float, y: Float, width: Float, height: Float, stroke: Int = purple) {
            val r = RectF(w*x, h*y, w*(x+width), h*(y+height))
            paint.style = Paint.Style.FILL; paint.color = stroke
            canvas.drawRoundRect(RectF(r.left, r.top+3, r.right, r.bottom+3), h*.10f, h*.10f, paint)
            paint.color = Color.rgb(255, 248, 237)
            canvas.drawRoundRect(r, h*.10f, h*.10f, paint)
            paint.style = Paint.Style.STROKE; paint.strokeWidth = 1.8f; paint.color = stroke
            canvas.drawRoundRect(r, h*.10f, h*.10f, paint); paint.style = Paint.Style.FILL
        }
        fun text(value: String, x: Float, y: Float, size: Float, maxWidth: Float, color: Int = ink) {
            paint.color = color; paint.typeface = Typeface.create("sans-serif", Typeface.BOLD)
            paint.textSize = h*size
            val available = w*maxWidth
            if (paint.measureText(value) > available) paint.textSize *= available / paint.measureText(value)
            paint.textAlign = Paint.Align.CENTER
            canvas.drawText(value, w*x, h*y, paint)
        }
        when (kind) {
            RastroWidgetKind.COUNTDOWN -> {
                val name = RastroWidgetManager.getExamDetails(context).first
                val display = WidgetDates.display(RastroWidgetManager.getExamDateYmd(context), System.currentTimeMillis())
                text(name.uppercase(), .342f, .43f, .070f, .34f)
                text(display.value, .342f, .69f, .25f, .34f)
                text(display.label, .342f, .80f, .048f, .35f, Color.rgb(114, 99, 100))
            }
            RastroWidgetKind.DAILY -> {
                panel(.62f, .31f, .34f, .49f, Color.rgb(206, 68, 21))
                val count = RastroWidgetManager.getStreak(context)
                text(count.toString(), .79f, .61f, .27f, .28f, Color.rgb(223, 66, 0))
                text(if(count == 1) "DÍA DE RACHA" else "DÍAS DE RACHA", .79f, .73f, .052f, .29f)
            }
            RastroWidgetKind.WEEKLY -> {
                panel(.025f, .30f, .555f, .59f)
                paint.color = purple
                canvas.drawRoundRect(RectF(w*.04f,h*.10f,w*.38f,h*.34f),h*.10f,h*.10f,paint)
                text("RACHA SEMANAL", .21f, .265f, .075f, .30f, Color.WHITE)
                val days = RastroWidgetManager.getWeeklyActiveDates(context)
                text("${days.count { it }}/7", .13f, .60f, .23f, .16f, purple)
                text("DÍAS COMPLETADOS", .13f, .77f, .033f, .17f, Color.rgb(119, 108, 119))
                val letters = listOf("L","M","M","J","V","S","D")
                for (i in 0..6) {
                    val x = w*(.255f+i*.042f); val y=h*.52f; val r=h*.050f
                    paint.color = if(days.getOrElse(i){false}) purple else Color.rgb(207,193,197)
                    paint.style = if(days.getOrElse(i){false}) Paint.Style.FILL else Paint.Style.STROKE
                    paint.strokeWidth = 1.7f; canvas.drawCircle(x,y,r,paint); paint.style=Paint.Style.FILL
                    if(days.getOrElse(i){false}) text("✓",x/w,.551f,.075f,.038f,Color.WHITE)
                    text(letters[i],x/w,.745f,.065f,.038f)
                }
            }
            RastroWidgetKind.QUOTE -> {
                val quote = RastroWidgetManager.getDailyQuote().first
                val p = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
                    color=ink; typeface=Typeface.create("sans-serif",Typeface.BOLD); textSize=h*.092f
                }
                val width=(w*.55f).toInt()
                fun layout()=StaticLayout.Builder.obtain(quote,0,quote.length,p,width)
                    .setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build()
                var block=layout()
                while(block.height>h*.38f && p.textSize>h*.055f){p.textSize*=.94f;block=layout()}
                canvas.save();canvas.translate(w*.235f,h*.34f+(h*.38f-block.height)/2)
                block.draw(canvas);canvas.restore()
                text("— RASTRO", .51f, .756f, .054f, .30f, Color.rgb(149,130,145))
            }
        }
        canvas.restore()
        paint.style=Paint.Style.STROKE;paint.strokeWidth=2.2f;paint.color=ink
        canvas.drawRoundRect(rect,radius,radius,paint)
        return bitmap
    }
}
