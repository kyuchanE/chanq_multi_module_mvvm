package dev.kyu.lottery.navigator

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.navigator.LotteryNavigator
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface NavigatorModule {

    @Binds
    @Singleton
    fun bindLotteryNavigator(lotteryNavigatorImpl: LotteryNavigatorImpl): LotteryNavigator

}