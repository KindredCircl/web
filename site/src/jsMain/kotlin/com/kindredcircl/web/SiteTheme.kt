package com.kindredcircl.web

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

/**
 * @property nearBackground A useful color to apply to a container that should differentiate itself from the background
 *   but just a little.
 */
class SitePalette(
    val nearBackgroundFooter: Color,
    val nearBackgroundNavDrawer: Color,
    val cobweb: Color,
    val brand: Brand,
) {
    class Brand(
        val primary: Color,
        val onPrimary: Color,
        val secondary: Color,
        val onSecondary: Color,
        val tertiary: Color,
        val onTertiary: Color,
        val error: Color,
        val onError: Color,
        val surface: Color,
        val onSurface: Color,
        val inverseSurface: Color,
        val onInverseSurface: Color,
        val background: Color,
        val onBackground: Color,
        val custom1: Color,
        val onCustom1: Color,
        val custom2: Color,
        val onCustom2: Color,
        val custom3: Color,
        val onCustom3: Color,
        val custom4: Color,
        val onCustom4: Color,
        val custom5: Color,
        val onCustom5: Color,
        val accent: Color,
        val onAccent: Color,
        val positive: Color
    )
}

object SitePalettes {
    val light = SitePalette(
        nearBackgroundFooter = Color.rgb(0xD1E9FF),
        nearBackgroundNavDrawer = Color.rgb(0xE3F2FD),
        cobweb = Color.rgb(0xE3F2FD),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x00668A),
            onPrimary = Color.rgb(0xFFFFFF),
            secondary = Color.rgb(0x3D6378),
            onSecondary = Color.rgb(0xFFFFFF),
            tertiary = Color.rgb(0x7F469A),
            onTertiary = Color.rgb(0xFFFFFF),
            error = Color.rgb(0xBA0034),
            onError = Color.rgb(0xFFFFFF),
            surface = Color.rgb(0xFCF8F8),
            onSurface = Color.rgb(0x1C1B1B),
            inverseSurface = Color.rgb(0x313030),
            onInverseSurface = Color.rgb(0xF4F0EF),
            background = Color.rgb(0xBEE5FE),
            onBackground = Color.rgb(0x1C1B1B),
            custom1 = Color.rgb(0xFFD8E6),
            onCustom1 = Color.rgb(0x6E334F),
            custom2 = Color.rgb(0xFFDBCA),
            onCustom2 = Color.rgb(0x703715),
            custom3 = Color.rgb(0xC2E8FF),
            onCustom3 = Color.rgb(0x004D67),
            custom4 = Color.rgb(0xF9DC5C),
            onCustom4 = Color.rgb(0x716000),
            custom5 = Color.rgb(0x2E1320),
            onCustom5 = Color.rgb(0xA17989),
            accent  = Color.rgb(0xF8F32B),
            onAccent = Color.rgb(0x706E00),
            positive = Color.rgb(0x4CAF50),
        )
    )
    val dark = SitePalette(
        nearBackgroundFooter = Color.rgb(0x345F7A),
        nearBackgroundNavDrawer = Color.rgb(0x3F708F),
        cobweb = Colors.LightGray.inverted(),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x7BD0FF),
            onPrimary = Color.rgb(0x003549),
            secondary = Color.rgb(0xA5CCE4),
            onSecondary = Color.rgb(0x073448),
            tertiary = Color.rgb(0xE9B3FF),
            onTertiary = Color.rgb(0x4C1367),
            error = Color.rgb(0xFFB3B5),
            onError = Color.rgb(0x680019),
            surface = Color.rgb(0x141313),
            onSurface = Color.rgb(0xE5E2E1),
            inverseSurface = Color.rgb(0x313030),
            onInverseSurface = Color.rgb(0x345F7A),
            background = Color.rgb(0x274D62),
            onBackground = Color.rgb(0x98BDD6),
            custom1 = Color.rgb(0x8E4A7A),
            onCustom1 = Color.rgb(0xFFD0EC),
            custom2 = Color.rgb(0xC73E1D),
            onCustom2 = Color.rgb(0xFFEFEB),
            custom3 = Color.rgb(0x479AC0),
            onCustom3 = Color.rgb(0x00151F),
            custom4 = Color.rgb(0xF9DC5C),
            onCustom4 = Color.rgb(0x716000),
            custom5 = Color.rgb(0x2C111E),
            onCustom5 = Color.rgb(0xA07888),
            accent  = Color.rgb(0xEEE91C),
            onAccent = Color.rgb(0x6A6700),
            positive = Color.rgb(0x00FF7F),
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
    ctx.theme.palettes.light.background = SitePalettes.light.brand.background
    ctx.theme.palettes.light.color = SitePalettes.light.brand.onBackground
    ctx.theme.palettes.dark.background = SitePalettes.dark.brand.background
    ctx.theme.palettes.dark.color = SitePalettes.dark.brand.onBackground
}
