package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.RaspberryPi: ImageVector
    get() {
        if (_raspberryPi != null) {
            return _raspberryPi!!
        }
        _raspberryPi = Builder(name = "RaspberryPi", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.3984f, 14.8008f)
                lineTo(24.1992f, 14.5f)
                curveTo(24.1992f, 12.1016f, 23.1016f, 11.1992f, 21.8984f, 10.5f)
                curveTo(22.3008f, 10.3984f, 22.6992f, 10.3008f, 22.8008f, 9.8008f)
                curveTo(23.5f, 9.6016f, 23.6016f, 9.3008f, 23.6992f, 9.0f)
                curveTo(23.8984f, 8.8984f, 24.3984f, 8.6016f, 24.3984f, 8.0f)
                curveTo(24.6992f, 7.8008f, 24.8984f, 7.5f, 24.8008f, 7.1016f)
                curveTo(25.1016f, 6.6992f, 25.1992f, 6.3984f, 25.1016f, 6.1016f)
                curveTo(25.5f, 5.6016f, 25.3008f, 5.3008f, 25.1992f, 5.0f)
                curveTo(25.5f, 4.3984f, 25.1992f, 3.8008f, 24.3984f, 3.8984f)
                curveTo(24.1016f, 3.3984f, 23.3008f, 3.5f, 23.1992f, 3.5f)
                curveTo(23.1016f, 3.3008f, 22.8984f, 3.1992f, 22.3984f, 3.3008f)
                curveTo(21.8984f, 3.0f, 21.5f, 3.0f, 21.1016f, 3.1992f)
                curveTo(20.6016f, 2.8008f, 20.3008f, 3.1016f, 20.0f, 3.1992f)
                curveTo(19.3984f, 3.0f, 19.3008f, 3.3008f, 19.0f, 3.3984f)
                curveTo(18.3984f, 3.3008f, 18.1992f, 3.6016f, 17.8984f, 3.8984f)
                lineTo(17.6016f, 3.8984f)
                curveTo(16.6992f, 4.3984f, 16.1992f, 5.6016f, 16.0f, 6.1016f)
                curveTo(15.8008f, 5.5f, 15.3984f, 4.3984f, 14.3984f, 3.8984f)
                lineTo(14.1016f, 3.8984f)
                curveTo(13.8008f, 3.6016f, 13.6016f, 3.3008f, 13.0f, 3.3984f)
                curveTo(12.6992f, 3.3008f, 12.6016f, 3.0f, 12.0f, 3.1992f)
                curveTo(11.8008f, 3.1016f, 11.6016f, 3.0f, 11.3008f, 3.0f)
                curveTo(11.1992f, 3.0f, 11.1016f, 3.1016f, 10.8984f, 3.1992f)
                curveTo(10.5f, 3.0f, 10.1016f, 3.0f, 9.8008f, 3.3008f)
                curveTo(9.3008f, 3.1992f, 9.1016f, 3.3984f, 9.0f, 3.5f)
                curveTo(8.8984f, 3.5f, 8.1016f, 3.3984f, 7.8008f, 3.8984f)
                curveTo(6.8984f, 3.8008f, 6.6016f, 4.3984f, 6.8984f, 5.0f)
                curveTo(6.6992f, 5.3008f, 6.6016f, 5.5f, 7.0f, 6.1016f)
                curveTo(6.8008f, 6.3008f, 6.8984f, 6.6992f, 7.3008f, 7.0f)
                curveTo(7.1992f, 7.3984f, 7.3008f, 7.6992f, 7.6992f, 8.0f)
                curveTo(7.6016f, 8.5f, 8.1992f, 8.8008f, 8.3008f, 9.0f)
                curveTo(8.3984f, 9.3008f, 8.5f, 9.6016f, 9.1992f, 9.8008f)
                curveTo(9.3008f, 10.3008f, 9.6992f, 10.3984f, 10.1016f, 10.5f)
                curveTo(8.8008f, 11.1992f, 7.8008f, 12.1992f, 7.8008f, 14.5f)
                lineTo(7.6016f, 14.8008f)
                curveTo(6.1992f, 15.6992f, 4.8984f, 18.5f, 6.8984f, 20.8008f)
                curveTo(7.0f, 21.5f, 7.1992f, 22.0f, 7.3984f, 22.6016f)
                curveTo(7.6992f, 24.8984f, 9.6016f, 26.0f, 10.1016f, 26.1016f)
                curveTo(10.8008f, 26.6992f, 11.6016f, 27.1992f, 12.6992f, 27.6016f)
                curveTo(13.6992f, 28.6016f, 14.8008f, 29.0f, 15.8984f, 29.0f)
                curveTo(17.0f, 29.0f, 18.1016f, 28.6016f, 19.1016f, 27.6016f)
                curveTo(20.1992f, 27.1992f, 21.0f, 26.6992f, 21.6992f, 26.1016f)
                curveTo(22.1992f, 26.0f, 24.1016f, 24.8984f, 24.3984f, 22.6016f)
                curveTo(24.6016f, 22.0f, 24.8008f, 21.5f, 25.0f, 20.8008f)
                curveTo(27.1992f, 18.5f, 25.8984f, 15.6992f, 24.3984f, 14.8008f)
                close()
                moveTo(23.1016f, 14.3984f)
                curveTo(23.0f, 15.3984f, 18.1992f, 11.1016f, 19.0f, 11.0f)
                curveTo(21.3008f, 10.6016f, 23.1992f, 11.8984f, 23.1016f, 14.3984f)
                close()
                moveTo(17.8008f, 4.5f)
                curveTo(17.8008f, 4.6992f, 17.8984f, 4.8008f, 17.8984f, 4.8984f)
                curveTo(18.1992f, 4.6016f, 18.3984f, 4.3008f, 18.6992f, 4.0f)
                curveTo(18.6992f, 4.1992f, 18.6016f, 4.3008f, 18.8008f, 4.5f)
                curveTo(19.0f, 4.1992f, 19.1992f, 4.0f, 19.6016f, 3.8008f)
                curveTo(19.3984f, 4.1016f, 19.6016f, 4.1992f, 19.6992f, 4.3008f)
                curveTo(20.0f, 4.1016f, 20.1992f, 3.8984f, 20.6992f, 3.6992f)
                curveTo(20.6016f, 3.8984f, 20.3984f, 4.0f, 20.6016f, 4.1992f)
                curveTo(20.8984f, 4.0f, 21.1016f, 3.8984f, 21.8008f, 3.6992f)
                curveTo(21.6992f, 3.8984f, 21.3984f, 4.0f, 21.5f, 4.1992f)
                curveTo(21.8008f, 4.1016f, 22.1992f, 4.0f, 22.6016f, 3.8984f)
                curveTo(22.3984f, 4.1016f, 22.1992f, 4.1992f, 22.3984f, 4.3008f)
                curveTo(22.8008f, 4.1992f, 23.1992f, 4.0f, 23.6992f, 4.1992f)
                lineTo(23.3984f, 4.5f)
                curveTo(23.3984f, 4.5f, 24.1016f, 4.5f, 24.6016f, 4.5f)
                curveTo(24.3984f, 4.8008f, 24.1992f, 5.0f, 24.1016f, 5.3984f)
                curveTo(24.1016f, 5.3984f, 24.3984f, 5.3984f, 24.6016f, 5.3984f)
                curveTo(24.3984f, 6.0f, 24.0f, 6.1016f, 23.8984f, 6.3008f)
                curveTo(24.0f, 6.3984f, 24.1992f, 6.3984f, 24.5f, 6.3008f)
                curveTo(24.3008f, 6.6992f, 24.0f, 6.8984f, 23.6992f, 7.1992f)
                curveTo(23.8008f, 7.3008f, 23.8984f, 7.3008f, 24.1992f, 7.1992f)
                curveTo(23.8984f, 7.5f, 23.6016f, 7.6992f, 23.3008f, 8.0f)
                curveTo(23.3984f, 8.1016f, 23.6016f, 8.1016f, 23.8008f, 8.1016f)
                curveTo(23.5f, 8.3984f, 23.0f, 8.6016f, 22.6016f, 8.8008f)
                curveTo(22.6992f, 9.0f, 22.8984f, 8.8984f, 23.0f, 8.8984f)
                curveTo(22.6992f, 9.1016f, 22.1992f, 9.3008f, 21.8008f, 9.3984f)
                curveTo(21.8984f, 9.5f, 22.0f, 9.6016f, 22.1992f, 9.6016f)
                curveTo(21.6992f, 9.8984f, 21.0f, 9.6992f, 20.8008f, 9.8984f)
                curveTo(20.8008f, 10.0f, 21.0f, 10.1016f, 21.1016f, 10.1992f)
                curveTo(20.3008f, 10.1992f, 18.1992f, 10.1992f, 17.8008f, 8.6016f)
                curveTo(18.6016f, 7.6992f, 20.0f, 6.6992f, 22.5f, 5.3984f)
                curveTo(20.6016f, 6.1016f, 18.8008f, 6.8984f, 17.3984f, 8.1016f)
                curveTo(15.8008f, 7.3008f, 16.8984f, 5.3008f, 17.8008f, 4.5f)
                close()
                moveTo(16.0f, 10.3008f)
                curveTo(17.1992f, 10.3008f, 18.6992f, 11.1992f, 18.6992f, 12.1016f)
                curveTo(18.6992f, 12.8984f, 17.6016f, 13.5f, 16.0f, 13.5f)
                curveTo(14.3984f, 13.5f, 13.3008f, 12.6992f, 13.3008f, 12.0f)
                curveTo(13.3008f, 11.3008f, 14.6016f, 10.3008f, 16.0f, 10.3008f)
                close()
                moveTo(9.8984f, 9.6992f)
                curveTo(10.1016f, 9.6992f, 10.1992f, 9.6016f, 10.3008f, 9.5f)
                curveTo(9.8008f, 9.3008f, 9.3008f, 9.1992f, 9.0f, 8.8984f)
                curveTo(9.1992f, 8.8984f, 9.3008f, 8.8984f, 9.5f, 8.8008f)
                curveTo(9.1016f, 8.6016f, 8.6992f, 8.3984f, 8.3008f, 8.1016f)
                curveTo(8.5f, 8.1016f, 8.6992f, 8.1016f, 8.8008f, 8.0f)
                curveTo(8.5f, 7.8008f, 8.1992f, 7.5f, 7.8984f, 7.3008f)
                curveTo(8.1992f, 7.3008f, 8.3008f, 7.3008f, 8.3984f, 7.3008f)
                curveTo(8.1016f, 6.8984f, 7.8008f, 6.6992f, 7.6016f, 6.3008f)
                curveTo(7.8008f, 6.3984f, 8.0f, 6.3984f, 8.1992f, 6.3008f)
                curveTo(8.1016f, 6.1016f, 7.6016f, 6.0f, 7.3984f, 5.5f)
                curveTo(7.6016f, 5.5f, 7.8984f, 5.5f, 7.8984f, 5.5f)
                curveTo(7.8008f, 5.1016f, 7.6016f, 4.8008f, 7.5f, 4.6016f)
                curveTo(8.0f, 4.6016f, 8.6992f, 4.6016f, 8.6992f, 4.6016f)
                lineTo(8.3984f, 4.1992f)
                curveTo(8.8984f, 4.1016f, 9.3984f, 4.1992f, 9.6992f, 4.3008f)
                curveTo(9.8984f, 4.1992f, 9.6992f, 4.0f, 9.5f, 3.8984f)
                curveTo(9.8984f, 4.0f, 10.3008f, 4.1016f, 10.6016f, 4.1992f)
                curveTo(10.8008f, 4.0f, 10.5f, 3.8984f, 10.3008f, 3.6992f)
                curveTo(11.0f, 3.8008f, 11.1992f, 4.0f, 11.5f, 4.1992f)
                curveTo(11.6992f, 4.0f, 11.5f, 3.8984f, 11.3984f, 3.6992f)
                curveTo(11.8984f, 3.8984f, 12.1016f, 4.1016f, 12.3984f, 4.3008f)
                curveTo(12.5f, 4.1992f, 12.6016f, 4.1016f, 12.5f, 3.8008f)
                curveTo(12.6992f, 4.0f, 13.0f, 4.1992f, 13.1992f, 4.5f)
                curveTo(13.3984f, 4.3984f, 13.3008f, 4.1992f, 13.3008f, 4.0f)
                curveTo(13.6016f, 4.3008f, 13.8984f, 4.6016f, 14.1016f, 4.8984f)
                curveTo(14.1992f, 4.8984f, 14.1992f, 4.6992f, 14.1992f, 4.5f)
                curveTo(15.0f, 5.3008f, 16.1992f, 7.3008f, 14.5f, 8.1016f)
                curveTo(13.1016f, 6.8984f, 11.3008f, 6.0f, 9.3984f, 5.3984f)
                curveTo(11.8984f, 6.6992f, 13.3008f, 7.6992f, 14.1016f, 8.6016f)
                curveTo(13.6992f, 10.1992f, 11.6016f, 10.3008f, 10.8008f, 10.1992f)
                curveTo(11.0f, 10.1016f, 11.1016f, 10.0f, 11.1016f, 9.8984f)
                curveTo(11.0f, 9.8008f, 10.3984f, 9.8984f, 9.8984f, 9.6992f)
                close()
                moveTo(12.6992f, 10.8984f)
                curveTo(13.5f, 11.0f, 8.6992f, 15.3008f, 8.6016f, 14.3008f)
                curveTo(8.5f, 11.8984f, 10.3984f, 10.5f, 12.6992f, 10.8984f)
                close()
                moveTo(7.6016f, 20.3984f)
                curveTo(6.3984f, 19.3984f, 6.0f, 16.6992f, 8.1992f, 15.3984f)
                curveTo(9.5f, 15.0f, 8.6992f, 20.8008f, 7.6016f, 20.3984f)
                close()
                moveTo(12.1992f, 25.3984f)
                curveTo(11.5f, 25.8008f, 9.8984f, 25.6016f, 8.8008f, 24.0f)
                curveTo(8.0f, 22.6016f, 8.1016f, 21.1992f, 8.6992f, 20.8008f)
                curveTo(9.5f, 20.3008f, 10.8008f, 21.0f, 11.6992f, 22.1016f)
                curveTo(12.5f, 23.0f, 12.8984f, 24.8008f, 12.1992f, 25.3984f)
                close()
                moveTo(10.8984f, 19.3008f)
                curveTo(9.6992f, 18.5f, 9.5f, 16.6992f, 10.3984f, 15.1992f)
                curveTo(11.3984f, 13.8008f, 13.1016f, 13.1992f, 14.3008f, 14.0f)
                curveTo(15.5f, 14.8008f, 15.6992f, 16.6016f, 14.8008f, 18.1016f)
                curveTo(13.8984f, 19.6016f, 12.1016f, 20.1016f, 10.8984f, 19.3008f)
                close()
                moveTo(16.0f, 28.1992f)
                curveTo(14.5f, 28.3008f, 13.1016f, 27.0f, 13.1016f, 26.6016f)
                curveTo(13.1016f, 26.0f, 14.8984f, 25.5f, 16.1016f, 25.5f)
                curveTo(17.3008f, 25.3984f, 18.8984f, 25.8984f, 18.8984f, 26.5f)
                curveTo(18.8984f, 26.8984f, 17.3984f, 28.1992f, 16.0f, 28.1992f)
                close()
                moveTo(19.0f, 21.8008f)
                curveTo(19.0f, 23.3008f, 17.6992f, 24.5f, 16.1016f, 24.5f)
                curveTo(14.5f, 24.5f, 13.1016f, 23.3008f, 13.1016f, 21.8008f)
                curveTo(13.1016f, 20.3008f, 14.3984f, 19.1016f, 16.0f, 19.1016f)
                curveTo(17.6992f, 19.1016f, 19.0f, 20.3008f, 19.0f, 21.8008f)
                close()
                moveTo(17.1992f, 18.0f)
                curveTo(16.1992f, 16.6016f, 16.5f, 14.6992f, 17.6992f, 13.8984f)
                curveTo(18.8984f, 13.1016f, 20.6992f, 13.6016f, 21.6016f, 15.1016f)
                curveTo(22.5f, 16.6016f, 22.3008f, 18.3984f, 21.1016f, 19.1992f)
                curveTo(19.8984f, 19.8984f, 18.1016f, 19.3984f, 17.1992f, 18.0f)
                close()
                moveTo(23.1992f, 24.0f)
                curveTo(21.8984f, 25.8008f, 20.1992f, 25.8008f, 19.6016f, 25.3008f)
                curveTo(18.8984f, 24.6992f, 19.3984f, 22.6992f, 20.3984f, 21.6016f)
                curveTo(21.3984f, 20.3984f, 22.6016f, 19.6016f, 23.3008f, 20.1992f)
                curveTo(23.8008f, 20.8984f, 24.1016f, 22.8008f, 23.1992f, 24.0f)
                close()
                moveTo(24.1016f, 20.3008f)
                curveTo(23.0f, 20.8008f, 22.1016f, 15.0f, 23.5f, 15.3008f)
                curveTo(25.6992f, 16.5f, 25.3008f, 19.3008f, 24.1016f, 20.3008f)
                close()
            }
        }
        .build()
        return _raspberryPi!!
    }

private var _raspberryPi: ImageVector? = null