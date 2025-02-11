package org.iagxferreira.notesplus

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.iagxferreira.notesplus.screens.AboutScreen
import org.iagxferreira.notesplus.screens.RowType

fun main() = application {
    val items: Array<RowType> = listOf(RowType("title", "subtitle")).toTypedArray()
    Window(
        onCloseRequest = ::exitApplication,
        title = "notes-plus",
        resizable = false,
        state = rememberWindowState(size = DpSize(1280.dp, 720.dp))
    ) {
        AboutScreen(items)
    }
}