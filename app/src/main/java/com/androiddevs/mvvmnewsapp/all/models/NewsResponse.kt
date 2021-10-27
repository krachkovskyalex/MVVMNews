package com.androiddevs.mvvmnewsapp.all.models


data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)