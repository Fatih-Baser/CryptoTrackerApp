package com.fatihbaser.cryptotrackerapp.di

import com.fatihbaser.cryptotrackerapp.core.data.networking.HttpClientFactory
import com.fatihbaser.cryptotrackerapp.crypto.domain.CoinDataSource
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import com.fatihbaser.cryptotrackerapp.crypto.networking.RemoteCoinDataSource
import com.fatihbaser.cryptotrackerapp.crypto.presentation.coin_list.CoinListViewModel

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
       singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}