package com.homebody.features.feature1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.homebody.core.ui.BaseScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun Feature1Screen(viewModel: Feature1ViewModel = koinViewModel()) =
    BaseScreen(viewModel) { state ->
        when (state.value) {
            is Feature1ViewModel.Feature1UiState.Test -> TestView()
        }
    }

@Composable
private fun TestView(){
    Text(text = "Feature1Screen")
}