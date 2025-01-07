package com.fatihbaser.cryptotrackerapp.crypto.domain

import com.fatihbaser.cryptotrackerapp.core.data.domain.util.NetworkError
import com.fatihbaser.cryptotrackerapp.core.data.domain.util.Result


interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}