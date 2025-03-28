package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val limitationOfLiabilitySection =
    DocumentSection(
        title = "Limitation of Liability",
        anchor = slugify("Limitation of Liability"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("KindredCircl shall not be liable for any damages arising out of or related to the Beta Tester's participation in the Beta Program."),
        )
    )