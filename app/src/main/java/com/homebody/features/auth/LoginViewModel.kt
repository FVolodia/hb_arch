package com.homebody.features.auth

import com.homebody.core.ui.BaseViewModel
import com.homebody.core.ui.UiState
import com.homebody.domain.usecases.LoginUseCase
import com.homebody.features.auth.LoginViewModel.LoginUiState
import com.homebody.features.auth.LoginViewModel.LoginUiState.Loading
import com.homebody.features.auth.LoginViewModel.LoginUiState.LogIn
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class LoginViewModel(
    private val loginUseCase: LoginUseCase,
) : BaseViewModel<LoginUiState>(), LoginUiEvents {

    private val loadingState: MutableStateFlow<Boolean> = MutableStateFlow(false)

    override val uiState: StateFlow<LoginUiState> =
        loadingState
            .map { if (it) Loading else LogIn }
            .asState(LogIn)

    sealed class LoginUiState : UiState {
        data object LogIn : LoginUiState()
        data object Loading : LoginUiState()
    }

    override fun onLoginClicked(email: String, password: String) {

    }

    override fun onSignupClicked() {
//        authNavigator.navigateToSignup()
    }
}

interface LoginUiEvents {
    fun onLoginClicked(email: String, password: String)
    fun onSignupClicked()
}