package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CircleLeft: ImageVector
    get() {
        if (_circleLeft != null) {
            return _circleLeft!!
        }
        _circleLeft = Builder(name = "CircleLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 416.0f, 0.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, true, 48.0f, 256.0f)
                close()
                moveTo(512.0f, 256.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 512.0f, 0.0f)
                close()
                moveTo(256.0f, 128.0f)
                lineToRelative(-32.0f, 0.0f)
                lineTo(96.0f, 256.0f)
                lineTo(224.0f, 384.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _circleLeft!!
    }

private var _circleLeft: ImageVector? = null
