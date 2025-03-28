package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val tosIntroSection =
    listOf(
        DocumentSection(
            title = "",
            anchor = "",
            headingLevel = "h2",
            style = Headline2TextStyle,
            isSubSection = false,
            contents = listOf(
                DocumentContent.Paragraph("Welcome to KindredCircl! This is a friendly summary to help you understand your basic rights and responsibilities as a member of our community. It doesn’t replace the full Terms of Service which will become available when the platform opens and you create your account, but gives you the highlights.")
            )
        )
    )