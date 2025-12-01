package nl.ckarakoc.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(navigationToSecondScreen: (String, Int) -> Unit) {
    val name = remember { mutableStateOf("") }
    val age = remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("This is the First Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            placeholder = { Text("Name") },
            singleLine = true
        )
        Spacer(modifier = Modifier.padding(4.dp))
        OutlinedTextField(
            value = if (age.intValue == 0) "" else age.intValue.toString(),
            onValueChange = { age.intValue = it.toIntOrNull() ?: 0 },
            placeholder = { Text("Age") },
            singleLine = true
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {
            if (name.value.isNotBlank()) {
                navigationToSecondScreen(name.value, age.intValue)
            }
        }) {
            Text("Go to Second Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstPreview() {
    FirstScreen({} as (String, Int) -> Unit)
}
