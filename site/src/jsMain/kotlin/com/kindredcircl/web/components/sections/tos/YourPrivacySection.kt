package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val yourPrivacySection =
    DocumentSection(
        title = "Your Privacy",
        anchor = slugify("Your Privacy"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We take your privacy seriously. We don’t sell your data. Direct messages are encrypted. Learn more in our (Privacy Policy)(/privacy).")
        )
    )