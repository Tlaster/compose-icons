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

public val SolidGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(313.6f, 288.0f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16.0f, -72.9f, 16.0f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16.0f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288.0f, 0.0f, 348.2f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0.0f, -74.2f, -60.2f, -134.4f, -134.4f, -134.4f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
