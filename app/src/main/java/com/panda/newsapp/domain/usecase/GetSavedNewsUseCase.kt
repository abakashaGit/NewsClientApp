package com.panda.newsapp.domain.usecase

import com.panda.newsapp.data.model.Article
import com.panda.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}