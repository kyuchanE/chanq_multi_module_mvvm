package dev.kyu.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.data.api.LotteryApi
import dev.kyu.data.api.RandomUserApi
import dev.kyu.data.di.qualifier.LotteryService
import dev.kyu.data.di.qualifier.RandomUserService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Singleton
    @Provides
    fun provideLotteryApiService(@LotteryService provideLotteryRetrofit: Retrofit): LotteryApi =
        provideLotteryRetrofit.create(LotteryApi::class.java)

    @Singleton
    @Provides
    fun provideRandomUserApiService(@RandomUserService provideRandomUserRetrofit: Retrofit): RandomUserApi =
        provideRandomUserRetrofit.create(RandomUserApi::class.java)
}