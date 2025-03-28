package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import com.kindredcircl.web.ExpandSubListAnim
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.forms.formField
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.name
import org.jetbrains.compose.web.attributes.required
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun betaTestExperienceSection(
    hasTestedBefore: String,
    onHasTestedBeforeChange: (String) -> Unit,
    testingExperience: String,
    onTestingExperienceChange: (String) -> Unit,
    willingToGiveFeedback: Boolean,
    onWillingToGiveFeedbackChange: (Boolean) -> Unit,
) {
    val showExperienceField = hasTestedBefore == "Yes"

    Column(Modifier.fillMaxWidth().padding(topBottom = 2.cssRem)) {
        Legend {
            SpanText(
                "Beta Testing Experience",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }

        // Question 1: Have you tested before?
        Div(
            Modifier
                .display(DisplayStyle.Flex)
                .justifyContent(JustifyContent.SpaceBetween)
                .alignItems(AlignItems.Center)
                .width(100.percent)
                .margin(bottom = 1.cssRem)
                .toAttrs()
        ) {
            Label {
                Text("Have you participated in beta testing before?")
                Sup(Modifier.color(Colors.Red).toAttrs()) { Text("*") }
            }
            Row {
                Label {
                    Input(InputType.Radio, attrs = {
                        name("hasTestedBefore")
                        checked(hasTestedBefore == "Yes")
                        onChange { onHasTestedBeforeChange("Yes") }
                        required()
                    })
                    Text(" Yes")
                }
                Label(attrs = Modifier.margin(left = 1.cssRem).toAttrs()) {
                    Input(InputType.Radio, attrs = {
                        name("hasTestedBefore")
                        checked(hasTestedBefore == "No")
                        onChange { onHasTestedBeforeChange("No") }
                        required()
                    })
                    Text(" No")
                }
            }
        }

        // Expandable optional experience field
        key("experience-${if (showExperienceField) "open" else "closed"}") {
            Div(
                Modifier
                    .gridColumn(1, -1)
                    .animation(
                        ExpandSubListAnim.toAnimation(
                            duration = 500.ms,
                            timingFunction = AnimationTimingFunction.EaseInOut,
                            direction = if (showExperienceField) AnimationDirection.Normal else AnimationDirection.Reverse,
                            fillMode = AnimationFillMode.Forwards
                        )
                    )
                    .overflow(Overflow.Hidden)
                    .toAttrs()
            ) {
                if (showExperienceField) {
                    formField("If yes, please describe your experience (optional)", required = false) {
                        TextArea(attrs = {
                            name("testingExperience")
                            value(testingExperience)
                            onInput { onTestingExperienceChange(it.value) }
                            style { width(100.percent) }
                        })
                    }
                }
            }
        }

        // Question 2: Willingness to provide feedback
        Div(
            Modifier
                .display(DisplayStyle.Flex)
                .justifyContent(JustifyContent.SpaceBetween)
                .alignItems(AlignItems.Center)
                .width(100.percent)
                .margin(top = 2.cssRem)
                .toAttrs()
        ) {
            Label {
                Text("I'm willing to provide regular feedback and participate in the testing community.")
                Sup(Modifier.color(Colors.Red).toAttrs()) { Text("*") }
            }
            Input(InputType.Checkbox, attrs = {
                name("willingToGiveFeedback")
                checked(willingToGiveFeedback)
                onChange { onWillingToGiveFeedbackChange(!willingToGiveFeedback) }
                required()
            })
        }
    }
}
