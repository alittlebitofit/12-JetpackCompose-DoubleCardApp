package com.example.doublecard.data

import com.example.doublecard.R
import com.example.doublecard.model.DoubleCard

class DataSource {
    fun loadDoubleCard(): List<DoubleCard> {
        return listOf(
            DoubleCard(imageResource = R.drawable.one, stringDescription = R.string.one),
            DoubleCard(imageResource = R.drawable.two, stringDescription = R.string.two),
            DoubleCard(imageResource = R.drawable.three, stringDescription = R.string.three),
            DoubleCard(imageResource = R.drawable.four, stringDescription = R.string.four),
            DoubleCard(imageResource = R.drawable.five, stringDescription = R.string.five),
            DoubleCard(imageResource = R.drawable.six, stringDescription = R.string.six),
            DoubleCard(imageResource = R.drawable.seven, stringDescription = R.string.seven),
            DoubleCard(imageResource = R.drawable.eight, stringDescription = R.string.eight),
            DoubleCard(imageResource = R.drawable.nine, stringDescription = R.string.nine),
            DoubleCard(imageResource = R.drawable.ten, stringDescription = R.string.ten),
            DoubleCard(imageResource = R.drawable.eleven, stringDescription = R.string.eleven),
            DoubleCard(imageResource = R.drawable.twelve, stringDescription = R.string.twelve),
            DoubleCard(imageResource = R.drawable.thirteen, stringDescription = R.string.thirteen),
            DoubleCard(imageResource = R.drawable.fourteen, stringDescription = R.string.fourteen),
            DoubleCard(imageResource = R.drawable.fifteen, stringDescription = R.string.fifteen),
            DoubleCard(imageResource = R.drawable.sixteen, stringDescription = R.string.sixteen),
            DoubleCard(imageResource = R.drawable.seventeen, stringDescription = R.string.seventeen),
            DoubleCard(imageResource = R.drawable.eighteen, stringDescription = R.string.eighteen),
            DoubleCard(imageResource = R.drawable.nineteen, stringDescription = R.string.nineteen),
            DoubleCard(imageResource = R.drawable.twenty, stringDescription = R.string.twenty),
        )
    }
}