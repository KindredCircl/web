package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val theLawThatAppliesSection =
    DocumentSection(
        title = "The Law That Applies",
        anchor = slugify("The Law That Applies"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("New Jersey law applies. Disputes go to courts in Camden County, NJ, unless handled through arbitration.")
        )
    )