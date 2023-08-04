package com.homebody.composable.topBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.homebody.R

@Composable
fun TopBar(
    onMenuClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_homebody_title),
            contentDescription = stringResource(R.string.homebody),
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = stringResource(R.string.menu),
            modifier = Modifier.clickable { onMenuClick() }
        )
    }
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar(onMenuClick = {})
}