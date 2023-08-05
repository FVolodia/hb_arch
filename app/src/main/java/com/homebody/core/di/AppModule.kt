package com.homebody.core.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.ksp.generated.module

/**
 * Compose - https://insert-koin.io/docs/reference/koin-compose/compose
 * Annotations - https://insert-koin.io/docs/quickstart/android-annotations/
 */
val appModules = listOf(
    AppModule().module,
    apiModule
)

@Module
@ComponentScan("com.homebody")
class AppModule