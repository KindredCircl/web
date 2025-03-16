package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.*
import com.kindredcircl.web.theme.LinkBaseStyle
import com.kindredcircl.web.theme.lightKCPurple
import com.kindredcircl.web.theme.lightOnKCPurple
import com.kindredcircl.web.util.Res
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*

@Composable
fun navDrawer(onMenuClosed: () -> Unit) {
    val scope = rememberCoroutineScope()
    var translateX by remember { mutableStateOf(0.percent) } // Start visible
    var opacity by remember { mutableStateOf(100.percent) } // Start visible

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.vh)
            .position(Position.Fixed)
            .zIndex(2)
            .opacity(opacity)
            .background(lightKCPurple)
            .color(lightOnKCPurple)
            .transition(Transition.of(property = "opacity", duration = 500.ms))
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(all = 25.px)
                .width(60.percent)
                .overflow(Overflow.Auto)
                .scrollBehavior(ScrollBehavior.Smooth)
                .translateX(tx = translateX)
                .transition(Transition.of(property = "translate", duration = 500.ms))
        ) {
            Row(
                modifier = Modifier.margin(bottom = 25.px).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaXmark(
                    modifier = Modifier
                        .cursor(Cursor.Pointer)
                        .margin(right = 20.px, bottom = 3.px)
                        .onClick {
                            scope.launch {
                                translateX = (-100).percent
                                opacity = 0.percent
                                delay(500)
                                onMenuClosed()
                            }
                        },
                    size = IconSize.LG
                )
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        modifier = Modifier.size(150.px),
                        src = Res.Img.LOGO_SM, // Replace with your logo
                        alt = "KindredCircl Logo"
                    )
                }
            }
            Link(
                path = "/",
                text = "Home",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 10.px)
            )
            Link(
                path = "/about",
                text = "Brand Story",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/tos",
                text = "Terms of Service",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/guidelines",
                text = "Community Guidelines",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/beta",
                text = "Beta Signup",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/faq",
                text = "FAQ",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/team",
                text = "Team",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/privacy",
                text = "Privacy",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "/updates",
                text = "Updates",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
        }
    }
}