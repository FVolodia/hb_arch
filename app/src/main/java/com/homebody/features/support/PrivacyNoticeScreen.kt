package com.homebody.features.support

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.homebody.R
import com.homebody.ui.theme.AppTheme

@Composable
fun PrivacyNoticeScreen() {
    PrivacyNoticeView()
}

@Composable
fun PrivacyNoticeView() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        SupportScreenItem(
            title = stringResource(id = R.string.privacyNoticeTitle1),
            body = stringResource(id = R.string.privacyNoticeBody1)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle2),
            body = stringResource(id = R.string.privacyNoticeBody2)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle3),
            body = stringResource(id = R.string.privacyNoticeBody3)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle4),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle5),
            modifier = Modifier.padding(start = 12.dp, top = 16.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle6),
            body = stringResource(id = R.string.privacyNoticeBody6),
            modifier = Modifier.padding(start = 24.dp, top = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle7),
            body = stringResource(id = R.string.privacyNoticeBody7),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle8),
            body = stringResource(id = R.string.privacyNoticeBody8),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle9),
            modifier = Modifier.padding(start = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle10),
            body = stringResource(id = R.string.privacyNoticeBody10),
            modifier = Modifier.padding(start = 24.dp, top = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle11),
            body = stringResource(id = R.string.privacyNoticeBody11),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle12),
            body = stringResource(id = R.string.privacyNoticeBody12),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle13),
            modifier = Modifier.padding(start = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle14),
            body = stringResource(id = R.string.privacyNoticeBody14),
            modifier = Modifier.padding(start = 24.dp, top = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle15),
            body = stringResource(id = R.string.privacyNoticeBody15),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle16),
            body = stringResource(id = R.string.privacyNoticeBody16),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle17),
            modifier = Modifier.padding(start = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle18),
            body = stringResource(id = R.string.privacyNoticeBody18),
            modifier = Modifier.padding(start = 24.dp, top = 12.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle19),
            body = stringResource(id = R.string.privacyNoticeBody19),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle20),
            body = stringResource(id = R.string.privacyNoticeBody20),
            modifier = Modifier.padding(start = 24.dp)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle21),
            body = stringResource(id = R.string.privacyNoticeBody21),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle22),
            body = stringResource(id = R.string.privacyNoticeBody22),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle23),
            body = stringResource(id = R.string.privacyNoticeBody23),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle24),
            body = stringResource(id = R.string.privacyNoticeBody24),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle25),
            body = stringResource(id = R.string.privacyNoticeBody25),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle26),
            body = stringResource(id = R.string.privacyNoticeBody26),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle27),
            body = stringResource(id = R.string.privacyNoticeBody27),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle28),
            body = stringResource(id = R.string.privacyNoticeBody28),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle29),
            body = stringResource(id = R.string.privacyNoticeBody29),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.privacyNoticeSubtitle30),
            body = stringResource(id = R.string.privacyNoticeBody30),
        )
    }
}
@Preview
@Composable
fun PrivacyNoticePreview() {
    AppTheme {
        PrivacyNoticeView()
    }
}