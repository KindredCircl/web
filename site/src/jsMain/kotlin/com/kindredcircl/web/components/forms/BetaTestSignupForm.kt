package com.kindredcircl.web.components.forms

import androidx.compose.runtime.*
import com.kindredcircl.web.ButtonStyle
import com.kindredcircl.web.components.sections.betaTest.formSections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.disabled
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.ButtonType
import org.jetbrains.compose.web.attributes.FormMethod
import org.jetbrains.compose.web.attributes.method
import org.jetbrains.compose.web.attributes.type
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Form
import org.jetbrains.compose.web.dom.Text

@Composable
fun betaTestSignupForm() {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var parentName by remember { mutableStateOf("") }
    var parentEmail by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var state by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var background by remember { mutableStateOf("") }
    var agreeToTerms by remember { mutableStateOf(false) }
    var agreeToPrivacy by remember { mutableStateOf(false) }
    var showTermsModal by remember { mutableStateOf(false) }
    var showPrivacyModal by remember { mutableStateOf(false) }
    var selectedPlatforms by remember { mutableStateOf(setOf<String>()) }
    var otherPlatform by remember { mutableStateOf("") }
    var reason by remember { mutableStateOf("") }
    var selectedFrequency by remember { mutableStateOf("") }
    var interestsText by remember { mutableStateOf("") }
    var selectedCategories by remember { mutableStateOf(setOf<String>()) }
    var passionateAboutJustice by remember { mutableStateOf(false) }
    var hasTestedBefore by remember { mutableStateOf("") }
    var testingExperience by remember { mutableStateOf("") }
    var willingToGiveFeedback by remember { mutableStateOf(false) }
    var selectedDevices by remember { mutableStateOf(setOf<String>()) }
    var selectedOS by remember { mutableStateOf(setOf<String>()) }

    val isUnder18 = age.toIntOrNull()?.let { it < 18 } ?: false
    val isFormValid = firstName.isNotBlank() && lastName.isNotBlank() &&
            age.isNotBlank() && (!isUnder18 || (parentName.isNotBlank() && parentEmail.isNotBlank())) &&
            agreeToTerms && agreeToPrivacy

    Form(
        action = "https://formspree.io/f/mzzeabwn",
        attrs = {
            style {
                width(100.percent)
            }
            method(FormMethod.Post)
        }
    ) {
        Column(
            modifier = Modifier.gap(1.cssRem).fillMaxWidth()
        ) {

            contactInfoSection(firstName, { firstName = it }, lastName, { lastName = it }, email, { email = it })
            demographicSection(
                age, { age = it },
                parentName, { parentName = it },
                parentEmail, { parentEmail = it },
                city, { city = it },
                state, { state = it },
                country, { country = it },
                gender, { gender = it },
                background, { background = it }
            )
            socialMediaSection(
                selectedPlatforms, { selectedPlatforms = it },
                otherPlatform, { otherPlatform = it },
                reason, { reason = it },
                selectedFrequency, { selectedFrequency = it }
            )
            kindredCirclSection(
                interestsText, { interestsText = it },
                selectedCategories, { selectedCategories = it },
                passionateAboutJustice, { passionateAboutJustice = it }
            )
            betaTestExperienceSection(
                hasTestedBefore, { hasTestedBefore = it },
                testingExperience, { testingExperience = it },
                willingToGiveFeedback, { willingToGiveFeedback = it }
            )
            technicalInfoSection(selectedDevices, { selectedDevices = it }, selectedOS, { selectedOS = it })

            agreementSection(agreeToTerms, { showTermsModal = true }, agreeToPrivacy, { showPrivacyModal = true })

            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 1.cssRem),
                horizontalArrangement = Arrangement.Center
            ){
                Button(
                    ButtonStyle.toModifier()
                        .disabled(!isFormValid)
                        .toAttrs {
                            type(ButtonType.Submit)
                        }
                ) {
                    Text("Submit")
                }
            }
        }
    }
}
