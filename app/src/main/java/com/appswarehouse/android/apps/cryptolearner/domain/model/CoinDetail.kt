package com.appswarehouse.android.apps.cryptolearner.domain.model

import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.Tag
import com.appswarehouse.android.apps.cryptolearner.data.remote.dto.TeamMember

data class CoinDetail(
    val description: String,
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val logo: String,
    val name: String,
    val openSource: Boolean,
    val orgStructure: String,
    val proofType: String,
    val rank: Int,
    val startedAt: String,
    val symbol: String,
    val tags: List<Tag>,
    val teamMembers: List<TeamMember>,
    val type: String,
)