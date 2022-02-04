package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.MoviesAdapter
import com.example.motionlayout.databinding.ActivityMoviesBinding
import com.example.motionlayout.models.Movie

class MoviesActivity : AppCompatActivity() {
    //binding
    private lateinit var binding : ActivityMoviesBinding
    //list
    private  val moviesList : MutableList<Movie> = mutableListOf()
    //adapter
    private lateinit var moviesAdapter : MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        //view binding
        binding = ActivityMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recycler
        addMovies()
        moviesAdapter = MoviesAdapter(moviesList)
        binding.apply {
            moviesPageRecycler.apply {
                layoutManager = LinearLayoutManager(this@MoviesActivity)
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies(){
        moviesList.add(Movie(1 , "Rick & Morty", R.drawable.pic))
        moviesList.add(Movie(2, "Vikings", R.drawable.pic3))
        moviesList.add(Movie(3, "Squid games", R.drawable.pic4))
        moviesList.add(Movie(4, "Rick & Morty", R.drawable.pic))
        moviesList.add(Movie(5, "Vikings", R.drawable.pic3))
        moviesList.add(Movie(6, "Squid games", R.drawable.pic4))
        moviesList.add(Movie(7, "Rick & Morty", R.drawable.pic))
        moviesList.add(Movie(8, "Vikings", R.drawable.pic3))
        moviesList.add(Movie(9, "Squid games", R.drawable.pic4))
        moviesList.add(Movie(10, "Rick & Morty", R.drawable.pic))
        moviesList.add(Movie(11, "Vikings", R.drawable.pic3))
        moviesList.add(Movie(12, "Squid games", R.drawable.pic4))

    }
}