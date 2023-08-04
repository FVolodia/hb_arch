package com.homebody.composable.payment.data

import com.homebody.R

sealed class PaymentItemData(
    open val value: String,
) {

    data class PaymentDue(
        override val value: String,
    ) : PaymentItemData(value)

    data class Amount(
        override val value: String,
    ) : PaymentItemData(value)

    data class Method(
        override val value: String,
    ) : PaymentItemData(value)

    val title: Int
        get() = when (this) {
            is PaymentDue -> R.string.payment_due
            is Amount -> R.string.amount
            is Method -> R.string.method
        }

}
