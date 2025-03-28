package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val kcRightsAndResponsibilities =
    DocumentSection(
        title = "KindredCircl's Rights and Responsibilities",
        anchor = slugify("KindredCircl's Rights and Responsibilities"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        children = listOf(
            DocumentSection(
                title = "Provide Access to the Platform",
                anchor = slugify("Provide Access to the Platform"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl will provide Beta Testers with access to the beta platform."),
                )
            ),
            DocumentSection(
                title = "Collect Feedback from Beta Testers",
                anchor = slugify("Collect Feedback from Beta Testers"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl will collect and review feedback provided by Beta Testers."),
                )
            ),
            DocumentSection(
                title = "Modify the Platform",
                anchor = slugify("Modify the Platform"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl reserves the right to modify or discontinue the beta program or any features of the beta platform at any time."),
                )
            ),
            DocumentSection(
                title = "Use Feedback",
                anchor = slugify("Use Feedback"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl may use Beta Tester feedback for any purpose, including but not limited to improving the platform and promoting KindredCircl to potential users. Beta Testers agree that KindredCircl may use their feedback in promotional materials, such as testimonials or case studies. In such cases, only the Beta Tester's first name and last initial will be used."),
                )
            ),
        )
    )