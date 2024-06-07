package com.example.doublecard.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DoubleCard(
    @DrawableRes val imageResource: Int,
    @StringRes val stringDescription: Int
)
