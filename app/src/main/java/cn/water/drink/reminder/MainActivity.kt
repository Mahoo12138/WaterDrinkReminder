package cn.water.drink.reminder

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cn.water.drink.reminder.ui.component.BottomBar

import cn.water.drink.reminder.ui.theme.WaterDrinkReminderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterDrinkReminderTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    WaterDrinkReminder("Android")
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WaterDrinkReminder(name: String, modifier: Modifier = Modifier) {
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        bottomBar = { BottomBar() }
    ) {
        Text(text = name)
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WaterDrinkReminderTheme {
        WaterDrinkReminder("Android")
    }
}