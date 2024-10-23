import edu.farmingdale.pizzapartybottomnavbar.PizzaPartyScreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.farmingdale.pizzapartybottomnavbar.BottomNavigationItems
import edu.farmingdale.pizzapartybottomnavbar.GpaAppScreen
import edu.farmingdale.pizzapartybottomnavbar.Screen3
import edu.farmingdale.pizzapartybottomnavbar.SplashScreen

@Composable
fun NavigationGraph(navController: NavHostController, onBottomBarVisibilityChanged: (Boolean) -> Unit) {
    NavHost(navController, startDestination = BottomNavigationItems.Welcome.route) {
        composable(BottomNavigationItems.Welcome.route) {
            onBottomBarVisibilityChanged(false)
            SplashScreen(navController = navController)
        }
        composable(BottomNavigationItems.PizzaScreen.route) {
            onBottomBarVisibilityChanged(true)
            PizzaPartyScreen()
        }
        composable(BottomNavigationItems.GpaAppScreen.route) {
            onBottomBarVisibilityChanged(true)
            GpaAppScreen()
        }
        composable(BottomNavigationItems.Screen3.route) {
            onBottomBarVisibilityChanged(true)
            Screen3()
        }
    }
}



// ToDo 8: This is the homework:
// add a drawer navigation as described in drawable drawermenu.png
// Improve the design and integration of the app for 5 extra credit points.