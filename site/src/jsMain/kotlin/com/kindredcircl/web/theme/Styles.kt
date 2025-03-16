package com.kindredcircl.web.theme

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.active
import com.varabyte.kobweb.silk.style.selectors.anyLink
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.selectors.visited
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

//// Navigation
//val NavItemStyle = CssStyle {
//    base {
//        Modifier
//            .color(lightKCPurple)
//            .fontWeight(FontWeight.SemiBold)
//            .fontSize(FontSize.Large)
//            .textDecorationLine(TextDecorationLine.None)
//            .transition(Transition.of(property = "color", duration = 200.ms))
//    }
//    anyLink {
//        Modifier
//            .color(lightKCPurple)
//            .fontWeight(FontWeight.SemiBold)
//            .textDecorationLine(TextDecorationLine.None)
//    }
//    hover {
//        Modifier.color(lightKCPurpleContainer)
//    }
//}

val LinkBaseStyle = CssStyle {
    base {
        Modifier
            .color(lightOnKCPurple)
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(lightOnKCPurple)
            .textDecorationLine(TextDecorationLine.None)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
    }
    hover {
        Modifier
            .color(lightKCBlueContainer)
    }
    active {
        Modifier.color(lightOnKCPurpleContainer)
    }
    visited {
        Modifier.color(darkOnKCOrangeContainer)
    }
}

val CopyrightStyle = CssStyle {
    base {
        Modifier
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Small)
    }
}

val SocialLinkStyle = CssStyle {
    base {
        Modifier
            .color(lightKCBlue)
            .transition(Transition.of(property = "background-color", duration = 200.ms))
            .padding(leftRight = 10.px)
    }
    hover {
        Modifier
            .color(lightKCBlueContainer)
    }
}

val ButtonStyle = CssStyle {
    base {
        Modifier
            .backgroundImage(buttonGradient)
            .color(darkOnKCBlue)
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.SemiBold)
            .boxShadow(2.px, 3.px, 4.px, 0.px, Colors.Black.copyf(alpha = 0.3f))
            .padding(leftRight = 10.px)
            .borderRadius(5.px)
            .transition(Transition.of(property = "background-image", duration = 500.ms))
    }
    hover {
        Modifier
            .backgroundImage(buttonGradientHover)
            .color(darkOnKCBlueContainer)
            .boxShadow(3.px, 4.px, 6.px, 0.px, Colors.Black.copyf(alpha = 0.5f))
            .transition(Transition.of(property = "background-image", duration = 500.ms))
            .transform { translateY((-2).px) }
    }
    active {
        Modifier
            .backgroundImage(buttonGradientPressed)
            .boxShadow(0.px,1.px,2.px,0.px, Colors.Black.copyf(alpha = 0.5f), inset = true)
            .transition(Transition.of(property = "background-image", duration = 500.ms))
    }
}

val TextStyle = CssStyle {
    Modifier
        .fontFamily("Poppins")
        .fontSize(24.px)
        .fontWeight(400)
}
