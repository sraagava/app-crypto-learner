package com.appswarehouse.android.apps.cryptolearner.data.remote.dto


import com.appswarehouse.android.apps.cryptolearner.domain.model.CoinDetail
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinDetailDto(
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("is_new")
    val isNew: Boolean,
    @SerialName("logo")
    val logo: String,
    @SerialName("name")
    val name: String,
    @SerialName("open_source")
    val openSource: Boolean,
    @SerialName("org_structure")
    val orgStructure: String,
    @SerialName("proof_type")
    val proofType: String,
    @SerialName("rank")
    val rank: Int,
    @SerialName("started_at")
    val startedAt: String,
    @SerialName("symbol")
    val symbol: String,
    @SerialName("tags")
    val tags: List<Tag>,
    @SerialName("team")
    val teamMembers: List<TeamMember>,
    @SerialName("type")
    val type: String,
)

fun CoinDetailDto.toCoinDetail() = CoinDetail(
    description = this.description,
    id = this.id,
    isActive = this.isActive,
    isNew = this.isNew,
    logo = this.logo,
    name = this.name,
    openSource = this.openSource,
    orgStructure = this.orgStructure,
    proofType = this.proofType,
    rank = this.rank,
    startedAt = this.startedAt,
    symbol = this.symbol,
    tags = this.tags,
    teamMembers = this.teamMembers,
    type = this.type,
)