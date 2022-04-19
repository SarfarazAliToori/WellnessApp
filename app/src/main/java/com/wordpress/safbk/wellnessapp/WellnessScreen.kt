package com.wordpress.safbk.wellnessapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    //WaterCounter(modifier)
    //WaterCounterList(modifier)
   // StatefulCounter()

    Column(modifier = modifier) {
        //StatefulCounter()
        //WellnessTasksList22222()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList22222(list = list, onCloseTask = { })
    }

}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }



