package com.homebody.composable.payment

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.homebody.R
import com.homebody.composable.payment.data.PaymentData
import com.homebody.composable.payment.data.PaymentItemData
import com.homebody.ui.theme.AppTheme
import com.homebody.ui.theme.Shapes
import com.homebody.ui.theme.linkColor

@Composable
fun PaymentCard(
    data: PaymentData,
    eventListener: (PaymentEvent) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = Shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = modifier
            .fillMaxWidth()
            .clickable { eventListener(PaymentEvent.OnClick) }
    ) {
        Column(
            modifier = modifier.padding(16.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.ic_payment),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = stringResource(id = data.title),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        color = MaterialTheme.colorScheme.onSurface,
                        text = stringResource(id = R.string.payment_policy, data.policy),
                        fontSize = 13.sp,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                data.dataItems.forEach { item -> PaymentItem(item) }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clickable { eventListener(PaymentEvent.OnEditClick) }
            ) {
                Text(
                    text = stringResource(id = R.string.edit_on_homebody),
                    fontSize = 13.sp,
                    color = MaterialTheme.colorScheme.linkColor,
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_left),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.linkColor
                )
            }
        }
    }
}

@Preview
@Composable
fun PaymentCardPreview() {
    AppTheme {
        PaymentCard(
            data = PaymentData.RentersInsurance(
                policy = "1098314798745",
                dataItems = listOf(
                    PaymentItemData.PaymentDue(value = "July 1, 2023"),
                    PaymentItemData.Amount(value = "\$28.96 monthly"),
                    PaymentItemData.Method(value = "Visa ending in 1234")
                )
            ), {}
        )
    }
}
