package com.kindredcircl.web.components.models

import androidx.compose.runtime.Composable

sealed class DocumentContent {
    data class Paragraph(val text: String) : DocumentContent()
    data class BulletList(val items: List<BulletItem>) : DocumentContent()
    data class BlockQuote(val quote: String) : DocumentContent()
    data class LabeledText(val label: String, val value: String) : DocumentContent()
    data class NumberedList(val items: List<NumberedItem>) : DocumentContent()
    data class Component(val content: @Composable () -> Unit) : DocumentContent()
}
