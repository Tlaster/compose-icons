package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.WineGlassAlt: ImageVector
    get() {
        if (_wineGlassAlt != null) {
            return _wineGlassAlt!!
        }
        _wineGlassAlt = Builder(name = "WineGlassAlt", defaultWidth = 288.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 464.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineTo(346.81f)
                curveToRelative(68.47f, -15.89f, 118.05f, -79.91f, 111.4f, -154.16f)
                lineToRelative(-15.95f, -178.1f)
                curveTo(270.71f, 6.31f, 263.9f, 0.0f, 255.74f, 0.0f)
                horizontalLineTo(32.26f)
                curveToRelative(-8.15f, 0.0f, -14.97f, 6.31f, -15.7f, 14.55f)
                lineTo(0.6f, 192.66f)
                curveTo(-6.05f, 266.91f, 43.53f, 330.93f, 112.0f, 346.82f)
                verticalLineTo(464.0f)
                horizontalLineTo(72.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, 17.91f, -40.0f, 40.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                curveToRelative(0.0f, -22.09f, -17.91f, -40.0f, -40.0f, -40.0f)
                close()
                moveTo(61.75f, 48.0f)
                horizontalLineToRelative(164.5f)
                lineToRelative(7.17f, 80.0f)
                horizontalLineTo(54.58f)
                lineToRelative(7.17f, -80.0f)
                close()
            }
        }
        .build()
        return _wineGlassAlt!!
    }

private var _wineGlassAlt: ImageVector? = null
