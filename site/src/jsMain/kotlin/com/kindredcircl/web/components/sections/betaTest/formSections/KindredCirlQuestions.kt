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
import org.jetbrains.compose.web.attributes.required
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.*

@Composable
fun kindredCirclSection(
    interestsText: String,
    onInterestsTextChange: (String) -> Unit,
    selectedCategories: Set<String>,
    onCategoryChange: (Set<String>) -> Unit,
    passionateAboutJustice: Boolean,
    onJusticeChange: (Boolean) -> Unit
) {
    val categories = listOf(
        "Culinary Arts",
        "Creative Pursuits",
        "Exploration & Culture",
        "Health & Wellness",
        "Learning & Growth",
        "Nature & Outdoors",
        "Parenting",
        "Relationships",
        "Social Impact",
        "Spirituality & Mindfulness",
        "Technology & Innovation"
    ).sorted()

    Column(Modifier.fillMaxWidth()) {
        Legend(
            attrs = Modifier.margin(topBottom = 0.5.cssRem).width(100.percent).toAttrs()
        ) {
            SpanText(
                "KindredCircl-Specific Questions",
                ParagraphTextStyle.toModifier().fontWeight(FontWeight.Bold).margin(bottom = 1.cssRem)
            )
        }

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2, lg = 3),
            modifier = Modifier.fillMaxWidth().gap(1.cssRem)
        ) {
            // Full-width: "What interests you most" text area
            Div(Modifier.gridColumn(1, -1).toAttrs()) {
                formField("What interests you most about KindredCircl?", required = true) {
                    TextArea(attrs = {
                        name("kindredInterests")
                        value(interestsText)
                        onInput { onInterestsTextChange(it.value) }
                        required()
                        style { width(100.percent) }
                    })
                }
            }

            // Full-width: Interest category checkbox list
            Div(Modifier.gridColumn(1, -1).toAttrs()) {
                formField("Which interest categories are you most passionate about?", required = true) {
                    categories.forEach { category ->
                        val checkboxId = "cat-${category.lowercase().replace(" ", "-")}"
                        val isChecked = selectedCategories.contains(category)

                        Div(Modifier.margin(bottom = 0.25.cssRem).toAttrs()) {
                            Input(InputType.Checkbox, attrs = {
                                id(checkboxId)
                                name("interestCategories[]")
                                value(category)
                                checked(isChecked)
                                onChange {
                                    val updated = if (isChecked)
                                        selectedCategories - category
                                    else
                                        selectedCategories + category
                                    onCategoryChange(updated)
                                }
                            })
                            Label(forId = checkboxId) {
                                Text(" $category")
                            }
                        }
                    }
                }
            }

            // Optional social justice alignment checkbox
            Div(Modifier.gridColumn(1, -1).toAttrs()) {
                Input(InputType.Checkbox, attrs = {
                    id("justicePassion")
                    name("socialJusticePassion")
                    checked(passionateAboutJustice)
                    onChange { onJusticeChange(!passionateAboutJustice) }
                })
                Label(forId = "justicePassion") {
                    Text(" I’m passionate about social justice (e.g., human rights, women’s rights, LGBTQ+ rights)")
                }
            }
        }
    }
}
