package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val solvingProblemsSection =
    DocumentSection(
        title = "Solving Problems",
        anchor = slugify("Solving Problems"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We’ll try to work things out informally first. If needed, we’ll use arbitration (not court), in New Jersey. No class-action lawsuits.")
        )
    )