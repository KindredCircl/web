package com.kindredcircl.web.components.sections

import androidx.compose.runtime.*
import com.kindredcircl.web.components.widgets.closeButton
import com.kindredcircl.web.components.widgets.hamburgerButton
import com.kindredcircl.web.theme.LinkBaseStyle
import com.kindredcircl.web.theme.lightKCPurple
import com.kindredcircl.web.util.Res
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.overlay.Overlay
import com.varabyte.kobweb.silk.components.overlay.OverlayVars
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text


val MenuHeaderStyle = CssStyle.base {
    Modifier.fillMaxWidth().padding(1.cssRem)
}

@Composable
private fun menuLink(path: String, text: String) {
    Link(path, text, modifier = LinkBaseStyle.toModifier())
}

@Composable
private fun menuItems() {
    menuLink("/", "Home")
    menuLink("/about", "Brand Story")
    menuLink("/tos", "Terms of Service")
    menuLink("/guidelines", "Community Guidelines")
    menuLink("beta", "Beta Testing Signup")
    menuLink("/faq", "FAQ")
    menuLink("/privacy", "Privacy")
    menuLink("/updates", "Updates")
}

val MenuSlideInAnim = Keyframes {
    from {
        Modifier.translateX((-100).percent)
    }

    to {
        Modifier
    }
}

enum class MenuState {
    CLOSED,
    OPEN,
    CLOSING;

    fun close() = when (this) {
        CLOSED -> CLOSED
        OPEN -> CLOSING
        CLOSING -> CLOSING
    }
}

@Composable
fun menuHeader() {
    Row(MenuHeaderStyle.toModifier(), verticalAlignment = Alignment.CenterVertically) {
        Row(
            Modifier
                .fontSize(1.5.cssRem)
                .gap(1.cssRem),
            verticalAlignment = Alignment.CenterVertically
        ) {
            var menuState by remember { mutableStateOf(MenuState.CLOSED) }

            hamburgerButton(onClick =  { menuState = MenuState.OPEN })

            if (menuState != MenuState.CLOSED) {
                menu(
                    menuState,
                    close = { menuState = menuState.close() },
                    onAnimationEnd = { if (menuState == MenuState.CLOSING) menuState = MenuState.CLOSED }
                )
            }
        }
    }
}

@Composable
private fun menu(menuState: MenuState, close: () -> Unit, onAnimationEnd: () -> Unit) {
    Overlay(
        Modifier
            .setVariable(OverlayVars.BackgroundColor, Colors.Transparent)
            .onClick { close() }
    ) {
        key(menuState) {
            Column(
                Modifier
                    .fillMaxHeight()
                    .width(Width.FitContent)
                    .align(Alignment.TopStart)
                    // Close button will appear roughly over the hamburger button, so the user can close
                    // things without moving their finger / cursor much.
                    .padding(top = 1.cssRem, leftRight = 1.cssRem)
                    .gap(1.5.cssRem)
                    .backgroundColor(lightKCPurple)
                    .animation(
                        MenuSlideInAnim.toAnimation(
                            duration = 200.ms,
                            timingFunction = if (menuState == MenuState.OPEN)
                                AnimationTimingFunction.EaseOut else AnimationTimingFunction.EaseIn,
                            direction = if (menuState == MenuState.OPEN)
                                AnimationDirection.Normal else AnimationDirection.Reverse,
                            fillMode = AnimationFillMode.Forwards
                        )
                    )
                    .borderRadius(topRight = 2.cssRem)
                    .onClick { it.stopPropagation() }
                    .onAnimationEnd { onAnimationEnd() },
                horizontalAlignment = Alignment.Start
            ) {
                closeButton(onClick = { close() })
                Column(
                    Modifier
                        .padding(right = 0.75.cssRem)
                        .gap(1.5.cssRem)
                        .fontSize(1.4.cssRem),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        Modifier
                            .margin(bottom = 1.cssRem),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Link("https://www.kindredcircl.com") {
                            // Block display overrides inline display of the <img> tag, so it calculates centering better
                            Image(
                                Res.Img.LOGO_SM,
                                "KindredCircl Logo",
                                Modifier
                                    .height(2.cssRem)
                                    .display(DisplayStyle.Block)
                                    .padding(right = 0.5.cssRem))
                        }
                        Text("KindredCircl")
                    }
                    menuItems()
                }
            }
        }
    }
}