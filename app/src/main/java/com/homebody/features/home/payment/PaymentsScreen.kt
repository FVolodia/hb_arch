package com.homebody.features.home.payment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.homebody.R
import com.homebody.composable.expiredCard.ExpiredCard
import com.homebody.composable.expiredCard.ExpiredCardEvent
import com.homebody.composable.expiredCard.data.ExpiredCardData
import com.homebody.composable.loader.LoadingView
import com.homebody.composable.payment.PaymentCard
import com.homebody.composable.payment.PaymentEvent
import com.homebody.composable.payment.data.PaymentData
import com.homebody.core.ui.BaseScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun PaymentsScreen(viewModel: PaymentsViewModel = koinViewModel()) =
    BaseScreen(viewModel) { state ->
        when (val data = state.value) {
            PaymentsViewModel.HomeUiState.Loading -> LoadingView()
            is PaymentsViewModel.HomeUiState.Successes -> PaymentsScreenContent(data.expiredCard, data.paymentsList)
        }
    }

@Composable
fun PaymentsScreenContent(
    expiredCard: ExpiredCardData?,
    paymentsList: List<PaymentData>,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFDFDFD))
    ) {
        Text(
            text = stringResource(R.string.upcoming_payments),
            fontSize = 18.sp,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(all = 16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            expiredCard?.let { expiredCardData ->
                item {
                    ExpiredCard(
                        data = expiredCardData,
                        eventListener = { event ->
                            //todo: handle events
                            when (event) {
                                ExpiredCardEvent.OnClick -> {}
                                ExpiredCardEvent.OnEditClick -> {}
                            }
                        }
                    )
                }
            }
            paymentsList.forEach { payment ->
                item {
                    PaymentCard(
                        data = payment,
                        eventListener = { event ->
                            //todo: handle events
                            when (event) {
                                PaymentEvent.OnClick -> {}
                                PaymentEvent.OnEditClick -> {}
                            }
                        }
                    )
                }
            }
        }
    }
}