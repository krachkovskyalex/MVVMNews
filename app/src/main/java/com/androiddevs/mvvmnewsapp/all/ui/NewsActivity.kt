package com.androiddevs.mvvmnewsapp.all.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.all.db.ArticleDataBase
import com.androiddevs.mvvmnewsapp.all.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel
    private val message = "NewsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDataBase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application, newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
        Log.d("ALITag", message + ": onCreate " + hashCode())
    }

    override fun onStart() {
        super.onStart()
        Log.d("ALITag", message + ": onStart " + hashCode())
    }

    override fun onResume() {
        super.onResume()
        Log.d("ALITag", message + ": onResume " + hashCode())
    }

    override fun onPause() {
        super.onPause()
        Log.d("ALITag", message + ": onPause " + hashCode())
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ALITag", message + ": onRestart " + hashCode())
    }

    override fun onStop() {
        super.onStop()
        Log.d("ALITag", message + ": onStop " + hashCode())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ALITag", message + ": onDestroy " + hashCode())
    }
}
