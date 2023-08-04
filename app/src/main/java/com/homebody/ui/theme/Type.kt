package com.homebody.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.homebody.R

val interFamily = FontFamily(
    Font(resId = R.font.inter_400, weight = FontWeight.W400),
    Font(resId = R.font.inter_500, weight = FontWeight.W500),
    Font(resId = R.font.inter_600, weight = FontWeight.W600)
)

val algebraFamily = FontFamily(
    Font(resId = R.font.algebradisplay_thin, weight = FontWeight.W100)
)

val HomebodyTypography = Typography(
    displayMedium = TextStyle(
        fontFamily = algebraFamily,
        fontWeight = FontWeight.W100,
        letterSpacing = 0.sp,
        lineHeight = 46.6.sp,
        fontSize = 40.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W500,
        letterSpacing = 0.sp,
        lineHeight = 26.6.sp,
        fontSize = 22.sp
    ),
    titleLarge = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W600,
        letterSpacing = 0.sp,
        lineHeight = 21.sp,
        fontSize = 18.sp
    ),
    titleMedium = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W600,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W600,
        letterSpacing = 0.sp,
        lineHeight = 21.sp,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 16.sp,
        fontSize = 15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 15.sp,
        fontSize = 11.sp
    ),
    labelLarge = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W600,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W500,
        letterSpacing = 0.sp,
        lineHeight = 19.sp,
        fontSize = 13.sp
    ),
    labelSmall = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 16.sp,
        fontSize = 13.sp
    )
)

@Preview
@Composable
fun HomebodyTypographyPreview() {
    AppTheme {
        Surface {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(24.dp)
            ) {
                Text(text = "Display Medium", style = MaterialTheme.typography.displayMedium)
                Text(text = "Headline Small", style = MaterialTheme.typography.headlineSmall)
                Text(text = "Title Large", style = MaterialTheme.typography.titleLarge)
                Text(text = "Title Medium", style = MaterialTheme.typography.titleMedium)
                Text(text = "Title Small", style = MaterialTheme.typography.titleSmall)
                Text(text = "Body Large", style = MaterialTheme.typography.bodyLarge)
                Text(text = "Body Medium", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Body Small", style = MaterialTheme.typography.bodySmall)
                Text(text = "Label Large", style = MaterialTheme.typography.labelLarge)
                Text(text = "Label Medium", style = MaterialTheme.typography.labelMedium)
                Text(text = "Label Small", style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}
