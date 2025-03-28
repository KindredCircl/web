package com.kindredcircl.web.pages

import androidx.compose.runtime.Composable
import com.kindredcircl.web.components.layouts.pageLayout
import com.kindredcircl.web.components.sections.legalDocumentPage
import com.kindredcircl.web.components.sections.tos.toSSections
import com.kindredcircl.web.components.sections.tos.tosIntroSection
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
import org.jetbrains.compose.web.css.cssRem

@Page
@Composable
fun tosPage() {

    val intro = tosIntroSection
    val sections = toSSections


    pageLayout("Terms of Service") {

        Column(Modifier.fillMaxWidth().id("top")) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .padding(top = 1.cssRem, bottom = 2.cssRem)
            ) {
                pageTitle("Terms of Service")

                legalDocumentPage(intro, sections)

            }



            // Floating Back to Top Widget
            backToTopButton("top")
        }
    }
}

