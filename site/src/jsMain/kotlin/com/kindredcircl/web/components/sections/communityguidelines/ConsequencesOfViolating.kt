package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val consequences =
    DocumentSection(
        title = "Consequences of Violating the Community Guidelines:",
        anchor = "consequences",
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("Warnings and content removal"),
            DocumentContent.Paragraph("Temporary account suspension."),
            DocumentContent.Paragraph("Permanent account termination."),
            DocumentContent.Paragraph("Reporting to law enforcement, when applicable."),
        )
    )