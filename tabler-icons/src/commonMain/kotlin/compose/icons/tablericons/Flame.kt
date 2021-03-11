package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(2.0f, -2.96f, 0.0f, -7.0f, -1.0f, -8.0f)
                curveToRelative(0.0f, 3.038f, -1.773f, 4.741f, -3.0f, 6.0f)
                curveToRelative(-1.226f, 1.26f, -2.0f, 3.24f, -2.0f, 5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                curveToRelative(0.0f, -1.532f, -1.056f, -3.94f, -2.0f, -5.0f)
                curveToRelative(-1.786f, 3.0f, -2.791f, 3.0f, -4.0f, 2.0f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
