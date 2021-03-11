package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mobx: ImageVector
    get() {
        if (_mobx != null) {
            return _mobx!!
        }
        _mobx = Builder(name = "Mobx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.402f, 0.0f)
                curveTo(0.625f, 0.0f, 0.0f, 0.625f, 0.0f, 1.402f)
                verticalLineToRelative(21.196f)
                curveTo(0.0f, 23.375f, 0.625f, 24.0f, 1.402f, 24.0f)
                horizontalLineToRelative(21.196f)
                curveToRelative(0.777f, 0.0f, 1.402f, -0.625f, 1.402f, -1.402f)
                lineTo(24.0f, 1.402f)
                curveTo(24.0f, 0.625f, 23.375f, 0.0f, 22.598f, 0.0f)
                close()
                moveTo(4.284f, 4.367f)
                horizontalLineToRelative(3.038f)
                verticalLineToRelative(13.068f)
                lineTo(4.284f, 17.435f)
                verticalLineToRelative(-0.986f)
                horizontalLineToRelative(1.863f)
                lineTo(6.147f, 5.352f)
                lineTo(4.284f, 5.352f)
                close()
                moveTo(16.678f, 4.367f)
                horizontalLineToRelative(3.038f)
                verticalLineToRelative(0.985f)
                horizontalLineToRelative(-1.863f)
                lineTo(17.853f, 16.45f)
                horizontalLineToRelative(1.863f)
                verticalLineToRelative(0.986f)
                horizontalLineToRelative(-3.038f)
                close()
                moveTo(8.822f, 7.917f)
                horizontalLineToRelative(1.35f)
                curveToRelative(0.108f, 0.441f, 0.234f, 0.914f, 0.378f, 1.418f)
                curveToRelative(0.153f, 0.495f, 0.31f, 0.99f, 0.472f, 1.485f)
                curveToRelative(0.171f, 0.486f, 0.342f, 0.958f, 0.513f, 1.417f)
                curveToRelative(0.171f, 0.46f, 0.333f, 0.869f, 0.486f, 1.229f)
                curveToRelative(0.153f, -0.36f, 0.315f, -0.77f, 0.486f, -1.229f)
                curveToRelative(0.171f, -0.459f, 0.338f, -0.931f, 0.5f, -1.417f)
                curveToRelative(0.17f, -0.495f, 0.328f, -0.99f, 0.472f, -1.485f)
                curveToRelative(0.153f, -0.504f, 0.284f, -0.977f, 0.392f, -1.418f)
                horizontalLineToRelative(1.296f)
                arcToRelative(34.42f, 34.42f, 0.0f, false, true, -1.242f, 3.78f)
                arcToRelative(56.393f, 56.393f, 0.0f, false, true, -1.364f, 3.24f)
                horizontalLineToRelative(-1.134f)
                arcToRelative(63.87f, 63.87f, 0.0f, false, true, -1.377f, -3.24f)
                arcToRelative(36.424f, 36.424f, 0.0f, false, true, -1.228f, -3.78f)
                close()
            }
        }
        .build()
        return _mobx!!
    }

private var _mobx: ImageVector? = null
