package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.Composable
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.forms.formField
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
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
fun demographicSection(
    ageInput: String,
    onAgeInputChange: (String) -> Unit,
    parentName: String,
    onParentNameChange: (String) -> Unit,
    parentEmail: String,
    onParentEmailChange: (String) -> Unit,
    city: String,
    onCityChange: (String) -> Unit,
    state: String,
    onStateChange: (String) -> Unit,
    country: String,
    onCountryChange: (String) -> Unit,
    gender: String,
    onGenderChange: (String) -> Unit,
    background: String,
    onBackgroundChange: (String) -> Unit,
) {
    val age = ageInput.toIntOrNull()
    val isUnder18 = age != null && age in 15..<18
    val isUnder15 = age != null && age < 15

    Column(Modifier.fillMaxWidth().padding(topBottom = 0.5.cssRem)) {
        Legend {
            SpanText(
                "Demographic Information",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }

        // Age + Underage logic
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2, lg = 3),
            modifier = Modifier.fillMaxWidth().margin(bottom = 1.cssRem)
                .gap(1.cssRem)
        ) {
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .width(100.percent)
                    .gridColumn(1, -1)
                    .toAttrs()

            ) {
                formField("Age", required = true) {
                    Input(InputType.Number, attrs = {
                        name("age")
                        value(ageInput.ifBlank { "18" })
                        onInput { onAgeInputChange(it.value.toString()) }
                        required()
                        classes("fom-control")
                        style {
                            width(100.percent)
                        }
                    })
                }
                // 🔴 Message if under 15
                CollapsibleSection(visible = isUnder15, modifier = Modifier.gridColumn(1, -1)) {
                    P(Modifier.color(Colors.Red).fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem).toAttrs()) {
                        Text("You must be at least 15 to participate.")
                    }
                }

                // 🔶 Parent/Guardian fields if under 18 (but at least 15)
                CollapsibleSection(visible = isUnder18 && !isUnder15, modifier = Modifier.gridColumn(1, -1)) {
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
                            required()
                            style { width(100.percent) }
                        })
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

            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .width(100.percent)
                    .gridColumn(1, -1)
                    .toAttrs()

            ) {
                formField("Gender (optional)") {
                    Input(InputType.Text, attrs = {
                        name("gender")
                        value(gender)
                        onInput { onGenderChange(it.value) }
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
                    .gridColumn(1, -1)
                    .toAttrs()

            ) {
                formField("Background / Identity (optional)") {
                    TextArea(attrs = {
                        name("background")
                        value(background)
                        onInput { onBackgroundChange(it.value) }
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