package com.homebody.composable.bottomBar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.homebody.ui.theme.AppTheme

//todo: finish with navigation
@Composable
fun BottomBar(
    items: List<String>,
    modifier: Modifier = Modifier,
) {

//    NavigationBar(
//        containerColor = Color.White,
//        contentColor = MaterialTheme.colorScheme.contentColorFor(Color.Black),
//        tonalElevation = 4.dp,
//        modifier = modifier.fillMaxWidth()
//    ) {
//        items.forEach { item ->
//            //currentRoute == item.route
//            val isSelected = false
//            NavigationBarItem(
//                icon = {
//                    Image(
//                        painter = painterResource(item.icon),
//                        contentDescription = stringResource(item.title)
//                    )
//                },
//                label = {
//                    Text(
//                        text = stringResource(item.title),
//                        color = MaterialTheme.colorScheme.onSurface,
//                        fontSize = 12.sp
//                    )
//                },
//                selected = isSelected,
//                onClick = {
//                    //navigate(item.route)
//                }
//            )
//        }
//    }
}

@Preview
@Composable
fun BottomBarPreview() {
    AppTheme {
        BottomBar(
            listOf(
//                BottomBarItemData.HomeItem(Home),
//                BottomBarItemData.InsuranceItem(AppRoute.SimpleRoute("insurance")),
//                BottomBarItemData.ProfileItem(AppRoute.SimpleRoute("profile"))
            )
        )
    }
}