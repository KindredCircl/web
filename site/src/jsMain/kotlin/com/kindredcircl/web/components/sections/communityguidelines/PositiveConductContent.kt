package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val positiveConductContent =
    DocumentSection(
        title = "Guidelines for Positive Community Conduct",
        anchor = "positive-conduct",
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(),
        children = listOf(
            DocumentSection(
                title = "Cultivate Respectful Communication:",
                anchor = "respectful-communication",
                headingLevel = "positive",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Engage in constructive conversations and offer thoughtful feedback."),
                    DocumentContent.Paragraph("Practice empathy and understanding in your interactions.")
                )
            ),
            DocumentSection(
                title = "Promote Positive and Supportive Content:",
                anchor = "promote-positive",
                headingLevel = "positive",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Share content that inspires, encourages, and uplifts others."),
                    DocumentContent.Paragraph("Celebrate the achievements and milestones of fellow community members.")
                )
            ),
            DocumentSection(
                title = "Encourage Authenticity and Transparency:",
                anchor = "encourage-authenticity",
                headingLevel = "positive",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Share your experiences and perspectives honestly and genuinely."),
                    DocumentContent.Paragraph("Respect the privacy of others and avoid sharing personal information without consent.")
                )
            ),
            DocumentSection(
                title = "Foster Inclusivity and Diversity:",
                anchor = "foster-inclusivity",
                headingLevel = "positive",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Welcome and support members from all backgrounds and communities."),
                    DocumentContent.Paragraph("Be mindful of cultural differences and promote understanding.")
                )
            ),
            DocumentSection(
                title = "Maintain Community Space Integrity:",
                anchor = "maintain-community-space-integrity",
                headingLevel = "positive",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Adhere to the specific guidelines of each community space or group."),
                    DocumentContent.Paragraph("Post relevant and appropriate content within designated spaces.")
                )
            ),
            DocumentSection(
                title = "Report Violations Promptly:",
                anchor = "respectful-communication",
                headingLevel = "positive",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Report any violations of these guidelines to the community moderators."),
                    DocumentContent.Paragraph("Provide clear and accurate information about the violation.")
                )
            ),

        )
    )