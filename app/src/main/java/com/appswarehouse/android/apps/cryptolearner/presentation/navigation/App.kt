package com.appswarehouse.android.apps.cryptolearner.presentation.navigation

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.appswarehouse.android.apps.cryptolearner.presentation.coin_detail.CoinDetailScreen
import com.appswarehouse.android.apps.cryptolearner.presentation.coin_list.CoinListScreen

@Composable
fun App(
    intent: Intent,
    innerPadding: PaddingValues
) {

    val navController = rememberNavController()
    Box(modifier = Modifier.fillMaxSize()) {
        NavHost(
            navController = navController,
            startDestination = Screens.CoinListScreen,
            modifier = Modifier.fillMaxSize()
        ) {
            composable<Screens.CoinListScreen> {
                CoinListScreen(navController)
            }

            composable<Screens.CoinDetailScreen> { backStackEntry ->
                val args = backStackEntry.toRoute<Screens.CoinDetailScreen>()
                CoinDetailScreen(
                    navController = navController,
                    coinId = args.coinId
                )
            }
        }
    }
}