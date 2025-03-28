package com.kindredcircl.web.components.sections.betaTest

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.components.forms.betaTestSignupForm
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val applicationSection =
    DocumentSection(
        title = "Apply to be a Beta Tester",
        anchor = slugify("Apply to be a Beta Tester"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        contents = listOf(
            DocumentContent.Component {   betaTestSignupForm() }
        )
    )