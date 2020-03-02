package com.flores.loginbackground

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.LinearLayoutCompat

/**
 * LoginBackground
 *
 * @author Bill Flores - bilizen3@gmail.com
 * @since 03/01/2020
 */
class Background @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayoutCompat(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.layout_background, this)
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.LoginBackground, 0, 0)
        typedArray.recycle()

    }

}