package com.wiedii.shoppingcart.viewModel.models

import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse (
        @SerializedName( "results") val movies : List<Movie>
    ) : Parcelable{
        constructor() : this(mutableListOf())
    }
