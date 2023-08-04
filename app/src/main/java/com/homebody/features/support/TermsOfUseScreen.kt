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
fun TermsOfUseScreen() {
    TermsOfUseView()
}

@Composable
fun TermsOfUseView() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        SupportScreenItem(
            title = stringResource(id = R.string.termsOfUseTitle1),
            body = stringResource(id = R.string.termsOfUseBody1)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle2),
            body = stringResource(id = R.string.termsOfUseBody2)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle3),
            body = stringResource(id = R.string.termsOfUseBody3)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle4),
            body = stringResource(id = R.string.termsOfUseBody4)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle5),
            body = stringResource(id = R.string.termsOfUseBody5)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle6),
            body = stringResource(id = R.string.termsOfUseBody6)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle7),
            body = stringResource(id = R.string.termsOfUseBody7)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle8),
            body = stringResource(id = R.string.termsOfUseBody8)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle9),
            body = stringResource(id = R.string.termsOfUseBody9)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle10),
            body = stringResource(id = R.string.termsOfUseBody10)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle11),
            body = stringResource(id = R.string.termsOfUseBody11)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle12),
            body = stringResource(id = R.string.termsOfUseBody12)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle13),
            body = stringResource(id = R.string.termsOfUseBody13)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle14),
            body = stringResource(id = R.string.termsOfUseBody14)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle15),
            body = stringResource(id = R.string.termsOfUseBody15),
            withDivider = true
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle16),
            body = stringResource(id = R.string.termsOfUseBody16)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle17),
            body = stringResource(id = R.string.termsOfUseBody17)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle18),
            body = stringResource(id = R.string.termsOfUseBody18)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle19),
            body = stringResource(id = R.string.termsOfUseBody19)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle20),
            body = stringResource(id = R.string.termsOfUseBody20)
        )
        SupportScreenItem(
            body = stringResource(id = R.string.termsOfUseBody21),
            withDivider = true
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle22),
            body = stringResource(id = R.string.termsOfUseBody22)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle23),
            body = stringResource(id = R.string.termsOfUseBody23)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle24),
            body = stringResource(id = R.string.termsOfUseBody24)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle25),
            body = stringResource(id = R.string.termsOfUseBody25)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle26),
            body = stringResource(id = R.string.termsOfUseBody26)
        )
        SupportScreenItem(
            body = stringResource(id = R.string.termsOfUseBody27),
            withDivider = true
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle28),
            body = stringResource(id = R.string.termsOfUseBody28)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle29),
            body = stringResource(id = R.string.termsOfUseBody29)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle30),
            body = stringResource(id = R.string.termsOfUseBody30)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle31),
            body = stringResource(id = R.string.termsOfUseBody31)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle32),
            body = stringResource(id = R.string.termsOfUseBody32)
        )
        SupportScreenItem(
            body = stringResource(id = R.string.termsOfUseBody33),
            withDivider = true
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsOfUseSubtitle34),
            body = stringResource(id = R.string.termsOfUseBody34)
        )
    }
}
@Preview
@Composable
fun TermsOfUsePreview() {
    AppTheme {
        TermsOfUseView()
    }
}