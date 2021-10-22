package com.wiedii.shoppingcart.viewModel.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cart (
        @SerializedName("title") val title: String?,

        @SerializedName("poster_path") val poster: String?,

        @SerializedName( "overview") val overview: String?,
) : Parcelable {
        constructor() : this("", "", "")
}