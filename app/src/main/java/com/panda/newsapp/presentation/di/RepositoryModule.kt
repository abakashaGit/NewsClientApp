package com.panda.newsapp.presentation.di

import com.panda.newsapp.data.repository.NewsRepositoryImpl
import com.panda.newsapp.data.repository.dataSource.NewsLocalDataSource
import com.panda.newsapp.data.repository.dataSource.NewsRemoteDataSource
import com.panda.newsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














