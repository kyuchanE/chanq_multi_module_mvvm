package com.example.chanq_mulit_module_mvvm.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.data.remote.api.LotteryApi
import dev.kyu.data.repository.remote.datasource.LotteryDataSource
import dev.kyu.data.repository.remote.datasourceImpl.LotteryDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceImplModule {

    @Provides
    @Singleton
    fun provideLotteryDataSource(
        lotteryApi: LotteryApi
    ): LotteryDataSource =
        LotteryDataSourceImpl(lotteryApi)
}