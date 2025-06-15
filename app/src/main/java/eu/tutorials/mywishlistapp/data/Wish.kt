package eu.tutorials.mywishlistapp.data

data class Wish(
    val id: Long=0L,
    val title: String="",
    val description : String=""
)

object DummyWish{
    val wishList= listOf(
        Wish(title="Google Watch 2",description = "An android watch"),
        Wish(title="Google Watch 2",description = "An android watch"),
        Wish(title="Google Watch 2",description = "An android watch")
    )
}