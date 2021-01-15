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

public val TablerIcons.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) {
            return _deviceMobile!!
        }
        _deviceMobile = Builder(name = "DeviceMobile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                lineTo(16.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 5.0f)
                lineTo(17.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                lineTo(13.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineTo(12.0f, 17.01f)
            }
        }
        .build()
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
