package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.CloseIcon
import com.varabyte.kobweb.silk.components.icons.HamburgerIcon

@Composable
fun hamburgerButton(onClick: () -> Unit) {
    IconButton(onClick) {
        HamburgerIcon()
    }
}

@Composable
fun closeButton(onClick: () -> Unit) {
    IconButton(onClick) {
        CloseIcon()
    }
}
