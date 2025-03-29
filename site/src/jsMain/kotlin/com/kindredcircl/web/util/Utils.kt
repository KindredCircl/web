package com.kindredcircl.web.util

import androidx.compose.runtime.Composable
import com.kindredcircl.web.KindredCirclStyle
import com.kindredcircl.web.LinkBaseStyle
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.components.widgets.TocEntry
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.A

fun extractTocEntries(
    sections: List<DocumentSection>,
    isSubSection: Boolean = false
): List<TocEntry> {
    return sections.flatMap { section ->
        listOf(TocEntry(section.title, section.anchor, isSubSection)) +
                extractTocEntries(section.children, isSubSection = true)
    }
}

fun slugify(text: String): String {
    return text
        .lowercase()
        .replace(Regex("[^a-z0-9\\s-]"), "") // Remove non-alphanumeric
        .replace(Regex("\\s+"), "-")         // Replace spaces with hyphens
        .trim('-')
}

@Composable
fun styledTextWithKindredCirclHighlight(text: String) {
    val emailRegex = Regex("""\b[\w.%+-]+@[\w.-]+\.\w{2,}\b""")
    val linkPattern = Regex("""\(([^)]+)\)\((\/[^)]+)\)""") // Matches (Label)(/path)
    val kindredRegex = Regex("""\bKindredCircl(?:'s)?\b""")

    val parts = mutableListOf<Pair<String, String?>>()
    var cursor = 0

    while (cursor < text.length) {
        val linkMatch = linkPattern.find(text, cursor)
        val emailMatch = emailRegex.find(text, cursor)
        val kindredMatch = kindredRegex.find(text, cursor)

        val nextSpecial = listOfNotNull(
            linkMatch?.range?.first,
            emailMatch?.range?.first,
            kindredMatch?.range?.first
        ).minOrNull()

        if (nextSpecial == null) {
            parts.add(text.substring(cursor) to null)
            break
        }

        if (nextSpecial > cursor) {
            parts.add(text.substring(cursor, nextSpecial) to null)
        }

        when (nextSpecial) {
            linkMatch?.range?.first -> {
                val label = linkMatch.groupValues[1]
                val link = linkMatch.groupValues[2]
                parts.add(label to link)
                cursor = linkMatch.range.last + 1
            }
            emailMatch?.range?.first -> {
                val email = emailMatch.value
                parts.add(email to "mailto:$email")
                cursor = emailMatch.range.last + 1
            }
            kindredMatch?.range?.first -> {
                parts.add(kindredMatch.value to "kindred")
                cursor = kindredMatch.range.last + 1
            }
        }
    }

    // ✅ Render the parts
    parts.forEach { (part, type) ->
        when {
            type == "kindred" -> SpanText(part, KindredCirclStyle.toModifier())
            type?.startsWith("mailto:") == true -> A(href = type) { SpanText(part, LinkBaseStyle.toModifier()) }
            type?.startsWith("/") == true -> A(href = type) { SpanText(part, LinkBaseStyle.toModifier()) }
            else -> SpanText(part)
        }
    }
}

fun isValidEmail(email: String): Boolean {
    val emailRegex = Regex("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")
    return emailRegex.matches(email)
}
