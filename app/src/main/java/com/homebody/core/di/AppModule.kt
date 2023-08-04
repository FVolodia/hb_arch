package com.homebody.core.di

import com.homebody.features.auth.AuthNavigator
import com.homebody.features.auth.LoginViewModel
import com.homebody.features.dashboard.DashboardViewModel
import com.homebody.features.feature1.Feature1Navigator
import com.homebody.features.feature1.Feature1ViewModel
import com.homebody.features.home.HomeNavigator
import com.homebody.features.home.payment.PaymentsViewModel
import com.homebody.navigation.AppNavigator
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.dsl.module

//todo: split modules (viewModelsModule, navigatorsModule, etc)
//Official documentation - https://insert-koin.io/docs/reference/koin-compose/compose
//val appModules = listOf(AppModule().module)
val appModules = module {
    single { AppNavigator(get(), get(), get()) }
    single { AuthNavigator() }
    single { Feature1Navigator() }
    single { HomeNavigator() }
    viewModel { LoginViewModel(get()) }
    viewModel { DashboardViewModel(get()) }
    viewModel { Feature1ViewModel() }
    viewModel { PaymentsViewModel() }
}

@Module
@ComponentScan
class AppModule