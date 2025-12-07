package nl.ckarakoc.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = "",
)

object DummyWish {
    val wishList = listOf(
        Wish(1L, title = "Google Watch 2", description = "An android Watch"),
        Wish(2L, title = "Google Pixel 7", description = "An android Phone"),
        Wish(3L, title = "Google Home Mini", description = "An android speaker"),
        Wish(4L, title = "Sony WH-1000XM5", description = "Noise-cancelling headphones"),
        Wish(5L, title = "Oculus Quest 3", description = "A standalone VR headset"),
        Wish(6L, title = "Nintendo Switch OLED", description = "A hybrid gaming console"),
        Wish(7L, title = "Lego Star Wars Millennium Falcon", description = "A large Lego set"),
        Wish(8L, title = "DJI Mini 4 Pro", description = "A compact and powerful drone"),
        Wish(9L, title = "Anker Power Bank", description = "A portable charger for devices"),
        Wish(10L, title = "Mechanical Keyboard", description = "A tactile and clicky keyboard"),
        Wish(11L, title = "Ergonomic Office Chair", description = "For better posture while working"),
        Wish(12L, title = "4K Monitor", description = "A high-resolution display for PC"),
        Wish(13L, title = "Kindle Paperwhite", description = "An e-reader for digital books"),
    )
}