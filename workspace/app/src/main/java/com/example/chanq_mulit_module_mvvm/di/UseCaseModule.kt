package com.example.chanq_mulit_module_mvvm.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.domain.repository.LotteryRepository
import dev.kyu.domain.usecase.GetLotteryRepoUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetLotteryRepoUseCase(repository: LotteryRepository) = GetLotteryRepoUseCase(repository)
}