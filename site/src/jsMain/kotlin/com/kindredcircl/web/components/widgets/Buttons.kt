package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.kindredcircl.web.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.CloseIcon
import com.varabyte.kobweb.silk.components.icons.HamburgerIcon
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Text

@Composable
fun hamburgerButton(onClick: () -> Unit) {
    IconButton(
        onClick
    ) {
        HamburgerIcon()
    }
}

@Composable
fun closeButton(onClick: () -> Unit) {
    IconButton(onClick) {
        CloseIcon()
    }
}

@Composable
fun joinBeta(onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        modifier = ButtonStyle.toModifier()
    ) {
        Text("Become a Beta Tester")
    }
}
