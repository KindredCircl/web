package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.Headline4TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.components.models.NumberedItem
import com.kindredcircl.web.util.slugify

val moderation =
    DocumentSection(
        title = "Moderation",
        anchor = "moderation",
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        children = listOf(
            DocumentSection(
                title = "Enforcement of Guidelines:",
                anchor = slugify("Enforcement of Guidelines"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl moderators, who are company employees, will enforce these guidelines to ensure a safe, inclusive, and positive community environment."),
                    DocumentContent.Paragraph("Moderators will proactively monitor content and respond to user reports.")
                )
            ),
            DocumentSection(
                title = "AI-Assisted Moderation:",
                anchor = slugify("AI-Assisted Moderation"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl employs AI-powered tools to proactively identify potentially violating content. Users can also flag content for review by moderators. AI and user flags trigger a review process by our moderation team."),
                )
            ),
            DocumentSection(
                title = "Content Review Process: ",
                anchor = slugify("Content Review Process"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.NumberedList(
                        listOf(
                            NumberedItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("When content is flagged for review, it will be assessed by our moderation team. Depending on the nature of the alleged violation, the content may be deprioritized (reduced visibility) or removed while the review is pending.")
                                )
                            ),
                            NumberedItem(
                                "Deprioritization:",
                                listOf(
                                    DocumentContent.Paragraph("Content flagged for potential spam, misinformation, or copyright violations will be deprioritized during the review process. This means that its visibility may be reduced but it will remain accessible.")
                                )
                            ),
                            NumberedItem(
                                "Removal:",
                                listOf(
                                    DocumentContent.Paragraph("Content flagged for illegal activity, harassment/bullying, or CSAM will be immediately removed pending review. This ensures the safety of our community")
                                )
                            ),
                            NumberedItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("All user reports will be investigated by a moderator.")
                                )
                            ),

                        )
                    )

                )
            ),
            DocumentSection(
                title = "Impartial and Fair Decisions:",
                anchor = slugify("impartial and fair decisions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Moderators will act impartially and fairly in all decisions, applying the guidelines consistently."),
                    DocumentContent.Paragraph("Moderators will receive comprehensive internal training to ensure they understand and apply the guidelines correctly."),
                    DocumentContent.Paragraph("Moderators will document their decisions and the rationale behind them.")
                )
            ),
            DocumentSection(
                title = "Moderator Training and Confidentiality:",
                anchor = slugify("moderator training and confidentiality"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Moderators will undergo rigorous initial and ongoing training to equip them to handle various moderation scenarios."),
                    DocumentContent.Paragraph("To protect the safety and privacy of our moderation team, specific details of moderator training programs will remain confidential."),
                    DocumentContent.Paragraph("The identities of individual moderators will be protected to prevent harassment and ensure their safety.")
                )
            ),
            DocumentSection(
                title = "Transparency and Accountability:",
                anchor = slugify("Transparency and Accountability"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Moderation actions will be documented, and users will be provided with clear explanations for actions taken on their content or accounts."),
                    DocumentContent.Paragraph("Moderators will be held accountable for their actions through internal review processes.")
                )
            ),
            DocumentSection(
                title = "Community Collaboration:",
                anchor = slugify("Community Collaboration"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl will work with the community to identify and address emerging moderation challenges, while protecting the privacy of the moderation team."),
                    DocumentContent.Paragraph("KindredCircl will provide channels for users to provide feedback on moderation practices, without requiring direct contact with individual moderators.")
                )
            ),
            DocumentSection(
                title = "Escalation Procedures:",
                anchor = slugify("Escalation Procedures"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("There will be clear internal escalation procedures for moderators to follow when dealing with difficult situations."),
                    DocumentContent.Paragraph("A team of senior moderators or administrators will be available for internal support and escalation.")
                )
            ),
            DocumentSection(
                title = "Reporting:",
                anchor = slugify("Reporting"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("If you encounter content that you believe violates these guidelines, please report it to the community moderators."),
                    DocumentContent.Paragraph("Provide clear and specific details about the content and why you believe it is in violation.")
                )
            ),
            DocumentSection(
                title = "False Reports:",
                anchor = slugify("false-reports"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.BulletList(
                        listOf(
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("KindredCircl takes all reports of violations seriously. However, making false reports is a serious offense that can have negative consequences for the reported user and undermine the effectiveness of our reporting system.")
                                )
                            ),
                            BulletItem(
                                "Definition:",
                                listOf(
                                    DocumentContent.Paragraph("KA false report is any report that is deliberately fabricated, misleading, or made without a genuine belief that a violation of the Community Guidelines has occurred.")
                                )
                            ),
                            BulletItem(
                                "Prohibited Conduct:",
                                listOf(
                                    DocumentContent.Paragraph("Users are strictly prohibited from making false reports.")
                                )
                            ),
                            BulletItem(
                                "Consequences:",
                                listOf(
                                    DocumentContent.Paragraph("Making false reports may result in:"),
                                    DocumentContent.BulletList(
                                        listOf(
                                            BulletItem(
                                                "",
                                                listOf(
                                                    DocumentContent.Paragraph("A warning from KindredCircl moderators.")
                                                )
                                            ),
                                            BulletItem(
                                                "",
                                                listOf(
                                                    DocumentContent.Paragraph("Temporary suspension of the user's account.")
                                                )
                                            ),
                                            BulletItem(
                                                "",
                                                listOf(
                                                    DocumentContent.Paragraph("Permanent termination of the user's account.")
                                                )
                                            ),
                                            BulletItem(
                                                "",
                                                listOf(
                                                    DocumentContent.Paragraph("In cases where false reports lead to legal action, KindredCircl may cooperate with law enforcement.")
                                                )
                                            ),
                                        )
                                    )
                                )
                            ),
                            BulletItem(
                                "Reporting False Reports:",
                                listOf(
                                    DocumentContent.Paragraph("If you believe you have been the target of a false report, you may submit a counter-report to [false report email address]. Please provide evidence to support your claim.")
                                )
                            ),
                            BulletItem(
                                "Good Faith Reporting:",
                                listOf(
                                    DocumentContent.Paragraph("We encourage users to report any content or behavior that they genuinely believe violates our Community Guidelines. However, we also expect users to exercise good judgment and avoid making frivolous or malicious reports.")
                                )
                            ),
                        )
                    ),
                )
            ),
            DocumentSection(
                title = "Dispute Resolution:",
                anchor = slugify("Dispute Resolution"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl encourages respectful communication and cooperation among its users. However, we understand that disputes may arise from time to time."),
                ),
                children = listOf(
                    DocumentSection(
                        title = "Types of Disputes:",
                        anchor = slugify("Types of Disputes"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        contents = listOf(
                            DocumentContent.Paragraph("KindredCircl moderators will primarily address disputes related to violations of the Community Guidelines."),
                            DocumentContent.Paragraph("Disputes between users regarding personal matters, business transactions, or other external issues are generally outside the scope of KindredCircl's involvement."),
                            DocumentContent.Paragraph("Disputes that involve legal obligations, and data privacy will be viewed according to the Terms of Service, and Privacy Policy respectively.")
                        )
                    ),
                    DocumentSection(
                        title = "Encouraging Amicable Resolution:",
                        anchor = slugify("Encouraging Amicable Resolution"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        contents = listOf(
                            DocumentContent.Paragraph("We encourage users to attempt to resolve disputes directly and respectfullyo\tWe encourage users to attempt to resolve disputes directly and respectfully."),
                            DocumentContent.Paragraph("If direct communication fails, users may seek assistance from Circl Owners or Leaders, where applicable."),
                        )
                    ),
                    DocumentSection(
                        title = "Moderation Involvement:",
                        anchor = slugify("Moderation Involvement"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        contents = listOf(
                            DocumentContent.Paragraph("KindredCircl moderators may intervene in disputes that involve clear violations of the Community Guidelines."),
                            DocumentContent.Paragraph("Moderators will strive to remain impartial and make decisions based on the available evidence and the guidelines.")
                        )
                    ),
                    DocumentSection(
                        title = "Escalation:",
                        anchor = slugify("Escalation"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        contents = listOf(
                            DocumentContent.Paragraph("If a user is dissatisfied with a moderator's decision, they may follow the appeals process outlined in the \"Appeals Process\" section."),
                            DocumentContent.Paragraph("Circl-specific disputes may be escalated to KindredCircl moderators if they involve serious violations of the Community Guidelines, Terms of Service, or Privacy Policy.."),
                        )
                    ),
                    DocumentSection(
                        title = "Limitations:",
                        anchor = slugify("Limitations"),
                        headingLevel = "h4",
                        style = Headline4TextStyle,
                        contents = listOf(
                            DocumentContent.Paragraph("\tKindredCircl is not a legal or judicial body and cannot provide legal advice or enforce legal agreements."),
                            DocumentContent.Paragraph("\tKindredCircl's involvement in disputes is limited to enforcing the Community Guidelines, Terms of Service, Privacy Policy, and maintaining a safe and respectful environment."),
                            DocumentContent.Paragraph("\tKindredCircl is not responsible for any damages or losses resulting from user disputes."),
                            DocumentContent.Paragraph("\tKindredCircl policies that may pertain to disputes include, but are not limited to, the Terms of Service, Privacy Policy, and DMCA policy.")
                        )
                    ),
                )
            ),
            DocumentSection(
                title = "Appeals Process:",
                anchor = slugify("Appeals Process"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("If your content is removed or flagged for violating these guidelines, you may appeal the decision by contacting the community moderators."),
                    DocumentContent.Paragraph("Provide a clear explanation of why you believe the content is compliant with the guidelines."),
                    DocumentContent.Paragraph("Provide a clear explanation of why you believe the content is compliant with the guidelines."),
                    DocumentContent.LabeledText(
                        "Tier 1 Appeal:", ""
                    ),
                    DocumentContent.BulletList(
                        listOf(
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Initial appeals will be reviewed by the original moderator or a different moderator from the same team.")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Tier 1 appeals will be reviewed and responded to within 48 hours of submission.")
                                )
                            ),
                        )
                    ),
                    DocumentContent.LabeledText(
                        "Tier 2 Appeal:", ""
                    ),
                    DocumentContent.BulletList(
                        listOf(
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("If the Tier 1 appeal is denied, you may request a second-level appeal."),
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("You have 72 hours from the notification of the denial of your Tier 1 appeal to submit your Tier 2 appeal."),
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Tier 2 appeals will be reviewed by a senior moderator or a designated appeals team."),
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Tier 2 appeals will be completed and the results delivered within one week of submission."),
                                )
                            ),
                        )
                    ),
                    DocumentContent.Paragraph("All time limits are calculated in calendar days, including weekends and holidays."),
                    DocumentContent.Paragraph("Users will receive confirmation of receipt for all appeals."),
                    DocumentContent.Paragraph("Users will be notified if there are unexpected delays."),
                    DocumentContent.Paragraph("The decision of the Tier 2 appeal is final.")
                )
            )
        )
    )