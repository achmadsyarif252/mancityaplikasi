package com.example.mancityaplikasi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Player(
    var name: String = "",
    var number: String = "",
    var position: String = "",
    var biodata: String = "",
    var photo: Int = 0,
) : Parcelable
