package com.panda.newsapp.presentation.di

import com.panda.newsapp.data.db.ArticleDAO
import com.panda.newsapp.data.repository.dataSource.NewsLocalDataSource
import com.panda.newsapp.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO):NewsLocalDataSource{
      return NewsLocalDataSourceImpl(articleDAO)
    }

}













