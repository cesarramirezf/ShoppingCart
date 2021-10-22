package com.wiedii.shoppingcart.viewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.wiedii.shoppingcart.R
import com.wiedii.shoppingcart.viewModel.models.Cart
import com.wiedii.shoppingcart.viewModel.models.Movie
import com.wiedii.shoppingcart.viewModel.models.MovieResponse
import com.wiedii.shoppingcart.viewModel.services.MovieAPIInterface
import com.wiedii.shoppingcart.viewModel.services.MovieApiService
import kotlinx.android.synthetic.main.fragment_cart.*
import kotlinx.android.synthetic.main.fragment_content.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CartFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewCart.layoutManager = LinearLayoutManager(this.context)
        recyclerViewCart.setHasFixedSize(true)

        /*
        getMovieData { movies : List<Movie> ->
            recyclerViewCart.adapter = MovieAdapter(movies,
                clickClousure = {
                    Toast.makeText(requireContext(), "Agregado al carrito ${it.title}", Toast.LENGTH_SHORT).show()
                    val listCartMovies: MutableList<Movie> = mutableListOf()
                    listCartMovies.add(it)
                }
            )
        }*/
    }

    /*
    private fun getMovieData(callback : (List<Movie>) -> Unit){

        val apiService = MovieApiService.getInstance().create(MovieAPIInterface::class.java)

        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {

                return callback(response.body()!!.movies)
            }
        })

    }*/
}