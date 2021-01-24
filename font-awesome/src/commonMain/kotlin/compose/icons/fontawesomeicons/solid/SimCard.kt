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

public val SolidGroup.SimCard: ImageVector
    get() {
        if (_simCard != null) {
            return _simCard!!
        }
        _simCard = Builder(name = "SimCard", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                verticalLineToRelative(384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                close()
                moveTo(224.0f, 256.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(320.0f, 256.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(256.0f, 384.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(-64.0f)
                close()
                moveTo(160.0f, 384.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                close()
                moveTo(64.0f, 384.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                close()
                moveTo(64.0f, 288.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 352.0f)
                verticalLineToRelative(-64.0f)
                close()
                moveTo(64.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 256.0f)
                verticalLineToRelative(-32.0f)
                close()
            }
        }
        .build()
        return _simCard!!
    }

private var _simCard: ImageVector? = null
