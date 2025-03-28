package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val guidelinesFooter =
    DocumentSection(
        title ="",
        anchor = "",
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("Version: 1.0.0"),
            DocumentContent.Paragraph("Last updated: February 25, 2025"),
            DocumentContent.Paragraph("Questions, comments, or any other feedback in reference to these Community Guidelines may be emailed to communityguidelines@kindredcircl.com")
        )
    )