package com.lab.keyneez.util.extension // ktlint-disable filename

import android.view.View
import com.lab.keyneez.util.OnSingleClickListener

fun View.setOnSingleClickListener(onSingleClick: (View) -> Unit) {
    val oneClick = OnSingleClickListener {
        onSingleClick(it)
    }
    setOnClickListener(oneClick)
}
