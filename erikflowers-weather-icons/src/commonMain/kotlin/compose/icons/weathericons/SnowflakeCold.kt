package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.SnowflakeCold: ImageVector
    get() {
        if (_snowflakeCold != null) {
            return _snowflakeCold!!
        }
        _snowflakeCold = Builder(name = "SnowflakeCold", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.46f, 14.41f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.36f, 0.2f, -0.5f)
                curveToRelative(0.13f, -0.14f, 0.29f, -0.21f, 0.48f, -0.21f)
                curveToRelative(0.19f, 0.0f, 0.36f, 0.07f, 0.49f, 0.21f)
                curveToRelative(0.13f, 0.14f, 0.2f, 0.3f, 0.2f, 0.5f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.35f, -0.2f, 0.48f)
                curveToRelative(-0.13f, 0.13f, -0.3f, 0.2f, -0.48f, 0.2f)
                reflectiveCurveToRelative(-0.35f, -0.07f, -0.48f, -0.2f)
                curveTo(7.52f, 14.75f, 7.46f, 14.59f, 7.46f, 14.41f)
                close()
                moveTo(9.44f, 14.41f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.36f, 0.2f, -0.5f)
                curveToRelative(0.13f, -0.14f, 0.29f, -0.21f, 0.48f, -0.21f)
                horizontalLineToRelative(3.23f)
                lineToRelative(-2.28f, -2.28f)
                curveToRelative(-0.14f, -0.12f, -0.21f, -0.28f, -0.21f, -0.47f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.35f, 0.21f, -0.49f)
                curveToRelative(0.14f, -0.14f, 0.3f, -0.21f, 0.49f, -0.21f)
                reflectiveCurveToRelative(0.35f, 0.07f, 0.49f, 0.21f)
                lineToRelative(2.27f, 2.27f)
                verticalLineTo(9.52f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.36f, 0.21f, -0.5f)
                reflectiveCurveToRelative(0.3f, -0.21f, 0.5f, -0.21f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.48f, 0.21f)
                curveToRelative(0.13f, 0.14f, 0.2f, 0.3f, 0.2f, 0.5f)
                verticalLineToRelative(3.23f)
                lineToRelative(2.29f, -2.3f)
                curveToRelative(0.14f, -0.14f, 0.3f, -0.21f, 0.48f, -0.21f)
                curveToRelative(0.18f, 0.0f, 0.35f, 0.07f, 0.49f, 0.21f)
                curveToRelative(0.12f, 0.14f, 0.18f, 0.3f, 0.18f, 0.49f)
                curveToRelative(0.0f, 0.19f, -0.06f, 0.35f, -0.18f, 0.47f)
                lineToRelative(-2.28f, 2.28f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.18f, 0.0f, 0.34f, 0.07f, 0.47f, 0.21f)
                curveToRelative(0.13f, 0.14f, 0.2f, 0.3f, 0.2f, 0.5f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.29f, 0.2f, -0.47f, 0.2f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.12f, 0.12f, 0.18f, 0.28f, 0.18f, 0.47f)
                reflectiveCurveToRelative(-0.06f, 0.35f, -0.18f, 0.49f)
                curveToRelative(-0.14f, 0.14f, -0.31f, 0.21f, -0.49f, 0.21f)
                curveToRelative(-0.18f, 0.0f, -0.35f, -0.07f, -0.48f, -0.21f)
                lineToRelative(-2.29f, -2.3f)
                verticalLineToRelative(3.24f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.2f, 0.49f)
                curveToRelative(-0.13f, 0.13f, -0.29f, 0.2f, -0.48f, 0.2f)
                curveToRelative(-0.19f, 0.0f, -0.36f, -0.07f, -0.5f, -0.2f)
                curveToRelative(-0.14f, -0.13f, -0.21f, -0.3f, -0.21f, -0.49f)
                verticalLineToRelative(-3.22f)
                lineToRelative(-2.27f, 2.27f)
                curveToRelative(-0.14f, 0.14f, -0.3f, 0.21f, -0.49f, 0.21f)
                reflectiveCurveToRelative(-0.35f, -0.07f, -0.49f, -0.21f)
                reflectiveCurveToRelative(-0.21f, -0.3f, -0.21f, -0.49f)
                reflectiveCurveToRelative(0.07f, -0.34f, 0.21f, -0.47f)
                lineToRelative(2.3f, -2.29f)
                horizontalLineToRelative(-3.24f)
                curveToRelative(-0.19f, 0.0f, -0.35f, -0.07f, -0.48f, -0.2f)
                curveTo(9.5f, 14.75f, 9.44f, 14.59f, 9.44f, 14.41f)
                close()
                moveTo(9.45f, 19.25f)
                curveToRelative(0.0f, -0.18f, 0.07f, -0.35f, 0.21f, -0.48f)
                curveToRelative(0.12f, -0.14f, 0.28f, -0.21f, 0.47f, -0.21f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.49f, 0.21f)
                curveToRelative(0.14f, 0.14f, 0.21f, 0.3f, 0.21f, 0.48f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.35f, -0.21f, 0.48f)
                curveToRelative(-0.14f, 0.14f, -0.3f, 0.21f, -0.49f, 0.21f)
                curveToRelative(-0.19f, 0.0f, -0.35f, -0.07f, -0.47f, -0.21f)
                curveTo(9.52f, 19.6f, 9.45f, 19.44f, 9.45f, 19.25f)
                close()
                moveTo(9.45f, 9.54f)
                curveToRelative(0.0f, -0.18f, 0.07f, -0.35f, 0.21f, -0.48f)
                curveToRelative(0.12f, -0.14f, 0.28f, -0.21f, 0.47f, -0.21f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.49f, 0.21f)
                curveToRelative(0.14f, 0.14f, 0.21f, 0.3f, 0.21f, 0.48f)
                reflectiveCurveToRelative(-0.07f, 0.35f, -0.21f, 0.49f)
                curveToRelative(-0.14f, 0.14f, -0.3f, 0.21f, -0.49f, 0.21f)
                curveToRelative(-0.19f, 0.0f, -0.35f, -0.07f, -0.47f, -0.21f)
                curveTo(9.52f, 9.89f, 9.45f, 9.72f, 9.45f, 9.54f)
                close()
                moveTo(14.3f, 21.25f)
                curveToRelative(0.0f, -0.18f, 0.07f, -0.34f, 0.21f, -0.47f)
                curveToRelative(0.14f, -0.13f, 0.3f, -0.2f, 0.5f, -0.2f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.48f, 0.2f)
                curveToRelative(0.13f, 0.13f, 0.2f, 0.29f, 0.2f, 0.47f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.2f, 0.49f)
                curveToRelative(-0.13f, 0.13f, -0.29f, 0.2f, -0.48f, 0.2f)
                curveToRelative(-0.19f, 0.0f, -0.36f, -0.07f, -0.5f, -0.2f)
                curveTo(14.37f, 21.61f, 14.3f, 21.45f, 14.3f, 21.25f)
                close()
                moveTo(14.3f, 7.54f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.36f, 0.21f, -0.49f)
                reflectiveCurveToRelative(0.3f, -0.2f, 0.5f, -0.2f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.48f, 0.2f)
                curveToRelative(0.13f, 0.13f, 0.2f, 0.3f, 0.2f, 0.49f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.29f, 0.2f, -0.48f, 0.2f)
                curveToRelative(-0.19f, 0.0f, -0.36f, -0.07f, -0.5f, -0.2f)
                curveTo(14.37f, 7.88f, 14.3f, 7.72f, 14.3f, 7.54f)
                close()
                moveTo(19.17f, 19.25f)
                curveToRelative(0.0f, -0.18f, 0.07f, -0.35f, 0.21f, -0.48f)
                curveToRelative(0.12f, -0.14f, 0.28f, -0.21f, 0.47f, -0.21f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.49f, 0.21f)
                curveToRelative(0.14f, 0.14f, 0.21f, 0.3f, 0.21f, 0.48f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.35f, -0.21f, 0.48f)
                curveToRelative(-0.14f, 0.14f, -0.3f, 0.21f, -0.49f, 0.21f)
                curveToRelative(-0.19f, 0.0f, -0.35f, -0.07f, -0.47f, -0.21f)
                curveTo(19.24f, 19.6f, 19.17f, 19.44f, 19.17f, 19.25f)
                close()
                moveTo(19.17f, 9.54f)
                curveToRelative(0.0f, -0.18f, 0.07f, -0.35f, 0.21f, -0.48f)
                curveToRelative(0.12f, -0.14f, 0.28f, -0.21f, 0.47f, -0.21f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.07f, 0.49f, 0.21f)
                curveToRelative(0.14f, 0.14f, 0.21f, 0.3f, 0.21f, 0.48f)
                reflectiveCurveToRelative(-0.07f, 0.35f, -0.21f, 0.49f)
                curveToRelative(-0.14f, 0.14f, -0.3f, 0.21f, -0.49f, 0.21f)
                curveToRelative(-0.19f, 0.0f, -0.35f, -0.07f, -0.47f, -0.21f)
                curveTo(19.24f, 9.89f, 19.17f, 9.72f, 19.17f, 9.54f)
                close()
                moveTo(21.17f, 14.41f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.36f, 0.2f, -0.5f)
                curveToRelative(0.13f, -0.14f, 0.3f, -0.21f, 0.49f, -0.21f)
                curveToRelative(0.18f, 0.0f, 0.34f, 0.07f, 0.47f, 0.21f)
                curveToRelative(0.13f, 0.14f, 0.2f, 0.3f, 0.2f, 0.5f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.29f, 0.2f, -0.47f, 0.2f)
                curveToRelative(-0.19f, 0.0f, -0.36f, -0.07f, -0.49f, -0.2f)
                curveTo(21.24f, 14.75f, 21.17f, 14.59f, 21.17f, 14.41f)
                close()
            }
        }
        .build()
        return _snowflakeCold!!
    }

private var _snowflakeCold: ImageVector? = null