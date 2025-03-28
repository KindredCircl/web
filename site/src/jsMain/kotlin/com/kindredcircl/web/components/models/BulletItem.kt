package com.kindredcircl.web.components.models

data class BulletItem(
    val title: String? = null, // Optional bold intro
    val body: List<DocumentContent> // Can include paragraphs or sub-bullets
)
