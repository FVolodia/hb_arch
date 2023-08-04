package com.homebody.composable.payment

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.homebody.composable.payment.data.PaymentItemData
import com.homebody.ui.theme.AppTheme

@Composable
fun PaymentItem(
    data: PaymentItemData,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = data.title),
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 14.sp,
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            color = MaterialTheme.colorScheme.onSurface,
            text = data.value,
            fontSize = 14.sp,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
fun PaymentItemPreview() {
    AppTheme {
        PaymentItem(
            data = PaymentItemData.PaymentDue("July 1, 2023"),
            modifier = Modifier.fillMaxWidth()
        )
    }
}