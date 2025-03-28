package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.*
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.components.widgets.ConsentType
import com.kindredcircl.web.components.widgets.consentModal
import com.varabyte.kobweb.compose.css.AlignItems
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
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.*

@Composable
fun agreementSection(
    agreeToTerms: Boolean,
    onAgreeToTerms: () -> Unit,
    agreeToPrivacy: Boolean,
    onAgreeToPrivacy: () -> Unit
) {
    var showTermsModal by remember { mutableStateOf(false) }
    var showPrivacyModal by remember { mutableStateOf(false) }

    Column(Modifier.fillMaxWidth().padding(topBottom = 2.cssRem)) {
        Legend {
            SpanText(
                "Agreement & Consent",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier.fillMaxWidth().gap(1.cssRem)
        ) {
            // Terms of Service checkbox
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .alignItems(AlignItems.Center)
                    .gap(0.5.cssRem)
                    .toAttrs()
            ) {
                Input(
                    type = InputType.Checkbox,
                    attrs = {
                        checked(agreeToTerms)
                        onChange { showTermsModal = true }
                    }
                )
                Label {
                    Text("I agree to the Terms of Service")
                }
            }

            // Privacy Policy checkbox
            Div(
                Modifier
                    .display(DisplayStyle.Flex)
                    .alignItems(AlignItems.Center)
                    .gap(0.5.cssRem)
                    .toAttrs()
            ) {
                Input(
                    type = InputType.Checkbox,
                    attrs = {
                        checked(agreeToPrivacy)
                        onChange { showPrivacyModal = true }
                    }
                )
                Label {
                    Text("I agree to the Privacy Policy")
                }
            }
        }

        // Terms of Service Modal
        if (showTermsModal) {
            consentModal(
                consentType = ConsentType.TOS,
                onAgree = {
                    onAgreeToTerms()
                    showTermsModal = false
                },
                onDismiss = { showTermsModal = false }
            )
        }

        // Privacy Policy Modal
        if (showPrivacyModal) {
            consentModal(
                consentType = ConsentType.PRIVACY,
                onAgree = {
                    onAgreeToPrivacy()
                    showPrivacyModal = false
                },
                onDismiss = { showPrivacyModal = false }
            )
        }
    }
}
