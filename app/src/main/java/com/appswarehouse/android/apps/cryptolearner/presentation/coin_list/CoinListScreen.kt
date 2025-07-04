package com.appswarehouse.android.apps.cryptolearner.presentation.coin_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.appswarehouse.android.apps.cryptolearner.presentation.coin_list.components.CoinsListItem
import com.appswarehouse.android.apps.cryptolearner.presentation.navigation.Screens
import org.koin.androidx.compose.koinViewModel

@Composable
fun CoinListScreen(
    navController: NavHostController,
    viewModel: CoinListViewModel = koinViewModel()
) {

    val state = viewModel.coinsState.value

    Box(modifier = Modifier.fillMaxSize()) {
        if (state.coins.isNotEmpty()) {
            LazyColumn {
                items(state.coins) { coin ->
                    CoinsListItem(
                        coin = coin
                    ) {
                        navController.navigate(Screens.CoinDetailScreen(coinId = coin.id))
                    }
                }
            }
        }
    }

}