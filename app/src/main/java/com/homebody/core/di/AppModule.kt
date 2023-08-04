package com.homebody.core.di

import com.homebody.features.auth.LoginViewModel
import com.homebody.features.dashboard.DashboardViewModel
import com.homebody.features.home.payment.PaymentsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.dsl.module

//todo: split modules (viewModelsModule, navigatorsModule, etc)
//Official documentation - https://insert-koin.io/docs/reference/koin-compose/compose
//val appModules = listOf(AppModule().module)
val appModules = listOf(
    module {
        viewModel { LoginViewModel() }
        viewModel { DashboardViewModel() }
        viewModel { PaymentsViewModel() }
    },
    apiModule
)

@Module
@ComponentScan
class AppModule