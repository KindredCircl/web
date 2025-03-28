package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val yourAccountSection =
    DocumentSection(
        title = "Your Account",
        anchor = slugify("Your Account"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("You’re responsible for what happens on your account. Don’t share your password. If something suspicious happens, contact us.")
        )
    )