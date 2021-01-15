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

public val SimpleIcons.Greensock: ImageVector
    get() {
        if (_greensock != null) {
            return _greensock!!
        }
        _greensock = Builder(name = "Greensock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.21f, 0.0f)
                curveToRelative(-0.545f, 0.003f, -1.084f, 0.134f, -1.256f, 0.367f)
                curveToRelative(-0.11f, 0.165f, -0.192f, 1.196f, -0.11f, 1.718f)
                curveToRelative(0.0f, 0.0f, 0.032f, 0.345f, 0.09f, 0.614f)
                arcToRelative(14.6f, 14.6f, 0.0f, false, true, -0.02f, 0.182f)
                arcToRelative(7.024f, 7.024f, 0.0f, false, true, -0.097f, 0.605f)
                curveToRelative(-0.01f, 0.056f, -0.207f, 0.095f, -0.425f, 0.152f)
                arcToRelative(2.495f, 2.495f, 0.0f, false, false, -0.138f, -0.042f)
                curveToRelative(-0.234f, -0.069f, -0.385f, 0.123f, -0.618f, 0.26f)
                curveToRelative(-0.069f, -0.04f, -0.371f, -0.178f, -0.536f, -0.082f)
                curveToRelative(-0.165f, 0.096f, -0.275f, 0.193f, -0.44f, 0.261f)
                curveToRelative(-0.082f, -0.041f, -0.302f, -0.041f, -0.48f, 0.028f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.483f, 0.278f)
                curveToRelative(-2.314f, 0.58f, -4.813f, 1.635f, -5.012f, 1.741f)
                curveToRelative(-1.017f, 0.522f, -2.679f, 1.415f, -3.434f, 2.033f)
                curveToRelative(-1.291f, 1.071f, -2.06f, 2.322f, -2.363f, 3.242f)
                curveToRelative(-0.385f, 1.14f, -0.275f, 1.827f, 0.096f, 1.387f)
                curveToRelative(0.298f, -0.366f, 1.632f, -1.454f, 2.475f, -1.999f)
                lineToRelative(-0.002f, 0.007f)
                arcToRelative(3.219f, 3.219f, 0.0f, false, true, 0.44f, -0.26f)
                lineToRelative(0.233f, -0.124f)
                lineToRelative(0.505f, -0.323f)
                curveToRelative(0.602f, 0.552f, 0.803f, 1.433f, 0.937f, 2.63f)
                curveToRelative(0.22f, 1.841f, 1.704f, 2.693f, 3.434f, 2.72f)
                curveToRelative(1.8f, 0.028f, 2.446f, 0.399f, 3.119f, 1.305f)
                curveToRelative(0.153f, 0.201f, 0.318f, 0.307f, 0.47f, 0.368f)
                arcToRelative(1.954f, 1.954f, 0.0f, false, false, -0.16f, 0.405f)
                curveToRelative(-0.075f, 0.17f, -0.125f, 0.38f, -0.157f, 0.608f)
                arcToRelative(0.157f, 0.157f, 0.0f, false, false, -0.03f, 0.075f)
                curveToRelative(-0.068f, 0.536f, -0.055f, 1.8f, -0.068f, 2.473f)
                curveToRelative(-0.014f, 0.673f, -0.028f, 0.77f, -0.083f, 0.866f)
                curveToRelative(-0.055f, 0.11f, -0.11f, 0.178f, -0.178f, 0.467f)
                curveToRelative(-0.069f, 0.302f, -0.193f, 0.384f, -0.316f, 0.631f)
                curveToRelative(-0.206f, 0.385f, -0.165f, 0.81f, 0.041f, 1.003f)
                curveToRelative(0.206f, 0.192f, 0.77f, 0.481f, 1.538f, 0.385f)
                curveToRelative(0.77f, -0.096f, 0.88f, -0.151f, 0.756f, -0.893f)
                curveToRelative(-0.014f, -0.11f, -0.192f, -0.605f, -0.137f, -0.797f)
                curveToRelative(0.082f, -0.206f, -0.096f, -0.563f, -0.055f, -0.577f)
                curveToRelative(0.041f, -0.014f, 0.096f, -0.288f, 0.096f, -0.426f)
                curveToRelative(0.0f, -0.137f, -0.014f, -0.796f, 0.137f, -1.14f)
                curveToRelative(0.062f, -0.14f, 0.193f, -0.46f, 0.326f, -0.785f)
                curveToRelative(0.442f, -0.723f, 0.459f, -1.161f, 0.48f, -1.41f)
                curveToRelative(0.03f, -0.202f, 0.046f, -0.46f, 0.018f, -0.744f)
                curveToRelative(0.055f, -0.083f, 0.289f, -0.275f, 0.316f, -0.646f)
                curveToRelative(0.0f, 0.0f, 0.644f, -0.337f, 1.102f, -1.148f)
                curveToRelative(0.16f, 0.557f, 0.31f, 0.91f, 0.286f, 1.272f)
                curveToRelative(-0.499f, 0.39f, -0.684f, 0.678f, -0.76f, 0.959f)
                curveToRelative(-0.048f, -0.02f, -0.076f, -0.037f, -0.11f, -0.04f)
                horizontalLineToRelative(-0.027f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, -0.106f, 0.029f)
                curveToRelative(-0.192f, 0.068f, -0.041f, 1.318f, 0.165f, 1.827f)
                curveToRelative(0.206f, 0.508f, 0.316f, 0.81f, 0.398f, 1.36f)
                curveToRelative(0.083f, 0.549f, -0.192f, 1.222f, -0.302f, 1.524f)
                curveToRelative(0.0f, 0.0f, -0.179f, 0.536f, 0.233f, 0.824f)
                curveToRelative(0.358f, 0.248f, 1.704f, 0.18f, 2.308f, 0.18f)
                curveToRelative(0.605f, 0.0f, 1.511f, 0.219f, 2.088f, 0.109f)
                curveToRelative(0.715f, -0.124f, 0.824f, -0.55f, 0.399f, -0.77f)
                curveToRelative(-0.426f, -0.22f, -1.072f, -0.329f, -1.91f, -0.933f)
                curveToRelative(-0.22f, -0.152f, -0.522f, -0.289f, -0.563f, -0.412f)
                curveToRelative(-0.041f, -0.124f, -0.041f, -0.838f, -0.027f, -1.457f)
                curveToRelative(0.013f, -0.618f, 0.22f, -1.414f, 0.288f, -1.84f)
                curveToRelative(0.064f, -0.398f, -0.076f, -0.388f, -0.262f, -0.351f)
                curveToRelative(0.032f, -0.147f, 0.066f, -0.292f, 0.097f, -0.446f)
                curveToRelative(0.344f, -0.632f, 0.193f, -1.223f, 0.193f, -1.223f)
                curveToRelative(0.82f, -1.044f, 0.4f, -3.27f, 0.22f, -4.048f)
                curveToRelative(0.64f, 0.303f, 0.96f, 0.188f, 0.96f, 0.188f)
                curveToRelative(0.102f, -0.055f, 0.192f, -0.134f, 0.274f, -0.224f)
                curveToRelative(0.337f, -0.362f, 0.51f, -0.916f, 0.51f, -0.916f)
                lineTo(21.573f, 11.0f)
                curveToRelative(0.782f, -0.783f, 1.151f, -1.936f, 0.26f, -2.692f)
                arcToRelative(1.331f, 1.331f, 0.0f, false, false, -0.219f, -1.263f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, false, -0.37f, -1.731f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, false, -0.487f, -0.297f)
                curveToRelative(-0.2f, -0.295f, -0.245f, -0.417f, -0.572f, -0.349f)
                curveToRelative(-0.15f, -0.165f, -0.178f, -0.288f, -0.494f, -0.178f)
                curveToRelative(0.0f, 0.0f, -0.096f, -0.234f, -0.275f, -0.289f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.05f, -0.015f)
                curveToRelative(-0.302f, -0.21f, -0.576f, -0.215f, -0.772f, -0.16f)
                curveToRelative(-0.064f, -0.048f, -0.061f, -0.124f, -0.07f, -0.388f)
                curveToRelative(-0.008f, -0.2f, -0.019f, -0.486f, -0.031f, -0.744f)
                curveToRelative(0.027f, -0.328f, 0.102f, -0.974f, 0.126f, -1.303f)
                curveToRelative(0.028f, -0.37f, 0.042f, -0.948f, -0.123f, -1.195f)
                curveTo(18.303f, 0.12f, 17.754f, -0.003f, 17.21f, 0.0f)
                close()
                moveTo(17.205f, 0.34f)
                curveToRelative(0.7f, 0.0f, 1.002f, 0.22f, 1.044f, 0.343f)
                curveToRelative(0.013f, 0.028f, 0.082f, 0.495f, 0.04f, 0.797f)
                curveToRelative(-0.013f, 0.11f, -0.027f, 0.509f, -0.054f, 0.687f)
                curveToRelative(-0.014f, 0.179f, -0.069f, 0.385f, -0.124f, 0.673f)
                curveToRelative(-0.041f, 0.234f, -0.233f, 0.495f, -0.384f, 0.536f)
                curveToRelative(-0.261f, 0.069f, -0.742f, 0.055f, -1.017f, 0.0f)
                curveToRelative(-0.069f, -0.014f, -0.124f, -0.055f, -0.192f, -0.096f)
                curveToRelative(-0.151f, -0.248f, -0.234f, -0.44f, -0.261f, -0.742f)
                curveToRelative(-0.028f, -0.289f, -0.083f, -0.412f, -0.096f, -0.632f)
                curveToRelative(-0.014f, -0.33f, -0.014f, -0.55f, -0.014f, -0.55f)
                curveToRelative(0.014f, -0.178f, 0.069f, -0.618f, 0.069f, -0.659f)
                curveToRelative(0.013f, -0.123f, 0.233f, -0.357f, 0.989f, -0.357f)
                close()
                moveTo(16.072f, 3.042f)
                curveToRelative(0.146f, 0.149f, 0.301f, 0.306f, 0.432f, 0.416f)
                curveToRelative(0.124f, 0.11f, 0.426f, 0.096f, 0.7f, 0.096f)
                curveToRelative(0.248f, 0.0f, 0.468f, 0.028f, 0.564f, -0.027f)
                curveToRelative(0.154f, -0.077f, 0.355f, -0.235f, 0.523f, -0.394f)
                curveToRelative(0.011f, 0.152f, 0.022f, 0.304f, 0.026f, 0.435f)
                curveToRelative(0.01f, 0.295f, -0.043f, 0.468f, 0.024f, 0.57f)
                curveToRelative(-0.082f, 0.048f, -0.174f, 0.105f, -0.269f, 0.156f)
                curveToRelative(-0.151f, 0.08f, -0.306f, 0.136f, -0.403f, 0.115f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.209f, -0.035f, -0.931f, -0.215f, -1.331f, -0.407f)
                curveToRelative(-0.167f, -0.259f, -0.335f, -0.398f, -0.326f, -0.448f)
                curveToRelative(0.027f, -0.137f, 0.04f, -0.247f, 0.054f, -0.425f)
                curveToRelative(0.004f, -0.03f, 0.005f, -0.058f, 0.008f, -0.088f)
                close()
                moveTo(15.219f, 3.732f)
                lineToRelative(0.035f, 0.001f)
                curveToRelative(0.424f, 0.036f, 0.65f, 0.152f, 0.808f, 0.284f)
                lineToRelative(0.076f, 0.03f)
                lineToRelative(0.008f, -0.027f)
                curveToRelative(0.047f, 0.03f, 0.102f, 0.06f, 0.162f, 0.088f)
                curveToRelative(0.47f, 0.159f, 1.104f, 0.308f, 1.309f, 0.353f)
                curveToRelative(0.247f, 0.055f, 0.645f, -0.192f, 0.838f, -0.316f)
                curveToRelative(0.343f, -0.22f, 0.783f, -0.04f, 0.989f, 0.193f)
                curveToRelative(0.137f, 0.15f, 0.192f, 0.247f, 0.192f, 0.288f)
                curveToRelative(0.316f, -0.11f, 0.357f, 0.041f, 0.508f, 0.206f)
                curveToRelative(0.385f, -0.179f, 0.412f, 0.041f, 0.44f, 0.137f)
                curveToRelative(-0.122f, 0.0f, -0.298f, 0.014f, -0.538f, 0.04f)
                lineToRelative(-0.012f, -0.012f)
                curveToRelative(-0.144f, -0.153f, -0.402f, -0.289f, -0.599f, -0.384f)
                curveToRelative(-0.087f, -0.031f, -0.18f, -0.049f, -0.252f, -0.097f)
                curveToRelative(-0.11f, -0.055f, -0.22f, -0.137f, -0.385f, -0.123f)
                curveToRelative(-0.687f, 0.082f, -0.824f, 0.315f, -1.415f, 0.178f)
                curveToRelative(-0.577f, -0.134f, -0.737f, -0.254f, -1.333f, -0.221f)
                lineToRelative(0.001f, 0.026f)
                curveToRelative(-0.105f, 0.016f, -0.2f, 0.03f, -0.22f, 0.03f)
                curveToRelative(-0.206f, 0.012f, -0.722f, 0.067f, -1.153f, -0.1f)
                arcToRelative(1.256f, 1.256f, 0.0f, false, false, -0.161f, -0.076f)
                lineToRelative(-0.005f, -0.002f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.18f, -0.07f, -0.39f, -0.11f, -0.63f, -0.112f)
                horizontalLineToRelative(-0.026f)
                curveToRelative(0.218f, -0.11f, 0.356f, -0.259f, 0.56f, -0.218f)
                curveToRelative(0.22f, 0.041f, 0.44f, 0.22f, 0.564f, 0.357f)
                arcToRelative(0.858f, 0.858f, 0.0f, false, false, -0.178f, -0.288f)
                curveToRelative(0.128f, -0.09f, 0.245f, -0.229f, 0.418f, -0.234f)
                close()
                moveTo(14.119f, 4.277f)
                curveToRelative(0.15f, 0.002f, 0.28f, 0.026f, 0.417f, 0.073f)
                curveToRelative(0.018f, 0.009f, 0.034f, 0.018f, 0.059f, 0.029f)
                curveToRelative(0.288f, 0.137f, 0.81f, 0.164f, 1.25f, 0.137f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 0.563f, -0.095f)
                curveToRelative(0.322f, 0.024f, 0.514f, 0.11f, 0.977f, 0.216f)
                curveToRelative(0.31f, 0.07f, 0.502f, 0.045f, 0.695f, -0.007f)
                curveToRelative(0.193f, -0.053f, 0.386f, -0.13f, 0.723f, -0.17f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, 0.188f, 0.013f)
                curveToRelative(0.038f, 0.02f, 0.075f, 0.04f, 0.11f, 0.061f)
                curveToRelative(0.062f, 0.049f, 0.214f, 0.135f, 0.343f, 0.189f)
                curveToRelative(0.164f, 0.068f, 0.59f, 0.357f, 0.645f, 0.425f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.038f, 0.03f)
                curveToRelative(0.242f, 0.314f, 0.407f, 0.755f, 0.396f, 1.21f)
                curveToRelative(-0.06f, 0.46f, -0.426f, 0.214f, -0.626f, 0.12f)
                curveToRelative(-0.412f, -0.178f, -0.824f, -0.302f, -1.305f, -0.302f)
                curveToRelative(-0.48f, 0.0f, -1.099f, 0.041f, -1.635f, 0.179f)
                curveToRelative(-0.741f, 0.206f, -0.961f, 0.192f, -1.29f, 0.027f)
                curveToRelative(-0.33f, -0.178f, -0.907f, -0.618f, -0.907f, -0.618f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.007f, -0.007f, -0.012f, -0.012f, -0.014f, -0.01f)
                curveToRelative(-0.042f, 0.069f, -0.138f, 0.247f, -0.193f, 0.33f)
                curveToRelative(-0.027f, 0.522f, -0.343f, 1.346f, -0.934f, 1.552f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, -0.467f, -0.041f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, false, -0.55f, -0.275f)
                curveToRelative(0.481f, 0.384f, 0.729f, 0.673f, 0.949f, 1.181f)
                curveToRelative(0.174f, 0.43f, 0.415f, 1.017f, 1.002f, 1.646f)
                curveToRelative(0.363f, -0.004f, 0.725f, 0.097f, 0.962f, 0.346f)
                curveToRelative(0.137f, 0.137f, 0.357f, 0.289f, 0.33f, 0.426f)
                curveToRelative(0.0f, 0.041f, -0.083f, 0.151f, -0.151f, 0.234f)
                arcToRelative(3.231f, 3.231f, 0.0f, false, true, -0.207f, 0.22f)
                curveToRelative(-0.054f, 0.04f, -0.247f, 0.192f, -0.288f, 0.22f)
                curveToRelative(-0.041f, 0.027f, -0.096f, 0.095f, -0.137f, 0.109f)
                curveToRelative(-0.138f, 0.069f, -0.289f, 0.014f, -0.426f, -0.055f)
                reflectiveCurveToRelative(0.027f, -0.082f, -0.124f, -0.192f)
                curveToRelative(-0.34f, -0.24f, -0.541f, -0.411f, -0.454f, -0.832f)
                curveToRelative(-0.932f, -0.794f, -2.561f, -1.26f, -2.911f, -2.108f)
                curveToRelative(-0.22f, -0.55f, -0.248f, -0.824f, -0.042f, -1.058f)
                curveToRelative(0.605f, -0.687f, 0.371f, -1.346f, 0.825f, -1.634f)
                curveToRelative(0.425f, -0.275f, 0.783f, 0.04f, 0.989f, 0.33f)
                curveToRelative(-0.124f, -0.509f, -0.55f, -0.633f, -0.55f, -0.674f)
                curveToRelative(0.0f, -0.632f, 0.605f, -1.071f, 1.21f, -1.181f)
                curveToRelative(0.218f, -0.041f, 0.389f, -0.062f, 0.54f, -0.06f)
                close()
                moveTo(12.272f, 4.811f)
                curveToRelative(-0.14f, 0.196f, -0.231f, 0.435f, -0.246f, 0.721f)
                curveToRelative(-0.206f, 0.028f, -0.673f, 0.055f, -0.907f, 0.907f)
                arcToRelative(3.39f, 3.39f, 0.0f, false, true, -0.214f, 0.62f)
                curveToRelative(-0.103f, 0.045f, -2.946f, 1.274f, -5.229f, 2.542f)
                lineToRelative(-0.01f, -0.007f)
                curveToRelative(-0.32f, 0.18f, -0.627f, 0.363f, -0.919f, 0.546f)
                lineToRelative(-0.125f, 0.077f)
                lineToRelative(-0.001f, 0.003f)
                curveToRelative(-1.136f, 0.723f, -2.04f, 1.45f, -2.637f, 2.112f)
                curveToRelative(0.412f, -2.679f, 2.528f, -4.08f, 3.53f, -4.698f)
                curveToRelative(2.42f, -1.489f, 4.629f, -2.225f, 6.758f, -2.823f)
                close()
                moveTo(20.309f, 5.134f)
                curveToRelative(0.26f, -0.004f, 0.536f, 0.06f, 0.756f, 0.275f)
                curveToRelative(0.59f, 0.577f, 0.425f, 1.209f, 0.247f, 1.648f)
                curveToRelative(0.15f, 0.179f, 0.508f, 0.687f, 0.288f, 1.291f)
                curveToRelative(-0.04f, 0.138f, -0.343f, 0.138f, -0.563f, 0.495f)
                curveToRelative(0.55f, -0.316f, 0.893f, -0.233f, 1.017f, 0.165f)
                curveToRelative(0.192f, 0.618f, -0.234f, 1.36f, -0.605f, 1.772f)
                curveToRelative(0.0f, -0.014f, -0.014f, -0.028f, -0.014f, -0.041f)
                curveToRelative(-0.055f, 0.206f, -0.123f, 0.604f, -0.535f, 1.044f)
                curveToRelative(-0.206f, 0.22f, -0.371f, 0.192f, -0.605f, 0.137f)
                curveToRelative(-0.215f, -0.054f, -0.322f, -0.142f, -0.543f, -0.276f)
                curveToRelative(-0.036f, -0.207f, -0.102f, -0.482f, -0.102f, -0.59f)
                curveToRelative(0.0f, -0.044f, -0.004f, -0.141f, -0.01f, -0.243f)
                curveToRelative(0.032f, -0.036f, 0.066f, -0.074f, 0.106f, -0.114f)
                curveToRelative(0.0f, 0.0f, 0.178f, -0.247f, 0.44f, -0.233f)
                curveToRelative(0.26f, 0.014f, 0.535f, -0.041f, 0.604f, -0.11f)
                curveToRelative(0.0f, -0.48f, -0.55f, -0.494f, -0.357f, -1.319f)
                curveToRelative(0.013f, -0.04f, 0.082f, -0.11f, 0.302f, -0.137f)
                curveToRelative(-0.33f, -0.069f, -0.48f, -0.083f, -0.714f, -0.302f)
                lineToRelative(-0.013f, -0.013f)
                curveToRelative(0.11f, -0.253f, 0.224f, -0.457f, 0.301f, -0.605f)
                curveToRelative(0.193f, -0.385f, 0.082f, -0.852f, 0.082f, -0.852f)
                curveToRelative(0.207f, -0.069f, 0.385f, -0.179f, 0.413f, -0.247f)
                curveToRelative(0.203f, -0.673f, -0.164f, -1.322f, -0.605f, -1.74f)
                curveToRelative(0.036f, -0.003f, 0.073f, -0.005f, 0.11f, -0.006f)
                close()
                moveTo(14.849f, 6.059f)
                curveToRelative(0.01f, 0.016f, 0.02f, 0.033f, 0.034f, 0.05f)
                curveToRelative(0.179f, 0.22f, 0.577f, 0.495f, 1.113f, 0.673f)
                curveToRelative(0.26f, 0.083f, 0.467f, 0.028f, 0.7f, -0.027f)
                curveToRelative(1.123f, -0.278f, 2.304f, -0.346f, 3.33f, 0.155f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -0.157f, 1.068f)
                curveToRelative(-0.232f, 0.465f, -0.533f, 1.068f, -0.48f, 2.215f)
                curveToRelative(-0.246f, 0.044f, -1.419f, 0.144f, -1.992f, 0.037f)
                curveToRelative(-0.521f, -0.097f, -1.416f, -0.525f, -1.62f, -0.69f)
                arcToRelative(6.703f, 6.703f, 0.0f, false, true, -0.125f, -0.848f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 0.454f, -0.343f)
                curveToRelative(-0.412f, 0.068f, -0.577f, 0.04f, -0.825f, -0.097f)
                curveToRelative(-0.235f, -0.13f, -0.642f, -0.533f, -0.87f, -0.82f)
                curveToRelative(0.229f, -0.29f, 0.393f, -0.69f, 0.335f, -1.226f)
                curveToRelative(0.037f, -0.05f, 0.07f, -0.099f, 0.102f, -0.147f)
                close()
                moveTo(10.469f, 7.657f)
                curveToRelative(-0.09f, 0.253f, 0.093f, 0.654f, 0.224f, 0.953f)
                curveToRelative(0.508f, 1.179f, 2.07f, 1.29f, 3.127f, 2.18f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, 0.06f, 0.388f)
                curveToRelative(0.083f, 0.165f, 0.371f, 0.413f, 0.371f, 0.413f)
                curveToRelative(-0.055f, 0.054f, -0.027f, 0.164f, -0.027f, 0.164f)
                curveToRelative(0.204f, 0.217f, 0.504f, 0.243f, 0.547f, 0.246f)
                curveToRelative(-0.435f, 1.248f, -0.816f, 2.626f, -0.451f, 4.095f)
                curveToRelative(-0.179f, 0.244f, -0.368f, 0.445f, -0.531f, 0.668f)
                arcToRelative(0.851f, 0.851f, 0.0f, false, true, -0.444f, -0.31f)
                curveToRelative(-0.591f, -0.852f, -1.457f, -1.416f, -3.023f, -1.374f)
                curveToRelative(-2.349f, 0.055f, -3.283f, -0.907f, -3.461f, -2.748f)
                curveToRelative(-0.094f, -0.974f, -0.357f, -1.922f, -0.888f, -2.479f)
                curveTo(7.489f, 9.014f, 9.6f, 7.937f, 10.268f, 7.73f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.2f, -0.073f)
                close()
                moveTo(13.965f, 7.837f)
                curveToRelative(0.381f, 0.442f, 0.795f, 0.727f, 1.193f, 0.979f)
                curveToRelative(0.082f, 0.343f, 0.11f, 0.577f, 0.192f, 1.03f)
                horizontalLineToRelative(-0.041f)
                lineToRelative(-0.027f, 0.308f)
                arcToRelative(2.836f, 2.836f, 0.0f, false, false, -0.62f, -0.113f)
                lineToRelative(0.001f, -0.003f)
                curveToRelative(-0.893f, -1.057f, -0.7f, -1.47f, -1.058f, -2.019f)
                curveToRelative(0.097f, -0.034f, 0.225f, -0.094f, 0.36f, -0.182f)
                close()
                moveTo(19.876f, 8.923f)
                curveToRelative(0.076f, 0.067f, 0.178f, 0.12f, 0.323f, 0.154f)
                curveToRelative(-0.327f, 0.68f, 0.33f, 0.912f, 0.37f, 1.17f)
                curveToRelative(-0.143f, 0.083f, -0.367f, 0.037f, -0.603f, 0.025f)
                curveToRelative(-0.115f, -0.006f, -0.229f, 0.065f, -0.321f, 0.147f)
                lineToRelative(0.032f, -0.367f)
                curveToRelative(0.006f, -0.43f, 0.09f, -0.809f, 0.2f, -1.13f)
                close()
                moveTo(15.79f, 9.947f)
                curveToRelative(0.024f, 0.035f, 0.178f, 0.131f, 1.002f, 0.352f)
                curveToRelative(1.026f, 0.275f, 2.323f, 0.12f, 2.55f, 0.09f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, -0.022f, 0.089f)
                curveToRelative(0.0f, 0.343f, 0.055f, 0.59f, 0.096f, 0.81f)
                curveToRelative(0.053f, 0.308f, 0.13f, 0.533f, 0.163f, 0.74f)
                lineToRelative(0.008f, -0.007f)
                curveToRelative(0.234f, 1.367f, 0.561f, 3.133f, -0.267f, 4.048f)
                curveToRelative(0.041f, 0.192f, 0.069f, 0.467f, 0.014f, 0.783f)
                arcToRelative(3.204f, 3.204f, 0.0f, false, true, -0.151f, 0.535f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -0.108f, 0.352f)
                curveToRelative(-1.1f, 0.142f, -1.755f, 0.055f, -2.06f, -0.015f)
                curveToRelative(0.123f, -0.374f, 0.407f, -0.754f, 0.876f, -0.735f)
                curveToRelative(-0.022f, -0.911f, -0.264f, -1.223f, -0.511f, -1.891f)
                curveToRelative(0.395f, -0.883f, 0.299f, -1.665f, 0.621f, -2.848f)
                curveToRelative(-0.247f, 0.261f, -0.44f, 1.209f, -0.604f, 1.786f)
                curveToRelative(-0.206f, 0.838f, -0.563f, 1.648f, -1.525f, 2.294f)
                curveToRelative(0.0f, 0.22f, -0.069f, 0.384f, -0.151f, 0.494f)
                curveToRelative(-0.179f, 0.261f, -0.412f, 0.344f, -0.494f, 0.77f)
                curveToRelative(0.11f, -0.138f, 0.26f, -0.261f, 0.26f, -0.22f)
                arcToRelative(8.51f, 8.51f, 0.0f, false, true, -0.025f, 0.493f)
                lineToRelative(0.012f, 0.001f)
                curveToRelative(-0.165f, 1.044f, -0.522f, 1.525f, -0.742f, 2.115f)
                curveToRelative(-0.151f, 0.426f, -0.096f, 1.36f, -0.151f, 1.374f)
                curveToRelative(-0.385f, 0.083f, -0.975f, -0.068f, -1.14f, -0.15f)
                curveToRelative(0.162f, -1.14f, 0.019f, -2.278f, 0.436f, -3.6f)
                lineToRelative(-0.015f, -0.006f)
                curveToRelative(0.16f, -0.554f, 0.478f, -0.878f, 0.939f, -1.464f)
                curveToRelative(-0.161f, -0.52f, -0.532f, -1.64f, 0.266f, -4.182f)
                curveToRelative(0.033f, -0.014f, 0.067f, -0.03f, 0.105f, -0.049f)
                lineToRelative(0.206f, -0.137f)
                curveToRelative(0.04f, -0.028f, 0.096f, -0.069f, 0.137f, -0.096f)
                curveToRelative(0.069f, -0.042f, 0.371f, -0.371f, 0.412f, -0.412f)
                curveToRelative(0.096f, -0.097f, 0.165f, -0.124f, 0.192f, -0.234f)
                curveToRelative(0.055f, -0.206f, -0.247f, -0.412f, -0.37f, -0.55f)
                curveToRelative(-0.018f, -0.019f, -0.03f, -0.034f, -0.043f, -0.05f)
                curveToRelative(0.013f, -0.039f, 0.027f, -0.077f, 0.042f, -0.114f)
                curveToRelative(0.01f, -0.125f, 0.028f, -0.26f, 0.042f, -0.367f)
                close()
                moveTo(16.673f, 17.889f)
                curveToRelative(0.05f, 0.002f, 0.174f, 0.122f, 0.751f, 0.158f)
                curveToRelative(0.66f, 0.04f, 1.539f, -0.083f, 1.772f, -0.138f)
                curveToRelative(0.234f, -0.055f, 0.097f, 0.11f, 0.069f, 0.275f)
                lineToRelative(-0.026f, 0.169f)
                curveToRelative(-0.399f, 0.134f, -1.008f, 0.188f, -1.416f, 0.202f)
                curveToRelative(-0.393f, 0.013f, -0.846f, -0.012f, -1.161f, -0.11f)
                curveToRelative(-0.048f, -0.26f, -0.063f, -0.47f, -0.007f, -0.55f)
                arcToRelative(0.024f, 0.024f, 0.0f, false, true, 0.018f, -0.006f)
                close()
                moveTo(19.179f, 18.735f)
                curveToRelative(-0.02f, 0.135f, -0.035f, 0.223f, -0.058f, 0.372f)
                curveToRelative(-0.388f, 0.12f, -0.888f, 0.122f, -1.27f, 0.135f)
                arcToRelative(4.413f, 4.413f, 0.0f, false, true, -1.012f, -0.07f)
                arcToRelative(2.065f, 2.065f, 0.0f, false, true, -0.033f, -0.109f)
                arcToRelative(11.343f, 11.343f, 0.0f, false, true, -0.065f, -0.252f)
                curveToRelative(0.179f, 0.034f, 0.53f, 0.079f, 1.15f, 0.087f)
                arcToRelative(4.142f, 4.142f, 0.0f, false, false, 1.288f, -0.163f)
                close()
                moveTo(19.073f, 19.42f)
                curveToRelative(-0.069f, 0.44f, -0.055f, 1.786f, -0.014f, 2.157f)
                curveToRelative(0.014f, 0.11f, 0.948f, 0.522f, 1.277f, 0.77f)
                curveToRelative(0.107f, 0.085f, 0.259f, 0.157f, 0.422f, 0.222f)
                curveToRelative(0.042f, 0.042f, 0.116f, 0.105f, 0.197f, 0.203f)
                curveToRelative(0.162f, 0.213f, 0.052f, 0.436f, -0.135f, 0.526f)
                curveToRelative(-0.264f, -0.007f, -0.568f, -0.052f, -1.074f, -0.128f)
                curveToRelative(-0.695f, -0.104f, -1.129f, -0.101f, -1.73f, -0.106f)
                verticalLineToRelative(-0.003f)
                curveToRelative(-0.152f, -0.275f, -0.056f, -0.728f, -0.056f, -0.728f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.809f, -0.18f)
                lineToRelative(0.012f, -0.026f)
                curveToRelative(0.234f, -0.48f, 0.22f, -0.591f, 0.151f, -1.415f)
                curveToRelative(-0.047f, -0.578f, -0.196f, -0.883f, -0.335f, -1.195f)
                curveToRelative(0.169f, 0.016f, 0.409f, 0.035f, 0.857f, 0.041f)
                arcToRelative(4.567f, 4.567f, 0.0f, false, false, 1.237f, -0.138f)
                close()
                moveTo(13.767f, 21.504f)
                curveToRelative(0.243f, 0.0f, 0.6f, 0.032f, 0.676f, 0.1f)
                verticalLineToRelative(0.014f)
                curveToRelative(0.014f, 0.165f, 0.165f, 0.399f, 0.11f, 0.522f)
                curveToRelative(-0.027f, 0.069f, -0.096f, -0.041f, -0.192f, -0.068f)
                curveToRelative(0.041f, 0.26f, 0.151f, 0.741f, 0.316f, 1.112f)
                curveToRelative(0.11f, 0.248f, 0.041f, 0.426f, -0.33f, 0.495f)
                curveToRelative(-0.33f, 0.014f, -0.755f, 0.0f, -1.112f, -0.083f)
                curveToRelative(-0.412f, -0.206f, -0.55f, -0.316f, -0.467f, -0.7f)
                curveToRelative(0.068f, -0.275f, 0.494f, -0.59f, 0.865f, -0.838f)
                curveToRelative(-0.206f, 0.014f, -0.426f, 0.165f, -0.398f, -0.014f)
                curveToRelative(0.055f, -0.357f, 0.206f, -0.33f, 0.302f, -0.508f)
                curveToRelative(-0.02f, -0.02f, 0.084f, -0.032f, 0.23f, -0.032f)
                close()
            }
        }
        .build()
        return _greensock!!
    }

private var _greensock: ImageVector? = null
