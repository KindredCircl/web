package com.kindredcircl.web

import com.kindredcircl.web.theme.*
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color
import org.jetbrains.compose.web.css.CSSColorValue

/**
 * @property nearBackground A useful color to apply to a container that should differentiate itself from the background
 *   but just a little.
 */
class SitePalette(
    val nearBackground: Color,
    val cobweb: Color,
    val brand: Brand,
) {
    class Brand(
        val primary: CSSColorValue ,
        val accent: CSSColorValue,
    )
}

object SitePalettes {
    val light = SitePalette(
        nearBackground = Color.rgb(0xE6C892),
        cobweb = Colors.LightGray,
        brand = SitePalette.Brand(
            primary = lightPrimaryContainer,
            accent  = lightKCPurple,
        )
    )
    val dark = SitePalette(
        nearBackground = Color.rgb(0x6A4C00),
        cobweb = Colors.LightGray.inverted(),
        brand = SitePalette.Brand(
            primary = darkPrimaryContainer,
            accent = darkKCPurple,
        )
    )
}

fun ColorMode.toSitePalette(): SitePalette {
    return when (this) {
        ColorMode.LIGHT -> SitePalettes.light
        ColorMode.DARK -> SitePalettes.dark
    }
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = lightOnPrimaryContainer as Color
    ctx.theme.palettes.light.color = Colors.Black
    ctx.theme.palettes.dark.background = darkOnPrimaryContainer as Color
    ctx.theme.palettes.dark.color = Colors.White
}
