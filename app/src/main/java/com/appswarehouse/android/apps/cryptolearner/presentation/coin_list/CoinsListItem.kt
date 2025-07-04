package com.appswarehouse.android.apps.cryptolearner.presentation.coin_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appswarehouse.android.apps.cryptolearner.domain.model.Coin

@Composable
fun CoinsListItem(
    coin: Coin, onItemClick: ((coin: Coin) -> Unit)?
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "${coin.rank}. ${coin.name} (${coin.symbol})",
            fontSize = 24.sp,
        )
        Text(
            text = if (coin.isActive) "active" else "inactive",
            color = if (coin.isActive) Color.Green else Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CoinsListItemPreview() {
    CoinsListItem(
        coin = Coin(
            id = "sgns",
            isActive = true,
            isNew = true,
            name = "BitCoin",
            rank = 1,
            symbol = "BTC",
            type = "jingu chika",
        )
    ) {

    }
}