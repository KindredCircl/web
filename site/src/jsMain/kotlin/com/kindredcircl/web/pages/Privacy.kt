package com.kindredcircl.web.pages

import androidx.compose.runtime.Composable
import com.kindredcircl.web.components.layouts.pageLayout
import com.kindredcircl.web.components.sections.legalDocumentPage
import com.kindredcircl.web.components.sections.privacy.privacyIntroduction
import com.kindredcircl.web.components.sections.privacy.privacySections
import com.kindredcircl.web.components.widgets.pageTitle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.cssRem

@Page
@Composable
fun privacyPage() {

    val intro = privacyIntroduction
    val sections = privacySections

    pageLayout("Privacy Policy") {
        Column( Modifier.fillMaxSize().id("top").padding(leftRight = 1.cssRem, topBottom = 2.cssRem)) {
            pageTitle("Privacy Policy")
            legalDocumentPage(intro, sections)

        }
    }
}