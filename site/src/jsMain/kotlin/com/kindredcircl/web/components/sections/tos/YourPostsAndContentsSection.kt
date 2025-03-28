package com.kindredcircl.web.components.sections.tos

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val yourPostsAndContentsSection =
    DocumentSection(
        title = "Your Posts and Contents",
        anchor = slugify("Your Posts and Contents"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("You own your content. By posting it, you allow us to show it, share it, and use it to improve KindredCircl. You can delete your content at any time.")
        )
    )