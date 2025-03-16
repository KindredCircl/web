package com.kindredcircl.web.theme

import com.kindredcircl.web.util.colorLib.Color
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import org.jetbrains.compose.web.css.CSSColorValue

val text = primaryText.toCSS()

// Light theme
val lightPrimary = primaryLight.toCSS()
val lightOnPrimary = onPrimaryLight.toCSS()
val lightPrimaryContainer = primaryContainerLight.toCSS()
val lightOnPrimaryContainer = onPrimaryContainerLight.toCSS()
val lightSecondary = secondaryLight.toCSS()
val lightOnSecondary = onSecondaryLight.toCSS()
val lightSecondaryContainer = secondaryContainerLight.toCSS()
val lightOnSecondaryContainer = onSecondaryContainerLight.toCSS()
val lightTertiary = tertiaryLight.toCSS()
val lightOnTertiary = onTertiaryLight.toCSS()
val lightTertiaryContainer = tertiaryContainerLight.toCSS()
val lightOnTertiaryContainer = onTertiaryContainerLight.toCSS()
val lightError = errorLight.toCSS()
val lightOnError = onErrorLight.toCSS()
val lightErrorContainer = errorContainerLight.toCSS()
val lightOnErrorContainer = onErrorContainerLight.toCSS()
val lightBackground = backgroundLight.toCSS()
val lightOnBackground = onBackgroundLight.toCSS()
val lightSurface = surfaceLight.toCSS()
val lightOnSurface = onSurfaceLight.toCSS()
val lightSurfaceVariant = surfaceVariantLight.toCSS()
val lightOnSurfaceVariant = onSurfaceVariantLight.toCSS()
val lightOutline = outlineLight.toCSS()
val lightOutlineVariant = outlineVariantLight.toCSS()
val lightScrim = scrimLight.toCSS()
val lightInverseSurface = inverseSurfaceLight.toCSS()
val lightInverseOnSurface = inverseOnSurfaceLight.toCSS()
val lightInversePrimary = inversePrimaryLight.toCSS()
val lightSurfaceDim = surfaceDimLight.toCSS()
val lightSurfaceBright = surfaceBrightLight.toCSS()
val lightSurfaceContainerLowest = surfaceContainerLowestLight.toCSS()
val lightSurfaceContainerLow = surfaceContainerLowLight.toCSS()
val lightSurfaceContainer = surfaceContainerLight.toCSS()
val lightSurfaceContainerHigh = surfaceContainerHighLight.toCSS()
val lightSurfaceContainerHighest = surfaceContainerHighestLight.toCSS()
val lightKCPurple = kCPurpleLight.toCSS()
val lightOnKCPurple = onKCPurpleLight.toCSS()
val lightKCPurpleContainer = kCPurpleContainerLight.toCSS()
val lightOnKCPurpleContainer = onKCPurpleContainerLight.toCSS()
val lightKCOrange = kCOrangeLight.toCSS()
val lightOnKCOrange = onKCOrangeLight.toCSS()
val lightKCOrangeContainer = kCOrangeContainerLight.toCSS()
val lightOnKCOrangeContainer = onKCOrangeContainerLight.toCSS()
val lightKCBlue = kCBlueLight.toCSS()
val lightOnKCBlue = onKCBlueLight.toCSS()
val lightKCBlueContainer = kCBlueContainerLight.toCSS()
val lightOnKCBlueContainer = onKCBlueContainerLight.toCSS()


// Dark Theme
val darkPrimary = primaryDark.toCSS()
val darkOnPrimary = onPrimaryDark.toCSS()
val darkPrimaryContainer = primaryContainerDark.toCSS()
val darkOnPrimaryContainer = onPrimaryContainerDark.toCSS()
val darkSecondary = secondaryDark.toCSS()
val darkOnSecondary = onSecondaryDark.toCSS()
val darkSecondaryContainer = secondaryContainerDark.toCSS()
val darkOnSecondaryContainer = onSecondaryContainerDark.toCSS()
val darkTertiary = tertiaryDark.toCSS()
val darkOnTertiary = onTertiaryDark.toCSS()
val darkTertiaryContainer = tertiaryContainerDark.toCSS()
val darkOnTertiaryContainer = onTertiaryContainerDark.toCSS()
val darkError = errorDark.toCSS()
val darkOnError = onErrorDark.toCSS()
val darkErrorContainer = errorContainerDark.toCSS()
val darkOnErrorContainer = onErrorContainerDark.toCSS()
val darkBackground = backgroundDark.toCSS()
val darkOnBackground = onBackgroundDark.toCSS()
val darkSurface = surfaceDark.toCSS()
val darkOnSurface = onSurfaceDark.toCSS()
val darkSurfaceVariant = surfaceVariantDark.toCSS()
val darkOnSurfaceVariant = onSurfaceVariantDark.toCSS()
val darkOutline = outlineDark.toCSS()
val darkOutlineVariant = outlineVariantDark.toCSS()
val darkScrim = scrimDark.toCSS()
val darkInverseSurface = inverseSurfaceDark.toCSS()
val darkInverseOnSurface = inverseOnSurfaceDark.toCSS()
val darkInversePrimary = inversePrimaryDark.toCSS()
val darkSurfaceDim = surfaceDimDark.toCSS()
val darkSurfaceBright = surfaceBrightDark.toCSS()
val darkSurfaceContainerLowest = surfaceContainerLowestDark.toCSS()
val darkSurfaceContainerLow = surfaceContainerLowDark.toCSS()
val darkSurfaceContainer = surfaceContainerDark.toCSS()
val darkSurfaceContainerHigh = surfaceContainerHighDark.toCSS()
val darkSurfaceContainerHighest = surfaceContainerHighestDark.toCSS()
val darkKCPurple = kCPurpleDark.toCSS()
val darkOnKCPurple = onKCPurpleDark.toCSS()
val darkKCPurpleContainer = kCPurpleContainerDark.toCSS()
val darkOnKCPurpleContainer = onKCPurpleContainerDark.toCSS()
val darkKCOrange = kCOrangeDark.toCSS()
val darkOnKCOrange = onKCOrangeDark.toCSS()
val darkKCOrangeContainer = kCOrangeContainerDark.toCSS()
val darkOnKCOrangeContainer = onKCOrangeConatainerDark.toCSS()
val darkKCBlue = kCBlueDark.toCSS()
val darkOnKCBlue = onKCBlueDark.toCSS()
val darkKCBlueContainer = kCBlueContainerDark.toCSS()
val darkOnKCBlueContainer = onKCBlueContainerDark.toCSS()

fun Color.toCSS(): CSSColorValue = outerColor.argb(this.alpha, this.red, this.green, this.blue)
fun Color.copyf(alpha: Float) = outerColor.argb(
        a = alpha,
        r = this.red,
        g = this.green,
        b = this.blue
    )

//val buttonGradient = linearGradient(LinearGradient.Direction.ToBottomRight, darkKCBlue, lightKCBlue)
//val buttonGradientHover = linearGradient(LinearGradient.Direction.ToBottomRight, darkKCBlueContainer, lightKCBlueContainer)

val buttonGradient = linearGradient(
    LinearGradient.Direction.ToBottomRight,
    darkKCBlue,
    outerColor.rgb(
        kCBlueDark.red + 10,
        kCBlueDark.green + 10,
        kCBlueDark.blue + 10
    )
)

val buttonGradientHover = linearGradient(
    LinearGradient.Direction.ToBottomRight,
    darkKCBlueContainer,
    outerColor.rgb(
        kCBlueContainerLight.red - 10,
        kCBlueContainerLight.green - 10,
        kCBlueContainerLight.blue - 10
    )
)

val buttonGradientPressed = linearGradient(
    LinearGradient.Direction.ToBottom,
    darkKCBlueContainer,
    kCBlueContainerLight.copyf(alpha = 0.9f)
)