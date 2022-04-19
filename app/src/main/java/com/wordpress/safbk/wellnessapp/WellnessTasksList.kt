package com.wordpress.safbk.wellnessapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

////OR
//private fun getWellnessTask() = List(30) {WellnessTask(it, "Task # $it")}
//
//// OR
//private fun getWellnessTask22() = List(30) {nn -> WellnessTask(nn, "Task # $nn")}
//
////OR
//private fun getWellnessTask1() {
//    List(30) { it -> WellnessTask(it, "Task # $it") }
//}
//
////OR
//private fun getWellnessTask2() {
//    List(20) {
//        WellnessTask(it, "Task # $it")
//    }
//}



//////


@Composable
fun WellnessTasksList22222(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTasks() },
    onCloseTask: () -> Unit,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list.size,
            key = { task -> task}
        ) { task ->

            WellnessTaskItem(taskName = "Task # $task", onClose ={ onCloseTask() } )
        }
    }
}
