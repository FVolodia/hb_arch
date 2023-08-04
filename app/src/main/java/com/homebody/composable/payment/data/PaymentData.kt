package com.homebody.composable.payment.data

import com.homebody.R

//todo: add data class for each type of insurance
//todo: maybe add icon value to each data class
sealed class PaymentData(
    open val policy: String,
    open val dataItems: List<PaymentItemData>
) {

    data class RentersInsurance(
        override val policy: String,
        override val dataItems: List<PaymentItemData>
    ) : PaymentData(
        policy = policy,
        dataItems = dataItems
    )

    data class PetInsurance(
        override val policy: String,
        override val dataItems: List<PaymentItemData>
    ) : PaymentData(
        policy = policy,
        dataItems = dataItems
    )

    val title: Int
        get() = when (this) {
            is RentersInsurance -> R.string.renters_insurance
            is PetInsurance -> R.string.pet_insurance
        }

}
