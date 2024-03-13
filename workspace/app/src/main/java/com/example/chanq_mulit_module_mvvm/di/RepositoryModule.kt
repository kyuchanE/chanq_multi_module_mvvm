package com.example.chanq_mulit_module_mvvm.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.data.repository.LotteryRepositoryImpl
import dev.kyu.data.repository.remote.datasourceImpl.LotteryDataSourceImpl
import dev.kyu.domain.repository.LotteryRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideLotteryRepository(
        lotteryDataSourceImpl: LotteryDataSourceImpl
    ): LotteryRepository = LotteryRepositoryImpl(lotteryDataSourceImpl)

}