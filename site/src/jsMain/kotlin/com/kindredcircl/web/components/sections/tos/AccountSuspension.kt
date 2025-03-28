package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val accountSuspensionSection =
    DocumentSection(
        title = "Account Suspension",
        anchor = slugify("Account Suspension"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We can suspend or delete your account if you break our rules or put the community at risk.")
        )
    )