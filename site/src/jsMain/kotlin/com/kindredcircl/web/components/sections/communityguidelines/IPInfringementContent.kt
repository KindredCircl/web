package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.BulletItem
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val ipInfringementContent: DocumentSection =
    DocumentSection(
        title = "Intellectual Property Infringement:",
        anchor = slugify("Intellectual Property Infringement"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(),
        children = listOf(
            DocumentSection(
                title = "General Principles",
                anchor = slugify("General Principles"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl respects the intellectual property rights of others and expects its users to do the same."),
                    DocumentContent.Paragraph("Users are prohibited from posting or sharing content that infringes on the intellectual property rights of others, including copyrights, trademarks, and patents."),
                    DocumentContent.Paragraph("Intellectual property rights belong to the creator or owner.")
                )
            ),
            DocumentSection(
                title = "Copyright Infringement",
                anchor = slugify("Copyright Infringement"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Copyright infringement occurs when you use copyrighted material without permission from the copyright owner. This includes, but is not limited to, copying, distributing, displaying, or creating derivative works of copyrighted material. This includes images, text, videos, music, and software."),
                    DocumentContent.Paragraph("Users are responsible for obtaining explicit permission from the copyright holder before using any copyrighted material."),
                    DocumentContent.Paragraph("Even when fair use applies, users should always credit the original creator and provide proper attribution."),
                    DocumentContent.Paragraph("Examples of use that are not fair use include but are not limited to, uploading entire movies or music albums."),
                    DocumentContent.Paragraph("For more information, read the (DMCA Policy)(/dmca) or email dmca@kindredcircl.com.")
                )
            ),
            DocumentSection(
                title = "Trademark Infringement",
                anchor = slugify("Trademark"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("Users are prohibited from using trademarks in a way that is likely to cause confusion about the source or affiliation of products or services."),
                    DocumentContent.Paragraph("Business profiles must accurately represent their brands and obtain necessary trademark rights."),
                    DocumentContent.Paragraph("Business profiles must provide accurate and complete information about their company, products, and services. They must not engage in deceptive or misleading practices."),
                    DocumentContent.Paragraph("Business profiles must have the right to use any branding that they use on their profile."),
                    DocumentContent.Paragraph("For more information, read the (DMCA Policy)(/dmca) or email dmca@kindredcircl.com.")
                )
            ),
            DocumentSection(
                title = "Digital Millennium Copyright Act (DMCA)",
                anchor = slugify("dmca"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("KindredCircl complies with the Digital Millennium Copyright Act (DMCA). Our full DMCA policy can be found (here)(/dmca)."),
                    DocumentContent.Paragraph("To report DMCA violations, please email dmca@kindredcircl.com. Alternatively, you can submit reports using the forms available on the KindredCircl website and mobile application"),
                    DocumentContent.Paragraph("Business profiles must provide accurate and complete information about their company, products, and services. They must not engage in deceptive or misleading practices."),
                    DocumentContent.Paragraph("Business profiles must have the right to use any branding that they use on their profile."),
                    DocumentContent.Paragraph("For more information, read the (DMCA Policy)(/dmca) or email dmca@kindredcircl.com.")
                )
            ),
            DocumentSection(
                title = "Reporting Intellectual Property Infringement:",
                anchor = slugify("Reporting Intellectual Property Infringement"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.Paragraph("When reporting any type of intellectual property infringement, please include the following information:"),
                    DocumentContent.BulletList(
                        listOf(
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Your contact information")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("A description of the copyrighted work, trademark, or patent")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("Proof of ownership")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("The location of the infringing material on KindredCircl")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("A statement of good faith belief that the use is not authorized")
                                )
                            ),
                            BulletItem(
                                "",
                                listOf(
                                    DocumentContent.Paragraph("A statement, under penalty of perjury, that the information is accurate ")
                                )
                            ),
                        )
                    ),
                    DocumentContent.Paragraph("KindredCircl will promptly remove or disable access to the infringing material upon receipt of a valid notice."),
                    DocumentContent.Paragraph("Users who believe their content was wrongly removed may submit a counter-notice. KindredCircl reserves the right to terminate the accounts of repeat infringers as outlined in the (DMCA Policy)(/dmca).")
                )
            )
        )
    )
