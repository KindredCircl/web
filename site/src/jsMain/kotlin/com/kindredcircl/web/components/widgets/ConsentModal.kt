package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.Button
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


enum class ConsentType { TOS, PRIVACY }

@Composable
fun consentModal(
    consentType: ConsentType?,
    onDismiss: () -> Unit,
    onAgree: () -> Unit
) {
    if (consentType == null) return

    val (title, route) = when (consentType) {
        ConsentType.TOS -> "Terms of Service" to "/tos"
        ConsentType.PRIVACY -> "Privacy Policy" to "/privacy"
    }

    Box(
        Modifier
            .position(Position.Fixed)
            .top(0.px)
            .left(0.px)
            .right(0.px)
            .bottom(0.px)
            .zIndex(999)
            .display(DisplayStyle.Block)
    ) {
        Box(
            Modifier
                .backgroundColor(Colors.White)
                .color(Colors.Black)
                .padding(2.cssRem)
                .margin(5.cssRem)
                .borderRadius(0.5.cssRem)
                .maxWidth(600.px)
                .styleModifier {
                    property("margin", "5rem auto")
                }
        ) {
            Column {
                H3 { Text(title) }

                P {
                    Text("Please review the full ")
                    A(href = route) { Text(title) }
                    Text(" before proceeding.")
                }

                Spacer()

                Button(onClick = {
                    onAgree()
                    onDismiss()
                }) {
                    Text("I Agree")
                }
            }
        }
    }
}