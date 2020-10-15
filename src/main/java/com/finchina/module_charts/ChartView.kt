package com.finchina.module_charts

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView

class ChartView : WebView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    fun getType() = "pie" +
            "" +
            "" +
            "" +
            ""
}