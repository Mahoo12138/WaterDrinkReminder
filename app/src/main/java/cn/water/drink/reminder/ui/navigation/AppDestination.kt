package cn.water.drink.reminder.ui.navigation


import androidx.compose.ui.graphics.vector.ImageVector
import cn.water.drink.reminder.R
import cn.water.drink.reminder.core.designsystem.icon.NiaIcons
import cn.water.drink.reminder.feature.bookmarks.R as bookmarksR
import cn.water.drink.reminder.feature.foryou.R as forYouR
import cn.water.drink.reminder.feature.search.R as searchR


enum class AppDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    FOR_YOU(
        selectedIcon = NiaIcons.Upcoming,
        unselectedIcon = NiaIcons.UpcomingBorder,
        iconTextId = forYouR.string.feature_foryou_title,
        titleTextId = R.string.app_name,
    ),
    BOOKMARKS(
        selectedIcon = NiaIcons.Bookmarks,
        unselectedIcon = NiaIcons.BookmarksBorder,
        iconTextId = bookmarksR.string.feature_bookmarks_title,
        titleTextId = bookmarksR.string.feature_bookmarks_title,
    ),
    INTERESTS(
        selectedIcon = NiaIcons.Grid3x3,
        unselectedIcon = NiaIcons.Grid3x3,
        iconTextId = searchR.string.feature_search_interests,
        titleTextId = searchR.string.feature_search_interests,
    ),
}