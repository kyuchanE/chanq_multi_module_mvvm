package dev.kyu.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.data.repository.LotteryRepositoryImpl
import dev.kyu.data.repository.RandomUserRepositoryImpl
import dev.kyu.domain.repository.LotteryRepository
import dev.kyu.domain.repository.RandomUserRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindLotteryRepository(lotteryRepositoryImpl: LotteryRepositoryImpl): LotteryRepository

    @Binds
    @Singleton
    fun bindRandomUserRepository(randomUserRepositoryImpl: RandomUserRepositoryImpl): RandomUserRepository

}