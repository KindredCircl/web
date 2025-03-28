package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.kindredcircl.web.Headline1TextStyle
import com.kindredcircl.web.KindredCirclStyle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.H1

@Composable
fun pageTitle(title: String) {
    val breakpoint = rememberBreakpoint()
    H1(
        Headline1TextStyle.toModifier()
//            .id("top")
            .fillMaxWidth()
            .toAttrs()
    ) {
        if (breakpoint <= Breakpoint.SM) {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SpanText(
                    "KindredCircl",
                    KindredCirclStyle.toModifier()
                        .padding(bottom = 1.cssRem)
                )
                SpanText(
                    title,
                    Modifier.fontSize(1.5.cssRem)

                )
            }
        } else {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                SpanText(
                    "KindredCircl",
                    KindredCirclStyle.toModifier()
                )
                SpanText(
                    " - $title"
                )
            }
        }
    }

}