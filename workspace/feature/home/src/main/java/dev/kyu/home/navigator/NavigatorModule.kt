package dev.kyu.home.navigator

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.navigator.MainNavigator
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface NavigatorModule {

    @Binds
    @Singleton
    fun bindMainNavigator(mainNavigatorImpl: MainNavigatorImpl): MainNavigator

}