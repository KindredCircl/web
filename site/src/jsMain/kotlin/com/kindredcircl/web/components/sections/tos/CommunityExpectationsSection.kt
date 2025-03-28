package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val communityExpectationSection =
    DocumentSection(
        title = "Community Expectations",
        anchor = slugify("Community Expectations"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We’re building a safe, respectful place. No hate speech, bullying, misinformation, or illegal content. Violations can result in your account being removed.")
        )
    )