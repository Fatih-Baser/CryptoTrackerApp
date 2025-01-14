package com.fatihbaser.cryptotrackerapp.crypto.presentation.coin_list

import com.fatihbaser.cryptotrackerapp.core.data.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}
