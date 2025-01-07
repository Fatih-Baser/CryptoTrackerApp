package com.fatihbaser.cryptotrackerapp.crypto.presentation.coin_list

import androidx.lifecycle.ViewModel
import com.fatihbaser.cryptotrackerapp.crypto.domain.CoinDataSource

class CoinListViewModel(
    private val coinDataSource: CoinDataSource
): ViewModel() {
}