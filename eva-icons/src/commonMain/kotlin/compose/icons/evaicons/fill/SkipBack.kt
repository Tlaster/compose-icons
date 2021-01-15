package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = Builder(name = "SkipBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.45f, 6.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -2.21f, 0.26f)
                lineToRelative(-5.1f, 4.21f)
                lineTo(9.0f, 10.82f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 7.0f)
                verticalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(13.18f)
                lineToRelative(0.14f, 0.15f)
                lineToRelative(5.1f, 4.21f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, false, 1.3f, 0.46f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 0.91f, -0.2f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 1.05f, -1.59f)
                verticalLineTo(7.79f)
                arcTo(1.76f, 1.76f, 0.0f, false, false, 16.45f, 6.2f)
                close()
            }
        }
        .build()
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
