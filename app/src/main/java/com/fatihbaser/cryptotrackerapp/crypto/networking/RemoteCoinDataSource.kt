package com.fatihbaser.cryptotrackerapp.crypto.networking

import com.fatihbaser.cryptotrackerapp.core.data.domain.util.NetworkError
import com.fatihbaser.cryptotrackerapp.core.data.domain.util.map
import com.fatihbaser.cryptotrackerapp.core.data.networking.safeCall
import com.fatihbaser.cryptotrackerapp.crypto.domain.Coin
import com.fatihbaser.cryptotrackerapp.crypto.domain.CoinDataSource
import com.fatihbaser.cryptotrackerapp.crypto.networking.dto.CoinsResponseDto
import io.ktor.client.HttpClient
import com.fatihbaser.cryptotrackerapp.core.data.domain.util.Result
import com.fatihbaser.cryptotrackerapp.core.data.networking.constructUrl
import com.fatihbaser.cryptotrackerapp.crypto.mappers.toCoin
import io.ktor.client.request.get


class RemoteCoinDataSource(
    private val httpClient: HttpClient
): CoinDataSource {

    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}