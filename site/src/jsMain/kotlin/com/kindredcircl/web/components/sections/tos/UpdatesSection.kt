package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val updatesSection =
    DocumentSection(
        title = "Updates",
        anchor = slugify("Updates"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We might update these Terms. If we do, we’ll let you know. Using KindredCircl after that means you agree to the changes.")
        )
    )