package com.kindredcircl.web.components.sections.privacy

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val privacyIntroduction = listOf(
    DocumentSection(
        title = "Introduction",
        anchor = "",
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("KindredCircl (“we,” “us,” or “our”) is committed to protecting your privacy. This Privacy Policy outlines how we collect, use, disclose, and safeguard your personal information when you use our platform. By using KindredCircl, you consent to the practices described in this policy.")
        )
    )
)