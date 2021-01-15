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

public val TablerIcons.Marquee: ImageVector
    get() {
        if (_marquee != null) {
            return _marquee!!
        }
        _marquee = Builder(name = "Marquee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(3.0f, 0.0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(3.0f, 0.0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                moveToRelative(0.0f, 3.0f)
                verticalLineToRelative(1.5f)
                moveToRelative(0.0f, 3.0f)
                verticalLineToRelative(1.5f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                moveToRelative(-3.0f, 0.0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-3.0f, 0.0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                moveToRelative(0.0f, -3.0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0.0f, -3.0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0.0f, -3.0f)
            }
        }
        .build()
        return _marquee!!
    }

private var _marquee: ImageVector? = null
