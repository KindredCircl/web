package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.*
import com.kindredcircl.web.ExpandSubListAnim
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.forms.formField
import com.kindredcircl.web.util.isValidEmail
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.name
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.attributes.required
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.dom.*

@Composable
fun demographicSection(
    ageBracket: String,
    onAgeBracketChange: (String) -> Unit,
    parentName: String,
    onParentNameChange: (String) -> Unit,
    parentEmail: String,
    onParentEmailChange: (String) -> Unit,
    gender: String,
    onGenderChange: (String) -> Unit,
    background: String,
    onBackgroundChange: (String) -> Unit,
) {
    val isUnder18 = ageBracket == "15-17"
    var parentEmailTouched by remember { mutableStateOf(false) }

    Column(Modifier.fillMaxWidth().padding(topBottom = 0.5.cssRem)) {
        Legend {
            SpanText(
                "Demographic Information",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }

        // Age + Underage logic
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier.fillMaxWidth().margin(bottom = 1.cssRem)
                .gap(1.cssRem)
        ) {

            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .width(100.percent)
                    .toAttrs()

            ) {
                formField("Age", required = true) {
                    Div {
                        Label {
                            Input(InputType.Radio, attrs = {
                                name("ageBracket")
                                value("15-17")
                                checked(ageBracket == "15-17")
                                onChange { onAgeBracketChange("15-17") }
                                required()
                            })
                            Text(" 15–17")
                        }

                        Br()

                        Label {
                            Input(InputType.Radio, attrs = {
                                name("ageBracket")
                                value("18+")
                                checked(ageBracket == "18+")
                                onChange { onAgeBracketChange("18+") }
                                required()
                            })
                            Text(" 18+")
                        }
                    }
                }
            }

            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .width(100.percent)
                    .toAttrs()
            ) {
                formField("Please select the gender identity that best describes you:") {

                    val genderOptions = listOf(
                        "Cisgender Male",
                        "Cisgender Female",
                        "Transgender Male",
                        "Transgender Female",
                        "Non-binary",
                        "Genderfluid",
                        "Genderqueer",
                        "Prefer to self-describe",
                        "Prefer not to say"
                    )

                    genderOptions.forEach { option ->
                        Row(
                            Modifier
                                .alignItems(AlignItems.Center)
                                .margin(bottom = 0.5.cssRem)
                                .gap(0.5.cssRem)
                        ) {
                            Input(InputType.Radio, attrs = {
                                name("gender")
                                value(option)
                                checked(
                                    gender == option ||
                                            (gender.startsWith("Self-describe: ") && option == "Prefer to self-describe")
                                )
                                onChange {
                                    if (option == "Prefer to self-describe") {
                                        onGenderChange("Self-describe: ")
                                    } else {
                                        onGenderChange(option)
                                    }
                                }
                            })

                            Text(option)

                            // 🟦 Place input inline with the label
                            if (option == "Prefer to self-describe" && gender.startsWith("Self-describe: ")) {
                                Input(InputType.Text, attrs = {
                                    placeholder("Your description")
                                    value(gender.removePrefix("Self-describe: "))
                                    onInput {
                                        onGenderChange("Self-describe: ${it.value}")
                                    }
                                    name("genderCustom")
                                    style {
                                        marginLeft(1.cssRem)
                                        width(20.cssRem)
                                    }
                                })
                            }
                        }
                    }
                }
            }


            key("parent-${if (isUnder18) "open" else "closed"}") {
                Div(
                    Modifier
                        .gridColumn(1, -1)
                        .animation(
                            ExpandSubListAnim.toAnimation(
                                duration = 500.ms,
                                timingFunction = AnimationTimingFunction.EaseInOut,
                                direction = if (isUnder18) AnimationDirection.Normal else AnimationDirection.Reverse,
                                fillMode = AnimationFillMode.Forwards
                            )
                        )
                        .overflow(Overflow.Hidden)
                        .toAttrs()
                ) {
                    if (isUnder18) {
                        formField("Parent/Guardian Name", required = true) {
                            Input(InputType.Text, attrs = {
                                name("parentName")
                                value(parentName)
                                onInput { onParentNameChange(it.value) }
                                required()
                                style { width(100.percent) }
                            })
                        }

                        formField("Parent/Guardian Email", required = true) {
                            Input(InputType.Email, attrs = {
                                name("parentEmail")
                                value(parentEmail)
                                onInput { onParentEmailChange(it.value) }
                                onBlur { parentEmailTouched = true }
                                required()
                                style { width(100.percent) }
                            })

                            if (parentEmailTouched && !isValidEmail(parentEmail)) {
                                P(Modifier.color(Colors.Red).fontSize(0.9.cssRem).margin(top = 0.25.cssRem).toAttrs()) {
                                    Text("Please enter a valid email address.")
                                }
                            }
                        }                    }
                }
            }

            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .gridColumn(1, -1)
                    .width(100.percent)
                    .toAttrs()

            ) {
                formField("Background/Identity (Optional)") {
                    Box(
                    Modifier
                        .position(Position.Relative)
                        .width(100.percent)
                        .height(12.cssRem)
                    ) {
                    // Fake Placeholder
                        if (background.isBlank()) {
                            SpanText(
                                "We are committed to building a diverse and inclusive community on KindredCircl. " +
                                        "Sharing information about your background and identity can help us ensure our beta testing group " +
                                        "reflects the wide range of perspectives within our potential user base. Please share any aspects of your background " +
                                        "or identity that you feel are relevant to your experience with KindredCircl. All information provided will be kept confidential.",
                                Modifier
                                    .position(Position.Absolute)
                                    .top(0.px)
                                    .left(0.px)
                                    .padding(0.5.cssRem)
                                    .color(Colors.Gray)
                                    .fontStyle(FontStyle.Italic)
                                    .fontSize(FontSize.Small)
                                    .pointerEvents(PointerEvents.None) // Makes it non-selectable and lets click go to TextArea
                            )
                        }

                    // Real TextArea
                        TextArea(
                            attrs = {
                                name("background")
                                value(background)
                                onInput { onBackgroundChange(it.value) }
                                classes("form-control")
                                style {
                                    width(100.percent)
                                    height(100.percent)
                                    resize(Resize.None)
                                    padding(0.5.cssRem)
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}