package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Nfc: ImageVector
    get() {
        if (_nfc != null) {
            return _nfc!!
        }
        _nfc = Builder(name = "Nfc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-11.0f)
                lineToRelative(5.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                lineToRelative(-5.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                lineTo(17.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 7.0f)
                lineTo(20.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 17.0f)
                lineTo(4.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 4.0f)
                close()
            }
        }
        .build()
        return _nfc!!
    }

private var _nfc: ImageVector? = null
