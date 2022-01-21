package com.androiddevs.mvvmnewsapp.all.ui.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.all.ui.NewsActivity
import com.androiddevs.mvvmnewsapp.all.ui.NewsViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
        var article = args.article
        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
            Log.d("ALITag", "ArticleFragment: webView.apply " + hashCode())
        }

        fab.setOnClickListener {
            viewModel.saveArticle(article)
            Snackbar.make(view, "Article saved successfully", Snackbar.LENGTH_SHORT).show()
            Log.d("ALITag", "ArticleFragment: setOnClickListener " + hashCode())
        }
        Log.d("ALITag", "ArticleFragment: onViewCreated " + hashCode())
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ALITag", "ArticleFragment: onAttach " + hashCode())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ALITag", "ArticleFragment: onCreate " + hashCode())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("ALITag", "ArticleFragment: onCreateView " + hashCode())
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("ALITag", "ArticleFragment: onActivityCreated " + hashCode())
    }

    override fun onStart() {
        super.onStart()
        Log.d("ALITag", "ArticleFragment: onStart " + hashCode())
    }

    override fun onResume() {
        super.onResume()
        Log.d("ALITag", "ArticleFragment: onResume " + hashCode() + "\n")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ALITag", "ArticleFragment: onPause " + hashCode())
    }

    override fun onStop() {
        super.onStop()
        Log.d("ALITag", "ArticleFragment: onStop " + hashCode())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ALITag", "ArticleFragment: onDestroyView " + hashCode())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ALITag", "ArticleFragment: onDestroy " + hashCode())
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ALITag", "ArticleFragment: onDetach " + hashCode() + "\n")
    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        Log.d("ALITag", "ArticleFragment: onAttachFragment " + hashCode())
    }
}