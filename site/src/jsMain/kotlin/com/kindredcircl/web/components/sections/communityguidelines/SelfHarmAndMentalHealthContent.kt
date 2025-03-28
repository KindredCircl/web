package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val selfHarmAndMentalHealthContent: DocumentSection =
    DocumentSection(
        title = "Self-Harm and Mental Health Support",
        anchor = slugify("Self-Harm and Mental Health Support"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("At KindredCircl, we care deeply about the mental health and well-being of our community members. We understand that some individuals may struggle with self-harm or suicidal thoughts."),
            DocumentContent.Paragraph("If you or someone you know is experiencing thoughts of self-harm or suicide, please know that you are not alone and help is available. We strongly encourage you to reach out to the following resources:"),
            DocumentContent.LabeledText("National Suicide Prevention Lifeline:", "988"),
            DocumentContent.LabeledText("Crisis Text Line:", "Text HOME to 741741"),
            DocumentContent.LabeledText("The Trevor Project:", "1-866-488-7386 (for LGBTQ youth)"),
            DocumentContent.Paragraph("We understand that sharing personal struggles can be difficult, and we encourage open and supportive conversations within our community. However, to protect the safety of all members, we have the following guidelines:"),
            DocumentContent.BulletList(
                listOf(
                    BulletItem(
                        "",
                        listOf(
                            DocumentContent.Paragraph("Content that glorifies or encourages self-harm or suicide is strictly prohibited and will be removed.")
                        )
                    ),
                    BulletItem(
                        "",
                        listOf(
                            DocumentContent.Paragraph("Live streaming of self-harm or suicide attempts will be immediately interrupted and removed.")
                        )
                    ),
                    BulletItem(
                        "",
                        listOf(
                            DocumentContent.Paragraph("In the event of a live-streamed self-harm or suicide attempt, KindredCircl will make every reasonable effort to:"),
                            DocumentContent.BulletList(
                                listOf(
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Immediately preserve any information that could assist in locating the individual.")
                                        )
                                    ),
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Contact emergency services or mental health crisis teams in the user's suspected location, if possible.")
                                        )
                                    ),
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Provide any available contact information to emergency services to assist them in their efforts.")
                                        )
                                    ),
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("If the user is known to have Kin, KindredCircl will attempt to contact the kin to alert them of the situation.")
                                        )
                                    ),
                                )
                            )
                        )
                    ),
                    BulletItem(
                        "",
                        listOf(
                            DocumentContent.Paragraph("If you encounter content that you believe promotes or encourages self-harm or suicide, or see a live stream of self-harm, please report it immediately to selfharm@kindredcircl.com. Alternatively, you can submit reports using the forms available on the KindredCircl website and mobile application..")
                        )
                    )
                )
            ),
            DocumentContent.Paragraph("We want KindredCircl to be a place of support. If you are struggling, please reach out to the resources above, or talk to someone you trust.")
        ),
        children = listOf()
    )