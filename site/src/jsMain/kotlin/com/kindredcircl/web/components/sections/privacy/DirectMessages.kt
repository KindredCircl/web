package com.kindredcircl.web.components.sections.privacy

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val directMessages =
    DocumentSection(
        title = "Direct Messages",
        anchor = slugify("Direct Messages"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("Direct Messaging will be available in the future. Details regarding the privacy of Direct Messages will be added to this Privacy Policy at that time.")
        )
    )