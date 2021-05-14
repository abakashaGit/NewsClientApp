package com.panda.newsapp.domain.usecase

import com.panda.newsapp.data.model.APIResponse
import com.panda.newsapp.data.util.Resource
import com.panda.newsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}