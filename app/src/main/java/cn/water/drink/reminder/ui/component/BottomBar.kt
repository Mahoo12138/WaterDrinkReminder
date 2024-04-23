package cn.water.drink.reminder.ui.component

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar() {
    NavigationBar(tonalElevation = 8.dp) {

    }
}



enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    @StringRes val label: Int,
    val iconSelected: ImageVector,
    val iconNotSelected: ImageVector,
    val rootRequired: Boolean,
) {
    Home(HomeScreenDestination, R.string.home, Icons.Filled.Home, Icons.Outlined.Home, false),
    SuperUser(SuperUserScreenDestination, R.string.superuser, Icons.Filled.Security, Icons.Outlined.Security, true),
    Module(ModuleScreenDestination, R.string.module, Icons.Filled.Apps, Icons.Outlined.Apps, true)
}