package com.nabiha.awalkerja.features.authFeatures.landing

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.nabiha.awalkerja.ui.theme.AwalKerjaTheme
import com.nabiha.awalkerja.R

@Composable
internal fun LandingScreenRoute(
//    viewModel: RegisterViewModel = hiltViewModel(),
    navController: NavHostController,
) {
//    val registerUiState by viewModel.registerUiState.collectAsStateWithLifecycle()
    LandingScreen(navController=navController)
}

@Composable
private fun LandingScreen(navController: NavHostController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.landing_ill), contentDescription = "")
            Text(
                text = "Maksimalkan Persiapan Karier\nAnda",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Dapatkan Persiapan Tes Kerja yang Disesuaikan dan Personal, Hanya dalam Sekejap!",
                style = MaterialTheme.typography.labelMedium,
                textAlign = TextAlign.Center,
                color = Color(0xFF555555)
            )
        }
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(horizontal = 16.dp)) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
            ) {
                Text(text = "Lanjut", style = MaterialTheme.typography.titleMedium)
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Text(text = "Log In", style = MaterialTheme.typography.titleMedium, color = Color.Black)
            }
        }

    }
}
