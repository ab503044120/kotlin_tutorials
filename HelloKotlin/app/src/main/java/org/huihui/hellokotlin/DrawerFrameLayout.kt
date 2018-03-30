package org.huihui.hellokotlin

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout

class DrawerFrameLayout(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : FrameLayout(context, attrs, defStyleAttr) {
    private val TAG: String = "DrawerFrameLayout"

    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0) {
        Log.e(TAG, "two parameter")
    }

    constructor(context: Context?) : this(context, null) {
        Log.e(TAG, "one parameter")
    }

    init {
        Log.e(TAG, "three parameter")
    }


}