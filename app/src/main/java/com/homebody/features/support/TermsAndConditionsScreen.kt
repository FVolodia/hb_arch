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
fun TermsAndConditionsScreen() {
    TermsAndConditionsView()
}

@Composable
fun TermsAndConditionsView() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        SupportScreenItem(
            title = stringResource(id = R.string.termsAndConditionsTitle1),
            body = stringResource(id = R.string.termsAndConditionsBody1)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle2),
            body = stringResource(id = R.string.termsAndConditionsBody2)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle3),
            body = stringResource(id = R.string.termsAndConditionsBody3)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle4),
            body = stringResource(id = R.string.termsAndConditionsBody4)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle5),
            body = stringResource(id = R.string.termsAndConditionsBody5)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle6),
            body = stringResource(id = R.string.termsAndConditionsBody6)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle7),
            body = stringResource(id = R.string.termsAndConditionsBody7)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle8),
            body = stringResource(id = R.string.termsAndConditionsBody8)
        )
        SupportScreenItem(
            title = stringResource(id = R.string.termsAndConditionsTitle9),
            body = stringResource(id = R.string.termsAndConditionsBody9)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle10),
            body = stringResource(id = R.string.termsAndConditionsBody10)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle11),
            body = stringResource(id = R.string.termsAndConditionsBody11)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle12),
            body = stringResource(id = R.string.termsAndConditionsBody12)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle13),
            body = stringResource(id = R.string.termsAndConditionsBody13)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle14),
            body = stringResource(id = R.string.termsAndConditionsBody14)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle15),
            body = stringResource(id = R.string.termsAndConditionsBody15)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle16),
            body = stringResource(id = R.string.termsAndConditionsBody16)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle17),
            body = stringResource(id = R.string.termsAndConditionsBody17)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle18),
            body = stringResource(id = R.string.termsAndConditionsBody18)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle19),
            body = stringResource(id = R.string.termsAndConditionsBody19)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle20),
            body = stringResource(id = R.string.termsAndConditionsBody20)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle21),
            body = stringResource(id = R.string.termsAndConditionsBody21)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle22),
            body = stringResource(id = R.string.termsAndConditionsBody22)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle23),
            body = stringResource(id = R.string.termsAndConditionsBody23)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.termsAndConditionsSubtitle24),
            body = stringResource(id = R.string.termsAndConditionsBody24)
        )
    }
}
@Preview
@Composable
fun TermsAndConditionsPreview() {
    AppTheme {
        TermsAndConditionsView()
    }
}