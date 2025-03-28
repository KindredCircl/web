package com.kindredcircl.web.components.sections

import androidx.compose.runtime.Composable
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.components.widgets.expandableToc
import com.kindredcircl.web.util.extractTocEntries
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth


@Composable
fun legalDocumentPage(
    introSection: List<DocumentSection>?,
    sections: List<DocumentSection>
) {
    val tocEntries = extractTocEntries(sections)

    Column(Modifier.fillMaxWidth()) {
        introSection?.let {
            introSection.forEach { renderDocumentSection(it, it.headingLevel) }
        }
        expandableToc(tocEntries)
        sections.forEach { renderDocumentSection(it, it.headingLevel) }
    }
}