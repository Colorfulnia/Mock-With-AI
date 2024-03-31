package abhishek.pathak.mockwithai.view.components

import abhishek.pathak.mockwithai.navigation.BottomNaviItems
import abhishek.pathak.mockwithai.navigation.NavigationItem
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import org.w3c.dom.Text

@Composable
fun BottomBarUI(navController: NavController) {
    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier.fillMaxWidth()) {

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(BottomNaviItems.HOME.route) },
            icon = { Icon(imageVector = Icons.Default.Home
                , contentDescription = null) },
            label = { Text(text = "Home") })

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(BottomNaviItems.SEARCH.route) },
            icon = { Icon(imageVector = Icons.Default.Search, contentDescription = null)},
            label = { Text(text = "Search")})

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate((BottomNaviItems.BOOKMARK.route)) },
            icon = {Icon(imageVector = Icons.Default.BookmarkBorder, contentDescription = null)},
            label = { Text(text = "Bookmark")}
            )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(BottomNaviItems.ACCOUNT.route) },
            icon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) },
            label = { Text(text = "Account")})
    }
}

@Preview
@Composable
private fun BottomBarPrev() {
    BottomBarUI(rememberNavController())
}