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

public val SolidGroup.AngleDoubleLeft: ImageVector
    get() {
        if (_angleDoubleLeft != null) {
            return _angleDoubleLeft!!
        }
        _angleDoubleLeft = Builder(name = "AngleDoubleLeft", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.7f, 239.0f)
                lineToRelative(136.0f, -136.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(319.9f, 256.0f)
                lineToRelative(96.4f, 96.4f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(393.7f, 409.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-136.0f, -136.0f)
                curveToRelative(-9.5f, -9.4f, -9.5f, -24.6f, -0.1f, -34.0f)
                close()
                moveTo(31.7f, 273.0f)
                lineToRelative(136.0f, 136.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(127.9f, 256.0f)
                lineToRelative(96.4f, -96.4f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(201.7f, 103.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-136.0f, 136.0f)
                curveToRelative(-9.5f, 9.4f, -9.5f, 24.6f, -0.1f, 34.0f)
                close()
            }
        }
        .build()
        return _angleDoubleLeft!!
    }

private var _angleDoubleLeft: ImageVector? = null
