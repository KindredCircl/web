package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val updatesToGuidelines =
    DocumentSection(
        title = "Updates to Community Guidelines",
        anchor = slugify("Updates to Community Guidelines"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("These guidelines may be updated periodically to reflect evolving community standards and legal requirements."),
            DocumentContent.Paragraph("Members will be notified of any significant changes.")
        )
    )