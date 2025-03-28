package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val communityGuidelinesIntro = listOf(
    DocumentSection(
    title = "Introduction",
    anchor = "", // "top" can be added if used for scroll targeting
    headingLevel = "h2",
    style = Headline2TextStyle,
    isSubSection = false,
    contents = listOf(
        DocumentContent.Paragraph(
            "KindredCircl is a space for authentic connection, respectful expression, and inclusive community. These guidelines ensure a safe and welcoming environment for all. By participating in KindredCircl, you agree to uphold these principles and contribute to a culture of kindness and accountability."
        )
    )
    ),
    DocumentSection(
        title = "Our Core Values",
        anchor = slugify("Our Core Values"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("These values are the foundation of our community:"),
            DocumentContent.BulletList(
                items = listOf(
                    BulletItem(
                        title = "Authenticity:",
                        body = listOf(
                            DocumentContent.Paragraph("We celebrate real, unfiltered expression. Be yourself and honor your story.")
                        )
                    ),
                    BulletItem(
                        title = "Respect:",
                        body = listOf(
                            DocumentContent.Paragraph("We engage with empathy and compassion. Disagree without demeaning, and listen to understand.")
                        )
                    ),
                    BulletItem(
                        title = "Belonging:",
                        body = listOf(
                            DocumentContent.Paragraph("We welcome diverse voices and lived experiences. Everyone deserves to feel seen and valued.")
                        )
                    )
                )
            )
        )
    )
)