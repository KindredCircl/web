package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val terminationSection =
    DocumentSection(
        title = "Termination",
        anchor = slugify("Termination"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("KindredCircl may terminate a Beta Tester's participation in the Beta Program at any time for any reason."),
            DocumentContent.Paragraph("Beta Testers may terminate their participation at any time by notifying KindredCircl."),
        )
    )