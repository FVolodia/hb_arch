package com.homebody.composable.expiredCard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.homebody.R
import com.homebody.composable.expiredCard.data.ExpiredCardData
import com.homebody.ui.theme.expireWarningColor

@Composable
fun ExpiredCard(
    data: ExpiredCardData,
    eventListener: (ExpiredCardEvent) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.expireWarningColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = modifier
            .fillMaxWidth()
            .clickable { eventListener(ExpiredCardEvent.OnClick) }
    ) {
        Column(
            modifier = modifier.padding(vertical = 16.dp, horizontal = 32.dp)
        ) {
            Text(
                color = MaterialTheme.colorScheme.onSurface,
                text = stringResource(R.string.your_card_is_about_to_expire),
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                color = MaterialTheme.colorScheme.onSurface,
                text = stringResource(R.string.expire_card_description, data.cardEnding, data.expireDate),
                fontSize = 11.sp,
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { eventListener(ExpiredCardEvent.OnEditClick) }
            ) {
                Text(
                    color = MaterialTheme.colorScheme.onSurface,
                    text = stringResource(id = R.string.edit_on_homebody),
                    fontSize = 13.sp,
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_left),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface,
                )
            }
        }
    }
}

@Preview
@Composable
fun ExpiredCardPreview() {
    ExpiredCard(
        data = ExpiredCardData(
            cardEnding = "1234",
            expireDate = "08/23"
        ), { }
    )
}