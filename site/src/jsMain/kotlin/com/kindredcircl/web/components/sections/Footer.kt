package com.kindredcircl.web.components.sections

import androidx.compose.runtime.Composable
import com.kindredcircl.web.components.widgets.socialBar
import com.kindredcircl.web.theme.CopyrightStyle
import com.kindredcircl.web.toSitePalette
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaCopyright
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import kotlin.js.Date

val FooterStyle = CssStyle.base {
    Modifier
        .backgroundColor(colorMode.toSitePalette().nearBackground)
        .padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

@Composable
fun footer(modifier: Modifier = Modifier) {
    Row(Modifier.fillMaxWidth().then(modifier)) {
        Box(
            modifier = Modifier
                .classNames("footer")
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    modifier = Modifier.padding(top = 10.px),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    socialBar()
                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    copyright()
                }
            }
        }
    }
}

@Composable
private fun copyright() {
    P(
        attrs = CopyrightStyle.toModifier()
            .toAttrs()
    ) {
        FaCopyright(
            modifier = Modifier.padding(right = 10.px)
        )
        Text("${Date().getFullYear()} All Rights Reserved")
    }
}
