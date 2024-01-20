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

public val LineAwesomeIcons.PauseSolid: ImageVector
    get() {
        if (_pauseSolid != null) {
            return _pauseSolid!!
        }
        _pauseSolid = Builder(name = "PauseSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                lineTo(10.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(20.0f, 6.0f)
                lineTo(20.0f, 26.0f)
                lineTo(22.0f, 26.0f)
                lineTo(22.0f, 6.0f)
                close()
            }
        }
        .build()
        return _pauseSolid!!
    }

private var _pauseSolid: ImageVector? = null