package com.fatihbaser.cryptotrackerapp.crypto.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)