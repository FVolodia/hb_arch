package com.homebody.composable.bottomBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.homebody.composable.bottomBar.data.BottomBarItemData
import com.homebody.ui.theme.AppTheme

@Composable
fun BottomBar(
    navController: NavHostController,
    items: List<BottomBarItemData>,
    modifier: Modifier = Modifier,
) {

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    fun navigate(route: String) {
        if (currentRoute == route) return
        navController.graph.startDestinationRoute?.let {
            navController.popBackStack(it, false)
        }
        navController.navigate(route) {
            launchSingleTop = true
        }
    }

    NavigationBar(
        containerColor = Color.White,
        contentColor = MaterialTheme.colorScheme.contentColorFor(Color.Black),
        tonalElevation = 0.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        items.forEach { item ->
            val isSelected = currentRoute == item.route
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
                onClick = { navigate(item.route) }
            )
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    AppTheme {
        BottomBar(
            navController = NavHostController(LocalContext.current),
            listOf(
                BottomBarItemData.HomeItem("Home"),
                BottomBarItemData.InsuranceItem("insurance"),
                BottomBarItemData.ProfileItem("profile")
            )
        )
    }
}