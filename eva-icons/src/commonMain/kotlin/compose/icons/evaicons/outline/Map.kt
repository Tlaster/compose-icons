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

public val OutlineGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.41f, 5.89f)
                lineToRelative(-4.0f, -1.8f)
                lineToRelative(-0.05f, 0.0f)
                lineToRelative(-0.12f, 0.0f)
                lineToRelative(-0.12f, 0.0f)
                horizontalLineToRelative(-0.25f)
                lineToRelative(-0.1f, 0.0f)
                lineToRelative(-0.13f, 0.0f)
                lineToRelative(-0.05f, 0.0f)
                lineTo(12.0f, 5.7f)
                lineTo(8.41f, 4.09f)
                lineToRelative(-0.05f, 0.0f)
                lineTo(8.24f, 4.0f)
                lineTo(8.12f, 4.0f)
                lineTo(7.87f, 4.0f)
                lineToRelative(-0.1f, 0.0f)
                lineToRelative(-0.13f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-4.0f, 1.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 6.8f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.46f, 0.84f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.41f, -0.09f)
                lineTo(8.0f, 18.3f)
                lineToRelative(3.59f, 1.61f)
                horizontalLineToRelative(0.05f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 0.72f, 0.0f)
                horizontalLineToRelative(0.05f)
                lineTo(16.0f, 18.3f)
                lineToRelative(3.59f, 1.61f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.54f, -0.16f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 19.0f)
                lineTo(21.0f, 6.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.41f, 5.89f)
                close()
                moveTo(5.0f, 7.44f)
                lineToRelative(2.0f, -0.89f)
                verticalLineToRelative(10.0f)
                lineToRelative(-2.0f, 0.89f)
                close()
                moveTo(9.0f, 6.55f)
                lineTo(11.0f, 7.44f)
                verticalLineToRelative(10.0f)
                lineToRelative(-2.0f, -0.89f)
                close()
                moveTo(13.0f, 7.44f)
                lineTo(15.0f, 6.55f)
                verticalLineToRelative(10.0f)
                lineToRelative(-2.0f, 0.89f)
                close()
                moveTo(19.0f, 17.44f)
                lineTo(17.0f, 16.55f)
                verticalLineToRelative(-10.0f)
                lineToRelative(2.0f, 0.89f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
