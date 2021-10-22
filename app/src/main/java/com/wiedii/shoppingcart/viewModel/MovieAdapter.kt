package com.wiedii.shoppingcart.viewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wiedii.shoppingcart.R
import com.wiedii.shoppingcart.viewModel.models.Movie
import kotlinx.android.synthetic.main.card_layout.view.*

class MovieAdapter (private val movies : List<Movie>,val clickClousure: (Movie) -> Unit) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bindMovie(movie : Movie) {
            itemView.movie_title.text = movie.title
            itemView.movie_descrip.text = movie.overview
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.item_image)

            itemView.shopping_card_cl.setOnClickListener {
                clickClousure(movie)
            }
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

    companion object{

        const val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
    }
}



