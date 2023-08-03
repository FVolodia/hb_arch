package com.homebody.features.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.homebody.composable.LoadingView
import com.homebody.core.ui.BaseScreen
import com.homebody.features.auth.LoginViewModel.LoginUiState
import org.koin.androidx.compose.koinViewModel

@Composable
internal fun LoginScreen(viewModel: LoginViewModel = koinViewModel()) =
    BaseScreen(viewModel) { state ->
        when (state.value) {
            is LoginUiState.Loading -> LoadingView()
            is LoginUiState.LogIn -> LoginView(viewModel)
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LoginView(events: LoginUiEvents) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding(),
    ) {
        Text(text = "LoginView")
    }
}

@Composable
@Preview
private fun LoginPreview() {
    MaterialTheme {
        LoginView(object : LoginUiEvents {
            override fun onLoginClicked(email: String, password: String) {}
            override fun onSignupClicked() {}
        })
    }
}