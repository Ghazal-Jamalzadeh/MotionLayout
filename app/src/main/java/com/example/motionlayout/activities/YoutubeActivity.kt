package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.MoviesAdapter
import com.example.motionlayout.adapters.MoviesAdapter2
import com.example.motionlayout.databinding.ActivityYoutubeBinding
import com.example.motionlayout.models.MoviesModel

class YoutubeActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityYoutubeBinding

    //Other
    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { MoviesAdapter2(moviesList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Add data
        addMovies()
        //RecyclerView
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@YoutubeActivity)
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "The Shawshank Redemption", R.drawable.top_the_shawshank_redemption))
        moviesList.add(MoviesModel(2, "The Godfather", R.drawable.top_the_godfather))
        moviesList.add(MoviesModel(3, "The Godfather: Part II", R.drawable.top_the_godfather__part_ii))
        moviesList.add(MoviesModel(4, "The Dark Knight", R.drawable.top_the_dark_knight))
        moviesList.add(MoviesModel(5, "12 Angry Men", R.drawable.top_12_angry_men))
        moviesList.add(MoviesModel(6, "Schindler’s List", R.drawable.top_schindlers_list))
        moviesList.add(MoviesModel(7, "Forrest Gump", R.drawable.top_forrest_gump))
        moviesList.add(MoviesModel(8, "The Empire Strikes Back", R.drawable.top_the_empire_strikes_back))
        moviesList.add(MoviesModel(9, "Inception", R.drawable.top_inception))
    }
}