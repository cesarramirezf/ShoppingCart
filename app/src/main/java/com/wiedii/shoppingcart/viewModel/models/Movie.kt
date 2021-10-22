package com.wiedii.shoppingcart.viewModel.models

import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (

    @SerializedName("title") val title: String?,

    @SerializedName("poster_path") val poster: String?,

    @SerializedName( "overview") val overview: String?,
) : Parcelable{
    constructor() : this("", "", "")
}