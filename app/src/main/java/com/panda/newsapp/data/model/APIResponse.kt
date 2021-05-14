package com.panda.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class APIResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)