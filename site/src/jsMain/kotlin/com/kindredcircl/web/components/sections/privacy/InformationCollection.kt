package com.kindredcircl.web.components.sections.privacy

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val informationCollection =
    DocumentSection(
        title = "Information We Collect",
        anchor = slugify("Information We Collect"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("We collect the minimum necessary personal information to provide our services, including:"),
            DocumentContent.BulletList(
                listOf(
                    BulletItem(
                        "Account Information:",
                        listOf(
                            DocumentContent.Paragraph("Name, email address, phone number, date of birth."),
                        )
                    ),
                    BulletItem(
                        "Profile Information:",
                        listOf(
                            DocumentContent.Paragraph("Profile details, content uploads, location."),
                        )
                    ),
                    BulletItem(
                        "Usage Date:",
                        listOf(
                            DocumentContent.Paragraph("Information about how you use our platform, including interactions and activities."),
                        )
                    ),
                    BulletItem(
                        "Payment Information:",
                        listOf(
                            DocumentContent.Paragraph("When you make a membership payment, a third-party payment processor (e.g., PayPal, Stripe) will collect and process your payment information. We do not directly store your payment card details."),
                        )
                    ),
                    BulletItem(
                        "Cookies and Other Technologies:",
                        listOf(
                            DocumentContent.Paragraph("We and third parties that provide content or other functionality on KindredCircl may use cookies, pixel tags, and other technologies to automatically collect information when you use our services."),
                        )
                    ),
                )
            )
        )
    )
