package com.appswarehouse.android.apps.cryptolearner.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appswarehouse.android.apps.cryptolearner.common.Response
import com.appswarehouse.android.apps.cryptolearner.domain.use_case.coins.GetCoinsUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class CoinListViewModel(
    private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {

    private val _coinsState = mutableStateOf<CoinListState>(CoinListState())
    val coinsState: State<CoinListState> = _coinsState

    init {
        getCoins()
    }

    private fun getCoins() {
        getCoinsUseCase.invoke().onEach {
            when (it) {
                is Response.Loading -> {
                    _coinsState.value = CoinListState(isLoading = true)
                }

                is Response.Error -> {
                    _coinsState.value = CoinListState(error = it.message)
                }

                is Response.Success -> {
                    _coinsState.value = CoinListState(coins = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }

}