package com.panda.newsapp.domain.usecase

import com.panda.newsapp.data.model.APIResponse
import com.panda.newsapp.data.util.Resource
import com.panda.newsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}