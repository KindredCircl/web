package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val appStoresSection =
    DocumentSection(
        title = "App Stores",
        anchor = "app-stores",
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("If you download KindredCircl from Apple or Google, they’re not responsible for anything that happens on the app—we are.")
        )
    )