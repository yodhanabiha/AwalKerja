package com.nabiha.awalkerja.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CenterContent(modifier: Modifier = Modifier, content: @Composable () -> Unit) {

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
        ) {
        content()
    }
}