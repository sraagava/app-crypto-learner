package com.appswarehouse.android.apps.cryptolearner

import android.app.Application
import com.appswarehouse.android.apps.cryptolearner.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level


class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@BaseApplication)

            appModules
        }
    }
}