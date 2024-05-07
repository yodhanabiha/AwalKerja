package com.nabiha.awalkerja.features.authFeatures.register

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.time.format.TextStyle
import com.nabiha.awalkerja.R

@RequiresApi(Build.VERSION_CODES.O)
@Composable
internal fun BuatProfileScreenRoute(
//    viewModel: RegisterViewModel = hiltViewModel(),
    navController: NavHostController,
) {
//    val registerUiState by viewModel.registerUiState.collectAsStateWithLifecycle()
    BuatProfileScreen(navController=navController)
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
private fun BuatProfileScreen(
    navController: NavHostController
) {


    var firstName by remember {
        mutableStateOf("")
    }

    var lastName by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp) // Margin for the LazyColumn
    ) {
        item {
            Spacer(modifier = Modifier.height(16.dp)) // Margin for the first item

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = com.nabiha.awalkerja.R.drawable.chevron_left),
                    contentDescription = "Back",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable(onClick = {})
                        .padding(6.dp)
                )

                Spacer(modifier = Modifier.width(8.dp)) // Spacer dengan lebar 8dp

                Image(
                    painter = painterResource(id = com.nabiha.awalkerja.R.drawable.progress_bar),
                    contentDescription = "Progress Bar",
                    modifier = Modifier
                        .width(300.dp) // Lebar 300dp
                        .height(12.dp) // Tinggi 12dp
                )
            }

            Spacer(modifier = Modifier.height(16.dp)) // Margin for the title "Buat Akun Baru"

            Text(
                text = "Buat Profile",
                style = MaterialTheme.typography.labelMedium.copy(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 20.dp) // Margin 20dp atas
            )

            Spacer(modifier = Modifier.height(8.dp)) // Margin for the text "Mulailah perjalanan karir Anda..."

            Text(
                text = "Mulailah untuk membuat profil pribadi Anda!",
                style = MaterialTheme.typography.labelMedium.copy(
                    color = Color(0xFF555555),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp) // Margin 8dp atas
            )

            Spacer(modifier = Modifier.height(40.dp)) // Margin for the image "Decor of sign up"

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                OutlinedTextField(
                    value = firstName,
                    onValueChange = { firstName = it },
                    label = { Text("First Name") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                OutlinedTextField(
                    value = lastName,
                    onValueChange = { lastName = it },
                    label = { Text("Last Name") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    visualTransformation = PasswordVisualTransformation()
                )

                Spacer(modifier = Modifier.height(72.dp)) // Margin atas pada text dengan menggunakan aplikasi ini sebanyak 98dp

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Dengan menggunakan aplikasi ini, Anda mengkonfirmasi bahwa Anda telah membaca dan menyetujui Ketentuan Layanan serta Kebijakan Privasi kami.",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = Color(0xFF555555), // Color #555555
                            fontSize = 12.sp
                        ),
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(48.dp)) // Margin atas pada button lanjut sebanyak 48dp

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                        .height(37.dp),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary),
                ) {
                    Text(
                        text = "Lanjut",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        ),
                        color = MaterialTheme.colorScheme.surface
                    )

                }
            }
        }
    }

}

@Composable
@Preview
private fun BuatProfileScreenPreview() {
    val navController = rememberNavController()
    BuatProfileScreenRoute(navController = navController)
}
