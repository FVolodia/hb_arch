package com.homebody.features.support

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.homebody.R
import com.homebody.composable.BaseFilledButton
import com.homebody.ui.theme.AppTheme

@Composable
fun AboutUsScreen(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    AboutUsView(
        onClick = onClick,
        modifier = modifier
    )
}

@Composable
fun AboutUsView(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        SupportScreenItem(
            title = stringResource(id = R.string.aboutUsTitle1),
            body = stringResource(id = R.string.aboutUsBody1),
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.aboutUsSubtitle2),
            body = stringResource(id = R.string.aboutUsBody2)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.aboutUsSubtitle3),
            body = stringResource(id = R.string.aboutUsBody3)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.aboutUsSubtitle4),
            body = stringResource(id = R.string.aboutUsBody4)
        )
        Spacer(modifier = Modifier.height(18.dp))
        BaseFilledButton(
            text = stringResource(id = R.string.getAQuote),
            onClick = onClick,
            enabled = true,
        )
        Spacer(modifier = Modifier.height(18.dp))
        SupportScreenItem(
            title = stringResource(id = R.string.aboutUsTitle5),
            subTitle = stringResource(id = R.string.aboutUsSubtitle5),
            body = stringResource(id = R.string.aboutUsBody5)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.aboutUsSubtitle6),
            body = stringResource(id = R.string.aboutUsBody6)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.aboutUsSubtitle7),
            body = stringResource(id = R.string.aboutUsBody7)
        )
        SupportScreenItem(
            subTitle = stringResource(id = R.string.aboutUsSubtitle8),
            body = stringResource(id = R.string.aboutUsBody8)
        )
    }
}

@Preview
@Composable
fun AboutUsPreview() {
    AppTheme {
        AboutUsView(
            onClick = {}
        )
    }
}