package com.homebody.composable.bottomBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.homebody.composable.bottomBar.data.BottomBarItemData
import com.homebody.features.home.Home
import com.homebody.navigation.AppRoute
import com.homebody.ui.theme.AppTheme

//todo: finish with navigation
@Composable
fun BottomBar(
    items: List<BottomBarItemData>,
    modifier: Modifier = Modifier,
) {

    NavigationBar(
        containerColor = Color.White,
        contentColor = MaterialTheme.colorScheme.contentColorFor(Color.Black),
        tonalElevation = 4.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        items.forEach { item ->
            //currentRoute == item.route
            val isSelected = false
            NavigationBarItem(
                icon = {
                    Image(
                        painter = painterResource(item.icon),
                        contentDescription = stringResource(item.title)
                    )
                },
                label = {
                    Text(
                        text = stringResource(item.title),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 12.sp
                    )
                },
                selected = isSelected,
                onClick = {
                    //navigate(item.route)
                }
            )
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    AppTheme {
        BottomBar(
            listOf(
                BottomBarItemData.HomeItem(Home),
                BottomBarItemData.InsuranceItem(AppRoute.SimpleRoute("insurance")),
                BottomBarItemData.ProfileItem(AppRoute.SimpleRoute("profile"))
            )
        )
    }
}