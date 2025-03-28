package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val codeOfConductSection =
    DocumentSection(
        title = "Code of Conduct",
        anchor = slugify("Code of Conduct"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        children = listOf(
            DocumentSection(
                title = "Respectful Interaction:",
                anchor = slugify("Respectful Interaction"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to interact with KindredCircl staff, other beta testers, and community members in a respectful and constructive manner."),
                )
            ),
            DocumentSection(
                title = "Prohibited Conduct:",
                anchor = slugify("Prohibited Conduct"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to refrain from any prohibited conduct as outlined in the KindredCircl Community Guidelines, including but not limited to:"),
                    DocumentContent.BulletList(
                        listOf(
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Hate Speech and Discrimination")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Harassment and Bullying")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Violence and Threats")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Spam and Misinformation")
                                )
                            ),
                        )
                    )
                )
            )
        )
    )