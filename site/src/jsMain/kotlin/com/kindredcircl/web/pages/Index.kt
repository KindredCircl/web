package com.kindredcircl.web.pages

import androidx.compose.runtime.Composable
import com.kindredcircl.web.*
import com.kindredcircl.web.components.layouts.pageLayout
import com.kindredcircl.web.components.widgets.backToTopButton
import com.kindredcircl.web.components.widgets.joinBeta
import com.kindredcircl.web.util.Res
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.navigation.open
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.window
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


@Page
@Composable
fun homePage() {

    pageLayout("Home") {
        Column(Modifier.fillMaxSize().id("top")) {
            Row(HeroContainerStyle.toModifier()) {
                Column(Modifier.fillMaxWidth()) {
                    // Hero Section
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 0.5.cssRem, bottom = 1.25.cssRem)
                            .textAlign(TextAlign.Center)
                            .alignItems(alignItems = AlignItems.Center)
                    ) {
                        Image(
                            src = Res.Img.LOGO, // Replace with your image path
                            alt = "KindredCircl Logo",
                            modifier = Modifier
                                .width(19.cssRem)
                                .margin(bottom = 1.25.cssRem)
                                .objectFit(ObjectFit.Contain)
                        )

                        H1(
                            Headline1TextStyle.toAttrs()) {
                            Text("Discover, Connect, Belong")
                        }

                        H2(
                            Headline2TextStyle.toModifier()
                                .fontWeight(500)
                                .padding(bottom = 2.cssRem)
                                .toAttrs()) {
                            Text("Join our community and find your circle.")
                        }
                        joinBeta(
                            onClick = {
                                window.open(href ="/beta", strategy = OpenLinkStrategy.IN_PLACE)
                            }
                        )
                    }

                    // Content Section
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 2.cssRem, bottom = 3.cssRem)
                            .alignItems(alignItems = AlignItems.Center)
                            .textAlign(TextAlign.Center)
                    ) {

                        H1(
                            Headline1TextStyle.toAttrs()
                        ) {
                            SpanText(
                                "Welcome to ",
                                modifier = Modifier
                                    .fontFamily("Poppins")
                                    .fontWeight(500)
                            )
                            SpanText(
                                "KindredCircl",
                                KindredCirclStyle.toModifier()
                            )
                        }

                        P(
                            ParagraphTextStyle.toAttrs()
                        ) {
                            Text("We are building a platform to help people discover and connect with like-minded individuals. Our goal is to create a vibrant and supportive community where everyone feels a sense of belonging. Stay tuned for updates as we continue to develop our platform.")
                        }
                    }
                    backToTopButton()
                }

            }
        }
    }
}
