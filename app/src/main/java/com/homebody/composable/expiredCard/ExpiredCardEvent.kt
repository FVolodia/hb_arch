package com.homebody.composable.expiredCard

sealed class ExpiredCardEvent {
    data object OnClick : ExpiredCardEvent()
    data object OnEditClick : ExpiredCardEvent()
}