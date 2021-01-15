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

public val FillGroup.FileRemove: ImageVector
    get() {
        if (_fileRemove != null) {
            return _fileRemove!!
        }
        _fileRemove = Builder(name = "FileRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.74f, 7.33f)
                lineToRelative(-4.44f, -5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.56f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 6.56f, 22.0f)
                lineTo(17.44f, 22.0f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 20.0f, 19.5f)
                lineTo(20.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.74f, 7.33f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(14.71f, 8.0f)
                arcTo(0.79f, 0.79f, 0.0f, false, true, 14.0f, 7.15f)
                lineTo(14.0f, 4.0f)
                lineToRelative(3.74f, 4.0f)
                close()
            }
        }
        .build()
        return _fileRemove!!
    }

private var _fileRemove: ImageVector? = null
