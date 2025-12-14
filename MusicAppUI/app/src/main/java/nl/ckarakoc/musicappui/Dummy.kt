package nl.ckarakoc.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.outline_error_24, "Playlist"),
    Lib(R.drawable.outline_error_24, "Artists"),
    Lib(R.drawable.outline_error_24, "Album"),
    Lib(R.drawable.outline_error_24, "Songs"),
    Lib(R.drawable.outline_error_24, "Genre"),
)
