package dev.kyu.user.navigator

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kyu.navigator.UserNavigator
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface NavigatorModule {

    @Binds
    @Singleton
    fun bindUserNavigator(userNavigatorImpl: UserNavigatorImpl): UserNavigator


}