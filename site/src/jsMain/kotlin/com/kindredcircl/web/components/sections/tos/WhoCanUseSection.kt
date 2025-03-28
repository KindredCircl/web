package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val whoCanUseSection =
    DocumentSection(
        title = "Who Can Use KindredCircl",
        anchor = slugify("Who Can Use KindredCircl"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("You must be 13 or older. If you’re under 18, get a parent or guardian’s permission. If we find out someone under 13 is using KindredCircl, we’ll delete the account.")
        )
    )