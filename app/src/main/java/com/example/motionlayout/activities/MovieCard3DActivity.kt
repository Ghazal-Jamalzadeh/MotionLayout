package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.MoviesAdapter3
import com.example.motionlayout.databinding.ActivityMovieCard3DactivityBinding
import com.example.motionlayout.models.MoviesModel

class MovieCard3DActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityMovieCard3DactivityBinding

    //Other
    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { MoviesAdapter3(moviesList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieCard3DactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Recycler
        addMovies()
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MovieCard3DActivity, LinearLayoutManager.HORIZONTAL, false)
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "Aquaman", R.drawable.aquaman_poster))
        moviesList.add(MoviesModel(2, "Shang-Chi", R.drawable.shangchi_poster))
        moviesList.add(MoviesModel(3, "Last night in Soho", R.drawable.lastnigh_poster))
        moviesList.add(MoviesModel(4, "Venom: Let There Be Carnage", R.drawable.venum_poster))
    }
}