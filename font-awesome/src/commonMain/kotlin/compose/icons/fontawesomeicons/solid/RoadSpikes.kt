package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RoadSpikes: ImageVector
    get() {
        if (_roadSpikes != null) {
            return _roadSpikes!!
        }
        _roadSpikes = Builder(name = "RoadSpikes", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 116.8f)
                curveToRelative(0.0f, -15.8f, 20.5f, -22.0f, 29.3f, -8.9f)
                lineTo(192.0f, 256.0f)
                verticalLineTo(116.8f)
                curveToRelative(0.0f, -15.8f, 20.5f, -22.0f, 29.3f, -8.9f)
                lineTo(320.0f, 256.0f)
                verticalLineTo(116.8f)
                curveToRelative(0.0f, -15.8f, 20.5f, -22.0f, 29.3f, -8.9f)
                lineTo(448.0f, 256.0f)
                verticalLineTo(116.8f)
                curveToRelative(0.0f, -15.8f, 20.5f, -22.0f, 29.3f, -8.9f)
                lineTo(606.8f, 302.2f)
                curveToRelative(14.2f, 21.3f, -1.1f, 49.7f, -26.6f, 49.7f)
                horizontalLineTo(512.0f)
                horizontalLineTo(448.0f)
                horizontalLineTo(384.0f)
                horizontalLineTo(320.0f)
                horizontalLineTo(256.0f)
                horizontalLineTo(192.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(116.8f)
                close()
                moveTo(32.0f, 384.0f)
                horizontalLineTo(608.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _roadSpikes!!
    }

private var _roadSpikes: ImageVector? = null