package com.kindredcircl.web.components.forms

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.Sup
import org.jetbrains.compose.web.dom.Text

@Composable
fun formField(label: String, required: Boolean = false, content: @Composable () -> Unit) {
    Div(Modifier.margin(bottom = 1.cssRem).toAttrs()) {
        Label {
            Text(label)
            if (required) {
                Sup(Modifier.color(Colors.Red).margin(left = 0.25.cssRem).toAttrs()) { Text("*") }
            }
        }
        content()
    }
}
