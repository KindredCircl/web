package com.kindredcircl.web.components.sections.betaTest.formSections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import com.kindredcircl.web.ExpandCollapseAnim
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.animation
import com.varabyte.kobweb.compose.ui.modifiers.maxHeight
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.animation.toAnimation
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun CollapsibleSection(
    visible: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val animationKey = "section-${if (visible) "open" else "closed"}"

    key(animationKey) {
        Div(
            modifier
                .animation(
                    ExpandCollapseAnim.toAnimation(
                        duration = 400.ms,
                        timingFunction = AnimationTimingFunction.EaseInOut,
                        direction = if (visible) AnimationDirection.Normal else AnimationDirection.Reverse,
                        fillMode = AnimationFillMode.Forwards
                    )
                )
                .overflow(Overflow.Hidden)
                .maxHeight(if (visible) 300.px else 0.px) // fallback in case JS not animating
                .toAttrs()
        ) {
            content()
        }
    }
}
