package com.wiedii.shoppingcart.viewModel

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.wiedii.shoppingcart.viewModel.models.Cart
/*
class CartAdapter (

        private val cart : List<Cart>

        ) : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){

                class CartViewHolder(view: View) : RecyclerView.ViewHolder(view){

                }

        }


/*

class MovieAdapter (

    private val movies : List<Movie>

    ) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"

        fun bindMovie(movie : Movie) {
            itemView.movie_title.text = movie.title
            itemView.movie_descrip.text = movie.overview
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.item_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies.get(position))
    }

    override fun getItemCount(): Int = movies.size
}


 */