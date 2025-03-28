package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.Composable
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.forms.requiredLabel
import com.varabyte.kobweb.compose.ui.Modifier
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
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Legend

@Composable
fun contactInfoSection(
    firstName: String,
    onFirstNameChange: (String) -> Unit,
    lastName: String,
    onLastNameChange: (String) -> Unit,
    email: String,
    onEmailChange: (String) -> Unit,
) {
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
                requiredLabel(forId = "email","Email Address")
                Input(InputType.Email, attrs = {
                    id("email")
                    name("email")
                    value(email)
                    onInput { onEmailChange(it.value) }
                    onBlur { }
                    required()
                    style {
                        width(100.percent)
                    }
                })
            }
        }
    }
}