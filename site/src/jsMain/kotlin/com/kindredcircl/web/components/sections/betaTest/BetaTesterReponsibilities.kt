package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val betaTesterResponsibilities =
    DocumentSection(
        title = "Beta Tester Responsibilities",
        anchor = slugify("Beta Tester Responsibilities"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        children = listOf(
            DocumentSection(
                title = "Use the Platform:",
                anchor = slugify("Use the Platform"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to actively use the KindredCircl platform and its features.")
                )
            ),
            DocumentSection(
                title = "Provide Feedback:",
                anchor = slugify("Provide Feedback"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to provide regular and constructive feedback on their experience, including but not limited to any bugs, errors, usability issues, and suggestions for improvement.")
                )
            ),
            DocumentSection(
                title = "Adhere to Guidelines:",
                anchor = slugify("Adhere to Guidelines"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to adhere to the KindredCircl Community Guidelines (as outlined in document version 2025.01, or any subsequent updated version), which promote:"),
                    DocumentContent.BulletList(
                        listOf(
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Genuine Connection")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Authentic Expression")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Mutual Respect")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Inclusive Belonging")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Respectful Expression")
                                )
                            )
                        )
                    )
                )
            ),
            DocumentSection(
                title = "Confidentiality:",
                anchor = slugify("Confidentiality"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to keep confidential any non-public information about KindredCircl, including but not limited to features, functionality, design, and performance.")
                )
            ),
            DocumentSection(
                title = "Prompt Reporting:",
                anchor = slugify("Prompt Reporting"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Beta Testers agree to promptly report any bugs, errors, or security vulnerabilities they encounter.")
                )
            ),
        )
    )