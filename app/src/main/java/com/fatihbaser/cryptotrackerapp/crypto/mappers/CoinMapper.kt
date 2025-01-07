package com.fatihbaser.cryptotrackerapp.crypto.mappers

import com.fatihbaser.cryptotrackerapp.crypto.domain.Coin
import com.fatihbaser.cryptotrackerapp.crypto.networking.dto.CoinDto

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}