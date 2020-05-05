package com.novendra.satria.film.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.novendra.satria.film.R
import com.novendra.satria.film.network.PopularMovies
import com.novendra.satria.film.network.ServiceBuilder
import com.novendra.satria.film.util.api_key
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(
            ServiceBuilder.buildService().getMovies(api_key)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({response -> onResponse(response)},{t -> onFailure(t)}))
    }
    private fun onFailure(t: Throwable){
        Toast.makeText(this,t.message, Toast.LENGTH_SHORT).show()
    }
    private fun onResponse(response: PopularMovies){
        progress_bar.visibility = View.GONE
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MoviesAdapter(response.results)
        }
    }
}
