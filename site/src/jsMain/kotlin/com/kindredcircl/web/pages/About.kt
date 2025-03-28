package com.kindredcircl.web.pages

import androidx.compose.runtime.Composable
import com.kindredcircl.web.*
import com.kindredcircl.web.components.layouts.pageLayout
import com.kindredcircl.web.components.widgets.backToTopButton
import com.kindredcircl.web.components.widgets.joinBeta
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.navigation.open
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.window
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun aboutPage() {

    pageLayout("About") {
        Column(Modifier.fillMaxWidth().id("top")) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .padding(top = 2.cssRem)
            ) {
                Blockquote(
                    Modifier.margin(bottom = 1.cssRem).toAttrs()
                ) {
                    P(
                        BlockquoteStyle.toModifier()
                            .margin(bottom = 0.cssRem)
                            .padding(bottom = 1.cssRem)
                            .toAttrs()
                    ) {
                        Text("\"Belonging starts with self-acceptance. Then, you can belong anywhere.\"")
                    }
                    Footer(
                        BlockquoteFooterStyle.toAttrs()
                    ) {
                        Text("- Carlos Santana")
                    }
                }
                H1(
                    Headline1TextStyle.toModifier()
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("Discover the story behind ")
                    SpanText("KindredCircl", KindredCirclStyle.toModifier())
                }
            }

            Column(Modifier.fillMaxWidth()) {
                H2(Headline2TextStyle.toModifier().toAttrs()) {
                    Text("Our Brand Story")
                }
                P(ParagraphTextStyle.toModifier().toAttrs()) {
                    SpanText(
                        "KindredCircl",
                        KindredCirclStyle.toModifier()
                    )
                    Text(" was born from a desire for something better. In a world where social media has increasingly become a battleground of negativity, intolerance, and hate speech, we believe there's a need for a space where authentic connection and genuine belonging can thrive.")
                }
                P(ParagraphTextStyle.toModifier().toAttrs()) {
                    Text("The initial spark ignited with the growing concern over the direction of online social interaction. Platforms designed to connect people were instead fostering division and amplifying harmful rhetoric. While some platforms attempted to address these issues, the erosion of standards on others further solidified our resolve. Seeing marginalized communities targeted by harmful rhetoric became the final catalyst.")
                }
                P(ParagraphTextStyle.toModifier().toAttrs()) {
                    SpanText("KindredCircl", KindredCirclStyle.toModifier())
                    Text(" is a direct response to this growing void. We're building a vibrant global community founded on the principles of inclusivity, respect, and authentic expression. We believe that social media can be a force for good, a place where individuals can connect with kindred spirits, build meaningful relationships, and find a true sense of belonging.")
                }
                P(ParagraphTextStyle.toModifier().toAttrs()) {
                    Text("Our commitment is unwavering: to empower authentic connections and cultivate a welcoming environment for everyone, regardless of background, identity, or belief. We're building a platform where respect is paramount, where diverse voices are celebrated, and where belonging isn't just a word—it's a lived experience.")
                }
                P(ParagraphTextStyle.toModifier().toAttrs()) {
                    SpanText("KindredCircl", KindredCirclStyle.toModifier())
                    Text(" is more than just a social media platform; it's a movement towards a more compassionate and connected world. We invite you to join us on this journey.")
                }
                H2(Headline2TextStyle.toModifier().toAttrs()) {
                    Text("Brand Essence")
                }
                P(ParagraphTextStyle.toModifier().toAttrs()) {
                    Text("To empower authentic connections and cultivate belonging, so everyone can discover, connect, and belong.")
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .margin(topBottom = 6.cssRem),
                    horizontalArrangement = Arrangement.Center
                ) {
                    joinBeta(
                        onClick = {
                            window.open(href ="/beta", strategy = OpenLinkStrategy.IN_PLACE)
                        }
                    )
                }
            }
        }
        backToTopButton()
    }
}