package com.example.thirtydaysapp.data

import com.example.thirtydaysapp.R
import com.example.thirtydaysapp.model.Country

class Datasource {
    fun loadCountries() : List<Country>{
        return listOf(
            Country(R.string.country1_name, R.string.country1_language, R.string.country1_description, R.drawable.brazil),
            Country(R.string.country2_name, R.string.country2_language, R.string.country2_description, R.drawable.france),
            Country(R.string.country3_name, R.string.country3_language, R.string.country3_description, R.drawable.japan),
            Country(R.string.country4_name, R.string.country4_language, R.string.country4_description, R.drawable.italy),
            Country(R.string.country5_name, R.string.country5_language, R.string.country5_description, R.drawable.india),
            Country(R.string.country6_name, R.string.country6_language, R.string.country6_description, R.drawable.spain),
            Country(R.string.country7_name, R.string.country7_language, R.string.country7_description, R.drawable.australia),
            Country(R.string.country8_name, R.string.country8_language, R.string.country8_description, R.drawable.china),
            Country(R.string.country9_name, R.string.country9_language, R.string.country9_description, R.drawable.egypt),
            Country(R.string.country10_name, R.string.country10_language, R.string.country10_description, R.drawable.germany),
            Country(R.string.country11_name, R.string.country11_language, R.string.country11_description, R.drawable.canada),
            Country(R.string.country12_name, R.string.country12_language, R.string.country12_description, R.drawable.greece),
            Country(R.string.country13_name, R.string.country13_language, R.string.country13_description, R.drawable.russia),
            Country(R.string.country14_name, R.string.country14_language, R.string.country14_description, R.drawable.mexico),
            Country(R.string.country15_name, R.string.country15_language, R.string.country15_description, R.drawable.united_kingdom),
            Country(R.string.country16_name, R.string.country16_language, R.string.country16_description, R.drawable.south_africa),
            Country(R.string.country17_name, R.string.country17_language, R.string.country17_description, R.drawable.thailand),
            Country(R.string.country18_name, R.string.country18_language, R.string.country18_description, R.drawable.argentina),
            Country(R.string.country19_name, R.string.country19_language, R.string.country19_description, R.drawable.turkey),
            Country(R.string.country20_name, R.string.country20_language, R.string.country20_description, R.drawable.new_zealand),
            Country(R.string.country21_name, R.string.country21_language, R.string.country21_description, R.drawable.sweden),
            Country(R.string.country22_name, R.string.country22_language, R.string.country22_description, R.drawable.peru),
            Country(R.string.country23_name, R.string.country23_language, R.string.country23_description, R.drawable.south_korea),
            Country(R.string.country24_name, R.string.country24_language, R.string.country24_description, R.drawable.netherlands),
            Country(R.string.country25_name, R.string.country25_language, R.string.country25_description, R.drawable.switzerland),
            Country(R.string.country26_name, R.string.country26_language, R.string.country26_description, R.drawable.chile),
            Country(R.string.country27_name, R.string.country27_language, R.string.country27_description, R.drawable.vietnam),
            Country(R.string.country28_name, R.string.country28_language, R.string.country28_description, R.drawable.portugal),
            Country(R.string.country29_name, R.string.country29_language, R.string.country29_description, R.drawable.morocco),
            Country(R.string.country30_name, R.string.country30_language, R.string.country30_description, R.drawable.vietnam)
        )
    }
}
