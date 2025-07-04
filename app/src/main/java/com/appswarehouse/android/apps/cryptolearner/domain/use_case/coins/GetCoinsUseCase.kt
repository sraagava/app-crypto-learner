package com.appswarehouse.android.apps.cryptolearner.domain.use_case.coins

import com.appswarehouse.android.apps.cryptolearner.common.Response
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.toCoin
import com.appswarehouse.android.apps.cryptolearner.domain.model.Coin
import com.appswarehouse.android.apps.cryptolearner.domain.repository.CoinRepository
import com.appswarehouse.android.apps.cryptolearner.domain.util.safeDataCall
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetCoinsUseCase(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Response<List<Coin>>> = flow {
        emit(Response.Loading())
        emit(safeDataCall {
            repository.getCoins().map {
                it.toCoin()
            }
        })
    }
}