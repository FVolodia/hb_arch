package com.homebody.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.homebody.ui.theme.AppTheme
import com.homebody.ui.theme.disabled

/**
 * Created by kkovalenko on 03.08.2023
 */

@Composable
fun BaseInputField(
    value: String,
    modifier: Modifier = Modifier,
    label: String? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit,
) {
    // TODO: Set correct styles when available
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.Start
    ) {
        if (label != null) {
            Text(
                text = label,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn()
            )
        }
        TextField(
            value = value,
            label = null,
            visualTransformation = visualTransformation,
            onValueChange = onValueChange,
            keyboardOptions = keyboardOptions,
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = MaterialTheme.colorScheme.secondary,
                disabledTextColor = MaterialTheme.colorScheme.onBackground.disabled,
                focusedContainerColor = MaterialTheme.colorScheme.background,
                unfocusedContainerColor = MaterialTheme.colorScheme.background,
                errorContainerColor = MaterialTheme.colorScheme.errorContainer
            ),
            isError = isError,
            enabled = enabled,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            prefix = prefix,
            suffix = suffix,
            modifier = modifier
                .border(
                    width = 1.dp,
                    color = when (isError) {
                        true -> MaterialTheme.colorScheme.onErrorContainer
                        false -> MaterialTheme.colorScheme.outlineVariant
                    },
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .fillMaxWidth()
                .heightIn()
                .clip(shape = RoundedCornerShape(size = 8.dp))
        )
    }
}

@Preview
@Composable
fun BaseInputFieldPreview() {
    AppTheme {
        Surface {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                BaseInputField(label = "Test", value = "email@email.com", onValueChange = {})
                BaseInputField(value = "Textfield with no label", onValueChange = {})
                BaseInputField(
                    label = "Password",
                    value = "Some test value with an error",
                    isError = true,
                    visualTransformation = PasswordVisualTransformation(),
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Clear,
                            contentDescription = null,
                        )
                    },
                    onValueChange = {},
                )
                BaseInputField(
                    label = "Error",
                    value = "Some test value with an error",
                    isError = true,
                    suffix = {
                        Row {
                            Icon(
                                imageVector = Icons.Rounded.Lock,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.error
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Text(
                                text = "Invalid credentials",
                            )
                        }
                    },
                    onValueChange = {},
                )
            }
        }
    }
}
