import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun GreetingColumn(
    modifier: Modifier = Modifier,
    input: String,
    onInputChange: (String) -> Unit,
    text: String,
    onButtonClick: () -> Unit,
    color: Color = Color.Transparent
) {
    Column(
        modifier = modifier.background(color),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = input,
            onValueChange = onInputChange,
            label = { Text("Type Here...") },
            modifier = Modifier.padding(Dp(16F))
        )
        Button(
            onClick = onButtonClick
        ) {
            Text(text)
        }
    }
}