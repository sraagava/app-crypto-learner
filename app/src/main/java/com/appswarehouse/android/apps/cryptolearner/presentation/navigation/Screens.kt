package com.appswarehouse.android.apps.cryptolearner.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screens {

    @Serializable
    data object CoinListScreen : Screens()

    @Serializable
    data class CoinDetailScreen(val coinId: String) : Screens()
}