import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello you!") }
    var input by remember { mutableStateOf("") }

    var text2 by remember { mutableStateOf("Hello world!") }
    var input2 by remember { mutableStateOf("") }

    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxSize().background(Color.Black)
            ) {
                GreetingColumn(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically),
                    input = input,
                    onInputChange = { input = it },
                    text = text,
                    onButtonClick = {
                        text = if (input.isNotBlank()) "Hello $input!" else "Hello you!"
                    },
                    Color.LightGray
                )
                GreetingColumn(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically),
                    input = input2,
                    onInputChange = { input2 = it },
                    text = text2,
                    onButtonClick = {
                        text2 = if (input2.isNotBlank()) "Born in $input2!" else "Hello World!"
                    },
                    Color.Cyan
                )
            }

        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Learning Kotlin") {
        App()
    }
}
