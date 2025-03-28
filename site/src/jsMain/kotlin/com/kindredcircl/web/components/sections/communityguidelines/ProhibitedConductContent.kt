package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify


val prohibitedConductContent: DocumentSection =

    DocumentSection(
        title = "Prohibited Content and Behaviors",
        anchor = slugify("Prohibited Content and Behaviors"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(),
        children = listOf(
            DocumentSection(
                title = "Child Sexual Abuse Material (CSAM)",
                anchor = slugify("CSAM"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("The creation, distribution, or possession of Child Sexual Abuse Material (CSAM) is strictly prohibited and will result in immediate account termination and reporting to law enforcement."),
                    DocumentContent.Paragraph("This prohibition applies to all forms of CSAM, including but not limited to:"),
                    DocumentContent.BulletList(listOf(
                        BulletItem(body = listOf(DocumentContent.Paragraph("Real or photographic CSAM."))),
                        BulletItem(body = listOf(DocumentContent.Paragraph("Computer-generated or digitally manipulated CSAM."))),
                        BulletItem(body = listOf(DocumentContent.Paragraph("Drawn, painted, or otherwise artistically rendered CSAM."))),
                    ))
                )
            ),
            DocumentSection(
                title = "Hate Speech",
                anchor = slugify("Hate Speech"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl does not tolerate hate speech. Do not post content that attacks or demeans people based on race, ethnicity, nationality, religion, gender, gender identity, sexual orientation, disability, or other protected characteristics.")
                )
            ),
            DocumentSection(
                title = "Harassment and Bullying",
                anchor = slugify("Harassment"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Harassment, intimidation, or bullying of any kind is prohibited. This includes targeted insults, threats, or attempts to silence others.")
                )
            ),
            DocumentSection(
                title = "Violence and Threats",
                anchor = slugify("Violence"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Content that glorifies violence, incites violence against individuals or groups, promotes self-harm (including live streaming of self-harm), or threatens harm to animals or property destruction is strictly prohibited.")
                )
            ),
            DocumentSection(
                title = "Illegal Activities",
                anchor = slugify("Illegal Activities"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Any content or activity that promotes or facilitates illegal activities, such as drug trafficking, fraud, identity theft, or provides instruction on how to undertake such activities, is prohibited.")
                )
            ),
            DocumentSection(
                title = "Spam and Misinformation",
                anchor = slugify("Spam and Misinformation"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("We prohibit content that promotes or glorifies dangerous behavior, self-harm, illegal activity, or the use of weapons to threaten or harm others.")
                )
            ),
            DocumentSection(
                title = "Impersonation and Misrepresentation",
                anchor = slugify("Impersonation and Misrepresentation"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Malicious impersonation of another person, creating fake accounts with harmful intent, fraudulent misrepresentation of your identity, falsely claiming association with an organization to deceive others, or misrepresenting your professional qualifications for fraudulent purposes is prohibited."),
                    DocumentContent.Paragraph("This guideline does not prohibit individuals from expressing their gender identity, engaging in artistic performances (such as drag), or using pseudonyms, provided such actions are not intended to deceive, defraud, or harm others.")
                )
            ),
            DocumentSection(
                title = "Harassment and Bullying",
                anchor = slugify("Harassment"),
                headingLevel = "prohibited",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Harassment, intimidation, or bullying of any kind is prohibited. This includes targeted insults, threats, or attempts to silence others.")
                )
            )
        )
    )
