package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.kindredcircl.web.SocialLinkStyle
import com.kindredcircl.web.util.Constants.BLUESKY_URL
import com.kindredcircl.web.util.Constants.LINKEDIN_URL
import com.kindredcircl.web.util.Constants.PATREON_URL
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.FaBluesky
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaPatreon
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.cssRem

@Composable
fun socialBar() {
    Row(
        modifier = Modifier
            .margin(top = 1.25.cssRem)
            .padding(leftRight = 1.5625.cssRem)
            .minHeight(2.5.cssRem)
            .borderRadius(r = 1.25.cssRem)
            .backgroundColor(Colors.Transparent)
    ) {
        socialLinks()
    }
}

@Composable
private fun socialLinks() {
    val breakpoint = rememberBreakpoint()
    Link(
        path = LINKEDIN_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(
            modifier = SocialLinkStyle.toModifier(),
            size = if (breakpoint < Breakpoint.SM) IconSize.SM
            else if (breakpoint < Breakpoint.MD ) IconSize.LG
            else IconSize.XXL
        )
    }
    Link(
        path = PATREON_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaPatreon(
            modifier = SocialLinkStyle.toModifier(),
            size = if (breakpoint < Breakpoint.SM) IconSize.SM
            else if (breakpoint < Breakpoint.MD ) IconSize.LG
            else IconSize.XXL
        )
    }
    Link(
        path = BLUESKY_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaBluesky(
            modifier = SocialLinkStyle.toModifier(),
            size = if (breakpoint < Breakpoint.SM) IconSize.SM
            else if (breakpoint < Breakpoint.MD ) IconSize.LG
            else IconSize.XXL
        )
    }
}

