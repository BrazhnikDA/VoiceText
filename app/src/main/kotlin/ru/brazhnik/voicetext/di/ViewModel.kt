/**
 * @description
 * Describe view model instance for DI
 *
 * @author
 * Brazhnik Dmitry
 *
 */

package ru.brazhnik.voicetext.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ViewModel {

    @Provides
    @Singleton
    fun provideCoroutinesDispatcher(): CoroutineDispatcher {
        return Dispatchers.Main.immediate
    }
}