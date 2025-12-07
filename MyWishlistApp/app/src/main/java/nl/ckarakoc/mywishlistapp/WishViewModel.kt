package nl.ckarakoc.mywishlistapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WishViewModel : ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChanged(newValue: String) {
        wishTitleState = newValue
    }

    fun onWishDescriptionChanged(newValue: String) {
        wishDescriptionState = newValue
    }
}