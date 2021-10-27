package com.androiddevs.mvvmnewsapp.all

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)