package com.kindredcircl.web.components.models

import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.GeneralKind

data class DocumentSection(
    val title: String,
    val anchor: String,
    val headingLevel: String,
    val style: CssStyle<GeneralKind>,
    val contents: List<DocumentContent> = emptyList(),
    val children: List<DocumentSection> = emptyList(),
    val isSubSection: Boolean = false
)