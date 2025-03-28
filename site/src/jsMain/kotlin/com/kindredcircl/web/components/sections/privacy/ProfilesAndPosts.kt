package com.kindredcircl.web.components.sections.privacy

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val profilesAndPosts =
    DocumentSection(
        title = "Profiles and Posts are Public",
        anchor = slugify("Profiles and Posts are Public"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Paragraph("If you create an account on KindredCircl, any information you add to your public profile and the information you post on the KindredCircl App will be public."),
        )
    )