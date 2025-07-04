package com.appswarehouse.android.apps.cryptolearner.data.remote.api

import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.CoinDetailDto
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path


interface CryptoApi {

    @GET("/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/coin/{coinId}")
    suspend fun getCoin(@Path("coinId") coinId: String): CoinDetailDto

}