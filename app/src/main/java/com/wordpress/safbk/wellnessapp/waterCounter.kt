package com.wordpress.safbk.wellnessapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(20.dp)) {

        //var count: MutableState<Int> = remember{ mutableStateOf(0)}
        //count.value
        //count.value++
        var count by rememberSaveable { mutableStateOf(0) }

        var showTask by rememberSaveable { mutableStateOf(true)}

//        if (showTask) {
//            WellnessTastItem(
//                tastName = "Have you taken your 15 minute walk today?",
//                onClose = { showTask = false},
//                )
//        }
            Text(text = "You have had $count Glasses")

            Row(modifier = Modifier.padding(10.dp)) {
                Button(onClick = { count++
                    //if (count == 6) count = 0 else count++
                }, enabled = count  < 10, modifier = modifier.padding(10.dp)) {
                    Text(text = "Add One")
                }

                Button(onClick = { count = 0 }, modifier = modifier.padding(start = 10.dp)) {
                    Text(text = "Clear Water Count")
                }
            }
    }

}

@Composable
fun WaterCounterList(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(10.dp)) {
        LazyColumn() {
            items(20) {
                WaterCounter()
            }
        }
    }
}
/////////////// Stateless and Stateful
@Composable
fun StateLessCounter(countt: Int ,onButtonClick: () -> Unit,modifier: Modifier = Modifier) {
    Column(modifier.padding(18.dp)) {
        Text(text = "You have had $countt Glasses")
        Button(onClick = onButtonClick) {
            Text(text = "Add One")
        }
    }
}

@Composable
fun StatefulCounter() {
    Column(modifier = Modifier.padding(20.dp)) {
        var mCounter by rememberSaveable { mutableStateOf(0)}
        var jCounter by rememberSaveable { mutableStateOf(0)}

        StateLessCounter(countt = mCounter, onButtonClick = {mCounter++})
        StateLessCounter(countt = jCounter, onButtonClick = { jCounter++ })
    }
}

//////////////////////////////////
