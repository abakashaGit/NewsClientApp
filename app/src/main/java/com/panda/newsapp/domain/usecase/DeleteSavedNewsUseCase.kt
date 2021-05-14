package com.panda.newsapp.domain.usecase

import com.panda.newsapp.data.model.Article
import com.panda.newsapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}