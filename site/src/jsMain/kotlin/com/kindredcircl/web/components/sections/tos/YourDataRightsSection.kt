package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val yourDataRightsSection =
    DocumentSection(
        title = "Your Data Rights",
        anchor = slugify("Your Data Rights"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("You can request a copy of your data or ask us to delete it. We protect your rights under laws like CCPA and GDPR. Some limits apply to what we can share.")
        )
    )