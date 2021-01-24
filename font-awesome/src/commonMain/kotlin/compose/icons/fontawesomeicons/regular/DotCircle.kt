package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.DotCircle: ImageVector
    get() {
        if (_dotCircle != null) {
            return _dotCircle!!
        }
        _dotCircle = Builder(name = "DotCircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                curveToRelative(110.532f, 0.0f, 200.0f, 89.451f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.532f, -89.451f, 200.0f, -200.0f, 200.0f)
                curveToRelative(-110.532f, 0.0f, -200.0f, -89.451f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.532f, 89.451f, -200.0f, 200.0f, -200.0f)
                moveToRelative(0.0f, -48.0f)
                curveTo(119.033f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 176.0f)
                curveToRelative(-44.183f, 0.0f, -80.0f, 35.817f, -80.0f, 80.0f)
                reflectiveCurveToRelative(35.817f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.817f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.817f, -80.0f, -80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _dotCircle!!
    }

private var _dotCircle: ImageVector? = null
