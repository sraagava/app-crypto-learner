package com.appswarehouse.android.apps.cryptolearner.data.repository

import com.appswarehouse.android.apps.cryptolearner.data.remote.api.CryptoApi
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.CoinDetailDto
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.CoinDto
import com.appswarehouse.android.apps.cryptolearner.domain.repository.CoinRepository

class CoinRepositoryImpl(
    private val api: CryptoApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoin(coinId: String): CoinDetailDto {
        return api.getCoin(coinId)
    }
}