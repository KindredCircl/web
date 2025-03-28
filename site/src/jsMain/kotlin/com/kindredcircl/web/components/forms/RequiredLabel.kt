package com.kindredcircl.web.components.forms

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.Sup
import org.jetbrains.compose.web.dom.Text

@Composable
fun requiredLabel(forId: String, text: String) {
    Label(forId = forId) {
        Text(text)
        Sup(Modifier.color(Colors.Red).toAttrs()) { Text("*") }
    }
}
