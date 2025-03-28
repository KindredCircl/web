package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.Composable
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.forms.formField
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.name
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.attributes.required
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.*

@Composable
fun socialMediaSection(
    selectedPlatforms: Set<String>,
    onSelectedPlatformsChange: (Set<String>) -> Unit,
    otherPlatform: String,
    onOtherPlatformChange: (String) -> Unit,
    reason: String,
    onReasonChange: (String) -> Unit,
    selectedFrequency: String,
    onFrequencyChange: (String) -> Unit
) {
    val sortedPlatforms = listOf(
        "Bluesky", "Discord", "Facebook", "Instagram", "LinkedIn",
        "Reddit", "Snapchat", "Tiktok", "X"
    ).sorted() + "Other"

    val frequencies = listOf("Multiple times a day", "Once a day", "A few times a week", "Rarely", "Never")

    Column(Modifier.fillMaxWidth()) {
        Legend(
            attrs = Modifier.margin(topBottom = 0.5.cssRem).width(100.percent).toAttrs()
        ) {
            SpanText(
                "Social Media Usage",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2/*, lg = 3*/),
            modifier = Modifier.fillMaxWidth().gap(1.cssRem)
        ) {
            // Checkbox Group
            Div(Modifier./*gridColumn(1, -1)*/fillMaxWidth().toAttrs()) {
                formField("Which social media platforms do you use?") {
                    sortedPlatforms.forEach { platform ->
                        val checkboxId = "platform-${platform.lowercase()}"
                        val isChecked = selectedPlatforms.contains(platform)

                        Div(Modifier.margin(bottom = 0.25.cssRem).toAttrs()) {
                            Input(InputType.Checkbox, attrs = {
                                id(checkboxId)
                                name("socialPlatforms[]")
                                value(platform)
                                checked(isChecked)
                                onChange {
                                    val newSelection = if (isChecked) selectedPlatforms - platform else selectedPlatforms + platform
                                    onSelectedPlatformsChange(newSelection)
                                }
                            })
                            Label(forId = checkboxId) {
                                Text(" $platform")
                            }

                        }

                        // Conditional Text input for "Other"
                        if (platform == "Other" && isChecked) {
                            Input(InputType.Text, attrs = {
                                name("socialOther")
                                placeholder("Please specify")
                                value(otherPlatform)
                                onInput { onOtherPlatformChange(it.value) }
                                style { marginTop(0.5.cssRem) }
                            })
                        }
                    }
                }
            }

            // Radio Group: Frequency
            Div(Modifier.fillMaxWidth().toAttrs()) {
                formField("How often do you use social media?", required = true) {
                    frequencies.forEachIndexed { index, freq ->
                        val radioId = "freq-$index"
                        Div(Modifier.margin(bottom = 0.25.cssRem).toAttrs()) {
                            Input(InputType.Radio, attrs = {
                                id(radioId)
                                name("socialMediaFrequency")
                                value(freq)
                                checked(freq == selectedFrequency)
                                onChange { onFrequencyChange(freq) }
                                required()
                            })
                            Label(forId = radioId) {
                                Text(" $freq")
                            }
                        }
                    }
                }
            }

            // Textarea: Reason for using social media
            Div(Modifier.gridColumn(1, -1).toAttrs()) {
                formField("What is your primary reason for using social media?", required = true) {
                    TextArea(attrs = {
                        name("socialMediaReason")
                        value(reason)
                        onInput { onReasonChange(it.value) }
                        required()
                        style { width(100.percent) }
                    })
                }
            }
        }
    }
}
