package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val noGuaranteesSection =
    DocumentSection(
        title = "No Guarantees",
        anchor = slugify("No Guarantees"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We try to provide a great service, but we can’t promise the app will always work perfectly.")
        )
    )