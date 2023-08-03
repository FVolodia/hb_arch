package com.homebody.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LoadingView() {
    Column {
        Text(text = "Loading...")
    }
}