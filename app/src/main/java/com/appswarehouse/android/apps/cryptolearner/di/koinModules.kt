package com.appswarehouse.android.apps.cryptolearner.di

import com.appswarehouse.android.apps.cryptolearner.BuildConfig
import com.appswarehouse.android.apps.cryptolearner.data.remote.api.CryptoApi
import com.appswarehouse.android.apps.cryptolearner.data.repository.CoinRepositoryImpl
import com.appswarehouse.android.apps.cryptolearner.domain.repository.CoinRepository
import com.appswarehouse.android.apps.cryptolearner.domain.use_case.coins.GetCoinUseCase
import com.appswarehouse.android.apps.cryptolearner.domain.use_case.coins.GetCoinsUseCase
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModules = module {

    single {
        Retrofit
            .Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single {
        get<Retrofit>().create(CryptoApi::class.java)
    }

    single<CoinRepository> {
        CoinRepositoryImpl(get())
    }

    factory {
        GetCoinUseCase(get())
    }

    factory {
        GetCoinsUseCase(get())
    }
}