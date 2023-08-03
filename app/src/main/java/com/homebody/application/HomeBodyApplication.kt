package com.homebody.application

import android.app.Application
import com.homebody.core.di.appModules
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HomeBodyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            modules(appModules)
        }
    }
}