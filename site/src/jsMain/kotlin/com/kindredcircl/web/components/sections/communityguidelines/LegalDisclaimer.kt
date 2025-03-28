package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val legalDisclaimer =
    DocumentSection(
        title = "Legal Disclaimer",
        anchor = slugify("Legal Disclaimer"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("Users are responsible for ensuring their content complies with all applicable local laws and regulations."),
            DocumentContent.Paragraph("KindredCircl is not responsible for any legal consequences resulting from user-generated content."),
        )
    )