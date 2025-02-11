package org.iagxferreira.notesplus.screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.rememberWindowState
import androidx.compose.ui.window.application


@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text(text = "Settings") }
    )
}

class RowType(
    val title: String,
    val subtitle: String
)

@Composable
fun AboutScreen(items: Array<RowType>) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items) { row ->
            RowView(title = row.title, subtitle = row.subtitle)
        }
    }
}

@Composable
private fun RowView(
    title: String,
    subtitle: String,
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.h6,
                color = Color.Gray
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.body2,
            )
        }
        Divider()
    }
}

@Preview
@Composable
fun Preview() {
    val items: Array<RowType> = listOf(RowType("title", "subtitle")).toTypedArray()
    AboutScreen(items)
}