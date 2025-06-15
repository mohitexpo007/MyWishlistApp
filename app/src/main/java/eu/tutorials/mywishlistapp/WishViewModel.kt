package eu.tutorials.mywishlistapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WishViewModel: ViewModel(){
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun OnWishTitleChanged(newString: String){
        wishTitleState=newString
    }

    fun OnWishDescriptionChanged(newString: String){
        wishDescriptionState=newString
    }

}