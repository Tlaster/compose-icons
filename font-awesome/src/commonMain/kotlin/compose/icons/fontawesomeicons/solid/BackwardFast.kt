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

public val SolidGroup.BackwardFast: ImageVector
    get() {
        if (_backwardFast != null) {
            return _backwardFast!!
        }
        _backwardFast = Builder(name = "BackwardFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.6f, 445.0f)
                curveToRelative(-11.2f, 5.3f, -24.5f, 3.6f, -34.1f, -4.4f)
                lineTo(288.0f, 297.7f)
                lineTo(288.0f, 416.0f)
                curveToRelative(0.0f, 12.4f, -7.2f, 23.7f, -18.4f, 29.0f)
                reflectiveCurveToRelative(-24.5f, 3.6f, -34.1f, -4.4f)
                lineTo(64.0f, 297.7f)
                lineTo(64.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 78.3f, 14.3f, 64.0f, 32.0f, 64.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 118.3f)
                lineTo(235.5f, 71.4f)
                curveToRelative(9.5f, -7.9f, 22.8f, -9.7f, 34.1f, -4.4f)
                reflectiveCurveTo(288.0f, 83.6f, 288.0f, 96.0f)
                lineToRelative(0.0f, 118.3f)
                lineTo(459.5f, 71.4f)
                curveToRelative(9.5f, -7.9f, 22.8f, -9.7f, 34.1f, -4.4f)
                reflectiveCurveTo(512.0f, 83.6f, 512.0f, 96.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 12.4f, -7.2f, 23.7f, -18.4f, 29.0f)
                close()
            }
        }
        .build()
        return _backwardFast!!
    }

private var _backwardFast: ImageVector? = null