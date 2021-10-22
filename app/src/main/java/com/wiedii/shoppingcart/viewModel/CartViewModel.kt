package com.wiedii.shoppingcart.viewModel

import androidx.lifecycle.ViewModel
import com.wiedii.shoppingcart.viewModel.models.Movie

class CartViewModel : ViewModel(){

    val ListCartMovies: MutableList<Movie> = mutableListOf()

}




/*
class MyViewModel : ViewModel() {
    private val users: MutableLiveData<List<User>> by lazy {
        MutableLiveData<List<User>>().also {
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<User>> {
        return users
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}
 */