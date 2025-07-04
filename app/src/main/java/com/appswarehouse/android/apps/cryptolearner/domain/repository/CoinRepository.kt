package com.appswarehouse.android.apps.cryptolearner.domain.repository

import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.CoinDetailDto
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoin(coinId: String): CoinDetailDto
}