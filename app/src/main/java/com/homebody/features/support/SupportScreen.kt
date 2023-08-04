package com.homebody.features.support

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SupportScreen(
    type: SupportTypes,
    onClick: () -> Unit = {},
    ) {
    when (type) {
        SupportTypes.AboutUs -> AboutUsScreen(
            onClick = onClick
        )
        SupportTypes.TermsAndConditions -> TermsAndConditionsScreen()
        SupportTypes.TermsOfUse -> TermsOfUseScreen()
        SupportTypes.FAQs -> FAQsScreen()
        else -> PrivacyNoticeScreen()
    }
}

@Composable
fun SupportScreenItem(
    modifier: Modifier = Modifier,
    title: String? = null,
    subTitle: String? = null,
    body: String? = null,
    withDivider: Boolean = false,
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .fillMaxWidth()
    ) {
        if (title != null) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge.copy(
                    color = MaterialTheme.colorScheme.onBackground,
                ),
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
            )
        }
        if (subTitle != null) {
            Text(
                text = subTitle,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.onBackground,
                ),
            )
        }
        if (body != null) {
            Text(
                text = body,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onBackground,
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        if (withDivider) {
            Divider(
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.2f),
                thickness = 1.dp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
    }
}