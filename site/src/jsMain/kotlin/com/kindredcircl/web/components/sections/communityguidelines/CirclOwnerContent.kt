package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection

val circlOwnerContent =
    DocumentSection(
        title = "Circl Owners and Leaders",
        anchor = "community-owner",
        headingLevel = "h2",
        isSubSection = false,
        style = Headline2TextStyle,
        contents = listOf(
            DocumentContent.Paragraph("Circls are managed by volunteer Circl Owners and Leaders, who are members of the KindredCircl community."),
            DocumentContent.Paragraph("Circl Owners and Leaders are responsible for:"),
            DocumentContent.BulletList(
                listOf(
                    BulletItem(
                        body = listOf(
                            DocumentContent.Paragraph("Setting and enforcing Circl-specific guidelines, within the bounds of the KindredCircl Community Guidelines.")
                        )
                    ),
                    BulletItem(
                        body = listOf(
                            DocumentContent.Paragraph("Fostering a positive and respectful environment within their Circl.")
                        )
                    ),
                    BulletItem(
                        body = listOf(
                            DocumentContent.Paragraph("Moderating discussions and content to ensure compliance with KindredCircl Community Guidelines.")
                        )
                    ),
                    BulletItem(
                        body = listOf(
                            DocumentContent.Paragraph("Addressing user concerns and resolving disputes within their Circl.")
                        )
                    ),
                    BulletItem(
                        body = listOf(
                            DocumentContent.Paragraph("Reporting serious violations of the KindredCircl Community Guidelines to KindredCircl moderators.")
                        )
                    ),
                )
            ),
            DocumentContent.Paragraph("Circl Owners and Leaders are granted certain administrative privileges within their Circl, but they are not employees of KindredCircl."),
            DocumentContent.Paragraph("KindredCircl moderators may provide guidance and support to Circl Owners and Leaders, but they do not manage individual Circls."),
            DocumentContent.Paragraph("KindredCircl reserves the right to remove Circl Owners or Leaders who violate the Community Guidelines or abuse their administrative privileges."),
        )
    )