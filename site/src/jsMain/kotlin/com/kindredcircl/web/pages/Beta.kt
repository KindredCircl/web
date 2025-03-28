package com.kindredcircl.web.pages

import androidx.compose.runtime.Composable
import com.kindredcircl.web.components.layouts.pageLayout
import com.kindredcircl.web.components.sections.betaTest.betaTestIntro
import com.kindredcircl.web.components.sections.betaTest.betaTestSections
import com.kindredcircl.web.components.sections.legalDocumentPage
import com.kindredcircl.web.components.widgets.backToTopButton
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
fun betaPage() {
    pageLayout("Beta Test Signup") {
        Column(
            Modifier.fillMaxSize().id("top").padding(bottom = 2.cssRem)
        ) {
            pageTitle("Beta Test Signup")
            legalDocumentPage(betaTestIntro, betaTestSections)


        }
        backToTopButton()
    }
}