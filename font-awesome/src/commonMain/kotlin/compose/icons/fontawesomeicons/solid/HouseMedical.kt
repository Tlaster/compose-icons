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

public val SolidGroup.HouseMedical: ImageVector
    get() {
        if (_houseMedical != null) {
            return _houseMedical!!
        }
        _houseMedical = Builder(name = "HouseMedical", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(543.8f, 287.6f)
                curveToRelative(17.0f, 0.0f, 32.0f, -14.0f, 32.0f, -32.1f)
                curveToRelative(1.0f, -9.0f, -3.0f, -17.0f, -11.0f, -24.0f)
                lineTo(309.5f, 7.0f)
                curveToRelative(-6.0f, -5.0f, -14.0f, -7.0f, -21.0f, -7.0f)
                reflectiveCurveToRelative(-15.0f, 1.0f, -22.0f, 8.0f)
                lineTo(10.0f, 231.5f)
                curveToRelative(-7.0f, 7.0f, -10.0f, 15.0f, -10.0f, 24.0f)
                curveToRelative(0.0f, 18.0f, 14.0f, 32.1f, 32.0f, 32.1f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 160.4f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.4f, 0.0f)
                curveToRelative(35.5f, 0.0f, 64.2f, -28.8f, 64.0f, -64.3f)
                lineToRelative(-0.7f, -160.2f)
                lineToRelative(32.0f, 0.0f)
                close()
                moveTo(256.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _houseMedical!!
    }

private var _houseMedical: ImageVector? = null
