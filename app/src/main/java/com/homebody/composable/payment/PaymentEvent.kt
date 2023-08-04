package com.homebody.composable.payment

sealed class PaymentEvent {
    data object OnClick : PaymentEvent()
    data object OnEditClick : PaymentEvent()
}