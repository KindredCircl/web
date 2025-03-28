package com.kindredcircl.web.pages

import androidx.compose.runtime.Composable
import com.kindredcircl.web.HeroContainerStyle
import com.kindredcircl.web.components.layouts.pageLayout
import com.kindredcircl.web.components.sections.communityguidelines.communityGuidelineSections
import com.kindredcircl.web.components.sections.communityguidelines.communityGuidelinesIntro
import com.kindredcircl.web.components.sections.legalDocumentPage
import com.kindredcircl.web.components.widgets.backToTopButton
import com.kindredcircl.web.components.widgets.pageTitle
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem

@Page
@Composable
fun guidelinesPage() {

    val intro = communityGuidelinesIntro
    val content = communityGuidelineSections

    pageLayout(
        "Community Guidelines"
    ) {

        Column(
            Modifier.fillMaxWidth().id("top").padding(leftRight = 1.cssRem, topBottom = 2.cssRem),
        ) {
            Column(
                HeroContainerStyle.toModifier()
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .padding(top = 1.cssRem)
            ) {
                pageTitle("Community Guidelines")
                legalDocumentPage(intro, content)

            }

            // Floating Back to Top Widget
            backToTopButton("top")
        }
    }
}

