package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val communityFeedback =
    DocumentSection(
        title = "Community Feedback",
        anchor = slugify("Community Feedback"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("These guidelines will be regularly reviewed and updated based on community feedback and evolving standards."),
            DocumentContent.Paragraph("We encourage you to share your thoughts and suggestions for improving these guidelines.")
        )
    )