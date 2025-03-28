package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.Headline4TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val accessibilityContent: DocumentSection =
    DocumentSection(
        title = "Accessibility Tools and Features",
        anchor = slugify("Accessibility Tools"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("KindredCircl is committed to providing an inclusive experience for all users. We recognize that individuals with disabilities may utilize various accessibility tools and features to interact with our platform.")
        ),
        children = listOf(
            DocumentSection(
                title = "General Accessibility Features:",
                anchor = slugify("General Accessibility Features"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(),
                children = listOf(
                    DocumentSection(
                        title = "Web",
                        anchor = slugify("Web"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        isSubSection = true,
                        contents = listOf(
                            DocumentContent.BulletList(
                                listOf(
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Websites should adhere to the Web Content Accessibility Guidelines (WCAG) to ensure accessibility.")
                                        )
                                    )
                                )
                            ),
                            DocumentContent.BulletList(
                                listOf(
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Common web accessibility features include:"),
                                            DocumentContent.BulletList(
                                                listOf(
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Screen reader compatibility (e.g., JAWS, NVDA)")

                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Keyboard navigation")

                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Text alternatives for images (alt text)")

                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Sufficient color contrast")

                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Resizable text")

                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Semantic HTML structure")

                                                        )
                                                    ),
                                                )
                                            )
                                        )
                                    )
                                )
                            ),
                            DocumentContent.BulletList(
                                listOf(
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Users can utilize browser extensions and accessibility tools to further customize their web experience.")
                                        )
                                    )
                                )
                            )
                        )
                    ),
                    DocumentSection(
                        title = "Mobile (Android and iOS)",
                        anchor = slugify("Mobile"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        isSubSection = true,
                        contents = listOf(
                            DocumentContent.BulletList(
                                listOf(
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("Both Android and iOS operating systems offer a wide range of built-in accessibility tools, including:"),
                                            DocumentContent.BulletList(
                                                listOf(
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Screen readers (e.g., VoiceOver on iOS, TalkBack on Android)")
                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Magnification and zoom features")
                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Adjustable font sizes and contrast settings")
                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Closed captioning and subtitles for videos")
                                                        )
                                                    ),
                                                    BulletItem(
                                                        "",
                                                        listOf(
                                                            DocumentContent.Paragraph("Voice control and dictation")
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    ),
                                    BulletItem(
                                        "",
                                        listOf(
                                            DocumentContent.Paragraph("We encourage users to explore the accessibility settings on their devices to customize their experience.")
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            ),
            DocumentSection(
                title = "KindredCircl's Commitment to Accessibility",
                anchor = slugify("kindredcircl commitment"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("We are continually working to improve the accessibility of our platform and to ensure compatibility with commonly used accessibility tools. We strive to adhere to accessibility guidelines and best practices in our design and development processes. We are working to ensure that all images will have alt text.")
                )
            ),
            DocumentSection(
                title = "User Feedback",
                anchor = slugify("User Feedback"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("We welcome feedback from users regarding accessibility issues or suggestions for improvement. Please contact us at accessibility@kindredcircl.com to report any accessibility challenges or to provide feedback. We will provide instructions on how to access the accessibility features of KindredCircl within the application help section")
                )
            )
        )
    )
