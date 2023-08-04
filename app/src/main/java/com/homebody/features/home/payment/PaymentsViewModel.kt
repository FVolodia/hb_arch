package com.homebody.features.home.payment

import com.homebody.composable.expiredCard.data.ExpiredCardData
import com.homebody.composable.payment.data.PaymentData
import com.homebody.composable.payment.data.PaymentItemData
import com.homebody.core.ui.BaseViewModel
import com.homebody.core.ui.UiState
import com.homebody.features.home.payment.PaymentsViewModel.HomeUiState.Loading
import com.homebody.features.home.payment.PaymentsViewModel.HomeUiState.Successes
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf

class PaymentsViewModel : BaseViewModel<PaymentsViewModel.HomeUiState>() {

    override val uiState: StateFlow<HomeUiState> =
        flowOf(
            Successes(
                ExpiredCardData(
                    cardEnding = "1234",
                    expireDate = "08/23"
                ),
                listOf(
                    PaymentData.RentersInsurance(
                        policy = "1098314798745",
                        dataItems = listOf(
                            PaymentItemData.PaymentDue(
                                value = "July 1, 2023"
                            ),
                            PaymentItemData.Amount(
                                value = "\$28.96 monthly"
                            ),
                            PaymentItemData.Method(
                                value = "Visa ending in 1234"
                            )
                        )
                    ),
                    PaymentData.PetInsurance(
                        policy = "1098314798745",
                        dataItems = listOf(
                            PaymentItemData.PaymentDue(
                                value = "July 1, 2023"
                            ),
                            PaymentItemData.Amount(
                                value = "\$8.96 monthly"
                            ),
                            PaymentItemData.Method(
                                value = "Visa ending in 1234"
                            )
                        )
                    ),
                )
            )
        ).asState(Loading)

    sealed interface HomeUiState : UiState {
        data class Successes(
            val expiredCard: ExpiredCardData?,
            val paymentsList: List<PaymentData>,
        ) : HomeUiState

        data object Loading : HomeUiState
    }
}