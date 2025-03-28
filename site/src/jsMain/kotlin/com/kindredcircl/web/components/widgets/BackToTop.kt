package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.kindredcircl.web.BackToTopButtonStyle
import com.kindredcircl.web.ButtonStyle
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.ArrowUpIcon
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.A

@Composable
fun backToTopButton(anchorId: String = "top") {
    A(
        href = "#$anchorId",
        attrs = ButtonStyle.toModifier()
            .then(BackToTopButtonStyle.toModifier())
            .toAttrs()
    ) {
        ArrowUpIcon()
    }
}