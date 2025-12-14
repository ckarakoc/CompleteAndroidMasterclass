package nl.ckarakoc.musicappui.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import nl.ckarakoc.musicappui.R

@Composable
fun BrowseScreen() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories) {cat ->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_library_music_24)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BrowseScreenPreview() {
    BrowseScreen()
}