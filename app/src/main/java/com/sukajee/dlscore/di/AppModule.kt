package com.sukajee.dlscore.di

import android.app.Application
import android.content.Context
import com.sukajee.dlscore.data.repository.BaseRepository
import com.sukajee.dlscore.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideContext(app: Application): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideRepository(context: Context): BaseRepository = MainRepository(context)
}
