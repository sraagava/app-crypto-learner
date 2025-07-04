package com.appswarehouse.android.apps.cryptolearner.domain.use_case.coins

import com.appswarehouse.android.apps.cryptolearner.common.Response
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.toCoinDetail
import com.appswarehouse.android.apps.cryptolearner.domain.model.CoinDetail
import com.appswarehouse.android.apps.cryptolearner.domain.repository.CoinRepository
import com.appswarehouse.android.apps.cryptolearner.domain.util.safeDataCall
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetCoinUseCase(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Response<CoinDetail>> = flow {
        emit(Response.Loading())
        emit(safeDataCall {
            repository.getCoin(coinId = coinId).toCoinDetail()
        })
    }
}