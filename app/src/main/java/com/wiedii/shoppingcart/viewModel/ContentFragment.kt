package com.wiedii.shoppingcart.viewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wiedii.shoppingcart.R
import com.wiedii.shoppingcart.viewModel.models.Movie
import com.wiedii.shoppingcart.viewModel.models.MovieResponse
import com.wiedii.shoppingcart.viewModel.services.MovieAPIInterface
import com.wiedii.shoppingcart.viewModel.services.MovieApiService
import kotlinx.android.synthetic.main.card_layout.*
import kotlinx.android.synthetic.main.fragment_content.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ContentFragment : Fragment() {

    private val movieImage = listOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(this.context)
        recyclerView.setHasFixedSize(true)
        getMovieData { movies : List<Movie> ->
            recyclerView.adapter = MovieAdapter(movies,
                clickClousure = {
                    Toast.makeText(requireContext(), "Agregado al carrito ${it.title}", Toast.LENGTH_SHORT).show()
                    val listCartMovies: MutableList<Movie> = mutableListOf()
                    listCartMovies.add(it)
                }
            )
        }
    }

    private fun getMovieData(callback : (List<Movie>) -> Unit){

        val apiService = MovieApiService.getInstance().create(MovieAPIInterface::class.java)

        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {

                return callback(response.body()!!.movies)
            }
        })

    }
}