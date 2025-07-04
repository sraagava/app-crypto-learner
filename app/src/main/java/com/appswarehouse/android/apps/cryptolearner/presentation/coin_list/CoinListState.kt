package com.appswarehouse.android.apps.cryptolearner.presentation.coin_list

import com.appswarehouse.android.apps.cryptolearner.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String? = null
)