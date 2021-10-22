package com.wiedii.shoppingcart.viewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wiedii.shoppingcart.R
import com.wiedii.shoppingcart.viewModel.models.Cart
import kotlinx.android.synthetic.main.card_layout.view.*

class CartAdapter ( private val cart : List<Cart>, val clickClousure: (Cart) -> Unit) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>(){

                inner class CartViewHolder(view: View) : RecyclerView.ViewHolder(view){

                    fun bindCart(cart: Cart){
                        itemView.movie_title.text = cart.title
                        itemView.movie_descrip.text = cart.overview
                        Glide.with(itemView).load(IMAGE_BASE_CART + cart.poster).into(itemView.item_image)

                        itemView.shopping_card_cl.setOnClickListener {
                            clickClousure(cart)
                        }
                    }
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bindCart(cart.get(position))
    }

    override fun getItemCount(): Int = cart.size

    companion object{

        const val IMAGE_BASE_CART = "https://image.tmdb.org/t/p/w500/"
    }
}