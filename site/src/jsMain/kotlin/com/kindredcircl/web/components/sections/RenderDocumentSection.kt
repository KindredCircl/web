package com.kindredcircl.web.components.sections

import androidx.compose.runtime.Composable
import com.kindredcircl.web.BulletListStyle
import com.kindredcircl.web.ParagraphTextStyle
import com.kindredcircl.web.PositiveHeadlinesStyle
import com.kindredcircl.web.ProhibitedHeadlinesStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.styledTextWithKindredCirclHighlight
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.*

@Composable
fun renderDocumentSection(section: DocumentSection, headingLevel: String) {
    val tag: @Composable (String) -> Unit = when (headingLevel) {
        "h2" -> { text ->
            H2(section.style.toModifier().id(section.anchor).toAttrs()) {
                styledTextWithKindredCirclHighlight(text)
            }
        }
        "h3" -> { text ->
            H3(section.style.toModifier().id(section.anchor).toAttrs()) {
                styledTextWithKindredCirclHighlight(text)
            }
        }
        "h4" -> { text ->
            H4(section.style.toModifier().id(section.anchor).toAttrs()) {
                styledTextWithKindredCirclHighlight(text)
            }
        }
        "prohibited" -> { text ->
            H3(section.style.toModifier().then(ProhibitedHeadlinesStyle.toModifier()).id(section.anchor).toAttrs()) {
                FaArrowRight(Modifier.margin(right = 1.cssRem))
                SpanText(text)
            }
        }
        "positive" -> { text ->
            H3(section.style.toModifier().then(PositiveHeadlinesStyle.toModifier()).id(section.anchor).toAttrs()) {
                FaArrowRight(Modifier.margin(right = 1.cssRem))
                SpanText(text)
            }
        }
        else -> { text ->
            H5(section.style.toModifier().id(section.anchor).toAttrs()) { styledTextWithKindredCirclHighlight(text) }
        }
    }

    // ✅ Render heading
    tag(section.title)

    // ✅ Render content blocks
    section.contents.forEach { content ->
        when (content) {
            is DocumentContent.Paragraph -> P(ParagraphTextStyle.toModifier().padding(left = 1.cssRem).toAttrs()) {
                styledTextWithKindredCirclHighlight(content.text)
            }

            is DocumentContent.BlockQuote -> Blockquote {
                styledTextWithKindredCirclHighlight("“${content.quote}”")
            }

            is DocumentContent.LabeledText -> P(
                ParagraphTextStyle.toModifier().margin(leftRight = 4.cssRem, topBottom = 1.cssRem).toAttrs()
            ) {
                SpanText(content.label, Modifier.fontWeight(FontWeight.Bold))
                Text(" ")
                SpanText(content.value)
            }

            is DocumentContent.Component -> content.content()


            is DocumentContent.BulletList -> Ul {
                content.items.forEach { item ->
                    Li(BulletListStyle.toModifier().toAttrs()) {
                        item.body.forEachIndexed { _, bodyContent ->
                            when (bodyContent) {
                                is DocumentContent.Paragraph -> {
                                    Span {
                                        if (!item.title.isNullOrBlank()) {
                                            SpanText(item.title, Modifier.fontWeight(FontWeight.Bold))
                                            Text(" ")
                                        }
                                        styledTextWithKindredCirclHighlight(bodyContent.text)
                                    }
                                }

                                is DocumentContent.Component -> bodyContent.content()


                                is DocumentContent.BlockQuote -> Blockquote {
                                    SpanText("“${bodyContent.quote}”")
                                }

                                is DocumentContent.LabeledText -> P(
                                    ParagraphTextStyle.toModifier().margin(leftRight = 4.cssRem, topBottom = 2.cssRem).toAttrs()
                                ) {
                                    SpanText(bodyContent.label, Modifier.fontWeight(FontWeight.Bold))
                                    Text(" ")
                                    SpanText(bodyContent.value)
                                }

                                is DocumentContent.BulletList -> Ul {
                                    bodyContent.items.forEach { nested ->
                                        Li(BulletListStyle.toModifier().toAttrs()) {
                                            nested.body.forEachIndexed { i, nestedContent ->
                                                Span {
                                                    if (i == 0 && !nested.title.isNullOrBlank()) {
                                                        SpanText(nested.title, Modifier.fontWeight(FontWeight.Bold))
                                                        Text(" ")
                                                    }
                                                    if (nestedContent is DocumentContent.Paragraph) {
                                                        styledTextWithKindredCirclHighlight(nestedContent.text)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                                is DocumentContent.NumberedList -> Ol {
                                    bodyContent.items.forEach { nested ->
                                        Li(BulletListStyle.toModifier().toAttrs()) {
                                            nested.body.forEachIndexed { i, nestedContent ->
                                                Span {
                                                    if (i == 0 && !nested.title.isNullOrBlank()) {
                                                        SpanText(nested.title, Modifier.fontWeight(FontWeight.Bold))
                                                        Text(" ")
                                                    }
                                                    if (nestedContent is DocumentContent.Paragraph) {
                                                        styledTextWithKindredCirclHighlight(nestedContent.text)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }

            is DocumentContent.NumberedList -> Ol {
                content.items.forEachIndexed { _, item ->
                    Li(BulletListStyle.toModifier().toAttrs()) {
                        item.body.forEachIndexed { bodyIndex, bodyContent ->
                            when (bodyContent) {
                                is DocumentContent.Paragraph -> {
                                    Span {
                                        if (!item.title.isNullOrBlank() && bodyIndex == 0) {
                                            SpanText(item.title, Modifier.fontWeight(FontWeight.Bold))
                                            Text(" ")
                                        }
                                        styledTextWithKindredCirclHighlight(bodyContent.text)
                                    }
                                }

                                is DocumentContent.Component -> bodyContent.content()


                                is DocumentContent.BlockQuote -> Blockquote {
                                    SpanText("“${bodyContent.quote}”")
                                }

                                is DocumentContent.LabeledText -> P(
                                    ParagraphTextStyle.toModifier().margin(leftRight = 4.cssRem, topBottom = 2.cssRem).toAttrs()
                                ) {
                                    SpanText(bodyContent.label, Modifier.fontWeight(FontWeight.Bold))
                                    Text(" ")
                                    SpanText(bodyContent.value)
                                }

                                is DocumentContent.BulletList -> Ul {
                                    bodyContent.items.forEach { nested ->
                                        Li(BulletListStyle.toModifier().toAttrs()) {
                                            nested.body.forEachIndexed { i, nestedContent ->
                                                Span {
                                                    if (i == 0 && !nested.title.isNullOrBlank()) {
                                                        SpanText(nested.title, Modifier.fontWeight(FontWeight.Bold))
                                                        Text(" ")
                                                    }
                                                    if (nestedContent is DocumentContent.Paragraph) {
                                                        styledTextWithKindredCirclHighlight(nestedContent.text)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                                is DocumentContent.NumberedList -> Ol {
                                    bodyContent.items.forEach { nested ->
                                        Li(BulletListStyle.toModifier().toAttrs()) {
                                            nested.body.forEachIndexed { i, nestedContent ->
                                                Span {
                                                    if (i == 0 && !nested.title.isNullOrBlank()) {
                                                        SpanText(nested.title, Modifier.fontWeight(FontWeight.Bold))
                                                        Text(" ")
                                                    }
                                                    if (nestedContent is DocumentContent.Paragraph) {
                                                        styledTextWithKindredCirclHighlight(nestedContent.text)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    // ✅ Recursively render children
    section.children.forEach {
        renderDocumentSection(it, headingLevel = it.headingLevel)
    }
}
