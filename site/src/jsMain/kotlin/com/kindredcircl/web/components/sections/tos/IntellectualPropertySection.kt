package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val intellectualPropertySection =
    DocumentSection(
        title = "Intellectual Property",
        anchor = slugify("Intellectual Property"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("Don’t post content you don’t have rights to. Respect other people’s work.")
        )
    )