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
internal fun SignUpScreenRoute(
    navController: NavHostController,
) {
//    val registerUiState by viewModel.registerUiState.collectAsStateWithLifecycle()
    SignUpScreen(navController=navController)
}

@Composable
private fun SignUpScreen(
    navController: NavHostController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp) // Margin for the LazyColumn
    ) {
        item {
            Spacer(modifier = Modifier.height(16.dp)) // Margin for the first item

            Image(
                painter = painterResource(id = com.nabiha.awalkerja.R.drawable.chevron_left),
                contentDescription = "Back",
                modifier = Modifier
                    .size(32.dp)
                    .clickable(onClick = {})
                    .padding(6.dp)
            )

            Spacer(modifier = Modifier.height(16.dp)) // Margin for the title "Buat Akun Baru"

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Buat Akun Baru",
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(8.dp)) // Margin for the text "Mulailah perjalanan karir Anda..."

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Mulailah perjalanan karier Anda dengan membuat akun baru. Dapatkan akses penuh ke semua materi pelatihan dan persiapan tes kerja kami.",
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = Color(0xFF555555),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(40.dp)) // Margin for the image "Decor of sign up"

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = com.nabiha.awalkerja.R.drawable.pict_signup_page),
                    contentDescription = "Decor of sign up",
                    modifier = Modifier
                        .size(256.dp)
                        .clickable(onClick = {})
                )
            }

            Spacer(modifier = Modifier.height(40.dp)) // Margin for the "Google" button

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .width(300.dp)
                        .padding(bottom = 16.dp)
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary)
                ) {
                    Image(
                        painter = painterResource(id = com.nabiha.awalkerja.R.drawable.google),
                        contentDescription = "Google",
                        modifier = Modifier
                            .size(32.dp)
                            .padding(6.dp)
                    )
                    Text(
                        text = "Google",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = MaterialTheme.colorScheme.surface
                    )

                }
            }

            Spacer(modifier = Modifier.height(16.dp)) // Margin for the "Email" button

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .width(300.dp)
                        .padding(bottom = 16.dp)
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary)
                ) {
                    Image(
                        painter = painterResource(id = com.nabiha.awalkerja.R.drawable.email),
                        contentDescription = "Google",
                        modifier = Modifier
                            .size(32.dp)
                            .padding(6.dp)
                    )
                    Text(
                        text = "Email",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = MaterialTheme.colorScheme.surface
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp)) // Margin for the text "Already have an account?..."

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Already have an account? ",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = Color(0xFF555555),
                            fontSize = 14.sp
                        )
                    )

                    ClickableText(
                        text = AnnotatedString("Sign in"),
                        onClick = { offset ->
                            //navController.navigateToLoginScreen()
                        },
                        style = androidx.compose.ui.text.TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            textDecoration = TextDecoration.Underline
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(76.dp)) // Margin for the last text

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Dengan menggunakan aplikasi ini, Anda mengkonfirmasi bahwa Anda telah membaca dan menyetujui Ketentuan Layanan serta Kebijakan Privasi kami.",
                    style =  MaterialTheme.typography.bodyMedium.copy(
                        color = Color(0xFF555555), // Color #555555
                        fontSize = 12.sp
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}

@Composable
@Preview
private fun SignUpScreenPreview() {
    val navController = rememberNavController()
    SignUpScreenRoute(navController = navController)
}
