package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val privacySection =
    DocumentSection(
        title = "Privacy",
        anchor = slugify("Privacy"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        children = listOf(
            DocumentSection(
                title = "Data Collection",
                anchor = slugify("Data Collection"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl will collect and use Beta Testers' personal information in accordance with its Privacy Policy."),
                )
            ),
            DocumentSection(
                title = "Data Usage",
                anchor = slugify("Data Usage"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers consent to the use of their feedback and activity data to improve the KindredCircl platform."),
                )
            ),
        )
    )