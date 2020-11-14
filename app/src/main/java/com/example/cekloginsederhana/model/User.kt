package com.example.cekloginsederhana.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var email : String,
    var password : String
) : Parcelable