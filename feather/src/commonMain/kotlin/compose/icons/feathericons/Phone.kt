package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 16.92f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.18f, 2.0f)
                arcToRelative(19.79f, 19.79f, 0.0f, false, true, -8.63f, -3.07f)
                arcToRelative(19.5f, 19.5f, 0.0f, false, true, -6.0f, -6.0f)
                arcToRelative(19.79f, 19.79f, 0.0f, false, true, -3.07f, -8.67f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.11f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.72f)
                arcToRelative(12.84f, 12.84f, 0.0f, false, false, 0.7f, 2.81f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.45f, 2.11f)
                lineTo(8.09f, 9.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineToRelative(1.27f, -1.27f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.11f, -0.45f)
                arcToRelative(12.84f, 12.84f, 0.0f, false, false, 2.81f, 0.7f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 16.92f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
