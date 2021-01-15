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

public val SimpleIcons.Iata: ImageVector
    get() {
        if (_iata != null) {
            return _iata!!
        }
        _iata = Builder(name = "Iata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.417f, 19.695f)
                lineToRelative(0.98f, -4.885f)
                lineTo(5.99f, 14.81f)
                lineToRelative(-0.973f, 4.884f)
                close()
                moveTo(8.225f, 18.095f)
                horizontalLineToRelative(1.012f)
                lineToRelative(-0.26f, -1.792f)
                close()
                moveTo(5.99f, 19.695f)
                lineToRelative(2.412f, -4.885f)
                horizontalLineToRelative(1.57f)
                lineToRelative(0.99f, 4.884f)
                lineTo(9.487f, 19.694f)
                lineToRelative(-0.088f, -0.58f)
                lineTo(7.827f, 19.114f)
                lineToRelative(-0.25f, 0.58f)
                close()
                moveTo(12.429f, 19.695f)
                lineToRelative(0.547f, -3.674f)
                horizontalLineToRelative(-1.394f)
                lineToRelative(0.238f, -1.233f)
                horizontalLineToRelative(4.28f)
                lineToRelative(-0.237f, 1.233f)
                horizontalLineToRelative(-1.327f)
                lineTo(14.0f, 19.695f)
                close()
                moveTo(17.783f, 18.095f)
                horizontalLineToRelative(1.012f)
                lineToRelative(-0.26f, -1.792f)
                close()
                moveTo(15.553f, 19.695f)
                lineToRelative(2.407f, -4.885f)
                horizontalLineToRelative(1.57f)
                lineToRelative(0.99f, 4.884f)
                horizontalLineToRelative(-1.487f)
                lineToRelative(-0.073f, -0.58f)
                horizontalLineToRelative(-1.57f)
                lineToRelative(-0.25f, 0.58f)
                close()
                moveTo(24.0f, 9.289f)
                horizontalLineToRelative(-7.495f)
                curveToRelative(-0.276f, 1.372f, -1.228f, 2.517f, -3.125f, 3.308f)
                curveToRelative(0.215f, 0.652f, 0.95f, 1.255f, 1.714f, 1.255f)
                horizontalLineToRelative(4.066f)
                curveToRelative(0.62f, 0.0f, 1.112f, -0.52f, 1.31f, -0.94f)
                horizontalLineToRelative(-4.13f)
                curveToRelative(-0.254f, -0.044f, -0.265f, -0.25f, -0.01f, -0.271f)
                horizontalLineToRelative(4.06f)
                curveToRelative(0.524f, 0.0f, 1.0f, -0.448f, 1.276f, -0.935f)
                horizontalLineToRelative(-4.73f)
                curveToRelative(-0.237f, -0.04f, -0.237f, -0.238f, 0.0f, -0.277f)
                horizontalLineToRelative(4.77f)
                curveToRelative(0.48f, 0.0f, 0.918f, -0.558f, 1.1f, -0.934f)
                horizontalLineToRelative(-5.232f)
                curveToRelative(-0.26f, -0.033f, -0.26f, -0.277f, 0.0f, -0.282f)
                lineTo(22.9f, 10.213f)
                curveToRelative(0.415f, 0.0f, 0.819f, -0.454f, 1.1f, -0.924f)
                close()
                moveTo(0.0f, 9.289f)
                horizontalLineToRelative(7.495f)
                curveToRelative(0.27f, 1.372f, 1.228f, 2.517f, 3.12f, 3.308f)
                curveToRelative(-0.216f, 0.652f, -0.952f, 1.255f, -1.715f, 1.255f)
                lineTo(4.84f, 13.852f)
                curveToRelative(-0.62f, 0.0f, -1.112f, -0.52f, -1.311f, -0.94f)
                horizontalLineToRelative(4.13f)
                curveToRelative(0.25f, -0.044f, 0.266f, -0.25f, 0.01f, -0.271f)
                lineTo(3.608f, 12.641f)
                curveToRelative(-0.525f, 0.0f, -1.0f, -0.448f, -1.272f, -0.935f)
                lineTo(7.07f, 11.706f)
                curveToRelative(0.238f, -0.04f, 0.238f, -0.238f, 0.0f, -0.277f)
                lineTo(2.3f, 11.429f)
                curveToRelative(-0.481f, 0.0f, -0.918f, -0.558f, -1.1f, -0.934f)
                horizontalLineToRelative(5.232f)
                curveToRelative(0.26f, -0.033f, 0.26f, -0.277f, 0.0f, -0.282f)
                lineTo(1.106f, 10.213f)
                curveToRelative(-0.42f, 0.0f, -0.824f, -0.454f, -1.106f, -0.924f)
                close()
                moveTo(9.569f, 5.175f)
                curveToRelative(0.277f, 0.238f, 0.586f, 0.448f, 0.918f, 0.58f)
                curveToRelative(0.282f, -0.553f, 0.675f, -1.028f, 1.129f, -1.45f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, -2.047f, 0.87f)
                close()
                moveTo(8.242f, 7.902f)
                horizontalLineToRelative(1.67f)
                arcToRelative(5.358f, 5.358f, 0.0f, false, true, 0.454f, -1.91f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, true, -1.002f, -0.63f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, -1.122f, 2.54f)
                close()
                moveTo(11.87f, 6.335f)
                lineTo(11.87f, 7.9f)
                lineTo(10.2f, 7.9f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, true, 0.414f, -1.815f)
                curveToRelative(0.399f, 0.143f, 0.83f, 0.237f, 1.256f, 0.25f)
                close()
                moveTo(14.43f, 5.174f)
                arcToRelative(3.346f, 3.346f, 0.0f, false, true, -0.917f, 0.58f)
                arcToRelative(5.243f, 5.243f, 0.0f, false, false, -1.134f, -1.443f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, true, 2.052f, 0.863f)
                close()
                moveTo(15.754f, 7.9f)
                horizontalLineToRelative(-1.665f)
                arcToRelative(5.096f, 5.096f, 0.0f, false, false, -0.442f, -1.91f)
                curveToRelative(0.354f, -0.165f, 0.69f, -0.375f, 0.984f, -0.63f)
                arcToRelative(3.723f, 3.723f, 0.0f, false, true, 1.123f, 2.54f)
                close()
                moveTo(12.14f, 6.335f)
                lineTo(12.14f, 7.9f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.0f, -0.631f, -0.155f, -1.234f, -0.415f, -1.815f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, -1.245f, 0.25f)
                close()
                moveTo(9.569f, 10.905f)
                curveToRelative(0.277f, -0.216f, 0.597f, -0.454f, 0.918f, -0.57f)
                curveToRelative(0.299f, 0.559f, 0.67f, 1.018f, 1.129f, 1.433f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.047f, -0.863f)
                close()
                moveTo(8.242f, 8.173f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.039f, 0.69f, 0.182f, 1.3f, 0.454f, 1.924f)
                arcToRelative(4.202f, 4.202f, 0.0f, false, false, -1.002f, 0.625f)
                arcToRelative(3.864f, 3.864f, 0.0f, false, true, -1.122f, -2.55f)
                close()
                moveTo(11.87f, 9.743f)
                verticalLineToRelative(-1.57f)
                lineTo(10.2f, 8.173f)
                curveToRelative(0.01f, 0.63f, 0.154f, 1.255f, 0.414f, 1.814f)
                curveToRelative(0.399f, -0.144f, 0.83f, -0.232f, 1.256f, -0.244f)
                close()
                moveTo(14.43f, 10.905f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -0.917f, -0.57f)
                arcToRelative(5.113f, 5.113f, 0.0f, false, true, -1.134f, 1.433f)
                arcToRelative(4.088f, 4.088f, 0.0f, false, false, 2.052f, -0.863f)
                close()
                moveTo(15.753f, 8.173f)
                horizontalLineToRelative(-1.665f)
                arcToRelative(5.075f, 5.075f, 0.0f, false, true, -0.442f, 1.924f)
                curveToRelative(0.354f, 0.166f, 0.674f, 0.366f, 0.984f, 0.625f)
                arcToRelative(3.806f, 3.806f, 0.0f, false, false, 1.123f, -2.55f)
                close()
                moveTo(12.141f, 9.743f)
                verticalLineToRelative(-1.57f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.0f, 0.63f, -0.155f, 1.244f, -0.415f, 1.814f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -1.245f, -0.244f)
                close()
                moveTo(11.87f, 4.467f)
                arcToRelative(4.387f, 4.387f, 0.0f, false, false, -1.123f, 1.382f)
                curveToRelative(0.36f, 0.122f, 0.74f, 0.222f, 1.123f, 0.222f)
                close()
                moveTo(12.14f, 4.467f)
                curveToRelative(0.444f, 0.365f, 0.847f, 0.846f, 1.113f, 1.382f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, -1.112f, 0.222f)
                close()
                moveTo(11.87f, 11.613f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, true, -1.123f, -1.388f)
                curveToRelative(0.36f, -0.128f, 0.74f, -0.2f, 1.123f, -0.2f)
                close()
                moveTo(12.14f, 11.623f)
                curveToRelative(0.444f, -0.37f, 0.847f, -0.867f, 1.113f, -1.4f)
                arcToRelative(3.715f, 3.715f, 0.0f, false, false, -1.112f, -0.197f)
                close()
            }
        }
        .build()
        return _iata!!
    }

private var _iata: ImageVector? = null
