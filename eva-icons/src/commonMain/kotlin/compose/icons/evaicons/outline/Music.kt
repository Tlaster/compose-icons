package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                lineTo(19.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.38f, -0.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.84f, -0.2f)
                lineToRelative(-9.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 6.0f)
                verticalLineToRelative(8.34f)
                arcToRelative(3.49f, 3.49f, 0.0f, true, false, 2.0f, 3.18f)
                arcTo(4.36f, 4.36f, 0.0f, false, false, 10.0f, 17.0f)
                lineTo(10.0f, 6.8f)
                lineToRelative(7.0f, -1.55f)
                verticalLineToRelative(7.09f)
                arcTo(3.49f, 3.49f, 0.0f, true, false, 19.0f, 15.51f)
                arcTo(4.57f, 4.57f, 0.0f, false, false, 19.0f, 15.0f)
                close()
                moveTo(6.54f, 19.0f)
                arcTo(1.49f, 1.49f, 0.0f, true, true, 8.0f, 17.21f)
                lineTo(8.0f, 17.21f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 0.0f, 0.3f)
                arcTo(1.49f, 1.49f, 0.0f, false, true, 6.54f, 19.0f)
                close()
                moveTo(15.54f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.0f, 15.21f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 0.0f, 0.3f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.51f, 17.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
