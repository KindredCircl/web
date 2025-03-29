package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.*
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.forms.formField
import com.kindredcircl.web.components.forms.requiredLabel
import com.kindredcircl.web.util.isValidEmail
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.name
import org.jetbrains.compose.web.attributes.required
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun contactInfoSection(
    firstName: String,
    onFirstNameChange: (String) -> Unit,
    lastName: String,
    onLastNameChange: (String) -> Unit,
    email: String,
    onEmailChange: (String) -> Unit,
    city: String,
    onCityChange: (String) -> Unit,
    state: String,
    onStateChange: (String) -> Unit,
    country: String,
    onCountryChange: (String) -> Unit,
) {
    var emailTouched by remember { mutableStateOf(false) }

    Div(Modifier.margin(top = 1.cssRem).width(100.percent).toAttrs()) {
        Legend {
            SpanText(
                "Contact Information",
                ParagraphTextStyle.toModifier().fontFamily("Inter").fontWeight(700)
            )
        }
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2, lg = 3),
            modifier = Modifier
                .fillMaxWidth()
                .gap(1.cssRem)
                .alignItems(AlignItems("center"))
                .padding(topBottom = 0.5.cssRem)
        ) {
            // First Name
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .margin(bottom = 1.cssRem)
                    .width(100.percent)
                    .toAttrs()
            ) {
                requiredLabel(forId = "firstName", text = "First Name")
                Input(InputType.Text, attrs = {
                    id("firstName")
                    name("firstName")
                    value(firstName)
                    onInput { onFirstNameChange(it.value) }
                    onBlur { } // optional inline validation
                    required()
                    classes("fom-control")
                    style {
                        width(100.percent)
                    }
                })
            }

            // Last Name
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .margin(bottom = 1.cssRem)
                    .width(100.percent)
                    .toAttrs()
            ) {
                requiredLabel(forId = "lastName","Last Name")
                Input(InputType.Text, attrs = {
                    id("lastName")
                    name("lastName")
                    value(lastName)
                    onInput { onLastNameChange(it.value) }
                    onBlur { }
                    required()
                    style {
                        width(100.percent)
                    }
                })
            }

            // Email
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .margin(bottom = 1.cssRem)
                    .width(100.percent)
                    .toAttrs()
            ) {
                requiredLabel(forId = "email", "Email Address")

                Input(InputType.Email, attrs = {
                    id("email")
                    name("email")
                    value(email)
                    onInput { onEmailChange(it.value) }
                    onBlur { emailTouched = true } // Mark the field as touched on blur
                    required()
                    style {
                        width(100.percent)
                    }
                })

                if (emailTouched && !isValidEmail(email)) {
                    P(Modifier.color(Colors.Red).fontSize(0.9.cssRem).margin(top = 0.25.cssRem).toAttrs()) {
                        Text("Please enter a valid email address.")
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

                formField("City") {
                    Input(InputType.Text, attrs = {
                        name("city")
                        value(city)
                        onInput { onCityChange(it.value) }
                        classes("fom-control")
                        style {
                            width(100.percent)
                        }
                    })
                }
            }

            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .width(100.percent)
                    .toAttrs()
            ) {
                formField("State/Province") {
                    Input(InputType.Text, attrs = {
                        name("state")
                        value(state)
                        onInput { onStateChange(it.value) }
                        classes("fom-control")
                        style {
                            width(100.percent)
                        }
                    })
                }
            }

            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .width(100.percent)
                    .toAttrs()
            ) {
                formField("Country") {
                    Input(InputType.Text, attrs = {
                        name("country")
                        value(country)
                        onInput { onCountryChange(it.value) }
                        classes("fom-control")
                        style {
                            width(100.percent)
                        }
                    })
                }
            }

        }
    }
}