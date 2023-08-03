package com.homebody.core.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * Base component to handle [UiState] changes
 */
@Composable
fun <S : UiState> BaseScreen(
    viewModel: BaseViewModel<S>,
    content: @Composable (State<S>) -> Unit,
) {
    content(viewModel.uiState.collectAsStateWithLifecycle())
}