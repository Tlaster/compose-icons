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

public val SimpleIcons.SparkAr: ImageVector
    get() {
        if (_sparkAr != null) {
            return _sparkAr!!
        }
        _sparkAr = Builder(name = "SparkAr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.199f, 20.001f)
                lineTo(20.801f, 12.0f)
                verticalLineToRelative(8.001f)
                lineTo(11.999f, 24.0f)
                lineToRelative(-8.8f, -3.999f)
                close()
                moveTo(11.999f, 24.0f)
                close()
                moveTo(11.998f, 0.0f)
                lineTo(3.199f, 3.999f)
                lineTo(3.199f, 12.0f)
                lineToRelative(17.602f, -8.001f)
                lineTo(11.998f, 0.0f)
                close()
                moveTo(3.803f, 12.275f)
                lineToRelative(7.592f, 3.453f)
                lineToRelative(8.803f, -4.002f)
                lineToRelative(-7.594f, -3.45f)
                lineToRelative(-8.801f, 3.999f)
                close()
            }
        }
        .build()
        return _sparkAr!!
    }

private var _sparkAr: ImageVector? = null
