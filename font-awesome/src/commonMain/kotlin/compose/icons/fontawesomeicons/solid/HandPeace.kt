package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandPeace: ImageVector
    get() {
        if (_handPeace != null) {
            return _handPeace!!
        }
        _handPeace = Builder(name = "HandPeace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(320.0f, 160.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(384.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(93.3f, 51.2f)
                lineTo(175.9f, 240.0f)
                lineToRelative(-69.9f, 0.0f)
                lineTo(34.7f, 76.8f)
                curveTo(27.6f, 60.6f, 35.0f, 41.8f, 51.2f, 34.7f)
                reflectiveCurveToRelative(35.1f, 0.3f, 42.1f, 16.5f)
                close()
                moveTo(120.3f, 272.5f)
                lineToRelative(-0.2f, -0.5f)
                lineToRelative(69.9f, 0.0f)
                lineToRelative(26.1f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.9f, 40.0f, -40.0f, 40.0f)
                lineToRelative(-56.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                lineToRelative(0.0f, -0.6f)
                curveToRelative(9.4f, 5.4f, 20.3f, 8.6f, 32.0f, 8.6f)
                curveToRelative(13.2f, 0.0f, 25.4f, -4.0f, 35.6f, -10.8f)
                curveToRelative(8.7f, 24.9f, 32.5f, 42.8f, 60.4f, 42.8f)
                curveToRelative(11.7f, 0.0f, 22.6f, -3.1f, 32.0f, -8.6f)
                lineToRelative(0.0f, 8.6f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                lineToRelative(-61.7f, 0.0f)
                curveToRelative(-42.4f, 0.0f, -83.1f, -16.9f, -113.1f, -46.9f)
                lineToRelative(-11.6f, -11.6f)
                curveTo(77.5f, 429.5f, 64.0f, 396.9f, 64.0f, 363.0f)
                lineToRelative(0.0f, -27.0f)
                curveToRelative(0.0f, -32.7f, 24.6f, -59.7f, 56.3f, -63.5f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
