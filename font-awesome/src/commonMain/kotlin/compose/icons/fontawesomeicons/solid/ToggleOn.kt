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

public val SolidGroup.ToggleOn: ImageVector
    get() {
        if (_toggleOn != null) {
            return _toggleOn!!
        }
        _toggleOn = Builder(name = "ToggleOn", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 64.0f)
                lineTo(192.0f, 64.0f)
                curveTo(86.0f, 64.0f, 0.0f, 150.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveTo(490.0f, 64.0f, 384.0f, 64.0f)
                close()
                moveTo(384.0f, 384.0f)
                curveToRelative(-70.8f, 0.0f, -128.0f, -57.3f, -128.0f, -128.0f)
                curveToRelative(0.0f, -70.8f, 57.3f, -128.0f, 128.0f, -128.0f)
                curveToRelative(70.8f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                curveToRelative(0.0f, 70.8f, -57.3f, 128.0f, -128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _toggleOn!!
    }

private var _toggleOn: ImageVector? = null
