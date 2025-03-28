package com.kindredcircl.web

import com.kindredcircl.web.theme.buttonGradient
import com.kindredcircl.web.theme.buttonGradientHover
import com.kindredcircl.web.theme.buttonGradientPressed
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.layout.HorizontalDividerStyle
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.addVariantBase
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.active
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.selectors.visited
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.modifyStyleBase
import org.jetbrains.compose.web.css.*


@InitSilk
fun initSiteStyles(ctx: InitSilkContext) {

    // This site does not need scrolling itself, but this is a good demonstration for how you might enable this in your
    // own site. Note that we only enable smooth scrolling unless the user has requested reduced motion, which is
    // considered a best practice.
    ctx.stylesheet.registerStyle("html") {
        cssRule(CSSMediaQuery.MediaFeature("prefers-reduced-motion", StylePropertyValue("no-preference"))) {
            Modifier.scrollBehavior(ScrollBehavior.Smooth)
        }
    }

    ctx.stylesheet.registerStyleBase("body") {
        Modifier
            .fontFamily(
                "Poppins", "Inter"
            )
            .fontSize(16.px)
            .lineHeight(1.2)
    }

    // Silk dividers only extend 90% by default; we want full width dividers in our site
    ctx.theme.modifyStyleBase(HorizontalDividerStyle) {
        Modifier.fillMaxWidth()
    }
}

// General Body Styles
val BodyStyle = CssStyle {
    Modifier
        .background(colorMode.toSitePalette().brand.background)
        .color(
            /*if (colorMode == ColorMode.LIGHT) colorMode.toSitePalette().brand.onBackground
            else*/ colorMode.toSitePalette().brand.tertiary
        )
        .fillMaxWidth()
}

val HeroContainerStyle = CssStyle {
    base { Modifier.fillMaxWidth().gap(2.cssRem) }
    Breakpoint.MD { Modifier.margin { top(5.vh) } }
}

val DivContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .gap(1.cssRem)
            .padding(topBottom = 1.cssRem)
    }
}

val ParagraphTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Poppins") // Or your preferred body font
            .fontWeight(FontWeight.Normal)
            .textAlign(TextAlign.Start)
            .lineHeight(1.8.cssRem)
    }
    Breakpoint.SM{
        Modifier.fontSize(1.cssRem)
    }
    Breakpoint.MD{
        Modifier.fontSize(1.05.cssRem)
    }
    Breakpoint.LG{
        Modifier.fontSize(1.2.cssRem)
    }
}

val BulletListStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Poppins")
            .fontWeight(FontWeight.Normal)
            .textAlign(TextAlign.Start)
            .padding(topBottom = 1.2.cssRem)
    }
    Breakpoint.SM{
        Modifier.fontSize(1.cssRem)
    }
    Breakpoint.MD{
        Modifier.fontSize(1.1.cssRem)
    }
    Breakpoint.LG{
        Modifier.fontSize(1.2.cssRem)
    }
}

// Headline Styles
val Headline1TextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(700)
            .textAlign(TextAlign.Center)
            .lineHeight(1.2) //1.5x doesn't look as good on very large text
    }
    Breakpoint.SM {
        Modifier.fontSize(2.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(2.2.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(2.5.cssRem)
    }
}

val Headline2TextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(700)
            .textAlign(TextAlign.Center)
            .lineHeight(1.2) //1.5x doesn't look as good on very large text
    }
    Breakpoint.SM {
        Modifier.fontSize(1.6.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(1.8.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(2.cssRem)
    }
}

val Headline3TextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(700)
            .textAlign(TextAlign.Start)
            .lineHeight(1.2) //1.5x doesn't look as good on very large text
    }
    Breakpoint.SM {
        Modifier.fontSize(1.2.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(1.4.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(1.5.cssRem)
    }
}

val Headline4TextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(700)
            .textAlign(TextAlign.Start)
            .lineHeight(1.2) //1.5x doesn't look as good on very large text
    }
    Breakpoint.SM {
        Modifier.fontSize(1.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(1.15.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(1.25.cssRem)
    }
}

val Headline5TextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(700)
            .textAlign(TextAlign.Start)
            .lineHeight(1.1) //1.5x doesn't look as good on very large text
            .margin(topBottom = 0.75.cssRem)
    }
    Breakpoint.SM {
        Modifier.fontSize(1.1.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(1.5.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(2.cssRem)
    }
}

val ProhibitedHeadlinesStyle = CssStyle {
    base {
        Modifier
            .color(colorMode.toSitePalette().brand.error)
    }
}

val PositiveHeadlinesStyle = CssStyle {
    base {
        Modifier
            .color(colorMode.toSitePalette().brand.positive)
    }
}


// Menu Styles
val MenuDrawerStyle = CssStyle {
    base {
        Modifier
            .position(Position.Fixed)
            .fillMaxHeight()
            .width(Width.FitContent)
            .backgroundColor(colorMode.toSitePalette().nearBackgroundNavDrawer)
            .color(colorMode.toSitePalette().brand.onBackground)
            .gap(1.5.cssRem)
            .padding(top = 1.cssRem, leftRight = 1.cssRem)
            .borderRadius(topRight = 2.cssRem)
            .zIndex(1)
    }
}

val MenuHeaderStyle = CssStyle.base {
    Modifier
        .position(Position.Fixed)
        .width(Width.FitContent)
        .top(0.px)
        .left(0.px)
        .right(0.px)
        .zIndex(0.5)
        .padding(1.cssRem)
}


// Button Styles
val CircleButtonVariant = ButtonStyle.addVariantBase {
    Modifier.padding(0.px).borderRadius(50.percent)
}

val UncoloredButtonVariant = ButtonStyle.addVariantBase {
    Modifier.setVariable(ButtonVars.BackgroundDefaultColor, Colors.Transparent)
}

val ButtonStyle = CssStyle {
    base {
        Modifier
            .backgroundImage(buttonGradient)
            .color(colorMode.toSitePalette().brand.onCustom3)
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
            .color(colorMode.toSitePalette().brand.accent)
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

val BackToTopButtonStyle = CssStyle {
    base {
        Modifier
            .padding(0.5.cssRem)
            .fontSize(1.75.cssRem)
            .position(Position.Fixed)
            .right(24.px)
            .bottom(24.px)
            .zIndex(10)
    }
}


// Link Styles
val LinkBaseStyle = CssStyle {
    base {
        Modifier
            .color( colorMode.toSitePalette().brand.onCustom2 )
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    visited {
        Modifier.color( colorMode.toSitePalette().brand.onCustom3 )
    }
    hover {
        Modifier
            .color( if (colorMode == ColorMode.DARK) colorMode.toSitePalette().brand.accent
                else colorMode.toSitePalette().brand.custom5 )
    }
    active {
        Modifier.color( colorMode.toSitePalette().brand.onCustom4 )
    }
}


// Footer Styles
val CopyrightStyle = CssStyle {
    base {
        Modifier
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Medium)
    }
}

val SocialLinkStyle = CssStyle {
    base {
        Modifier
            .color(
                if (colorMode == ColorMode.DARK) colorMode.toSitePalette().brand.custom4
                else colorMode.toSitePalette().brand.onCustom1
            )
            .transition(Transition.of(property = "color", duration = 200.ms))
            .padding(leftRight = 10.px)
    }
    hover {
        Modifier
            .color(
                if (colorMode == ColorMode.DARK) colorMode.toSitePalette().brand.custom1
                else colorMode.toSitePalette().brand.custom4
            )
    }
}

val FooterStyle = CssStyle.base {
    Modifier
        .backgroundColor(colorMode.toSitePalette().nearBackgroundFooter)
        .padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
        .fillMaxWidth()
}


// Blockquote Styles
val BlockquoteStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(FontWeight.SemiBold)
            .textAlign(TextAlign.Center)
            .fontStyle(FontStyle.Italic)
            .color(
                if (colorMode == ColorMode.DARK) colorMode.toSitePalette().brand.accent
                else colorMode.toSitePalette().brand.onCustom1
            )
    }
    Breakpoint.SM {
        Modifier.fontSize(2.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(2.5.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(3.cssRem)
    }
}

val BlockquoteFooterStyle = CssStyle {
    base {
        Modifier
            .textAlign(TextAlign.End)
            .fontStyle(FontStyle.Italic)
            .fontSize(1.1.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(1.3.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(1.5.cssRem)
    }
}


// Brand Name Style
val KindredCirclStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Inter")
            .fontWeight(700)
            .fontStyle(FontStyle.Italic)
            .color( colorMode.toSitePalette().brand.onCustom1)
    }
}

// Table of Contents
val TocInlineContainerStyle = CssStyle.base {
    Modifier.display(DisplayStyle.Block)
}


val TocLinkTextStyle = CssStyle {
    base {
        Modifier
            .padding(leftRight = 1.cssRem)
    }
    Breakpoint.SM{
        Modifier.fontSize(0.7.cssRem)
    }
    Breakpoint.MD{
        Modifier.fontSize(0.9.cssRem)
    }
    Breakpoint.LG{
        Modifier.fontSize(1.1.cssRem)
    }
}

val ExpandableTocStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .padding(bottom = 2.cssRem)
    }
}

val TocSubListStyle = CssStyle {
    base {
        Modifier
            .padding(left = 2.cssRem)
            .overflow(Overflow.Hidden)
            .textAlign(TextAlign.Start)
            .maxHeight(500.px)
    }
}

val ExpandSubListAnim = Keyframes {
    from {
        Modifier.maxHeight(0.px)
    }
    to {
        Modifier.maxHeight(500.px)
    }
}

val ExpandCollapseAnim = Keyframes {
    from { Modifier.maxHeight(0.px) }
    to { Modifier.maxHeight(300.px) }
}
