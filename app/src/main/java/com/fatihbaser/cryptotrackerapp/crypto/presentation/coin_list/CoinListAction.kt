package com.fatihbaser.cryptotrackerapp.crypto.presentation.coin_list

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}
