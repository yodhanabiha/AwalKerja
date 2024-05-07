package com.nabiha.awalkerja.features.authFeatures.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nabiha.awalkerja.ui.component.COutlinedTextField
import com.nabiha.awalkerja.ui.component.CenterContent
import com.nabiha.awalkerja.ui.theme.AwalKerjaTheme
import com.nabiha.awalkerja.R
import com.nabiha.awalkerja.ui.component.CPasswordOutlinedTextField

@Composable
private fun LoginScreen() {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var showPassword by remember {
        mutableStateOf(false)
    }

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        item {
            Text(
                text = "Login",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 9.dp)
            )
            Text(
                text = "Mulai Persiapan Tes Kerja Anda!",
                style = MaterialTheme.typography.labelMedium,
                color = Color(0xFF555555),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            CenterContent(modifier = Modifier.padding(bottom = 16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.login_ill),
                    contentDescription = "",
                )
            }
            COutlinedTextField(
                value = email,
                onValueChange = { email = it },
                shape = RoundedCornerShape(12.dp),
                borderColor = Color(0xFFB5B5B5),
                placeholderText = "Email",
                modifier = Modifier.height(37.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            CPasswordOutlinedTextField(
                value = password,
                onValueChange = { password = it },
                shape = RoundedCornerShape(12.dp),
                borderColor = Color(0xFFB5B5B5),
                placeholderText = "Password",
                modifier = Modifier.height(37.dp),
                trailingIcon = {
                    if (showPassword) Icon(
                        painter = painterResource(id = R.drawable.eye_fill),
                        contentDescription = "",
                        modifier = Modifier.clickable {
                            showPassword = !showPassword
                        }
                    ) else Icon(
                        painter = painterResource(id = R.drawable.eye_slash_fill),
                        contentDescription = "",
                        modifier = Modifier.clickable {
                            showPassword = !showPassword
                        }
                    )
                }
            )
            Text(
                text = "Lupa Password!",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFF555555),
                modifier = Modifier.padding(top = 12.dp, bottom = 16.dp)
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFE7E7E7)),
                shape = RoundedCornerShape(16.dp),
                contentPadding = PaddingValues(0.dp)

            ) {
                Text(
                    text = "Log In!",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color(0xFF817F7F),
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            Row(
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(modifier = Modifier.weight(1f))
                Text(
                    text = "or",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(horizontal = 12.dp)
                )
                Divider(modifier = Modifier.weight(1f))
            }

            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                border = BorderStroke(1.dp, Color.Black),
                contentPadding = PaddingValues(0.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_colorfull),
                    modifier = Modifier.padding(end = 8.dp, top = 8.dp, bottom = 8.dp),
                    contentDescription = "",
                )
                Text(
                    text = "Lanjutkan dengan Google",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black,
                )
            }
        }

        item {
            Row(
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Belum Memiliki Akun? ",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 14.sp,
                    color = Color(0xFF555555),
                )
                Text(
                    text = "Daftar",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 14.sp,
                    color = Color.Black,
                    textDecoration = TextDecoration.Underline
                )
            }

        }


    }
}

@Composable
@Preview
private fun LoginScreenPrv() {
    AwalKerjaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen()
        }
    }
}