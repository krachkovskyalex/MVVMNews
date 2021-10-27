package com.androiddevs.mvvmnewsapp.all.repository

import com.androiddevs.mvvmnewsapp.all.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.all.db.ArticleDataBase
import com.androiddevs.mvvmnewsapp.all.models.Article

class NewsRepository(
    val db: ArticleDataBase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}