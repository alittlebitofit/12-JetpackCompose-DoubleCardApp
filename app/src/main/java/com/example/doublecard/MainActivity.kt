package com.example.doublecard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.doublecard.data.DataSource
import com.example.doublecard.model.DoubleCard
import com.example.doublecard.ui.theme.DoubleCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        hideSystemBars()
//        WindowInsetsControllerCompat(window, window.decorView).hide(WindowInsetsCompat.Type.systemBars())

        enableEdgeToEdge()
        setContent {
            DoubleCardTheme {
                DoubleCardApp()
            }
        }
    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemBars()
        }
    }

    private fun hideSystemBars() {
        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }
}

@Composable
fun DoubleCardApp(modifier: Modifier = Modifier) {
    Scaffold(containerColor = Color.Black) { innerPadding ->
        DoubleCardList(
            modifier
                .padding(innerPadding)
        )
    }
}

@Composable
private fun DoubleCardList(modifier: Modifier) {
    LazyColumn {
        items(DataSource().loadDoubleCard()) { card ->
            Row(
                horizontalArrangement = Arrangement.Center,
            ) {
                CardForApp(
                    doubleCard = card,
                    modifier = Modifier
                        .weight(1f)
                )
                CardForApp(
                    doubleCard = card,
                    modifier = Modifier
                        .weight(1f)
                )
            }
        }
    }
}

@Composable
fun CardForApp(doubleCard: DoubleCard, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(12.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = doubleCard.imageResource),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
            )

            Text(
                text = stringResource(id = doubleCard.stringDescription),
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp),
                color = Color.Black,
            )
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun GreetingPreview() {
    DoubleCardTheme {
        DoubleCardApp()
    }
}
