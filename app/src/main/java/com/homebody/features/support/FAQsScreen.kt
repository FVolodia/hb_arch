package com.homebody.features.support

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.homebody.R
import com.homebody.ui.theme.AppTheme

@Composable
fun FAQsScreen() {
    FAQsView()
}

@Composable
fun FAQsView() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        SupportScreenItem(
            title = stringResource(id = R.string.fAQsTitle1),
            subTitle = stringResource(id = R.string.fAQsSubtitle1),
            body = stringResource(id = R.string.fAQsBody1)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle2),
            body = stringResource(id = R.string.fAQsBody2)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle3),
            body = stringResource(id = R.string.fAQsBody3)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle4),
            body = stringResource(id = R.string.fAQsBody4)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle5),
            body = stringResource(id = R.string.fAQsBody5)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle6),
            body = stringResource(id = R.string.fAQsBody6)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle7),
            body = stringResource(id = R.string.fAQsBody7)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle8),
            body = stringResource(id = R.string.fAQsBody8)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle9),
            body = stringResource(id = R.string.fAQsBody9)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle10),
            body = stringResource(id = R.string.fAQsBody10)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.fAQsSubtitle11),
            body = stringResource(id = R.string.fAQsBody11)
        )
    }
}
@Preview
@Composable
fun FAQsPreview() {
    AppTheme {
        FAQsView()
    }
}