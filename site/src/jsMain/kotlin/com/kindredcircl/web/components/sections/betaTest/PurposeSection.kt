package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val purposeSection =
    DocumentSection(
        title = "Purpose of the Beta Test Program",
        anchor = slugify("Purpose of the Beta Test Program"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("The KindredCircl Beta Program is designed to gather feedback on the KindredCircl platform prior to its official launch, to identify potential issues, and to improve the user experience."),
        )
    )