package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val disclaimerOfWarranty =
    DocumentSection(
        title = "Disclaimer of Warranty",
        anchor = slugify("Disclaimer of Warranty"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("•\tThe KindredCircl beta platform is provided \"as is\" and KindredCircl makes no warranties, express or implied, regarding its performance or functionality."),
        )
    )