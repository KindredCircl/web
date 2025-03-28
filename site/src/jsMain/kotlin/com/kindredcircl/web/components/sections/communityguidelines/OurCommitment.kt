package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val ourCommitment =
    DocumentSection(
        title = "Our Commitment",
        anchor = slugify("Our Commitment"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("KindredCircl is dedicated to providing a safe, inclusive, and positive online community for all members. We are committed to upholding these Community Guidelines and taking appropriate action against any violations. We believe that by working together, we can create a thriving online space where everyone feels valued, respected, and empowered to express themselves authentically."),
            DocumentContent.Paragraph("Version: 1.0.0"),
            DocumentContent.Paragraph("Last updated: February 25, 2025"),
            DocumentContent.Paragraph("Questions, comments, or any other feedback in reference to these Community Guidelines may be emailed to communityguidelines@kindredcircl.com")

        )
    )