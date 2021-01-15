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

public val TablerIcons.PlayerStop: ImageVector
    get() {
        if (_playerStop != null) {
            return _playerStop!!
        }
        _playerStop = Builder(name = "PlayerStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 7.0f)
                lineTo(19.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _playerStop!!
    }

private var _playerStop: ImageVector? = null
