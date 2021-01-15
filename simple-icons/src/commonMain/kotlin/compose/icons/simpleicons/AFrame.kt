package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.AFrame: ImageVector
    get() {
        if (_aFrame != null) {
            return _aFrame!!
        }
        _aFrame = Builder(name = "AFrame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.37f, 17.07f)
                lineTo(6.57f, 17.07f)
                lineTo(4.24f, 24.0f)
                lineTo(3.01f, 24.0f)
                lineToRelative(8.23f, -24.0f)
                horizontalLineToRelative(1.52f)
                lineToRelative(8.23f, 24.0f)
                horizontalLineToRelative(-1.3f)
                close()
                moveTo(16.98f, 15.94f)
                lineToRelative(-5.0f, -14.96f)
                lineToRelative(-5.03f, 14.98f)
                horizontalLineToRelative(10.03f)
                close()
            }
        }
        .build()
        return _aFrame!!
    }

private var _aFrame: ImageVector? = null
