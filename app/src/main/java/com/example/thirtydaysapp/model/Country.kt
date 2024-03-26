package com.example.thirtydaysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Country(
    @StringRes val name : Int,
    @StringRes val language : Int,
    @StringRes val description : Int,
    @DrawableRes val flag: Int
)
