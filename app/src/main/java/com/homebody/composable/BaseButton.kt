package com.homebody.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.homebody.ui.theme.AppTheme

@Composable
fun BaseFilledButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colorScheme.onPrimary,
    textStyle: TextStyle = MaterialTheme.typography.labelLarge,
    enabled: Boolean = true,
    shape: Shape = MaterialTheme.shapes.extraLarge,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    disabledBackgroundColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
    disabledTextColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    height: Dp = 56.dp,
    padding: PaddingValues = PaddingValues(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(
        defaultElevation = 0.dp,
        disabledElevation = 0.dp
    )
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = textColor,
            disabledContainerColor = disabledBackgroundColor,
            disabledContentColor = disabledTextColor
        ),
        enabled = enabled,
        shape = shape,
        elevation = elevation,
        contentPadding = contentPadding,
        modifier = modifier
            .heightIn(height)
            .padding(padding)
    )
    {
        Row(
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Text(
                text = text,
                style = textStyle
            )
        }
    }
}

@Preview
@Composable
fun ButtonFilledPreview() {
    AppTheme {
        BaseFilledButton(
            text= "Button text",
            onClick = {},
            textColor = Color.Red
        )
    }
}