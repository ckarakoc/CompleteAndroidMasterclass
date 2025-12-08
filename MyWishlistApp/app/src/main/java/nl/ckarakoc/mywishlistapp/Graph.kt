package nl.ckarakoc.mywishlistapp

import android.content.Context
import androidx.room.Room
import nl.ckarakoc.mywishlistapp.data.WishDatabase
import nl.ckarakoc.mywishlistapp.data.WishRepository

object Graph {

    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db")
            .build()
    }
}