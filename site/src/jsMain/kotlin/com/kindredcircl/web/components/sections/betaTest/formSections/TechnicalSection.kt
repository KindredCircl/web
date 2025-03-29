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
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.*

@Composable
fun technicalInfoSection(
    selectedDevices: Set<String>,
    onDevicesChange: (Set<String>) -> Unit,
    selectedOS: Set<String>,
    onOSChange: (Set<String>) -> Unit,
) {
    val allDevices = listOf("Smartphone", "Tablet", "Computer")
    val allOS = listOf("iOS", "Android", "Windows", "macOS", "Linux", "Other")

    Column(Modifier.fillMaxWidth().padding(topBottom = 2.cssRem)) {
        Legend {
            SpanText(
                "Technical Information",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier.fillMaxWidth().gap(1.cssRem)
        ) {
            // Devices Checkbox Group
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .margin(bottom = 1.cssRem)
                    .width(100.percent)
                    .toAttrs()
            ) {
                formField("What type of device(s) do you use?", required = true) {
                    Column {
                        allDevices.forEach { device ->
                            Label(attrs = Modifier.display(DisplayStyle.Block).toAttrs()) {
                                Input(InputType.Checkbox, attrs = {
                                    checked(device in selectedDevices)
                                    onChange {
                                        val newSelection = if (device in selectedDevices) {
                                            selectedDevices - device
                                        } else {
                                            selectedDevices + device
                                        }
                                        onDevicesChange(newSelection)
                                    }
                                })
                                Text(" $device")
                            }
                        }
                    }
                }
            }

            // Operating Systems Checkbox Group
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .flexDirection(FlexDirection.Column)
                    .margin(bottom = 1.cssRem)
                    .width(100.percent)
                    .toAttrs()
            ) {
                formField("Operating System(s):", required = true) {
                    Column {
                        allOS.forEach { os ->
                            Label(attrs = Modifier.display(DisplayStyle.Block).toAttrs()) {
                                Input(InputType.Checkbox, attrs = {
                                    checked(os in selectedOS)
                                    onChange {
                                        val newSelection = if (os in selectedOS) {
                                            selectedOS - os
                                        } else {
                                            selectedOS + os
                                        }
                                        onOSChange(newSelection)
                                    }
                                })
                                Text(" $os")
                            }
                        }
                    }
                }
            }
        }
    }
}
