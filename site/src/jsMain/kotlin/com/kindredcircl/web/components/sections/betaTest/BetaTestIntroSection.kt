package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline5TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val betaTestIntro = listOf(
    DocumentSection(
        title = "KindredCircl Beta Test Program",
        anchor = "",
        headingLevel = "h2",
        style = Headline5TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("By participating in the KindredCircl Beta Program, you (\"Beta Tester\") agree to the following terms and conditions:")
        )
    )
)