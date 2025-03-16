package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import com.kindredcircl.web.theme.SocialLinkStyle
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
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun socialBar() {
    Row(
        modifier = Modifier
            .margin(top = 20.px)
            .padding(leftRight = 25.px)
            .minHeight(40.px)
            .borderRadius(r = 20.px)
            .backgroundColor(Colors.Transparent)
    ) {
        socialLinks()
    }
}

@Composable
private fun socialLinks() {
    Link(
        path = LINKEDIN_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
    Link(
        path = PATREON_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaPatreon(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
    Link(
        path = BLUESKY_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaBluesky(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
}

