package com.example.todo_compose.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todo_compose.R
import com.example.todo_compose.ui.viewmodels.SharedViewModel
import com.example.todo_compose.util.Action

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalAnimationApi
@Composable
fun ListScreen(
    action: Action,
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    Scaffold(
        content = {},
        floatingActionButton = {
            ListFab(onFabClicked = navigateToTaskScreen)
        }
    )
}

@Composable
fun ListFab(
    onFabClicked: (Int) -> Unit
) {
    FloatingActionButton(onClick = {
        onFabClicked(-1)
    }) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = stringResource(id = R.string.add_button), tint = Color.White)
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigateToTaskScreen = {})
}