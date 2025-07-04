package com.appswarehouse.android.apps.cryptolearner.data.remote.dto


import com.appswarehouse.android.apps.cryptolearner.domain.model.Coin
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    @SerialName("id")
    val id: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("is_new")
    val isNew: Boolean,
    @SerialName("name")
    val name: String,
    @SerialName("rank")
    val rank: Int,
    @SerialName("symbol")
    val symbol: String,
    @SerialName("type")
    val type: String
)

fun CoinDto.toCoin() = Coin(
    id = this.id,
    isActive = this.isActive,
    isNew = this.isNew,
    name = this.name,
    rank = this.rank,
    symbol = this.symbol,
    type = this.type,
)