package com.kindredcircl.web.components.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import com.kindredcircl.web.ExpandSubListAnim
import com.kindredcircl.web.ExpandableTocStyle
import com.kindredcircl.web.LinkBaseStyle
import com.kindredcircl.web.TocSubListStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronDown
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronUp
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

data class TocEntry(
    val text: String,
    val anchor: String,
    val isSubSection: Boolean = false
)

val ExapndCollapseAnim = Keyframes {
    from {
        Modifier
            .opacity(0)
            .maxHeight(0.cssRem)
    }
    to {
        Modifier
            .opacity(1)
            .maxHeight(100.cssRem)
    }
}

@Composable
fun expandableToc(
    tocEntries: List<TocEntry>
) {
    val expandedSections = remember { mutableStateMapOf<String, Boolean>() }
    Column(
        Modifier.fillMaxWidth().padding(topBottom = 1.cssRem, leftRight = 1.cssRem),
    ) {

        Ul(ExpandableTocStyle.toAttrs()) {
            tocEntries.forEachIndexed { index, entry ->
                if (!entry.isSubSection) {
                    val nextMainIndex = tocEntries.indexOfFirstIndexed { i, e -> !e.isSubSection && i > index }
                    val subEntries = if (nextMainIndex != -1) tocEntries.subList(index + 1, nextMainIndex)
                    else tocEntries.subList(index + 1, tocEntries.size)
                    val hasSubSections = subEntries.any { it.isSubSection }
                    val isExpanded = expandedSections[entry.anchor] ?: false
                    val animationKey = "${entry.anchor}-${if (isExpanded) "open" else "closed"}"

                    key(animationKey) {
                        Li {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(bottom = 0.25.cssRem),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(modifier = Modifier.weight(1)) {
                                    A(href = "#${entry.anchor}", attrs = LinkBaseStyle.toModifier().toAttrs()) {
                                        Text(entry.text)
                                    }
                                }
                                if (hasSubSections) {
                                    Row(
                                        modifier = Modifier
                                            .cursor(Cursor.Pointer)
                                            .onClick { expandedSections[entry.anchor] = !isExpanded }
                                    ) {
                                        if (isExpanded) FaChevronUp() else FaChevronDown()
                                    }
                                }
                            }

                            if (hasSubSections) {
                                Ul(
                                    TocSubListStyle.toModifier()
                                        .animation(
                                            ExpandSubListAnim.toAnimation(
                                                duration = 500.ms,
                                                timingFunction = AnimationTimingFunction.EaseInOut,
                                                direction = if (animationKey.endsWith("open")) AnimationDirection.Normal
                                                else AnimationDirection.Reverse,
                                                fillMode = AnimationFillMode.Forwards
                                            )
                                        )
                                        .toAttrs()
                                ) {
                                    subEntries.filter { it.isSubSection }.forEach { sub ->
                                        println(animationKey)
                                        Li {
                                            A(href = "#${sub.anchor}", attrs = LinkBaseStyle.toModifier().toAttrs()) {
                                                Text(sub.text)
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

private inline fun <T> List<T>.indexOfFirstIndexed(predicate: (Int, T) -> Boolean): Int {
    forEachIndexed { index, element ->
        if (predicate(index, element)) return index
    }
    return -1
}