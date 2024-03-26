package com.example.thirtydaysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.unit.sp
import com.example.thirtydaysapp.data.Datasource
import com.example.thirtydaysapp.model.Country
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val countries = Datasource().loadCountries()
                    CountriesList(countries = countries)
                }
            }
        }
    }
}

@Composable
fun CountriesList(countries: List<Country>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp)
    ) {
        items(countries.size) { index ->
            val country = countries[index]
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp)
            ) {
                Text( text = "Day ${index + 1}")
            }
            CountryCard(country = country)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryCard(country: Country) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { /* Handle click */ }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = country.name)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = painterResource(id = country.flag),
                contentDescription = stringResource(id = country.name),
                modifier = Modifier.size(180.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Official language: ${stringResource(country.language)} ",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }

            Text(
                text = stringResource(id = country.description),
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Preview
@Composable
fun CountryCardPreview() {
    val country = Country(
        name = R.string.country1_name,
        language = R.string.country1_language,
        description = R.string.country1_description,
        flag = R.drawable.brazil
    )
    CountryCard(country = country)
}
