package com.kindredcircl.web.components.sections.privacy

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val cookiePolicy =
    DocumentSection(
        title = "Cookie Policy (and Other Technologies)",
        anchor = slugify("Cookie Policy"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("You can block cookies by setting your internet browser to block some or all cookies. However, if you use your browser settings to block all cookies (including strictly necessary cookies) you may not be able to access all or parts of KindredCircl. You can change your browser settings to block or notify you when you receive a cookie, delete cookies or browse our Sites using your browser’s anonymous usage setting. Please refer to your browser instructions or help screen to learn more about how to adjust or modify your browser settings. If you do not agree to our use of cookies or similar technologies which store information on your device, you should change your browser settings accordingly. Where required by applicable law, you will be asked to consent to certain cookies and similar technologies before we use or install them on your computer or other device."),
            DocumentContent.BulletList(
                listOf(
                    BulletItem(
                        "Strictly Necessary Cookies:",
                        listOf(
                            DocumentContent.Paragraph("Some cookies are strictly necessary to make our KindredCircl Services available to you. We cannot provide you with our KindredCircl Services without this type of cookies."),
                        )
                    ),
                    BulletItem(
                        "Analytical or Performance Cookies:",
                        listOf(
                            DocumentContent.Paragraph("We may also use cookies for website analytics purposes in order to operate, maintain and improve our KindredCircl Services. We may use our own analytics cookies or use third-party analytics providers."),
                        )
                    )
                )
            )
        )
    )