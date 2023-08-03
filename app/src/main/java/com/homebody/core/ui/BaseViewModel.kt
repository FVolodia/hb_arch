package com.homebody.core.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.stateIn
import kotlin.time.Duration.Companion.seconds

abstract class BaseViewModel<State : UiState> : ViewModel() {

    abstract val uiState: StateFlow<State>

    /**
     * Converts a cold Flow into a hot [StateFlow]
     */
    protected fun <T> Flow<T>.asState(defaultState: T): StateFlow<T> =
        stateIn(viewModelScope, WhileSubscribed(1.seconds.inWholeMilliseconds), defaultState)

    /**
     * Converts a cold Flow into a hot [SharedFlow]
     */
    protected fun <T> Flow<T>.shared(): SharedFlow<T> =
        shareIn(viewModelScope, WhileSubscribed(1.seconds.inWholeMilliseconds), 1)
}