package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val nsfwcontent: DocumentSection =
    DocumentSection(
        title = "NSFW (Not Safe For Work) Content:",
        anchor = slugify("NSFW (Not Safe For Work) Content)"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("Refer to the Definitions section for the definition of NSFW")
        ),
        children = listOf(
            DocumentSection(
                title = "General Guidelines:",
                anchor = slugify("General Guidelines"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Content that is gratuitously violent, or exploits, abuses, or endangers children is strictly prohibited."),
                    DocumentContent.Paragraph("Content that promotes illegal sexual acts, such as rape, bestiality, or child sexual abuse, is strictly prohibited.")
                )
            ),
            DocumentSection(
                title = "Acceptable Nudity:",
                anchor = slugify("acceptable nudity"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Nudity that is artistic, educational, or related to personal expression (e.g., body positivity, nudist communities) is permitted, provided it complies with other community guidelines and is marked NSFW."),
                    DocumentContent.Paragraph("Context is important. Nudity that is presented in a sexual or exploitative manner will be removed.")
                )
            ),
            DocumentSection(
                title = "Sexual Discussions:",
                anchor = slugify("Sexual Discussions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Open and respectful discussions about sexuality, including topics such as puberty, sexual health, and relationships, are permitted."),
                    DocumentContent.Paragraph("Adult-only Circls marked as NSFW may engage in more explicit discussions and share certain forms of legal pornography, provided they adhere to the following:"),
                    DocumentContent.BulletList(listOf(
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("Content must be legal and not promote illegal acts."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(DocumentContent.Paragraph("Content must be consensual and not depict non-consensual acts."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("The Circl's purpose must be clearly stated, and membership must be restricted to adults."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("Users attempting to join NSFW Circls will be required to verify their age through a reputable third-party age verification service. This process ensures that only adults can access explicit content."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("NSFW Circls may include depictions of consensual nudity and sexual activity, provided they do not depict illegal or non-consensual acts, exploitation, or abuse. Content that promotes violence, hate speech, or illegal activities is strictly prohibited, even within NSFW Circls."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("Circl Owners and Leaders of these Circls are responsible for ensuring that all content complies with these guidelines and for promptly addressing any violations. Failure to do so may result in the removal of moderator privileges or the closure of the Circl."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("To report violations within an NSFW Circl, please use the standard reporting mechanisms or contact the Circl Owner or Leader directly. All reports will be handled confidentially."),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("The context and intent of any content will be carefully considered. Nudity or sexual content that is presented in an exploitative, degrading, or non-consensual manner will be removed, regardless of the Circl's designation"),
                            )
                        ),
                        BulletItem(
                            "",
                            listOf(
                                DocumentContent.Paragraph("Links to external websites containing NSFW content are permitted within NSFW Circls, provided the content complies with these guidelines. However, linking to illegal or harmful content is strictly prohibited."),
                            )
                        ),
                    ))
                )
            )
        )
    )
