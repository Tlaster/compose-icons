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

public val SolidGroup.BatteryThreeQuarters: ImageVector
    get() {
        if (_batteryThreeQuarters != null) {
            return _batteryThreeQuarters!!
        }
        _batteryThreeQuarters = Builder(name = "BatteryThreeQuarters", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.0f, 160.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 352.0f)
                lineTo(64.0f, 160.0f)
                horizontalLineToRelative(480.0f)
                moveToRelative(16.0f, -64.0f)
                lineTo(48.0f, 96.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(512.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(640.0f, 184.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(416.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(320.0f)
                lineTo(416.0f, 192.0f)
                close()
            }
        }
        .build()
        return _batteryThreeQuarters!!
    }

private var _batteryThreeQuarters: ImageVector? = null
