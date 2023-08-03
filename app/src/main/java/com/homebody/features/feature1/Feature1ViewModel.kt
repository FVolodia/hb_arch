package com.homebody.features.feature1

import com.homebody.core.ui.BaseViewModel
import com.homebody.core.ui.UiState
import com.homebody.features.feature1.Feature1ViewModel.Feature1UiState.Test
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf

class Feature1ViewModel : BaseViewModel<Feature1ViewModel.Feature1UiState>() {

    override val uiState: StateFlow<Feature1UiState> =
        flowOf(Test)
            .asState(Test)

    sealed interface Feature1UiState : UiState {
        data object Test : Feature1UiState
    }
}